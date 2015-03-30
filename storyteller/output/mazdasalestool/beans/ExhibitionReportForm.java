package net.mazdasalestool.beans;
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
private Integer demo;
public void setDemo(Integer demo){
this.demo = demo;
}
public Integer getDemo(){
return this.demo;
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
private Integer exhibition;
public void setExhibition(Integer exhibition){
this.exhibition = exhibition;
}
public Integer getExhibition(){
return this.exhibition;
}
private Integer visitorsabcustomer;
public void setVisitorsabcustomer(Integer visitorsabcustomer){
this.visitorsabcustomer = visitorsabcustomer;
}
public Integer getVisitorsabcustomer(){
return this.visitorsabcustomer;
}
private Integer visitorsabnewother;
public void setVisitorsabnewother(Integer visitorsabnewother){
this.visitorsabnewother = visitorsabnewother;
}
public Integer getVisitorsabnewother(){
return this.visitorsabnewother;
}
private Integer visitorsnonabcustomer;
public void setVisitorsnonabcustomer(Integer visitorsnonabcustomer){
this.visitorsnonabcustomer = visitorsnonabcustomer;
}
public Integer getVisitorsnonabcustomer(){
return this.visitorsnonabcustomer;
}
private Integer visitorsnonabstock;
public void setVisitorsnonabstock(Integer visitorsnonabstock){
this.visitorsnonabstock = visitorsnonabstock;
}
public Integer getVisitorsnonabstock(){
return this.visitorsnonabstock;
}
private Integer visitorsnonabfree;
public void setVisitorsnonabfree(Integer visitorsnonabfree){
this.visitorsnonabfree = visitorsnonabfree;
}
public Integer getVisitorsnonabfree(){
return this.visitorsnonabfree;
}
private Integer questionnairecollected;
public void setQuestionnairecollected(Integer questionnairecollected){
this.questionnairecollected = questionnairecollected;
}
public Integer getQuestionnairecollected(){
return this.questionnairecollected;
}
private Integer vip;
public void setVip(Integer vip){
this.vip = vip;
}
public Integer getVip(){
return this.vip;
}
private Integer appraisalowncars;
public void setAppraisalowncars(Integer appraisalowncars){
this.appraisalowncars = appraisalowncars;
}
public Integer getAppraisalowncars(){
return this.appraisalowncars;
}
private Integer appraisalothercars;
public void setAppraisalothercars(Integer appraisalothercars){
this.appraisalothercars = appraisalothercars;
}
public Integer getAppraisalothercars(){
return this.appraisalothercars;
}
private Integer commitment;
public void setCommitment(Integer commitment){
this.commitment = commitment;
}
public Integer getCommitment(){
return this.commitment;
}
private Integer scramble;
public void setScramble(Integer scramble){
this.scramble = scramble;
}
public Integer getScramble(){
return this.scramble;
}
private Integer orderdetailabcustomer;
public void setOrderdetailabcustomer(Integer orderdetailabcustomer){
this.orderdetailabcustomer = orderdetailabcustomer;
}
public Integer getOrderdetailabcustomer(){
return this.orderdetailabcustomer;
}
private Integer orderdetailabnewother;
public void setOrderdetailabnewother(Integer orderdetailabnewother){
this.orderdetailabnewother = orderdetailabnewother;
}
public Integer getOrderdetailabnewother(){
return this.orderdetailabnewother;
}
private Integer orderdetailnonabcustomer;
public void setOrderdetailnonabcustomer(Integer orderdetailnonabcustomer){
this.orderdetailnonabcustomer = orderdetailnonabcustomer;
}
public Integer getOrderdetailnonabcustomer(){
return this.orderdetailnonabcustomer;
}
private Integer orderdetailnonabstock;
public void setOrderdetailnonabstock(Integer orderdetailnonabstock){
this.orderdetailnonabstock = orderdetailnonabstock;
}
public Integer getOrderdetailnonabstock(){
return this.orderdetailnonabstock;
}
private Integer orderdetailnonabfree;
public void setOrderdetailnonabfree(Integer orderdetailnonabfree){
this.orderdetailnonabfree = orderdetailnonabfree;
}
public Integer getOrderdetailnonabfree(){
return this.orderdetailnonabfree;
}
private Integer orderdetailcarothers;
public void setOrderdetailcarothers(Integer orderdetailcarothers){
this.orderdetailcarothers = orderdetailcarothers;
}
public Integer getOrderdetailcarothers(){
return this.orderdetailcarothers;
}
private Integer orderdetaillightcarothers;
public void setOrderdetaillightcarothers(Integer orderdetaillightcarothers){
this.orderdetaillightcarothers = orderdetaillightcarothers;
}
public Integer getOrderdetaillightcarothers(){
return this.orderdetaillightcarothers;
}
private Integer visitmotivationcarothers;
public void setVisitmotivationcarothers(Integer visitmotivationcarothers){
this.visitmotivationcarothers = visitmotivationcarothers;
}
public Integer getVisitmotivationcarothers(){
return this.visitmotivationcarothers;
}
private Integer visitmotivationlightcarothers;
public void setVisitmotivationlightcarothers(Integer visitmotivationlightcarothers){
this.visitmotivationlightcarothers = visitmotivationlightcarothers;
}
public Integer getVisitmotivationlightcarothers(){
return this.visitmotivationlightcarothers;
}
private Integer visitmotivationdm;
public void setVisitmotivationdm(Integer visitmotivationdm){
this.visitmotivationdm = visitmotivationdm;
}
public Integer getVisitmotivationdm(){
return this.visitmotivationdm;
}
private Integer visitmotivationleaflet;
public void setVisitmotivationleaflet(Integer visitmotivationleaflet){
this.visitmotivationleaflet = visitmotivationleaflet;
}
public Integer getVisitmotivationleaflet(){
return this.visitmotivationleaflet;
}
private Integer visitmotivationnewspaperad;
public void setVisitmotivationnewspaperad(Integer visitmotivationnewspaperad){
this.visitmotivationnewspaperad = visitmotivationnewspaperad;
}
public Integer getVisitmotivationnewspaperad(){
return this.visitmotivationnewspaperad;
}
private Integer visitmotivationinpassing;
public void setVisitmotivationinpassing(Integer visitmotivationinpassing){
this.visitmotivationinpassing = visitmotivationinpassing;
}
public Integer getVisitmotivationinpassing(){
return this.visitmotivationinpassing;
}
private Integer visitmotivationtvradio;
public void setVisitmotivationtvradio(Integer visitmotivationtvradio){
this.visitmotivationtvradio = visitmotivationtvradio;
}
public Integer getVisitmotivationtvradio(){
return this.visitmotivationtvradio;
}
private Integer visitmotivationothers;
public void setVisitmotivationothers(Integer visitmotivationothers){
this.visitmotivationothers = visitmotivationothers;
}
public Integer getVisitmotivationothers(){
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
