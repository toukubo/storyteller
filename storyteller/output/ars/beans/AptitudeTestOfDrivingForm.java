package net.ars.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AptitudeTestOfDrivingForm
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
private Date testdate;
public void setTestdate(Date testdate){
this.testdate = testdate;
}
public Date getTestdate(){
return this.testdate;
}
private boolean testdateIsValid = false;
public void setTestdateIsValid(boolean testdateIsValid){
this.testdateIsValid = testdateIsValid;
}
public boolean isTestdateIsValid(){
return this.testdateIsValid;
}
private java.lang.String testdateAsRawString ="";
public java.lang.String getTestdateAsString(){
    return (testdate== null) ? null : format.format(testdate);
}
public void setTestdateAsString(java.lang.String testdate){
	this.testdateIsValid = true;
	this.testdateAsRawString = testdate;
try{
		if(StringUtils.isNotBlank(testdate)){ format.parse(testdate);}
}catch (java.text.ParseException pe){
this.testdateIsValid = false;
}
	if(testdateIsValid){
		try {
			this.testdate = (org.apache.commons.lang.StringUtils.isBlank(testdate)) ? null : format.parse(testdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTestdateAsRawString(java.lang.String testdate){
	this.testdateAsRawString = testdate;
}

public String getTestdateAsRawString(){
return this.testdateAsRawString;
}
private String testplace;
public void setTestplace(String testplace){
this.testplace = testplace;
}
public String getTestplace(){
return this.testplace;
}
private String individualguidance;
public void setIndividualguidance(String individualguidance){
this.individualguidance = individualguidance;
}
public String getIndividualguidance(){
return this.individualguidance;
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
