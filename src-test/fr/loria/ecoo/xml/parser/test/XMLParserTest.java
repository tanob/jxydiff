/**
 * 
 */
package fr.loria.ecoo.xml.parser.test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.TestCase;
import fr.loria.ecoo.so6.antlr.XMLLexer;
import fr.loria.ecoo.so6.antlr.XMLParser;
import fr.loria.ecoo.so6.xml.node.Document;
import fr.loria.ecoo.so6.xml.node.TextNode;
import fr.loria.ecoo.so6.xml.node.TreeNode;
import fr.loria.ecoo.so6.xml.xydiff.DeltaConstructor;
import fr.loria.ecoo.so6.xml.xydiff.InsertNode;
import fr.loria.ecoo.so6.xml.xydiff.XMLCommand;
import fr.loria.ecoo.so6.xml.xydiff.XyDiff;

/**
 * @author Adriano Bonat
 *
 */
public class XMLParserTest extends TestCase {
	public void _testThereIsNoSiblingTextNodes() throws Exception {
		XMLLexer lexer = new XMLLexer(new StringReader("<p>I've got you.</p>"));
		XMLParser parser = new XMLParser(lexer);
		Document document = parser.document();
		
		assertEquals(1, document.getChildren().size());
		assertEquals(1, document.getChild(0).getChildren().size());
		assertTrue(document.getChild(0).getChild(0) instanceof TextNode);
		assertEquals("I've got you.", ((TextNode)document.getChild(0).getChild(0)).getContent());
	}
	
	public void testThereIsNoProblemWithQuote() throws Exception {
		XMLLexer lexer1 = new XMLLexer(new StringReader(""));
		XMLParser parser1 = new XMLParser(lexer1);
		Document document1 = parser1.document();

		XMLLexer lexer2 = new XMLLexer(new StringReader("<p>i've\"got you</p>"));
		XMLParser parser2 = new XMLParser(lexer2);
		Document document2 = parser2.document();
		
		XyDiff diff = new XyDiff(document1, document2);
		DeltaConstructor delta = diff.diff();
		
		Collection xmlCommands = delta.getXMLCommand();
		List<XMLCommand> lCommands = new ArrayList<XMLCommand>(xmlCommands);
		
		assertEquals(1, lCommands.size());
		assertTrue(lCommands.get(0) instanceof InsertNode);
		
		InsertNode insertNode = (InsertNode) lCommands.get(0);
		TreeNode insertedNode = insertNode.getNode();
		
		assertTrue(insertedNode.getChild(0) instanceof TextNode);
		
		TextNode insertedText = (TextNode) insertedNode.getChild(0);
		
		assertEquals("i've\"got you", insertedText.getContent());
	}
	
	public void testSimpler() throws Exception {
		XMLLexer lexer1 = new XMLLexer(new StringReader("iv'e"));
		XMLParser parser1 = new XMLParser(lexer1);
		TreeNode node = parser1.node();
		
		assertTrue(node instanceof TextNode);
		assertEquals("iv'e", ((TextNode)node).getContent());
	}
}
