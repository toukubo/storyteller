package net.startbahn.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AuctionForm
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
private Integer work;
public void setWork(Integer work){
this.work = work;
}
public Integer getWork(){
return this.work;
}
private Integer purchase;
public void setPurchase(Integer purchase){
this.purchase = purchase;
}
public Integer getPurchase(){
return this.purchase;
}
private Integer collector;
public void setCollector(Integer collector){
this.collector = collector;
}
public Integer getCollector(){
return this.collector;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
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
private int currentprice;
public void setCurrentprice(int currentprice){
this.currentprice = currentprice;
}
public int getCurrentprice(){
return this.currentprice;
}
private int startprice;
public void setStartprice(int startprice){
this.startprice = startprice;
}
public int getStartprice(){
return this.startprice;
}
private boolean active;
public void setActive(boolean active){
this.active = active;
}
public boolean isActive(){
return this.active;
}
private Integer event;
public void setEvent(Integer event){
this.event = event;
}
public Integer getEvent(){
return this.event;
}
private int preferedprice;
public void setPreferedprice(int preferedprice){
this.preferedprice = preferedprice;
}
public int getPreferedprice(){
return this.preferedprice;
}
private Date auctionenddate;
public void setAuctionenddate(Date auctionenddate){
this.auctionenddate = auctionenddate;
}
public Date getAuctionenddate(){
return this.auctionenddate;
}
private boolean auctionenddateIsValid = false;
public void setAuctionenddateIsValid(boolean auctionenddateIsValid){
this.auctionenddateIsValid = auctionenddateIsValid;
}
public boolean isAuctionenddateIsValid(){
return this.auctionenddateIsValid;
}
private java.lang.String auctionenddateAsRawString ="";
public java.lang.String getAuctionenddateAsString(){
    return (auctionenddate== null) ? null : format.format(auctionenddate);
}
public void setAuctionenddateAsString(java.lang.String auctionenddate){
	this.auctionenddateIsValid = true;
	this.auctionenddateAsRawString = auctionenddate;
try{
		if(StringUtils.isNotBlank(auctionenddate)){ format.parse(auctionenddate);}
}catch (java.text.ParseException pe){
this.auctionenddateIsValid = false;
}
	if(auctionenddateIsValid){
		try {
			this.auctionenddate = (org.apache.commons.lang.StringUtils.isBlank(auctionenddate)) ? null : format.parse(auctionenddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setAuctionenddateAsRawString(java.lang.String auctionenddate){
	this.auctionenddateAsRawString = auctionenddate;
}

public String getAuctionenddateAsRawString(){
return this.auctionenddateAsRawString;
}
private int minimumprice;
public void setMinimumprice(int minimumprice){
this.minimumprice = minimumprice;
}
public int getMinimumprice(){
return this.minimumprice;
}
private String attachmentdescription;
public void setAttachmentdescription(String attachmentdescription){
this.attachmentdescription = attachmentdescription;
}
public String getAttachmentdescription(){
return this.attachmentdescription;
}
private String senderpref;
public void setSenderpref(String senderpref){
this.senderpref = senderpref;
}
public String getSenderpref(){
return this.senderpref;
}
private String sendercity;
public void setSendercity(String sendercity){
this.sendercity = sendercity;
}
public String getSendercity(){
return this.sendercity;
}
private String deliveryandpaymentmethod;
public void setDeliveryandpaymentmethod(String deliveryandpaymentmethod){
this.deliveryandpaymentmethod = deliveryandpaymentmethod;
}
public String getDeliveryandpaymentmethod(){
return this.deliveryandpaymentmethod;
}
private String bidderrestriction;
public void setBidderrestriction(String bidderrestriction){
this.bidderrestriction = bidderrestriction;
}
public String getBidderrestriction(){
return this.bidderrestriction;
}
private boolean pub;
public void setPub(boolean pub){
this.pub = pub;
}
public boolean isPub(){
return this.pub;
}
private boolean automatic;
public void setAutomatic(boolean automatic){
this.automatic = automatic;
}
public boolean isAutomatic(){
return this.automatic;
}
private String choisecriteria;
public void setChoisecriteria(String choisecriteria){
this.choisecriteria = choisecriteria;
}
public String getChoisecriteria(){
return this.choisecriteria;
}
private boolean immediatedecision;
public void setImmediatedecision(boolean immediatedecision){
this.immediatedecision = immediatedecision;
}
public boolean isImmediatedecision(){
return this.immediatedecision;
}
private int immediatedecisionprice;
public void setImmediatedecisionprice(int immediatedecisionprice){
this.immediatedecisionprice = immediatedecisionprice;
}
public int getImmediatedecisionprice(){
return this.immediatedecisionprice;
}
private int bettingunit;
public void setBettingunit(int bettingunit){
this.bettingunit = bettingunit;
}
public int getBettingunit(){
return this.bettingunit;
}
private int auctioneerevaluation;
public void setAuctioneerevaluation(int auctioneerevaluation){
this.auctioneerevaluation = auctioneerevaluation;
}
public int getAuctioneerevaluation(){
return this.auctioneerevaluation;
}
private int buyerevaluation;
public void setBuyerevaluation(int buyerevaluation){
this.buyerevaluation = buyerevaluation;
}
public int getBuyerevaluation(){
return this.buyerevaluation;
}
private String auctioneerevaluationdesc;
public void setAuctioneerevaluationdesc(String auctioneerevaluationdesc){
this.auctioneerevaluationdesc = auctioneerevaluationdesc;
}
public String getAuctioneerevaluationdesc(){
return this.auctioneerevaluationdesc;
}
private String buyerevaluationdesc;
public void setBuyerevaluationdesc(String buyerevaluationdesc){
this.buyerevaluationdesc = buyerevaluationdesc;
}
public String getBuyerevaluationdesc(){
return this.buyerevaluationdesc;
}
private Integer firstimage;
public void setFirstimage(Integer firstimage){
this.firstimage = firstimage;
}
public Integer getFirstimage(){
return this.firstimage;
}
private Integer secoundimage;
public void setSecoundimage(Integer secoundimage){
this.secoundimage = secoundimage;
}
public Integer getSecoundimage(){
return this.secoundimage;
}
private Integer signimage;
public void setSignimage(Integer signimage){
this.signimage = signimage;
}
public Integer getSignimage(){
return this.signimage;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	active =false;
	pub =false;
	automatic =false;
	immediatedecision =false;
}
}
