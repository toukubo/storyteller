package net.ja.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class UserInfoForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String kana;
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
private String keitaimail;
public void setKeitaimail(String keitaimail){
this.keitaimail = keitaimail;
}
public String getKeitaimail(){
return this.keitaimail;
}
private String phone;
public void setPhone(String phone){
this.phone = phone;
}
public String getPhone(){
return this.phone;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String branchcode;
public void setBranchcode(String branchcode){
this.branchcode = branchcode;
}
public String getBranchcode(){
return this.branchcode;
}
private String firstname;
public void setFirstname(String firstname){
this.firstname = firstname;
}
public String getFirstname(){
return this.firstname;
}
private String secoundname;
public void setSecoundname(String secoundname){
this.secoundname = secoundname;
}
public String getSecoundname(){
return this.secoundname;
}
private String kanafirstname;
public void setKanafirstname(String kanafirstname){
this.kanafirstname = kanafirstname;
}
public String getKanafirstname(){
return this.kanafirstname;
}
private String kanasecoundname;
public void setKanasecoundname(String kanasecoundname){
this.kanasecoundname = kanasecoundname;
}
public String getKanasecoundname(){
return this.kanasecoundname;
}
private String addresscode;
public void setAddresscode(String addresscode){
this.addresscode = addresscode;
}
public String getAddresscode(){
return this.addresscode;
}
private String majorzipcodethree;
public void setMajorzipcodethree(String majorzipcodethree){
this.majorzipcodethree = majorzipcodethree;
}
public String getMajorzipcodethree(){
return this.majorzipcodethree;
}
private String majorzipcodefour;
public void setMajorzipcodefour(String majorzipcodefour){
this.majorzipcodefour = majorzipcodefour;
}
public String getMajorzipcodefour(){
return this.majorzipcodefour;
}
private String majorzipcode;
public void setMajorzipcode(String majorzipcode){
this.majorzipcode = majorzipcode;
}
public String getMajorzipcode(){
return this.majorzipcode;
}
private String zipcodethree;
public void setZipcodethree(String zipcodethree){
this.zipcodethree = zipcodethree;
}
public String getZipcodethree(){
return this.zipcodethree;
}
private String zipcodefour;
public void setZipcodefour(String zipcodefour){
this.zipcodefour = zipcodefour;
}
public String getZipcodefour(){
return this.zipcodefour;
}
private String zipcode;
public void setZipcode(String zipcode){
this.zipcode = zipcode;
}
public String getZipcode(){
return this.zipcode;
}
private String addressone;
public void setAddressone(String addressone){
this.addressone = addressone;
}
public String getAddressone(){
return this.addressone;
}
private String addresstwo;
public void setAddresstwo(String addresstwo){
this.addresstwo = addresstwo;
}
public String getAddresstwo(){
return this.addresstwo;
}
private String addresskanaone;
public void setAddresskanaone(String addresskanaone){
this.addresskanaone = addresskanaone;
}
public String getAddresskanaone(){
return this.addresskanaone;
}
private String majorzipcodethree1;
public void setMajorzipcodethree1(String majorzipcodethree1){
this.majorzipcodethree1 = majorzipcodethree1;
}
public String getMajorzipcodethree1(){
return this.majorzipcodethree1;
}
private String majorzipcodethree2;
public void setMajorzipcodethree2(String majorzipcodethree2){
this.majorzipcodethree2 = majorzipcodethree2;
}
public String getMajorzipcodethree2(){
return this.majorzipcodethree2;
}
private String majorzipcodethree3;
public void setMajorzipcodethree3(String majorzipcodethree3){
this.majorzipcodethree3 = majorzipcodethree3;
}
public String getMajorzipcodethree3(){
return this.majorzipcodethree3;
}
private String addressthree;
public void setAddressthree(String addressthree){
this.addressthree = addressthree;
}
public String getAddressthree(){
return this.addressthree;
}
private String addressfour;
public void setAddressfour(String addressfour){
this.addressfour = addressfour;
}
public String getAddressfour(){
return this.addressfour;
}
private String addressfive;
public void setAddressfive(String addressfive){
this.addressfive = addressfive;
}
public String getAddressfive(){
return this.addressfive;
}
private String addresssix;
public void setAddresssix(String addresssix){
this.addresssix = addresssix;
}
public String getAddresssix(){
return this.addresssix;
}
private String addresskanatwo;
public void setAddresskanatwo(String addresskanatwo){
this.addresskanatwo = addresskanatwo;
}
public String getAddresskanatwo(){
return this.addresskanatwo;
}
private String addresskanathree;
public void setAddresskanathree(String addresskanathree){
this.addresskanathree = addresskanathree;
}
public String getAddresskanathree(){
return this.addresskanathree;
}
private String addresskanafour;
public void setAddresskanafour(String addresskanafour){
this.addresskanafour = addresskanafour;
}
public String getAddresskanafour(){
return this.addresskanafour;
}
private String addresskanafive;
public void setAddresskanafive(String addresskanafive){
this.addresskanafive = addresskanafive;
}
public String getAddresskanafive(){
return this.addresskanafive;
}
private String addresskanasix;
public void setAddresskanasix(String addresskanasix){
this.addresskanasix = addresskanasix;
}
public String getAddresskanasix(){
return this.addresskanasix;
}
private String addresskana;
public void setAddresskana(String addresskana){
this.addresskana = addresskana;
}
public String getAddresskana(){
return this.addresskana;
}
private String mapcode;
public void setMapcode(String mapcode){
this.mapcode = mapcode;
}
public String getMapcode(){
return this.mapcode;
}
private String fax;
public void setFax(String fax){
this.fax = fax;
}
public String getFax(){
return this.fax;
}
private String mobilephone;
public void setMobilephone(String mobilephone){
this.mobilephone = mobilephone;
}
public String getMobilephone(){
return this.mobilephone;
}
private String historynum;
public void setHistorynum(String historynum){
this.historynum = historynum;
}
public String getHistorynum(){
return this.historynum;
}
private String infocodeone;
public void setInfocodeone(String infocodeone){
this.infocodeone = infocodeone;
}
public String getInfocodeone(){
return this.infocodeone;
}
private String infocodetwo;
public void setInfocodetwo(String infocodetwo){
this.infocodetwo = infocodetwo;
}
public String getInfocodetwo(){
return this.infocodetwo;
}
private String infocodethree;
public void setInfocodethree(String infocodethree){
this.infocodethree = infocodethree;
}
public String getInfocodethree(){
return this.infocodethree;
}
private String infocodefour;
public void setInfocodefour(String infocodefour){
this.infocodefour = infocodefour;
}
public String getInfocodefour(){
return this.infocodefour;
}
private String commonqualitificationtype;
public void setCommonqualitificationtype(String commonqualitificationtype){
this.commonqualitificationtype = commonqualitificationtype;
}
public String getCommonqualitificationtype(){
return this.commonqualitificationtype;
}
private String commonqualitificationtypename;
public void setCommonqualitificationtypename(String commonqualitificationtypename){
this.commonqualitificationtypename = commonqualitificationtypename;
}
public String getCommonqualitificationtypename(){
return this.commonqualitificationtypename;
}
private String tempregistrationcommontype;
public void setTempregistrationcommontype(String tempregistrationcommontype){
this.tempregistrationcommontype = tempregistrationcommontype;
}
public String getTempregistrationcommontype(){
return this.tempregistrationcommontype;
}
private String tempregistrationcommontypename;
public void setTempregistrationcommontypename(String tempregistrationcommontypename){
this.tempregistrationcommontypename = tempregistrationcommontypename;
}
public String getTempregistrationcommontypename(){
return this.tempregistrationcommontypename;
}
private String accountingcommontype;
public void setAccountingcommontype(String accountingcommontype){
this.accountingcommontype = accountingcommontype;
}
public String getAccountingcommontype(){
return this.accountingcommontype;
}
private String accontingcommontypename;
public void setAccontingcommontypename(String accontingcommontypename){
this.accontingcommontypename = accontingcommontypename;
}
public String getAccontingcommontypename(){
return this.accontingcommontypename;
}
private String centerfixedcommontype;
public void setCenterfixedcommontype(String centerfixedcommontype){
this.centerfixedcommontype = centerfixedcommontype;
}
public String getCenterfixedcommontype(){
return this.centerfixedcommontype;
}
private String centerfixedcommontypename;
public void setCenterfixedcommontypename(String centerfixedcommontypename){
this.centerfixedcommontypename = centerfixedcommontypename;
}
public String getCenterfixedcommontypename(){
return this.centerfixedcommontypename;
}
private String statuscommontype;
public void setStatuscommontype(String statuscommontype){
this.statuscommontype = statuscommontype;
}
public String getStatuscommontype(){
return this.statuscommontype;
}
private String statuscommontypename;
public void setStatuscommontypename(String statuscommontypename){
this.statuscommontypename = statuscommontypename;
}
public String getStatuscommontypename(){
return this.statuscommontypename;
}
private String indivisual;
public void setIndivisual(String indivisual){
this.indivisual = indivisual;
}
public String getIndivisual(){
return this.indivisual;
}
private String indivisualname;
public void setIndivisualname(String indivisualname){
this.indivisualname = indivisualname;
}
public String getIndivisualname(){
return this.indivisualname;
}
private String indivisualdetail;
public void setIndivisualdetail(String indivisualdetail){
this.indivisualdetail = indivisualdetail;
}
public String getIndivisualdetail(){
return this.indivisualdetail;
}
private String indivisualdetailname;
public void setIndivisualdetailname(String indivisualdetailname){
this.indivisualdetailname = indivisualdetailname;
}
public String getIndivisualdetailname(){
return this.indivisualdetailname;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
