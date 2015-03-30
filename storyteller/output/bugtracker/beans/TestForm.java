package net.bugtracker.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TestForm
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
private Integer responsible;
public void setResponsible(Integer responsible){
this.responsible = responsible;
}
public Integer getResponsible(){
return this.responsible;
}
private Integer j2eeStory;
public void setJ2eeStory(Integer j2eeStory){
this.j2eeStory = j2eeStory;
}
public Integer getJ2eeStory(){
return this.j2eeStory;
}
private String stepstorepeat;
public void setStepstorepeat(String stepstorepeat){
this.stepstorepeat = stepstorepeat;
}
public String getStepstorepeat(){
return this.stepstorepeat;
}
private String whatyouexpectedtosee;
public void setWhatyouexpectedtosee(String whatyouexpectedtosee){
this.whatyouexpectedtosee = whatyouexpectedtosee;
}
public String getWhatyouexpectedtosee(){
return this.whatyouexpectedtosee;
}
private String whatyousawinstead;
public void setWhatyousawinstead(String whatyousawinstead){
this.whatyousawinstead = whatyousawinstead;
}
public String getWhatyousawinstead(){
return this.whatyousawinstead;
}
private boolean debuged;
public void setDebuged(boolean debuged){
this.debuged = debuged;
}
public boolean isDebuged(){
return this.debuged;
}
private boolean checked;
public void setChecked(boolean checked){
this.checked = checked;
}
public boolean isChecked(){
return this.checked;
}
private Integer creator;
public void setCreator(Integer creator){
this.creator = creator;
}
public Integer getCreator(){
return this.creator;
}
private Integer debugger;
public void setDebugger(Integer debugger){
this.debugger = debugger;
}
public Integer getDebugger(){
return this.debugger;
}
private String modifiedpagetitle;
public void setModifiedpagetitle(String modifiedpagetitle){
this.modifiedpagetitle = modifiedpagetitle;
}
public String getModifiedpagetitle(){
return this.modifiedpagetitle;
}
private String modifiedpagefilename;
public void setModifiedpagefilename(String modifiedpagefilename){
this.modifiedpagefilename = modifiedpagefilename;
}
public String getModifiedpagefilename(){
return this.modifiedpagefilename;
}
private Integer action;
public void setAction(Integer action){
this.action = action;
}
public Integer getAction(){
return this.action;
}
private String errormessage;
public void setErrormessage(String errormessage){
this.errormessage = errormessage;
}
public String getErrormessage(){
return this.errormessage;
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
private Date modifieddate;
public void setModifieddate(Date modifieddate){
this.modifieddate = modifieddate;
}
public Date getModifieddate(){
return this.modifieddate;
}
private boolean modifieddateIsValid = false;
public void setModifieddateIsValid(boolean modifieddateIsValid){
this.modifieddateIsValid = modifieddateIsValid;
}
public boolean isModifieddateIsValid(){
return this.modifieddateIsValid;
}
private java.lang.String modifieddateAsRawString ="";
public java.lang.String getModifieddateAsString(){
    return (modifieddate== null) ? null : format.format(modifieddate);
}
public void setModifieddateAsString(java.lang.String modifieddate){
	this.modifieddateIsValid = true;
	this.modifieddateAsRawString = modifieddate;
try{
		if(StringUtils.isNotBlank(modifieddate)){ format.parse(modifieddate);}
}catch (java.text.ParseException pe){
this.modifieddateIsValid = false;
}
	if(modifieddateIsValid){
		try {
			this.modifieddate = (org.apache.commons.lang.StringUtils.isBlank(modifieddate)) ? null : format.parse(modifieddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setModifieddateAsRawString(java.lang.String modifieddate){
	this.modifieddateAsRawString = modifieddate;
}

public String getModifieddateAsRawString(){
return this.modifieddateAsRawString;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	debuged =false;
	checked =false;
}
}
