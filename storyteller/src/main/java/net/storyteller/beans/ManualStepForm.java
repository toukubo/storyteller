package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ManualStepForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private String url;
public void setUrl(String url){
this.url = url;
}
public String getUrl(){
return this.url;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer sentence;
public void setSentence(Integer sentence){
this.sentence = sentence;
}
public Integer getSentence(){
return this.sentence;
}
private Integer j2eeStory;
public void setJ2eeStory(Integer j2eeStory){
this.j2eeStory = j2eeStory;
}
public Integer getJ2eeStory(){
return this.j2eeStory;
}
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private Integer outOfPattenSentence;
public void setOutOfPattenSentence(Integer outOfPattenSentence){
this.outOfPattenSentence = outOfPattenSentence;
}
public Integer getOutOfPattenSentence(){
return this.outOfPattenSentence;
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
