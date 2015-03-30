package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExhibitionReportForm
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
private int demo;
public void setDemo(int demo){
this.demo = demo;
}
public int getDemo(){
return this.demo;
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
private Integer exhibition;
public void setExhibition(Integer exhibition){
this.exhibition = exhibition;
}
public Integer getExhibition(){
return this.exhibition;
}
private int visitorsabcustomer;
public void setVisitorsabcustomer(int visitorsabcustomer){
this.visitorsabcustomer = visitorsabcustomer;
}
public int getVisitorsabcustomer(){
return this.visitorsabcustomer;
}
private int visitorsabnewother;
public void setVisitorsabnewother(int visitorsabnewother){
this.visitorsabnewother = visitorsabnewother;
}
public int getVisitorsabnewother(){
return this.visitorsabnewother;
}
private int visitorsnonabcustomer;
public void setVisitorsnonabcustomer(int visitorsnonabcustomer){
this.visitorsnonabcustomer = visitorsnonabcustomer;
}
public int getVisitorsnonabcustomer(){
return this.visitorsnonabcustomer;
}
private int visitorsnonabstock;
public void setVisitorsnonabstock(int visitorsnonabstock){
this.visitorsnonabstock = visitorsnonabstock;
}
public int getVisitorsnonabstock(){
return this.visitorsnonabstock;
}
private int visitorsnonabfree;
public void setVisitorsnonabfree(int visitorsnonabfree){
this.visitorsnonabfree = visitorsnonabfree;
}
public int getVisitorsnonabfree(){
return this.visitorsnonabfree;
}
private int questionnairecollected;
public void setQuestionnairecollected(int questionnairecollected){
this.questionnairecollected = questionnairecollected;
}
public int getQuestionnairecollected(){
return this.questionnairecollected;
}
private int vip;
public void setVip(int vip){
this.vip = vip;
}
public int getVip(){
return this.vip;
}
private int appraisalowncars;
public void setAppraisalowncars(int appraisalowncars){
this.appraisalowncars = appraisalowncars;
}
public int getAppraisalowncars(){
return this.appraisalowncars;
}
private int appraisalothercars;
public void setAppraisalothercars(int appraisalothercars){
this.appraisalothercars = appraisalothercars;
}
public int getAppraisalothercars(){
return this.appraisalothercars;
}
private int commitment;
public void setCommitment(int commitment){
this.commitment = commitment;
}
public int getCommitment(){
return this.commitment;
}
private int scramble;
public void setScramble(int scramble){
this.scramble = scramble;
}
public int getScramble(){
return this.scramble;
}
private int orderdetailabcustomer;
public void setOrderdetailabcustomer(int orderdetailabcustomer){
this.orderdetailabcustomer = orderdetailabcustomer;
}
public int getOrderdetailabcustomer(){
return this.orderdetailabcustomer;
}
private int orderdetailabnewother;
public void setOrderdetailabnewother(int orderdetailabnewother){
this.orderdetailabnewother = orderdetailabnewother;
}
public int getOrderdetailabnewother(){
return this.orderdetailabnewother;
}
private int orderdetailnonabcustomer;
public void setOrderdetailnonabcustomer(int orderdetailnonabcustomer){
this.orderdetailnonabcustomer = orderdetailnonabcustomer;
}
public int getOrderdetailnonabcustomer(){
return this.orderdetailnonabcustomer;
}
private int orderdetailnonabstock;
public void setOrderdetailnonabstock(int orderdetailnonabstock){
this.orderdetailnonabstock = orderdetailnonabstock;
}
public int getOrderdetailnonabstock(){
return this.orderdetailnonabstock;
}
private int orderdetailnonabfree;
public void setOrderdetailnonabfree(int orderdetailnonabfree){
this.orderdetailnonabfree = orderdetailnonabfree;
}
public int getOrderdetailnonabfree(){
return this.orderdetailnonabfree;
}
private int orderdetailcarothers;
public void setOrderdetailcarothers(int orderdetailcarothers){
this.orderdetailcarothers = orderdetailcarothers;
}
public int getOrderdetailcarothers(){
return this.orderdetailcarothers;
}
private int orderdetaillightcarothers;
public void setOrderdetaillightcarothers(int orderdetaillightcarothers){
this.orderdetaillightcarothers = orderdetaillightcarothers;
}
public int getOrderdetaillightcarothers(){
return this.orderdetaillightcarothers;
}
private int visitmotivationcarothers;
public void setVisitmotivationcarothers(int visitmotivationcarothers){
this.visitmotivationcarothers = visitmotivationcarothers;
}
public int getVisitmotivationcarothers(){
return this.visitmotivationcarothers;
}
private int visitmotivationlightcarothers;
public void setVisitmotivationlightcarothers(int visitmotivationlightcarothers){
this.visitmotivationlightcarothers = visitmotivationlightcarothers;
}
public int getVisitmotivationlightcarothers(){
return this.visitmotivationlightcarothers;
}
private int visitmotivationdm;
public void setVisitmotivationdm(int visitmotivationdm){
this.visitmotivationdm = visitmotivationdm;
}
public int getVisitmotivationdm(){
return this.visitmotivationdm;
}
private int visitmotivationleaflet;
public void setVisitmotivationleaflet(int visitmotivationleaflet){
this.visitmotivationleaflet = visitmotivationleaflet;
}
public int getVisitmotivationleaflet(){
return this.visitmotivationleaflet;
}
private int visitmotivationnewspaperad;
public void setVisitmotivationnewspaperad(int visitmotivationnewspaperad){
this.visitmotivationnewspaperad = visitmotivationnewspaperad;
}
public int getVisitmotivationnewspaperad(){
return this.visitmotivationnewspaperad;
}
private int visitmotivationinpassing;
public void setVisitmotivationinpassing(int visitmotivationinpassing){
this.visitmotivationinpassing = visitmotivationinpassing;
}
public int getVisitmotivationinpassing(){
return this.visitmotivationinpassing;
}
private int visitmotivationtvradio;
public void setVisitmotivationtvradio(int visitmotivationtvradio){
this.visitmotivationtvradio = visitmotivationtvradio;
}
public int getVisitmotivationtvradio(){
return this.visitmotivationtvradio;
}
private int visitmotivationothers;
public void setVisitmotivationothers(int visitmotivationothers){
this.visitmotivationothers = visitmotivationothers;
}
public int getVisitmotivationothers(){
return this.visitmotivationothers;
}
private Date datetime;
public void setDatetime(Date datetime){
this.datetime = datetime;
}
public Date getDatetime(){
return this.datetime;
}
private boolean datetimeIsValid = false;
public void setDatetimeIsValid(boolean datetimeIsValid){
this.datetimeIsValid = datetimeIsValid;
}
public boolean isDatetimeIsValid(){
return this.datetimeIsValid;
}
private java.lang.String datetimeAsRawString ="";
public java.lang.String getDatetimeAsString(){
    return (datetime== null) ? null : format.format(datetime);
}
public void setDatetimeAsString(java.lang.String datetime){
	this.datetimeIsValid = true;
	this.datetimeAsRawString = datetime;
try{
		if(StringUtils.isNotBlank(datetime)){ format.parse(datetime);}
}catch (java.text.ParseException pe){
this.datetimeIsValid = false;
}
	if(datetimeIsValid){
		try {
			this.datetime = (org.apache.commons.lang.StringUtils.isBlank(datetime)) ? null : format.parse(datetime);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDatetimeAsRawString(java.lang.String datetime){
	this.datetimeAsRawString = datetime;
}

public String getDatetimeAsRawString(){
return this.datetimeAsRawString;
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
