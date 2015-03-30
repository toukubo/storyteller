package net.rssmailer.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
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
private String fromaddress;
public void setFromaddress(String fromaddress){
this.fromaddress = fromaddress;
}
public String getFromaddress(){
return this.fromaddress;
}
private String reportmail;
public void setReportmail(String reportmail){
this.reportmail = reportmail;
}
public String getReportmail(){
return this.reportmail;
}
private String eclipseroot;
public void setEclipseroot(String eclipseroot){
this.eclipseroot = eclipseroot;
}
public String getEclipseroot(){
return this.eclipseroot;
}
private String smtphost;
public void setSmtphost(String smtphost){
this.smtphost = smtphost;
}
public String getSmtphost(){
return this.smtphost;
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
