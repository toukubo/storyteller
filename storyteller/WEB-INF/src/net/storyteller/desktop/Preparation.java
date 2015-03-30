package net.storyteller.desktop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.digester.Digester;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.StringUtils;


public class Preparation {

	//precondition of this noun.
	//1.the eclipse project is made by the same name of project (convention)
	public Preparation(){
		LocalStaticData data = new LocalStaticData();
		
		try {
			
			HttpPost httpPost = new HttpPost("name",data.getNameofj2eeproject(),null,data.getRemotehosturi(),"J2eeStory");
			System.err.println(httpPost.isOk());
			
			new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/mda/" + data.getNameofj2eeproject()).mkdirs();
			new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/WEB-INF/src").mkdirs();
			new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/WEB-INF/mails").mkdirs();
			new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/WEB-INF/classes").mkdirs();
			new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/WEB-INF/src/net/" + data.getNameofj2eeproject() + "/model/crud").mkdirs();
			new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/WEB-INF/src/net/" + data.getNameofj2eeproject() + "/filters").mkdirs();
			
			
			this.downloadFile(data, "/base.css", "/templates/base.css", true);
			this.downloadFile(data,  "/images/bg_gradient.gif","/templates/bg_gradient.gif",true);
			this.downloadFile(data,  "/mda/"+data.getNameofj2eeproject()+"/createscheme.bat", "/templates/createscheme.bat",true);
			this.downloadFile(data,  "/mda/"+data.getNameofj2eeproject()+"/dropscheme.bat", "/templates/dropscheme.bat",true);
			this.downloadFile(data,  "/h.jsp", "/templates/h_jsp",true);
			this.downloadFile(data,  "/index.jsp", "/templates/index_jsp",true);
			this.downloadFile(data,  "/menu.jsp", "/templates/menu_jsp",true);
			this.downloadFile(data,  "/mda/"+data.getNameofj2eeproject()+"/mysql-connector-java-3.1.12-bin.jar", "/templates/mysql-connector-java-3.1.12-bin.jar",true);
			this.downloadFile(data,  "/mda/"+data.getNameofj2eeproject()+"/jp.storyteller.desktop.jar", "/templates/jp.storyteller.desktop.jar",true);
			this.downloadFile(data,  "/systemheader.jsp", "/templates/systemheader_jsp",true);
			this.downloadFile(data,  "/filelist.txt", "/templates/filelist.txt",true);

			 
			this.downloadFile(data,  "/WEB-INF/clientsidevalidation.tld", "/templates/clientsidevalidation.tld",true);
			this.downloadFile(data,  "/WEB-INF/formtag.tld", "/templates/formtag.tld",true);
			 
			 
			this.downloadFile(data,  "/WEB-INF/src/net/"+data.getNameofj2eeproject() + "/filters/SetCharacterEncodingFilter.java", "/templates/SetCharacterEncodingFilter.java",true);
			this.downloadFile(data,  "/WEB-INF/src/net/"+data.getNameofj2eeproject() + "/filters/HibernateSessionRequestFilter.java", "/templates/HibernateSessionRequestFilter.java",true);
			this.downloadFile(data,  "/WEB-INF/src/net/"+data.getNameofj2eeproject() + "/filters/StaticDataLoadingFilter.java", "/templates/StaticDataLoadingFilter.java",true);
			this.downloadFile(data,  "/WEB-INF/src/net/"+data.getNameofj2eeproject() + "/filters/PrivilegeManageFilter.java", "/templates/PrivilegeManageFilter.java",true);
			
			File privfiletrFile = new File(data.getEclipseroot() + "/" + data.getNameofj2eeproject() + "/WEB-INF/src/net/"+data.getNameofj2eeproject() + "/filters/PrivilegeManageFilter.java");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(privfiletrFile));
			String line = bufferedReader.readLine();
			StringBuilder privBuilder = new StringBuilder();
				
			while (line!=null) {
				line = line.replaceAll("nameofproject",data.getNameofj2eeproject());
				privBuilder.append(line + "\r\n");
				line = bufferedReader.readLine();
				
			}
			bufferedReader.close();
			PrintWriter  printWriter = new PrintWriter(new FileWriter(privfiletrFile));
			printWriter.write(privBuilder.toString());
			printWriter.close();
			
			
			this.downloadFile(data,  "/WEB-INF/mails/header.txt", "/templates/header.txt",true);
			this.downloadFile(data,  "/WEB-INF/mails/footer.txt", "/templates/footer.txt",true);
			
			this.downloadFile(data,  "/mda/"+data.getNameofj2eeproject() + "/wget.jar", "/templates/wget.jar",true);
			 
			this.downloadFile(data,  "/WEB-INF/src/applicationContext-mail.xml", "/templates/applicationContext-mail.xml",true);
			 
			HttpClient httpClient = new HttpClient(); 
			GetMethod getMethod = new GetMethod( data.getRemotehosturi() + "/templates/copycorejar.bat");
			httpClient.executeMethod(getMethod);
			String contentofcopycorejat_bat = getMethod.getResponseBodyAsString();
			contentofcopycorejat_bat = contentofcopycorejat_bat.replaceAll("nameofproject",data.getNameofj2eeproject());
			contentofcopycorejat_bat = contentofcopycorejat_bat.replaceAll("idofproject",data.getNameofj2eeproject());
			File copycorejat_batfile = new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/mda/"+data.getNameofj2eeproject()+"/copycorejar.bat");
			FileWriter writer = new FileWriter(copycorejat_batfile);
			writer.write(contentofcopycorejat_bat);
			writer.flush();
			writer.close();
			
			httpClient = new HttpClient(); 
			getMethod = new GetMethod( data.getRemotehosturi() + "/templates/web.xml");
			httpClient.executeMethod(getMethod);
			String contentofwebxmlfile = getMethod.getResponseBodyAsString();
			contentofwebxmlfile = contentofwebxmlfile.replaceAll("nameofproject",data.getNameofj2eeproject());
			contentofwebxmlfile = contentofwebxmlfile.replaceAll("idofproject",data.getNameofj2eeproject());
			File webxmlfile = new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/WEB-INF/web.xml");
			writer = new FileWriter(webxmlfile);
			writer.write(contentofwebxmlfile);
			writer.flush();
			writer.close();
			
			httpClient = new HttpClient(); 
			getMethod = new GetMethod( data.getRemotehosturi() + "/templates/contextfile.xml");
			httpClient.executeMethod(getMethod);
			String contentofcontextfile = getMethod.getResponseBodyAsString();
			contentofcontextfile = contentofcontextfile.replaceAll("nameofproject",data.getNameofj2eeproject());
			contentofcontextfile = contentofcontextfile.replaceAll("idofproject",data.getNameofj2eeproject());
			File contextfile = new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/META-INF/context.xml");
			contextfile.getParentFile().mkdirs();
			
			writer = new FileWriter(contextfile);
			writer.write(contentofcontextfile);
			writer.flush();
			writer.close();			
			

			 httpClient = new HttpClient(); 
			 getMethod = new GetMethod( data.getRemotehosturi() + "/templates/.classpath");
			httpClient.executeMethod(getMethod);
			String content= getMethod.getResponseBodyAsString();
			content = content.replaceAll("nameofproject",data.getNameofj2eeproject());
			content = content.replaceAll("idofproject",data.getIdofproject());
			File file = new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/.classpath");
			writer = new FileWriter(file);
			writer.write(content);
			writer.flush();
			writer.close();
			
			
			File classpathfile = new File(data.getEclipseroot()  + data.getNameofj2eeproject() + "/.classpath");
			
			//jarfiles
			SAXParserFactory factory = SAXParserFactory.newInstance();
		    SAXParser parser = factory.newSAXParser();
		    Digester digester = new Digester(parser);
		    digester.addObjectCreate("classpath", ArrayList.class);
		    digester.addObjectCreate("classpath/classpathentry", Classpathentry.class);
		    digester.addSetNext("classpath/classpathentry", "add");
		    digester.addSetProperties("classpath/classpathentry");

		    InputStream in = new FileInputStream(classpathfile);
		    List classpath = (List)digester.parse(in);
		    for (Iterator iter = classpath.iterator(); iter.hasNext();) {
				Classpathentry classpathentry = (Classpathentry) iter.next();
				if(classpathentry.getKind().equals("lib")){
					String[] str = StringUtils.split(classpathentry.getPath(),"/");
					String filename = str[str.length-1];
					new FileDownload(data.getEclipseroot() + data.getNameofj2eeproject() + "/WEB-INF/lib/" + filename,  data.getRemotehosturi() + "/templates/" + filename,true);
				}
			}
		    
		    BufferedReader reader = new BufferedReader(new  FileReader(new File(data.getEclipseroot() + data.getNameofj2eeproject() + "/filelist.txt")));
		    line = reader.readLine();
		    while(line !=null){
		    	new FileDownload(data.getEclipseroot() + data.getNameofj2eeproject() + "/WEB-INF/lib/" + line,  data.getRemotehosturi() + "/templates/" + line,true);
		    	line = reader.readLine();
		    }
		    
		    
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Preparation preparation = new Preparation();
	}
	public void downloadFile(LocalStaticData data,String path,String uri,boolean overwrite){
		FileDownload fileDownload =new FileDownload(data.getEclipseroot() + "/" + data.getNameofj2eeproject() + "/" + path,data.getRemotehosturi() + "/"+ uri,overwrite);
		
	}
}
