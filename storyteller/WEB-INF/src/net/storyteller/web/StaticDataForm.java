package net.storyteller.beans;
import org.apache.struts.upload.FormFile;import java.util.Date;public class StaticDataForm
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
private String documentArrivedReportTemplate;
public void setDocumentArrivedReportTemplate(String documentArrivedReportTemplate){
this.documentArrivedReportTemplate = documentArrivedReportTemplate;
}
public String getDocumentArrivedReportTemplate(){
return this.documentArrivedReportTemplate;
}
private String documentRequestTemplate;
public void setDocumentRequestTemplate(String documentRequestTemplate){
this.documentRequestTemplate = documentRequestTemplate;
}
public String getDocumentRequestTemplate(){
return this.documentRequestTemplate;
}
private String inforssurl;
public void setInforssurl(String inforssurl){
this.inforssurl = inforssurl;
}
public String getInforssurl(){
return this.inforssurl;
}
private String reportmail;
public void setReportmail(String reportmail){
this.reportmail = reportmail;
}
public String getReportmail(){
return this.reportmail;
}
private int crtmax;
public void setCrtmax(int crtmax){
this.crtmax = crtmax;
}
public int getCrtmax(){
return this.crtmax;
}
private int arpmax;
public void setArpmax(int arpmax){
this.arpmax = arpmax;
}
public int getArpmax(){
return this.arpmax;
}
private String eclipseroot;
public void setEclipseroot(String eclipseroot){
this.eclipseroot = eclipseroot;
}
public String getEclipseroot(){
return this.eclipseroot;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
}
