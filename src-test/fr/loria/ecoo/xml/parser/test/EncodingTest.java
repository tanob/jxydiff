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
package fr.loria.ecoo.xml.parser.test;

import fr.loria.ecoo.so6.xml.node.Document;
import fr.loria.ecoo.so6.xml.util.SmallFileUtils;
import fr.loria.ecoo.so6.xml.util.XmlUtil;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class EncodingTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();

            String c = new String(buffer);
            char[] tab = c.toCharArray();

            FileWriter writer = new FileWriter(args[1]);
            writer.write(tab);
            writer.close();

            Document doc = null;

            doc = XmlUtil.load(args[0]);

            /*
             * FileInputStream fis2 = new FileInputStream(args[0]);
             * InputStreamReader inr = new InputStreamReader(fis2, "UTF-8");
             *
             * XMLLexer lexer = new XMLLexer(inr); XMLParser parser = new
             * XMLParser(lexer); try { doc = parser.document(); } catch
             * (Exception e) { throw new ParseException(e.getMessage()); }
             * finally { fis.close(); }
             */
            doc.save(args[2], false);

            SmallFileUtils.copy(args[0], args[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
