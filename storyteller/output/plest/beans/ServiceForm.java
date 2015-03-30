package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ServiceForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String baseurl;
public void setBaseurl(String baseurl){
this.baseurl = baseurl;
}
public String getBaseurl(){
return this.baseurl;
}
private String oauthurl;
public void setOauthurl(String oauthurl){
this.oauthurl = oauthurl;
}
public String getOauthurl(){
return this.oauthurl;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
