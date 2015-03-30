package net.inspire.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class EventForm
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
private String tag;
public void setTag(String tag){
this.tag = tag;
}
public String getTag(){
return this.tag;
}
private Integer publish;
public void setPublish(Integer publish){
this.publish = publish;
}
public Integer getPublish(){
return this.publish;
}
private Integer venue;
public void setVenue(Integer venue){
this.venue = venue;
}
public Integer getVenue(){
return this.venue;
}
private Date end;
public void setEnd(Date end){
this.end = end;
}
public Date getEnd(){
return this.end;
}
private boolean endIsValid = false;
public void setEndIsValid(boolean endIsValid){
this.endIsValid = endIsValid;
}
public boolean isEndIsValid(){
return this.endIsValid;
}
private java.lang.String endAsRawString ="";
public java.lang.String getEndAsString(){
    return (end== null) ? null : format.format(end);
}
public void setEndAsString(java.lang.String end){
	this.endIsValid = true;
	this.endAsRawString = end;
try{
		if(StringUtils.isNotBlank(end)){ format.parse(end);}
}catch (java.text.ParseException pe){
this.endIsValid = false;
}
	if(endIsValid){
		try {
			this.end = (org.apache.commons.lang.StringUtils.isBlank(end)) ? null : format.parse(end);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setEndAsRawString(java.lang.String end){
	this.endAsRawString = end;
}

public String getEndAsRawString(){
return this.endAsRawString;
}
private Date start;
public void setStart(Date start){
this.start = start;
}
public Date getStart(){
return this.start;
}
private boolean startIsValid = false;
public void setStartIsValid(boolean startIsValid){
this.startIsValid = startIsValid;
}
public boolean isStartIsValid(){
return this.startIsValid;
}
private java.lang.String startAsRawString ="";
public java.lang.String getStartAsString(){
    return (start== null) ? null : format.format(start);
}
public void setStartAsString(java.lang.String start){
	this.startIsValid = true;
	this.startAsRawString = start;
try{
		if(StringUtils.isNotBlank(start)){ format.parse(start);}
}catch (java.text.ParseException pe){
this.startIsValid = false;
}
	if(startIsValid){
		try {
			this.start = (org.apache.commons.lang.StringUtils.isBlank(start)) ? null : format.parse(start);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setStartAsRawString(java.lang.String start){
	this.startAsRawString = start;
}

public String getStartAsRawString(){
return this.startAsRawString;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
