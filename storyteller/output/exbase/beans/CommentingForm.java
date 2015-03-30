package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CommentingForm
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
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Integer excel;
public void setExcel(Integer excel){
this.excel = excel;
}
public Integer getExcel(){
return this.excel;
}
private Date createDate;
public void setCreateDate(Date createDate){
this.createDate = createDate;
}
public Date getCreateDate(){
return this.createDate;
}
private boolean createDateIsValid = false;
public void setCreateDateIsValid(boolean createDateIsValid){
this.createDateIsValid = createDateIsValid;
}
public boolean isCreateDateIsValid(){
return this.createDateIsValid;
}
private java.lang.String createDateAsRawString ="";
public java.lang.String getCreateDateAsString(){
    return (createDate== null) ? null : format.format(createDate);
}
public void setCreateDateAsString(java.lang.String createDate){
	this.createDateIsValid = true;
	this.createDateAsRawString = createDate;
try{
		if(StringUtils.isNotBlank(createDate)){ format.parse(createDate);}
}catch (java.text.ParseException pe){
this.createDateIsValid = false;
}
	if(createDateIsValid){
		try {
			this.createDate = (org.apache.commons.lang.StringUtils.isBlank(createDate)) ? null : format.parse(createDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreateDateAsRawString(java.lang.String createDate){
	this.createDateAsRawString = createDate;
}

public String getCreateDateAsRawString(){
return this.createDateAsRawString;
}
private String comment;
public void setComment(String comment){
this.comment = comment;
}
public String getComment(){
return this.comment;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
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
