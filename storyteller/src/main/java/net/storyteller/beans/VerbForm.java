package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class VerbForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private boolean valid;
public void setValid(boolean valid){
this.valid = valid;
}
public boolean isValid(){
return this.valid;
}
private boolean twoobjects;
public void setTwoobjects(boolean twoobjects){
this.twoobjects = twoobjects;
}
public boolean isTwoobjects(){
return this.twoobjects;
}
private String japanese;
public void setJapanese(String japanese){
this.japanese = japanese;
}
public String getJapanese(){
return this.japanese;
}
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private int cost;
public void setCost(int cost){
this.cost = cost;
}
public int getCost(){
return this.cost;
}
private float marketAverageDays;
public void setMarketAverageDays(float marketAverageDays){
this.marketAverageDays = marketAverageDays;
}
public float getMarketAverageDays(){
return this.marketAverageDays;
}
private int profilt;
public void setProfilt(int profilt){
this.profilt = profilt;
}
public int getProfilt(){
return this.profilt;
}
private int marketAveragePrice;
public void setMarketAveragePrice(int marketAveragePrice){
this.marketAveragePrice = marketAveragePrice;
}
public int getMarketAveragePrice(){
return this.marketAveragePrice;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	valid =false;
	twoobjects =false;
}
}
