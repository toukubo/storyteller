package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExcelVersionForm
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
private Integer excel;
public void setExcel(Integer excel){
this.excel = excel;
}
public Integer getExcel(){
return this.excel;
}
private Date uploaddate;
public void setUploaddate(Date uploaddate){
this.uploaddate = uploaddate;
}
public Date getUploaddate(){
return this.uploaddate;
}
private boolean uploaddateIsValid = false;
public void setUploaddateIsValid(boolean uploaddateIsValid){
this.uploaddateIsValid = uploaddateIsValid;
}
public boolean isUploaddateIsValid(){
return this.uploaddateIsValid;
}
private java.lang.String uploaddateAsRawString ="";
public java.lang.String getUploaddateAsString(){
    return (uploaddate== null) ? null : format.format(uploaddate);
}
public void setUploaddateAsString(java.lang.String uploaddate){
	this.uploaddateIsValid = true;
	this.uploaddateAsRawString = uploaddate;
try{
		if(StringUtils.isNotBlank(uploaddate)){ format.parse(uploaddate);}
}catch (java.text.ParseException pe){
this.uploaddateIsValid = false;
}
	if(uploaddateIsValid){
		try {
			this.uploaddate = (org.apache.commons.lang.StringUtils.isBlank(uploaddate)) ? null : format.parse(uploaddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setUploaddateAsRawString(java.lang.String uploaddate){
	this.uploaddateAsRawString = uploaddate;
}

public String getUploaddateAsRawString(){
return this.uploaddateAsRawString;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer attachment;
public void setAttachment(Integer attachment){
this.attachment = attachment;
}
public Integer getAttachment(){
return this.attachment;
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
