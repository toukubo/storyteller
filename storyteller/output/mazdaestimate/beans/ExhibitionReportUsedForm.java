package net.mazdaestimate.beans;
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
private int estimation;
public void setEstimation(int estimation){
this.estimation = estimation;
}
public int getEstimation(){
return this.estimation;
}
private int visitaffirmation;
public void setVisitaffirmation(int visitaffirmation){
this.visitaffirmation = visitaffirmation;
}
public int getVisitaffirmation(){
return this.visitaffirmation;
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
private int visitmotivationinpassing;
public void setVisitmotivationinpassing(int visitmotivationinpassing){
this.visitmotivationinpassing = visitmotivationinpassing;
}
public int getVisitmotivationinpassing(){
return this.visitmotivationinpassing;
}
private int visitmotivationothers;
public void setVisitmotivationothers(int visitmotivationothers){
this.visitmotivationothers = visitmotivationothers;
}
public int getVisitmotivationothers(){
return this.visitmotivationothers;
}
private int telephoneappointment;
public void setTelephoneappointment(int telephoneappointment){
this.telephoneappointment = telephoneappointment;
}
public int getTelephoneappointment(){
return this.telephoneappointment;
}
private int haveacall;
public void setHaveacall(int haveacall){
this.haveacall = haveacall;
}
public int getHaveacall(){
return this.haveacall;
}
private int visitmotivationvisitaffirmation;
public void setVisitmotivationvisitaffirmation(int visitmotivationvisitaffirmation){
this.visitmotivationvisitaffirmation = visitmotivationvisitaffirmation;
}
public int getVisitmotivationvisitaffirmation(){
return this.visitmotivationvisitaffirmation;
}
private int visitmotivationintroduction;
public void setVisitmotivationintroduction(int visitmotivationintroduction){
this.visitmotivationintroduction = visitmotivationintroduction;
}
public int getVisitmotivationintroduction(){
return this.visitmotivationintroduction;
}
private int visitmotivationmagazines;
public void setVisitmotivationmagazines(int visitmotivationmagazines){
this.visitmotivationmagazines = visitmotivationmagazines;
}
public int getVisitmotivationmagazines(){
return this.visitmotivationmagazines;
}
private int visitmotivationinternet;
public void setVisitmotivationinternet(int visitmotivationinternet){
this.visitmotivationinternet = visitmotivationinternet;
}
public int getVisitmotivationinternet(){
return this.visitmotivationinternet;
}
private int seated;
public void setSeated(int seated){
this.seated = seated;
}
public int getSeated(){
return this.seated;
}
private int demotrycar;
public void setDemotrycar(int demotrycar){
this.demotrycar = demotrycar;
}
public int getDemotrycar(){
return this.demotrycar;
}
private int searchimages;
public void setSearchimages(int searchimages){
this.searchimages = searchimages;
}
public int getSearchimages(){
return this.searchimages;
}
private int engenderabhot;
public void setEngenderabhot(int engenderabhot){
this.engenderabhot = engenderabhot;
}
public int getEngenderabhot(){
return this.engenderabhot;
}
private int orderdetailownpassenger;
public void setOrderdetailownpassenger(int orderdetailownpassenger){
this.orderdetailownpassenger = orderdetailownpassenger;
}
public int getOrderdetailownpassenger(){
return this.orderdetailownpassenger;
}
private int orderdetailowndemio;
public void setOrderdetailowndemio(int orderdetailowndemio){
this.orderdetailowndemio = orderdetailowndemio;
}
public int getOrderdetailowndemio(){
return this.orderdetailowndemio;
}
private int orderdetailownmpv;
public void setOrderdetailownmpv(int orderdetailownmpv){
this.orderdetailownmpv = orderdetailownmpv;
}
public int getOrderdetailownmpv(){
return this.orderdetailownmpv;
}
private int orderdetailownpremacy;
public void setOrderdetailownpremacy(int orderdetailownpremacy){
this.orderdetailownpremacy = orderdetailownpremacy;
}
public int getOrderdetailownpremacy(){
return this.orderdetailownpremacy;
}
private int orderdetailownlightcar;
public void setOrderdetailownlightcar(int orderdetailownlightcar){
this.orderdetailownlightcar = orderdetailownlightcar;
}
public int getOrderdetailownlightcar(){
return this.orderdetailownlightcar;
}
private int orderdetailownvantrack;
public void setOrderdetailownvantrack(int orderdetailownvantrack){
this.orderdetailownvantrack = orderdetailownvantrack;
}
public int getOrderdetailownvantrack(){
return this.orderdetailownvantrack;
}
private int orderdetailotherpassenger;
public void setOrderdetailotherpassenger(int orderdetailotherpassenger){
this.orderdetailotherpassenger = orderdetailotherpassenger;
}
public int getOrderdetailotherpassenger(){
return this.orderdetailotherpassenger;
}
private int orderdetailotherrv;
public void setOrderdetailotherrv(int orderdetailotherrv){
this.orderdetailotherrv = orderdetailotherrv;
}
public int getOrderdetailotherrv(){
return this.orderdetailotherrv;
}
private int orderdetailotherlightcar;
public void setOrderdetailotherlightcar(int orderdetailotherlightcar){
this.orderdetailotherlightcar = orderdetailotherlightcar;
}
public int getOrderdetailotherlightcar(){
return this.orderdetailotherlightcar;
}
private int orderdetailothervantrack;
public void setOrderdetailothervantrack(int orderdetailothervantrack){
this.orderdetailothervantrack = orderdetailothervantrack;
}
public int getOrderdetailothervantrack(){
return this.orderdetailothervantrack;
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
