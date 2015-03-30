package net.startbahn.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PublicUserForm
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
private String url;
public void setUrl(String url){
this.url = url;
}
public String getUrl(){
return this.url;
}
private int poplularity;
public void setPoplularity(int poplularity){
this.poplularity = poplularity;
}
public int getPoplularity(){
return this.poplularity;
}
private boolean recentlyadded;
public void setRecentlyadded(boolean recentlyadded){
this.recentlyadded = recentlyadded;
}
public boolean isRecentlyadded(){
return this.recentlyadded;
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
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private Integer artist;
public void setArtist(Integer artist){
this.artist = artist;
}
public Integer getArtist(){
return this.artist;
}
private boolean poplular;
public void setPoplular(boolean poplular){
this.poplular = poplular;
}
public boolean isPoplular(){
return this.poplular;
}
private String contact;
public void setContact(String contact){
this.contact = contact;
}
public String getContact(){
return this.contact;
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
private String clients;
public void setClients(String clients){
this.clients = clients;
}
public String getClients(){
return this.clients;
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
private String branchaddress;
public void setBranchaddress(String branchaddress){
this.branchaddress = branchaddress;
}
public String getBranchaddress(){
return this.branchaddress;
}
private Integer collector;
public void setCollector(Integer collector){
this.collector = collector;
}
public Integer getCollector(){
return this.collector;
}
private Integer topimageid;
public void setTopimageid(Integer topimageid){
this.topimageid = topimageid;
}
public Integer getTopimageid(){
return this.topimageid;
}
private String favoritegenre;
public void setFavoritegenre(String favoritegenre){
this.favoritegenre = favoritegenre;
}
public String getFavoritegenre(){
return this.favoritegenre;
}
private String belonging;
public void setBelonging(String belonging){
this.belonging = belonging;
}
public String getBelonging(){
return this.belonging;
}
private String birthplace;
public void setBirthplace(String birthplace){
this.birthplace = birthplace;
}
public String getBirthplace(){
return this.birthplace;
}
private Integer reviewer;
public void setReviewer(Integer reviewer){
this.reviewer = reviewer;
}
public Integer getReviewer(){
return this.reviewer;
}
private String name;
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
private Integer attachment;
public void setAttachment(Integer attachment){
this.attachment = attachment;
}
public Integer getAttachment(){
return this.attachment;
}
private boolean male;
public void setMale(boolean male){
this.male = male;
}
public boolean isMale(){
return this.male;
}
private String onewordmessage;
public void setOnewordmessage(String onewordmessage){
this.onewordmessage = onewordmessage;
}
public String getOnewordmessage(){
return this.onewordmessage;
}
private String displayname;
public void setDisplayname(String displayname){
this.displayname = displayname;
}
public String getDisplayname(){
return this.displayname;
}
private String css;
public void setCss(String css){
this.css = css;
}
public String getCss(){
return this.css;
}
private boolean superuser;
public void setSuperuser(boolean superuser){
this.superuser = superuser;
}
public boolean isSuperuser(){
return this.superuser;
}
private Integer mpaMarking;
public void setMpaMarking(Integer mpaMarking){
this.mpaMarking = mpaMarking;
}
public Integer getMpaMarking(){
return this.mpaMarking;
}
private Integer invitation;
public void setInvitation(Integer invitation){
this.invitation = invitation;
}
public Integer getInvitation(){
return this.invitation;
}
private boolean gettingnomalnotification;
public void setGettingnomalnotification(boolean gettingnomalnotification){
this.gettingnomalnotification = gettingnomalnotification;
}
public boolean isGettingnomalnotification(){
return this.gettingnomalnotification;
}
private boolean gettingpriceupdatenotification;
public void setGettingpriceupdatenotification(boolean gettingpriceupdatenotification){
this.gettingpriceupdatenotification = gettingpriceupdatenotification;
}
public boolean isGettingpriceupdatenotification(){
return this.gettingpriceupdatenotification;
}
private boolean gettingauctionendingnotification;
public void setGettingauctionendingnotification(boolean gettingauctionendingnotification){
this.gettingauctionendingnotification = gettingauctionendingnotification;
}
public boolean isGettingauctionendingnotification(){
return this.gettingauctionendingnotification;
}
private Integer prefecture;
public void setPrefecture(Integer prefecture){
this.prefecture = prefecture;
}
public Integer getPrefecture(){
return this.prefecture;
}
private int remaining;
public void setRemaining(int remaining){
this.remaining = remaining;
}
public int getRemaining(){
return this.remaining;
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
	male =false;
	superuser =false;
	gettingnomalnotification =false;
	gettingpriceupdatenotification =false;
	gettingauctionendingnotification =false;
}
}
