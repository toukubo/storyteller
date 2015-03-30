package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class OutsourcingForm
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
private Integer manual;
public void setManual(Integer manual){
this.manual = manual;
}
public Integer getManual(){
return this.manual;
}
private int actual;
public void setActual(int actual){
this.actual = actual;
}
public int getActual(){
return this.actual;
}
private int work;
public void setWork(int work){
this.work = work;
}
public int getWork(){
return this.work;
}
private int master;
public void setMaster(int master){
this.master = master;
}
public int getMaster(){
return this.master;
}
private boolean requested;
public void setRequested(boolean requested){
this.requested = requested;
}
public boolean isRequested(){
return this.requested;
}
private Integer componey;
public void setComponey(Integer componey){
this.componey = componey;
}
public Integer getComponey(){
return this.componey;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	requested =false;
}
}
