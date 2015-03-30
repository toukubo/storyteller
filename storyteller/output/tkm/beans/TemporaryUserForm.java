package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TemporaryUserForm
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
private Date creationDate;
public void setCreationDate(Date creationDate){
this.creationDate = creationDate;
}
public Date getCreationDate(){
return this.creationDate;
}
private boolean creationDateIsValid = false;
public void setCreationDateIsValid(boolean creationDateIsValid){
this.creationDateIsValid = creationDateIsValid;
}
public boolean isCreationDateIsValid(){
return this.creationDateIsValid;
}
private java.lang.String creationDateAsRawString ="";
public java.lang.String getCreationDateAsString(){
    return (creationDate== null) ? null : format.format(creationDate);
}
public void setCreationDateAsString(java.lang.String creationDate){
	this.creationDateIsValid = true;
	this.creationDateAsRawString = creationDate;
try{
		if(StringUtils.isNotBlank(creationDate)){ format.parse(creationDate);}
}catch (java.text.ParseException pe){
this.creationDateIsValid = false;
}
	if(creationDateIsValid){
		try {
			this.creationDate = (org.apache.commons.lang.StringUtils.isBlank(creationDate)) ? null : format.parse(creationDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreationDateAsRawString(java.lang.String creationDate){
	this.creationDateAsRawString = creationDate;
}

public String getCreationDateAsRawString(){
return this.creationDateAsRawString;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
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
