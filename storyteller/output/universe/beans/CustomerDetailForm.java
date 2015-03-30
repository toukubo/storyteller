package net.universe.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CustomerDetailForm
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
private String zipthree;
public void setZipthree(String zipthree){
this.zipthree = zipthree;
}
public String getZipthree(){
return this.zipthree;
}
private String zipfour;
public void setZipfour(String zipfour){
this.zipfour = zipfour;
}
public String getZipfour(){
return this.zipfour;
}
private Integer customer;
public void setCustomer(Integer customer){
this.customer = customer;
}
public Integer getCustomer(){
return this.customer;
}
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
}
private boolean deleted;
public void setDeleted(boolean deleted){
this.deleted = deleted;
}
public boolean isDeleted(){
return this.deleted;
}
private String address2;
public void setAddress2(String address2){
this.address2 = address2;
}
public String getAddress2(){
return this.address2;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	deleted =false;
}
}
