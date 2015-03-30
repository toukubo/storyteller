package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class JobForm
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
private int costsum;
public void setCostsum(int costsum){
this.costsum = costsum;
}
public int getCostsum(){
return this.costsum;
}
private Integer jobCategory;
public void setJobCategory(Integer jobCategory){
this.jobCategory = jobCategory;
}
public Integer getJobCategory(){
return this.jobCategory;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
private boolean active;
public void setActive(boolean active){
this.active = active;
}
public boolean isActive(){
return this.active;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	active =false;
}
}
