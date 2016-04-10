package net.storyteller.desktop;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Iterator;


public class XmiStorytellizer {
	

	public XmiStorytellizer(String eclipseroot,String remotehosturi,String nameofj2eeproject){
		String xmiidbase = "_9_5_1_c54030a_1196088402093_storyteller_";
		try {
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
			
			Element packageOwnedElement = this.getPackageOwnedElementOfAJ2eeStory(data.getNameofj2eeproject());
			Document document = packageOwnedElement.getDocument();
	        OutputFormat format = OutputFormat.createPrettyPrint();
			
			
			/////update classes with andromda stereotypes.
			for (Iterator iter = packageOwnedElement.elementIterator("Class"); iter.hasNext();) {
				Element classelement = (Element) iter.next();
				if(classelement.element("ModelElement.stereotype") == null){
					Element stereotypeelement = this.addStrereoTypeElement(classelement);
					stereotypeelement.getText();
					
				}
			}
			
			
			///update association ends . set them all public
			for (Iterator iter = packageOwnedElement.elementIterator("Association"); iter.hasNext();) {
				Element associationElemenet = (Element) iter.next();
				Element connectionelement = associationElemenet.element("Association.connection");
				for (Iterator iterator = connectionelement.elementIterator("AssociationEnd");iterator.hasNext();) {
					Element AssociationEndElement = (Element) iterator.next();
					if(AssociationEndElement.attribute("visibility") == null){
						AssociationEndElement.addAttribute("visibility", "public");
					}
				}
			}
			
			//update id attributes of all the classes.
			for (Iterator iter = packageOwnedElement.elementIterator("Class"); iter.hasNext();) {
				Element classelement = (Element) iter.next();
				Element Classifier_featureElement = classelement.element("Classifier.feature");
				boolean idattrexists = false;
				if(Classifier_featureElement!=null){
					for (Iterator iterator = Classifier_featureElement.elementIterator("Attribute"); iterator.hasNext();) {
						Element attributeelement = (Element) iterator.next();
						if(attributeelement.attribute("name").getValue().equals("id")){
							idattrexists =true;
							break;
						}
					}

					if(!idattrexists){
						Element idattrElement =  classelement.addElement("UML:Attribute");
						Date date = new Date(); 
						
						
						idattrElement.addAttribute("xmi.id", xmiidbase + date.getTime());
						idattrElement.addAttribute("visibility", "public");
						idattrElement.addAttribute("name", "id");
						
					}

					String zipstring = getZipString(getPackageOwnedElementOfAJ2eeStory(data.getNameofj2eeproject()).getParent().getParent());
					for (Iterator iterator = Classifier_featureElement.elementIterator("Attribute"); iterator
							.hasNext();) {
						Element attributeelement = (Element) iterator.next();
						if(attributeelement.attribute("name").getValue().equals("id")){
							if(attributeelement.element("ModelElement.stereotype")==null){
								Element UML_ModelElement_stereotypeElement
								 =  attributeelement.addElement("UML:ModelElement.stereotype");
								 Element UML_Stereotypeelement = UML_ModelElement_stereotypeElement.addElement("UML:Stereotype");
								 UML_Stereotypeelement.addAttribute("href", zipstring + "|_9_0_1fe00f9_1119337118921_176418_96");
								 Element XMI_extensionElement = UML_Stereotypeelement.addElement("XMI.extension");
								 XMI_extensionElement.addAttribute("xmi.extender", "MagicDraw UML 9.5");
								 XMI_extensionElement.addAttribute("xmi.extenderID", "MagicDraw UML 9.5");
								 Element referentPath = XMI_extensionElement.addElement("referentPath");
								 referentPath.addAttribute("xmi.value", "org.andromda.profile::persistence::Identifier");
								 
								 Element UML_StructuralFeature_type = attributeelement.addElement("UML:StructuralFeature.type");
								 Element UML_Classifier = UML_StructuralFeature_type.addElement("UML:Classifier");
								 UML_Classifier.addAttribute("href", zipstring+"|_9_0_1fe00f9_1119336925531_479934_4");
								 Element XMI_extension = attributeelement.addElement("XMI.extension");
								 XMI_extension.addAttribute("xmi.extender", "MagicDraw UML 9.5");
								 XMI_extension.addAttribute("xmi.extenderID", "MagicDraw UML 9.5");
								 Element referentPath2 = XMI_extension.addElement("referentPath");
								 referentPath2.addAttribute("xmi.value", "datatype::Integer");
							}
						}
					}
				}

				
				
			}
			
			
	   
			XMLWriter writer = new XMLWriter(new OutputStreamWriter( new FileOutputStream( getXmiFilePath(data.getNameofj2eeproject()) ) ,"UTF-8"),format);
	        writer.setEscapeText(true);
	        writer.write( document );
	        writer.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
		
	}
	public static void main(String[] args) {
		if(args.length > 2){
			System.err.println("args is more than 2. so we gonna use args.s.");
			XmiStorytellizer storytellizer = new XmiStorytellizer(args[0],args[1],args[2]);
		}else{
			System.err.println("args is less than 2. we don't use args");
			XmiStorytellizer storytellizer = new XmiStorytellizer(null,null,null);
		}
	}
	public static Element getPackageOwnedElementOfAJ2eeStory(String nameofproject){
		LocalStaticData data = new LocalStaticData();
		java.io.File xmifile = new java.io.File(getXmiFilePath(nameofproject));
		
		Element packageOwnedElement = null;
		SAXReader reader = new  SAXReader();
		
		try {
			Document document = reader.read(xmifile);
			Element root = document.getRootElement();
			Element content = root.element("XMI.content");
			Element model = content.element("Model");
			Element owndedElement = model.element("Namespace.ownedElement");
			for (Iterator iter = owndedElement.elementIterator("Package"); iter.hasNext();) {
				Element packageElement = (Element) iter.next();
				
				if(packageElement.attribute("name")!=null && packageElement.attribute("name").getValue().equals("net." + nameofproject + ".model")){
					packageOwnedElement = packageElement.element("Namespace.ownedElement");
				}
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return packageOwnedElement;
		
	}
	public static Element addStrereoTypeElement(Element classelement){
		Element stereotypeelement = classelement.addElement("UML:ModelElement.stereotype");
		Element owndedElement = classelement.getParent().getParent().getParent();
		String zipstring = getZipString(owndedElement); 
		
		
		
		Element entityStereoTypeElement =  stereotypeelement.addElement("UML:Stereotype");
		entityStereoTypeElement.addAttribute("href",zipstring +"|_9_0_1fe00f9_1119337118921_354011_73");
		Element XMIextentionElement =  entityStereoTypeElement.addElement("XMI.extension");
		XMIextentionElement.addAttribute("xmi.extender", "MagicDraw UML 9.5");
		XMIextentionElement.addAttribute("xmi.extenderID", "MagicDraw UML 9.5");
		Element referentPathElement =  XMIextentionElement.addElement("referentPath");
		referentPathElement.addAttribute("xmi.value", "org.andromda.profile::persistence::Entity");
		
		Element manageableStereoTypeElement =  stereotypeelement.addElement("UML:Stereotype");
		manageableStereoTypeElement.addAttribute("href",zipstring +"|_9_0_1fe00f9_1119337118953_260052_118");
		Element manageableXMIextentionElement =  manageableStereoTypeElement.addElement("XMI.extension");
		manageableXMIextentionElement.addAttribute("xmi.extender", "MagicDraw UML 9.5");
		manageableXMIextentionElement.addAttribute("xmi.extenderID", "MagicDraw UML 9.5");
		Element manageablereferentPathElement =  manageableXMIextentionElement.addElement("referentPath");
		manageablereferentPathElement.addAttribute("xmi.value", "org.andromda.profile::persistence::manageable::Manageable");
		
		
		
		return stereotypeelement;
	}
	public static String getXmiFilePath(String nameofproject){
		LocalStaticData data = new LocalStaticData();
		File file = new File(data.getEclipseroot() + "/" + nameofproject + "/" +
		"mda/" +  nameofproject + "/mda/src/main/uml/" + nameofproject + ".xmi");
		if(file.exists()){
			return  file.getAbsolutePath();
		}else{
			file = new File(data.getEclipseroot() + "/" + nameofproject + "/mda/mda/src/main/uml/" + nameofproject + ".xmi");
			return  file.getAbsolutePath();
		}
	}
	public static String getZipString(Element owndedelement ){
		String zipstring = "";
		for (Iterator iter = owndedelement.elementIterator("Package"); iter.hasNext();) {
			Element packageElement = (Element) iter.next();
			if(packageElement.attribute("href")!=null && packageElement.attribute("href").getValue().startsWith("andromda-profile")){
				if(packageElement.attribute("href").getValue().contains("SNAPSHOT")){
					zipstring = "andromda-profile-persistence-3.2-SNAPSHOT.xml.zip";
				}else{
					zipstring = "andromda-profile-persistence-3.2.xml.zip";
				}
			}
		}
		return zipstring;
	}
	public static void setRelationEndsPublic(){
		
		
		
		
	}
}
