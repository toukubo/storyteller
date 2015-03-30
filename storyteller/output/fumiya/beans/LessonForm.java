package net.fumiya.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class LessonForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Date date;
public void setDate(Date date){
this.date = date;
}
public Date getDate(){
return this.date;
}
private boolean dateIsValid = false;
public void setDateIsValid(boolean dateIsValid){
this.dateIsValid = dateIsValid;
}
public boolean isDateIsValid(){
return this.dateIsValid;
}
private java.lang.String dateAsRawString ="";
public java.lang.String getDateAsString(){
    return (date== null) ? null : format.format(date);
}
public void setDateAsString(java.lang.String date){
	this.dateIsValid = true;
	this.dateAsRawString = date;
try{
		if(StringUtils.isNotBlank(date)){ format.parse(date);}
}catch (java.text.ParseException pe){
this.dateIsValid = false;
}
	if(dateIsValid){
		try {
			this.date = (org.apache.commons.lang.StringUtils.isBlank(date)) ? null : format.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateAsRawString(java.lang.String date){
	this.dateAsRawString = date;
}

public String getDateAsRawString(){
return this.dateAsRawString;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
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
private Integer course;
public void setCourse(Integer course){
this.course = course;
}
public Integer getCourse(){
return this.course;
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
