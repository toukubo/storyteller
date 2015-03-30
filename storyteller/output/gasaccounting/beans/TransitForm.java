package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TransitForm
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
private Integer task;
public void setTask(Integer task){
this.task = task;
}
public Integer getTask(){
return this.task;
}
private String destination;
public void setDestination(String destination){
this.destination = destination;
}
public String getDestination(){
return this.destination;
}
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private String stationfrom;
public void setStationfrom(String stationfrom){
this.stationfrom = stationfrom;
}
public String getStationfrom(){
return this.stationfrom;
}
private String stationto;
public void setStationto(String stationto){
this.stationto = stationto;
}
public String getStationto(){
return this.stationto;
}
private int fee;
public void setFee(int fee){
this.fee = fee;
}
public int getFee(){
return this.fee;
}
private boolean bothway;
public void setBothway(boolean bothway){
this.bothway = bothway;
}
public boolean isBothway(){
return this.bothway;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	bothway =false;
}
}
