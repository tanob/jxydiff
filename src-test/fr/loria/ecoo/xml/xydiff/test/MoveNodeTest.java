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
import fr.loria.ecoo.so6.xml.node.TextNode;
import fr.loria.ecoo.so6.xml.util.SmallFileUtils;
import fr.loria.ecoo.so6.xml.xydiff.XyDiff;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileWriter;


public class MoveNodeTest extends TestCase {
    // test move node and subtree
    private String tempDirPath;
    private String temp1;
    private String temp2;

    public MoveNodeTest(String arg0) {
        super(arg0);
    }

    protected void setUp() throws Exception {
        File temp = SmallFileUtils.createTmpDir();
        tempDirPath = temp.getAbsolutePath();
        temp1 = tempDirPath + File.separator + "test1.xml";
        temp2 = tempDirPath + File.separator + "test2.xml";
    }

    public void testInsertNodeAndMoveNode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><b/><c/></a></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a><c/></a><d><b/></d></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:1");

        ElementNode d = new ElementNode("d");
        i.appendChild(d);

        ElementNode b = new ElementNode("b");
        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:0:0");
        md.appendChild(b);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:1:0");
        mi.appendChild(b);

        root.appendChild(md);
        root.appendChild(i);
        root.appendChild(mi);

        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertSubtreeAndMoveNode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><b/><c/></a></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a><c/></a><d><e/><b/></d></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:1");

        ElementNode d = new ElementNode("d");
        ElementNode e = new ElementNode("e");
        d.appendChild(e);
        i.appendChild(d);

        ElementNode b = new ElementNode("b");

        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:0:0");
        md.appendChild(b);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:1:1");
        mi.appendChild(b);

        root.appendChild(md);
        root.appendChild(i);
        root.appendChild(mi);

        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertNodeAndMoveSubtree() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><b>text</b><c/></a></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a><c/></a><d><b>text</b></d></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:1");

        ElementNode d = new ElementNode("d");
        i.appendChild(d);

        ElementNode b = new ElementNode("b");
        TextNode t = new TextNode("text");
        b.appendChild(t);

        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:0:0");
        md.appendChild(b);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:1:0");
        mi.appendChild(b);

        root.appendChild(md);
        root.appendChild(i);
        root.appendChild(mi);

        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertSubtreeAndMoveSubtree() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><b>text<f/></b><c/></a></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a><c/></a><d><e/><b>text<f/></b></d></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:1");

        ElementNode d = new ElementNode("d");
        ElementNode e = new ElementNode("e");
        d.appendChild(e);
        i.appendChild(d);

        ElementNode b = new ElementNode("b");
        ElementNode f = new ElementNode("f");
        TextNode t = new TextNode("text");
        b.appendChild(t);
        b.appendChild(f);

        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:0:0");
        md.appendChild(b);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:1:1");
        mi.appendChild(b);

        root.appendChild(md);
        root.appendChild(i);
        root.appendChild(mi);

        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testWeakMoveNode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><c/></a><b/></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><b/><a><c/></a></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");

        ElementNode b = new ElementNode("b");
        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:1");
        md.appendChild(b);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:0");
        mi.appendChild(b);

        root.appendChild(md);
        root.appendChild(mi);

        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testWeakMoveNodeWithTheSameTagNameAndDifferentAttribute()
        throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><b attr=\"val\"><d/></b><b attr=\"val\"/></a></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a><b attr=\"val\"/><b attr=\"val\"><d/></b></a></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");

        ElementNode b = new ElementNode("b");
        b.setAttribute("attr", "val");

        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:0:1");
        md.appendChild(b);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:0:0");
        mi.appendChild(b);

        root.appendChild(md);
        root.appendChild(mi);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        System.out.println(s1);
        System.out.println(s2);

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testWeakMoveSubtreeWithTheSameWeight()
        throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><c/></a><b><d/></b></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><b><d/></b><a><c/></a></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");

        ElementNode a = new ElementNode("a");
        ElementNode c = new ElementNode("c");
        a.appendChild(c);

        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:0");
        md.appendChild(a);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:1");
        mi.appendChild(a);

        root.appendChild(md);
        root.appendChild(mi);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testMoveSubtreeWithDifferentWeight() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><c><d/></c></a><b><e/></b></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><b><e/></b><a><c><d/></c></a></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");

        ElementNode b = new ElementNode("b");
        ElementNode e = new ElementNode("e");
        b.appendChild(e);

        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:1");
        md.appendChild(b);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:0");
        mi.appendChild(b);

        root.appendChild(md);
        root.appendChild(mi);

        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertNodeAndMoveNodeWithTheSameTagName()
        throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a><c/><b/></a></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><b><b/></b><a><c/></a></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0");

        ElementNode b = new ElementNode("b");
        i.appendChild(b);

        ElementNode md = new ElementNode("Deleted");
        md.setAttribute("move", "yes");
        md.setAttribute("pos", "0:0:0:1");
        md.appendChild(b);

        ElementNode mi = new ElementNode("Inserted");
        mi.setAttribute("move", "yes");
        mi.setAttribute("pos", "0:0:0:0");
        mi.appendChild(b);

        root.appendChild(md);
        root.appendChild(i);
        root.appendChild(mi);

        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        System.out.println(s1);

        assertTrue("XML Commad", s1.equals(s2));
    }

    public void testDoubleWeakMove() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<a><b/><c><d/><e/><f/></c></a>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<a><b/><c><f/><e/><d/></c></a>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");

        ElementNode md1 = new ElementNode("Deleted");
        md1.setAttribute("move", "yes");
        md1.setAttribute("pos", "0:0:1:1");

        ElementNode e = new ElementNode("e");
        md1.appendChild(e);

        ElementNode md2 = new ElementNode("Deleted");
        md2.setAttribute("move", "yes");
        md2.setAttribute("pos", "0:0:1:0");

        ElementNode d = new ElementNode("d");
        md2.appendChild(d);

        ElementNode mi1 = new ElementNode("Inserted");
        mi1.setAttribute("move", "yes");
        mi1.setAttribute("pos", "0:0:1:1");
        mi1.appendChild(e);

        ElementNode mi2 = new ElementNode("Inserted");
        mi2.setAttribute("move", "yes");
        mi2.setAttribute("pos", "0:0:1:2");
        mi2.appendChild(d);

        root.appendChild(md1);
        root.appendChild(md2);
        root.appendChild(mi1);
        root.appendChild(mi2);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testMoveNodeAndUpdateAttribute() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<a><b/><c><d attr=\"val\"/></c></a>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<a><b/><c></c><e><d attr=\"val1\"/></e></a>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        String s1 = delta.toString();
        String test = "<?xml version=\"1.0\"?><delta><Deleted move=\"yes\" pos=\"0:0:1:0\"><d attr=\"val\"/></Deleted><Inserted pos=\"0:0:2\"><e/></Inserted><Inserted move=\"yes\" pos=\"0:0:2:0\"><d attr=\"val1\"/></Inserted><AttributeUpdated nv=\"val1\" name=\"attr\" ov=\"val\" pos=\"0:0:2:0\"/></delta>";

        assertTrue("XML Command", test.equals(s1));
    }

    public void testMoveNodeAndInsertAttribute() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<a><b/><c><d/></c></a>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<a><b/><c></c><e><d attr=\"val1\"/></e></a>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        String s1 = delta.toString();
        String test = "<?xml version=\"1.0\"?><delta><Deleted move=\"yes\" pos=\"0:0:1:0\"><d/></Deleted><Inserted pos=\"0:0:2\"><e/></Inserted><Inserted move=\"yes\" pos=\"0:0:2:0\"><d attr=\"val1\"/></Inserted><AttributeInserted name=\"attr\" value=\"val1\" pos=\"0:0:2:0\"/></delta>";

        assertTrue("XML Command", test.equals(s1));
    }

    public void testMoveNodeAndDeleteAttribute() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<a><b/><c><d attr=\"val\"/></c></a>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<a><b/><c></c><e><d/></e></a>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        String s1 = delta.toString();
        String test = "<?xml version=\"1.0\"?><delta><Deleted move=\"yes\" pos=\"0:0:1:0\"><d attr=\"val\"/></Deleted><Inserted pos=\"0:0:2\"><e/></Inserted><Inserted move=\"yes\" pos=\"0:0:2:0\"><d/></Inserted><AttributeDeleted name=\"attr\" pos=\"0:0:2:0\"/></delta>";

        assertTrue("XML Command", test.equals(s1));
    }

    protected void tearDown() throws Exception {
        System.out.println(tempDirPath);
    }
}
