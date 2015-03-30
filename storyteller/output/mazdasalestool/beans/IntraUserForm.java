package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class IntraUserForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private String groupname;
public void setGroupname(String groupname){
this.groupname = groupname;
}
public String getGroupname(){
return this.groupname;
}
private Boolean removed;
public void setRemoved(Boolean removed){
this.removed = removed;
}
public Boolean getRemoved(){
return this.removed;
}
private Integer base;
public void setBase(Integer base){
this.base = base;
}
public Integer getBase(){
return this.base;
}
private Integer employeecode;
public void setEmployeecode(Integer employeecode){
this.employeecode = employeecode;
}
public Integer getEmployeecode(){
return this.employeecode;
}
private String mailaddr;
public void setMailaddr(String mailaddr){
this.mailaddr = mailaddr;
}
public String getMailaddr(){
return this.mailaddr;
}
private Boolean recivemail;
public void setRecivemail(Boolean recivemail){
this.recivemail = recivemail;
}
public Boolean getRecivemail(){
return this.recivemail;
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
