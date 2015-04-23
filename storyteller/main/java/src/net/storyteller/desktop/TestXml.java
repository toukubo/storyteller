package net.storyteller.desktop;

import java.io.File;
import java.io.StringReader;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TestXml {
	public static void main(String[] args) {
		
		System.err.println("aaaaaaaaaaaaaaaaaaaaaaaa");
		
		String samplexml = "<action path=\"/test\" type=\"net.gasweb.web.app.Test\" ><forward /></action>";
		
		try {
			
			SAXReader reader = new SAXReader();
	        Document document = reader.read(new File("WEB-INF/struts-config.xml"));
	        Element root = document.getRootElement();
	        for ( Iterator i = root.elementIterator("action-mappings"); i.hasNext(); ) {
	            Element element = (Element) i.next();
	            for (Iterator iter = element.elementIterator("action"); iter.hasNext();) {
		            Element actionelement = (Element) iter.next();
		            System.err.println("starts-----------------------------------------");
		            System.err.println(actionelement.getName());
		            System.err.println(actionelement.attributeValue("path"));
		            System.err.println(actionelement.attributeValue("type"));
		            System.err.println("ends-----------------------------------------");
				}
	        }
			reader = new SAXReader();
			
	        document = reader.read(new StringReader(samplexml));
	        root = document.getRootElement();
            System.err.println("yes starts-----------------------------------------");
            System.err.println(root.getName());
            System.err.println(root.attributeValue("path"));
            System.err.println(root.attributeValue("type"));
            System.err.println("ends-----------------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}


		
	}

}
