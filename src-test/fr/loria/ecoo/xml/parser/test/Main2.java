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

import fr.loria.ecoo.so6.xml.util.SmallFileUtils;

import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;


public class Main2 {
    /*
     * Sort the file of the XML Test Suite Try to read a file with another parser if file ok copy in the ok directory else copy in the non ok directory
     */
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        ZipFile zip = new ZipFile(file);
        FileInputStream fis = new FileInputStream(file);
        ZipInputStream zis = new ZipInputStream(fis);

        int size = zip.size();
        int count = 0;
        String baseDir = file.getParent();
        String name = new String();
        String path = new String();

        for (int i = 0; i < size; i++) {
            ZipEntry entry = zis.getNextEntry();

            if (!entry.isDirectory()) {
                // Read
                count++;
                name = entry.getName();
                System.out.println(name);

                //long s = entry.getSize();
                byte[] buffer = new byte[1024];
                int read = 0;

                // Write
                path = baseDir + File.separator + "file" + count + ".xml";

                FileOutputStream fos = new FileOutputStream(path);

                read = zis.read(buffer, 0, 5);

                if (!(new String(buffer).startsWith("<?xml"))) {
                    String decl = "<?xml version=\"1.0\"?>\n";
                    byte[] decl_buffer = decl.getBytes();
                    fos.write(decl_buffer);
                }

                fos.write(buffer, 0, read);

                while ((read = zis.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }

                zis.closeEntry();
                fos.close();
            }
        }

        zis.close();

        // Test with the DOM4J parser
        String wf = baseDir + File.separator + "wf";
        String nwf = baseDir + File.separator + "nwf";

        SmallFileUtils.createDir(wf);
        SmallFileUtils.createDir(nwf);

        SAXReader xmlReader = new SAXReader();

        /*
         * xmlReader.setFeature("http://xml.org/sax/features/external-general-entities", false);
         * xmlReader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
         * xmlReader.setFeature("http://xml.org/sax/features/is-standalone", false);
         * xmlReader.setFeature("http://xml.org/sax/features/lexical-handler/parameter-entities", false);
         * xmlReader.setFeature("http://xml.org/sax/features/namespaces", false); xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
         * xmlReader.setFeature("http://xml.org/sax/features/resolve-dtd-uris", false); xmlReader.setFeature("http://xml.org/sax/features/string-interning",
         * false); xmlReader.setFeature("http://xml.org/sax/features/use-attributes2", false); xmlReader.setFeature("http://xml.org/sax/features/use-locator2",
         * false); xmlReader.setFeature("http://xml.org/sax/features/use-entity-resolver2", false);
         * xmlReader.setFeature("http://xml.org/sax/features/validation", false); xmlReader.setFeature("http://xml.org/sax/features/xmlns-uris", false);
         *
         * xmlReader.setProperty("http://xml.org/sax/properties/declaration-handler", new Boolean(false));
         * xmlReader.setProperty("http://xml.org/sax/properties/dom-node", new Boolean(false));
         * xmlReader.setProperty("http://xml.org/sax/properties/lexical-handler", new Boolean(false));
         * xmlReader.setProperty("http://xml.org/sax/properties/xml-string", new Boolean(false));
         */
        int countok = 1;
        int countko = 1;

        for (int i = 1; i <= count; i++) {
            path = baseDir + File.separator + "file" + i + ".xml";

            File aFile = new File(path);

            try {
                xmlReader.read(aFile);
                SmallFileUtils.copy(path, wf + File.separator + "file" + countok + ".xml");
                countok++;
            } catch (Exception e) {
                System.err.println("ERROR");
                SmallFileUtils.copy(path, nwf + File.separator + "file" + countko + ".xml");
                countko++;
            }
        }

        System.out.println("Terminated");
    }
}
