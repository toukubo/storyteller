package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ReservationForm
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
private boolean payed;
public void setPayed(boolean payed){
this.payed = payed;
}
public boolean isPayed(){
return this.payed;
}
private Integer unit;
public void setUnit(Integer unit){
this.unit = unit;
}
public Integer getUnit(){
return this.unit;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private String comment;
public void setComment(String comment){
this.comment = comment;
}
public String getComment(){
return this.comment;
}
private String service;
public void setService(String service){
this.service = service;
}
public String getService(){
return this.service;
}
private Date startTime;
public void setStartTime(Date startTime){
this.startTime = startTime;
}
public Date getStartTime(){
return this.startTime;
}
private boolean startTimeIsValid = false;
public void setStartTimeIsValid(boolean startTimeIsValid){
this.startTimeIsValid = startTimeIsValid;
}
public boolean isStartTimeIsValid(){
return this.startTimeIsValid;
}
private java.lang.String startTimeAsRawString ="";
public java.lang.String getStartTimeAsString(){
    return (startTime== null) ? null : format.format(startTime);
}
public void setStartTimeAsString(java.lang.String startTime){
	this.startTimeIsValid = true;
	this.startTimeAsRawString = startTime;
try{
		if(StringUtils.isNotBlank(startTime)){ format.parse(startTime);}
}catch (java.text.ParseException pe){
this.startTimeIsValid = false;
}
	if(startTimeIsValid){
		try {
			this.startTime = (org.apache.commons.lang.StringUtils.isBlank(startTime)) ? null : format.parse(startTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setStartTimeAsRawString(java.lang.String startTime){
	this.startTimeAsRawString = startTime;
}

public String getStartTimeAsRawString(){
return this.startTimeAsRawString;
}
private Integer plan;
public void setPlan(Integer plan){
this.plan = plan;
}
public Integer getPlan(){
return this.plan;
}
private Boolean callTaxi;
public void setCallTaxi(Boolean callTaxi){
this.callTaxi = callTaxi;
}
public Boolean getCallTaxi(){
return this.callTaxi;
}
private String atmosphere;
public void setAtmosphere(String atmosphere){
this.atmosphere = atmosphere;
}
public String getAtmosphere(){
return this.atmosphere;
}
private String foods;
public void setFoods(String foods){
this.foods = foods;
}
public String getFoods(){
return this.foods;
}
private String notes;
public void setNotes(String notes){
this.notes = notes;
}
public String getNotes(){
return this.notes;
}
private Integer numCustomers;
public void setNumCustomers(Integer numCustomers){
this.numCustomers = numCustomers;
}
public Integer getNumCustomers(){
return this.numCustomers;
}
private Integer numMaleCustomers;
public void setNumMaleCustomers(Integer numMaleCustomers){
this.numMaleCustomers = numMaleCustomers;
}
public Integer getNumMaleCustomers(){
return this.numMaleCustomers;
}
private Integer numFemaleCustomers;
public void setNumFemaleCustomers(Integer numFemaleCustomers){
this.numFemaleCustomers = numFemaleCustomers;
}
public Integer getNumFemaleCustomers(){
return this.numFemaleCustomers;
}
private String visitorName;
public void setVisitorName(String visitorName){
this.visitorName = visitorName;
}
public String getVisitorName(){
return this.visitorName;
}
private String visitorNameKana;
public void setVisitorNameKana(String visitorNameKana){
this.visitorNameKana = visitorNameKana;
}
public String getVisitorNameKana(){
return this.visitorNameKana;
}
private String visitorPhoneNumber;
public void setVisitorPhoneNumber(String visitorPhoneNumber){
this.visitorPhoneNumber = visitorPhoneNumber;
}
public String getVisitorPhoneNumber(){
return this.visitorPhoneNumber;
}
private String materialDemand;
public void setMaterialDemand(String materialDemand){
this.materialDemand = materialDemand;
}
public String getMaterialDemand(){
return this.materialDemand;
}
private String otherDemand;
public void setOtherDemand(String otherDemand){
this.otherDemand = otherDemand;
}
public String getOtherDemand(){
return this.otherDemand;
}
private Date endTime;
public void setEndTime(Date endTime){
this.endTime = endTime;
}
public Date getEndTime(){
return this.endTime;
}
private boolean endTimeIsValid = false;
public void setEndTimeIsValid(boolean endTimeIsValid){
this.endTimeIsValid = endTimeIsValid;
}
public boolean isEndTimeIsValid(){
return this.endTimeIsValid;
}
private java.lang.String endTimeAsRawString ="";
public java.lang.String getEndTimeAsString(){
    return (endTime== null) ? null : format.format(endTime);
}
public void setEndTimeAsString(java.lang.String endTime){
	this.endTimeIsValid = true;
	this.endTimeAsRawString = endTime;
try{
		if(StringUtils.isNotBlank(endTime)){ format.parse(endTime);}
}catch (java.text.ParseException pe){
this.endTimeIsValid = false;
}
	if(endTimeIsValid){
		try {
			this.endTime = (org.apache.commons.lang.StringUtils.isBlank(endTime)) ? null : format.parse(endTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setEndTimeAsRawString(java.lang.String endTime){
	this.endTimeAsRawString = endTime;
}

public String getEndTimeAsRawString(){
return this.endTimeAsRawString;
}
private Boolean needReceipt;
public void setNeedReceipt(Boolean needReceipt){
this.needReceipt = needReceipt;
}
public Boolean getNeedReceipt(){
return this.needReceipt;
}
private String receiptDirection;
public void setReceiptDirection(String receiptDirection){
this.receiptDirection = receiptDirection;
}
public String getReceiptDirection(){
return this.receiptDirection;
}
private String proviso;
public void setProviso(String proviso){
this.proviso = proviso;
}
public String getProviso(){
return this.proviso;
}
private Date reservationDate;
public void setReservationDate(Date reservationDate){
this.reservationDate = reservationDate;
}
public Date getReservationDate(){
return this.reservationDate;
}
private boolean reservationDateIsValid = false;
public void setReservationDateIsValid(boolean reservationDateIsValid){
this.reservationDateIsValid = reservationDateIsValid;
}
public boolean isReservationDateIsValid(){
return this.reservationDateIsValid;
}
private java.lang.String reservationDateAsRawString ="";
public java.lang.String getReservationDateAsString(){
    return (reservationDate== null) ? null : format.format(reservationDate);
}
public void setReservationDateAsString(java.lang.String reservationDate){
	this.reservationDateIsValid = true;
	this.reservationDateAsRawString = reservationDate;
try{
		if(StringUtils.isNotBlank(reservationDate)){ format.parse(reservationDate);}
}catch (java.text.ParseException pe){
this.reservationDateIsValid = false;
}
	if(reservationDateIsValid){
		try {
			this.reservationDate = (org.apache.commons.lang.StringUtils.isBlank(reservationDate)) ? null : format.parse(reservationDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setReservationDateAsRawString(java.lang.String reservationDate){
	this.reservationDateAsRawString = reservationDate;
}

public String getReservationDateAsRawString(){
return this.reservationDateAsRawString;
}
private String prepared;
public void setPrepared(String prepared){
this.prepared = prepared;
}
public String getPrepared(){
return this.prepared;
}
private int earnedPoint;
public void setEarnedPoint(int earnedPoint){
this.earnedPoint = earnedPoint;
}
public int getEarnedPoint(){
return this.earnedPoint;
}
private Integer planCampaign;
public void setPlanCampaign(Integer planCampaign){
this.planCampaign = planCampaign;
}
public Integer getPlanCampaign(){
return this.planCampaign;
}
private Integer questionnaire;
public void setQuestionnaire(Integer questionnaire){
this.questionnaire = questionnaire;
}
public Integer getQuestionnaire(){
return this.questionnaire;
}
private Integer reservationHistory;
public void setReservationHistory(Integer reservationHistory){
this.reservationHistory = reservationHistory;
}
public Integer getReservationHistory(){
return this.reservationHistory;
}
private Integer cancelType;
public void setCancelType(Integer cancelType){
this.cancelType = cancelType;
}
public Integer getCancelType(){
return this.cancelType;
}
private Integer reservationStock;
public void setReservationStock(Integer reservationStock){
this.reservationStock = reservationStock;
}
public Integer getReservationStock(){
return this.reservationStock;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	payed =false;
}
}
