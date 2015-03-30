package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PolicyPrinterForm
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
private String priviledgeowner;
public void setPriviledgeowner(String priviledgeowner){
this.priviledgeowner = priviledgeowner;
}
public String getPriviledgeowner(){
return this.priviledgeowner;
}
private int savingrate;
public void setSavingrate(int savingrate){
this.savingrate = savingrate;
}
public int getSavingrate(){
return this.savingrate;
}
private Integer policy;
public void setPolicy(Integer policy){
this.policy = policy;
}
public Integer getPolicy(){
return this.policy;
}
private boolean valid;
public void setValid(boolean valid){
this.valid = valid;
}
public boolean isValid(){
return this.valid;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	valid =false;
}
}
