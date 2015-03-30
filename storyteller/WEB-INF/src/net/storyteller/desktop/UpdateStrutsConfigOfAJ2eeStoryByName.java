package net.storyteller.desktop;

import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class UpdateStrutsConfigOfAJ2eeStoryByName {
	public UpdateStrutsConfigOfAJ2eeStoryByName(String remotehosturi,String nameofj2eeproject,String eclipseroot,String name){

		LocalStaticData data = new LocalStaticData();
		if(remotehosturi !=null){
			data.setRemotehosturi(remotehosturi);
		}
		if(nameofj2eeproject!=null){
			data.setNameofj2eeproject(nameofj2eeproject);
		}
		if(eclipseroot!=null){
			data.setEclipseroot(eclipseroot);
		}
		
		try {
			
			Hashtable originalhashtable =  new Hashtable();
			SAXReader reader = new SAXReader();
	        Document document = reader.read(new File(data.getEclipseroot()+"/"+data.getNameofj2eeproject()+"/WEB-INF/struts-config.xml"));
	        Element root = document.getRootElement();
	        for ( Iterator i = root.elementIterator("action-mappings"); i.hasNext(); ) {
	            Element element = (Element) i.next();
	            for (Iterator iter = element.elementIterator("action"); iter.hasNext();) {
		            Element actionelement = (Element) iter.next();
		            System.err.println("starts-----------------------------------------");
		            System.err.println(actionelement.getName());
		            originalhashtable.put(actionelement.attributeValue("path"),actionelement);
		            System.err.println(actionelement.attributeValue("path"));
		            System.err.println(actionelement.attributeValue("type"));
		            System.err.println("ends-----------------------------------------");
				}
	        }

	        Hashtable downloadedhashtable = new Hashtable();
	        reader = new SAXReader();
	        document = reader.read(new URL(data.getRemotehosturi()+"/StrutsConfigOfSentencesOfNonAllVerbsOfAJ2eeStory.do?name="+data.getNameofj2eeproject()));
	        root = document.getRootElement();
	        for ( Iterator i = root.elementIterator("action-mappings"); i.hasNext(); ) {
	            Element element = (Element) i.next();
	            for (Iterator iter = element.elementIterator("action"); iter.hasNext();) {
		            Element actionelement = (Element) iter.next();
		            System.err.println("starts-----------------------------------------");
		            System.err.println(actionelement.getName());
		            downloadedhashtable.put(actionelement.attributeValue("path"),actionelement);
		            System.err.println(actionelement.attributeValue("path"));
		            System.err.println(actionelement.attributeValue("type"));
		            System.err.println("ends-----------------------------------------");
				}
	        }
	        
	        
	        reader = new SAXReader();
	        document = reader.read(new File(data.getEclipseroot()+"/"+data.getNameofj2eeproject()+"/WEB-INF/struts-config.xml"));
	        root = document.getRootElement();
	        Element actionmappings = root.element("action-mappings");
	        
	        for (Enumeration enumeration = downloadedhashtable.keys(); enumeration.hasMoreElements();) {
				String incomingpath = (String) enumeration.nextElement();
				if(originalhashtable.get(incomingpath) ==null){
					Element addedactionelement = actionmappings.addElement("action");
					addedactionelement.addAttribute("path",incomingpath);
					addedactionelement.addAttribute("type",((Element)downloadedhashtable.get(incomingpath)).attributeValue("type"));
					if(!incomingpath.contains("VP")){
						Element forwardelement = addedactionelement.addElement("forward");
						forwardelement.addAttribute("name","success");
						forwardelement.addAttribute("path","/pages/app"+incomingpath+".jsp");
					}else if(incomingpath.contains("VP")){
						if(incomingpath.startsWith("/Post")){
					        SAXReader nounsreader = new SAXReader();
					        System.err.println(data.getRemotehosturi()+"/DisplayXmlOfNoun.do?j2eeStory="+data.getNameofj2eeproject() + "--------------------------------------------------------");
					        Document nounsdocument = nounsreader.read(new URL(data.getRemotehosturi()+"/DisplayXmlOfNoun.do?j2eeStory="+data.getNameofj2eeproject()));
					        Element nounsroot = nounsdocument.getRootElement();
					        for (Iterator iter = nounsroot.elementIterator("noun"); iter
									.hasNext();) {
								Element nounelement = (Element) iter.next();
								if(incomingpath.contains(nounelement.element("name").getText())){
									addedactionelement.addAttribute("name", nounelement.element("name").getText()+"Form");
									break;
								}
							}
						}
					}
				}
			}
	        OutputFormat format = OutputFormat.createPrettyPrint();
	        XMLWriter writer = new XMLWriter(new FileWriter( data.getEclipseroot()+"/"+data.getNameofj2eeproject()+"/WEB-INF/struts-config.xml" ),format);
	        

	        

	        writer.write( document );
	        writer.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		if(args.length > 2){
			System.err.println("args is more than 2. so we gonna use args.s.");
			UpdateStrutsConfigOfAJ2eeStoryByName updateStrutsConfigOfAJ2eeStoryByName = new UpdateStrutsConfigOfAJ2eeStoryByName(args[0],args[1],args[2],args[3]);
		}else{
			System.err.println("args is less than 2. we don't use args");
			UpdateStrutsConfigOfAJ2eeStoryByName updateStrutsConfigOfAJ2eeStoryByName = new UpdateStrutsConfigOfAJ2eeStoryByName(null,null,null,null);
		}
	}
}
