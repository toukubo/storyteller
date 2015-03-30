package net.universe.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NarratorForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private int contractfee;
public void setContractfee(int contractfee){
this.contractfee = contractfee;
}
public int getContractfee(){
return this.contractfee;
}
private int managementfee;
public void setManagementfee(int managementfee){
this.managementfee = managementfee;
}
public int getManagementfee(){
return this.managementfee;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String kana;
public void setKana(String kana){
this.kana = kana;
}
public String getKana(){
return this.kana;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private String zipthree;
public void setZipthree(String zipthree){
this.zipthree = zipthree;
}
public String getZipthree(){
return this.zipthree;
}
private String zipfour;
public void setZipfour(String zipfour){
this.zipfour = zipfour;
}
public String getZipfour(){
return this.zipfour;
}
private String phone;
public void setPhone(String phone){
this.phone = phone;
}
public String getPhone(){
return this.phone;
}
private boolean male;
public void setMale(boolean male){
this.male = male;
}
public boolean isMale(){
return this.male;
}
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private String mobilephone;
public void setMobilephone(String mobilephone){
this.mobilephone = mobilephone;
}
public String getMobilephone(){
return this.mobilephone;
}
private String memo;
public void setMemo(String memo){
this.memo = memo;
}
public String getMemo(){
return this.memo;
}
private String paymentbank;
public void setPaymentbank(String paymentbank){
this.paymentbank = paymentbank;
}
public String getPaymentbank(){
return this.paymentbank;
}
private boolean corporation;
public void setCorporation(boolean corporation){
this.corporation = corporation;
}
public boolean isCorporation(){
return this.corporation;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
}
private boolean paywithtax;
public void setPaywithtax(boolean paywithtax){
this.paywithtax = paywithtax;
}
public boolean isPaywithtax(){
return this.paywithtax;
}
private boolean deleted;
public void setDeleted(boolean deleted){
this.deleted = deleted;
}
public boolean isDeleted(){
return this.deleted;
}
private String address2;
public void setAddress2(String address2){
this.address2 = address2;
}
public String getAddress2(){
return this.address2;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	male =false;
	corporation =false;
	paywithtax =false;
	deleted =false;
}
}
