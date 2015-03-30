package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TableTypeUnitForm
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
private Integer smoking;
public void setSmoking(Integer smoking){
this.smoking = smoking;
}
public Integer getSmoking(){
return this.smoking;
}
private Integer maxNumCustomers;
public void setMaxNumCustomers(Integer maxNumCustomers){
this.maxNumCustomers = maxNumCustomers;
}
public Integer getMaxNumCustomers(){
return this.maxNumCustomers;
}
private Integer tableType;
public void setTableType(Integer tableType){
this.tableType = tableType;
}
public Integer getTableType(){
return this.tableType;
}
private Integer minNumCustomers;
public void setMinNumCustomers(Integer minNumCustomers){
this.minNumCustomers = minNumCustomers;
}
public Integer getMinNumCustomers(){
return this.minNumCustomers;
}
private Integer roomType;
public void setRoomType(Integer roomType){
this.roomType = roomType;
}
public Integer getRoomType(){
return this.roomType;
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
