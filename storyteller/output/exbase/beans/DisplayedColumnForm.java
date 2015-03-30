package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class DisplayedColumnForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer user;
public void setUser(Integer user){
this.user = user;
}
public Integer getUser(){
return this.user;
}
private Boolean display;
public void setDisplay(Boolean display){
this.display = display;
}
public Boolean getDisplay(){
return this.display;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
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
