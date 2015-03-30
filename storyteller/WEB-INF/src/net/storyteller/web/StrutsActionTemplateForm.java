package net.storyteller.beans;
import org.apache.struts.upload.FormFile;import java.util.Date;public class StrutsActionTemplateForm
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
private Integer targeteeaction;
public void setTargeteeaction(Integer targeteeaction){
this.targeteeaction = targeteeaction;
}
public Integer getTargeteeaction(){
return this.targeteeaction;
}
private Integer verb;
public void setVerb(Integer verb){
this.verb = verb;
}
public Integer getVerb(){
return this.verb;
}
private String template;
public void setTemplate(String template){
this.template = template;
}
public String getTemplate(){
return this.template;
}
private String nametemplate;
public void setNametemplate(String nametemplate){
this.nametemplate = nametemplate;
}
public String getNametemplate(){
return this.nametemplate;
}
private Integer jspTemplate;
public void setJspTemplate(Integer jspTemplate){
this.jspTemplate = jspTemplate;
}
public Integer getJspTemplate(){
return this.jspTemplate;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
}
