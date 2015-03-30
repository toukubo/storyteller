package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CampaignForm
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
private Boolean cached;
public void setCached(Boolean cached){
this.cached = cached;
}
public Boolean getCached(){
return this.cached;
}
private Integer image;
public void setImage(Integer image){
this.image = image;
}
public Integer getImage(){
return this.image;
}
private Integer theme;
public void setTheme(Integer theme){
this.theme = theme;
}
public Integer getTheme(){
return this.theme;
}
private String body;
public void setBody(String body){
this.body = body;
}
public String getBody(){
return this.body;
}
private Date publishDate;
public void setPublishDate(Date publishDate){
this.publishDate = publishDate;
}
public Date getPublishDate(){
return this.publishDate;
}
private boolean publishDateIsValid = false;
public void setPublishDateIsValid(boolean publishDateIsValid){
this.publishDateIsValid = publishDateIsValid;
}
public boolean isPublishDateIsValid(){
return this.publishDateIsValid;
}
private java.lang.String publishDateAsRawString ="";
public java.lang.String getPublishDateAsString(){
    return (publishDate== null) ? null : format.format(publishDate);
}
public void setPublishDateAsString(java.lang.String publishDate){
	this.publishDateIsValid = true;
	this.publishDateAsRawString = publishDate;
try{
		if(StringUtils.isNotBlank(publishDate)){ format.parse(publishDate);}
}catch (java.text.ParseException pe){
this.publishDateIsValid = false;
}
	if(publishDateIsValid){
		try {
			this.publishDate = (org.apache.commons.lang.StringUtils.isBlank(publishDate)) ? null : format.parse(publishDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPublishDateAsRawString(java.lang.String publishDate){
	this.publishDateAsRawString = publishDate;
}

public String getPublishDateAsRawString(){
return this.publishDateAsRawString;
}
private Date publishExpireDate;
public void setPublishExpireDate(Date publishExpireDate){
this.publishExpireDate = publishExpireDate;
}
public Date getPublishExpireDate(){
return this.publishExpireDate;
}
private boolean publishExpireDateIsValid = false;
public void setPublishExpireDateIsValid(boolean publishExpireDateIsValid){
this.publishExpireDateIsValid = publishExpireDateIsValid;
}
public boolean isPublishExpireDateIsValid(){
return this.publishExpireDateIsValid;
}
private java.lang.String publishExpireDateAsRawString ="";
public java.lang.String getPublishExpireDateAsString(){
    return (publishExpireDate== null) ? null : format.format(publishExpireDate);
}
public void setPublishExpireDateAsString(java.lang.String publishExpireDate){
	this.publishExpireDateIsValid = true;
	this.publishExpireDateAsRawString = publishExpireDate;
try{
		if(StringUtils.isNotBlank(publishExpireDate)){ format.parse(publishExpireDate);}
}catch (java.text.ParseException pe){
this.publishExpireDateIsValid = false;
}
	if(publishExpireDateIsValid){
		try {
			this.publishExpireDate = (org.apache.commons.lang.StringUtils.isBlank(publishExpireDate)) ? null : format.parse(publishExpireDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPublishExpireDateAsRawString(java.lang.String publishExpireDate){
	this.publishExpireDateAsRawString = publishExpireDate;
}

public String getPublishExpireDateAsRawString(){
return this.publishExpireDateAsRawString;
}
private Date validStartDate;
public void setValidStartDate(Date validStartDate){
this.validStartDate = validStartDate;
}
public Date getValidStartDate(){
return this.validStartDate;
}
private boolean validStartDateIsValid = false;
public void setValidStartDateIsValid(boolean validStartDateIsValid){
this.validStartDateIsValid = validStartDateIsValid;
}
public boolean isValidStartDateIsValid(){
return this.validStartDateIsValid;
}
private java.lang.String validStartDateAsRawString ="";
public java.lang.String getValidStartDateAsString(){
    return (validStartDate== null) ? null : format.format(validStartDate);
}
public void setValidStartDateAsString(java.lang.String validStartDate){
	this.validStartDateIsValid = true;
	this.validStartDateAsRawString = validStartDate;
try{
		if(StringUtils.isNotBlank(validStartDate)){ format.parse(validStartDate);}
}catch (java.text.ParseException pe){
this.validStartDateIsValid = false;
}
	if(validStartDateIsValid){
		try {
			this.validStartDate = (org.apache.commons.lang.StringUtils.isBlank(validStartDate)) ? null : format.parse(validStartDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setValidStartDateAsRawString(java.lang.String validStartDate){
	this.validStartDateAsRawString = validStartDate;
}

public String getValidStartDateAsRawString(){
return this.validStartDateAsRawString;
}
private Date validExpireDate;
public void setValidExpireDate(Date validExpireDate){
this.validExpireDate = validExpireDate;
}
public Date getValidExpireDate(){
return this.validExpireDate;
}
private boolean validExpireDateIsValid = false;
public void setValidExpireDateIsValid(boolean validExpireDateIsValid){
this.validExpireDateIsValid = validExpireDateIsValid;
}
public boolean isValidExpireDateIsValid(){
return this.validExpireDateIsValid;
}
private java.lang.String validExpireDateAsRawString ="";
public java.lang.String getValidExpireDateAsString(){
    return (validExpireDate== null) ? null : format.format(validExpireDate);
}
public void setValidExpireDateAsString(java.lang.String validExpireDate){
	this.validExpireDateIsValid = true;
	this.validExpireDateAsRawString = validExpireDate;
try{
		if(StringUtils.isNotBlank(validExpireDate)){ format.parse(validExpireDate);}
}catch (java.text.ParseException pe){
this.validExpireDateIsValid = false;
}
	if(validExpireDateIsValid){
		try {
			this.validExpireDate = (org.apache.commons.lang.StringUtils.isBlank(validExpireDate)) ? null : format.parse(validExpireDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setValidExpireDateAsRawString(java.lang.String validExpireDate){
	this.validExpireDateAsRawString = validExpireDate;
}

public String getValidExpireDateAsRawString(){
return this.validExpireDateAsRawString;
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
