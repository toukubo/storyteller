package net.ars.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaffForm
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
private String staffid;
public void setStaffid(String staffid){
this.staffid = staffid;
}
public String getStaffid(){
return this.staffid;
}
private String staffpassword;
public void setStaffpassword(String staffpassword){
this.staffpassword = staffpassword;
}
public String getStaffpassword(){
return this.staffpassword;
}
private String staffname;
public void setStaffname(String staffname){
this.staffname = staffname;
}
public String getStaffname(){
return this.staffname;
}
private Integer staffsex;
public void setStaffsex(Integer staffsex){
this.staffsex = staffsex;
}
public Integer getStaffsex(){
return this.staffsex;
}
private Date staffbirthday;
public void setStaffbirthday(Date staffbirthday){
this.staffbirthday = staffbirthday;
}
public Date getStaffbirthday(){
return this.staffbirthday;
}
private boolean staffbirthdayIsValid = false;
public void setStaffbirthdayIsValid(boolean staffbirthdayIsValid){
this.staffbirthdayIsValid = staffbirthdayIsValid;
}
public boolean isStaffbirthdayIsValid(){
return this.staffbirthdayIsValid;
}
private java.lang.String staffbirthdayAsRawString ="";
public java.lang.String getStaffbirthdayAsString(){
    return (staffbirthday== null) ? null : format.format(staffbirthday);
}
public void setStaffbirthdayAsString(java.lang.String staffbirthday){
	this.staffbirthdayIsValid = true;
	this.staffbirthdayAsRawString = staffbirthday;
try{
		if(StringUtils.isNotBlank(staffbirthday)){ format.parse(staffbirthday);}
}catch (java.text.ParseException pe){
this.staffbirthdayIsValid = false;
}
	if(staffbirthdayIsValid){
		try {
			this.staffbirthday = (org.apache.commons.lang.StringUtils.isBlank(staffbirthday)) ? null : format.parse(staffbirthday);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setStaffbirthdayAsRawString(java.lang.String staffbirthday){
	this.staffbirthdayAsRawString = staffbirthday;
}

public String getStaffbirthdayAsRawString(){
return this.staffbirthdayAsRawString;
}
private Date dateofbeginingwork;
public void setDateofbeginingwork(Date dateofbeginingwork){
this.dateofbeginingwork = dateofbeginingwork;
}
public Date getDateofbeginingwork(){
return this.dateofbeginingwork;
}
private boolean dateofbeginingworkIsValid = false;
public void setDateofbeginingworkIsValid(boolean dateofbeginingworkIsValid){
this.dateofbeginingworkIsValid = dateofbeginingworkIsValid;
}
public boolean isDateofbeginingworkIsValid(){
return this.dateofbeginingworkIsValid;
}
private java.lang.String dateofbeginingworkAsRawString ="";
public java.lang.String getDateofbeginingworkAsString(){
    return (dateofbeginingwork== null) ? null : format.format(dateofbeginingwork);
}
public void setDateofbeginingworkAsString(java.lang.String dateofbeginingwork){
	this.dateofbeginingworkIsValid = true;
	this.dateofbeginingworkAsRawString = dateofbeginingwork;
try{
		if(StringUtils.isNotBlank(dateofbeginingwork)){ format.parse(dateofbeginingwork);}
}catch (java.text.ParseException pe){
this.dateofbeginingworkIsValid = false;
}
	if(dateofbeginingworkIsValid){
		try {
			this.dateofbeginingwork = (org.apache.commons.lang.StringUtils.isBlank(dateofbeginingwork)) ? null : format.parse(dateofbeginingwork);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateofbeginingworkAsRawString(java.lang.String dateofbeginingwork){
	this.dateofbeginingworkAsRawString = dateofbeginingwork;
}

public String getDateofbeginingworkAsRawString(){
return this.dateofbeginingworkAsRawString;
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
