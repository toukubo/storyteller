package Classpathentry;

import java.io.ObjectInputStream;
import java.net.URL;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;



public class ValueObjectRetrieve {
	String classname;
	Integer id;
	Object valueObject;
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ValueObjectRetrieve(String classname,Integer id,String remoteuri){

		String urlstr = "http://" + remoteuri +  "/Export" + classname + "ValueObject.do?id=" + id.toString();
        try {
        	URL url = new URL(urlstr);
			HttpClient client = new HttpClient();
			GetMethod method = new GetMethod(url.toString());
			client.executeMethod(method);
			ObjectInputStream objectInputStream = new ObjectInputStream(method.getResponseBodyAsStream());
			Object object =objectInputStream.readObject();
			this.setValueObject(object);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	public Object getValueObject() {
		return valueObject;
	}
	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}	
	
}
