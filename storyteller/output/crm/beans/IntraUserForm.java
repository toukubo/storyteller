package net.crm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class IntraUserForm
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
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private String phone;
public void setPhone(String phone){
this.phone = phone;
}
public String getPhone(){
return this.phone;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private int costperhour;
public void setCostperhour(int costperhour){
this.costperhour = costperhour;
}
public int getCostperhour(){
return this.costperhour;
}
private String sex;
public void setSex(String sex){
this.sex = sex;
}
public String getSex(){
return this.sex;
}
private int netincome;
public void setNetincome(int netincome){
this.netincome = netincome;
}
public int getNetincome(){
return this.netincome;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String flag;
public void setFlag(String flag){
this.flag = flag;
}
public String getFlag(){
return this.flag;
}
private Date date;
public void setDate(Date date){
this.date = date;
}
public Date getDate(){
return this.date;
}
private boolean dateIsValid = false;
public void setDateIsValid(boolean dateIsValid){
this.dateIsValid = dateIsValid;
}
public boolean isDateIsValid(){
return this.dateIsValid;
}
private java.lang.String dateAsRawString ="";
public java.lang.String getDateAsString(){
    return (date== null) ? null : format.format(date);
}
public void setDateAsString(java.lang.String date){
	this.dateIsValid = true;
	this.dateAsRawString = date;
try{
		if(StringUtils.isNotBlank(date)){ format.parse(date);}
}catch (java.text.ParseException pe){
this.dateIsValid = false;
}
	if(dateIsValid){
		try {
			this.date = (org.apache.commons.lang.StringUtils.isBlank(date)) ? null : format.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateAsRawString(java.lang.String date){
	this.dateAsRawString = date;
}

public String getDateAsRawString(){
return this.dateAsRawString;
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
