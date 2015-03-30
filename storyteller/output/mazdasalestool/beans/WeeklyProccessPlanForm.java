package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class WeeklyProccessPlanForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Date leavetime;
public void setLeavetime(Date leavetime){
this.leavetime = leavetime;
}
public Date getLeavetime(){
return this.leavetime;
}
private boolean leavetimeIsValid = false;
public void setLeavetimeIsValid(boolean leavetimeIsValid){
this.leavetimeIsValid = leavetimeIsValid;
}
public boolean isLeavetimeIsValid(){
return this.leavetimeIsValid;
}
private java.lang.String leavetimeAsRawString ="";
public java.lang.String getLeavetimeAsString(){
    return (leavetime== null) ? null : format.format(leavetime);
}
public void setLeavetimeAsString(java.lang.String leavetime){
	this.leavetimeIsValid = true;
	this.leavetimeAsRawString = leavetime;
try{
		if(StringUtils.isNotBlank(leavetime)){ format.parse(leavetime);}
}catch (java.text.ParseException pe){
this.leavetimeIsValid = false;
}
	if(leavetimeIsValid){
		try {
			this.leavetime = (org.apache.commons.lang.StringUtils.isBlank(leavetime)) ? null : format.parse(leavetime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setLeavetimeAsRawString(java.lang.String leavetime){
	this.leavetimeAsRawString = leavetime;
}

public String getLeavetimeAsRawString(){
return this.leavetimeAsRawString;
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
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Boolean actual;
public void setActual(Boolean actual){
this.actual = actual;
}
public Boolean getActual(){
return this.actual;
}
private Integer promotionalcars;
public void setPromotionalcars(Integer promotionalcars){
this.promotionalcars = promotionalcars;
}
public Integer getPromotionalcars(){
return this.promotionalcars;
}
private Integer inspectiontarget;
public void setInspectiontarget(Integer inspectiontarget){
this.inspectiontarget = inspectiontarget;
}
public Integer getInspectiontarget(){
return this.inspectiontarget;
}
private Integer inspectiontc;
public void setInspectiontc(Integer inspectiontc){
this.inspectiontc = inspectiontc;
}
public Integer getInspectiontc(){
return this.inspectiontc;
}
private Integer inspectionmail;
public void setInspectionmail(Integer inspectionmail){
this.inspectionmail = inspectionmail;
}
public Integer getInspectionmail(){
return this.inspectionmail;
}
private Integer inspectionvisitaffirmation;
public void setInspectionvisitaffirmation(Integer inspectionvisitaffirmation){
this.inspectionvisitaffirmation = inspectionvisitaffirmation;
}
public Integer getInspectionvisitaffirmation(){
return this.inspectionvisitaffirmation;
}
private Integer inspectionslc;
public void setInspectionslc(Integer inspectionslc){
this.inspectionslc = inspectionslc;
}
public Integer getInspectionslc(){
return this.inspectionslc;
}
private Integer inspectionproposal;
public void setInspectionproposal(Integer inspectionproposal){
this.inspectionproposal = inspectionproposal;
}
public Integer getInspectionproposal(){
return this.inspectionproposal;
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
private Integer inspectiondemo;
public void setInspectiondemo(Integer inspectiondemo){
this.inspectiondemo = inspectiondemo;
}
public Integer getInspectiondemo(){
return this.inspectiondemo;
}
private Integer inspectionappraisal;
public void setInspectionappraisal(Integer inspectionappraisal){
this.inspectionappraisal = inspectionappraisal;
}
public Integer getInspectionappraisal(){
return this.inspectionappraisal;
}
private Integer inspectionabhot;
public void setInspectionabhot(Integer inspectionabhot){
this.inspectionabhot = inspectionabhot;
}
public Integer getInspectionabhot(){
return this.inspectionabhot;
}
private Integer prioritytarget;
public void setPrioritytarget(Integer prioritytarget){
this.prioritytarget = prioritytarget;
}
public Integer getPrioritytarget(){
return this.prioritytarget;
}
private Integer prioritydm;
public void setPrioritydm(Integer prioritydm){
this.prioritydm = prioritydm;
}
public Integer getPrioritydm(){
return this.prioritydm;
}
private Integer prioritytc;
public void setPrioritytc(Integer prioritytc){
this.prioritytc = prioritytc;
}
public Integer getPrioritytc(){
return this.prioritytc;
}
private Integer prioritymail;
public void setPrioritymail(Integer prioritymail){
this.prioritymail = prioritymail;
}
public Integer getPrioritymail(){
return this.prioritymail;
}
private Integer priorityvisitaffirmation;
public void setPriorityvisitaffirmation(Integer priorityvisitaffirmation){
this.priorityvisitaffirmation = priorityvisitaffirmation;
}
public Integer getPriorityvisitaffirmation(){
return this.priorityvisitaffirmation;
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
private Integer prioritydemo;
public void setPrioritydemo(Integer prioritydemo){
this.prioritydemo = prioritydemo;
}
public Integer getPrioritydemo(){
return this.prioritydemo;
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
private Integer newclientscars;
public void setNewclientscars(Integer newclientscars){
this.newclientscars = newclientscars;
}
public Integer getNewclientscars(){
return this.newclientscars;
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
private Integer newclientsintroduction;
public void setNewclientsintroduction(Integer newclientsintroduction){
this.newclientsintroduction = newclientsintroduction;
}
public Integer getNewclientsintroduction(){
return this.newclientsintroduction;
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
private Integer newclientsdm;
public void setNewclientsdm(Integer newclientsdm){
this.newclientsdm = newclientsdm;
}
public Integer getNewclientsdm(){
return this.newclientsdm;
}
private Integer newclientstc;
public void setNewclientstc(Integer newclientstc){
this.newclientstc = newclientstc;
}
public Integer getNewclientstc(){
return this.newclientstc;
}
private Integer newclientsmail;
public void setNewclientsmail(Integer newclientsmail){
this.newclientsmail = newclientsmail;
}
public Integer getNewclientsmail(){
return this.newclientsmail;
}
private Integer newclientsvisitaffirmation;
public void setNewclientsvisitaffirmation(Integer newclientsvisitaffirmation){
this.newclientsvisitaffirmation = newclientsvisitaffirmation;
}
public Integer getNewclientsvisitaffirmation(){
return this.newclientsvisitaffirmation;
}
private Integer newclientsslc;
public void setNewclientsslc(Integer newclientsslc){
this.newclientsslc = newclientsslc;
}
public Integer getNewclientsslc(){
return this.newclientsslc;
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
private Integer base;
public void setBase(Integer base){
this.base = base;
}
public Integer getBase(){
return this.base;
}
private Date cometime;
public void setCometime(Date cometime){
this.cometime = cometime;
}
public Date getCometime(){
return this.cometime;
}
private boolean cometimeIsValid = false;
public void setCometimeIsValid(boolean cometimeIsValid){
this.cometimeIsValid = cometimeIsValid;
}
public boolean isCometimeIsValid(){
return this.cometimeIsValid;
}
private java.lang.String cometimeAsRawString ="";
public java.lang.String getCometimeAsString(){
    return (cometime== null) ? null : format.format(cometime);
}
public void setCometimeAsString(java.lang.String cometime){
	this.cometimeIsValid = true;
	this.cometimeAsRawString = cometime;
try{
		if(StringUtils.isNotBlank(cometime)){ format.parse(cometime);}
}catch (java.text.ParseException pe){
this.cometimeIsValid = false;
}
	if(cometimeIsValid){
		try {
			this.cometime = (org.apache.commons.lang.StringUtils.isBlank(cometime)) ? null : format.parse(cometime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCometimeAsRawString(java.lang.String cometime){
	this.cometimeAsRawString = cometime;
}

public String getCometimeAsRawString(){
return this.cometimeAsRawString;
}
private Integer inspectiondm;
public void setInspectiondm(Integer inspectiondm){
this.inspectiondm = inspectiondm;
}
public Integer getInspectiondm(){
return this.inspectiondm;
}
private Integer engenderabhotcustomer;
public void setEngenderabhotcustomer(Integer engenderabhotcustomer){
this.engenderabhotcustomer = engenderabhotcustomer;
}
public Integer getEngenderabhotcustomer(){
return this.engenderabhotcustomer;
}
private Integer engenderabhotstock;
public void setEngenderabhotstock(Integer engenderabhotstock){
this.engenderabhotstock = engenderabhotstock;
}
public Integer getEngenderabhotstock(){
return this.engenderabhotstock;
}
private Integer engenderabhotfree;
public void setEngenderabhotfree(Integer engenderabhotfree){
this.engenderabhotfree = engenderabhotfree;
}
public Integer getEngenderabhotfree(){
return this.engenderabhotfree;
}
private Integer vip;
public void setVip(Integer vip){
this.vip = vip;
}
public Integer getVip(){
return this.vip;
}
private Integer othercars;
public void setOthercars(Integer othercars){
this.othercars = othercars;
}
public Integer getOthercars(){
return this.othercars;
}
private Integer clientab;
public void setClientab(Integer clientab){
this.clientab = clientab;
}
public Integer getClientab(){
return this.clientab;
}
private Integer clientnonabcustomer;
public void setClientnonabcustomer(Integer clientnonabcustomer){
this.clientnonabcustomer = clientnonabcustomer;
}
public Integer getClientnonabcustomer(){
return this.clientnonabcustomer;
}
private Integer clientnonabstock;
public void setClientnonabstock(Integer clientnonabstock){
this.clientnonabstock = clientnonabstock;
}
public Integer getClientnonabstock(){
return this.clientnonabstock;
}
private Integer clientnonabfree;
public void setClientnonabfree(Integer clientnonabfree){
this.clientnonabfree = clientnonabfree;
}
public Integer getClientnonabfree(){
return this.clientnonabfree;
}
private Integer ordercarsabcustomer;
public void setOrdercarsabcustomer(Integer ordercarsabcustomer){
this.ordercarsabcustomer = ordercarsabcustomer;
}
public Integer getOrdercarsabcustomer(){
return this.ordercarsabcustomer;
}
private Integer ordercarsabnewother;
public void setOrdercarsabnewother(Integer ordercarsabnewother){
this.ordercarsabnewother = ordercarsabnewother;
}
public Integer getOrdercarsabnewother(){
return this.ordercarsabnewother;
}
private Integer ordercarsnonabcustomer;
public void setOrdercarsnonabcustomer(Integer ordercarsnonabcustomer){
this.ordercarsnonabcustomer = ordercarsnonabcustomer;
}
public Integer getOrdercarsnonabcustomer(){
return this.ordercarsnonabcustomer;
}
private Integer ordercarsnonabstock;
public void setOrdercarsnonabstock(Integer ordercarsnonabstock){
this.ordercarsnonabstock = ordercarsnonabstock;
}
public Integer getOrdercarsnonabstock(){
return this.ordercarsnonabstock;
}
private Integer ordercarsnonabfree;
public void setOrdercarsnonabfree(Integer ordercarsnonabfree){
this.ordercarsnonabfree = ordercarsnonabfree;
}
public Integer getOrdercarsnonabfree(){
return this.ordercarsnonabfree;
}
private Integer inspectioncars;
public void setInspectioncars(Integer inspectioncars){
this.inspectioncars = inspectioncars;
}
public Integer getInspectioncars(){
return this.inspectioncars;
}
private Integer prioritycars;
public void setPrioritycars(Integer prioritycars){
this.prioritycars = prioritycars;
}
public Integer getPrioritycars(){
return this.prioritycars;
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
private Integer oldmail;
public void setOldmail(Integer oldmail){
this.oldmail = oldmail;
}
public Integer getOldmail(){
return this.oldmail;
}
private Integer oldvisitaffirmation;
public void setOldvisitaffirmation(Integer oldvisitaffirmation){
this.oldvisitaffirmation = oldvisitaffirmation;
}
public Integer getOldvisitaffirmation(){
return this.oldvisitaffirmation;
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
private Integer newclientsproposal;
public void setNewclientsproposal(Integer newclientsproposal){
this.newclientsproposal = newclientsproposal;
}
public Integer getNewclientsproposal(){
return this.newclientsproposal;
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
