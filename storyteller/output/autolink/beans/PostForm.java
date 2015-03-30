package net.autolink.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PostForm
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
private String org;
public void setOrg(String org){
this.org = org;
}
public String getOrg(){
return this.org;
}
private boolean hatenized;
public void setHatenized(boolean hatenized){
this.hatenized = hatenized;
}
public boolean isHatenized(){
return this.hatenized;
}
private Integer site;
public void setSite(Integer site){
this.site = site;
}
public Integer getSite(){
return this.site;
}
private String text;
public void setText(String text){
this.text = text;
}
public String getText(){
return this.text;
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
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	hatenized =false;
}
}
