package net.clbs.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class OperationForm
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
private Integer bolus;
public void setBolus(Integer bolus){
this.bolus = bolus;
}
public Integer getBolus(){
return this.bolus;
}
private Integer caseUser;
public void setCaseUser(Integer caseUser){
this.caseUser = caseUser;
}
public Integer getCaseUser(){
return this.caseUser;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String diseasename;
public void setDiseasename(String diseasename){
this.diseasename = diseasename;
}
public String getDiseasename(){
return this.diseasename;
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
