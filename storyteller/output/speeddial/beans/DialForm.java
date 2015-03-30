package net.speeddial.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class DialForm
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
private Integer service;
public void setService(Integer service){
this.service = service;
}
public Integer getService(){
return this.service;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private boolean current;
public void setCurrent(boolean current){
this.current = current;
}
public boolean isCurrent(){
return this.current;
}
private int clickedtimes;
public void setClickedtimes(int clickedtimes){
this.clickedtimes = clickedtimes;
}
public int getClickedtimes(){
return this.clickedtimes;
}
private int dialnum;
public void setDialnum(int dialnum){
this.dialnum = dialnum;
}
public int getDialnum(){
return this.dialnum;
}
private Integer dialThumnailFile;
public void setDialThumnailFile(Integer dialThumnailFile){
this.dialThumnailFile = dialThumnailFile;
}
public Integer getDialThumnailFile(){
return this.dialThumnailFile;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	current =false;
}
}
