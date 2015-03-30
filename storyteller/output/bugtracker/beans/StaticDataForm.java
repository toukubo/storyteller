package net.bugtracker.beans;
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
private String storytellerurl;
public void setStorytellerurl(String storytellerurl){
this.storytellerurl = storytellerurl;
}
public String getStorytellerurl(){
return this.storytellerurl;
}
private String bugtrackerserveruri;
public void setBugtrackerserveruri(String bugtrackerserveruri){
this.bugtrackerserveruri = bugtrackerserveruri;
}
public String getBugtrackerserveruri(){
return this.bugtrackerserveruri;
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
