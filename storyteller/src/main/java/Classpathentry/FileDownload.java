package Classpathentry;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

public class FileDownload {
	boolean ok = false;
	public FileDownload(String filepath,String url){
		
		try {
			
			HttpClient client = new HttpClient();
			PostMethod method = new PostMethod(url);
			int status = client.executeMethod(method);		
			if(status == 200){
				
				String contentType = method.getResponseHeader("Content-Type").getValue();
				if(contentType.equals("application/octet-stream")){
	
					InputStream in = null;
					OutputStream out = null;				
					try{
						out = new FileOutputStream(filepath);
						in = method.getResponseBodyAsStream();
						
						byte[] buffer = new byte[8192];
						int len = 0;
						while( (len = in.read(buffer)) != -1 ){
							out.write(buffer, 0, len);
						}					
					}finally{
						if(in != null){
							try{
								in.close();
							}catch(Exception e){
								e.printStackTrace();
							}
						}
						if(out != null){
							try{
								out.close();
							}catch(Exception e){
								e.printStackTrace();
							}
						}
					}
					
					
					
				}else{
					throw new RuntimeException("サーバでエラーが発生しました。errorMessage = " + method.getResponseBodyAsString());
				}
			}else{
				throw new RuntimeException("Http接続で エラーステータスが返ってきました。status = " + status );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setOk(true);
		
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	
}

