package net.pmcsgml.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String group;
public void setGroup(String group){
this.group = group;
}
public String getGroup(){
return this.group;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String manualimportrssurl;
public void setManualimportrssurl(String manualimportrssurl){
this.manualimportrssurl = manualimportrssurl;
}
public String getManualimportrssurl(){
return this.manualimportrssurl;
}
private String nocontentjapanese;
public void setNocontentjapanese(String nocontentjapanese){
this.nocontentjapanese = nocontentjapanese;
}
public String getNocontentjapanese(){
return this.nocontentjapanese;
}
private String nocontentenglish;
public void setNocontentenglish(String nocontentenglish){
this.nocontentenglish = nocontentenglish;
}
public String getNocontentenglish(){
return this.nocontentenglish;
}
private String groupname;
public void setGroupname(String groupname){
this.groupname = groupname;
}
public String getGroupname(){
return this.groupname;
}
private String smuri;
public void setSmuri(String smuri){
this.smuri = smuri;
}
public String getSmuri(){
return this.smuri;
}
private String perlexecutblepath;
public void setPerlexecutblepath(String perlexecutblepath){
this.perlexecutblepath = perlexecutblepath;
}
public String getPerlexecutblepath(){
return this.perlexecutblepath;
}
private String jheader;
public void setJheader(String jheader){
this.jheader = jheader;
}
public String getJheader(){
return this.jheader;
}
private String eheader;
public void setEheader(String eheader){
this.eheader = eheader;
}
public String getEheader(){
return this.eheader;
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
