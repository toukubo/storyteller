package net.rssmailer.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AssignForm
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
private Integer mail;
public void setMail(Integer mail){
this.mail = mail;
}
public Integer getMail(){
return this.mail;
}
private Integer bookmarkRssSource;
public void setBookmarkRssSource(Integer bookmarkRssSource){
this.bookmarkRssSource = bookmarkRssSource;
}
public Integer getBookmarkRssSource(){
return this.bookmarkRssSource;
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
