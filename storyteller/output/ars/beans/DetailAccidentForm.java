package net.ars.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class DetailAccidentForm
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
private Date accidenttime;
public void setAccidenttime(Date accidenttime){
this.accidenttime = accidenttime;
}
public Date getAccidenttime(){
return this.accidenttime;
}
private boolean accidenttimeIsValid = false;
public void setAccidenttimeIsValid(boolean accidenttimeIsValid){
this.accidenttimeIsValid = accidenttimeIsValid;
}
public boolean isAccidenttimeIsValid(){
return this.accidenttimeIsValid;
}
private java.lang.String accidenttimeAsRawString ="";
public java.lang.String getAccidenttimeAsString(){
    return (accidenttime== null) ? null : format.format(accidenttime);
}
public void setAccidenttimeAsString(java.lang.String accidenttime){
	this.accidenttimeIsValid = true;
	this.accidenttimeAsRawString = accidenttime;
try{
		if(StringUtils.isNotBlank(accidenttime)){ format.parse(accidenttime);}
}catch (java.text.ParseException pe){
this.accidenttimeIsValid = false;
}
	if(accidenttimeIsValid){
		try {
			this.accidenttime = (org.apache.commons.lang.StringUtils.isBlank(accidenttime)) ? null : format.parse(accidenttime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setAccidenttimeAsRawString(java.lang.String accidenttime){
	this.accidenttimeAsRawString = accidenttime;
}

public String getAccidenttimeAsRawString(){
return this.accidenttimeAsRawString;
}
private String accidentdetail;
public void setAccidentdetail(String accidentdetail){
this.accidentdetail = accidentdetail;
}
public String getAccidentdetail(){
return this.accidentdetail;
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
