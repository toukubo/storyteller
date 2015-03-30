package net.storyteller.desktop;

import java.io.File;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.MultipartPostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.params.HttpParams;

import com.mysql.jdbc.Field;


public class HttpClientFilePostOfAndromdaCoreJarAddingToJ2eeStory {
	public HttpClientFilePostOfAndromdaCoreJarAddingToJ2eeStory(String remotehosturi,String eclipseroot,String nameofj2eeproject){
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
			
			HttpClient httpClient = new HttpClient();
			GetMethod getMethod = new GetMethod(data.getRemotehosturi() + "/IdOfAJ2eeStoryByName.do");
			getMethod.setQueryString(new NameValuePair[]{new NameValuePair("name",data.getNameofj2eeproject())});
			httpClient.executeMethod(getMethod);
			String id  = getMethod.getResponseBodyAsString();
			File file =new File(data.getEclipseroot() +"/"+ data.getNameofj2eeproject()+ "/mda/"+data.getNameofj2eeproject() + "/web/target/"+data.getNameofj2eeproject()+"-web-1.0/WEB-INF/lib/"+data.getNameofj2eeproject()+"-core-1.0.jar");
			if(!file.exists()){
				file = new File(data.getEclipseroot() +"/"+ data.getNameofj2eeproject()+ "/mda/web/target/"+data.getNameofj2eeproject()+"-web-1.0/WEB-INF/lib/"+data.getNameofj2eeproject()+"-core-1.0.jar");
				System.err.println("core jar doesn't exist in mda/name of j2ee story + /web/target....look for mda/web/target");
			}
			if(!file.exists()){
				file = new File(data.getEclipseroot() +"/"+ data.getNameofj2eeproject()+ "/mda/"+data.getNameofj2eeproject()+"-core-1.0.jar");
				System.err.println("core jar doesn't exist in mda/name of j2ee story + /web/target....look for mda/web/target");
			}
			
			
			if(file.exists()){
				System.err.println("core jar  exist! try to post!");

				MultipartPostMethod multipartPostMethod = new MultipartPostMethod(data.getRemotehosturi()+"/AndromdaCoreJarFileFormFileUploadAddingToJ2eeStory.do");
				multipartPostMethod.addParameter("formFile","formFile",file);
				multipartPostMethod.addParameter("j2eeStory",id);
				httpClient.executeMethod(multipartPostMethod);
				System.err.println("post success!!");
			}else{
				System.err.println("core jar doesn't exist.... dont post");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		if(args.length > 2){
			new HttpClientFilePostOfAndromdaCoreJarAddingToJ2eeStory(args[0],args[1],args[2]);
		}else{
			new HttpClientFilePostOfAndromdaCoreJarAddingToJ2eeStory(null,null,null);
		}
		
	}

}
