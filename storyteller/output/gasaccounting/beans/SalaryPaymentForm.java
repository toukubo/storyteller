package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SalaryPaymentForm
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
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private int costperhour;
public void setCostperhour(int costperhour){
this.costperhour = costperhour;
}
public int getCostperhour(){
return this.costperhour;
}
private int total;
public void setTotal(int total){
this.total = total;
}
public int getTotal(){
return this.total;
}
private float totalhollidayworktime;
public void setTotalhollidayworktime(float totalhollidayworktime){
this.totalhollidayworktime = totalhollidayworktime;
}
public float getTotalhollidayworktime(){
return this.totalhollidayworktime;
}
private float totalmidnightworktime;
public void setTotalmidnightworktime(float totalmidnightworktime){
this.totalmidnightworktime = totalmidnightworktime;
}
public float getTotalmidnightworktime(){
return this.totalmidnightworktime;
}
private float totalovertimeworktime;
public void setTotalovertimeworktime(float totalovertimeworktime){
this.totalovertimeworktime = totalovertimeworktime;
}
public float getTotalovertimeworktime(){
return this.totalovertimeworktime;
}
private int costperhourformidngith;
public void setCostperhourformidngith(int costperhourformidngith){
this.costperhourformidngith = costperhourformidngith;
}
public int getCostperhourformidngith(){
return this.costperhourformidngith;
}
private int costperhourforholliday;
public void setCostperhourforholliday(int costperhourforholliday){
this.costperhourforholliday = costperhourforholliday;
}
public int getCostperhourforholliday(){
return this.costperhourforholliday;
}
private int costperhourforovertime;
public void setCostperhourforovertime(int costperhourforovertime){
this.costperhourforovertime = costperhourforovertime;
}
public int getCostperhourforovertime(){
return this.costperhourforovertime;
}
private boolean payed;
public void setPayed(boolean payed){
this.payed = payed;
}
public boolean isPayed(){
return this.payed;
}
private boolean acknowledged;
public void setAcknowledged(boolean acknowledged){
this.acknowledged = acknowledged;
}
public boolean isAcknowledged(){
return this.acknowledged;
}
private int transittotal;
public void setTransittotal(int transittotal){
this.transittotal = transittotal;
}
public int getTransittotal(){
return this.transittotal;
}
private int basesalary;
public void setBasesalary(int basesalary){
this.basesalary = basesalary;
}
public int getBasesalary(){
return this.basesalary;
}
private int forhollidaywork;
public void setForhollidaywork(int forhollidaywork){
this.forhollidaywork = forhollidaywork;
}
public int getForhollidaywork(){
return this.forhollidaywork;
}
private int forovertimework;
public void setForovertimework(int forovertimework){
this.forovertimework = forovertimework;
}
public int getForovertimework(){
return this.forovertimework;
}
private int formidngithwork;
public void setFormidngithwork(int formidngithwork){
this.formidngithwork = formidngithwork;
}
public int getFormidngithwork(){
return this.formidngithwork;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	payed =false;
	acknowledged =false;
}
}
