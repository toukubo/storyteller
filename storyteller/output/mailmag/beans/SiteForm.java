package net.mailmag.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SiteForm
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
private String header;
public void setHeader(String header){
this.header = header;
}
public String getHeader(){
return this.header;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String url;
public void setUrl(String url){
this.url = url;
}
public String getUrl(){
return this.url;
}
private String footer;
public void setFooter(String footer){
this.footer = footer;
}
public String getFooter(){
return this.footer;
}
private String mobileurl;
public void setMobileurl(String mobileurl){
this.mobileurl = mobileurl;
}
public String getMobileurl(){
return this.mobileurl;
}
private boolean specialtemplateusing;
public void setSpecialtemplateusing(boolean specialtemplateusing){
this.specialtemplateusing = specialtemplateusing;
}
public boolean isSpecialtemplateusing(){
return this.specialtemplateusing;
}
private String userexporturl;
public void setUserexporturl(String userexporturl){
this.userexporturl = userexporturl;
}
public String getUserexporturl(){
return this.userexporturl;
}
private String hash;
public void setHash(String hash){
this.hash = hash;
}
public String getHash(){
return this.hash;
}
private Integer csvFile;
public void setCsvFile(Integer csvFile){
this.csvFile = csvFile;
}
public Integer getCsvFile(){
return this.csvFile;
}
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String fromaddress;
public void setFromaddress(String fromaddress){
this.fromaddress = fromaddress;
}
public String getFromaddress(){
return this.fromaddress;
}
private String erroraddress;
public void setErroraddress(String erroraddress){
this.erroraddress = erroraddress;
}
public String getErroraddress(){
return this.erroraddress;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	specialtemplateusing =false;
}
}
