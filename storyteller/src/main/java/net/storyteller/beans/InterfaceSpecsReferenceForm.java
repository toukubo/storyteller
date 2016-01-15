package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class InterfaceSpecsReferenceForm
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
private Integer sentence;
public void setSentence(Integer sentence){
this.sentence = sentence;
}
public Integer getSentence(){
return this.sentence;
}
private Integer interfaceSpecs;
public void setInterfaceSpecs(Integer interfaceSpecs){
this.interfaceSpecs = interfaceSpecs;
}
public Integer getInterfaceSpecs(){
return this.interfaceSpecs;
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
