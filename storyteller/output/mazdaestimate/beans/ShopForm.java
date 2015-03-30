package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ShopForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private Integer id;
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
private String familyname;
public void setFamilyname(String familyname){
this.familyname = familyname;
}
public String getFamilyname(){
return this.familyname;
}
private String firstname;
public void setFirstname(String firstname){
this.firstname = firstname;
}
public String getFirstname(){
return this.firstname;
}
private Integer prefecture;
public void setPrefecture(Integer prefecture){
this.prefecture = prefecture;
}
public Integer getPrefecture(){
return this.prefecture;
}
private Integer block;
public void setBlock(Integer block){
this.block = block;
}
public Integer getBlock(){
return this.block;
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
