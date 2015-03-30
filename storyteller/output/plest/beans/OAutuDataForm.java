package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class OAutuDataForm
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
private String oauthid;
public void setOauthid(String oauthid){
this.oauthid = oauthid;
}
public String getOauthid(){
return this.oauthid;
}
private Integer plestid;
public void setPlestid(Integer plestid){
this.plestid = plestid;
}
public Integer getPlestid(){
return this.plestid;
}
private Integer oAuthDataType;
public void setOAuthDataType(Integer oAuthDataType){
this.oAuthDataType = oAuthDataType;
}
public Integer getOAuthDataType(){
return this.oAuthDataType;
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
private boolean hidden;
public void setHidden(boolean hidden){
this.hidden = hidden;
}
public boolean isHidden(){
return this.hidden;
}
private Integer serviceDataType;
public void setServiceDataType(Integer serviceDataType){
this.serviceDataType = serviceDataType;
}
public Integer getServiceDataType(){
return this.serviceDataType;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	hidden =false;
}
}
