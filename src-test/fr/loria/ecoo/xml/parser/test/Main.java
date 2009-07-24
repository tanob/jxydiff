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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;


public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Main method who writes a file with a
         * different name for each file in the archive and write the XML
         * declaration if it was not present
         */
        File file = new File(args[0]);
        ZipFile zip = new ZipFile(file);
        FileInputStream fis = new FileInputStream(file);
        ZipInputStream zis = new ZipInputStream(fis);

        int size = zip.size();
        int count = 0;
        String baseDir = file.getParent();
        String name = new String();

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
                String path = baseDir + File.separator + "file" + count + ".xml";
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

        // ------------------------------------------------------- //
        // Test phase

        /*
           int ok = 0;
           int ko = 0;
        
                           String test = new String();
                           for (int i = 1; i <= count; i++) {
        
                                   test = baseDir + File.separator + "file" + i + ".xml";
                                   try {
                                           XmlUtil.load(test);
                                           ok++;
        
                                   } catch (ParseException e) {
                                           ko++;
                                           System.err.println(test);
        
                                   } finally {
                                           System.out.println("total    " + count);
                                           System.out.println("parse ok " + ok);
                                           System.out.println("parse ko " + ko);
                                   }
                           }
         */
    }
}
