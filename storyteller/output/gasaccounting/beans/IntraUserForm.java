package net.gasaccounting.beans;
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
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String phonenum;
public void setPhonenum(String phonenum){
this.phonenum = phonenum;
}
public String getPhonenum(){
return this.phonenum;
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
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
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
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private int costperhour;
public void setCostperhour(int costperhour){
this.costperhour = costperhour;
}
public int getCostperhour(){
return this.costperhour;
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
private String c2talkpassword;
public void setC2talkpassword(String c2talkpassword){
this.c2talkpassword = c2talkpassword;
}
public String getC2talkpassword(){
return this.c2talkpassword;
}
private int costperhourformidngith;
public void setCostperhourformidngith(int costperhourformidngith){
this.costperhourformidngith = costperhourformidngith;
}
public int getCostperhourformidngith(){
return this.costperhourformidngith;
}
private int costperhourforholliday;
public void setCostperhourforholliday(int costperhourforholliday){
this.costperhourforholliday = costperhourforholliday;
}
public int getCostperhourforholliday(){
return this.costperhourforholliday;
}
private int costperhourforovertime;
public void setCostperhourforovertime(int costperhourforovertime){
this.costperhourforovertime = costperhourforovertime;
}
public int getCostperhourforovertime(){
return this.costperhourforovertime;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	icalurlusing =false;
	fixedsalary =false;
}
}
