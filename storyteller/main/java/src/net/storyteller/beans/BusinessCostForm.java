package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class BusinessCostForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer j2eeStory;
public void setJ2eeStory(Integer j2eeStory){
this.j2eeStory = j2eeStory;
}
public Integer getJ2eeStory(){
return this.j2eeStory;
}
private int costperhour;
public void setCostperhour(int costperhour){
this.costperhour = costperhour;
}
public int getCostperhour(){
return this.costperhour;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
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
private int hour;
public void setHour(int hour){
this.hour = hour;
}
public int getHour(){
return this.hour;
}
private Integer storytellerRole;
public void setStorytellerRole(Integer storytellerRole){
this.storytellerRole = storytellerRole;
}
public Integer getStorytellerRole(){
return this.storytellerRole;
}
private boolean actual;
public void setActual(boolean actual){
this.actual = actual;
}
public boolean isActual(){
return this.actual;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	actual =false;
}
}
