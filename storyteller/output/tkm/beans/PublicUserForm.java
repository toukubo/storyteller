package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PublicUserForm
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
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private String kana;
public void setKana(String kana){
this.kana = kana;
}
public String getKana(){
return this.kana;
}
private int zipthree;
public void setZipthree(int zipthree){
this.zipthree = zipthree;
}
public int getZipthree(){
return this.zipthree;
}
private int zipfour;
public void setZipfour(int zipfour){
this.zipfour = zipfour;
}
public int getZipfour(){
return this.zipfour;
}
private String pref;
public void setPref(String pref){
this.pref = pref;
}
public String getPref(){
return this.pref;
}
private String phone;
public void setPhone(String phone){
this.phone = phone;
}
public String getPhone(){
return this.phone;
}
private String municipality;
public void setMunicipality(String municipality){
this.municipality = municipality;
}
public String getMunicipality(){
return this.municipality;
}
private boolean male;
public void setMale(boolean male){
this.male = male;
}
public boolean isMale(){
return this.male;
}
private String mailforconfirm;
public void setMailforconfirm(String mailforconfirm){
this.mailforconfirm = mailforconfirm;
}
public String getMailforconfirm(){
return this.mailforconfirm;
}
private String keitai;
public void setKeitai(String keitai){
this.keitai = keitai;
}
public String getKeitai(){
return this.keitai;
}
private int devliveryhour;
public void setDevliveryhour(int devliveryhour){
this.devliveryhour = devliveryhour;
}
public int getDevliveryhour(){
return this.devliveryhour;
}
private int deliveryzipthree;
public void setDeliveryzipthree(int deliveryzipthree){
this.deliveryzipthree = deliveryzipthree;
}
public int getDeliveryzipthree(){
return this.deliveryzipthree;
}
private int deliveryzipfour;
public void setDeliveryzipfour(int deliveryzipfour){
this.deliveryzipfour = deliveryzipfour;
}
public int getDeliveryzipfour(){
return this.deliveryzipfour;
}
private String deliverypref;
public void setDeliverypref(String deliverypref){
this.deliverypref = deliverypref;
}
public String getDeliverypref(){
return this.deliverypref;
}
private int deliveryphone;
public void setDeliveryphone(int deliveryphone){
this.deliveryphone = deliveryphone;
}
public int getDeliveryphone(){
return this.deliveryphone;
}
private String deliveryname;
public void setDeliveryname(String deliveryname){
this.deliveryname = deliveryname;
}
public String getDeliveryname(){
return this.deliveryname;
}
private String deliverykana;
public void setDeliverykana(String deliverykana){
this.deliverykana = deliverykana;
}
public String getDeliverykana(){
return this.deliverykana;
}
private int deliverydate;
public void setDeliverydate(int deliverydate){
this.deliverydate = deliverydate;
}
public int getDeliverydate(){
return this.deliverydate;
}
private String deliveryblocknumber;
public void setDeliveryblocknumber(String deliveryblocknumber){
this.deliveryblocknumber = deliveryblocknumber;
}
public String getDeliveryblocknumber(){
return this.deliveryblocknumber;
}
private String deliveryaddress;
public void setDeliveryaddress(String deliveryaddress){
this.deliveryaddress = deliveryaddress;
}
public String getDeliveryaddress(){
return this.deliveryaddress;
}
private boolean delivertodifferentaddress;
public void setDelivertodifferentaddress(boolean delivertodifferentaddress){
this.delivertodifferentaddress = delivertodifferentaddress;
}
public boolean isDelivertodifferentaddress(){
return this.delivertodifferentaddress;
}
private String buildingname;
public void setBuildingname(String buildingname){
this.buildingname = buildingname;
}
public String getBuildingname(){
return this.buildingname;
}
private int brithday;
public void setBrithday(int brithday){
this.brithday = brithday;
}
public int getBrithday(){
return this.brithday;
}
private String blocknumber;
public void setBlocknumber(String blocknumber){
this.blocknumber = blocknumber;
}
public String getBlocknumber(){
return this.blocknumber;
}
private int birthyear;
public void setBirthyear(int birthyear){
this.birthyear = birthyear;
}
public int getBirthyear(){
return this.birthyear;
}
private int birthmonth;
public void setBirthmonth(int birthmonth){
this.birthmonth = birthmonth;
}
public int getBirthmonth(){
return this.birthmonth;
}
private boolean admin;
public void setAdmin(boolean admin){
this.admin = admin;
}
public boolean isAdmin(){
return this.admin;
}
private Integer status;
public void setStatus(Integer status){
this.status = status;
}
public Integer getStatus(){
return this.status;
}
private Date creationDate;
public void setCreationDate(Date creationDate){
this.creationDate = creationDate;
}
public Date getCreationDate(){
return this.creationDate;
}
private boolean creationDateIsValid = false;
public void setCreationDateIsValid(boolean creationDateIsValid){
this.creationDateIsValid = creationDateIsValid;
}
public boolean isCreationDateIsValid(){
return this.creationDateIsValid;
}
private java.lang.String creationDateAsRawString ="";
public java.lang.String getCreationDateAsString(){
    return (creationDate== null) ? null : format.format(creationDate);
}
public void setCreationDateAsString(java.lang.String creationDate){
	this.creationDateIsValid = true;
	this.creationDateAsRawString = creationDate;
try{
		if(StringUtils.isNotBlank(creationDate)){ format.parse(creationDate);}
}catch (java.text.ParseException pe){
this.creationDateIsValid = false;
}
	if(creationDateIsValid){
		try {
			this.creationDate = (org.apache.commons.lang.StringUtils.isBlank(creationDate)) ? null : format.parse(creationDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreationDateAsRawString(java.lang.String creationDate){
	this.creationDateAsRawString = creationDate;
}

public String getCreationDateAsRawString(){
return this.creationDateAsRawString;
}
private String nickname;
public void setNickname(String nickname){
this.nickname = nickname;
}
public String getNickname(){
return this.nickname;
}
private String firstName;
public void setFirstName(String firstName){
this.firstName = firstName;
}
public String getFirstName(){
return this.firstName;
}
private String firstNameKana;
public void setFirstNameKana(String firstNameKana){
this.firstNameKana = firstNameKana;
}
public String getFirstNameKana(){
return this.firstNameKana;
}
private String familyName;
public void setFamilyName(String familyName){
this.familyName = familyName;
}
public String getFamilyName(){
return this.familyName;
}
private String familyNameKana;
public void setFamilyNameKana(String familyNameKana){
this.familyNameKana = familyNameKana;
}
public String getFamilyNameKana(){
return this.familyNameKana;
}
private String mobileMail;
public void setMobileMail(String mobileMail){
this.mobileMail = mobileMail;
}
public String getMobileMail(){
return this.mobileMail;
}
private String phoneNumber;
public void setPhoneNumber(String phoneNumber){
this.phoneNumber = phoneNumber;
}
public String getPhoneNumber(){
return this.phoneNumber;
}
private String faxNumber;
public void setFaxNumber(String faxNumber){
this.faxNumber = faxNumber;
}
public String getFaxNumber(){
return this.faxNumber;
}
private String zipCode;
public void setZipCode(String zipCode){
this.zipCode = zipCode;
}
public String getZipCode(){
return this.zipCode;
}
private String addressBuilding;
public void setAddressBuilding(String addressBuilding){
this.addressBuilding = addressBuilding;
}
public String getAddressBuilding(){
return this.addressBuilding;
}
private String corporationName;
public void setCorporationName(String corporationName){
this.corporationName = corporationName;
}
public String getCorporationName(){
return this.corporationName;
}
private String corporationNameKana;
public void setCorporationNameKana(String corporationNameKana){
this.corporationNameKana = corporationNameKana;
}
public String getCorporationNameKana(){
return this.corporationNameKana;
}
private Date birthday;
public void setBirthday(Date birthday){
this.birthday = birthday;
}
public Date getBirthday(){
return this.birthday;
}
private boolean birthdayIsValid = false;
public void setBirthdayIsValid(boolean birthdayIsValid){
this.birthdayIsValid = birthdayIsValid;
}
public boolean isBirthdayIsValid(){
return this.birthdayIsValid;
}
private java.lang.String birthdayAsRawString ="";
public java.lang.String getBirthdayAsString(){
    return (birthday== null) ? null : format.format(birthday);
}
public void setBirthdayAsString(java.lang.String birthday){
	this.birthdayIsValid = true;
	this.birthdayAsRawString = birthday;
try{
		if(StringUtils.isNotBlank(birthday)){ format.parse(birthday);}
}catch (java.text.ParseException pe){
this.birthdayIsValid = false;
}
	if(birthdayIsValid){
		try {
			this.birthday = (org.apache.commons.lang.StringUtils.isBlank(birthday)) ? null : format.parse(birthday);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setBirthdayAsRawString(java.lang.String birthday){
	this.birthdayAsRawString = birthday;
}

public String getBirthdayAsRawString(){
return this.birthdayAsRawString;
}
private Integer gender;
public void setGender(Integer gender){
this.gender = gender;
}
public Integer getGender(){
return this.gender;
}
private Integer married;
public void setMarried(Integer married){
this.married = married;
}
public Integer getMarried(){
return this.married;
}
private Integer occupation;
public void setOccupation(Integer occupation){
this.occupation = occupation;
}
public Integer getOccupation(){
return this.occupation;
}
private Integer householdAnnualIncome;
public void setHouseholdAnnualIncome(Integer householdAnnualIncome){
this.householdAnnualIncome = householdAnnualIncome;
}
public Integer getHouseholdAnnualIncome(){
return this.householdAnnualIncome;
}
private Boolean subscribeMailMagazine;
public void setSubscribeMailMagazine(Boolean subscribeMailMagazine){
this.subscribeMailMagazine = subscribeMailMagazine;
}
public Boolean getSubscribeMailMagazine(){
return this.subscribeMailMagazine;
}
private Date expirationDate;
public void setExpirationDate(Date expirationDate){
this.expirationDate = expirationDate;
}
public Date getExpirationDate(){
return this.expirationDate;
}
private boolean expirationDateIsValid = false;
public void setExpirationDateIsValid(boolean expirationDateIsValid){
this.expirationDateIsValid = expirationDateIsValid;
}
public boolean isExpirationDateIsValid(){
return this.expirationDateIsValid;
}
private java.lang.String expirationDateAsRawString ="";
public java.lang.String getExpirationDateAsString(){
    return (expirationDate== null) ? null : format.format(expirationDate);
}
public void setExpirationDateAsString(java.lang.String expirationDate){
	this.expirationDateIsValid = true;
	this.expirationDateAsRawString = expirationDate;
try{
		if(StringUtils.isNotBlank(expirationDate)){ format.parse(expirationDate);}
}catch (java.text.ParseException pe){
this.expirationDateIsValid = false;
}
	if(expirationDateIsValid){
		try {
			this.expirationDate = (org.apache.commons.lang.StringUtils.isBlank(expirationDate)) ? null : format.parse(expirationDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setExpirationDateAsRawString(java.lang.String expirationDate){
	this.expirationDateAsRawString = expirationDate;
}

public String getExpirationDateAsRawString(){
return this.expirationDateAsRawString;
}
private String corporationZipCode;
public void setCorporationZipCode(String corporationZipCode){
this.corporationZipCode = corporationZipCode;
}
public String getCorporationZipCode(){
return this.corporationZipCode;
}
private String corporationAddress;
public void setCorporationAddress(String corporationAddress){
this.corporationAddress = corporationAddress;
}
public String getCorporationAddress(){
return this.corporationAddress;
}
private String corporationBuilding;
public void setCorporationBuilding(String corporationBuilding){
this.corporationBuilding = corporationBuilding;
}
public String getCorporationBuilding(){
return this.corporationBuilding;
}
private Integer prefecture;
public void setPrefecture(Integer prefecture){
this.prefecture = prefecture;
}
public Integer getPrefecture(){
return this.prefecture;
}
private Integer temporaryUser;
public void setTemporaryUser(Integer temporaryUser){
this.temporaryUser = temporaryUser;
}
public Integer getTemporaryUser(){
return this.temporaryUser;
}
private Integer shopPublicUser;
public void setShopPublicUser(Integer shopPublicUser){
this.shopPublicUser = shopPublicUser;
}
public Integer getShopPublicUser(){
return this.shopPublicUser;
}
private Integer corporatePrefecture;
public void setCorporatePrefecture(Integer corporatePrefecture){
this.corporatePrefecture = corporatePrefecture;
}
public Integer getCorporatePrefecture(){
return this.corporatePrefecture;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
	male =false;
	delivertodifferentaddress =false;
	admin =false;
}
}
