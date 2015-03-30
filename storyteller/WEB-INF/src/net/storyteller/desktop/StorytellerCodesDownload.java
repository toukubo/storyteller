package net.storyteller.desktop;

import java.util.StringTokenizer;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.StringUtils;

public class StorytellerCodesDownload {
	
	
	public StorytellerCodesDownload(String remotehosturi,String eclipseroot,String nameofj2eeproject){
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
			
			/// dwonloading of jsps
//			HttpClient httpClient = new HttpClient();
//			GetMethod getMethod = new GetMethod(data.getRemotehosturi() +"/UrlsOfJspsOfAJ2eeStoryByName.do");
//			getMethod.setQueryString(new NameValuePair[]{new NameValuePair("name",data.getNameofj2eeproject())});
//			httpClient.executeMethod(getMethod);
//			String UrlsOfJspsOfAJ2eeStoryByName = getMethod.getResponseBodyAsString();
//			StringTokenizer stringTokenizer = new StringTokenizer(UrlsOfJspsOfAJ2eeStoryByName,"\r\n");
//			System.err.println("the list of download is " + UrlsOfJspsOfAJ2eeStoryByName);
//			while (stringTokenizer.hasMoreTokens()) {
//				String url = stringTokenizer.nextToken();
//				if(shouldBeDownloaded(url)){
//				FileDownload fileDownload = 
//					new FileDownload(data.getEclipseroot()  + data.getNameofj2eeproject() 
//							+ "/pages/"
//		                    + url.substring(url.lastIndexOf("/")).replaceAll("_jsp",".jsp"),
//							url.replaceAll(".jsp", "_jsp"),true);
//				}
//			}

			
			
			/// dwonloading of jsps
			HttpClient httpClient = new HttpClient();
			GetMethod getMethod = new GetMethod(data.getRemotehosturi() +"/UrlsOfJspsOfNonAllVerbAJ2eeStoryByName.do");
			getMethod.setQueryString(new NameValuePair[]{new NameValuePair("name",data.getNameofj2eeproject())});
			httpClient.executeMethod(getMethod);
			String UrlsOfJspsOfNonAllVerbAJ2eeStoryByName = getMethod.getResponseBodyAsString();
			StringTokenizer stringTokenizer = new StringTokenizer(UrlsOfJspsOfNonAllVerbAJ2eeStoryByName,"\r\n");
			System.err.println("the list of download is " + UrlsOfJspsOfNonAllVerbAJ2eeStoryByName);
			while (stringTokenizer.hasMoreTokens()) {
				String url = stringTokenizer.nextToken();
				if(shouldBeDownloaded(url)){
					if(url.endsWith("_jsp")){
						FileDownload fileDownload = 
							new FileDownload(data.getEclipseroot()  + data.getNameofj2eeproject() 
									+ "/pages/app/"
				                    + url.substring(url.lastIndexOf("/")).replaceAll("_jsp",".jsp"),
									url.replaceAll(".jsp", "_jsp"),false);
						
					}else if(url.endsWith(".eml")){
						FileDownload fileDownload = 
							new FileDownload(data.getEclipseroot()  + data.getNameofj2eeproject() 
									+ "/WEB-INF/src/" + url.substring(url.lastIndexOf("/")),url,false);
						
					}
				}
			}

			
			
			
			
			
			
			
			
			
			
			////////////////downloading of actions 
//			httpClient = new HttpClient();
//			getMethod = new GetMethod(data.getRemotehosturi() +"/UrlsOfStrutsActionsOfAJ2eeStoryByName.do");
//			getMethod.setQueryString(new NameValuePair[]{new NameValuePair("name",data.getNameofj2eeproject())});
//			httpClient.executeMethod(getMethod);
//			String UrlsOfStrutsActionsOfAJ2eeStoryByName = getMethod.getResponseBodyAsString();
//			stringTokenizer = new StringTokenizer(UrlsOfStrutsActionsOfAJ2eeStoryByName,"\r\n");
//			System.err.println("the list of download is " + UrlsOfStrutsActionsOfAJ2eeStoryByName);
//			while (stringTokenizer.hasMoreTokens()) {
//				String url = stringTokenizer.nextToken();
//				if(url!=null && !url.equals("")){
//						FileDownload fileDownload = 
//							new FileDownload(data.getEclipseroot()  + data.getNameofj2eeproject() 
//									+ "/WEB-INF/src/net/" + data.getNameofj2eeproject() 
//									+ "/web/" + url.substring(url.lastIndexOf("/")),
//									url,true);
//						
//				}
//			}
			
			////////////////downloading of actions 
			httpClient = new HttpClient();
			getMethod = new GetMethod(data.getRemotehosturi() +"/UrlsOfStrutsActionsOfNonAllVerbOfAJ2eeStoryByName.do");
			getMethod.setQueryString(new NameValuePair[]{new NameValuePair("name",data.getNameofj2eeproject())});
			httpClient.executeMethod(getMethod);
			String UrlsOfStrutsActionsOfNonAllVerbOfAJ2eeStoryByName = getMethod.getResponseBodyAsString();
			stringTokenizer = new StringTokenizer(UrlsOfStrutsActionsOfNonAllVerbOfAJ2eeStoryByName,"\r\n");
			System.err.println("the list of download is " + UrlsOfStrutsActionsOfNonAllVerbOfAJ2eeStoryByName);
			while (stringTokenizer.hasMoreTokens()) {
				String url = stringTokenizer.nextToken();
				if(shouldBeDownloaded(url)){
						FileDownload fileDownload = 
							new FileDownload(data.getEclipseroot()  + data.getNameofj2eeproject() 
									+ "/WEB-INF/src/net/" + data.getNameofj2eeproject() 
									+ "/web/app/" + url.substring(url.lastIndexOf("/")),
									url,false);
						
				}
			}
			
			////////////////////////////////download Beans!
			httpClient = new HttpClient();
			getMethod = new GetMethod(data.getRemotehosturi() +"/UrlsOfBeansOfAJ2eeStoryByName.do");
			getMethod.setQueryString(new NameValuePair[]{new NameValuePair("name",data.getNameofj2eeproject())});
			httpClient.executeMethod(getMethod);

			String UrlsOfBeansOfAJ2eeStoryByName = getMethod.getResponseBodyAsString();
			stringTokenizer = new StringTokenizer(UrlsOfBeansOfAJ2eeStoryByName,"\r\n");
			while (stringTokenizer.hasMoreTokens()) {
				String url = stringTokenizer.nextToken();
				if(shouldBeDownloaded(url)){
					String localfilepath = data.getEclipseroot()  + data.getNameofj2eeproject() 
					+ "/WEB-INF/src/net/"
					+ data.getNameofj2eeproject() + "/beans/"
                    + url.substring(url.lastIndexOf("/"));
					System.err.println(localfilepath + " is the local file path, and");
					System.err.println(url + " is the url");
					FileDownload fileDownload = new FileDownload(localfilepath,url,true);
				}
			}
			///////////////////downloading struts config file of storyteller(struts-config-storyteller.xml
//			FileDownload fileDownload = new FileDownload(data.getEclipseroot()+data.getNameofj2eeproject()+"/WEB-INF/struts-config-storyteller.xml",data.getRemotehosturi()+"/StrutsConfigOfAJ2eeStory.do?name=" + data.getNameofj2eeproject());
			UpdateStrutsConfigOfAJ2eeStoryByName updateStrutsConfigOfAJ2eeStoryByName = new UpdateStrutsConfigOfAJ2eeStoryByName(remotehosturi,nameofj2eeproject,eclipseroot,"");
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}
	private boolean shouldBeDownloaded(String url) {
		return url!=null && !url.equals("") && url.startsWith("http://") && !url.contains("NotToBeDownloaded");
	}
	//takes remoteuri(eg,http://storytellermachine.net/storyteller) + nameofj2eeproject(eg shoppingsite)
	public static void main(String[] args) {
		if(args.length > 2){
			System.err.println("args is more than 2. so we gonna use args.s.");
			StorytellerCodesDownload codesDownload = new StorytellerCodesDownload(args[0],args[1],args[2]);
		}else{
			System.err.println("args is less than 2. we don't use args");
			StorytellerCodesDownload codesDownload = new StorytellerCodesDownload(null,null,null);
		}
	}
}
