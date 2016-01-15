package net.storyteller.desktop;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Vector;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class DownloadListVO {
	Collection list = new Vector();
	
	public DownloadListVO(String uri){
		this(null,null,null,uri);
	}
	public DownloadListVO(String remotehosturi,String nameofj2eeproject,String eclipseroot,String uri){
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
			GetMethod getMethod = new GetMethod(data.getRemotehosturi()+"/" + uri + data.getNameofj2eeproject());
			client.executeMethod(getMethod);
			InputStream inputStream = getMethod.getResponseBodyAsStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			this.setList((Collection)objectInputStream.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//so , put only url then you will use default local static data. we should not use spring here?
	public static void main(String[] args) {
		if(args.length > 2){
			System.err.println("args is more than 2. so we gonna use args.s.");
			DownloadListVO downloadListVO = new DownloadListVO(args[0],args[1],args[2],args[3]);
		}else{
			System.err.println("args is less than 2. we don't use args");
			DownloadListVO downloadListVO = new DownloadListVO(null,null,null,args[0]);
		}
	}
	public Collection getList() {
		return list;
	}
	public void setList(Collection list) {
		this.list = list;
	}
	
}
