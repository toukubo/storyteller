package net.storyteller.beans;
import org.apache.struts.upload.FormFile;import java.util.Date;public class ComponeyForm
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
private String responsible;
public void setResponsible(String responsible){
this.responsible = responsible;
}
public String getResponsible(){
return this.responsible;
}
private boolean attacklist;
public void setAttacklist(boolean attacklist){
this.attacklist = attacklist;
}
public boolean getAttacklist(){
return this.attacklist;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
}
