package net.keionbu.beans;
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
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private Date updatedate;
public void setUpdatedate(Date updatedate){
this.updatedate = updatedate;
}
public Date getUpdatedate(){
return this.updatedate;
}
private boolean updatedateIsValid = false;
public void setUpdatedateIsValid(boolean updatedateIsValid){
this.updatedateIsValid = updatedateIsValid;
}
public boolean isUpdatedateIsValid(){
return this.updatedateIsValid;
}
private java.lang.String updatedateAsRawString ="";
public java.lang.String getUpdatedateAsString(){
    return (updatedate== null) ? null : format.format(updatedate);
}
public void setUpdatedateAsString(java.lang.String updatedate){
	this.updatedateIsValid = true;
	this.updatedateAsRawString = updatedate;
try{
		if(StringUtils.isNotBlank(updatedate)){ format.parse(updatedate);}
}catch (java.text.ParseException pe){
this.updatedateIsValid = false;
}
	if(updatedateIsValid){
		try {
			this.updatedate = (org.apache.commons.lang.StringUtils.isBlank(updatedate)) ? null : format.parse(updatedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setUpdatedateAsRawString(java.lang.String updatedate){
	this.updatedateAsRawString = updatedate;
}

public String getUpdatedateAsRawString(){
return this.updatedateAsRawString;
}
private String city;
public void setCity(String city){
this.city = city;
}
public String getCity(){
return this.city;
}
private String prefecture;
public void setPrefecture(String prefecture){
this.prefecture = prefecture;
}
public String getPrefecture(){
return this.prefecture;
}
private String firstname;
public void setFirstname(String firstname){
this.firstname = firstname;
}
public String getFirstname(){
return this.firstname;
}
private String zipcode;
public void setZipcode(String zipcode){
this.zipcode = zipcode;
}
public String getZipcode(){
return this.zipcode;
}
private String firstnamekana;
public void setFirstnamekana(String firstnamekana){
this.firstnamekana = firstnamekana;
}
public String getFirstnamekana(){
return this.firstnamekana;
}
private String familyname;
public void setFamilyname(String familyname){
this.familyname = familyname;
}
public String getFamilyname(){
return this.familyname;
}
private String familynamekana;
public void setFamilynamekana(String familynamekana){
this.familynamekana = familynamekana;
}
public String getFamilynamekana(){
return this.familynamekana;
}
private String nickname;
public void setNickname(String nickname){
this.nickname = nickname;
}
public String getNickname(){
return this.nickname;
}
private String affiliation;
public void setAffiliation(String affiliation){
this.affiliation = affiliation;
}
public String getAffiliation(){
return this.affiliation;
}
private String utn;
public void setUtn(String utn){
this.utn = utn;
}
public String getUtn(){
return this.utn;
}
private String mobileno;
public void setMobileno(String mobileno){
this.mobileno = mobileno;
}
public String getMobileno(){
return this.mobileno;
}
private String mobilemail;
public void setMobilemail(String mobilemail){
this.mobilemail = mobilemail;
}
public String getMobilemail(){
return this.mobilemail;
}
private String telno;
public void setTelno(String telno){
this.telno = telno;
}
public String getTelno(){
return this.telno;
}
private String building;
public void setBuilding(String building){
this.building = building;
}
public String getBuilding(){
return this.building;
}
private Date createdate;
public void setCreatedate(Date createdate){
this.createdate = createdate;
}
public Date getCreatedate(){
return this.createdate;
}
private boolean createdateIsValid = false;
public void setCreatedateIsValid(boolean createdateIsValid){
this.createdateIsValid = createdateIsValid;
}
public boolean isCreatedateIsValid(){
return this.createdateIsValid;
}
private java.lang.String createdateAsRawString ="";
public java.lang.String getCreatedateAsString(){
    return (createdate== null) ? null : format.format(createdate);
}
public void setCreatedateAsString(java.lang.String createdate){
	this.createdateIsValid = true;
	this.createdateAsRawString = createdate;
try{
		if(StringUtils.isNotBlank(createdate)){ format.parse(createdate);}
}catch (java.text.ParseException pe){
this.createdateIsValid = false;
}
	if(createdateIsValid){
		try {
			this.createdate = (org.apache.commons.lang.StringUtils.isBlank(createdate)) ? null : format.parse(createdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreatedateAsRawString(java.lang.String createdate){
	this.createdateAsRawString = createdate;
}

public String getCreatedateAsRawString(){
return this.createdateAsRawString;
}
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
}
private Integer introductionFrom;
public void setIntroductionFrom(Integer introductionFrom){
this.introductionFrom = introductionFrom;
}
public Integer getIntroductionFrom(){
return this.introductionFrom;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
}
}
