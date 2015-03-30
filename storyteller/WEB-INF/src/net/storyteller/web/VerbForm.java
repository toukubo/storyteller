package net.storyteller.beans;
import org.apache.struts.upload.FormFile;import java.util.Date;public class VerbForm
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
private boolean valid;
public void setValid(boolean valid){
this.valid = valid;
}
public boolean getValid(){
return this.valid;
}
private boolean twoobjects;
public void setTwoobjects(boolean twoobjects){
this.twoobjects = twoobjects;
}
public boolean getTwoobjects(){
return this.twoobjects;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
}
