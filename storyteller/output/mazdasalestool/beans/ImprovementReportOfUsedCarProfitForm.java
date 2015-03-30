package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ImprovementReportOfUsedCarProfitForm
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
private Integer numofplan;
public void setNumofplan(Integer numofplan){
this.numofplan = numofplan;
}
public Integer getNumofplan(){
return this.numofplan;
}
private Integer numofforecast;
public void setNumofforecast(Integer numofforecast){
this.numofforecast = numofforecast;
}
public Integer getNumofforecast(){
return this.numofforecast;
}
private Integer profitReportOfUsedCar;
public void setProfitReportOfUsedCar(Integer profitReportOfUsedCar){
this.profitReportOfUsedCar = profitReportOfUsedCar;
}
public Integer getProfitReportOfUsedCar(){
return this.profitReportOfUsedCar;
}
private Integer month;
public void setMonth(Integer month){
this.month = month;
}
public Integer getMonth(){
return this.month;
}
private Integer year;
public void setYear(Integer year){
this.year = year;
}
public Integer getYear(){
return this.year;
}
private Integer base;
public void setBase(Integer base){
this.base = base;
}
public Integer getBase(){
return this.base;
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
