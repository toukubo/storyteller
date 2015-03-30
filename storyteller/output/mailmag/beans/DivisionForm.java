package net.mailmag.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class DivisionForm
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
private Date enddate;
public void setEnddate(Date enddate){
this.enddate = enddate;
}
public Date getEnddate(){
return this.enddate;
}
private boolean enddateIsValid = false;
public void setEnddateIsValid(boolean enddateIsValid){
this.enddateIsValid = enddateIsValid;
}
public boolean isEnddateIsValid(){
return this.enddateIsValid;
}
private java.lang.String enddateAsRawString ="";
public java.lang.String getEnddateAsString(){
    return (enddate== null) ? null : format.format(enddate);
}
public void setEnddateAsString(java.lang.String enddate){
	this.enddateIsValid = true;
	this.enddateAsRawString = enddate;
try{
		if(StringUtils.isNotBlank(enddate)){ format.parse(enddate);}
}catch (java.text.ParseException pe){
this.enddateIsValid = false;
}
	if(enddateIsValid){
		try {
			this.enddate = (org.apache.commons.lang.StringUtils.isBlank(enddate)) ? null : format.parse(enddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setEnddateAsRawString(java.lang.String enddate){
	this.enddateAsRawString = enddate;
}

public String getEnddateAsRawString(){
return this.enddateAsRawString;
}
private Date startdate;
public void setStartdate(Date startdate){
this.startdate = startdate;
}
public Date getStartdate(){
return this.startdate;
}
private boolean startdateIsValid = false;
public void setStartdateIsValid(boolean startdateIsValid){
this.startdateIsValid = startdateIsValid;
}
public boolean isStartdateIsValid(){
return this.startdateIsValid;
}
private java.lang.String startdateAsRawString ="";
public java.lang.String getStartdateAsString(){
    return (startdate== null) ? null : format.format(startdate);
}
public void setStartdateAsString(java.lang.String startdate){
	this.startdateIsValid = true;
	this.startdateAsRawString = startdate;
try{
		if(StringUtils.isNotBlank(startdate)){ format.parse(startdate);}
}catch (java.text.ParseException pe){
this.startdateIsValid = false;
}
	if(startdateIsValid){
		try {
			this.startdate = (org.apache.commons.lang.StringUtils.isBlank(startdate)) ? null : format.parse(startdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setStartdateAsRawString(java.lang.String startdate){
	this.startdateAsRawString = startdate;
}

public String getStartdateAsRawString(){
return this.startdateAsRawString;
}
private String startmail;
public void setStartmail(String startmail){
this.startmail = startmail;
}
public String getStartmail(){
return this.startmail;
}
private Integer mailmag;
public void setMailmag(Integer mailmag){
this.mailmag = mailmag;
}
public Integer getMailmag(){
return this.mailmag;
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
