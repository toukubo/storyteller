package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TaskTemplateForm
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
private boolean cyclic;
public void setCyclic(boolean cyclic){
this.cyclic = cyclic;
}
public boolean isCyclic(){
return this.cyclic;
}
private Integer storytellerRole;
public void setStorytellerRole(Integer storytellerRole){
this.storytellerRole = storytellerRole;
}
public Integer getStorytellerRole(){
return this.storytellerRole;
}
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private boolean covered;
public void setCovered(boolean covered){
this.covered = covered;
}
public boolean isCovered(){
return this.covered;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	cyclic =false;
	covered =false;
}
}
