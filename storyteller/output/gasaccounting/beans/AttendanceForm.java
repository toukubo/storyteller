package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AttendanceForm
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
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private int starthour;
public void setStarthour(int starthour){
this.starthour = starthour;
}
public int getStarthour(){
return this.starthour;
}
private int startminuite;
public void setStartminuite(int startminuite){
this.startminuite = startminuite;
}
public int getStartminuite(){
return this.startminuite;
}
private int endhour;
public void setEndhour(int endhour){
this.endhour = endhour;
}
public int getEndhour(){
return this.endhour;
}
private int endminute;
public void setEndminute(int endminute){
this.endminute = endminute;
}
public int getEndminute(){
return this.endminute;
}
private int intervalhours;
public void setIntervalhours(int intervalhours){
this.intervalhours = intervalhours;
}
public int getIntervalhours(){
return this.intervalhours;
}
private int totalworkhour;
public void setTotalworkhour(int totalworkhour){
this.totalworkhour = totalworkhour;
}
public int getTotalworkhour(){
return this.totalworkhour;
}
private boolean late;
public void setLate(boolean late){
this.late = late;
}
public boolean isLate(){
return this.late;
}
private boolean leaveearly;
public void setLeaveearly(boolean leaveearly){
this.leaveearly = leaveearly;
}
public boolean isLeaveearly(){
return this.leaveearly;
}
private boolean awl;
public void setAwl(boolean awl){
this.awl = awl;
}
public boolean isAwl(){
return this.awl;
}
private Date date;
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
private float totalhollidayworktime;
public void setTotalhollidayworktime(float totalhollidayworktime){
this.totalhollidayworktime = totalhollidayworktime;
}
public float getTotalhollidayworktime(){
return this.totalhollidayworktime;
}
private float totalmidnightworktime;
public void setTotalmidnightworktime(float totalmidnightworktime){
this.totalmidnightworktime = totalmidnightworktime;
}
public float getTotalmidnightworktime(){
return this.totalmidnightworktime;
}
private float totalovertimeworktime;
public void setTotalovertimeworktime(float totalovertimeworktime){
this.totalovertimeworktime = totalovertimeworktime;
}
public float getTotalovertimeworktime(){
return this.totalovertimeworktime;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	late =false;
	leaveearly =false;
	awl =false;
}
}
