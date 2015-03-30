package net.evaid.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PublicUserForm
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
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String belonging;
public void setBelonging(String belonging){
this.belonging = belonging;
}
public String getBelonging(){
return this.belonging;
}
private String mailladdress;
public void setMailladdress(String mailladdress){
this.mailladdress = mailladdress;
}
public String getMailladdress(){
return this.mailladdress;
}
private String phonenumber;
public void setPhonenumber(String phonenumber){
this.phonenumber = phonenumber;
}
public String getPhonenumber(){
return this.phonenumber;
}
private String twitteraccount;
public void setTwitteraccount(String twitteraccount){
this.twitteraccount = twitteraccount;
}
public String getTwitteraccount(){
return this.twitteraccount;
}
private String twittertoken;
public void setTwittertoken(String twittertoken){
this.twittertoken = twittertoken;
}
public String getTwittertoken(){
return this.twittertoken;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String comment;
public void setComment(String comment){
this.comment = comment;
}
public String getComment(){
return this.comment;
}
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private Integer card;
public void setCard(Integer card){
this.card = card;
}
public Integer getCard(){
return this.card;
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
