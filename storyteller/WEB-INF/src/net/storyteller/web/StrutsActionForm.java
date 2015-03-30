package net.storyteller.beans;
import org.apache.struts.upload.FormFile;import java.util.Date;public class StrutsActionForm
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
private Integer sentence;
public void setSentence(Integer sentence){
this.sentence = sentence;
}
public Integer getSentence(){
return this.sentence;
}
private Integer targeteejsp;
public void setTargeteejsp(Integer targeteejsp){
this.targeteejsp = targeteejsp;
}
public Integer getTargeteejsp(){
return this.targeteejsp;
}
private Integer targeteeaction;
public void setTargeteeaction(Integer targeteeaction){
this.targeteeaction = targeteeaction;
}
public Integer getTargeteeaction(){
return this.targeteeaction;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
}
