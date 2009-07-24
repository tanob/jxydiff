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
package fr.loria.ecoo.xml.util.test;

import fr.loria.ecoo.so6.xml.node.Document;
import fr.loria.ecoo.so6.xml.node.ElementNode;
import fr.loria.ecoo.so6.xml.util.SmallFileUtils;
import fr.loria.ecoo.so6.xml.util.XmlUtil;

import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception {
        File baseWorkingDir = SmallFileUtils.createTmpDir();
        String file1 = baseWorkingDir.getAbsolutePath() + "/1";

        //
        Document doc = new Document();
        ElementNode root = new ElementNode("root");
        doc.appendChild(root);

        ElementNode a = new ElementNode("a");
        root.appendChild(a);

        ElementNode b = new ElementNode("b");
        root.appendChild(b);

        ElementNode c = new ElementNode("c");
        root.appendChild(c);
        a.appendChild(new ElementNode("aa"));
        a.appendChild(new ElementNode("ab"));
        a.appendChild(new ElementNode("ac"));
        a.setAttribute("attr1", "value1");
        a.setAttribute("attr2", "value2");
        a.setAttribute("attr3", "value3");
        doc.save(file1, true);
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- DELETE --------");
        System.out.println("-------- delete node 0:0:2 (<c/>)");
        XmlUtil.deleteNode(file1, "0:0:2");
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- delete node 0:0:1 (<b/>)");
        XmlUtil.deleteNode(file1, "0:0:1");
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- delete node 0:0:0:2 (<ac/>)");
        XmlUtil.deleteNode(file1, "0:0:0:2");
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- delete node 0:0:0:1 (<ab/>)");
        XmlUtil.deleteNode(file1, "0:0:0:1");
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- delete node 0:0:0:0 (<aa/>)");
        XmlUtil.deleteNode(file1, "0:0:0:0");
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- delete node 0:0:0 (<a attr1-3/>)");
        XmlUtil.deleteNode(file1, "0:0:0");
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- INSERT --------");
        System.out.println("-------- insert node 0:0:0 (<a attr3/>)");

        ElementNode n = new ElementNode("a");
        n.setAttribute("attr3", "value3");
        XmlUtil.insertNode(file1, "0:0:0", n);
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- insert node 0:0:0:0 (<aa/>)");
        XmlUtil.insertNode(file1, "0:0:0:0", new ElementNode("aa"));
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- insert node 0:0:0:1 (<ab/>)");
        XmlUtil.insertNode(file1, "0:0:0:1", new ElementNode("ab"));
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- insert node 0:0:0:2 (<ac/>)");
        XmlUtil.insertNode(file1, "0:0:0:2", new ElementNode("ac"));
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- insert node 0:0:1 (<b/>)");
        XmlUtil.insertNode(file1, "0:0:1", new ElementNode("b"));
        System.out.println(XmlUtil.load(file1).toString());
        System.out.println("-------- insert node 0:0:2 (<c/>)");
        XmlUtil.insertNode(file1, "0:0:2", new ElementNode("c"));
        System.out.println(XmlUtil.load(file1).toString());
    }
}
