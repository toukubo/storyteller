package net.pmcsm.beans;
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
private String kana;
public void setKana(String kana){
this.kana = kana;
}
public String getKana(){
return this.kana;
}
private Integer privilege;
public void setPrivilege(Integer privilege){
this.privilege = privilege;
}
public Integer getPrivilege(){
return this.privilege;
}
private Date createdate;
public void setCreatedate(Date createdate){
this.createdate = createdate;
}
public Date getCreatedate(){
return this.createdate;
}
private boolean createdateIsValid = false;
public void setCreatedateIsValid(boolean createdateIsValid){
this.createdateIsValid = createdateIsValid;
}
public boolean isCreatedateIsValid(){
return this.createdateIsValid;
}
private java.lang.String createdateAsRawString ="";
public java.lang.String getCreatedateAsString(){
    return (createdate== null) ? null : format.format(createdate);
}
public void setCreatedateAsString(java.lang.String createdate){
	this.createdateIsValid = true;
	this.createdateAsRawString = createdate;
try{
		if(StringUtils.isNotBlank(createdate)){ format.parse(createdate);}
}catch (java.text.ParseException pe){
this.createdateIsValid = false;
}
	if(createdateIsValid){
		try {
			this.createdate = (org.apache.commons.lang.StringUtils.isBlank(createdate)) ? null : format.parse(createdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreatedateAsRawString(java.lang.String createdate){
	this.createdateAsRawString = createdate;
}

public String getCreatedateAsRawString(){
return this.createdateAsRawString;
}
private Date updatedate;
public void setUpdatedate(Date updatedate){
this.updatedate = updatedate;
}
public Date getUpdatedate(){
return this.updatedate;
}
private boolean updatedateIsValid = false;
public void setUpdatedateIsValid(boolean updatedateIsValid){
this.updatedateIsValid = updatedateIsValid;
}
public boolean isUpdatedateIsValid(){
return this.updatedateIsValid;
}
private java.lang.String updatedateAsRawString ="";
public java.lang.String getUpdatedateAsString(){
    return (updatedate== null) ? null : format.format(updatedate);
}
public void setUpdatedateAsString(java.lang.String updatedate){
	this.updatedateIsValid = true;
	this.updatedateAsRawString = updatedate;
try{
		if(StringUtils.isNotBlank(updatedate)){ format.parse(updatedate);}
}catch (java.text.ParseException pe){
this.updatedateIsValid = false;
}
	if(updatedateIsValid){
		try {
			this.updatedate = (org.apache.commons.lang.StringUtils.isBlank(updatedate)) ? null : format.parse(updatedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setUpdatedateAsRawString(java.lang.String updatedate){
	this.updatedateAsRawString = updatedate;
}

public String getUpdatedateAsRawString(){
return this.updatedateAsRawString;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
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
