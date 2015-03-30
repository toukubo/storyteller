package net.universe.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CustomerForm
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
private String phone;
public void setPhone(String phone){
this.phone = phone;
}
public String getPhone(){
return this.phone;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String category;
public void setCategory(String category){
this.category = category;
}
public String getCategory(){
return this.category;
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
private String company;
public void setCompany(String company){
this.company = company;
}
public String getCompany(){
return this.company;
}
private String officialposition;
public void setOfficialposition(String officialposition){
this.officialposition = officialposition;
}
public String getOfficialposition(){
return this.officialposition;
}
private String dealingsbank;
public void setDealingsbank(String dealingsbank){
this.dealingsbank = dealingsbank;
}
public String getDealingsbank(){
return this.dealingsbank;
}
private Date startupdate;
public void setStartupdate(Date startupdate){
this.startupdate = startupdate;
}
public Date getStartupdate(){
return this.startupdate;
}
private boolean startupdateIsValid = false;
public void setStartupdateIsValid(boolean startupdateIsValid){
this.startupdateIsValid = startupdateIsValid;
}
public boolean isStartupdateIsValid(){
return this.startupdateIsValid;
}
private java.lang.String startupdateAsRawString ="";
public java.lang.String getStartupdateAsString(){
    return (startupdate== null) ? null : format.format(startupdate);
}
public void setStartupdateAsString(java.lang.String startupdate){
	this.startupdateIsValid = true;
	this.startupdateAsRawString = startupdate;
try{
		if(StringUtils.isNotBlank(startupdate)){ format.parse(startupdate);}
}catch (java.text.ParseException pe){
this.startupdateIsValid = false;
}
	if(startupdateIsValid){
		try {
			this.startupdate = (org.apache.commons.lang.StringUtils.isBlank(startupdate)) ? null : format.parse(startupdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setStartupdateAsRawString(java.lang.String startupdate){
	this.startupdateAsRawString = startupdate;
}

public String getStartupdateAsRawString(){
return this.startupdateAsRawString;
}
private int addresno;
public void setAddresno(int addresno){
this.addresno = addresno;
}
public int getAddresno(){
return this.addresno;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private boolean printout;
public void setPrintout(boolean printout){
this.printout = printout;
}
public boolean isPrintout(){
return this.printout;
}
private boolean deleted;
public void setDeleted(boolean deleted){
this.deleted = deleted;
}
public boolean isDeleted(){
return this.deleted;
}
private int closedate;
public void setClosedate(int closedate){
this.closedate = closedate;
}
public int getClosedate(){
return this.closedate;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	printout =false;
	deleted =false;
}
}
