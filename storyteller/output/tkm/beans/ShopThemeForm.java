package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ShopThemeForm
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
private Integer theme;
public void setTheme(Integer theme){
this.theme = theme;
}
public Integer getTheme(){
return this.theme;
}
private String body;
public void setBody(String body){
this.body = body;
}
public String getBody(){
return this.body;
}
private Integer genre;
public void setGenre(Integer genre){
this.genre = genre;
}
public Integer getGenre(){
return this.genre;
}
private Integer shop;
public void setShop(Integer shop){
this.shop = shop;
}
public Integer getShop(){
return this.shop;
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
private String catchphrase;
public void setCatchphrase(String catchphrase){
this.catchphrase = catchphrase;
}
public String getCatchphrase(){
return this.catchphrase;
}
private String columnTitle;
public void setColumnTitle(String columnTitle){
this.columnTitle = columnTitle;
}
public String getColumnTitle(){
return this.columnTitle;
}
private String columnBody;
public void setColumnBody(String columnBody){
this.columnBody = columnBody;
}
public String getColumnBody(){
return this.columnBody;
}
private Integer firstImage;
public void setFirstImage(Integer firstImage){
this.firstImage = firstImage;
}
public Integer getFirstImage(){
return this.firstImage;
}
private Integer secondImage;
public void setSecondImage(Integer secondImage){
this.secondImage = secondImage;
}
public Integer getSecondImage(){
return this.secondImage;
}
private Integer thirdImage;
public void setThirdImage(Integer thirdImage){
this.thirdImage = thirdImage;
}
public Integer getThirdImage(){
return this.thirdImage;
}
private Integer fourthImage;
public void setFourthImage(Integer fourthImage){
this.fourthImage = fourthImage;
}
public Integer getFourthImage(){
return this.fourthImage;
}
private Integer fifthImage;
public void setFifthImage(Integer fifthImage){
this.fifthImage = fifthImage;
}
public Integer getFifthImage(){
return this.fifthImage;
}
private Integer columnImage;
public void setColumnImage(Integer columnImage){
this.columnImage = columnImage;
}
public Integer getColumnImage(){
return this.columnImage;
}
private Integer area;
public void setArea(Integer area){
this.area = area;
}
public Integer getArea(){
return this.area;
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
