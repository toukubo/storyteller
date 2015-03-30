package net.clbs.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CaseUserForm
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
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private Integer bodyweight;
public void setBodyweight(Integer bodyweight){
this.bodyweight = bodyweight;
}
public Integer getBodyweight(){
return this.bodyweight;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private boolean sex;
public void setSex(boolean sex){
this.sex = sex;
}
public boolean isSex(){
return this.sex;
}
private Integer age;
public void setAge(Integer age){
this.age = age;
}
public Integer getAge(){
return this.age;
}
private Double height;
public void setHeight(Double height){
this.height = height;
}
public Double getHeight(){
return this.height;
}
private Integer onsetage;
public void setOnsetage(Integer onsetage){
this.onsetage = onsetage;
}
public Integer getOnsetage(){
return this.onsetage;
}
private String curebeforoperation;
public void setCurebeforoperation(String curebeforoperation){
this.curebeforoperation = curebeforoperation;
}
public String getCurebeforoperation(){
return this.curebeforoperation;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	sex =false;
}
}
