package net.crm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MailmagForm
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
private boolean keitai;
public void setKeitai(boolean keitai){
this.keitai = keitai;
}
public boolean isKeitai(){
return this.keitai;
}
private boolean reserved;
public void setReserved(boolean reserved){
this.reserved = reserved;
}
public boolean isReserved(){
return this.reserved;
}
private Date reservationdate;
public void setReservationdate(Date reservationdate){
this.reservationdate = reservationdate;
}
public Date getReservationdate(){
return this.reservationdate;
}
private boolean reservationdateIsValid = false;
public void setReservationdateIsValid(boolean reservationdateIsValid){
this.reservationdateIsValid = reservationdateIsValid;
}
public boolean isReservationdateIsValid(){
return this.reservationdateIsValid;
}
private java.lang.String reservationdateAsRawString ="";
public java.lang.String getReservationdateAsString(){
    return (reservationdate== null) ? null : format.format(reservationdate);
}
public void setReservationdateAsString(java.lang.String reservationdate){
	this.reservationdateIsValid = true;
	this.reservationdateAsRawString = reservationdate;
try{
		if(StringUtils.isNotBlank(reservationdate)){ format.parse(reservationdate);}
}catch (java.text.ParseException pe){
this.reservationdateIsValid = false;
}
	if(reservationdateIsValid){
		try {
			this.reservationdate = (org.apache.commons.lang.StringUtils.isBlank(reservationdate)) ? null : format.parse(reservationdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setReservationdateAsRawString(java.lang.String reservationdate){
	this.reservationdateAsRawString = reservationdate;
}

public String getReservationdateAsRawString(){
return this.reservationdateAsRawString;
}
private boolean devidedlyderivered;
public void setDevidedlyderivered(boolean devidedlyderivered){
this.devidedlyderivered = devidedlyderivered;
}
public boolean isDevidedlyderivered(){
return this.devidedlyderivered;
}
private int poplularity;
public void setPoplularity(int poplularity){
this.poplularity = poplularity;
}
public int getPoplularity(){
return this.poplularity;
}
private boolean recentlyadded;
public void setRecentlyadded(boolean recentlyadded){
this.recentlyadded = recentlyadded;
}
public boolean isRecentlyadded(){
return this.recentlyadded;
}
private String language;
public void setLanguage(String language){
this.language = language;
}
public String getLanguage(){
return this.language;
}
private Integer campaign;
public void setCampaign(Integer campaign){
this.campaign = campaign;
}
public Integer getCampaign(){
return this.campaign;
}
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	keitai =false;
	reserved =false;
	devidedlyderivered =false;
	recentlyadded =false;
}
}
