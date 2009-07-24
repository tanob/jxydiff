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

import fr.loria.ecoo.so6.xml.node.CDataNode;
import fr.loria.ecoo.so6.xml.node.CommentNode;
import fr.loria.ecoo.so6.xml.node.DocTypeNode;
import fr.loria.ecoo.so6.xml.node.Document;
import fr.loria.ecoo.so6.xml.node.ElementNode;
import fr.loria.ecoo.so6.xml.node.ProcessingInstructionNode;
import fr.loria.ecoo.so6.xml.node.TextNode;
import fr.loria.ecoo.so6.xml.util.SmallFileUtils;
import fr.loria.ecoo.so6.xml.xydiff.XyDiff;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileWriter;


public class InsertNodeTest extends TestCase {
    private String tempDirPath;
    private String temp1;
    private String temp2;

    public InsertNodeTest(String arg0) {
        super(arg0);
    }

    protected void setUp() throws Exception {
        File temp = SmallFileUtils.createTmpDir();
        tempDirPath = temp.getAbsolutePath();
        temp1 = tempDirPath + File.separator + "test1.xml";
        temp2 = tempDirPath + File.separator + "test2.xml";
    }

    public void testInsertNode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root/>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a/></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0");

        ElementNode toAppend = new ElementNode("a");
        i.appendChild(toAppend);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertNode2() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a test=\"val\"/></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a test=\"val\"/><a/></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:1");

        ElementNode a = new ElementNode("a");
        i.appendChild(a);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        System.out.println(s1);
        System.out.println(s2);

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testDeleteNodeInsertNode() throws Exception {
        //Test the node path
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a/></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><b/></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode d = new ElementNode("Deleted");
        d.setAttribute("pos", "0:0:0");

        ElementNode a = new ElementNode("a");
        d.appendChild(a);
        root.appendChild(d);

        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0");

        ElementNode b = new ElementNode("b");
        i.appendChild(b);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertSubtree() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root/>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a><b/><c/><d><e/></d></a></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0");

        ElementNode a = new ElementNode("a");

        // Construct subtree
        ElementNode b = new ElementNode("b");
        ElementNode c = new ElementNode("c");
        ElementNode d = new ElementNode("d");
        ElementNode e = new ElementNode("e");
        d.appendChild(e);
        a.appendChild(b);
        a.appendChild(c);
        a.appendChild(d);
        i.appendChild(a);

        //
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertProcessingInstruction() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root/>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><?test1 test2?></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0");

        ProcessingInstructionNode toAppend = new ProcessingInstructionNode("test1 test2");
        i.appendChild(toAppend);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        System.out.println(s1);
        System.out.println(s2);

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertDocumentType() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root/>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String dt = "<!DOCTYPE doc SYSTEM \"test.dtd\">";
        String c2 = "<?xml version=\"1.0\"?>" + dt + "<root/>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0");

        DocTypeNode dtn = new DocTypeNode(" doc SYSTEM \"test.dtd\"");
        i.appendChild(dtn);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        System.out.println(s1);
        System.out.println(s2);

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertCommentNode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root/>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><!-- comment --></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0");

        CommentNode c = new CommentNode(" comment ");
        i.appendChild(c);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertTextNode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root/>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root>&test;</root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0");

        TextNode text = new TextNode("&test;");
        i.appendChild(text);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertCDATANode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root/>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><![CDATA[test insert cdata section in the tree]]></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:0");

        CDataNode cdata = new CDataNode("test insert cdata section in the tree");
        i.appendChild(cdata);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testUpdateNode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root>abcdef</root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><!--abcdef--></root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode d = new ElementNode("Deleted");
        TextNode t = new TextNode("abcdef");
        d.appendChild(t);
        d.setAttribute("pos", "0:0:0");
        d.setAttribute("update", "yes");

        ElementNode i = new ElementNode("Inserted");
        CommentNode comment = new CommentNode("abcdef");
        i.appendChild(comment);
        i.setAttribute("pos", "0:0:0");
        i.setAttribute("update", "yes");
        root.appendChild(d);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = ref.toString();
        String s2 = delta.toString();

        assertTrue("XML Command", s1.equals(s2));
    }

    public void testInsertEntityNode() throws Exception {
        File test1 = new File(temp1);
        FileWriter writer1 = new FileWriter(temp1);
        String c1 = "<?xml version=\"1.0\"?>" + "<root><a/></root>";
        char[] buffer1 = c1.toCharArray();
        writer1.write(buffer1);
        writer1.close();

        File test2 = new File(temp2);
        FileWriter writer2 = new FileWriter(temp2);
        String c2 = "<?xml version=\"1.0\"?>" + "<root><a/>&e;</root>";
        char[] buffer2 = c2.toCharArray();
        writer2.write(buffer2);
        writer2.close();

        XyDiff xydiff = new XyDiff(temp1, temp2);
        Document delta = xydiff.diff().getDeltaDocument();

        Document ref = new Document();
        ElementNode root = new ElementNode("delta");
        ElementNode i = new ElementNode("Inserted");
        i.setAttribute("pos", "0:0:1");

        TextNode ent = new TextNode("&e;");
        i.appendChild(ent);
        root.appendChild(i);
        ref.appendChild(root);

        String s1 = delta.toString();
        String s2 = ref.toString();

        assertTrue("XML Commmand", s1.equals(s2));
    }

    protected void tearDown() throws Exception {
        System.out.println(tempDirPath);
    }
}
