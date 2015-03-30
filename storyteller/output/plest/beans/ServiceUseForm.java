package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ServiceUseForm
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
private String secret;
public void setSecret(String secret){
this.secret = secret;
}
public String getSecret(){
return this.secret;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private String token;
public void setToken(String token){
this.token = token;
}
public String getToken(){
return this.token;
}
private String consumerkey;
public void setConsumerkey(String consumerkey){
this.consumerkey = consumerkey;
}
public String getConsumerkey(){
return this.consumerkey;
}
private String oauthmethodtype;
public void setOauthmethodtype(String oauthmethodtype){
this.oauthmethodtype = oauthmethodtype;
}
public String getOauthmethodtype(){
return this.oauthmethodtype;
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
