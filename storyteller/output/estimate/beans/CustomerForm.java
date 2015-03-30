package net.estimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CustomerForm
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
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
private String responsible;
public void setResponsible(String responsible){
this.responsible = responsible;
}
public String getResponsible(){
return this.responsible;
}
private String contact;
public void setContact(String contact){
this.contact = contact;
}
public String getContact(){
return this.contact;
}
private boolean regular;
public void setRegular(boolean regular){
this.regular = regular;
}
public boolean isRegular(){
return this.regular;
}
private Integer account;
public void setAccount(Integer account){
this.account = account;
}
public Integer getAccount(){
return this.account;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	regular =false;
}
}
