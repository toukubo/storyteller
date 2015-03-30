package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExcelTemplateAccessabilityForm
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
private Integer readonly;
public void setReadonly(Integer readonly){
this.readonly = readonly;
}
public Integer getReadonly(){
return this.readonly;
}
private Integer excelTemplate;
public void setExcelTemplate(Integer excelTemplate){
this.excelTemplate = excelTemplate;
}
public Integer getExcelTemplate(){
return this.excelTemplate;
}
private Integer user;
public void setUser(Integer user){
this.user = user;
}
public Integer getUser(){
return this.user;
}
private Integer modify;
public void setModify(Integer modify){
this.modify = modify;
}
public Integer getModify(){
return this.modify;
}
private Integer modified;
public void setModified(Integer modified){
this.modified = modified;
}
public Integer getModified(){
return this.modified;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
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
