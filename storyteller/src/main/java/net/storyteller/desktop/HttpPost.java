package net.storyteller.desktop;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class HttpPost {
	boolean ok = false;
	public HttpPost(String attribute,String value,Integer id,String remotehosturi,String classname){
		try {
			HttpClient client = new HttpClient();
			PostMethod post = new PostMethod(remotehosturi +"/" +  classname + "VP.do");
			post.getParams().setContentCharset("utf-8");
//			post.setRequestHeader("Content-Type", "text/html; charset=utf-8");
			NameValuePair[] data = null;
			if(id!=null){
				data = new NameValuePair[]{
					new NameValuePair("id", id.toString()),
					new NameValuePair(attribute, value)
//					new NameValuePair("attribute", attribute)
			};
			}else{
				data = new NameValuePair[]{
						new NameValuePair(attribute, value)
//						new NameValuePair("attribute", attribute)
				};
				
			}
			post.setRequestBody(data);
			client.executeMethod(post);
			InputStream in = post.getResponseBodyAsStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String string = reader.readLine();
			if(string.equals("ok")){
				this.ok = ok;
			}
			post.releaseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}

}
