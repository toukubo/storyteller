package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class J2eeStoryForm
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
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Date startdate;
public void setStartdate(Date startdate){
this.startdate = startdate;
}
public Date getStartdate(){
return this.startdate;
}
private boolean startdateIsValid = false;
public void setStartdateIsValid(boolean startdateIsValid){
this.startdateIsValid = startdateIsValid;
}
public boolean isStartdateIsValid(){
return this.startdateIsValid;
}
private java.lang.String startdateAsRawString ="";
public java.lang.String getStartdateAsString(){
    return (startdate== null) ? null : format.format(startdate);
}
public void setStartdateAsString(java.lang.String startdate){
	this.startdateIsValid = true;
	this.startdateAsRawString = startdate;
try{
		if(StringUtils.isNotBlank(startdate)){ format.parse(startdate);}
}catch (java.text.ParseException pe){
this.startdateIsValid = false;
}
	if(startdateIsValid){
		try {
			this.startdate = (org.apache.commons.lang.StringUtils.isBlank(startdate)) ? null : format.parse(startdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setStartdateAsRawString(java.lang.String startdate){
	this.startdateAsRawString = startdate;
}

public String getStartdateAsRawString(){
return this.startdateAsRawString;
}
private int requiredstorytellerhour;
public void setRequiredstorytellerhour(int requiredstorytellerhour){
this.requiredstorytellerhour = requiredstorytellerhour;
}
public int getRequiredstorytellerhour(){
return this.requiredstorytellerhour;
}
private int requiredteamhour;
public void setRequiredteamhour(int requiredteamhour){
this.requiredteamhour = requiredteamhour;
}
public int getRequiredteamhour(){
return this.requiredteamhour;
}
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private Date enddate;
public void setEnddate(Date enddate){
this.enddate = enddate;
}
public Date getEnddate(){
return this.enddate;
}
private boolean enddateIsValid = false;
public void setEnddateIsValid(boolean enddateIsValid){
this.enddateIsValid = enddateIsValid;
}
public boolean isEnddateIsValid(){
return this.enddateIsValid;
}
private java.lang.String enddateAsRawString ="";
public java.lang.String getEnddateAsString(){
    return (enddate== null) ? null : format.format(enddate);
}
public void setEnddateAsString(java.lang.String enddate){
	this.enddateIsValid = true;
	this.enddateAsRawString = enddate;
try{
		if(StringUtils.isNotBlank(enddate)){ format.parse(enddate);}
}catch (java.text.ParseException pe){
this.enddateIsValid = false;
}
	if(enddateIsValid){
		try {
			this.enddate = (org.apache.commons.lang.StringUtils.isBlank(enddate)) ? null : format.parse(enddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setEnddateAsRawString(java.lang.String enddate){
	this.enddateAsRawString = enddate;
}

public String getEnddateAsRawString(){
return this.enddateAsRawString;
}
private String strutsconfigcontent;
public void setStrutsconfigcontent(String strutsconfigcontent){
this.strutsconfigcontent = strutsconfigcontent;
}
public String getStrutsconfigcontent(){
return this.strutsconfigcontent;
}
private Integer andromdaCoreJarFile;
public void setAndromdaCoreJarFile(Integer andromdaCoreJarFile){
this.andromdaCoreJarFile = andromdaCoreJarFile;
}
public Integer getAndromdaCoreJarFile(){
return this.andromdaCoreJarFile;
}
private String story;
public void setStory(String story){
this.story = story;
}
public String getStory(){
return this.story;
}
private int totalcost;
public void setTotalcost(int totalcost){
this.totalcost = totalcost;
}
public int getTotalcost(){
return this.totalcost;
}
private Integer client;
public void setClient(Integer client){
this.client = client;
}
public Integer getClient(){
return this.client;
}
private int income;
public void setIncome(int income){
this.income = income;
}
public int getIncome(){
return this.income;
}
private int profit;
public void setProfit(int profit){
this.profit = profit;
}
public int getProfit(){
return this.profit;
}
private int devidentforteam;
public void setDevidentforteam(int devidentforteam){
this.devidentforteam = devidentforteam;
}
public int getDevidentforteam(){
return this.devidentforteam;
}
private boolean tellerapp;
public void setTellerapp(boolean tellerapp){
this.tellerapp = tellerapp;
}
public boolean isTellerapp(){
return this.tellerapp;
}
private String basecampurl;
public void setBasecampurl(String basecampurl){
this.basecampurl = basecampurl;
}
public String getBasecampurl(){
return this.basecampurl;
}
private String basecampapihash;
public void setBasecampapihash(String basecampapihash){
this.basecampapihash = basecampapihash;
}
public String getBasecampapihash(){
return this.basecampapihash;
}
private int dificulty;
public void setDificulty(int dificulty){
this.dificulty = dificulty;
}
public int getDificulty(){
return this.dificulty;
}
private boolean salerequired;
public void setSalerequired(boolean salerequired){
this.salerequired = salerequired;
}
public boolean isSalerequired(){
return this.salerequired;
}
private boolean offshorable;
public void setOffshorable(boolean offshorable){
this.offshorable = offshorable;
}
public boolean isOffshorable(){
return this.offshorable;
}
private int consultingrate;
public void setConsultingrate(int consultingrate){
this.consultingrate = consultingrate;
}
public int getConsultingrate(){
return this.consultingrate;
}
private boolean contiuningbusiness;
public void setContiuningbusiness(boolean contiuningbusiness){
this.contiuningbusiness = contiuningbusiness;
}
public boolean isContiuningbusiness(){
return this.contiuningbusiness;
}
private int advertisingrate;
public void setAdvertisingrate(int advertisingrate){
this.advertisingrate = advertisingrate;
}
public int getAdvertisingrate(){
return this.advertisingrate;
}
private int price_per_sentences;
public void setPrice_per_sentences(int price_per_sentences){
this.price_per_sentences = price_per_sentences;
}
public int getPrice_per_sentences(){
return this.price_per_sentences;
}
private Integer contribute;
public void setContribute(Integer contribute){
this.contribute = contribute;
}
public Integer getContribute(){
return this.contribute;
}
private String interfacespecsurl;
public void setInterfacespecsurl(String interfacespecsurl){
this.interfacespecsurl = interfacespecsurl;
}
public String getInterfacespecsurl(){
return this.interfacespecsurl;
}
private int discountpercentage;
public void setDiscountpercentage(int discountpercentage){
this.discountpercentage = discountpercentage;
}
public int getDiscountpercentage(){
return this.discountpercentage;
}
private String japanese;
public void setJapanese(String japanese){
this.japanese = japanese;
}
public String getJapanese(){
return this.japanese;
}
private boolean covered;
public void setCovered(boolean covered){
this.covered = covered;
}
public boolean isCovered(){
return this.covered;
}
private boolean active;
public void setActive(boolean active){
this.active = active;
}
public boolean isActive(){
return this.active;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	tellerapp =false;
	salerequired =false;
	offshorable =false;
	contiuningbusiness =false;
	covered =false;
	active =false;
}
}
