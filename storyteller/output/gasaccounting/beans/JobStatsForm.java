package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class JobStatsForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private int month;
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
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer job;
public void setJob(Integer job){
this.job = job;
}
public Integer getJob(){
return this.job;
}
private int actualsales;
public void setActualsales(int actualsales){
this.actualsales = actualsales;
}
public int getActualsales(){
return this.actualsales;
}
private int actualsalesminuscost;
public void setActualsalesminuscost(int actualsalesminuscost){
this.actualsalesminuscost = actualsalesminuscost;
}
public int getActualsalesminuscost(){
return this.actualsalesminuscost;
}
private int profitrate;
public void setProfitrate(int profitrate){
this.profitrate = profitrate;
}
public int getProfitrate(){
return this.profitrate;
}
private int humanaletotalcost;
public void setHumanaletotalcost(int humanaletotalcost){
this.humanaletotalcost = humanaletotalcost;
}
public int getHumanaletotalcost(){
return this.humanaletotalcost;
}
private int totalcost;
public void setTotalcost(int totalcost){
this.totalcost = totalcost;
}
public int getTotalcost(){
return this.totalcost;
}
private int buyingcosttotal;
public void setBuyingcosttotal(int buyingcosttotal){
this.buyingcosttotal = buyingcosttotal;
}
public int getBuyingcosttotal(){
return this.buyingcosttotal;
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
