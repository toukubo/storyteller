package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PossibleDependanceForm
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
private int possibility;
public void setPossibility(int possibility){
this.possibility = possibility;
}
public int getPossibility(){
return this.possibility;
}
private Integer dependedTaskTemplate;
public void setDependedTaskTemplate(Integer dependedTaskTemplate){
this.dependedTaskTemplate = dependedTaskTemplate;
}
public Integer getDependedTaskTemplate(){
return this.dependedTaskTemplate;
}
private Integer dependingTaskTemplate;
public void setDependingTaskTemplate(Integer dependingTaskTemplate){
this.dependingTaskTemplate = dependingTaskTemplate;
}
public Integer getDependingTaskTemplate(){
return this.dependingTaskTemplate;
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
