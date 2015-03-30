package net.exbase.beans;
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
private Integer dbFile;
public void setDbFile(Integer dbFile){
this.dbFile = dbFile;
}
public Integer getDbFile(){
return this.dbFile;
}
private Integer comment;
public void setComment(Integer comment){
this.comment = comment;
}
public Integer getComment(){
return this.comment;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private Integer excelTemplate;
public void setExcelTemplate(Integer excelTemplate){
this.excelTemplate = excelTemplate;
}
public Integer getExcelTemplate(){
return this.excelTemplate;
}
private Integer confirmation;
public void setConfirmation(Integer confirmation){
this.confirmation = confirmation;
}
public Integer getConfirmation(){
return this.confirmation;
}
private Integer rejection;
public void setRejection(Integer rejection){
this.rejection = rejection;
}
public Integer getRejection(){
return this.rejection;
}
private String mimetype;
public void setMimetype(String mimetype){
this.mimetype = mimetype;
}
public String getMimetype(){
return this.mimetype;
}
private Integer commenting;
public void setCommenting(Integer commenting){
this.commenting = commenting;
}
public Integer getCommenting(){
return this.commenting;
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
