package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TaskForm
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
private boolean done;
public void setDone(boolean done){
this.done = done;
}
public boolean isDone(){
return this.done;
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
private int hour;
public void setHour(int hour){
this.hour = hour;
}
public int getHour(){
return this.hour;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Integer j2eeStory;
public void setJ2eeStory(Integer j2eeStory){
this.j2eeStory = j2eeStory;
}
public Integer getJ2eeStory(){
return this.j2eeStory;
}
private boolean acknowledged;
public void setAcknowledged(boolean acknowledged){
this.acknowledged = acknowledged;
}
public boolean isAcknowledged(){
return this.acknowledged;
}
private boolean assigned;
public void setAssigned(boolean assigned){
this.assigned = assigned;
}
public boolean isAssigned(){
return this.assigned;
}
private Integer taskTemplate;
public void setTaskTemplate(Integer taskTemplate){
this.taskTemplate = taskTemplate;
}
public Integer getTaskTemplate(){
return this.taskTemplate;
}
private String summery;
public void setSummery(String summery){
this.summery = summery;
}
public String getSummery(){
return this.summery;
}
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private String icaluid;
public void setIcaluid(String icaluid){
this.icaluid = icaluid;
}
public String getIcaluid(){
return this.icaluid;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	done =false;
	acknowledged =false;
	assigned =false;
}
}
