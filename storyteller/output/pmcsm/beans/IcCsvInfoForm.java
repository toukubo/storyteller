package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class IcCsvInfoForm
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
private Integer manual;
public void setManual(Integer manual){
this.manual = manual;
}
public Integer getManual(){
return this.manual;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String filename;
public void setFilename(String filename){
this.filename = filename;
}
public String getFilename(){
return this.filename;
}
private int page;
public void setPage(int page){
this.page = page;
}
public int getPage(){
return this.page;
}
private String model;
public void setModel(String model){
this.model = model;
}
public String getModel(){
return this.model;
}
private String acttime;
public void setActtime(String acttime){
this.acttime = acttime;
}
public String getActtime(){
return this.acttime;
}
private Date actdate;
public void setActdate(Date actdate){
this.actdate = actdate;
}
public Date getActdate(){
return this.actdate;
}
private boolean actdateIsValid = false;
public void setActdateIsValid(boolean actdateIsValid){
this.actdateIsValid = actdateIsValid;
}
public boolean isActdateIsValid(){
return this.actdateIsValid;
}
private java.lang.String actdateAsRawString ="";
public java.lang.String getActdateAsString(){
    return (actdate== null) ? null : format.format(actdate);
}
public void setActdateAsString(java.lang.String actdate){
	this.actdateIsValid = true;
	this.actdateAsRawString = actdate;
try{
		if(StringUtils.isNotBlank(actdate)){ format.parse(actdate);}
}catch (java.text.ParseException pe){
this.actdateIsValid = false;
}
	if(actdateIsValid){
		try {
			this.actdate = (org.apache.commons.lang.StringUtils.isBlank(actdate)) ? null : format.parse(actdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setActdateAsRawString(java.lang.String actdate){
	this.actdateAsRawString = actdate;
}

public String getActdateAsRawString(){
return this.actdateAsRawString;
}
private String je;
public void setJe(String je){
this.je = je;
}
public String getJe(){
return this.je;
}
private String kankatu;
public void setKankatu(String kankatu){
this.kankatu = kankatu;
}
public String getKankatu(){
return this.kankatu;
}
private String youryou;
public void setYouryou(String youryou){
this.youryou = youryou;
}
public String getYouryou(){
return this.youryou;
}
private String icno;
public void setIcno(String icno){
this.icno = icno;
}
public String getIcno(){
return this.icno;
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
