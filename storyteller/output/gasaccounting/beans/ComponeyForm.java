package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ComponeyForm
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
private int zipthree;
public void setZipthree(int zipthree){
this.zipthree = zipthree;
}
public int getZipthree(){
return this.zipthree;
}
private int zipfour;
public void setZipfour(int zipfour){
this.zipfour = zipfour;
}
public int getZipfour(){
return this.zipfour;
}
private String presidentname;
public void setPresidentname(String presidentname){
this.presidentname = presidentname;
}
public String getPresidentname(){
return this.presidentname;
}
private String phonenum;
public void setPhonenum(String phonenum){
this.phonenum = phonenum;
}
public String getPhonenum(){
return this.phonenum;
}
private String fax;
public void setFax(String fax){
this.fax = fax;
}
public String getFax(){
return this.fax;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
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
