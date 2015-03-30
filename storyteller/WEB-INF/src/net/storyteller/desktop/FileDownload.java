package net.storyteller.desktop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

public class FileDownload {
	boolean ok = false;
	public FileDownload(String filepath,String url,boolean overwrite){
		
		try {
			
			HttpClient client = new HttpClient();
			PostMethod method = new PostMethod(url);
			int status = client.executeMethod(method);		
			if(status == 200){
				System.err.println("200! try to save!"+filepath +"and" + url);
				this.saveAsVinary(filepath,url,method,overwrite);
			
//				
//				Header header = method.getResponseHeader("Content-Type");
//				if(header!=null){
//					String contentType = header.getValue();
//					if(contentType ==null){
//						this.saveAsVinary(filepath,url,method);
//					}else{
//						if(contentType.equals("application/octet-stream")){
//							
//							this.saveAsVinary(filepath,url,method);
//							
//						}else{
//							
//							if(filepath.endsWith("jar")){
//								this.saveAsVinary(filepath,url,method);
//								
//							}else{
//								this.saveAsVinary(filepath,url,method);
//								
//							}
//							
//						}
//						
//					}
//
//				}else{
//					this.saveAsVinary(filepath,url,method);
//				}
				
					
			}else{
				if(status == 404){
					System.err.println(filepath +"and" + url);
				}
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
	
	private void saveAsVinary(String filepath,String url,PostMethod method,boolean overwrite) throws Exception{
		InputStream in = null;
		OutputStream out = null;				
		try{
			File file = new File(filepath);
			File dir = file.getParentFile();
			if(!dir.exists()){
				dir.mkdirs();
			}
			if(file.exists() && !overwrite){
				System.err.println("file exists! don't overwrite! " + filepath);
			}else{
				out = new FileOutputStream(filepath);
				in = method.getResponseBodyAsStream();
				byte[] buffer = new byte[8192];
				int len = 0;
				while( (len = in.read(buffer)) != -1 ){
					out.write(buffer, 0, len);
				}				
				out.flush();
				System.err.println("saved! " + filepath);
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
		
	}
	private void saveAsString(String filepath,String url,PostMethod method) throws Exception{
		
		
	}
	
}

