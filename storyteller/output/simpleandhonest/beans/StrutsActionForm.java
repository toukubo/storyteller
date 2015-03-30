package net.simpleandhonest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StrutsActionForm
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
private String actionname;
public void setActionname(String actionname){
this.actionname = actionname;
}
public String getActionname(){
return this.actionname;
}
private boolean admin;
public void setAdmin(boolean admin){
this.admin = admin;
}
public boolean isAdmin(){
return this.admin;
}
private boolean formember;
public void setFormember(boolean formember){
this.formember = formember;
}
public boolean isFormember(){
return this.formember;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	admin =false;
	formember =false;
}
}
