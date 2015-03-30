package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PrivilegeForm
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
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer type;
public void setType(Integer type){
this.type = type;
}
public Integer getType(){
return this.type;
}
private Integer privilegeType;
public void setPrivilegeType(Integer privilegeType){
this.privilegeType = privilegeType;
}
public Integer getPrivilegeType(){
return this.privilegeType;
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
