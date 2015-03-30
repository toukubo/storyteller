package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NotificationForm
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
private Integer user;
public void setUser(Integer user){
this.user = user;
}
public Integer getUser(){
return this.user;
}
private String message;
public void setMessage(String message){
this.message = message;
}
public String getMessage(){
return this.message;
}
private Integer activity;
public void setActivity(Integer activity){
this.activity = activity;
}
public Integer getActivity(){
return this.activity;
}
private Boolean reply;
public void setReply(Boolean reply){
this.reply = reply;
}
public Boolean getReply(){
return this.reply;
}
private Date notifieddate;
public void setNotifieddate(Date notifieddate){
this.notifieddate = notifieddate;
}
public Date getNotifieddate(){
return this.notifieddate;
}
private boolean notifieddateIsValid = false;
public void setNotifieddateIsValid(boolean notifieddateIsValid){
this.notifieddateIsValid = notifieddateIsValid;
}
public boolean isNotifieddateIsValid(){
return this.notifieddateIsValid;
}
private java.lang.String notifieddateAsRawString ="";
public java.lang.String getNotifieddateAsString(){
    return (notifieddate== null) ? null : format.format(notifieddate);
}
public void setNotifieddateAsString(java.lang.String notifieddate){
	this.notifieddateIsValid = true;
	this.notifieddateAsRawString = notifieddate;
try{
		if(StringUtils.isNotBlank(notifieddate)){ format.parse(notifieddate);}
}catch (java.text.ParseException pe){
this.notifieddateIsValid = false;
}
	if(notifieddateIsValid){
		try {
			this.notifieddate = (org.apache.commons.lang.StringUtils.isBlank(notifieddate)) ? null : format.parse(notifieddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setNotifieddateAsRawString(java.lang.String notifieddate){
	this.notifieddateAsRawString = notifieddate;
}

public String getNotifieddateAsRawString(){
return this.notifieddateAsRawString;
}
private Integer comment;
public void setComment(Integer comment){
this.comment = comment;
}
public Integer getComment(){
return this.comment;
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
