package net.musicmug.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CDForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Date date;
public void setDate(Date date){
this.date = date;
}
public Date getDate(){
return this.date;
}
private boolean dateIsValid = false;
public void setDateIsValid(boolean dateIsValid){
this.dateIsValid = dateIsValid;
}
public boolean isDateIsValid(){
return this.dateIsValid;
}
private java.lang.String dateAsRawString ="";
public java.lang.String getDateAsString(){
    return (date== null) ? null : format.format(date);
}
public void setDateAsString(java.lang.String date){
	this.dateIsValid = true;
	this.dateAsRawString = date;
try{
		if(StringUtils.isNotBlank(date)){ format.parse(date);}
}catch (java.text.ParseException pe){
this.dateIsValid = false;
}
	if(dateIsValid){
		try {
			this.date = (org.apache.commons.lang.StringUtils.isBlank(date)) ? null : format.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateAsRawString(java.lang.String date){
	this.dateAsRawString = date;
}

public String getDateAsRawString(){
return this.dateAsRawString;
}
private int year;
public void setYear(int year){
this.year = year;
}
public int getYear(){
return this.year;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private boolean poplular;
public void setPoplular(boolean poplular){
this.poplular = poplular;
}
public boolean isPoplular(){
return this.poplular;
}
private int poplularity;
public void setPoplularity(int poplularity){
this.poplularity = poplularity;
}
public int getPoplularity(){
return this.poplularity;
}
private Integer artist;
public void setArtist(Integer artist){
this.artist = artist;
}
public Integer getArtist(){
return this.artist;
}
private String projectname;
public void setProjectname(String projectname){
this.projectname = projectname;
}
public String getProjectname(){
return this.projectname;
}
private String copywrite;
public void setCopywrite(String copywrite){
this.copywrite = copywrite;
}
public String getCopywrite(){
return this.copywrite;
}
private String productionpurpose;
public void setProductionpurpose(String productionpurpose){
this.productionpurpose = productionpurpose;
}
public String getProductionpurpose(){
return this.productionpurpose;
}
private String exposurehistory;
public void setExposurehistory(String exposurehistory){
this.exposurehistory = exposurehistory;
}
public String getExposurehistory(){
return this.exposurehistory;
}
private String credit;
public void setCredit(String credit){
this.credit = credit;
}
public String getCredit(){
return this.credit;
}
private boolean client;
public void setClient(boolean client){
this.client = client;
}
public boolean isClient(){
return this.client;
}
private String clientname;
public void setClientname(String clientname){
this.clientname = clientname;
}
public String getClientname(){
return this.clientname;
}
private String cilentrequest;
public void setCilentrequest(String cilentrequest){
this.cilentrequest = cilentrequest;
}
public String getCilentrequest(){
return this.cilentrequest;
}
private Date expiredate;
public void setExpiredate(Date expiredate){
this.expiredate = expiredate;
}
public Date getExpiredate(){
return this.expiredate;
}
private boolean expiredateIsValid = false;
public void setExpiredateIsValid(boolean expiredateIsValid){
this.expiredateIsValid = expiredateIsValid;
}
public boolean isExpiredateIsValid(){
return this.expiredateIsValid;
}
private java.lang.String expiredateAsRawString ="";
public java.lang.String getExpiredateAsString(){
    return (expiredate== null) ? null : format.format(expiredate);
}
public void setExpiredateAsString(java.lang.String expiredate){
	this.expiredateIsValid = true;
	this.expiredateAsRawString = expiredate;
try{
		if(StringUtils.isNotBlank(expiredate)){ format.parse(expiredate);}
}catch (java.text.ParseException pe){
this.expiredateIsValid = false;
}
	if(expiredateIsValid){
		try {
			this.expiredate = (org.apache.commons.lang.StringUtils.isBlank(expiredate)) ? null : format.parse(expiredate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setExpiredateAsRawString(java.lang.String expiredate){
	this.expiredateAsRawString = expiredate;
}

public String getExpiredateAsRawString(){
return this.expiredateAsRawString;
}
private boolean licensed;
public void setLicensed(boolean licensed){
this.licensed = licensed;
}
public boolean isLicensed(){
return this.licensed;
}
private String particulars;
public void setParticulars(String particulars){
this.particulars = particulars;
}
public String getParticulars(){
return this.particulars;
}
private String comments;
public void setComments(String comments){
this.comments = comments;
}
public String getComments(){
return this.comments;
}
private boolean licensingpossibleafterexpired;
public void setLicensingpossibleafterexpired(boolean licensingpossibleafterexpired){
this.licensingpossibleafterexpired = licensingpossibleafterexpired;
}
public boolean isLicensingpossibleafterexpired(){
return this.licensingpossibleafterexpired;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	poplular =false;
	client =false;
	licensed =false;
	licensingpossibleafterexpired =false;
}
}
