package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class GiftForm
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
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Boolean cached;
public void setCached(Boolean cached){
this.cached = cached;
}
public Boolean getCached(){
return this.cached;
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
private String catchPhrase;
public void setCatchPhrase(String catchPhrase){
this.catchPhrase = catchPhrase;
}
public String getCatchPhrase(){
return this.catchPhrase;
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
