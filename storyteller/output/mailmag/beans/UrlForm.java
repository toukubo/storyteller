package net.mailmag.beans;
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
private String shorturl;
public void setShorturl(String shorturl){
this.shorturl = shorturl;
}
public String getShorturl(){
return this.shorturl;
}
private String clicknum;
public void setClicknum(String clicknum){
this.clicknum = clicknum;
}
public String getClicknum(){
return this.clicknum;
}
private Integer mailmag;
public void setMailmag(Integer mailmag){
this.mailmag = mailmag;
}
public Integer getMailmag(){
return this.mailmag;
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
