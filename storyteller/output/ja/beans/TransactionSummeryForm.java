package net.ja.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TransactionSummeryForm
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
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String accountstatus;
public void setAccountstatus(String accountstatus){
this.accountstatus = accountstatus;
}
public String getAccountstatus(){
return this.accountstatus;
}
private String branchcode;
public void setBranchcode(String branchcode){
this.branchcode = branchcode;
}
public String getBranchcode(){
return this.branchcode;
}
private int remaining;
public void setRemaining(int remaining){
this.remaining = remaining;
}
public int getRemaining(){
return this.remaining;
}
private Date lasttransactiondate;
public void setLasttransactiondate(Date lasttransactiondate){
this.lasttransactiondate = lasttransactiondate;
}
public Date getLasttransactiondate(){
return this.lasttransactiondate;
}
private boolean lasttransactiondateIsValid = false;
public void setLasttransactiondateIsValid(boolean lasttransactiondateIsValid){
this.lasttransactiondateIsValid = lasttransactiondateIsValid;
}
public boolean isLasttransactiondateIsValid(){
return this.lasttransactiondateIsValid;
}
private java.lang.String lasttransactiondateAsRawString ="";
public java.lang.String getLasttransactiondateAsString(){
    return (lasttransactiondate== null) ? null : format.format(lasttransactiondate);
}
public void setLasttransactiondateAsString(java.lang.String lasttransactiondate){
	this.lasttransactiondateIsValid = true;
	this.lasttransactiondateAsRawString = lasttransactiondate;
try{
		if(StringUtils.isNotBlank(lasttransactiondate)){ format.parse(lasttransactiondate);}
}catch (java.text.ParseException pe){
this.lasttransactiondateIsValid = false;
}
	if(lasttransactiondateIsValid){
		try {
			this.lasttransactiondate = (org.apache.commons.lang.StringUtils.isBlank(lasttransactiondate)) ? null : format.parse(lasttransactiondate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setLasttransactiondateAsRawString(java.lang.String lasttransactiondate){
	this.lasttransactiondateAsRawString = lasttransactiondate;
}

public String getLasttransactiondateAsRawString(){
return this.lasttransactiondateAsRawString;
}
private Date rundate;
public void setRundate(Date rundate){
this.rundate = rundate;
}
public Date getRundate(){
return this.rundate;
}
private boolean rundateIsValid = false;
public void setRundateIsValid(boolean rundateIsValid){
this.rundateIsValid = rundateIsValid;
}
public boolean isRundateIsValid(){
return this.rundateIsValid;
}
private java.lang.String rundateAsRawString ="";
public java.lang.String getRundateAsString(){
    return (rundate== null) ? null : format.format(rundate);
}
public void setRundateAsString(java.lang.String rundate){
	this.rundateIsValid = true;
	this.rundateAsRawString = rundate;
try{
		if(StringUtils.isNotBlank(rundate)){ format.parse(rundate);}
}catch (java.text.ParseException pe){
this.rundateIsValid = false;
}
	if(rundateIsValid){
		try {
			this.rundate = (org.apache.commons.lang.StringUtils.isBlank(rundate)) ? null : format.parse(rundate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setRundateAsRawString(java.lang.String rundate){
	this.rundateAsRawString = rundate;
}

public String getRundateAsRawString(){
return this.rundateAsRawString;
}
private String kumikanyear;
public void setKumikanyear(String kumikanyear){
this.kumikanyear = kumikanyear;
}
public String getKumikanyear(){
return this.kumikanyear;
}
private int remainingoftheyear;
public void setRemainingoftheyear(int remainingoftheyear){
this.remainingoftheyear = remainingoftheyear;
}
public int getRemainingoftheyear(){
return this.remainingoftheyear;
}
private int remainingofnextyear;
public void setRemainingofnextyear(int remainingofnextyear){
this.remainingofnextyear = remainingofnextyear;
}
public int getRemainingofnextyear(){
return this.remainingofnextyear;
}
private int maxbalance;
public void setMaxbalance(int maxbalance){
this.maxbalance = maxbalance;
}
public int getMaxbalance(){
return this.maxbalance;
}
private int leeway;
public void setLeeway(int leeway){
this.leeway = leeway;
}
public int getLeeway(){
return this.leeway;
}
private int incometotal;
public void setIncometotal(int incometotal){
this.incometotal = incometotal;
}
public int getIncometotal(){
return this.incometotal;
}
private int incomeoftheyear;
public void setIncomeoftheyear(int incomeoftheyear){
this.incomeoftheyear = incomeoftheyear;
}
public int getIncomeoftheyear(){
return this.incomeoftheyear;
}
private int incomeofthenextyear;
public void setIncomeofthenextyear(int incomeofthenextyear){
this.incomeofthenextyear = incomeofthenextyear;
}
public int getIncomeofthenextyear(){
return this.incomeofthenextyear;
}
private int expensetotal;
public void setExpensetotal(int expensetotal){
this.expensetotal = expensetotal;
}
public int getExpensetotal(){
return this.expensetotal;
}
private int expenseoftheyear;
public void setExpenseoftheyear(int expenseoftheyear){
this.expenseoftheyear = expenseoftheyear;
}
public int getExpenseoftheyear(){
return this.expenseoftheyear;
}
private int expenseofnextyear;
public void setExpenseofnextyear(int expenseofnextyear){
this.expenseofnextyear = expenseofnextyear;
}
public int getExpenseofnextyear(){
return this.expenseofnextyear;
}
private int maxsupply;
public void setMaxsupply(int maxsupply){
this.maxsupply = maxsupply;
}
public int getMaxsupply(){
return this.maxsupply;
}
private int leewayprice;
public void setLeewayprice(int leewayprice){
this.leewayprice = leewayprice;
}
public int getLeewayprice(){
return this.leewayprice;
}
private int nonaccounted;
public void setNonaccounted(int nonaccounted){
this.nonaccounted = nonaccounted;
}
public int getNonaccounted(){
return this.nonaccounted;
}
private int leewayshortage;
public void setLeewayshortage(int leewayshortage){
this.leewayshortage = leewayshortage;
}
public int getLeewayshortage(){
return this.leewayshortage;
}
private Date accountcloseddata;
public void setAccountcloseddata(Date accountcloseddata){
this.accountcloseddata = accountcloseddata;
}
public Date getAccountcloseddata(){
return this.accountcloseddata;
}
private boolean accountcloseddataIsValid = false;
public void setAccountcloseddataIsValid(boolean accountcloseddataIsValid){
this.accountcloseddataIsValid = accountcloseddataIsValid;
}
public boolean isAccountcloseddataIsValid(){
return this.accountcloseddataIsValid;
}
private java.lang.String accountcloseddataAsRawString ="";
public java.lang.String getAccountcloseddataAsString(){
    return (accountcloseddata== null) ? null : format.format(accountcloseddata);
}
public void setAccountcloseddataAsString(java.lang.String accountcloseddata){
	this.accountcloseddataIsValid = true;
	this.accountcloseddataAsRawString = accountcloseddata;
try{
		if(StringUtils.isNotBlank(accountcloseddata)){ format.parse(accountcloseddata);}
}catch (java.text.ParseException pe){
this.accountcloseddataIsValid = false;
}
	if(accountcloseddataIsValid){
		try {
			this.accountcloseddata = (org.apache.commons.lang.StringUtils.isBlank(accountcloseddata)) ? null : format.parse(accountcloseddata);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setAccountcloseddataAsRawString(java.lang.String accountcloseddata){
	this.accountcloseddataAsRawString = accountcloseddata;
}

public String getAccountcloseddataAsRawString(){
return this.accountcloseddataAsRawString;
}
private String displaytype;
public void setDisplaytype(String displaytype){
this.displaytype = displaytype;
}
public String getDisplaytype(){
return this.displaytype;
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
private Integer category;
public void setCategory(Integer category){
this.category = category;
}
public Integer getCategory(){
return this.category;
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
