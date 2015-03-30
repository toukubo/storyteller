package net.simpleandhonest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CartForm
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
private int total;
public void setTotal(int total){
this.total = total;
}
public int getTotal(){
return this.total;
}
private int carriage;
public void setCarriage(int carriage){
this.carriage = carriage;
}
public int getCarriage(){
return this.carriage;
}
private int subtotal;
public void setSubtotal(int subtotal){
this.subtotal = subtotal;
}
public int getSubtotal(){
return this.subtotal;
}
private int totalordernum;
public void setTotalordernum(int totalordernum){
this.totalordernum = totalordernum;
}
public int getTotalordernum(){
return this.totalordernum;
}
private Integer intrauserashistory;
public void setIntrauserashistory(Integer intrauserashistory){
this.intrauserashistory = intrauserashistory;
}
public Integer getIntrauserashistory(){
return this.intrauserashistory;
}
private Integer intrauserascurrent;
public void setIntrauserascurrent(Integer intrauserascurrent){
this.intrauserascurrent = intrauserascurrent;
}
public Integer getIntrauserascurrent(){
return this.intrauserascurrent;
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
