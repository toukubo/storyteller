package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExpenseForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat simpleformat = new java.text.SimpleDateFormat("yyyy/MM/dd");private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");static { format.setLenient(true); }private Integer request;
public void setRequest(Integer request){
this.request = request;
}
public Integer getRequest(){
return this.request;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private Date paymentdate;
public void setPaymentdate(Date paymentdate){
this.paymentdate = paymentdate;
}
public Date getPaymentdate(){
return this.paymentdate;
}
private boolean paymentdateIsValid = false;
public void setPaymentdateIsValid(boolean paymentdateIsValid){
this.paymentdateIsValid = paymentdateIsValid;
}
public boolean isPaymentdateIsValid(){
return this.paymentdateIsValid;
}
private java.lang.String paymentdateAsRawString ="";
public java.lang.String getPaymentdateAsString(){
    return (paymentdate== null) ? null : simpleformat.format(paymentdate);
}
public void setPaymentdateAsString(java.lang.String paymentdate){
	this.paymentdateIsValid = true;
	this.paymentdateAsRawString = paymentdate;
try{
		if(StringUtils.isNotBlank(paymentdate)){ simpleformat.parse(paymentdate);}
}catch (java.text.ParseException pe){
this.paymentdateIsValid = false;
}
	if(paymentdateIsValid){
		try {
			this.paymentdate = (org.apache.commons.lang.StringUtils.isBlank(paymentdate)) ? null : simpleformat.parse(paymentdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPaymentdateAsRawString(java.lang.String paymentdate){
	this.paymentdateAsRawString = paymentdate;
}

public String getPaymentdateAsRawString(){
return this.paymentdateAsRawString;
}
private int paymentdateyear = 0;
public void setPaymentdateyear(int paymentdateyear){
    this.paymentdateyear = paymentdateyear;
}
public int getPaymentdateyear(){
   return this.paymentdateyear;
}
private int paymentdatemonth = 0;
public void setPaymentdatemonth(int paymentdatemonth){
    this.paymentdatemonth = paymentdatemonth;
}
public int getPaymentdatemonth(){
   return this.paymentdatemonth;
}
private int paymentdateday = 0;
public void setPaymentdateday(int paymentdateday){
    this.paymentdateday = paymentdateday;
}
public int getPaymentdateday(){
   return this.paymentdateday;
}
private int paymentdatehour = 0;
public void setPaymentdatehour(int paymentdatehour){
    this.paymentdatehour = paymentdatehour;
}
public int getPaymentdatehour(){
   return this.paymentdatehour;
}
private int paymentdateminute = 0;
public void setPaymentdateminute(int paymentdateminute){
    this.paymentdateminute = paymentdateminute;
}
public int getPaymentdateminute(){
   return this.paymentdateminute;
}
private int paymentdatesecound = 0;
public void setPaymentdatesecound(int paymentdatesecound){
    this.paymentdatesecound = paymentdatesecound;
}
public int getPaymentdatesecound(){
   return this.paymentdatesecound;
}
private boolean paymentdatechooser = false;
public void setPaymentdatechooser(boolean paymentdatechooser){
    this.paymentdatechooser = paymentdatechooser;
if(this.paymentdatechooser){
try{
   Date date = format.parse(paymentdateyear + "/" + paymentdatemonth + "/" + paymentdateday + " " + paymentdatehour+ ":" + paymentdateminute + ":" + paymentdatesecound);   this.paymentdate = date;
}catch (java.text.ParseException pe){
		pe.printStackTrace();
}
}}
public boolean isPaymentdatechooser(){
   return this.paymentdatechooser;
}
private String paymentee;
public void setPaymentee(String paymentee){
this.paymentee = paymentee;
}
public String getPaymentee(){
return this.paymentee;
}
private Date requestdate;
public void setRequestdate(Date requestdate){
this.requestdate = requestdate;
}
public Date getRequestdate(){
return this.requestdate;
}
private boolean requestdateIsValid = false;
public void setRequestdateIsValid(boolean requestdateIsValid){
this.requestdateIsValid = requestdateIsValid;
}
public boolean isRequestdateIsValid(){
return this.requestdateIsValid;
}
private java.lang.String requestdateAsRawString ="";
public java.lang.String getRequestdateAsString(){
    return (requestdate== null) ? null : simpleformat.format(requestdate);
}
public void setRequestdateAsString(java.lang.String requestdate){
	this.requestdateIsValid = true;
	this.requestdateAsRawString = requestdate;
try{
		if(StringUtils.isNotBlank(requestdate)){ simpleformat.parse(requestdate);}
}catch (java.text.ParseException pe){
this.requestdateIsValid = false;
}
	if(requestdateIsValid){
		try {
			this.requestdate = (org.apache.commons.lang.StringUtils.isBlank(requestdate)) ? null : simpleformat.parse(requestdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setRequestdateAsRawString(java.lang.String requestdate){
	this.requestdateAsRawString = requestdate;
}

public String getRequestdateAsRawString(){
return this.requestdateAsRawString;
}
private int requestdateyear = 0;
public void setRequestdateyear(int requestdateyear){
    this.requestdateyear = requestdateyear;
}
public int getRequestdateyear(){
   return this.requestdateyear;
}
private int requestdatemonth = 0;
public void setRequestdatemonth(int requestdatemonth){
    this.requestdatemonth = requestdatemonth;
}
public int getRequestdatemonth(){
   return this.requestdatemonth;
}
private int requestdateday = 0;
public void setRequestdateday(int requestdateday){
    this.requestdateday = requestdateday;
}
public int getRequestdateday(){
   return this.requestdateday;
}
private int requestdatehour = 0;
public void setRequestdatehour(int requestdatehour){
    this.requestdatehour = requestdatehour;
}
public int getRequestdatehour(){
   return this.requestdatehour;
}
private int requestdateminute = 0;
public void setRequestdateminute(int requestdateminute){
    this.requestdateminute = requestdateminute;
}
public int getRequestdateminute(){
   return this.requestdateminute;
}
private int requestdatesecound = 0;
public void setRequestdatesecound(int requestdatesecound){
    this.requestdatesecound = requestdatesecound;
}
public int getRequestdatesecound(){
   return this.requestdatesecound;
}
private boolean requestdatechooser = false;
public void setRequestdatechooser(boolean requestdatechooser){
    this.requestdatechooser = requestdatechooser;
if(this.requestdatechooser){
try{
   Date date = format.parse(requestdateyear + "/" + requestdatemonth + "/" + requestdateday + " " + requestdatehour+ ":" + requestdateminute + ":" + requestdatesecound);   this.requestdate = date;
}catch (java.text.ParseException pe){
		pe.printStackTrace();
}
}}
public boolean isRequestdatechooser(){
   return this.requestdatechooser;
}
private boolean acknowleged;
public void setAcknowleged(boolean acknowleged){
this.acknowleged = acknowleged;
}
public boolean isAcknowleged(){
return this.acknowleged;
}
private Integer project;
public void setProject(Integer project){
this.project = project;
}
public Integer getProject(){
return this.project;
}
private Integer accountTitle;
public void setAccountTitle(Integer accountTitle){
this.accountTitle = accountTitle;
}
public Integer getAccountTitle(){
return this.accountTitle;
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
    return (date== null) ? null : simpleformat.format(date);
}
public void setDateAsString(java.lang.String date){
	this.dateIsValid = true;
	this.dateAsRawString = date;
try{
		if(StringUtils.isNotBlank(date)){ simpleformat.parse(date);}
}catch (java.text.ParseException pe){
this.dateIsValid = false;
}
	if(dateIsValid){
		try {
			this.date = (org.apache.commons.lang.StringUtils.isBlank(date)) ? null : simpleformat.parse(date);
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
private int dateyear = 0;
public void setDateyear(int dateyear){
    this.dateyear = dateyear;
}
public int getDateyear(){
   return this.dateyear;
}
private int datemonth = 0;
public void setDatemonth(int datemonth){
    this.datemonth = datemonth;
}
public int getDatemonth(){
   return this.datemonth;
}
private int dateday = 0;
public void setDateday(int dateday){
    this.dateday = dateday;
}
public int getDateday(){
   return this.dateday;
}
private int datehour = 0;
public void setDatehour(int datehour){
    this.datehour = datehour;
}
public int getDatehour(){
   return this.datehour;
}
private int dateminute = 0;
public void setDateminute(int dateminute){
    this.dateminute = dateminute;
}
public int getDateminute(){
   return this.dateminute;
}
private int datesecound = 0;
public void setDatesecound(int datesecound){
    this.datesecound = datesecound;
}
public int getDatesecound(){
   return this.datesecound;
}
private boolean datechooser = false;
public void setDatechooser(boolean datechooser){
    this.datechooser = datechooser;
if(this.datechooser){
try{
   Date date = format.parse(dateyear + "/" + datemonth + "/" + dateday + " " + datehour+ ":" + dateminute + ":" + datesecound);   this.date = date;
}catch (java.text.ParseException pe){
		pe.printStackTrace();
}
}}
public boolean isDatechooser(){
   return this.datechooser;
}
FormFile[] formFiles = new FormFile[10];
public void setFormFiles(FormFile[] formFiles){
this.formFiles = formFiles;
}
public FormFile[] getFormFiles(){
return this.formFiles;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	acknowleged =false;
}
}
