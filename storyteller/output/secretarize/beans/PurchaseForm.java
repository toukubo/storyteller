package net.secretarize.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PurchaseForm
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
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private int total;
public void setTotal(int total){
this.total = total;
}
public int getTotal(){
return this.total;
}
private int totalordernum;
public void setTotalordernum(int totalordernum){
this.totalordernum = totalordernum;
}
public int getTotalordernum(){
return this.totalordernum;
}
private boolean shipped;
public void setShipped(boolean shipped){
this.shipped = shipped;
}
public boolean isShipped(){
return this.shipped;
}
private float hour;
public void setHour(float hour){
this.hour = hour;
}
public float getHour(){
return this.hour;
}
private boolean invoiced;
public void setInvoiced(boolean invoiced){
this.invoiced = invoiced;
}
public boolean isInvoiced(){
return this.invoiced;
}
private boolean paid;
public void setPaid(boolean paid){
this.paid = paid;
}
public boolean isPaid(){
return this.paid;
}
private int month;
public void setMonth(int month){
this.month = month;
}
public int getMonth(){
return this.month;
}
private int year;
public void setYear(int year){
this.year = year;
}
public int getYear(){
return this.year;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	shipped =false;
	invoiced =false;
	paid =false;
}
}
