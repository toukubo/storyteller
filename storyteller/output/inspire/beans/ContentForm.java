package net.inspire.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ContentForm
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
private Date create;
public void setCreate(Date create){
this.create = create;
}
public Date getCreate(){
return this.create;
}
private boolean createIsValid = false;
public void setCreateIsValid(boolean createIsValid){
this.createIsValid = createIsValid;
}
public boolean isCreateIsValid(){
return this.createIsValid;
}
private java.lang.String createAsRawString ="";
public java.lang.String getCreateAsString(){
    return (create== null) ? null : format.format(create);
}
public void setCreateAsString(java.lang.String create){
	this.createIsValid = true;
	this.createAsRawString = create;
try{
		if(StringUtils.isNotBlank(create)){ format.parse(create);}
}catch (java.text.ParseException pe){
this.createIsValid = false;
}
	if(createIsValid){
		try {
			this.create = (org.apache.commons.lang.StringUtils.isBlank(create)) ? null : format.parse(create);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreateAsRawString(java.lang.String create){
	this.createAsRawString = create;
}

public String getCreateAsRawString(){
return this.createAsRawString;
}
private String contenturl;
public void setContenturl(String contenturl){
this.contenturl = contenturl;
}
public String getContenturl(){
return this.contenturl;
}
private String contentId;
public void setContentId(String contentId){
this.contentId = contentId;
}
public String getContentId(){
return this.contentId;
}
private Integer attend;
public void setAttend(Integer attend){
this.attend = attend;
}
public Integer getAttend(){
return this.attend;
}
private Integer serviceUse;
public void setServiceUse(Integer serviceUse){
this.serviceUse = serviceUse;
}
public Integer getServiceUse(){
return this.serviceUse;
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
