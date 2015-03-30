package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class IntraUserForm
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
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private Integer department;
public void setDepartment(Integer department){
this.department = department;
}
public Integer getDepartment(){
return this.department;
}
private String loginid;
public void setLoginid(String loginid){
this.loginid = loginid;
}
public String getLoginid(){
return this.loginid;
}
private Integer privilege;
public void setPrivilege(Integer privilege){
this.privilege = privilege;
}
public Integer getPrivilege(){
return this.privilege;
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
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
}
}
