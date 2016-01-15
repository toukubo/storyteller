package net.storyteller.desktop;

import java.io.InputStream;
import java.io.ObjectInputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class InsertStrutsConfigsOfStrutsActionsOfAstoryOfAName {
	public InsertStrutsConfigsOfStrutsActionsOfAstoryOfAName(String remotehosturi,String nameofj2eeproject,String eclipseroot){
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
			HttpClient client = new HttpClient();
			GetMethod getMethod = new GetMethod(data.getRemotehosturi()+"DisplayStrutsActionsOfJ2eeStory.do?name="+data.getNameofj2eeproject());
			client.executeMethod(getMethod);
			InputStream inputStream = getMethod.getResponseBodyAsStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			
			objectInputStream.readObject();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	public static void main(String[] args) {
		if(args.length > 2){
			System.err.println("args is more than 2. so we gonna use args.s.");
			InsertStrutsConfigsOfStrutsActionsOfAstoryOfAName actionsOfAstoryOfAName = new InsertStrutsConfigsOfStrutsActionsOfAstoryOfAName(args[0],args[1],args[2]);
		}else{
			System.err.println("args is less than 2. we don't use args");
			InsertStrutsConfigsOfStrutsActionsOfAstoryOfAName actionsOfAstoryOfAName = new InsertStrutsConfigsOfStrutsActionsOfAstoryOfAName(null,null,null);
		}
	}

}
