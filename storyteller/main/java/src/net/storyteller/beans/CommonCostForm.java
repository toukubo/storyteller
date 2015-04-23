package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CommonCostForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String cyclename;
public void setCyclename(String cyclename){
this.cyclename = cyclename;
}
public String getCyclename(){
return this.cyclename;
}
private boolean cycle;
public void setCycle(boolean cycle){
this.cycle = cycle;
}
public boolean isCycle(){
return this.cycle;
}
private boolean equipment;
public void setEquipment(boolean equipment){
this.equipment = equipment;
}
public boolean isEquipment(){
return this.equipment;
}
private boolean payed;
public void setPayed(boolean payed){
this.payed = payed;
}
public boolean isPayed(){
return this.payed;
}
private int costperhour;
public void setCostperhour(int costperhour){
this.costperhour = costperhour;
}
public int getCostperhour(){
return this.costperhour;
}
private int hour;
public void setHour(int hour){
this.hour = hour;
}
public int getHour(){
return this.hour;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private int value;
public void setValue(int value){
this.value = value;
}
public int getValue(){
return this.value;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	cycle =false;
	equipment =false;
	payed =false;
}
}
