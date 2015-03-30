package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExhibitionReportUsedForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Date date;
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
private Integer estimation;
public void setEstimation(Integer estimation){
this.estimation = estimation;
}
public Integer getEstimation(){
return this.estimation;
}
private Integer visitaffirmation;
public void setVisitaffirmation(Integer visitaffirmation){
this.visitaffirmation = visitaffirmation;
}
public Integer getVisitaffirmation(){
return this.visitaffirmation;
}
private Integer exhibition;
public void setExhibition(Integer exhibition){
this.exhibition = exhibition;
}
public Integer getExhibition(){
return this.exhibition;
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
private Integer visitmotivationinpassing;
public void setVisitmotivationinpassing(Integer visitmotivationinpassing){
this.visitmotivationinpassing = visitmotivationinpassing;
}
public Integer getVisitmotivationinpassing(){
return this.visitmotivationinpassing;
}
private Integer visitmotivationothers;
public void setVisitmotivationothers(Integer visitmotivationothers){
this.visitmotivationothers = visitmotivationothers;
}
public Integer getVisitmotivationothers(){
return this.visitmotivationothers;
}
private Integer telephoneappointment;
public void setTelephoneappointment(Integer telephoneappointment){
this.telephoneappointment = telephoneappointment;
}
public Integer getTelephoneappointment(){
return this.telephoneappointment;
}
private Integer haveacall;
public void setHaveacall(Integer haveacall){
this.haveacall = haveacall;
}
public Integer getHaveacall(){
return this.haveacall;
}
private Integer visitmotivationvisitaffirmation;
public void setVisitmotivationvisitaffirmation(Integer visitmotivationvisitaffirmation){
this.visitmotivationvisitaffirmation = visitmotivationvisitaffirmation;
}
public Integer getVisitmotivationvisitaffirmation(){
return this.visitmotivationvisitaffirmation;
}
private Integer visitmotivationintroduction;
public void setVisitmotivationintroduction(Integer visitmotivationintroduction){
this.visitmotivationintroduction = visitmotivationintroduction;
}
public Integer getVisitmotivationintroduction(){
return this.visitmotivationintroduction;
}
private Integer visitmotivationmagazines;
public void setVisitmotivationmagazines(Integer visitmotivationmagazines){
this.visitmotivationmagazines = visitmotivationmagazines;
}
public Integer getVisitmotivationmagazines(){
return this.visitmotivationmagazines;
}
private Integer visitmotivationinternet;
public void setVisitmotivationinternet(Integer visitmotivationinternet){
this.visitmotivationinternet = visitmotivationinternet;
}
public Integer getVisitmotivationinternet(){
return this.visitmotivationinternet;
}
private Integer seated;
public void setSeated(Integer seated){
this.seated = seated;
}
public Integer getSeated(){
return this.seated;
}
private Integer demotrycar;
public void setDemotrycar(Integer demotrycar){
this.demotrycar = demotrycar;
}
public Integer getDemotrycar(){
return this.demotrycar;
}
private Integer searchimages;
public void setSearchimages(Integer searchimages){
this.searchimages = searchimages;
}
public Integer getSearchimages(){
return this.searchimages;
}
private Integer engenderabhot;
public void setEngenderabhot(Integer engenderabhot){
this.engenderabhot = engenderabhot;
}
public Integer getEngenderabhot(){
return this.engenderabhot;
}
private Integer orderdetailownpassenger;
public void setOrderdetailownpassenger(Integer orderdetailownpassenger){
this.orderdetailownpassenger = orderdetailownpassenger;
}
public Integer getOrderdetailownpassenger(){
return this.orderdetailownpassenger;
}
private Integer orderdetailowndemio;
public void setOrderdetailowndemio(Integer orderdetailowndemio){
this.orderdetailowndemio = orderdetailowndemio;
}
public Integer getOrderdetailowndemio(){
return this.orderdetailowndemio;
}
private Integer orderdetailownmpv;
public void setOrderdetailownmpv(Integer orderdetailownmpv){
this.orderdetailownmpv = orderdetailownmpv;
}
public Integer getOrderdetailownmpv(){
return this.orderdetailownmpv;
}
private Integer orderdetailownpremacy;
public void setOrderdetailownpremacy(Integer orderdetailownpremacy){
this.orderdetailownpremacy = orderdetailownpremacy;
}
public Integer getOrderdetailownpremacy(){
return this.orderdetailownpremacy;
}
private Integer orderdetailownlightcar;
public void setOrderdetailownlightcar(Integer orderdetailownlightcar){
this.orderdetailownlightcar = orderdetailownlightcar;
}
public Integer getOrderdetailownlightcar(){
return this.orderdetailownlightcar;
}
private Integer orderdetailownvantrack;
public void setOrderdetailownvantrack(Integer orderdetailownvantrack){
this.orderdetailownvantrack = orderdetailownvantrack;
}
public Integer getOrderdetailownvantrack(){
return this.orderdetailownvantrack;
}
private Integer orderdetailotherpassenger;
public void setOrderdetailotherpassenger(Integer orderdetailotherpassenger){
this.orderdetailotherpassenger = orderdetailotherpassenger;
}
public Integer getOrderdetailotherpassenger(){
return this.orderdetailotherpassenger;
}
private Integer orderdetailotherrv;
public void setOrderdetailotherrv(Integer orderdetailotherrv){
this.orderdetailotherrv = orderdetailotherrv;
}
public Integer getOrderdetailotherrv(){
return this.orderdetailotherrv;
}
private Integer orderdetailotherlightcar;
public void setOrderdetailotherlightcar(Integer orderdetailotherlightcar){
this.orderdetailotherlightcar = orderdetailotherlightcar;
}
public Integer getOrderdetailotherlightcar(){
return this.orderdetailotherlightcar;
}
private Integer orderdetailothervantrack;
public void setOrderdetailothervantrack(Integer orderdetailothervantrack){
this.orderdetailothervantrack = orderdetailothervantrack;
}
public Integer getOrderdetailothervantrack(){
return this.orderdetailothervantrack;
}
private Integer visitorsabcustomer;
public void setVisitorsabcustomer(Integer visitorsabcustomer){
this.visitorsabcustomer = visitorsabcustomer;
}
public Integer getVisitorsabcustomer(){
return this.visitorsabcustomer;
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
