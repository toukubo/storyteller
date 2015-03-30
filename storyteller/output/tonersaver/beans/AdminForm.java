package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AdminForm
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
private int pagesize;
public void setPagesize(int pagesize){
this.pagesize = pagesize;
}
public int getPagesize(){
return this.pagesize;
}
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private boolean passwordchanged;
public void setPasswordchanged(boolean passwordchanged){
this.passwordchanged = passwordchanged;
}
public boolean isPasswordchanged(){
return this.passwordchanged;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer priviledge;
public void setPriviledge(Integer priviledge){
this.priviledge = priviledge;
}
public Integer getPriviledge(){
return this.priviledge;
}
private String newpasswordconfirmation;
public void setNewpasswordconfirmation(String newpasswordconfirmation){
this.newpasswordconfirmation = newpasswordconfirmation;
}
public String getNewpasswordconfirmation(){
return this.newpasswordconfirmation;
}
private String newpassword;
public void setNewpassword(String newpassword){
this.newpassword = newpassword;
}
public String getNewpassword(){
return this.newpassword;
}
private String accountstatus;
public void setAccountstatus(String accountstatus){
this.accountstatus = accountstatus;
}
public String getAccountstatus(){
return this.accountstatus;
}
private int decimallevel;
public void setDecimallevel(int decimallevel){
this.decimallevel = decimallevel;
}
public int getDecimallevel(){
return this.decimallevel;
}
private boolean displayssummery;
public void setDisplayssummery(boolean displayssummery){
this.displayssummery = displayssummery;
}
public boolean isDisplayssummery(){
return this.displayssummery;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private Date passwordchangeddate;
public void setPasswordchangeddate(Date passwordchangeddate){
this.passwordchangeddate = passwordchangeddate;
}
public Date getPasswordchangeddate(){
return this.passwordchangeddate;
}
private boolean passwordchangeddateIsValid = false;
public void setPasswordchangeddateIsValid(boolean passwordchangeddateIsValid){
this.passwordchangeddateIsValid = passwordchangeddateIsValid;
}
public boolean isPasswordchangeddateIsValid(){
return this.passwordchangeddateIsValid;
}
private java.lang.String passwordchangeddateAsRawString ="";
public java.lang.String getPasswordchangeddateAsString(){
    return (passwordchangeddate== null) ? null : format.format(passwordchangeddate);
}
public void setPasswordchangeddateAsString(java.lang.String passwordchangeddate){
	this.passwordchangeddateIsValid = true;
	this.passwordchangeddateAsRawString = passwordchangeddate;
try{
		if(StringUtils.isNotBlank(passwordchangeddate)){ format.parse(passwordchangeddate);}
}catch (java.text.ParseException pe){
this.passwordchangeddateIsValid = false;
}
	if(passwordchangeddateIsValid){
		try {
			this.passwordchangeddate = (org.apache.commons.lang.StringUtils.isBlank(passwordchangeddate)) ? null : format.parse(passwordchangeddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPasswordchangeddateAsRawString(java.lang.String passwordchangeddate){
	this.passwordchangeddateAsRawString = passwordchangeddate;
}

public String getPasswordchangeddateAsRawString(){
return this.passwordchangeddateAsRawString;
}
private Date lockoutdate;
public void setLockoutdate(Date lockoutdate){
this.lockoutdate = lockoutdate;
}
public Date getLockoutdate(){
return this.lockoutdate;
}
private boolean lockoutdateIsValid = false;
public void setLockoutdateIsValid(boolean lockoutdateIsValid){
this.lockoutdateIsValid = lockoutdateIsValid;
}
public boolean isLockoutdateIsValid(){
return this.lockoutdateIsValid;
}
private java.lang.String lockoutdateAsRawString ="";
public java.lang.String getLockoutdateAsString(){
    return (lockoutdate== null) ? null : format.format(lockoutdate);
}
public void setLockoutdateAsString(java.lang.String lockoutdate){
	this.lockoutdateIsValid = true;
	this.lockoutdateAsRawString = lockoutdate;
try{
		if(StringUtils.isNotBlank(lockoutdate)){ format.parse(lockoutdate);}
}catch (java.text.ParseException pe){
this.lockoutdateIsValid = false;
}
	if(lockoutdateIsValid){
		try {
			this.lockoutdate = (org.apache.commons.lang.StringUtils.isBlank(lockoutdate)) ? null : format.parse(lockoutdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setLockoutdateAsRawString(java.lang.String lockoutdate){
	this.lockoutdateAsRawString = lockoutdate;
}

public String getLockoutdateAsRawString(){
return this.lockoutdateAsRawString;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	passwordchanged =false;
	displayssummery =false;
	removed =false;
}
}
