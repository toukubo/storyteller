package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExcelTemplateForm
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
private String excelversion;
public void setExcelversion(String excelversion){
this.excelversion = excelversion;
}
public String getExcelversion(){
return this.excelversion;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer category;
public void setCategory(Integer category){
this.category = category;
}
public Integer getCategory(){
return this.category;
}
private Integer attachment;
public void setAttachment(Integer attachment){
this.attachment = attachment;
}
public Integer getAttachment(){
return this.attachment;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private boolean pretruncate;
public void setPretruncate(boolean pretruncate){
this.pretruncate = pretruncate;
}
public boolean isPretruncate(){
return this.pretruncate;
}
private Date uploadDate;
public void setUploadDate(Date uploadDate){
this.uploadDate = uploadDate;
}
public Date getUploadDate(){
return this.uploadDate;
}
private boolean uploadDateIsValid = false;
public void setUploadDateIsValid(boolean uploadDateIsValid){
this.uploadDateIsValid = uploadDateIsValid;
}
public boolean isUploadDateIsValid(){
return this.uploadDateIsValid;
}
private java.lang.String uploadDateAsRawString ="";
public java.lang.String getUploadDateAsString(){
    return (uploadDate== null) ? null : format.format(uploadDate);
}
public void setUploadDateAsString(java.lang.String uploadDate){
	this.uploadDateIsValid = true;
	this.uploadDateAsRawString = uploadDate;
try{
		if(StringUtils.isNotBlank(uploadDate)){ format.parse(uploadDate);}
}catch (java.text.ParseException pe){
this.uploadDateIsValid = false;
}
	if(uploadDateIsValid){
		try {
			this.uploadDate = (org.apache.commons.lang.StringUtils.isBlank(uploadDate)) ? null : format.parse(uploadDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setUploadDateAsRawString(java.lang.String uploadDate){
	this.uploadDateAsRawString = uploadDate;
}

public String getUploadDateAsRawString(){
return this.uploadDateAsRawString;
}
private boolean testing;
public void setTesting(boolean testing){
this.testing = testing;
}
public boolean isTesting(){
return this.testing;
}
private String updateMethod;
public void setUpdateMethod(String updateMethod){
this.updateMethod = updateMethod;
}
public String getUpdateMethod(){
return this.updateMethod;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
	pretruncate =false;
	testing =false;
}
}
