package net.gasbooknet.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NewsForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Date date;
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
private Integer country;
public void setCountry(Integer country){
this.country = country;
}
public Integer getCountry(){
return this.country;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Integer c;
public void setC(Integer c){
this.c = c;
}
public Integer getC(){
return this.c;
}
private boolean recentlyadded;
public void setRecentlyadded(boolean recentlyadded){
this.recentlyadded = recentlyadded;
}
public boolean isRecentlyadded(){
return this.recentlyadded;
}
private int poplularity;
public void setPoplularity(int poplularity){
this.poplularity = poplularity;
}
public int getPoplularity(){
return this.poplularity;
}
private Integer genre;
public void setGenre(Integer genre){
this.genre = genre;
}
public Integer getGenre(){
return this.genre;
}
private Integer artist;
public void setArtist(Integer artist){
this.artist = artist;
}
public Integer getArtist(){
return this.artist;
}
private Integer b;
public void setB(Integer b){
this.b = b;
}
public Integer getB(){
return this.b;
}
private Integer a;
public void setA(Integer a){
this.a = a;
}
public Integer getA(){
return this.a;
}
private Integer newsType;
public void setNewsType(Integer newsType){
this.newsType = newsType;
}
public Integer getNewsType(){
return this.newsType;
}
private Integer newsSource;
public void setNewsSource(Integer newsSource){
this.newsSource = newsSource;
}
public Integer getNewsSource(){
return this.newsSource;
}
private Integer newsFeature;
public void setNewsFeature(Integer newsFeature){
this.newsFeature = newsFeature;
}
public Integer getNewsFeature(){
return this.newsFeature;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	recentlyadded =false;
}
}
