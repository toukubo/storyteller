package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CarForm
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
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer salesprice;
public void setSalesprice(Integer salesprice){
this.salesprice = salesprice;
}
public Integer getSalesprice(){
return this.salesprice;
}
private String groupname;
public void setGroupname(String groupname){
this.groupname = groupname;
}
public String getGroupname(){
return this.groupname;
}
private String carline;
public void setCarline(String carline){
this.carline = carline;
}
public String getCarline(){
return this.carline;
}
private int salescost;
public void setSalescost(int salescost){
this.salescost = salescost;
}
public int getSalescost(){
return this.salescost;
}
private boolean lightcar;
public void setLightcar(boolean lightcar){
this.lightcar = lightcar;
}
public boolean isLightcar(){
return this.lightcar;
}
private boolean businesscar;
public void setBusinesscar(boolean businesscar){
this.businesscar = businesscar;
}
public boolean isBusinesscar(){
return this.businesscar;
}
private int sortorder;
public void setSortorder(int sortorder){
this.sortorder = sortorder;
}
public int getSortorder(){
return this.sortorder;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	lightcar =false;
	businesscar =false;
}
}
