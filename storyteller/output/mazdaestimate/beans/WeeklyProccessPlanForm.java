package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class WeeklyProccessPlanForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer shop;
public void setShop(Integer shop){
this.shop = shop;
}
public Integer getShop(){
return this.shop;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Date todate;
public void setTodate(Date todate){
this.todate = todate;
}
public Date getTodate(){
return this.todate;
}
private boolean todateIsValid = false;
public void setTodateIsValid(boolean todateIsValid){
this.todateIsValid = todateIsValid;
}
public boolean isTodateIsValid(){
return this.todateIsValid;
}
private java.lang.String todateAsRawString ="";
public java.lang.String getTodateAsString(){
    return (todate== null) ? null : format.format(todate);
}
public void setTodateAsString(java.lang.String todate){
	this.todateIsValid = true;
	this.todateAsRawString = todate;
try{
		if(StringUtils.isNotBlank(todate)){ format.parse(todate);}
}catch (java.text.ParseException pe){
this.todateIsValid = false;
}
	if(todateIsValid){
		try {
			this.todate = (org.apache.commons.lang.StringUtils.isBlank(todate)) ? null : format.parse(todate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTodateAsRawString(java.lang.String todate){
	this.todateAsRawString = todate;
}

public String getTodateAsRawString(){
return this.todateAsRawString;
}
private Date fromdate;
public void setFromdate(Date fromdate){
this.fromdate = fromdate;
}
public Date getFromdate(){
return this.fromdate;
}
private boolean fromdateIsValid = false;
public void setFromdateIsValid(boolean fromdateIsValid){
this.fromdateIsValid = fromdateIsValid;
}
public boolean isFromdateIsValid(){
return this.fromdateIsValid;
}
private java.lang.String fromdateAsRawString ="";
public java.lang.String getFromdateAsString(){
    return (fromdate== null) ? null : format.format(fromdate);
}
public void setFromdateAsString(java.lang.String fromdate){
	this.fromdateIsValid = true;
	this.fromdateAsRawString = fromdate;
try{
		if(StringUtils.isNotBlank(fromdate)){ format.parse(fromdate);}
}catch (java.text.ParseException pe){
this.fromdateIsValid = false;
}
	if(fromdateIsValid){
		try {
			this.fromdate = (org.apache.commons.lang.StringUtils.isBlank(fromdate)) ? null : format.parse(fromdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setFromdateAsRawString(java.lang.String fromdate){
	this.fromdateAsRawString = fromdate;
}

public String getFromdateAsRawString(){
return this.fromdateAsRawString;
}
private Integer promotionalcars;
public void setPromotionalcars(Integer promotionalcars){
this.promotionalcars = promotionalcars;
}
public Integer getPromotionalcars(){
return this.promotionalcars;
}
private Integer newclientscars;
public void setNewclientscars(Integer newclientscars){
this.newclientscars = newclientscars;
}
public Integer getNewclientscars(){
return this.newclientscars;
}
private Integer inspectionproposal;
public void setInspectionproposal(Integer inspectionproposal){
this.inspectionproposal = inspectionproposal;
}
public Integer getInspectionproposal(){
return this.inspectionproposal;
}
private Integer inspectiontarget;
public void setInspectiontarget(Integer inspectiontarget){
this.inspectiontarget = inspectiontarget;
}
public Integer getInspectiontarget(){
return this.inspectiontarget;
}
private Integer inspectionstorefront;
public void setInspectionstorefront(Integer inspectionstorefront){
this.inspectionstorefront = inspectionstorefront;
}
public Integer getInspectionstorefront(){
return this.inspectionstorefront;
}
private Integer inspectionbc;
public void setInspectionbc(Integer inspectionbc){
this.inspectionbc = inspectionbc;
}
public Integer getInspectionbc(){
return this.inspectionbc;
}
private Integer inspectionappraisal;
public void setInspectionappraisal(Integer inspectionappraisal){
this.inspectionappraisal = inspectionappraisal;
}
public Integer getInspectionappraisal(){
return this.inspectionappraisal;
}
private Integer inspectiondemo;
public void setInspectiondemo(Integer inspectiondemo){
this.inspectiondemo = inspectiondemo;
}
public Integer getInspectiondemo(){
return this.inspectiondemo;
}
private Integer inspectionabhot;
public void setInspectionabhot(Integer inspectionabhot){
this.inspectionabhot = inspectionabhot;
}
public Integer getInspectionabhot(){
return this.inspectionabhot;
}
private Integer oldmail;
public void setOldmail(Integer oldmail){
this.oldmail = oldmail;
}
public Integer getOldmail(){
return this.oldmail;
}
private Integer inspectiondm;
public void setInspectiondm(Integer inspectiondm){
this.inspectiondm = inspectiondm;
}
public Integer getInspectiondm(){
return this.inspectiondm;
}
private Integer inspectiontc;
public void setInspectiontc(Integer inspectiontc){
this.inspectiontc = inspectiontc;
}
public Integer getInspectiontc(){
return this.inspectiontc;
}
private Integer inspectionvisit;
public void setInspectionvisit(Integer inspectionvisit){
this.inspectionvisit = inspectionvisit;
}
public Integer getInspectionvisit(){
return this.inspectionvisit;
}
private Integer inspectionslc;
public void setInspectionslc(Integer inspectionslc){
this.inspectionslc = inspectionslc;
}
public Integer getInspectionslc(){
return this.inspectionslc;
}
private Integer inspectionmail;
public void setInspectionmail(Integer inspectionmail){
this.inspectionmail = inspectionmail;
}
public Integer getInspectionmail(){
return this.inspectionmail;
}
private Integer oldtarget;
public void setOldtarget(Integer oldtarget){
this.oldtarget = oldtarget;
}
public Integer getOldtarget(){
return this.oldtarget;
}
private Integer olddm;
public void setOlddm(Integer olddm){
this.olddm = olddm;
}
public Integer getOlddm(){
return this.olddm;
}
private Integer oldtc;
public void setOldtc(Integer oldtc){
this.oldtc = oldtc;
}
public Integer getOldtc(){
return this.oldtc;
}
private Integer oldvisit;
public void setOldvisit(Integer oldvisit){
this.oldvisit = oldvisit;
}
public Integer getOldvisit(){
return this.oldvisit;
}
private Integer oldslc;
public void setOldslc(Integer oldslc){
this.oldslc = oldslc;
}
public Integer getOldslc(){
return this.oldslc;
}
private Integer oldproposal;
public void setOldproposal(Integer oldproposal){
this.oldproposal = oldproposal;
}
public Integer getOldproposal(){
return this.oldproposal;
}
private Integer oldstorefront;
public void setOldstorefront(Integer oldstorefront){
this.oldstorefront = oldstorefront;
}
public Integer getOldstorefront(){
return this.oldstorefront;
}
private Integer oldbc;
public void setOldbc(Integer oldbc){
this.oldbc = oldbc;
}
public Integer getOldbc(){
return this.oldbc;
}
private Integer olddemo;
public void setOlddemo(Integer olddemo){
this.olddemo = olddemo;
}
public Integer getOlddemo(){
return this.olddemo;
}
private Integer oldappraisal;
public void setOldappraisal(Integer oldappraisal){
this.oldappraisal = oldappraisal;
}
public Integer getOldappraisal(){
return this.oldappraisal;
}
private Integer oldabhot;
public void setOldabhot(Integer oldabhot){
this.oldabhot = oldabhot;
}
public Integer getOldabhot(){
return this.oldabhot;
}
private Integer prioritytarget;
public void setPrioritytarget(Integer prioritytarget){
this.prioritytarget = prioritytarget;
}
public Integer getPrioritytarget(){
return this.prioritytarget;
}
private Integer prioritytc;
public void setPrioritytc(Integer prioritytc){
this.prioritytc = prioritytc;
}
public Integer getPrioritytc(){
return this.prioritytc;
}
private Integer priorityvisit;
public void setPriorityvisit(Integer priorityvisit){
this.priorityvisit = priorityvisit;
}
public Integer getPriorityvisit(){
return this.priorityvisit;
}
private Integer priorityslc;
public void setPriorityslc(Integer priorityslc){
this.priorityslc = priorityslc;
}
public Integer getPriorityslc(){
return this.priorityslc;
}
private Integer priorityproposal;
public void setPriorityproposal(Integer priorityproposal){
this.priorityproposal = priorityproposal;
}
public Integer getPriorityproposal(){
return this.priorityproposal;
}
private Integer prioritymail;
public void setPrioritymail(Integer prioritymail){
this.prioritymail = prioritymail;
}
public Integer getPrioritymail(){
return this.prioritymail;
}
private Integer prioritystorefront;
public void setPrioritystorefront(Integer prioritystorefront){
this.prioritystorefront = prioritystorefront;
}
public Integer getPrioritystorefront(){
return this.prioritystorefront;
}
private Integer prioritybc;
public void setPrioritybc(Integer prioritybc){
this.prioritybc = prioritybc;
}
public Integer getPrioritybc(){
return this.prioritybc;
}
private Integer prioritydm;
public void setPrioritydm(Integer prioritydm){
this.prioritydm = prioritydm;
}
public Integer getPrioritydm(){
return this.prioritydm;
}
private Integer prioritydemo;
public void setPrioritydemo(Integer prioritydemo){
this.prioritydemo = prioritydemo;
}
public Integer getPrioritydemo(){
return this.prioritydemo;
}
private Integer newclientsdm;
public void setNewclientsdm(Integer newclientsdm){
this.newclientsdm = newclientsdm;
}
public Integer getNewclientsdm(){
return this.newclientsdm;
}
private Integer newclientsslc;
public void setNewclientsslc(Integer newclientsslc){
this.newclientsslc = newclientsslc;
}
public Integer getNewclientsslc(){
return this.newclientsslc;
}
private Integer newclientsmail;
public void setNewclientsmail(Integer newclientsmail){
this.newclientsmail = newclientsmail;
}
public Integer getNewclientsmail(){
return this.newclientsmail;
}
private Integer newclientsstorefront;
public void setNewclientsstorefront(Integer newclientsstorefront){
this.newclientsstorefront = newclientsstorefront;
}
public Integer getNewclientsstorefront(){
return this.newclientsstorefront;
}
private Integer newclientsbc;
public void setNewclientsbc(Integer newclientsbc){
this.newclientsbc = newclientsbc;
}
public Integer getNewclientsbc(){
return this.newclientsbc;
}
private Integer newclientsdemo;
public void setNewclientsdemo(Integer newclientsdemo){
this.newclientsdemo = newclientsdemo;
}
public Integer getNewclientsdemo(){
return this.newclientsdemo;
}
private Integer newclientsappraisal;
public void setNewclientsappraisal(Integer newclientsappraisal){
this.newclientsappraisal = newclientsappraisal;
}
public Integer getNewclientsappraisal(){
return this.newclientsappraisal;
}
private Integer newclientsabhot;
public void setNewclientsabhot(Integer newclientsabhot){
this.newclientsabhot = newclientsabhot;
}
public Integer getNewclientsabhot(){
return this.newclientsabhot;
}
private Integer priorityappraisal;
public void setPriorityappraisal(Integer priorityappraisal){
this.priorityappraisal = priorityappraisal;
}
public Integer getPriorityappraisal(){
return this.priorityappraisal;
}
private Integer priorityabhot;
public void setPriorityabhot(Integer priorityabhot){
this.priorityabhot = priorityabhot;
}
public Integer getPriorityabhot(){
return this.priorityabhot;
}
private Integer newclientsintroduction;
public void setNewclientsintroduction(Integer newclientsintroduction){
this.newclientsintroduction = newclientsintroduction;
}
public Integer getNewclientsintroduction(){
return this.newclientsintroduction;
}
private Integer newclientsintroductionpostcard;
public void setNewclientsintroductionpostcard(Integer newclientsintroductionpostcard){
this.newclientsintroductionpostcard = newclientsintroductionpostcard;
}
public Integer getNewclientsintroductionpostcard(){
return this.newclientsintroductionpostcard;
}
private Integer newclientsintroductionoffer;
public void setNewclientsintroductionoffer(Integer newclientsintroductionoffer){
this.newclientsintroductionoffer = newclientsintroductionoffer;
}
public Integer getNewclientsintroductionoffer(){
return this.newclientsintroductionoffer;
}
private Integer newclientsstockincrement;
public void setNewclientsstockincrement(Integer newclientsstockincrement){
this.newclientsstockincrement = newclientsstockincrement;
}
public Integer getNewclientsstockincrement(){
return this.newclientsstockincrement;
}
private Integer newclientsstockstorefront;
public void setNewclientsstockstorefront(Integer newclientsstockstorefront){
this.newclientsstockstorefront = newclientsstockstorefront;
}
public Integer getNewclientsstockstorefront(){
return this.newclientsstockstorefront;
}
private Integer newclientsstockexhibition;
public void setNewclientsstockexhibition(Integer newclientsstockexhibition){
this.newclientsstockexhibition = newclientsstockexhibition;
}
public Integer getNewclientsstockexhibition(){
return this.newclientsstockexhibition;
}
private Integer newclientsstockothers;
public void setNewclientsstockothers(Integer newclientsstockothers){
this.newclientsstockothers = newclientsstockothers;
}
public Integer getNewclientsstockothers(){
return this.newclientsstockothers;
}
private Integer newclientsstock;
public void setNewclientsstock(Integer newclientsstock){
this.newclientsstock = newclientsstock;
}
public Integer getNewclientsstock(){
return this.newclientsstock;
}
private Integer newclientstc;
public void setNewclientstc(Integer newclientstc){
this.newclientstc = newclientstc;
}
public Integer getNewclientstc(){
return this.newclientstc;
}
private Integer newclientsvisit;
public void setNewclientsvisit(Integer newclientsvisit){
this.newclientsvisit = newclientsvisit;
}
public Integer getNewclientsvisit(){
return this.newclientsvisit;
}
private int month;
public void setMonth(int month){
this.month = month;
}
public int getMonth(){
return this.month;
}
private int year;
public void setYear(int year){
this.year = year;
}
public int getYear(){
return this.year;
}
private int week;
public void setWeek(int week){
this.week = week;
}
public int getWeek(){
return this.week;
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
private boolean actual;
public void setActual(boolean actual){
this.actual = actual;
}
public boolean isActual(){
return this.actual;
}
private int inspectionvisitaffirmation;
public void setInspectionvisitaffirmation(int inspectionvisitaffirmation){
this.inspectionvisitaffirmation = inspectionvisitaffirmation;
}
public int getInspectionvisitaffirmation(){
return this.inspectionvisitaffirmation;
}
private int oldvisitaffirmation;
public void setOldvisitaffirmation(int oldvisitaffirmation){
this.oldvisitaffirmation = oldvisitaffirmation;
}
public int getOldvisitaffirmation(){
return this.oldvisitaffirmation;
}
private int priorityvisitaffirmation;
public void setPriorityvisitaffirmation(int priorityvisitaffirmation){
this.priorityvisitaffirmation = priorityvisitaffirmation;
}
public int getPriorityvisitaffirmation(){
return this.priorityvisitaffirmation;
}
private int newclientsvisitaffirmation;
public void setNewclientsvisitaffirmation(int newclientsvisitaffirmation){
this.newclientsvisitaffirmation = newclientsvisitaffirmation;
}
public int getNewclientsvisitaffirmation(){
return this.newclientsvisitaffirmation;
}
private int engenderabhotcustomer;
public void setEngenderabhotcustomer(int engenderabhotcustomer){
this.engenderabhotcustomer = engenderabhotcustomer;
}
public int getEngenderabhotcustomer(){
return this.engenderabhotcustomer;
}
private int engenderabhotstock;
public void setEngenderabhotstock(int engenderabhotstock){
this.engenderabhotstock = engenderabhotstock;
}
public int getEngenderabhotstock(){
return this.engenderabhotstock;
}
private int engenderabhotfree;
public void setEngenderabhotfree(int engenderabhotfree){
this.engenderabhotfree = engenderabhotfree;
}
public int getEngenderabhotfree(){
return this.engenderabhotfree;
}
private int vip;
public void setVip(int vip){
this.vip = vip;
}
public int getVip(){
return this.vip;
}
private int othercars;
public void setOthercars(int othercars){
this.othercars = othercars;
}
public int getOthercars(){
return this.othercars;
}
private int clientab;
public void setClientab(int clientab){
this.clientab = clientab;
}
public int getClientab(){
return this.clientab;
}
private int clientnonabcustomer;
public void setClientnonabcustomer(int clientnonabcustomer){
this.clientnonabcustomer = clientnonabcustomer;
}
public int getClientnonabcustomer(){
return this.clientnonabcustomer;
}
private int clientnonabstock;
public void setClientnonabstock(int clientnonabstock){
this.clientnonabstock = clientnonabstock;
}
public int getClientnonabstock(){
return this.clientnonabstock;
}
private int clientnonabfree;
public void setClientnonabfree(int clientnonabfree){
this.clientnonabfree = clientnonabfree;
}
public int getClientnonabfree(){
return this.clientnonabfree;
}
private int ordercarsabcustomer;
public void setOrdercarsabcustomer(int ordercarsabcustomer){
this.ordercarsabcustomer = ordercarsabcustomer;
}
public int getOrdercarsabcustomer(){
return this.ordercarsabcustomer;
}
private int ordercarsabnewother;
public void setOrdercarsabnewother(int ordercarsabnewother){
this.ordercarsabnewother = ordercarsabnewother;
}
public int getOrdercarsabnewother(){
return this.ordercarsabnewother;
}
private int ordercarsnonabcustomer;
public void setOrdercarsnonabcustomer(int ordercarsnonabcustomer){
this.ordercarsnonabcustomer = ordercarsnonabcustomer;
}
public int getOrdercarsnonabcustomer(){
return this.ordercarsnonabcustomer;
}
private int ordercarsnonabstock;
public void setOrdercarsnonabstock(int ordercarsnonabstock){
this.ordercarsnonabstock = ordercarsnonabstock;
}
public int getOrdercarsnonabstock(){
return this.ordercarsnonabstock;
}
private int ordercarsnonabfree;
public void setOrdercarsnonabfree(int ordercarsnonabfree){
this.ordercarsnonabfree = ordercarsnonabfree;
}
public int getOrdercarsnonabfree(){
return this.ordercarsnonabfree;
}
private Integer base;
public void setBase(Integer base){
this.base = base;
}
public Integer getBase(){
return this.base;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	actual =false;
}
}
