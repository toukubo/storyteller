package net.startbahn.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MessageForm
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
private Integer fromid;
public void setFromid(Integer fromid){
this.fromid = fromid;
}
public Integer getFromid(){
return this.fromid;
}
private Integer toid;
public void setToid(Integer toid){
this.toid = toid;
}
public Integer getToid(){
return this.toid;
}
private String frommodel;
public void setFrommodel(String frommodel){
this.frommodel = frommodel;
}
public String getFrommodel(){
return this.frommodel;
}
private String tomodel;
public void setTomodel(String tomodel){
this.tomodel = tomodel;
}
public String getTomodel(){
return this.tomodel;
}
private boolean system;
public void setSystem(boolean system){
this.system = system;
}
public boolean isSystem(){
return this.system;
}
private Integer toPublicUser;
public void setToPublicUser(Integer toPublicUser){
this.toPublicUser = toPublicUser;
}
public Integer getToPublicUser(){
return this.toPublicUser;
}
private Integer fromPubilcUser;
public void setFromPubilcUser(Integer fromPubilcUser){
this.fromPubilcUser = fromPubilcUser;
}
public Integer getFromPubilcUser(){
return this.fromPubilcUser;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
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
private boolean draft;
public void setDraft(boolean draft){
this.draft = draft;
}
public boolean isDraft(){
return this.draft;
}
private boolean drafts;
public void setDrafts(boolean drafts){
this.drafts = drafts;
}
public boolean isDrafts(){
return this.drafts;
}
private boolean read;
public void setRead(boolean read){
this.read = read;
}
public boolean isRead(){
return this.read;
}
private boolean isread;
public void setIsread(boolean isread){
this.isread = isread;
}
public boolean isIsread(){
return this.isread;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	system =false;
	draft =false;
	drafts =false;
	read =false;
	isread =false;
}
}
