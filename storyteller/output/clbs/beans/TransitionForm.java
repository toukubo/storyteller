package net.clbs.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TransitionForm
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
private Date datetime;
public void setDatetime(Date datetime){
this.datetime = datetime;
}
public Date getDatetime(){
return this.datetime;
}
private boolean datetimeIsValid = false;
public void setDatetimeIsValid(boolean datetimeIsValid){
this.datetimeIsValid = datetimeIsValid;
}
public boolean isDatetimeIsValid(){
return this.datetimeIsValid;
}
private java.lang.String datetimeAsRawString ="";
public java.lang.String getDatetimeAsString(){
    return (datetime== null) ? null : format.format(datetime);
}
public void setDatetimeAsString(java.lang.String datetime){
	this.datetimeIsValid = true;
	this.datetimeAsRawString = datetime;
try{
		if(StringUtils.isNotBlank(datetime)){ format.parse(datetime);}
}catch (java.text.ParseException pe){
this.datetimeIsValid = false;
}
	if(datetimeIsValid){
		try {
			this.datetime = (org.apache.commons.lang.StringUtils.isBlank(datetime)) ? null : format.parse(datetime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDatetimeAsRawString(java.lang.String datetime){
	this.datetimeAsRawString = datetime;
}

public String getDatetimeAsRawString(){
return this.datetimeAsRawString;
}
private Integer bs;
public void setBs(Integer bs){
this.bs = bs;
}
public Integer getBs(){
return this.bs;
}
private boolean stop60min;
public void setStop60min(boolean stop60min){
this.stop60min = stop60min;
}
public boolean isStop60min(){
return this.stop60min;
}
private Integer operation;
public void setOperation(Integer operation){
this.operation = operation;
}
public Integer getOperation(){
return this.operation;
}
private Float base;
public void setBase(Float base){
this.base = base;
}
public Float getBase(){
return this.base;
}
private String comment;
public void setComment(String comment){
this.comment = comment;
}
public String getComment(){
return this.comment;
}
private Integer status;
public void setStatus(Integer status){
this.status = status;
}
public Integer getStatus(){
return this.status;
}
private Integer nexttime;
public void setNexttime(Integer nexttime){
this.nexttime = nexttime;
}
public Integer getNexttime(){
return this.nexttime;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	stop60min =false;
}
}
