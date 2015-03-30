package Classpathentry;

import java.io.File;
import java.io.FileWriter;

import net.storyteller.model.StaticData;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;


public class Preparation {
	String remotehosturi = "localhost:8090/st";
	String eclipseroot = "c:/current/eclipse/workspace/";
	String nameofj2eeproject = "mediastudio";
	
	//precondition of this noun.
	//1.the eclipse project is made by the same name of project (convention)
	public Preparation(){
		try {
			
			ValueObjectRetrieve valueObjectRetrieve = new ValueObjectRetrieve("StaticData",new Integer(1),remotehosturi);
			StaticData staticData = (StaticData)valueObjectRetrieve.getValueObject();
			HttpPost httpPost = new HttpPost("name",nameofj2eeproject,null,remotehosturi,"J2eeProject");
			System.err.println(httpPost.isOk());
			
			File file = new File(eclipseroot  + nameofj2eeproject + "/mda");
			file.mkdir();
			
			File webxmlfile = new File(eclipseroot + nameofj2eeproject + "/WEB-INF/web.xml");
			
			FileDownload fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/base.css",remotehosturi + "/base.css");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/createscheme.bat",remotehosturi + "/mda/createscheme.bat");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/dropscheme.bat",remotehosturi + "/mda/dropscheme.bat");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/h.jsp",remotehosturi + "/h.jsp");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/index.jsp",remotehosturi + "/index.jsp");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/menu.jsp",remotehosturi + "/menu.jsp");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/mysql-connector-java-3.1.12-bin.jar",remotehosturi + "/mda/mysql-connector-java-3.1.12-bin.jar");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/systemheader.jsp",remotehosturi + "/systemheader.jsp");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/web.xml",remotehosturi + "/WEB-INF/web.xml");
			 fileDownload = new FileDownload(eclipseroot  + nameofj2eeproject+"/templates/.classpath",remotehosturi + "/.classpath");

			 
			HttpClient httpClient = new HttpClient(); 
			GetMethod getMethod = new GetMethod("http://" + remotehosturi + "/templates/copycorejar.bat");
			httpClient.executeMethod(getMethod);
			String contentofcopycorejat_bat = getMethod.getResponseBodyAsString();
			contentofcopycorejat_bat = contentofcopycorejat_bat.replaceAll("nameofj2eeproject",nameofj2eeproject);
			File copycorejat_batfile = new File(eclipseroot  + nameofj2eeproject + "/mda/copycorejar.bat");
			FileWriter writer = new FileWriter(copycorejat_batfile);
			writer.write(contentofcopycorejat_bat);
			
			httpClient = new HttpClient(); 
			getMethod = new GetMethod("http://" + remotehosturi + "/templates/createscheme.bat");
			httpClient.executeMethod(getMethod);
			String content = getMethod.getResponseBodyAsString();
			content = content.replaceAll("nameofj2eeproject",nameofj2eeproject);
			File instancefile = new File(eclipseroot  + nameofj2eeproject + "/mda/copycorejar.bat");
			writer = new FileWriter(instancefile);
			writer.write(contentofcopycorejat_bat);
//			File base_css = new File(eclipseroot  + nameofj2eeproject + "base.css");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
