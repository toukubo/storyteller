package net.storyteller.desktop;

import java.io.ObjectInputStream;
import java.net.URL;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class ObjectDownload {
	public ObjectDownload(String urlstr){
        try {
        	URL url = new URL(urlstr);
			HttpClient client = new HttpClient();
			GetMethod method = new GetMethod(url.toString());
			client.executeMethod(method);
			ObjectInputStream objectInputStream = new ObjectInputStream(method.getResponseBodyAsStream());
			Object object =objectInputStream.readObject();
			this.setObject(object);

        } catch (Exception e) {
            e.printStackTrace();
        }

        
	}
	private Object object;
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
	

}
