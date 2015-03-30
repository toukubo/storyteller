package net.autonoding.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ContextCausalRelationForm
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
private Integer asdepender;
public void setAsdepender(Integer asdepender){
this.asdepender = asdepender;
}
public Integer getAsdepender(){
return this.asdepender;
}
private Integer asdependee;
public void setAsdependee(Integer asdependee){
this.asdependee = asdependee;
}
public Integer getAsdependee(){
return this.asdependee;
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
