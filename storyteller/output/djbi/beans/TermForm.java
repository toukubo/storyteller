package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TermForm
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
private String yearname;
public void setYearname(String yearname){
this.yearname = yearname;
}
public String getYearname(){
return this.yearname;
}
private String monthname;
public void setMonthname(String monthname){
this.monthname = monthname;
}
public String getMonthname(){
return this.monthname;
}
private int week;
public void setWeek(int week){
this.week = week;
}
public int getWeek(){
return this.week;
}
private String weekname;
public void setWeekname(String weekname){
this.weekname = weekname;
}
public String getWeekname(){
return this.weekname;
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
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
