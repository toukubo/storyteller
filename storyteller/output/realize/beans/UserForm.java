package net.realize.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class UserForm
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
private String username;
public void setUsername(String username){
this.username = username;
}
public String getUsername(){
return this.username;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private Date addeddate;
public void setAddeddate(Date addeddate){
this.addeddate = addeddate;
}
public Date getAddeddate(){
return this.addeddate;
}
private boolean addeddateIsValid = false;
public void setAddeddateIsValid(boolean addeddateIsValid){
this.addeddateIsValid = addeddateIsValid;
}
public boolean isAddeddateIsValid(){
return this.addeddateIsValid;
}
private java.lang.String addeddateAsRawString ="";
public java.lang.String getAddeddateAsString(){
    return (addeddate== null) ? null : format.format(addeddate);
}
public void setAddeddateAsString(java.lang.String addeddate){
	this.addeddateIsValid = true;
	this.addeddateAsRawString = addeddate;
try{
		if(StringUtils.isNotBlank(addeddate)){ format.parse(addeddate);}
}catch (java.text.ParseException pe){
this.addeddateIsValid = false;
}
	if(addeddateIsValid){
		try {
			this.addeddate = (org.apache.commons.lang.StringUtils.isBlank(addeddate)) ? null : format.parse(addeddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setAddeddateAsRawString(java.lang.String addeddate){
	this.addeddateAsRawString = addeddate;
}

public String getAddeddateAsRawString(){
return this.addeddateAsRawString;
}
private String kana;
public void setKana(String kana){
this.kana = kana;
}
public String getKana(){
return this.kana;
}
private String englishname;
public void setEnglishname(String englishname){
this.englishname = englishname;
}
public String getEnglishname(){
return this.englishname;
}
private String sex;
public void setSex(String sex){
this.sex = sex;
}
public String getSex(){
return this.sex;
}
private String phonenum;
public void setPhonenum(String phonenum){
this.phonenum = phonenum;
}
public String getPhonenum(){
return this.phonenum;
}
private boolean rememberme;
public void setRememberme(boolean rememberme){
this.rememberme = rememberme;
}
public boolean isRememberme(){
return this.rememberme;
}
private String infoseekmail;
public void setInfoseekmail(String infoseekmail){
this.infoseekmail = infoseekmail;
}
public String getInfoseekmail(){
return this.infoseekmail;
}
private String zip;
public void setZip(String zip){
this.zip = zip;
}
public String getZip(){
return this.zip;
}
private String buildingname;
public void setBuildingname(String buildingname){
this.buildingname = buildingname;
}
public String getBuildingname(){
return this.buildingname;
}
private Date birthdate;
public void setBirthdate(Date birthdate){
this.birthdate = birthdate;
}
public Date getBirthdate(){
return this.birthdate;
}
private boolean birthdateIsValid = false;
public void setBirthdateIsValid(boolean birthdateIsValid){
this.birthdateIsValid = birthdateIsValid;
}
public boolean isBirthdateIsValid(){
return this.birthdateIsValid;
}
private java.lang.String birthdateAsRawString ="";
public java.lang.String getBirthdateAsString(){
    return (birthdate== null) ? null : format.format(birthdate);
}
public void setBirthdateAsString(java.lang.String birthdate){
	this.birthdateIsValid = true;
	this.birthdateAsRawString = birthdate;
try{
		if(StringUtils.isNotBlank(birthdate)){ format.parse(birthdate);}
}catch (java.text.ParseException pe){
this.birthdateIsValid = false;
}
	if(birthdateIsValid){
		try {
			this.birthdate = (org.apache.commons.lang.StringUtils.isBlank(birthdate)) ? null : format.parse(birthdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setBirthdateAsRawString(java.lang.String birthdate){
	this.birthdateAsRawString = birthdate;
}

public String getBirthdateAsRawString(){
return this.birthdateAsRawString;
}
private String mailhp;
public void setMailhp(String mailhp){
this.mailhp = mailhp;
}
public String getMailhp(){
return this.mailhp;
}
private String mailpass;
public void setMailpass(String mailpass){
this.mailpass = mailpass;
}
public String getMailpass(){
return this.mailpass;
}
private boolean bankvalid;
public void setBankvalid(boolean bankvalid){
this.bankvalid = bankvalid;
}
public boolean isBankvalid(){
return this.bankvalid;
}
private String bank;
public void setBank(String bank){
this.bank = bank;
}
public String getBank(){
return this.bank;
}
private String yuchonum;
public void setYuchonum(String yuchonum){
this.yuchonum = yuchonum;
}
public String getYuchonum(){
return this.yuchonum;
}
private String banknumber;
public void setBanknumber(String banknumber){
this.banknumber = banknumber;
}
public String getBanknumber(){
return this.banknumber;
}
private String bankaccountname;
public void setBankaccountname(String bankaccountname){
this.bankaccountname = bankaccountname;
}
public String getBankaccountname(){
return this.bankaccountname;
}
private String certificationNumber;
public void setCertificationNumber(String certificationNumber){
this.certificationNumber = certificationNumber;
}
public String getCertificationNumber(){
return this.certificationNumber;
}
private int currentcommition;
public void setCurrentcommition(int currentcommition){
this.currentcommition = currentcommition;
}
public int getCurrentcommition(){
return this.currentcommition;
}
private int paidcommition;
public void setPaidcommition(int paidcommition){
this.paidcommition = paidcommition;
}
public int getPaidcommition(){
return this.paidcommition;
}
private Integer introductionsAsIntroduced;
public void setIntroductionsAsIntroduced(Integer introductionsAsIntroduced){
this.introductionsAsIntroduced = introductionsAsIntroduced;
}
public Integer getIntroductionsAsIntroduced(){
return this.introductionsAsIntroduced;
}
private Integer certificationType;
public void setCertificationType(Integer certificationType){
this.certificationType = certificationType;
}
public Integer getCertificationType(){
return this.certificationType;
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
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
}
private boolean banned;
public void setBanned(boolean banned){
this.banned = banned;
}
public boolean isBanned(){
return this.banned;
}
private boolean paid;
public void setPaid(boolean paid){
this.paid = paid;
}
public boolean isPaid(){
return this.paid;
}
private boolean started;
public void setStarted(boolean started){
this.started = started;
}
public boolean isStarted(){
return this.started;
}
private boolean startsWithIntroduction;
public void setStartsWithIntroduction(boolean startsWithIntroduction){
this.startsWithIntroduction = startsWithIntroduction;
}
public boolean isStartsWithIntroduction(){
return this.startsWithIntroduction;
}
private String addresskana;
public void setAddresskana(String addresskana){
this.addresskana = addresskana;
}
public String getAddresskana(){
return this.addresskana;
}
private String pref;
public void setPref(String pref){
this.pref = pref;
}
public String getPref(){
return this.pref;
}
private boolean temp;
public void setTemp(boolean temp){
this.temp = temp;
}
public boolean isTemp(){
return this.temp;
}
private String inactivationReason;
public void setInactivationReason(String inactivationReason){
this.inactivationReason = inactivationReason;
}
public String getInactivationReason(){
return this.inactivationReason;
}
private boolean inactive;
public void setInactive(boolean inactive){
this.inactive = inactive;
}
public boolean isInactive(){
return this.inactive;
}
private Date inactivatedDate;
public void setInactivatedDate(Date inactivatedDate){
this.inactivatedDate = inactivatedDate;
}
public Date getInactivatedDate(){
return this.inactivatedDate;
}
private boolean inactivatedDateIsValid = false;
public void setInactivatedDateIsValid(boolean inactivatedDateIsValid){
this.inactivatedDateIsValid = inactivatedDateIsValid;
}
public boolean isInactivatedDateIsValid(){
return this.inactivatedDateIsValid;
}
private java.lang.String inactivatedDateAsRawString ="";
public java.lang.String getInactivatedDateAsString(){
    return (inactivatedDate== null) ? null : format.format(inactivatedDate);
}
public void setInactivatedDateAsString(java.lang.String inactivatedDate){
	this.inactivatedDateIsValid = true;
	this.inactivatedDateAsRawString = inactivatedDate;
try{
		if(StringUtils.isNotBlank(inactivatedDate)){ format.parse(inactivatedDate);}
}catch (java.text.ParseException pe){
this.inactivatedDateIsValid = false;
}
	if(inactivatedDateIsValid){
		try {
			this.inactivatedDate = (org.apache.commons.lang.StringUtils.isBlank(inactivatedDate)) ? null : format.parse(inactivatedDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setInactivatedDateAsRawString(java.lang.String inactivatedDate){
	this.inactivatedDateAsRawString = inactivatedDate;
}

public String getInactivatedDateAsRawString(){
return this.inactivatedDateAsRawString;
}
private String keitai;
public void setKeitai(String keitai){
this.keitai = keitai;
}
public String getKeitai(){
return this.keitai;
}
private String fax;
public void setFax(String fax){
this.fax = fax;
}
public String getFax(){
return this.fax;
}
private String mothersmeiden;
public void setMothersmeiden(String mothersmeiden){
this.mothersmeiden = mothersmeiden;
}
public String getMothersmeiden(){
return this.mothersmeiden;
}
private int introducerInt;
public void setIntroducerInt(int introducerInt){
this.introducerInt = introducerInt;
}
public int getIntroducerInt(){
return this.introducerInt;
}
private String married;
public void setMarried(String married){
this.married = married;
}
public String getMarried(){
return this.married;
}
private String buildingkana;
public void setBuildingkana(String buildingkana){
this.buildingkana = buildingkana;
}
public String getBuildingkana(){
return this.buildingkana;
}
private String marriedstring;
public void setMarriedstring(String marriedstring){
this.marriedstring = marriedstring;
}
public String getMarriedstring(){
return this.marriedstring;
}
private Integer accessid;
public void setAccessid(Integer accessid){
this.accessid = accessid;
}
public Integer getAccessid(){
return this.accessid;
}
private Integer regacycode;
public void setRegacycode(Integer regacycode){
this.regacycode = regacycode;
}
public Integer getRegacycode(){
return this.regacycode;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	rememberme =false;
	bankvalid =false;
	banned =false;
	paid =false;
	started =false;
	startsWithIntroduction =false;
	temp =false;
	inactive =false;
}
}
