package net.musicmug.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ArtistForm
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
private String status;
public void setStatus(String status){
this.status = status;
}
public String getStatus(){
return this.status;
}
private Integer id;
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
private String url;
public void setUrl(String url){
this.url = url;
}
public String getUrl(){
return this.url;
}
private String responsible;
public void setResponsible(String responsible){
this.responsible = responsible;
}
public String getResponsible(){
return this.responsible;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String fax;
public void setFax(String fax){
this.fax = fax;
}
public String getFax(){
return this.fax;
}
private String contact;
public void setContact(String contact){
this.contact = contact;
}
public String getContact(){
return this.contact;
}
private String kana;
public void setKana(String kana){
this.kana = kana;
}
public String getKana(){
return this.kana;
}
private int artistnum;
public void setArtistnum(int artistnum){
this.artistnum = artistnum;
}
public int getArtistnum(){
return this.artistnum;
}
private String blogrss;
public void setBlogrss(String blogrss){
this.blogrss = blogrss;
}
public String getBlogrss(){
return this.blogrss;
}
private String delicious;
public void setDelicious(String delicious){
this.delicious = delicious;
}
public String getDelicious(){
return this.delicious;
}
private String flickraccount;
public void setFlickraccount(String flickraccount){
this.flickraccount = flickraccount;
}
public String getFlickraccount(){
return this.flickraccount;
}
private String lastfmaccount;
public void setLastfmaccount(String lastfmaccount){
this.lastfmaccount = lastfmaccount;
}
public String getLastfmaccount(){
return this.lastfmaccount;
}
private String profile;
public void setProfile(String profile){
this.profile = profile;
}
public String getProfile(){
return this.profile;
}
private String ininterview;
public void setIninterview(String ininterview){
this.ininterview = ininterview;
}
public String getIninterview(){
return this.ininterview;
}
private String worksandstyle;
public void setWorksandstyle(String worksandstyle){
this.worksandstyle = worksandstyle;
}
public String getWorksandstyle(){
return this.worksandstyle;
}
private String history;
public void setHistory(String history){
this.history = history;
}
public String getHistory(){
return this.history;
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
private String typeofbusiness;
public void setTypeofbusiness(String typeofbusiness){
this.typeofbusiness = typeofbusiness;
}
public String getTypeofbusiness(){
return this.typeofbusiness;
}
private String city;
public void setCity(String city){
this.city = city;
}
public String getCity(){
return this.city;
}
private String countrystr;
public void setCountrystr(String countrystr){
this.countrystr = countrystr;
}
public String getCountrystr(){
return this.countrystr;
}
private String phone;
public void setPhone(String phone){
this.phone = phone;
}
public String getPhone(){
return this.phone;
}
private String responsiblephone;
public void setResponsiblephone(String responsiblephone){
this.responsiblephone = responsiblephone;
}
public String getResponsiblephone(){
return this.responsiblephone;
}
private String responsiblemail;
public void setResponsiblemail(String responsiblemail){
this.responsiblemail = responsiblemail;
}
public String getResponsiblemail(){
return this.responsiblemail;
}
private String awards;
public void setAwards(String awards){
this.awards = awards;
}
public String getAwards(){
return this.awards;
}
private String exhibitions;
public void setExhibitions(String exhibitions){
this.exhibitions = exhibitions;
}
public String getExhibitions(){
return this.exhibitions;
}
private String clients;
public void setClients(String clients){
this.clients = clients;
}
public String getClients(){
return this.clients;
}
private String paymentmethod;
public void setPaymentmethod(String paymentmethod){
this.paymentmethod = paymentmethod;
}
public String getPaymentmethod(){
return this.paymentmethod;
}
private String bank;
public void setBank(String bank){
this.bank = bank;
}
public String getBank(){
return this.bank;
}
private String bankbranch;
public void setBankbranch(String bankbranch){
this.bankbranch = bankbranch;
}
public String getBankbranch(){
return this.bankbranch;
}
private String brankname;
public void setBrankname(String brankname){
this.brankname = brankname;
}
public String getBrankname(){
return this.brankname;
}
private String bankaccount;
public void setBankaccount(String bankaccount){
this.bankaccount = bankaccount;
}
public String getBankaccount(){
return this.bankaccount;
}
private String bankaccountname;
public void setBankaccountname(String bankaccountname){
this.bankaccountname = bankaccountname;
}
public String getBankaccountname(){
return this.bankaccountname;
}
private String ibanno;
public void setIbanno(String ibanno){
this.ibanno = ibanno;
}
public String getIbanno(){
return this.ibanno;
}
private String swiftbicno;
public void setSwiftbicno(String swiftbicno){
this.swiftbicno = swiftbicno;
}
public String getSwiftbicno(){
return this.swiftbicno;
}
private boolean recentlyadded;
public void setRecentlyadded(boolean recentlyadded){
this.recentlyadded = recentlyadded;
}
public boolean isRecentlyadded(){
return this.recentlyadded;
}
private boolean poplular;
public void setPoplular(boolean poplular){
this.poplular = poplular;
}
public boolean isPoplular(){
return this.poplular;
}
private int poplularity;
public void setPoplularity(int poplularity){
this.poplularity = poplularity;
}
public int getPoplularity(){
return this.poplularity;
}
private String japanesename;
public void setJapanesename(String japanesename){
this.japanesename = japanesename;
}
public String getJapanesename(){
return this.japanesename;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private String basiclanguage;
public void setBasiclanguage(String basiclanguage){
this.basiclanguage = basiclanguage;
}
public String getBasiclanguage(){
return this.basiclanguage;
}
private String japaneseprofile;
public void setJapaneseprofile(String japaneseprofile){
this.japaneseprofile = japaneseprofile;
}
public String getJapaneseprofile(){
return this.japaneseprofile;
}
private String organizer;
public void setOrganizer(String organizer){
this.organizer = organizer;
}
public String getOrganizer(){
return this.organizer;
}
private String japaneseexhibitions;
public void setJapaneseexhibitions(String japaneseexhibitions){
this.japaneseexhibitions = japaneseexhibitions;
}
public String getJapaneseexhibitions(){
return this.japaneseexhibitions;
}
private String japanesetypeofbusiness;
public void setJapanesetypeofbusiness(String japanesetypeofbusiness){
this.japanesetypeofbusiness = japanesetypeofbusiness;
}
public String getJapanesetypeofbusiness(){
return this.japanesetypeofbusiness;
}
private String japaneseclients;
public void setJapaneseclients(String japaneseclients){
this.japaneseclients = japaneseclients;
}
public String getJapaneseclients(){
return this.japaneseclients;
}
private String japaneseorganizer;
public void setJapaneseorganizer(String japaneseorganizer){
this.japaneseorganizer = japaneseorganizer;
}
public String getJapaneseorganizer(){
return this.japaneseorganizer;
}
private String japaneseaddress;
public void setJapaneseaddress(String japaneseaddress){
this.japaneseaddress = japaneseaddress;
}
public String getJapaneseaddress(){
return this.japaneseaddress;
}
private String japaneseawards;
public void setJapaneseawards(String japaneseawards){
this.japaneseawards = japaneseawards;
}
public String getJapaneseawards(){
return this.japaneseawards;
}
private String japaneseresponsible;
public void setJapaneseresponsible(String japaneseresponsible){
this.japaneseresponsible = japaneseresponsible;
}
public String getJapaneseresponsible(){
return this.japaneseresponsible;
}
private String japanesebank;
public void setJapanesebank(String japanesebank){
this.japanesebank = japanesebank;
}
public String getJapanesebank(){
return this.japanesebank;
}
private String japanesebranchname;
public void setJapanesebranchname(String japanesebranchname){
this.japanesebranchname = japanesebranchname;
}
public String getJapanesebranchname(){
return this.japanesebranchname;
}
private String japanesebankaccountname;
public void setJapanesebankaccountname(String japanesebankaccountname){
this.japanesebankaccountname = japanesebankaccountname;
}
public String getJapanesebankaccountname(){
return this.japanesebankaccountname;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	recentlyadded =false;
	poplular =false;
}
}
