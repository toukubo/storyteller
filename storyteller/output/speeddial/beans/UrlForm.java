package net.speeddial.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class UrlForm
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
private String url;
public void setUrl(String url){
this.url = url;
}
public String getUrl(){
return this.url;
}
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
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
