package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class IntraUserForm
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
private String password;
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
private Integer shop;
public void setShop(Integer shop){
this.shop = shop;
}
public Integer getShop(){
return this.shop;
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
private String employeecode;
public void setEmployeecode(String employeecode){
this.employeecode = employeecode;
}
public String getEmployeecode(){
return this.employeecode;
}
private String groupname;
public void setGroupname(String groupname){
this.groupname = groupname;
}
public String getGroupname(){
return this.groupname;
}
private Integer exhibitionIntraUser;
public void setExhibitionIntraUser(Integer exhibitionIntraUser){
this.exhibitionIntraUser = exhibitionIntraUser;
}
public Integer getExhibitionIntraUser(){
return this.exhibitionIntraUser;
}
private Integer base;
public void setBase(Integer base){
this.base = base;
}
public Integer getBase(){
return this.base;
}
private String mailaddr;
public void setMailaddr(String mailaddr){
this.mailaddr = mailaddr;
}
public String getMailaddr(){
return this.mailaddr;
}
private boolean left;
public void setLeft(boolean left){
this.left = left;
}
public boolean isLeft(){
return this.left;
}
private boolean receivemail;
public void setReceivemail(boolean receivemail){
this.receivemail = receivemail;
}
public boolean isReceivemail(){
return this.receivemail;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	left =false;
	receivemail =false;
	removed =false;
}
}
