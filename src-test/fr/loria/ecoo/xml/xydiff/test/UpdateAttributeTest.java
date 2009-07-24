/**
 * JXyDiff: An XML Diff Written in Java
 *
 * Contact: pascal.molli@loria.fr
 *
 * This software is free software; you can redistribute it and/or
 * modify it under the terms of QPL/CeCill
 *
 * See licences details in QPL.txt and CeCill.txt
 *
 * Initial developer: Raphael Tani
 * Initial Developer: Gregory Cobena
 * Initial Developer: Gerald Oster
 * Initial Developer: Pascal Molli
 * Initial Developer: Serge Abiteboul
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package fr.loria.ecoo.xml.xydiff.test;

import fr.loria.ecoo.so6.xml.node.Document;
import fr.loria.ecoo.so6.xml.node.ElementNode;
import fr.loria.ecoo.so6.xml.util.SmallFileUtils;
import fr.loria.ecoo.so6.xml.xydiff.XyDiff;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileWriter;


public class UpdateAttributeTest extends TestCase {
    private String tempDirPath;
    private String temp1;
    private String temp2;

    public UpdateAttributeTest(String arg0) {
        super(arg0);
    }

    protected void setUp() throws Exception {
        File temp = SmallFileUtils.createTmpDir();
        tempDirPath = temp.getAbsolutePath();
        temp1 = tempDirPath + File.separator + "test1.xml";
        temp2 = tempDirPath + File.separator + "test2.xml";
    }

    public void testUpdateAttribute() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><b test=\"val1\"/></a></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a><b test=\"val2\"/></a></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode ua = new ElementNode("AttributeUpdated");
        ua.setAttribute("pos", "0:0:0:0");
        ua.setAttribute("name", "test");
        ua.setAttribute("ov", "val1");
        ua.setAttribute("nv", "val2");
        root.appendChild(ua);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertNodeUpdateAttribute() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><b test=\"val1\"/></a></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a><b/><b test=\"val2\"/></a></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode da = new ElementNode("AttributeDeleted");
        da.setAttribute("pos", "0:0:0:0");
        da.setAttribute("name", "test");

        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0:1");

        ElementNode b = new ElementNode("b");
        b.setAttribute("test", "val2");
        i.appendChild(b);
        root.appendChild(i);
        ref.appendChild(root);
        root.appendChild(da);

        String s1 = delta.toString();
        String s2 = ref.toString();

        System.out.println(s1);
        System.out.println(s2);

        assertTrue("XML Command", s1.equals(s2));
    }

    protected void tearDown() throws Exception {
        System.out.println(tempDirPath);
    }
}
