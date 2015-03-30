package net.mailmag.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String header;
public void setHeader(String header){
this.header = header;
}
public String getHeader(){
return this.header;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String footer;
public void setFooter(String footer){
this.footer = footer;
}
public String getFooter(){
return this.footer;
}
private String fromaddress;
public void setFromaddress(String fromaddress){
this.fromaddress = fromaddress;
}
public String getFromaddress(){
return this.fromaddress;
}
private String sitename;
public void setSitename(String sitename){
this.sitename = sitename;
}
public String getSitename(){
return this.sitename;
}
private String mediaserverurl;
public void setMediaserverurl(String mediaserverurl){
this.mediaserverurl = mediaserverurl;
}
public String getMediaserverurl(){
return this.mediaserverurl;
}
private boolean unix;
public void setUnix(boolean unix){
this.unix = unix;
}
public boolean isUnix(){
return this.unix;
}
private String basepath;
public void setBasepath(String basepath){
this.basepath = basepath;
}
public String getBasepath(){
return this.basepath;
}
private int sleepsecound;
public void setSleepsecound(int sleepsecound){
this.sleepsecound = sleepsecound;
}
public int getSleepsecound(){
return this.sleepsecound;
}
private String erroraddress;
public void setErroraddress(String erroraddress){
this.erroraddress = erroraddress;
}
public String getErroraddress(){
return this.erroraddress;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	unix =false;
}
}
