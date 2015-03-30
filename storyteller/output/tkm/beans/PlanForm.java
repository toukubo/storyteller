package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PlanForm
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
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Boolean cached;
public void setCached(Boolean cached){
this.cached = cached;
}
public Boolean getCached(){
return this.cached;
}
private Date creationDate;
public void setCreationDate(Date creationDate){
this.creationDate = creationDate;
}
public Date getCreationDate(){
return this.creationDate;
}
private boolean creationDateIsValid = false;
public void setCreationDateIsValid(boolean creationDateIsValid){
this.creationDateIsValid = creationDateIsValid;
}
public boolean isCreationDateIsValid(){
return this.creationDateIsValid;
}
private java.lang.String creationDateAsRawString ="";
public java.lang.String getCreationDateAsString(){
    return (creationDate== null) ? null : format.format(creationDate);
}
public void setCreationDateAsString(java.lang.String creationDate){
	this.creationDateIsValid = true;
	this.creationDateAsRawString = creationDate;
try{
		if(StringUtils.isNotBlank(creationDate)){ format.parse(creationDate);}
}catch (java.text.ParseException pe){
this.creationDateIsValid = false;
}
	if(creationDateIsValid){
		try {
			this.creationDate = (org.apache.commons.lang.StringUtils.isBlank(creationDate)) ? null : format.parse(creationDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreationDateAsRawString(java.lang.String creationDate){
	this.creationDateAsRawString = creationDate;
}

public String getCreationDateAsRawString(){
return this.creationDateAsRawString;
}
private Integer price;
public void setPrice(Integer price){
this.price = price;
}
public Integer getPrice(){
return this.price;
}
private Integer image;
public void setImage(Integer image){
this.image = image;
}
public Integer getImage(){
return this.image;
}
private String body;
public void setBody(String body){
this.body = body;
}
public String getBody(){
return this.body;
}
private Integer point;
public void setPoint(Integer point){
this.point = point;
}
public Integer getPoint(){
return this.point;
}
private Date publishDate;
public void setPublishDate(Date publishDate){
this.publishDate = publishDate;
}
public Date getPublishDate(){
return this.publishDate;
}
private boolean publishDateIsValid = false;
public void setPublishDateIsValid(boolean publishDateIsValid){
this.publishDateIsValid = publishDateIsValid;
}
public boolean isPublishDateIsValid(){
return this.publishDateIsValid;
}
private java.lang.String publishDateAsRawString ="";
public java.lang.String getPublishDateAsString(){
    return (publishDate== null) ? null : format.format(publishDate);
}
public void setPublishDateAsString(java.lang.String publishDate){
	this.publishDateIsValid = true;
	this.publishDateAsRawString = publishDate;
try{
		if(StringUtils.isNotBlank(publishDate)){ format.parse(publishDate);}
}catch (java.text.ParseException pe){
this.publishDateIsValid = false;
}
	if(publishDateIsValid){
		try {
			this.publishDate = (org.apache.commons.lang.StringUtils.isBlank(publishDate)) ? null : format.parse(publishDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPublishDateAsRawString(java.lang.String publishDate){
	this.publishDateAsRawString = publishDate;
}

public String getPublishDateAsRawString(){
return this.publishDateAsRawString;
}
private Integer shopTheme;
public void setShopTheme(Integer shopTheme){
this.shopTheme = shopTheme;
}
public Integer getShopTheme(){
return this.shopTheme;
}
private Boolean recommended;
public void setRecommended(Boolean recommended){
this.recommended = recommended;
}
public Boolean getRecommended(){
return this.recommended;
}
private String catchphrase;
public void setCatchphrase(String catchphrase){
this.catchphrase = catchphrase;
}
public String getCatchphrase(){
return this.catchphrase;
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
