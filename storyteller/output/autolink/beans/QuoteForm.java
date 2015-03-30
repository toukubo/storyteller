package net.autolink.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class QuoteForm
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
private String sentence;
public void setSentence(String sentence){
this.sentence = sentence;
}
public String getSentence(){
return this.sentence;
}
private Integer keyword;
public void setKeyword(Integer keyword){
this.keyword = keyword;
}
public Integer getKeyword(){
return this.keyword;
}
private boolean studiovoice;
public void setStudiovoice(boolean studiovoice){
this.studiovoice = studiovoice;
}
public boolean isStudiovoice(){
return this.studiovoice;
}
private Integer post;
public void setPost(Integer post){
this.post = post;
}
public Integer getPost(){
return this.post;
}
private String source;
public void setSource(String source){
this.source = source;
}
public String getSource(){
return this.source;
}
private boolean image;
public void setImage(boolean image){
this.image = image;
}
public boolean isImage(){
return this.image;
}
private boolean banned;
public void setBanned(boolean banned){
this.banned = banned;
}
public boolean isBanned(){
return this.banned;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	studiovoice =false;
	image =false;
	banned =false;
}
}
