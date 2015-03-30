package net.iwager.beans;
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
private int costperhour;
public void setCostperhour(int costperhour){
this.costperhour = costperhour;
}
public int getCostperhour(){
return this.costperhour;
}
private int costperhourforovertime;
public void setCostperhourforovertime(int costperhourforovertime){
this.costperhourforovertime = costperhourforovertime;
}
public int getCostperhourforovertime(){
return this.costperhourforovertime;
}
private int costperhourforholliday;
public void setCostperhourforholliday(int costperhourforholliday){
this.costperhourforholliday = costperhourforholliday;
}
public int getCostperhourforholliday(){
return this.costperhourforholliday;
}
private int costperhourformidngith;
public void setCostperhourformidngith(int costperhourformidngith){
this.costperhourformidngith = costperhourformidngith;
}
public int getCostperhourformidngith(){
return this.costperhourformidngith;
}
private String phonenum;
public void setPhonenum(String phonenum){
this.phonenum = phonenum;
}
public String getPhonenum(){
return this.phonenum;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String sex;
public void setSex(String sex){
this.sex = sex;
}
public String getSex(){
return this.sex;
}
private String familyname;
public void setFamilyname(String familyname){
this.familyname = familyname;
}
public String getFamilyname(){
return this.familyname;
}
private int roi;
public void setRoi(int roi){
this.roi = roi;
}
public int getRoi(){
return this.roi;
}
private int netincome;
public void setNetincome(int netincome){
this.netincome = netincome;
}
public int getNetincome(){
return this.netincome;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String icalurl;
public void setIcalurl(String icalurl){
this.icalurl = icalurl;
}
public String getIcalurl(){
return this.icalurl;
}
private boolean icalurlusing;
public void setIcalurlusing(boolean icalurlusing){
this.icalurlusing = icalurlusing;
}
public boolean isIcalurlusing(){
return this.icalurlusing;
}
private String c2talkaccount;
public void setC2talkaccount(String c2talkaccount){
this.c2talkaccount = c2talkaccount;
}
public String getC2talkaccount(){
return this.c2talkaccount;
}
private String c2talkpassword;
public void setC2talkpassword(String c2talkpassword){
this.c2talkpassword = c2talkpassword;
}
public String getC2talkpassword(){
return this.c2talkpassword;
}
private int monthlybasesalary;
public void setMonthlybasesalary(int monthlybasesalary){
this.monthlybasesalary = monthlybasesalary;
}
public int getMonthlybasesalary(){
return this.monthlybasesalary;
}
private boolean fixedsalary;
public void setFixedsalary(boolean fixedsalary){
this.fixedsalary = fixedsalary;
}
public boolean isFixedsalary(){
return this.fixedsalary;
}
private int currenttransitbase;
public void setCurrenttransitbase(int currenttransitbase){
this.currenttransitbase = currenttransitbase;
}
public int getCurrenttransitbase(){
return this.currenttransitbase;
}
private float workhours;
public void setWorkhours(float workhours){
this.workhours = workhours;
}
public float getWorkhours(){
return this.workhours;
}
private float starthour;
public void setStarthour(float starthour){
this.starthour = starthour;
}
public float getStarthour(){
return this.starthour;
}
private Integer privilege;
public void setPrivilege(Integer privilege){
this.privilege = privilege;
}
public Integer getPrivilege(){
return this.privilege;
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
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	icalurlusing =false;
	fixedsalary =false;
	removed =false;
}
}
