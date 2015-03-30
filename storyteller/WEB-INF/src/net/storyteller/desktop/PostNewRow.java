package net.storyteller.desktop;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class PostNewRow {
	boolean ok = false;
	Integer id = null;
	public PostNewRow(String remotehosturi,String classname){
		try {
			HttpClient client = new HttpClient();
			PostMethod post = new PostMethod(remotehosturi + "/" +classname +  "VP.do");
			post.getParams().setContentCharset("utf-8");
			NameValuePair[] data = {
					new NameValuePair("id", ""),
					new NameValuePair("rawnum",String.valueOf(row.getRawnum() )),
					new NameValuePair("type",row.getType() ),
					new NameValuePair("name",row.getName() ),
					new NameValuePair("height",String.valueOf(row.getHeight() )),
					new NameValuePair("width",String.valueOf(row.getWidth() )),
					new NameValuePair("genka",String.valueOf(row.getGenka() )),
					new NameValuePair("kasho",String.valueOf(row.getKasho() )),
					new NameValuePair("tanka",String.valueOf(row.getTanka() )),
					new NameValuePair("tankabyauto",String.valueOf(row.getTankabyauto() )),
					new NameValuePair("unit",row.getUnit()),
					new NameValuePair("quickunit",row.getQuickunit() ),
					new NameValuePair("price",String.valueOf(row.getPrice() )),
					new NameValuePair("percentage",String.valueOf(row.getPercentage())),
					new NameValuePair("estimation",row.getEstimation().toString()),
					new NameValuePair("description",row.getDescription())
			};
			post.setRequestBody(data);
			client.executeMethod(post);
			InputStream in = post.getResponseBodyAsStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String string = reader.readLine();
			while(string!=null){
				if(!string.equals("")){
					this.setId(Integer.valueOf(string));
					break;
				}
				string = reader.readLine();
			}
			if(getId()!=null || getId().intValue() != 0){
				row.setId(getId());
			}
			
			
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
