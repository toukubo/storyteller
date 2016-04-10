package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
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
private float storytellerbyprojectteamrate;
public void setStorytellerbyprojectteamrate(float storytellerbyprojectteamrate){
this.storytellerbyprojectteamrate = storytellerbyprojectteamrate;
}
public float getStorytellerbyprojectteamrate(){
return this.storytellerbyprojectteamrate;
}
private float projectbystorytellerrate;
public void setProjectbystorytellerrate(float projectbystorytellerrate){
this.projectbystorytellerrate = projectbystorytellerrate;
}
public float getProjectbystorytellerrate(){
return this.projectbystorytellerrate;
}
private int icalsyncspan;
public void setIcalsyncspan(int icalsyncspan){
this.icalsyncspan = icalsyncspan;
}
public int getIcalsyncspan(){
return this.icalsyncspan;
}
private String smtphost;
public void setSmtphost(String smtphost){
this.smtphost = smtphost;
}
public String getSmtphost(){
return this.smtphost;
}
private String smtpacocunt;
public void setSmtpacocunt(String smtpacocunt){
this.smtpacocunt = smtpacocunt;
}
public String getSmtpacocunt(){
return this.smtpacocunt;
}
private String smtppassword;
public void setSmtppassword(String smtppassword){
this.smtppassword = smtppassword;
}
public String getSmtppassword(){
return this.smtppassword;
}
/*private String c2talkapid;
public void setC2talkapid(String c2talkapid){
this.c2talkapid = c2talkapid;
}
public String getC2talkapid(){
return this.c2talkapid;
}*/
private boolean unix;
public void setUnix(boolean unix){
this.unix = unix;
}
public boolean isUnix(){
return this.unix;
}
private float humanalecostrate;
public void setHumanalecostrate(float humanalecostrate){
this.humanalecostrate = humanalecostrate;
}
public float getHumanalecostrate(){
return this.humanalecostrate;
}
private int costpercentage;
public void setCostpercentage(int costpercentage){
this.costpercentage = costpercentage;
}
public int getCostpercentage(){
return this.costpercentage;
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
