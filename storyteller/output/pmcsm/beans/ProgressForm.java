package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ProgressForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer prev;
public void setPrev(Integer prev){
this.prev = prev;
}
public Integer getPrev(){
return this.prev;
}
private Integer manual;
public void setManual(Integer manual){
this.manual = manual;
}
public Integer getManual(){
return this.manual;
}
private boolean current;
public void setCurrent(boolean current){
this.current = current;
}
public boolean isCurrent(){
return this.current;
}
private Integer after;
public void setAfter(Integer after){
this.after = after;
}
public Integer getAfter(){
return this.after;
}
private boolean mbg;
public void setMbg(boolean mbg){
this.mbg = mbg;
}
public boolean isMbg(){
return this.mbg;
}
private Date documentrequestdate;
public void setDocumentrequestdate(Date documentrequestdate){
this.documentrequestdate = documentrequestdate;
}
public Date getDocumentrequestdate(){
return this.documentrequestdate;
}
private boolean documentrequestdateIsValid = false;
public void setDocumentrequestdateIsValid(boolean documentrequestdateIsValid){
this.documentrequestdateIsValid = documentrequestdateIsValid;
}
public boolean isDocumentrequestdateIsValid(){
return this.documentrequestdateIsValid;
}
private java.lang.String documentrequestdateAsRawString ="";
public java.lang.String getDocumentrequestdateAsString(){
    return (documentrequestdate== null) ? null : format.format(documentrequestdate);
}
public void setDocumentrequestdateAsString(java.lang.String documentrequestdate){
	this.documentrequestdateIsValid = true;
	this.documentrequestdateAsRawString = documentrequestdate;
try{
		if(StringUtils.isNotBlank(documentrequestdate)){ format.parse(documentrequestdate);}
}catch (java.text.ParseException pe){
this.documentrequestdateIsValid = false;
}
	if(documentrequestdateIsValid){
		try {
			this.documentrequestdate = (org.apache.commons.lang.StringUtils.isBlank(documentrequestdate)) ? null : format.parse(documentrequestdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDocumentrequestdateAsRawString(java.lang.String documentrequestdate){
	this.documentrequestdateAsRawString = documentrequestdate;
}

public String getDocumentrequestdateAsRawString(){
return this.documentrequestdateAsRawString;
}
private Date smplandate;
public void setSmplandate(Date smplandate){
this.smplandate = smplandate;
}
public Date getSmplandate(){
return this.smplandate;
}
private boolean smplandateIsValid = false;
public void setSmplandateIsValid(boolean smplandateIsValid){
this.smplandateIsValid = smplandateIsValid;
}
public boolean isSmplandateIsValid(){
return this.smplandateIsValid;
}
private java.lang.String smplandateAsRawString ="";
public java.lang.String getSmplandateAsString(){
    return (smplandate== null) ? null : format.format(smplandate);
}
public void setSmplandateAsString(java.lang.String smplandate){
	this.smplandateIsValid = true;
	this.smplandateAsRawString = smplandate;
try{
		if(StringUtils.isNotBlank(smplandate)){ format.parse(smplandate);}
}catch (java.text.ParseException pe){
this.smplandateIsValid = false;
}
	if(smplandateIsValid){
		try {
			this.smplandate = (org.apache.commons.lang.StringUtils.isBlank(smplandate)) ? null : format.parse(smplandate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setSmplandateAsRawString(java.lang.String smplandate){
	this.smplandateAsRawString = smplandate;
}

public String getSmplandateAsRawString(){
return this.smplandateAsRawString;
}
private Date draftdate;
public void setDraftdate(Date draftdate){
this.draftdate = draftdate;
}
public Date getDraftdate(){
return this.draftdate;
}
private boolean draftdateIsValid = false;
public void setDraftdateIsValid(boolean draftdateIsValid){
this.draftdateIsValid = draftdateIsValid;
}
public boolean isDraftdateIsValid(){
return this.draftdateIsValid;
}
private java.lang.String draftdateAsRawString ="";
public java.lang.String getDraftdateAsString(){
    return (draftdate== null) ? null : format.format(draftdate);
}
public void setDraftdateAsString(java.lang.String draftdate){
	this.draftdateIsValid = true;
	this.draftdateAsRawString = draftdate;
try{
		if(StringUtils.isNotBlank(draftdate)){ format.parse(draftdate);}
}catch (java.text.ParseException pe){
this.draftdateIsValid = false;
}
	if(draftdateIsValid){
		try {
			this.draftdate = (org.apache.commons.lang.StringUtils.isBlank(draftdate)) ? null : format.parse(draftdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDraftdateAsRawString(java.lang.String draftdate){
	this.draftdateAsRawString = draftdate;
}

public String getDraftdateAsRawString(){
return this.draftdateAsRawString;
}
private Date finaldraftdate;
public void setFinaldraftdate(Date finaldraftdate){
this.finaldraftdate = finaldraftdate;
}
public Date getFinaldraftdate(){
return this.finaldraftdate;
}
private boolean finaldraftdateIsValid = false;
public void setFinaldraftdateIsValid(boolean finaldraftdateIsValid){
this.finaldraftdateIsValid = finaldraftdateIsValid;
}
public boolean isFinaldraftdateIsValid(){
return this.finaldraftdateIsValid;
}
private java.lang.String finaldraftdateAsRawString ="";
public java.lang.String getFinaldraftdateAsString(){
    return (finaldraftdate== null) ? null : format.format(finaldraftdate);
}
public void setFinaldraftdateAsString(java.lang.String finaldraftdate){
	this.finaldraftdateIsValid = true;
	this.finaldraftdateAsRawString = finaldraftdate;
try{
		if(StringUtils.isNotBlank(finaldraftdate)){ format.parse(finaldraftdate);}
}catch (java.text.ParseException pe){
this.finaldraftdateIsValid = false;
}
	if(finaldraftdateIsValid){
		try {
			this.finaldraftdate = (org.apache.commons.lang.StringUtils.isBlank(finaldraftdate)) ? null : format.parse(finaldraftdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setFinaldraftdateAsRawString(java.lang.String finaldraftdate){
	this.finaldraftdateAsRawString = finaldraftdate;
}

public String getFinaldraftdateAsRawString(){
return this.finaldraftdateAsRawString;
}
private Date deadline;
public void setDeadline(Date deadline){
this.deadline = deadline;
}
public Date getDeadline(){
return this.deadline;
}
private boolean deadlineIsValid = false;
public void setDeadlineIsValid(boolean deadlineIsValid){
this.deadlineIsValid = deadlineIsValid;
}
public boolean isDeadlineIsValid(){
return this.deadlineIsValid;
}
private java.lang.String deadlineAsRawString ="";
public java.lang.String getDeadlineAsString(){
    return (deadline== null) ? null : format.format(deadline);
}
public void setDeadlineAsString(java.lang.String deadline){
	this.deadlineIsValid = true;
	this.deadlineAsRawString = deadline;
try{
		if(StringUtils.isNotBlank(deadline)){ format.parse(deadline);}
}catch (java.text.ParseException pe){
this.deadlineIsValid = false;
}
	if(deadlineIsValid){
		try {
			this.deadline = (org.apache.commons.lang.StringUtils.isBlank(deadline)) ? null : format.parse(deadline);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDeadlineAsRawString(java.lang.String deadline){
	this.deadlineAsRawString = deadline;
}

public String getDeadlineAsRawString(){
return this.deadlineAsRawString;
}
private int bpage;
public void setBpage(int bpage){
this.bpage = bpage;
}
public int getBpage(){
return this.bpage;
}
private Date publishdate;
public void setPublishdate(Date publishdate){
this.publishdate = publishdate;
}
public Date getPublishdate(){
return this.publishdate;
}
private boolean publishdateIsValid = false;
public void setPublishdateIsValid(boolean publishdateIsValid){
this.publishdateIsValid = publishdateIsValid;
}
public boolean isPublishdateIsValid(){
return this.publishdateIsValid;
}
private java.lang.String publishdateAsRawString ="";
public java.lang.String getPublishdateAsString(){
    return (publishdate== null) ? null : format.format(publishdate);
}
public void setPublishdateAsString(java.lang.String publishdate){
	this.publishdateIsValid = true;
	this.publishdateAsRawString = publishdate;
try{
		if(StringUtils.isNotBlank(publishdate)){ format.parse(publishdate);}
}catch (java.text.ParseException pe){
this.publishdateIsValid = false;
}
	if(publishdateIsValid){
		try {
			this.publishdate = (org.apache.commons.lang.StringUtils.isBlank(publishdate)) ? null : format.parse(publishdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPublishdateAsRawString(java.lang.String publishdate){
	this.publishdateAsRawString = publishdate;
}

public String getPublishdateAsRawString(){
return this.publishdateAsRawString;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	current =false;
	mbg =false;
}
}
