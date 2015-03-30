package net.autolink.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SiteForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer service;
public void setService(Integer service){
this.service = service;
}
public Integer getService(){
return this.service;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String baseurl;
public void setBaseurl(String baseurl){
this.baseurl = baseurl;
}
public String getBaseurl(){
return this.baseurl;
}
private String xmlrpcurl;
public void setXmlrpcurl(String xmlrpcurl){
this.xmlrpcurl = xmlrpcurl;
}
public String getXmlrpcurl(){
return this.xmlrpcurl;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String access_token;
public void setAccess_token(String access_token){
this.access_token = access_token;
}
public String getAccess_token(){
return this.access_token;
}
private String access_secret;
public void setAccess_secret(String access_secret){
this.access_secret = access_secret;
}
public String getAccess_secret(){
return this.access_secret;
}
private String permalink;
public void setPermalink(String permalink){
this.permalink = permalink;
}
public String getPermalink(){
return this.permalink;
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
