package net.iwager.beans;
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
private String reportmail;
public void setReportmail(String reportmail){
this.reportmail = reportmail;
}
public String getReportmail(){
return this.reportmail;
}
private float projectbystorytellerrate;
public void setProjectbystorytellerrate(float projectbystorytellerrate){
this.projectbystorytellerrate = projectbystorytellerrate;
}
public float getProjectbystorytellerrate(){
return this.projectbystorytellerrate;
}
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
private int jackpot;
public void setJackpot(int jackpot){
this.jackpot = jackpot;
}
public int getJackpot(){
return this.jackpot;
}
private String ticker;
public void setTicker(String ticker){
this.ticker = ticker;
}
public String getTicker(){
return this.ticker;
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
