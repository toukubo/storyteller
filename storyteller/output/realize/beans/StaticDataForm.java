package net.realize.beans;
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
private String basepath;
public void setBasepath(String basepath){
this.basepath = basepath;
}
public String getBasepath(){
return this.basepath;
}
private boolean unix;
public void setUnix(boolean unix){
this.unix = unix;
}
public boolean isUnix(){
return this.unix;
}
private int registfee;
public void setRegistfee(int registfee){
this.registfee = registfee;
}
public int getRegistfee(){
return this.registfee;
}
private String gmailaccount;
public void setGmailaccount(String gmailaccount){
this.gmailaccount = gmailaccount;
}
public String getGmailaccount(){
return this.gmailaccount;
}
private String gmailpassword;
public void setGmailpassword(String gmailpassword){
this.gmailpassword = gmailpassword;
}
public String getGmailpassword(){
return this.gmailpassword;
}
private int cyclecommition;
public void setCyclecommition(int cyclecommition){
this.cyclecommition = cyclecommition;
}
public int getCyclecommition(){
return this.cyclecommition;
}
private int recruitcommition;
public void setRecruitcommition(int recruitcommition){
this.recruitcommition = recruitcommition;
}
public int getRecruitcommition(){
return this.recruitcommition;
}
private int levelonecyclecommition;
public void setLevelonecyclecommition(int levelonecyclecommition){
this.levelonecyclecommition = levelonecyclecommition;
}
public int getLevelonecyclecommition(){
return this.levelonecyclecommition;
}
private int leveltwocyclecommition;
public void setLeveltwocyclecommition(int leveltwocyclecommition){
this.leveltwocyclecommition = leveltwocyclecommition;
}
public int getLeveltwocyclecommition(){
return this.leveltwocyclecommition;
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
