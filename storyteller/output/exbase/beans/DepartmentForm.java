package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class DepartmentForm
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
private Integer parentDepartment;
public void setParentDepartment(Integer parentDepartment){
this.parentDepartment = parentDepartment;
}
public Integer getParentDepartment(){
return this.parentDepartment;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
}
}
