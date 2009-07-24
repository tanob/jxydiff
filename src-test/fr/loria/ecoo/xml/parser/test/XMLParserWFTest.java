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
import fr.loria.ecoo.so6.xml.util.XmlUtil;

import junit.framework.TestCase;

import java.io.File;


public class XMLParserWFTest extends TestCase {
    private String baseDir;
    private String path;
    private boolean ok;

    protected void setUp() throws Exception {
        baseDir = "./test/wf";
        ok = false;
    }

    protected void tearDown() throws Exception {
        if (ok == false) {
            System.out.println(path);
        }
    }

    public void testFile1() throws Exception {
        path = baseDir + File.separator + "file1.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile2() throws Exception {
        path = baseDir + File.separator + "file2.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile3() throws Exception {
        path = baseDir + File.separator + "file3.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile4() throws Exception {
        path = baseDir + File.separator + "file4.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile5() throws Exception {
        path = baseDir + File.separator + "file5.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile6() throws Exception {
        path = baseDir + File.separator + "file6.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile7() throws Exception {
        path = baseDir + File.separator + "file7.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile8() throws Exception {
        path = baseDir + File.separator + "file8.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile9() throws Exception {
        path = baseDir + File.separator + "file9.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile10() throws Exception {
        path = baseDir + File.separator + "file10.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile11() throws Exception {
        path = baseDir + File.separator + "file11.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile12() throws Exception {
        path = baseDir + File.separator + "file12.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile13() throws Exception {
        path = baseDir + File.separator + "file13.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile14() throws Exception {
        path = baseDir + File.separator + "file14.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile15() throws Exception {
        path = baseDir + File.separator + "file15.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile16() throws Exception {
        path = baseDir + File.separator + "file16.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile17() throws Exception {
        path = baseDir + File.separator + "file17.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile18() throws Exception {
        path = baseDir + File.separator + "file18.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile19() throws Exception {
        path = baseDir + File.separator + "file19.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile20() throws Exception {
        path = baseDir + File.separator + "file20.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile21() throws Exception {
        path = baseDir + File.separator + "file21.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile22() throws Exception {
        path = baseDir + File.separator + "file22.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile23() throws Exception {
        path = baseDir + File.separator + "file23.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile24() throws Exception {
        path = baseDir + File.separator + "file24.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile25() throws Exception {
        path = baseDir + File.separator + "file25.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile26() throws Exception {
        path = baseDir + File.separator + "file26.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile27() throws Exception {
        path = baseDir + File.separator + "file27.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile28() throws Exception {
        path = baseDir + File.separator + "file28.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile29() throws Exception {
        path = baseDir + File.separator + "file29.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile30() throws Exception {
        path = baseDir + File.separator + "file30.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile31() throws Exception {
        path = baseDir + File.separator + "file31.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile32() throws Exception {
        path = baseDir + File.separator + "file32.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile33() throws Exception {
        path = baseDir + File.separator + "file33.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile34() throws Exception {
        path = baseDir + File.separator + "file34.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile35() throws Exception {
        path = baseDir + File.separator + "file35.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile36() throws Exception {
        path = baseDir + File.separator + "file36.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile37() throws Exception {
        path = baseDir + File.separator + "file37.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile38() throws Exception {
        path = baseDir + File.separator + "file38.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile39() throws Exception {
        path = baseDir + File.separator + "file39.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile40() throws Exception {
        path = baseDir + File.separator + "file40.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile41() throws Exception {
        path = baseDir + File.separator + "file41.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile42() throws Exception {
        path = baseDir + File.separator + "file42.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile43() throws Exception {
        path = baseDir + File.separator + "file43.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile44() throws Exception {
        path = baseDir + File.separator + "file44.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile45() throws Exception {
        path = baseDir + File.separator + "file45.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile46() throws Exception {
        path = baseDir + File.separator + "file46.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile47() throws Exception {
        path = baseDir + File.separator + "file47.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile48() throws Exception {
        path = baseDir + File.separator + "file48.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile49() throws Exception {
        path = baseDir + File.separator + "file49.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile50() throws Exception {
        path = baseDir + File.separator + "file50.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile51() throws Exception {
        path = baseDir + File.separator + "file51.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile52() throws Exception {
        path = baseDir + File.separator + "file52.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile53() throws Exception {
        path = baseDir + File.separator + "file53.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile54() throws Exception {
        path = baseDir + File.separator + "file54.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile55() throws Exception {
        path = baseDir + File.separator + "file55.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile56() throws Exception {
        path = baseDir + File.separator + "file56.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile57() throws Exception {
        path = baseDir + File.separator + "file57.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile58() throws Exception {
        path = baseDir + File.separator + "file58.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile59() throws Exception {
        path = baseDir + File.separator + "file59.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile60() throws Exception {
        path = baseDir + File.separator + "file60.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile61() throws Exception {
        path = baseDir + File.separator + "file61.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile62() throws Exception {
        path = baseDir + File.separator + "file62.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile63() throws Exception {
        path = baseDir + File.separator + "file63.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile64() throws Exception {
        path = baseDir + File.separator + "file64.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile65() throws Exception {
        path = baseDir + File.separator + "file65.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile66() throws Exception {
        path = baseDir + File.separator + "file66.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile67() throws Exception {
        path = baseDir + File.separator + "file67.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile68() throws Exception {
        path = baseDir + File.separator + "file68.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile69() throws Exception {
        path = baseDir + File.separator + "file69.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile70() throws Exception {
        path = baseDir + File.separator + "file70.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile71() throws Exception {
        path = baseDir + File.separator + "file71.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile72() throws Exception {
        path = baseDir + File.separator + "file72.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile73() throws Exception {
        path = baseDir + File.separator + "file73.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile74() throws Exception {
        path = baseDir + File.separator + "file74.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile75() throws Exception {
        path = baseDir + File.separator + "file75.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile76() throws Exception {
        path = baseDir + File.separator + "file76.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile77() throws Exception {
        path = baseDir + File.separator + "file77.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile78() throws Exception {
        path = baseDir + File.separator + "file78.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile79() throws Exception {
        path = baseDir + File.separator + "file79.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile80() throws Exception {
        path = baseDir + File.separator + "file80.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile81() throws Exception {
        path = baseDir + File.separator + "file81.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile82() throws Exception {
        path = baseDir + File.separator + "file82.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile83() throws Exception {
        path = baseDir + File.separator + "file83.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile84() throws Exception {
        path = baseDir + File.separator + "file84.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile85() throws Exception {
        path = baseDir + File.separator + "file85.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile86() throws Exception {
        path = baseDir + File.separator + "file86.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile87() throws Exception {
        path = baseDir + File.separator + "file87.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile88() throws Exception {
        path = baseDir + File.separator + "file88.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile89() throws Exception {
        path = baseDir + File.separator + "file89.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile90() throws Exception {
        path = baseDir + File.separator + "file90.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile91() throws Exception {
        path = baseDir + File.separator + "file91.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile92() throws Exception {
        path = baseDir + File.separator + "file92.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile93() throws Exception {
        path = baseDir + File.separator + "file93.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile94() throws Exception {
        path = baseDir + File.separator + "file94.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile95() throws Exception {
        path = baseDir + File.separator + "file95.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile96() throws Exception {
        path = baseDir + File.separator + "file96.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile97() throws Exception {
        path = baseDir + File.separator + "file97.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile98() throws Exception {
        path = baseDir + File.separator + "file98.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile99() throws Exception {
        path = baseDir + File.separator + "file99.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile100() throws Exception {
        path = baseDir + File.separator + "file100.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile101() throws Exception {
        path = baseDir + File.separator + "file101.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile102() throws Exception {
        path = baseDir + File.separator + "file102.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile103() throws Exception {
        path = baseDir + File.separator + "file103.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile104() throws Exception {
        path = baseDir + File.separator + "file104.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile105() throws Exception {
        path = baseDir + File.separator + "file105.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile106() throws Exception {
        path = baseDir + File.separator + "file106.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile107() throws Exception {
        path = baseDir + File.separator + "file107.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile108() throws Exception {
        path = baseDir + File.separator + "file108.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile109() throws Exception {
        path = baseDir + File.separator + "file109.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile110() throws Exception {
        path = baseDir + File.separator + "file110.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile111() throws Exception {
        path = baseDir + File.separator + "file111.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile112() throws Exception {
        path = baseDir + File.separator + "file112.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile113() throws Exception {
        path = baseDir + File.separator + "file113.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile114() throws Exception {
        path = baseDir + File.separator + "file114.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile115() throws Exception {
        path = baseDir + File.separator + "file115.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile116() throws Exception {
        path = baseDir + File.separator + "file116.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile117() throws Exception {
        path = baseDir + File.separator + "file117.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile118() throws Exception {
        path = baseDir + File.separator + "file118.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile119() throws Exception {
        path = baseDir + File.separator + "file119.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile120() throws Exception {
        path = baseDir + File.separator + "file120.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile121() throws Exception {
        path = baseDir + File.separator + "file121.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile122() throws Exception {
        path = baseDir + File.separator + "file122.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile123() throws Exception {
        path = baseDir + File.separator + "file123.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile124() throws Exception {
        path = baseDir + File.separator + "file124.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile125() throws Exception {
        path = baseDir + File.separator + "file125.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile126() throws Exception {
        path = baseDir + File.separator + "file126.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile127() throws Exception {
        path = baseDir + File.separator + "file127.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile128() throws Exception {
        path = baseDir + File.separator + "file128.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile129() throws Exception {
        path = baseDir + File.separator + "file129.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile130() throws Exception {
        path = baseDir + File.separator + "file130.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile131() throws Exception {
        path = baseDir + File.separator + "file131.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile132() throws Exception {
        path = baseDir + File.separator + "file132.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile133() throws Exception {
        path = baseDir + File.separator + "file133.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile134() throws Exception {
        path = baseDir + File.separator + "file134.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile135() throws Exception {
        path = baseDir + File.separator + "file135.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile136() throws Exception {
        path = baseDir + File.separator + "file136.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile137() throws Exception {
        path = baseDir + File.separator + "file137.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile138() throws Exception {
        path = baseDir + File.separator + "file138.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile139() throws Exception {
        path = baseDir + File.separator + "file139.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile140() throws Exception {
        path = baseDir + File.separator + "file140.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile141() throws Exception {
        path = baseDir + File.separator + "file141.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile142() throws Exception {
        path = baseDir + File.separator + "file142.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile143() throws Exception {
        path = baseDir + File.separator + "file143.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile144() throws Exception {
        path = baseDir + File.separator + "file144.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile145() throws Exception {
        path = baseDir + File.separator + "file145.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile146() throws Exception {
        path = baseDir + File.separator + "file146.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile147() throws Exception {
        path = baseDir + File.separator + "file147.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile148() throws Exception {
        path = baseDir + File.separator + "file148.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile149() throws Exception {
        path = baseDir + File.separator + "file149.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile150() throws Exception {
        path = baseDir + File.separator + "file150.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile151() throws Exception {
        path = baseDir + File.separator + "file151.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile152() throws Exception {
        path = baseDir + File.separator + "file152.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile153() throws Exception {
        path = baseDir + File.separator + "file153.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile154() throws Exception {
        path = baseDir + File.separator + "file154.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile155() throws Exception {
        path = baseDir + File.separator + "file155.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile156() throws Exception {
        path = baseDir + File.separator + "file156.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile157() throws Exception {
        path = baseDir + File.separator + "file157.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile158() throws Exception {
        path = baseDir + File.separator + "file158.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile159() throws Exception {
        path = baseDir + File.separator + "file159.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile160() throws Exception {
        path = baseDir + File.separator + "file160.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile161() throws Exception {
        path = baseDir + File.separator + "file161.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile162() throws Exception {
        path = baseDir + File.separator + "file162.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile163() throws Exception {
        path = baseDir + File.separator + "file163.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile164() throws Exception {
        path = baseDir + File.separator + "file164.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile165() throws Exception {
        path = baseDir + File.separator + "file165.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile166() throws Exception {
        path = baseDir + File.separator + "file166.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile167() throws Exception {
        path = baseDir + File.separator + "file167.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile168() throws Exception {
        path = baseDir + File.separator + "file168.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile169() throws Exception {
        path = baseDir + File.separator + "file169.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile170() throws Exception {
        path = baseDir + File.separator + "file170.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile171() throws Exception {
        path = baseDir + File.separator + "file171.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile172() throws Exception {
        path = baseDir + File.separator + "file172.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile173() throws Exception {
        path = baseDir + File.separator + "file173.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile174() throws Exception {
        path = baseDir + File.separator + "file174.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile175() throws Exception {
        path = baseDir + File.separator + "file175.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile176() throws Exception {
        path = baseDir + File.separator + "file176.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile177() throws Exception {
        path = baseDir + File.separator + "file177.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile178() throws Exception {
        path = baseDir + File.separator + "file178.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile179() throws Exception {
        path = baseDir + File.separator + "file179.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile180() throws Exception {
        path = baseDir + File.separator + "file180.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile181() throws Exception {
        path = baseDir + File.separator + "file181.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile182() throws Exception {
        path = baseDir + File.separator + "file182.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile183() throws Exception {
        path = baseDir + File.separator + "file183.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile184() throws Exception {
        path = baseDir + File.separator + "file184.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile185() throws Exception {
        path = baseDir + File.separator + "file185.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile186() throws Exception {
        path = baseDir + File.separator + "file186.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile187() throws Exception {
        path = baseDir + File.separator + "file187.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile188() throws Exception {
        path = baseDir + File.separator + "file188.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile189() throws Exception {
        path = baseDir + File.separator + "file189.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile190() throws Exception {
        path = baseDir + File.separator + "file190.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile191() throws Exception {
        path = baseDir + File.separator + "file191.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile192() throws Exception {
        path = baseDir + File.separator + "file192.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile193() throws Exception {
        path = baseDir + File.separator + "file193.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile194() throws Exception {
        path = baseDir + File.separator + "file194.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile195() throws Exception {
        path = baseDir + File.separator + "file195.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile196() throws Exception {
        path = baseDir + File.separator + "file196.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile197() throws Exception {
        path = baseDir + File.separator + "file197.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile198() throws Exception {
        path = baseDir + File.separator + "file198.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile199() throws Exception {
        path = baseDir + File.separator + "file199.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile200() throws Exception {
        path = baseDir + File.separator + "file200.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile201() throws Exception {
        path = baseDir + File.separator + "file201.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile202() throws Exception {
        path = baseDir + File.separator + "file202.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile203() throws Exception {
        path = baseDir + File.separator + "file203.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile204() throws Exception {
        path = baseDir + File.separator + "file204.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile205() throws Exception {
        path = baseDir + File.separator + "file205.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile206() throws Exception {
        path = baseDir + File.separator + "file206.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile207() throws Exception {
        path = baseDir + File.separator + "file207.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile208() throws Exception {
        path = baseDir + File.separator + "file208.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile209() throws Exception {
        path = baseDir + File.separator + "file209.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile210() throws Exception {
        path = baseDir + File.separator + "file210.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile211() throws Exception {
        path = baseDir + File.separator + "file211.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile212() throws Exception {
        path = baseDir + File.separator + "file212.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile213() throws Exception {
        path = baseDir + File.separator + "file213.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile214() throws Exception {
        path = baseDir + File.separator + "file214.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile215() throws Exception {
        path = baseDir + File.separator + "file215.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile216() throws Exception {
        path = baseDir + File.separator + "file216.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile217() throws Exception {
        path = baseDir + File.separator + "file217.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile218() throws Exception {
        path = baseDir + File.separator + "file218.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile219() throws Exception {
        path = baseDir + File.separator + "file219.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile220() throws Exception {
        path = baseDir + File.separator + "file220.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile221() throws Exception {
        path = baseDir + File.separator + "file221.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile222() throws Exception {
        path = baseDir + File.separator + "file222.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile223() throws Exception {
        path = baseDir + File.separator + "file223.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile224() throws Exception {
        path = baseDir + File.separator + "file224.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile225() throws Exception {
        path = baseDir + File.separator + "file225.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile226() throws Exception {
        path = baseDir + File.separator + "file226.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile227() throws Exception {
        path = baseDir + File.separator + "file227.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile228() throws Exception {
        path = baseDir + File.separator + "file228.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile229() throws Exception {
        path = baseDir + File.separator + "file229.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile230() throws Exception {
        path = baseDir + File.separator + "file230.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile231() throws Exception {
        path = baseDir + File.separator + "file231.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile232() throws Exception {
        path = baseDir + File.separator + "file232.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile233() throws Exception {
        path = baseDir + File.separator + "file233.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile234() throws Exception {
        path = baseDir + File.separator + "file234.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile235() throws Exception {
        path = baseDir + File.separator + "file235.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile236() throws Exception {
        path = baseDir + File.separator + "file236.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile237() throws Exception {
        path = baseDir + File.separator + "file237.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile238() throws Exception {
        path = baseDir + File.separator + "file238.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile239() throws Exception {
        path = baseDir + File.separator + "file239.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile240() throws Exception {
        path = baseDir + File.separator + "file240.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile241() throws Exception {
        path = baseDir + File.separator + "file241.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile242() throws Exception {
        path = baseDir + File.separator + "file242.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile243() throws Exception {
        path = baseDir + File.separator + "file243.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile244() throws Exception {
        path = baseDir + File.separator + "file244.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile245() throws Exception {
        path = baseDir + File.separator + "file245.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile246() throws Exception {
        path = baseDir + File.separator + "file246.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile247() throws Exception {
        path = baseDir + File.separator + "file247.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile248() throws Exception {
        path = baseDir + File.separator + "file248.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile249() throws Exception {
        path = baseDir + File.separator + "file249.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile250() throws Exception {
        path = baseDir + File.separator + "file250.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile251() throws Exception {
        path = baseDir + File.separator + "file251.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile252() throws Exception {
        path = baseDir + File.separator + "file252.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile253() throws Exception {
        path = baseDir + File.separator + "file253.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile254() throws Exception {
        path = baseDir + File.separator + "file254.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile255() throws Exception {
        path = baseDir + File.separator + "file255.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile256() throws Exception {
        path = baseDir + File.separator + "file256.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile257() throws Exception {
        path = baseDir + File.separator + "file257.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile258() throws Exception {
        path = baseDir + File.separator + "file258.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile259() throws Exception {
        path = baseDir + File.separator + "file259.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile260() throws Exception {
        path = baseDir + File.separator + "file260.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile261() throws Exception {
        path = baseDir + File.separator + "file261.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile262() throws Exception {
        path = baseDir + File.separator + "file262.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile263() throws Exception {
        path = baseDir + File.separator + "file263.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile264() throws Exception {
        path = baseDir + File.separator + "file264.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile265() throws Exception {
        path = baseDir + File.separator + "file265.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile266() throws Exception {
        path = baseDir + File.separator + "file266.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile267() throws Exception {
        path = baseDir + File.separator + "file267.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile268() throws Exception {
        path = baseDir + File.separator + "file268.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile269() throws Exception {
        path = baseDir + File.separator + "file269.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile270() throws Exception {
        path = baseDir + File.separator + "file270.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile271() throws Exception {
        path = baseDir + File.separator + "file271.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile272() throws Exception {
        path = baseDir + File.separator + "file272.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile273() throws Exception {
        path = baseDir + File.separator + "file273.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile274() throws Exception {
        path = baseDir + File.separator + "file274.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile275() throws Exception {
        path = baseDir + File.separator + "file275.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile276() throws Exception {
        path = baseDir + File.separator + "file276.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile277() throws Exception {
        path = baseDir + File.separator + "file277.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile278() throws Exception {
        path = baseDir + File.separator + "file278.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile279() throws Exception {
        path = baseDir + File.separator + "file279.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile280() throws Exception {
        path = baseDir + File.separator + "file280.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile281() throws Exception {
        path = baseDir + File.separator + "file281.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile282() throws Exception {
        path = baseDir + File.separator + "file282.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile283() throws Exception {
        path = baseDir + File.separator + "file283.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile284() throws Exception {
        path = baseDir + File.separator + "file284.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile285() throws Exception {
        path = baseDir + File.separator + "file285.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile286() throws Exception {
        path = baseDir + File.separator + "file286.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile287() throws Exception {
        path = baseDir + File.separator + "file287.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile288() throws Exception {
        path = baseDir + File.separator + "file288.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile289() throws Exception {
        path = baseDir + File.separator + "file289.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile290() throws Exception {
        path = baseDir + File.separator + "file290.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile291() throws Exception {
        path = baseDir + File.separator + "file291.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile292() throws Exception {
        path = baseDir + File.separator + "file292.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile293() throws Exception {
        path = baseDir + File.separator + "file293.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile294() throws Exception {
        path = baseDir + File.separator + "file294.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile295() throws Exception {
        path = baseDir + File.separator + "file295.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile296() throws Exception {
        path = baseDir + File.separator + "file296.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile297() throws Exception {
        path = baseDir + File.separator + "file297.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile298() throws Exception {
        path = baseDir + File.separator + "file298.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile299() throws Exception {
        path = baseDir + File.separator + "file299.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile300() throws Exception {
        path = baseDir + File.separator + "file300.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile301() throws Exception {
        path = baseDir + File.separator + "file301.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile302() throws Exception {
        path = baseDir + File.separator + "file302.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile303() throws Exception {
        path = baseDir + File.separator + "file303.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile304() throws Exception {
        path = baseDir + File.separator + "file304.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile305() throws Exception {
        path = baseDir + File.separator + "file305.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile306() throws Exception {
        path = baseDir + File.separator + "file306.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile307() throws Exception {
        path = baseDir + File.separator + "file307.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile308() throws Exception {
        path = baseDir + File.separator + "file308.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile309() throws Exception {
        path = baseDir + File.separator + "file309.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile310() throws Exception {
        path = baseDir + File.separator + "file310.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile311() throws Exception {
        path = baseDir + File.separator + "file311.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile312() throws Exception {
        path = baseDir + File.separator + "file312.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile313() throws Exception {
        path = baseDir + File.separator + "file313.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile314() throws Exception {
        path = baseDir + File.separator + "file314.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile315() throws Exception {
        path = baseDir + File.separator + "file315.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile316() throws Exception {
        path = baseDir + File.separator + "file316.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile317() throws Exception {
        path = baseDir + File.separator + "file317.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile318() throws Exception {
        path = baseDir + File.separator + "file318.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile319() throws Exception {
        path = baseDir + File.separator + "file319.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile320() throws Exception {
        path = baseDir + File.separator + "file320.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile321() throws Exception {
        path = baseDir + File.separator + "file321.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile322() throws Exception {
        path = baseDir + File.separator + "file322.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile323() throws Exception {
        path = baseDir + File.separator + "file323.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile324() throws Exception {
        path = baseDir + File.separator + "file324.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile325() throws Exception {
        path = baseDir + File.separator + "file325.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile326() throws Exception {
        path = baseDir + File.separator + "file326.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile327() throws Exception {
        path = baseDir + File.separator + "file327.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile328() throws Exception {
        path = baseDir + File.separator + "file328.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile329() throws Exception {
        path = baseDir + File.separator + "file329.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile330() throws Exception {
        path = baseDir + File.separator + "file330.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile331() throws Exception {
        path = baseDir + File.separator + "file331.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile332() throws Exception {
        path = baseDir + File.separator + "file332.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile333() throws Exception {
        path = baseDir + File.separator + "file333.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile334() throws Exception {
        path = baseDir + File.separator + "file334.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile335() throws Exception {
        path = baseDir + File.separator + "file335.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile336() throws Exception {
        path = baseDir + File.separator + "file336.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile337() throws Exception {
        path = baseDir + File.separator + "file337.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile338() throws Exception {
        path = baseDir + File.separator + "file338.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile339() throws Exception {
        path = baseDir + File.separator + "file339.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile340() throws Exception {
        path = baseDir + File.separator + "file340.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile341() throws Exception {
        path = baseDir + File.separator + "file341.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile342() throws Exception {
        path = baseDir + File.separator + "file342.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile343() throws Exception {
        path = baseDir + File.separator + "file343.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile344() throws Exception {
        path = baseDir + File.separator + "file344.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile345() throws Exception {
        path = baseDir + File.separator + "file345.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile346() throws Exception {
        path = baseDir + File.separator + "file346.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile347() throws Exception {
        path = baseDir + File.separator + "file347.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile348() throws Exception {
        path = baseDir + File.separator + "file348.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile349() throws Exception {
        path = baseDir + File.separator + "file349.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile350() throws Exception {
        path = baseDir + File.separator + "file350.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile351() throws Exception {
        path = baseDir + File.separator + "file351.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile352() throws Exception {
        path = baseDir + File.separator + "file352.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile353() throws Exception {
        path = baseDir + File.separator + "file353.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile354() throws Exception {
        path = baseDir + File.separator + "file354.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile355() throws Exception {
        path = baseDir + File.separator + "file355.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile356() throws Exception {
        path = baseDir + File.separator + "file356.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile357() throws Exception {
        path = baseDir + File.separator + "file357.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile358() throws Exception {
        path = baseDir + File.separator + "file358.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile359() throws Exception {
        path = baseDir + File.separator + "file359.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile360() throws Exception {
        path = baseDir + File.separator + "file360.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile361() throws Exception {
        path = baseDir + File.separator + "file361.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile362() throws Exception {
        path = baseDir + File.separator + "file362.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile363() throws Exception {
        path = baseDir + File.separator + "file363.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile364() throws Exception {
        path = baseDir + File.separator + "file364.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile365() throws Exception {
        path = baseDir + File.separator + "file365.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile366() throws Exception {
        path = baseDir + File.separator + "file366.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile367() throws Exception {
        path = baseDir + File.separator + "file367.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile368() throws Exception {
        path = baseDir + File.separator + "file368.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile369() throws Exception {
        path = baseDir + File.separator + "file369.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile370() throws Exception {
        path = baseDir + File.separator + "file370.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile371() throws Exception {
        path = baseDir + File.separator + "file371.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile372() throws Exception {
        path = baseDir + File.separator + "file372.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile373() throws Exception {
        path = baseDir + File.separator + "file373.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile374() throws Exception {
        path = baseDir + File.separator + "file374.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile375() throws Exception {
        path = baseDir + File.separator + "file375.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile376() throws Exception {
        path = baseDir + File.separator + "file376.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile377() throws Exception {
        path = baseDir + File.separator + "file377.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile378() throws Exception {
        path = baseDir + File.separator + "file378.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile379() throws Exception {
        path = baseDir + File.separator + "file379.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile380() throws Exception {
        path = baseDir + File.separator + "file380.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile381() throws Exception {
        path = baseDir + File.separator + "file381.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile382() throws Exception {
        path = baseDir + File.separator + "file382.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile383() throws Exception {
        path = baseDir + File.separator + "file383.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile384() throws Exception {
        path = baseDir + File.separator + "file384.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile385() throws Exception {
        path = baseDir + File.separator + "file385.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile386() throws Exception {
        path = baseDir + File.separator + "file386.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile387() throws Exception {
        path = baseDir + File.separator + "file387.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile388() throws Exception {
        path = baseDir + File.separator + "file388.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile389() throws Exception {
        path = baseDir + File.separator + "file389.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile390() throws Exception {
        path = baseDir + File.separator + "file390.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile391() throws Exception {
        path = baseDir + File.separator + "file391.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile392() throws Exception {
        path = baseDir + File.separator + "file392.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile393() throws Exception {
        path = baseDir + File.separator + "file393.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile394() throws Exception {
        path = baseDir + File.separator + "file394.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile395() throws Exception {
        path = baseDir + File.separator + "file395.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile396() throws Exception {
        path = baseDir + File.separator + "file396.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile397() throws Exception {
        path = baseDir + File.separator + "file397.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile398() throws Exception {
        path = baseDir + File.separator + "file398.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile399() throws Exception {
        path = baseDir + File.separator + "file399.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile400() throws Exception {
        path = baseDir + File.separator + "file400.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile401() throws Exception {
        path = baseDir + File.separator + "file401.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile402() throws Exception {
        path = baseDir + File.separator + "file402.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile403() throws Exception {
        path = baseDir + File.separator + "file403.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile404() throws Exception {
        path = baseDir + File.separator + "file404.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile405() throws Exception {
        path = baseDir + File.separator + "file405.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile406() throws Exception {
        path = baseDir + File.separator + "file406.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile407() throws Exception {
        path = baseDir + File.separator + "file407.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile408() throws Exception {
        path = baseDir + File.separator + "file408.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile409() throws Exception {
        path = baseDir + File.separator + "file409.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile410() throws Exception {
        path = baseDir + File.separator + "file410.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile411() throws Exception {
        path = baseDir + File.separator + "file411.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile412() throws Exception {
        path = baseDir + File.separator + "file412.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile413() throws Exception {
        path = baseDir + File.separator + "file413.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile414() throws Exception {
        path = baseDir + File.separator + "file414.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile415() throws Exception {
        path = baseDir + File.separator + "file415.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile416() throws Exception {
        path = baseDir + File.separator + "file416.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile417() throws Exception {
        path = baseDir + File.separator + "file417.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile418() throws Exception {
        path = baseDir + File.separator + "file418.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile419() throws Exception {
        path = baseDir + File.separator + "file419.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile420() throws Exception {
        path = baseDir + File.separator + "file420.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile421() throws Exception {
        path = baseDir + File.separator + "file421.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile422() throws Exception {
        path = baseDir + File.separator + "file422.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile423() throws Exception {
        path = baseDir + File.separator + "file423.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile424() throws Exception {
        path = baseDir + File.separator + "file424.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile425() throws Exception {
        path = baseDir + File.separator + "file425.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile426() throws Exception {
        path = baseDir + File.separator + "file426.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile427() throws Exception {
        path = baseDir + File.separator + "file427.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile428() throws Exception {
        path = baseDir + File.separator + "file428.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile429() throws Exception {
        path = baseDir + File.separator + "file429.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile430() throws Exception {
        path = baseDir + File.separator + "file430.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile431() throws Exception {
        path = baseDir + File.separator + "file431.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile432() throws Exception {
        path = baseDir + File.separator + "file432.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile433() throws Exception {
        path = baseDir + File.separator + "file433.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile434() throws Exception {
        path = baseDir + File.separator + "file434.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile435() throws Exception {
        path = baseDir + File.separator + "file435.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile436() throws Exception {
        path = baseDir + File.separator + "file436.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile437() throws Exception {
        path = baseDir + File.separator + "file437.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile438() throws Exception {
        path = baseDir + File.separator + "file438.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile439() throws Exception {
        path = baseDir + File.separator + "file439.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile440() throws Exception {
        path = baseDir + File.separator + "file440.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile441() throws Exception {
        path = baseDir + File.separator + "file441.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile442() throws Exception {
        path = baseDir + File.separator + "file442.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile443() throws Exception {
        path = baseDir + File.separator + "file443.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile444() throws Exception {
        path = baseDir + File.separator + "file444.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile445() throws Exception {
        path = baseDir + File.separator + "file445.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile446() throws Exception {
        path = baseDir + File.separator + "file446.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile447() throws Exception {
        path = baseDir + File.separator + "file447.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile448() throws Exception {
        path = baseDir + File.separator + "file448.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile449() throws Exception {
        path = baseDir + File.separator + "file449.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile450() throws Exception {
        path = baseDir + File.separator + "file450.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile451() throws Exception {
        path = baseDir + File.separator + "file451.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile452() throws Exception {
        path = baseDir + File.separator + "file452.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile453() throws Exception {
        path = baseDir + File.separator + "file453.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile454() throws Exception {
        path = baseDir + File.separator + "file454.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile455() throws Exception {
        path = baseDir + File.separator + "file455.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile456() throws Exception {
        path = baseDir + File.separator + "file456.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile457() throws Exception {
        path = baseDir + File.separator + "file457.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile458() throws Exception {
        path = baseDir + File.separator + "file458.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile459() throws Exception {
        path = baseDir + File.separator + "file459.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile460() throws Exception {
        path = baseDir + File.separator + "file460.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile461() throws Exception {
        path = baseDir + File.separator + "file461.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile462() throws Exception {
        path = baseDir + File.separator + "file462.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile463() throws Exception {
        path = baseDir + File.separator + "file463.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile464() throws Exception {
        path = baseDir + File.separator + "file464.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile465() throws Exception {
        path = baseDir + File.separator + "file465.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile466() throws Exception {
        path = baseDir + File.separator + "file466.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile467() throws Exception {
        path = baseDir + File.separator + "file467.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile468() throws Exception {
        path = baseDir + File.separator + "file468.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile469() throws Exception {
        path = baseDir + File.separator + "file469.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile470() throws Exception {
        path = baseDir + File.separator + "file470.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile471() throws Exception {
        path = baseDir + File.separator + "file471.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile472() throws Exception {
        path = baseDir + File.separator + "file472.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile473() throws Exception {
        path = baseDir + File.separator + "file473.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile474() throws Exception {
        path = baseDir + File.separator + "file474.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile475() throws Exception {
        path = baseDir + File.separator + "file475.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile476() throws Exception {
        path = baseDir + File.separator + "file476.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile477() throws Exception {
        path = baseDir + File.separator + "file477.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile478() throws Exception {
        path = baseDir + File.separator + "file478.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile479() throws Exception {
        path = baseDir + File.separator + "file479.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile480() throws Exception {
        path = baseDir + File.separator + "file480.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile481() throws Exception {
        path = baseDir + File.separator + "file481.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile482() throws Exception {
        path = baseDir + File.separator + "file482.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile483() throws Exception {
        path = baseDir + File.separator + "file483.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile484() throws Exception {
        path = baseDir + File.separator + "file484.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile485() throws Exception {
        path = baseDir + File.separator + "file485.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile486() throws Exception {
        path = baseDir + File.separator + "file486.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile487() throws Exception {
        path = baseDir + File.separator + "file487.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile488() throws Exception {
        path = baseDir + File.separator + "file488.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile489() throws Exception {
        path = baseDir + File.separator + "file489.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile490() throws Exception {
        path = baseDir + File.separator + "file490.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile491() throws Exception {
        path = baseDir + File.separator + "file491.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile492() throws Exception {
        path = baseDir + File.separator + "file492.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile493() throws Exception {
        path = baseDir + File.separator + "file493.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile494() throws Exception {
        path = baseDir + File.separator + "file494.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile495() throws Exception {
        path = baseDir + File.separator + "file495.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile496() throws Exception {
        path = baseDir + File.separator + "file496.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile497() throws Exception {
        path = baseDir + File.separator + "file497.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile498() throws Exception {
        path = baseDir + File.separator + "file498.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile499() throws Exception {
        path = baseDir + File.separator + "file499.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile500() throws Exception {
        path = baseDir + File.separator + "file500.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile501() throws Exception {
        path = baseDir + File.separator + "file501.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile502() throws Exception {
        path = baseDir + File.separator + "file502.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile503() throws Exception {
        path = baseDir + File.separator + "file503.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile504() throws Exception {
        path = baseDir + File.separator + "file504.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile505() throws Exception {
        path = baseDir + File.separator + "file505.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile506() throws Exception {
        path = baseDir + File.separator + "file506.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile507() throws Exception {
        path = baseDir + File.separator + "file507.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile508() throws Exception {
        path = baseDir + File.separator + "file508.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile509() throws Exception {
        path = baseDir + File.separator + "file509.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile510() throws Exception {
        path = baseDir + File.separator + "file510.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile511() throws Exception {
        path = baseDir + File.separator + "file511.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile512() throws Exception {
        path = baseDir + File.separator + "file512.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile513() throws Exception {
        path = baseDir + File.separator + "file513.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile514() throws Exception {
        path = baseDir + File.separator + "file514.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile515() throws Exception {
        path = baseDir + File.separator + "file515.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile516() throws Exception {
        path = baseDir + File.separator + "file516.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile517() throws Exception {
        path = baseDir + File.separator + "file517.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile518() throws Exception {
        path = baseDir + File.separator + "file518.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile519() throws Exception {
        path = baseDir + File.separator + "file519.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile520() throws Exception {
        path = baseDir + File.separator + "file520.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile521() throws Exception {
        path = baseDir + File.separator + "file521.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile522() throws Exception {
        path = baseDir + File.separator + "file522.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile523() throws Exception {
        path = baseDir + File.separator + "file523.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile524() throws Exception {
        path = baseDir + File.separator + "file524.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile525() throws Exception {
        path = baseDir + File.separator + "file525.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile526() throws Exception {
        path = baseDir + File.separator + "file526.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile527() throws Exception {
        path = baseDir + File.separator + "file527.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile528() throws Exception {
        path = baseDir + File.separator + "file528.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile529() throws Exception {
        path = baseDir + File.separator + "file529.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile530() throws Exception {
        path = baseDir + File.separator + "file530.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile531() throws Exception {
        path = baseDir + File.separator + "file531.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile532() throws Exception {
        path = baseDir + File.separator + "file532.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile533() throws Exception {
        path = baseDir + File.separator + "file533.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile534() throws Exception {
        path = baseDir + File.separator + "file534.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile535() throws Exception {
        path = baseDir + File.separator + "file535.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile536() throws Exception {
        path = baseDir + File.separator + "file536.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile537() throws Exception {
        path = baseDir + File.separator + "file537.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile538() throws Exception {
        path = baseDir + File.separator + "file538.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile539() throws Exception {
        path = baseDir + File.separator + "file539.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile540() throws Exception {
        path = baseDir + File.separator + "file540.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile541() throws Exception {
        path = baseDir + File.separator + "file541.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile542() throws Exception {
        path = baseDir + File.separator + "file542.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile543() throws Exception {
        path = baseDir + File.separator + "file543.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile544() throws Exception {
        path = baseDir + File.separator + "file544.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile545() throws Exception {
        path = baseDir + File.separator + "file545.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile546() throws Exception {
        path = baseDir + File.separator + "file546.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile547() throws Exception {
        path = baseDir + File.separator + "file547.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile548() throws Exception {
        path = baseDir + File.separator + "file548.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile549() throws Exception {
        path = baseDir + File.separator + "file549.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile550() throws Exception {
        path = baseDir + File.separator + "file550.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile551() throws Exception {
        path = baseDir + File.separator + "file551.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile552() throws Exception {
        path = baseDir + File.separator + "file552.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile553() throws Exception {
        path = baseDir + File.separator + "file553.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile554() throws Exception {
        path = baseDir + File.separator + "file554.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile555() throws Exception {
        path = baseDir + File.separator + "file555.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile556() throws Exception {
        path = baseDir + File.separator + "file556.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile557() throws Exception {
        path = baseDir + File.separator + "file557.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile558() throws Exception {
        path = baseDir + File.separator + "file558.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile559() throws Exception {
        path = baseDir + File.separator + "file559.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile560() throws Exception {
        path = baseDir + File.separator + "file560.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile561() throws Exception {
        path = baseDir + File.separator + "file561.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile562() throws Exception {
        path = baseDir + File.separator + "file562.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile563() throws Exception {
        path = baseDir + File.separator + "file563.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile564() throws Exception {
        path = baseDir + File.separator + "file564.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile565() throws Exception {
        path = baseDir + File.separator + "file565.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile566() throws Exception {
        path = baseDir + File.separator + "file566.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile567() throws Exception {
        path = baseDir + File.separator + "file567.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile568() throws Exception {
        path = baseDir + File.separator + "file568.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile569() throws Exception {
        path = baseDir + File.separator + "file569.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile570() throws Exception {
        path = baseDir + File.separator + "file570.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile571() throws Exception {
        path = baseDir + File.separator + "file571.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile572() throws Exception {
        path = baseDir + File.separator + "file572.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile573() throws Exception {
        path = baseDir + File.separator + "file573.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile574() throws Exception {
        path = baseDir + File.separator + "file574.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile575() throws Exception {
        path = baseDir + File.separator + "file575.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile576() throws Exception {
        path = baseDir + File.separator + "file576.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile577() throws Exception {
        path = baseDir + File.separator + "file577.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile578() throws Exception {
        path = baseDir + File.separator + "file578.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile579() throws Exception {
        path = baseDir + File.separator + "file579.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile580() throws Exception {
        path = baseDir + File.separator + "file580.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile581() throws Exception {
        path = baseDir + File.separator + "file581.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile582() throws Exception {
        path = baseDir + File.separator + "file582.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile583() throws Exception {
        path = baseDir + File.separator + "file583.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile584() throws Exception {
        path = baseDir + File.separator + "file584.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile585() throws Exception {
        path = baseDir + File.separator + "file585.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile586() throws Exception {
        path = baseDir + File.separator + "file586.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile587() throws Exception {
        path = baseDir + File.separator + "file587.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile588() throws Exception {
        path = baseDir + File.separator + "file588.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile589() throws Exception {
        path = baseDir + File.separator + "file589.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile590() throws Exception {
        path = baseDir + File.separator + "file590.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile591() throws Exception {
        path = baseDir + File.separator + "file591.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile592() throws Exception {
        path = baseDir + File.separator + "file592.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile593() throws Exception {
        path = baseDir + File.separator + "file593.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile594() throws Exception {
        path = baseDir + File.separator + "file594.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile595() throws Exception {
        path = baseDir + File.separator + "file595.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile596() throws Exception {
        path = baseDir + File.separator + "file596.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile597() throws Exception {
        path = baseDir + File.separator + "file597.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile598() throws Exception {
        path = baseDir + File.separator + "file598.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile599() throws Exception {
        path = baseDir + File.separator + "file599.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile600() throws Exception {
        path = baseDir + File.separator + "file600.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile601() throws Exception {
        path = baseDir + File.separator + "file601.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile602() throws Exception {
        path = baseDir + File.separator + "file602.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile603() throws Exception {
        path = baseDir + File.separator + "file603.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile604() throws Exception {
        path = baseDir + File.separator + "file604.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile605() throws Exception {
        path = baseDir + File.separator + "file605.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile606() throws Exception {
        path = baseDir + File.separator + "file606.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile607() throws Exception {
        path = baseDir + File.separator + "file607.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile608() throws Exception {
        path = baseDir + File.separator + "file608.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile609() throws Exception {
        path = baseDir + File.separator + "file609.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile610() throws Exception {
        path = baseDir + File.separator + "file610.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile611() throws Exception {
        path = baseDir + File.separator + "file611.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile612() throws Exception {
        path = baseDir + File.separator + "file612.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile613() throws Exception {
        path = baseDir + File.separator + "file613.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile614() throws Exception {
        path = baseDir + File.separator + "file614.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile615() throws Exception {
        path = baseDir + File.separator + "file615.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile616() throws Exception {
        path = baseDir + File.separator + "file616.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile617() throws Exception {
        path = baseDir + File.separator + "file617.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile618() throws Exception {
        path = baseDir + File.separator + "file618.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile619() throws Exception {
        path = baseDir + File.separator + "file619.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile620() throws Exception {
        path = baseDir + File.separator + "file620.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile621() throws Exception {
        path = baseDir + File.separator + "file621.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile622() throws Exception {
        path = baseDir + File.separator + "file622.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile623() throws Exception {
        path = baseDir + File.separator + "file623.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile624() throws Exception {
        path = baseDir + File.separator + "file624.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile625() throws Exception {
        path = baseDir + File.separator + "file625.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile626() throws Exception {
        path = baseDir + File.separator + "file626.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile627() throws Exception {
        path = baseDir + File.separator + "file627.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile628() throws Exception {
        path = baseDir + File.separator + "file628.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile629() throws Exception {
        path = baseDir + File.separator + "file629.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile630() throws Exception {
        path = baseDir + File.separator + "file630.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile631() throws Exception {
        path = baseDir + File.separator + "file631.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile632() throws Exception {
        path = baseDir + File.separator + "file632.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile633() throws Exception {
        path = baseDir + File.separator + "file633.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile634() throws Exception {
        path = baseDir + File.separator + "file634.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile635() throws Exception {
        path = baseDir + File.separator + "file635.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile636() throws Exception {
        path = baseDir + File.separator + "file636.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile637() throws Exception {
        path = baseDir + File.separator + "file637.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile638() throws Exception {
        path = baseDir + File.separator + "file638.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile639() throws Exception {
        path = baseDir + File.separator + "file639.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile640() throws Exception {
        path = baseDir + File.separator + "file640.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile641() throws Exception {
        path = baseDir + File.separator + "file641.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile642() throws Exception {
        path = baseDir + File.separator + "file642.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile643() throws Exception {
        path = baseDir + File.separator + "file643.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile644() throws Exception {
        path = baseDir + File.separator + "file644.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile645() throws Exception {
        path = baseDir + File.separator + "file645.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile646() throws Exception {
        path = baseDir + File.separator + "file646.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile647() throws Exception {
        path = baseDir + File.separator + "file647.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile648() throws Exception {
        path = baseDir + File.separator + "file648.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile649() throws Exception {
        path = baseDir + File.separator + "file649.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile650() throws Exception {
        path = baseDir + File.separator + "file650.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile651() throws Exception {
        path = baseDir + File.separator + "file651.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile652() throws Exception {
        path = baseDir + File.separator + "file652.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile653() throws Exception {
        path = baseDir + File.separator + "file653.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile654() throws Exception {
        path = baseDir + File.separator + "file654.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile655() throws Exception {
        path = baseDir + File.separator + "file655.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile656() throws Exception {
        path = baseDir + File.separator + "file656.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile657() throws Exception {
        path = baseDir + File.separator + "file657.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile658() throws Exception {
        path = baseDir + File.separator + "file658.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile659() throws Exception {
        path = baseDir + File.separator + "file659.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile660() throws Exception {
        path = baseDir + File.separator + "file660.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile661() throws Exception {
        path = baseDir + File.separator + "file661.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile662() throws Exception {
        path = baseDir + File.separator + "file662.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile663() throws Exception {
        path = baseDir + File.separator + "file663.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile664() throws Exception {
        path = baseDir + File.separator + "file664.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile665() throws Exception {
        path = baseDir + File.separator + "file665.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile666() throws Exception {
        path = baseDir + File.separator + "file666.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile667() throws Exception {
        path = baseDir + File.separator + "file667.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile668() throws Exception {
        path = baseDir + File.separator + "file668.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile669() throws Exception {
        path = baseDir + File.separator + "file669.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile670() throws Exception {
        path = baseDir + File.separator + "file670.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile671() throws Exception {
        path = baseDir + File.separator + "file671.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile672() throws Exception {
        path = baseDir + File.separator + "file672.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile673() throws Exception {
        path = baseDir + File.separator + "file673.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile674() throws Exception {
        path = baseDir + File.separator + "file674.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile675() throws Exception {
        path = baseDir + File.separator + "file675.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile676() throws Exception {
        path = baseDir + File.separator + "file676.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile677() throws Exception {
        path = baseDir + File.separator + "file677.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile678() throws Exception {
        path = baseDir + File.separator + "file678.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile679() throws Exception {
        path = baseDir + File.separator + "file679.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile680() throws Exception {
        path = baseDir + File.separator + "file680.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile681() throws Exception {
        path = baseDir + File.separator + "file681.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile682() throws Exception {
        path = baseDir + File.separator + "file682.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile683() throws Exception {
        path = baseDir + File.separator + "file683.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile684() throws Exception {
        path = baseDir + File.separator + "file684.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile685() throws Exception {
        path = baseDir + File.separator + "file685.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile686() throws Exception {
        path = baseDir + File.separator + "file686.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile687() throws Exception {
        path = baseDir + File.separator + "file687.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile688() throws Exception {
        path = baseDir + File.separator + "file688.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile689() throws Exception {
        path = baseDir + File.separator + "file689.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile690() throws Exception {
        path = baseDir + File.separator + "file690.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile691() throws Exception {
        path = baseDir + File.separator + "file691.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile692() throws Exception {
        path = baseDir + File.separator + "file692.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile693() throws Exception {
        path = baseDir + File.separator + "file693.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile694() throws Exception {
        path = baseDir + File.separator + "file694.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile695() throws Exception {
        path = baseDir + File.separator + "file695.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile696() throws Exception {
        path = baseDir + File.separator + "file696.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile697() throws Exception {
        path = baseDir + File.separator + "file697.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile698() throws Exception {
        path = baseDir + File.separator + "file698.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile699() throws Exception {
        path = baseDir + File.separator + "file699.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile700() throws Exception {
        path = baseDir + File.separator + "file700.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile701() throws Exception {
        path = baseDir + File.separator + "file701.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile702() throws Exception {
        path = baseDir + File.separator + "file702.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile703() throws Exception {
        path = baseDir + File.separator + "file703.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile704() throws Exception {
        path = baseDir + File.separator + "file704.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile705() throws Exception {
        path = baseDir + File.separator + "file705.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile706() throws Exception {
        path = baseDir + File.separator + "file706.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile707() throws Exception {
        path = baseDir + File.separator + "file707.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile708() throws Exception {
        path = baseDir + File.separator + "file708.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile709() throws Exception {
        path = baseDir + File.separator + "file709.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile710() throws Exception {
        path = baseDir + File.separator + "file710.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile711() throws Exception {
        path = baseDir + File.separator + "file711.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile712() throws Exception {
        path = baseDir + File.separator + "file712.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile713() throws Exception {
        path = baseDir + File.separator + "file713.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile714() throws Exception {
        path = baseDir + File.separator + "file714.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile715() throws Exception {
        path = baseDir + File.separator + "file715.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile716() throws Exception {
        path = baseDir + File.separator + "file716.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile717() throws Exception {
        path = baseDir + File.separator + "file717.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile718() throws Exception {
        path = baseDir + File.separator + "file718.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile719() throws Exception {
        path = baseDir + File.separator + "file719.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile720() throws Exception {
        path = baseDir + File.separator + "file720.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile721() throws Exception {
        path = baseDir + File.separator + "file721.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile722() throws Exception {
        path = baseDir + File.separator + "file722.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile723() throws Exception {
        path = baseDir + File.separator + "file723.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile724() throws Exception {
        path = baseDir + File.separator + "file724.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile725() throws Exception {
        path = baseDir + File.separator + "file725.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile726() throws Exception {
        path = baseDir + File.separator + "file726.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile727() throws Exception {
        path = baseDir + File.separator + "file727.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile728() throws Exception {
        path = baseDir + File.separator + "file728.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile729() throws Exception {
        path = baseDir + File.separator + "file729.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile730() throws Exception {
        path = baseDir + File.separator + "file730.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile731() throws Exception {
        path = baseDir + File.separator + "file731.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile732() throws Exception {
        path = baseDir + File.separator + "file732.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile733() throws Exception {
        path = baseDir + File.separator + "file733.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile734() throws Exception {
        path = baseDir + File.separator + "file734.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile735() throws Exception {
        path = baseDir + File.separator + "file735.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile736() throws Exception {
        path = baseDir + File.separator + "file736.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile737() throws Exception {
        path = baseDir + File.separator + "file737.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile738() throws Exception {
        path = baseDir + File.separator + "file738.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile739() throws Exception {
        path = baseDir + File.separator + "file739.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile740() throws Exception {
        path = baseDir + File.separator + "file740.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile741() throws Exception {
        path = baseDir + File.separator + "file741.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile742() throws Exception {
        path = baseDir + File.separator + "file742.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile743() throws Exception {
        path = baseDir + File.separator + "file743.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile744() throws Exception {
        path = baseDir + File.separator + "file744.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile745() throws Exception {
        path = baseDir + File.separator + "file745.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile746() throws Exception {
        path = baseDir + File.separator + "file746.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile747() throws Exception {
        path = baseDir + File.separator + "file747.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile748() throws Exception {
        path = baseDir + File.separator + "file748.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile749() throws Exception {
        path = baseDir + File.separator + "file749.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile750() throws Exception {
        path = baseDir + File.separator + "file750.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile751() throws Exception {
        path = baseDir + File.separator + "file751.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile752() throws Exception {
        path = baseDir + File.separator + "file752.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile753() throws Exception {
        path = baseDir + File.separator + "file753.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile754() throws Exception {
        path = baseDir + File.separator + "file754.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile755() throws Exception {
        path = baseDir + File.separator + "file755.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile756() throws Exception {
        path = baseDir + File.separator + "file756.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile757() throws Exception {
        path = baseDir + File.separator + "file757.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile758() throws Exception {
        path = baseDir + File.separator + "file758.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile759() throws Exception {
        path = baseDir + File.separator + "file759.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile760() throws Exception {
        path = baseDir + File.separator + "file760.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile761() throws Exception {
        path = baseDir + File.separator + "file761.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile762() throws Exception {
        path = baseDir + File.separator + "file762.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile763() throws Exception {
        path = baseDir + File.separator + "file763.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile764() throws Exception {
        path = baseDir + File.separator + "file764.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile765() throws Exception {
        path = baseDir + File.separator + "file765.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile766() throws Exception {
        path = baseDir + File.separator + "file766.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile767() throws Exception {
        path = baseDir + File.separator + "file767.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile768() throws Exception {
        path = baseDir + File.separator + "file768.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile769() throws Exception {
        path = baseDir + File.separator + "file769.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile770() throws Exception {
        path = baseDir + File.separator + "file770.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile771() throws Exception {
        path = baseDir + File.separator + "file771.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile772() throws Exception {
        path = baseDir + File.separator + "file772.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile773() throws Exception {
        path = baseDir + File.separator + "file773.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile774() throws Exception {
        path = baseDir + File.separator + "file774.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile775() throws Exception {
        path = baseDir + File.separator + "file775.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile776() throws Exception {
        path = baseDir + File.separator + "file776.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile777() throws Exception {
        path = baseDir + File.separator + "file777.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile778() throws Exception {
        path = baseDir + File.separator + "file778.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile779() throws Exception {
        path = baseDir + File.separator + "file779.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile780() throws Exception {
        path = baseDir + File.separator + "file780.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile781() throws Exception {
        path = baseDir + File.separator + "file781.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile782() throws Exception {
        path = baseDir + File.separator + "file782.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile783() throws Exception {
        path = baseDir + File.separator + "file783.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile784() throws Exception {
        path = baseDir + File.separator + "file784.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile785() throws Exception {
        path = baseDir + File.separator + "file785.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile786() throws Exception {
        path = baseDir + File.separator + "file786.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile787() throws Exception {
        path = baseDir + File.separator + "file787.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile788() throws Exception {
        path = baseDir + File.separator + "file788.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile789() throws Exception {
        path = baseDir + File.separator + "file789.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile790() throws Exception {
        path = baseDir + File.separator + "file790.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile791() throws Exception {
        path = baseDir + File.separator + "file791.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile792() throws Exception {
        path = baseDir + File.separator + "file792.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile793() throws Exception {
        path = baseDir + File.separator + "file793.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile794() throws Exception {
        path = baseDir + File.separator + "file794.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile795() throws Exception {
        path = baseDir + File.separator + "file795.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile796() throws Exception {
        path = baseDir + File.separator + "file796.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile797() throws Exception {
        path = baseDir + File.separator + "file797.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile798() throws Exception {
        path = baseDir + File.separator + "file798.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile799() throws Exception {
        path = baseDir + File.separator + "file799.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile800() throws Exception {
        path = baseDir + File.separator + "file800.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile801() throws Exception {
        path = baseDir + File.separator + "file801.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile802() throws Exception {
        path = baseDir + File.separator + "file802.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile803() throws Exception {
        path = baseDir + File.separator + "file803.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile804() throws Exception {
        path = baseDir + File.separator + "file804.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile805() throws Exception {
        path = baseDir + File.separator + "file805.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile806() throws Exception {
        path = baseDir + File.separator + "file806.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile807() throws Exception {
        path = baseDir + File.separator + "file807.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile808() throws Exception {
        path = baseDir + File.separator + "file808.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile809() throws Exception {
        path = baseDir + File.separator + "file809.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile810() throws Exception {
        path = baseDir + File.separator + "file810.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile811() throws Exception {
        path = baseDir + File.separator + "file811.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile812() throws Exception {
        path = baseDir + File.separator + "file812.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile813() throws Exception {
        path = baseDir + File.separator + "file813.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile814() throws Exception {
        path = baseDir + File.separator + "file814.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile815() throws Exception {
        path = baseDir + File.separator + "file815.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile816() throws Exception {
        path = baseDir + File.separator + "file816.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile817() throws Exception {
        path = baseDir + File.separator + "file817.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile818() throws Exception {
        path = baseDir + File.separator + "file818.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile819() throws Exception {
        path = baseDir + File.separator + "file819.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile820() throws Exception {
        path = baseDir + File.separator + "file820.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile821() throws Exception {
        path = baseDir + File.separator + "file821.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile822() throws Exception {
        path = baseDir + File.separator + "file822.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile823() throws Exception {
        path = baseDir + File.separator + "file823.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile824() throws Exception {
        path = baseDir + File.separator + "file824.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile825() throws Exception {
        path = baseDir + File.separator + "file825.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile826() throws Exception {
        path = baseDir + File.separator + "file826.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile827() throws Exception {
        path = baseDir + File.separator + "file827.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile828() throws Exception {
        path = baseDir + File.separator + "file828.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile829() throws Exception {
        path = baseDir + File.separator + "file829.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile830() throws Exception {
        path = baseDir + File.separator + "file830.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile831() throws Exception {
        path = baseDir + File.separator + "file831.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile832() throws Exception {
        path = baseDir + File.separator + "file832.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile833() throws Exception {
        path = baseDir + File.separator + "file833.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile834() throws Exception {
        path = baseDir + File.separator + "file834.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile835() throws Exception {
        path = baseDir + File.separator + "file835.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile836() throws Exception {
        path = baseDir + File.separator + "file836.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile837() throws Exception {
        path = baseDir + File.separator + "file837.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile838() throws Exception {
        path = baseDir + File.separator + "file838.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile839() throws Exception {
        path = baseDir + File.separator + "file839.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile840() throws Exception {
        path = baseDir + File.separator + "file840.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile841() throws Exception {
        path = baseDir + File.separator + "file841.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile842() throws Exception {
        path = baseDir + File.separator + "file842.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile843() throws Exception {
        path = baseDir + File.separator + "file843.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile844() throws Exception {
        path = baseDir + File.separator + "file844.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile845() throws Exception {
        path = baseDir + File.separator + "file845.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile846() throws Exception {
        path = baseDir + File.separator + "file846.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile847() throws Exception {
        path = baseDir + File.separator + "file847.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile848() throws Exception {
        path = baseDir + File.separator + "file848.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile849() throws Exception {
        path = baseDir + File.separator + "file849.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile850() throws Exception {
        path = baseDir + File.separator + "file850.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile851() throws Exception {
        path = baseDir + File.separator + "file851.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile852() throws Exception {
        path = baseDir + File.separator + "file852.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile853() throws Exception {
        path = baseDir + File.separator + "file853.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile854() throws Exception {
        path = baseDir + File.separator + "file854.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile855() throws Exception {
        path = baseDir + File.separator + "file855.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile856() throws Exception {
        path = baseDir + File.separator + "file856.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile857() throws Exception {
        path = baseDir + File.separator + "file857.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile858() throws Exception {
        path = baseDir + File.separator + "file858.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile859() throws Exception {
        path = baseDir + File.separator + "file859.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile860() throws Exception {
        path = baseDir + File.separator + "file860.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile861() throws Exception {
        path = baseDir + File.separator + "file861.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile862() throws Exception {
        path = baseDir + File.separator + "file862.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile863() throws Exception {
        path = baseDir + File.separator + "file863.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile864() throws Exception {
        path = baseDir + File.separator + "file864.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile865() throws Exception {
        path = baseDir + File.separator + "file865.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile866() throws Exception {
        path = baseDir + File.separator + "file866.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile867() throws Exception {
        path = baseDir + File.separator + "file867.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile868() throws Exception {
        path = baseDir + File.separator + "file868.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile869() throws Exception {
        path = baseDir + File.separator + "file869.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile870() throws Exception {
        path = baseDir + File.separator + "file870.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile871() throws Exception {
        path = baseDir + File.separator + "file871.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile872() throws Exception {
        path = baseDir + File.separator + "file872.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile873() throws Exception {
        path = baseDir + File.separator + "file873.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile874() throws Exception {
        path = baseDir + File.separator + "file874.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile875() throws Exception {
        path = baseDir + File.separator + "file875.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile876() throws Exception {
        path = baseDir + File.separator + "file876.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile877() throws Exception {
        path = baseDir + File.separator + "file877.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile878() throws Exception {
        path = baseDir + File.separator + "file878.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile879() throws Exception {
        path = baseDir + File.separator + "file879.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile880() throws Exception {
        path = baseDir + File.separator + "file880.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile881() throws Exception {
        path = baseDir + File.separator + "file881.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile882() throws Exception {
        path = baseDir + File.separator + "file882.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile883() throws Exception {
        path = baseDir + File.separator + "file883.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile884() throws Exception {
        path = baseDir + File.separator + "file884.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile885() throws Exception {
        path = baseDir + File.separator + "file885.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile886() throws Exception {
        path = baseDir + File.separator + "file886.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile887() throws Exception {
        path = baseDir + File.separator + "file887.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile888() throws Exception {
        path = baseDir + File.separator + "file888.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile889() throws Exception {
        path = baseDir + File.separator + "file889.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile890() throws Exception {
        path = baseDir + File.separator + "file890.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile891() throws Exception {
        path = baseDir + File.separator + "file891.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile892() throws Exception {
        path = baseDir + File.separator + "file892.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile893() throws Exception {
        path = baseDir + File.separator + "file893.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile894() throws Exception {
        path = baseDir + File.separator + "file894.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile895() throws Exception {
        path = baseDir + File.separator + "file895.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile896() throws Exception {
        path = baseDir + File.separator + "file896.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile897() throws Exception {
        path = baseDir + File.separator + "file897.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile898() throws Exception {
        path = baseDir + File.separator + "file898.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile899() throws Exception {
        path = baseDir + File.separator + "file899.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile900() throws Exception {
        path = baseDir + File.separator + "file900.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile901() throws Exception {
        path = baseDir + File.separator + "file901.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile902() throws Exception {
        path = baseDir + File.separator + "file902.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile903() throws Exception {
        path = baseDir + File.separator + "file903.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile904() throws Exception {
        path = baseDir + File.separator + "file904.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile905() throws Exception {
        path = baseDir + File.separator + "file905.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile906() throws Exception {
        path = baseDir + File.separator + "file906.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile907() throws Exception {
        path = baseDir + File.separator + "file907.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile908() throws Exception {
        path = baseDir + File.separator + "file908.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile909() throws Exception {
        path = baseDir + File.separator + "file909.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile910() throws Exception {
        path = baseDir + File.separator + "file910.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile911() throws Exception {
        path = baseDir + File.separator + "file911.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile912() throws Exception {
        path = baseDir + File.separator + "file912.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile913() throws Exception {
        path = baseDir + File.separator + "file913.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile914() throws Exception {
        path = baseDir + File.separator + "file914.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile915() throws Exception {
        path = baseDir + File.separator + "file915.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile916() throws Exception {
        path = baseDir + File.separator + "file916.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile917() throws Exception {
        path = baseDir + File.separator + "file917.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile918() throws Exception {
        path = baseDir + File.separator + "file918.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile919() throws Exception {
        path = baseDir + File.separator + "file919.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile920() throws Exception {
        path = baseDir + File.separator + "file920.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile921() throws Exception {
        path = baseDir + File.separator + "file921.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile922() throws Exception {
        path = baseDir + File.separator + "file922.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile923() throws Exception {
        path = baseDir + File.separator + "file923.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile924() throws Exception {
        path = baseDir + File.separator + "file924.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile925() throws Exception {
        path = baseDir + File.separator + "file925.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }

    public void testFile926() throws Exception {
        path = baseDir + File.separator + "file926.xml";

        Document test = XmlUtil.load(path);
        ok = true;
        assertTrue(path, (test != null));
    }
}
