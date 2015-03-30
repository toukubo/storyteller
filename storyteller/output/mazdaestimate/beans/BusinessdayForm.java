package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class BusinessdayForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer month;
public void setMonth(Integer month){
this.month = month;
}
public Integer getMonth(){
return this.month;
}
private Integer year;
public void setYear(Integer year){
this.year = year;
}
public Integer getYear(){
return this.year;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Boolean usedcar;
public void setUsedcar(Boolean usedcar){
this.usedcar = usedcar;
}
public Boolean getUsedcar(){
return this.usedcar;
}
private Date fromdate;
public void setFromdate(Date fromdate){
this.fromdate = fromdate;
}
public Date getFromdate(){
return this.fromdate;
}
private boolean fromdateIsValid = false;
public void setFromdateIsValid(boolean fromdateIsValid){
this.fromdateIsValid = fromdateIsValid;
}
public boolean isFromdateIsValid(){
return this.fromdateIsValid;
}
private java.lang.String fromdateAsRawString ="";
public java.lang.String getFromdateAsString(){
    return (fromdate== null) ? null : format.format(fromdate);
}
public void setFromdateAsString(java.lang.String fromdate){
	this.fromdateIsValid = true;
	this.fromdateAsRawString = fromdate;
try{
		if(StringUtils.isNotBlank(fromdate)){ format.parse(fromdate);}
}catch (java.text.ParseException pe){
this.fromdateIsValid = false;
}
	if(fromdateIsValid){
		try {
			this.fromdate = (org.apache.commons.lang.StringUtils.isBlank(fromdate)) ? null : format.parse(fromdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setFromdateAsRawString(java.lang.String fromdate){
	this.fromdateAsRawString = fromdate;
}

public String getFromdateAsRawString(){
return this.fromdateAsRawString;
}
private Date todate;
public void setTodate(Date todate){
this.todate = todate;
}
public Date getTodate(){
return this.todate;
}
private boolean todateIsValid = false;
public void setTodateIsValid(boolean todateIsValid){
this.todateIsValid = todateIsValid;
}
public boolean isTodateIsValid(){
return this.todateIsValid;
}
private java.lang.String todateAsRawString ="";
public java.lang.String getTodateAsString(){
    return (todate== null) ? null : format.format(todate);
}
public void setTodateAsString(java.lang.String todate){
	this.todateIsValid = true;
	this.todateAsRawString = todate;
try{
		if(StringUtils.isNotBlank(todate)){ format.parse(todate);}
}catch (java.text.ParseException pe){
this.todateIsValid = false;
}
	if(todateIsValid){
		try {
			this.todate = (org.apache.commons.lang.StringUtils.isBlank(todate)) ? null : format.parse(todate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTodateAsRawString(java.lang.String todate){
	this.todateAsRawString = todate;
}

public String getTodateAsRawString(){
return this.todateAsRawString;
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
