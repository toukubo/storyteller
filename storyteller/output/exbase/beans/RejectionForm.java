package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class RejectionForm
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
private Integer activity;
public void setActivity(Integer activity){
this.activity = activity;
}
public Integer getActivity(){
return this.activity;
}
private Integer targetActivity;
public void setTargetActivity(Integer targetActivity){
this.targetActivity = targetActivity;
}
public Integer getTargetActivity(){
return this.targetActivity;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private Integer attachment;
public void setAttachment(Integer attachment){
this.attachment = attachment;
}
public Integer getAttachment(){
return this.attachment;
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
