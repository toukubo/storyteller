package net.ars.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class EventForm
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
private Date historydate;
public void setHistorydate(Date historydate){
this.historydate = historydate;
}
public Date getHistorydate(){
return this.historydate;
}
private boolean historydateIsValid = false;
public void setHistorydateIsValid(boolean historydateIsValid){
this.historydateIsValid = historydateIsValid;
}
public boolean isHistorydateIsValid(){
return this.historydateIsValid;
}
private java.lang.String historydateAsRawString ="";
public java.lang.String getHistorydateAsString(){
    return (historydate== null) ? null : format.format(historydate);
}
public void setHistorydateAsString(java.lang.String historydate){
	this.historydateIsValid = true;
	this.historydateAsRawString = historydate;
try{
		if(StringUtils.isNotBlank(historydate)){ format.parse(historydate);}
}catch (java.text.ParseException pe){
this.historydateIsValid = false;
}
	if(historydateIsValid){
		try {
			this.historydate = (org.apache.commons.lang.StringUtils.isBlank(historydate)) ? null : format.parse(historydate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setHistorydateAsRawString(java.lang.String historydate){
	this.historydateAsRawString = historydate;
}

public String getHistorydateAsRawString(){
return this.historydateAsRawString;
}
private String contents;
public void setContents(String contents){
this.contents = contents;
}
public String getContents(){
return this.contents;
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
