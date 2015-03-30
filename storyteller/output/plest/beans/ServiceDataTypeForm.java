package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ServiceDataTypeForm
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
private String tablename;
public void setTablename(String tablename){
this.tablename = tablename;
}
public String getTablename(){
return this.tablename;
}
private Integer serviceUse;
public void setServiceUse(Integer serviceUse){
this.serviceUse = serviceUse;
}
public Integer getServiceUse(){
return this.serviceUse;
}
private String targettable;
public void setTargettable(String targettable){
this.targettable = targettable;
}
public String getTargettable(){
return this.targettable;
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
