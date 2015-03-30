package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class WorkflowForm
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
private Integer workflowTemplate;
public void setWorkflowTemplate(Integer workflowTemplate){
this.workflowTemplate = workflowTemplate;
}
public Integer getWorkflowTemplate(){
return this.workflowTemplate;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String status;
public void setStatus(String status){
this.status = status;
}
public String getStatus(){
return this.status;
}
private boolean versioning;
public void setVersioning(boolean versioning){
this.versioning = versioning;
}
public boolean isVersioning(){
return this.versioning;
}
private Date scheduledEndDate;
public void setScheduledEndDate(Date scheduledEndDate){
this.scheduledEndDate = scheduledEndDate;
}
public Date getScheduledEndDate(){
return this.scheduledEndDate;
}
private boolean scheduledEndDateIsValid = false;
public void setScheduledEndDateIsValid(boolean scheduledEndDateIsValid){
this.scheduledEndDateIsValid = scheduledEndDateIsValid;
}
public boolean isScheduledEndDateIsValid(){
return this.scheduledEndDateIsValid;
}
private java.lang.String scheduledEndDateAsRawString ="";
public java.lang.String getScheduledEndDateAsString(){
    return (scheduledEndDate== null) ? null : format.format(scheduledEndDate);
}
public void setScheduledEndDateAsString(java.lang.String scheduledEndDate){
	this.scheduledEndDateIsValid = true;
	this.scheduledEndDateAsRawString = scheduledEndDate;
try{
		if(StringUtils.isNotBlank(scheduledEndDate)){ format.parse(scheduledEndDate);}
}catch (java.text.ParseException pe){
this.scheduledEndDateIsValid = false;
}
	if(scheduledEndDateIsValid){
		try {
			this.scheduledEndDate = (org.apache.commons.lang.StringUtils.isBlank(scheduledEndDate)) ? null : format.parse(scheduledEndDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setScheduledEndDateAsRawString(java.lang.String scheduledEndDate){
	this.scheduledEndDateAsRawString = scheduledEndDate;
}

public String getScheduledEndDateAsRawString(){
return this.scheduledEndDateAsRawString;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	versioning =false;
	removed =false;
}
}
