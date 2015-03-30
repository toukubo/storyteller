package net.ars.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class VictimForm
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
private Integer accident;
public void setAccident(Integer accident){
this.accident = accident;
}
public Integer getAccident(){
return this.accident;
}
private Integer victim;
public void setVictim(Integer victim){
this.victim = victim;
}
public Integer getVictim(){
return this.victim;
}
private Integer sexofvictim;
public void setSexofvictim(Integer sexofvictim){
this.sexofvictim = sexofvictim;
}
public Integer getSexofvictim(){
return this.sexofvictim;
}
private Integer ageofvictim;
public void setAgeofvictim(Integer ageofvictim){
this.ageofvictim = ageofvictim;
}
public Integer getAgeofvictim(){
return this.ageofvictim;
}
private Integer objectofaccident;
public void setObjectofaccident(Integer objectofaccident){
this.objectofaccident = objectofaccident;
}
public Integer getObjectofaccident(){
return this.objectofaccident;
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
