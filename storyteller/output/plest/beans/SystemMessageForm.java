package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SystemMessageForm
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
private int code;
public void setCode(int code){
this.code = code;
}
public int getCode(){
return this.code;
}
private String value;
public void setValue(String value){
this.value = value;
}
public String getValue(){
return this.value;
}
private boolean error;
public void setError(boolean error){
this.error = error;
}
public boolean isError(){
return this.error;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	error =false;
}
}
