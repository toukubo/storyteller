package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class EstimationChoiseForm
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
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private Integer task;
public void setTask(Integer task){
this.task = task;
}
public Integer getTask(){
return this.task;
}
private int cost;
public void setCost(int cost){
this.cost = cost;
}
public int getCost(){
return this.cost;
}
private int profilt;
public void setProfilt(int profilt){
this.profilt = profilt;
}
public int getProfilt(){
return this.profilt;
}
private Integer estimation;
public void setEstimation(Integer estimation){
this.estimation = estimation;
}
public Integer getEstimation(){
return this.estimation;
}
private int marketAveragePrice;
public void setMarketAveragePrice(int marketAveragePrice){
this.marketAveragePrice = marketAveragePrice;
}
public int getMarketAveragePrice(){
return this.marketAveragePrice;
}
private float marketAverageDays;
public void setMarketAverageDays(float marketAverageDays){
this.marketAverageDays = marketAverageDays;
}
public float getMarketAverageDays(){
return this.marketAverageDays;
}
private float requireddays;
public void setRequireddays(float requireddays){
this.requireddays = requireddays;
}
public float getRequireddays(){
return this.requireddays;
}
private Integer test;
public void setTest(Integer test){
this.test = test;
}
public Integer getTest(){
return this.test;
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
