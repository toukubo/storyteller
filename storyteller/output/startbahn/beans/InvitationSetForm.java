package net.startbahn.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class InvitationSetForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String message;
public void setMessage(String message){
this.message = message;
}
public String getMessage(){
return this.message;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private String mail1;
public void setMail1(String mail1){
this.mail1 = mail1;
}
public String getMail1(){
return this.mail1;
}
private String mail2;
public void setMail2(String mail2){
this.mail2 = mail2;
}
public String getMail2(){
return this.mail2;
}
private String mail3;
public void setMail3(String mail3){
this.mail3 = mail3;
}
public String getMail3(){
return this.mail3;
}
private String mail4;
public void setMail4(String mail4){
this.mail4 = mail4;
}
public String getMail4(){
return this.mail4;
}
private String mail5;
public void setMail5(String mail5){
this.mail5 = mail5;
}
public String getMail5(){
return this.mail5;
}
private String mail6;
public void setMail6(String mail6){
this.mail6 = mail6;
}
public String getMail6(){
return this.mail6;
}
private String mail7;
public void setMail7(String mail7){
this.mail7 = mail7;
}
public String getMail7(){
return this.mail7;
}
private String mail8;
public void setMail8(String mail8){
this.mail8 = mail8;
}
public String getMail8(){
return this.mail8;
}
private String mail9;
public void setMail9(String mail9){
this.mail9 = mail9;
}
public String getMail9(){
return this.mail9;
}
private String mail10;
public void setMail10(String mail10){
this.mail10 = mail10;
}
public String getMail10(){
return this.mail10;
}
private String usertype;
public void setUsertype(String usertype){
this.usertype = usertype;
}
public String getUsertype(){
return this.usertype;
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
