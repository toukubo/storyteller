package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CommentNotificationChoiseForm
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
private Integer excel;
public void setExcel(Integer excel){
this.excel = excel;
}
public Integer getExcel(){
return this.excel;
}
private Integer user;
public void setUser(Integer user){
this.user = user;
}
public Integer getUser(){
return this.user;
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
