package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ActivityForm
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
private Boolean notified;
public void setNotified(Boolean notified){
this.notified = notified;
}
public Boolean getNotified(){
return this.notified;
}
private Integer activityTemplate;
public void setActivityTemplate(Integer activityTemplate){
this.activityTemplate = activityTemplate;
}
public Integer getActivityTemplate(){
return this.activityTemplate;
}
private Integer workflow;
public void setWorkflow(Integer workflow){
this.workflow = workflow;
}
public Integer getWorkflow(){
return this.workflow;
}
private Integer excel;
public void setExcel(Integer excel){
this.excel = excel;
}
public Integer getExcel(){
return this.excel;
}
private Boolean done;
public void setDone(Boolean done){
this.done = done;
}
public Boolean getDone(){
return this.done;
}
private Integer confirmation;
public void setConfirmation(Integer confirmation){
this.confirmation = confirmation;
}
public Integer getConfirmation(){
return this.confirmation;
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
