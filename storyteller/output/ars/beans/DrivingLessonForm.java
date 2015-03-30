package net.ars.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class DrivingLessonForm
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
private Integer accident;
public void setAccident(Integer accident){
this.accident = accident;
}
public Integer getAccident(){
return this.accident;
}
private Date lessondate;
public void setLessondate(Date lessondate){
this.lessondate = lessondate;
}
public Date getLessondate(){
return this.lessondate;
}
private boolean lessondateIsValid = false;
public void setLessondateIsValid(boolean lessondateIsValid){
this.lessondateIsValid = lessondateIsValid;
}
public boolean isLessondateIsValid(){
return this.lessondateIsValid;
}
private java.lang.String lessondateAsRawString ="";
public java.lang.String getLessondateAsString(){
    return (lessondate== null) ? null : format.format(lessondate);
}
public void setLessondateAsString(java.lang.String lessondate){
	this.lessondateIsValid = true;
	this.lessondateAsRawString = lessondate;
try{
		if(StringUtils.isNotBlank(lessondate)){ format.parse(lessondate);}
}catch (java.text.ParseException pe){
this.lessondateIsValid = false;
}
	if(lessondateIsValid){
		try {
			this.lessondate = (org.apache.commons.lang.StringUtils.isBlank(lessondate)) ? null : format.parse(lessondate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setLessondateAsRawString(java.lang.String lessondate){
	this.lessondateAsRawString = lessondate;
}

public String getLessondateAsRawString(){
return this.lessondateAsRawString;
}
private String lessonplace;
public void setLessonplace(String lessonplace){
this.lessonplace = lessonplace;
}
public String getLessonplace(){
return this.lessonplace;
}
private String lessoncontent;
public void setLessoncontent(String lessoncontent){
this.lessoncontent = lessoncontent;
}
public String getLessoncontent(){
return this.lessoncontent;
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
