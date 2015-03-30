package net.gasbooknet.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class WorkAttachmentPreviewForm
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
private Integer workAttachment;
public void setWorkAttachment(Integer workAttachment){
this.workAttachment = workAttachment;
}
public Integer getWorkAttachment(){
return this.workAttachment;
}
private Integer dbFile;
public void setDbFile(Integer dbFile){
this.dbFile = dbFile;
}
public Integer getDbFile(){
return this.dbFile;
}
private boolean xlspng;
public void setXlspng(boolean xlspng){
this.xlspng = xlspng;
}
public boolean isXlspng(){
return this.xlspng;
}
private String thumnailsize;
public void setThumnailsize(String thumnailsize){
this.thumnailsize = thumnailsize;
}
public String getThumnailsize(){
return this.thumnailsize;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	xlspng =false;
}
}
