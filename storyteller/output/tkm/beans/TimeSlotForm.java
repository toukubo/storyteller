package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TimeSlotForm
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
private Date startTime;
public void setStartTime(Date startTime){
this.startTime = startTime;
}
public Date getStartTime(){
return this.startTime;
}
private boolean startTimeIsValid = false;
public void setStartTimeIsValid(boolean startTimeIsValid){
this.startTimeIsValid = startTimeIsValid;
}
public boolean isStartTimeIsValid(){
return this.startTimeIsValid;
}
private java.lang.String startTimeAsRawString ="";
public java.lang.String getStartTimeAsString(){
    return (startTime== null) ? null : format.format(startTime);
}
public void setStartTimeAsString(java.lang.String startTime){
	this.startTimeIsValid = true;
	this.startTimeAsRawString = startTime;
try{
		if(StringUtils.isNotBlank(startTime)){ format.parse(startTime);}
}catch (java.text.ParseException pe){
this.startTimeIsValid = false;
}
	if(startTimeIsValid){
		try {
			this.startTime = (org.apache.commons.lang.StringUtils.isBlank(startTime)) ? null : format.parse(startTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setStartTimeAsRawString(java.lang.String startTime){
	this.startTimeAsRawString = startTime;
}

public String getStartTimeAsRawString(){
return this.startTimeAsRawString;
}
private Integer shop;
public void setShop(Integer shop){
this.shop = shop;
}
public Integer getShop(){
return this.shop;
}
private Date endTime;
public void setEndTime(Date endTime){
this.endTime = endTime;
}
public Date getEndTime(){
return this.endTime;
}
private boolean endTimeIsValid = false;
public void setEndTimeIsValid(boolean endTimeIsValid){
this.endTimeIsValid = endTimeIsValid;
}
public boolean isEndTimeIsValid(){
return this.endTimeIsValid;
}
private java.lang.String endTimeAsRawString ="";
public java.lang.String getEndTimeAsString(){
    return (endTime== null) ? null : format.format(endTime);
}
public void setEndTimeAsString(java.lang.String endTime){
	this.endTimeIsValid = true;
	this.endTimeAsRawString = endTime;
try{
		if(StringUtils.isNotBlank(endTime)){ format.parse(endTime);}
}catch (java.text.ParseException pe){
this.endTimeIsValid = false;
}
	if(endTimeIsValid){
		try {
			this.endTime = (org.apache.commons.lang.StringUtils.isBlank(endTime)) ? null : format.parse(endTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setEndTimeAsRawString(java.lang.String endTime){
	this.endTimeAsRawString = endTime;
}

public String getEndTimeAsRawString(){
return this.endTimeAsRawString;
}
private Integer timeSlotType;
public void setTimeSlotType(Integer timeSlotType){
this.timeSlotType = timeSlotType;
}
public Integer getTimeSlotType(){
return this.timeSlotType;
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
