package net.photo.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AttachmentForm
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
private Integer work;
public void setWork(Integer work){
this.work = work;
}
public Integer getWork(){
return this.work;
}
private String filetype;
public void setFiletype(String filetype){
this.filetype = filetype;
}
public String getFiletype(){
return this.filetype;
}
private Integer dbFile;
public void setDbFile(Integer dbFile){
this.dbFile = dbFile;
}
public Integer getDbFile(){
return this.dbFile;
}
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private Integer thumnaildbfile;
public void setThumnaildbfile(Integer thumnaildbfile){
this.thumnaildbfile = thumnaildbfile;
}
public Integer getThumnaildbfile(){
return this.thumnaildbfile;
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
