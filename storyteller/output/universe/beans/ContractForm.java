package net.universe.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ContractForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Date appearancedate;
public void setAppearancedate(Date appearancedate){
this.appearancedate = appearancedate;
}
public Date getAppearancedate(){
return this.appearancedate;
}
private boolean appearancedateIsValid = false;
public void setAppearancedateIsValid(boolean appearancedateIsValid){
this.appearancedateIsValid = appearancedateIsValid;
}
public boolean isAppearancedateIsValid(){
return this.appearancedateIsValid;
}
private java.lang.String appearancedateAsRawString ="";
public java.lang.String getAppearancedateAsString(){
    return (appearancedate== null) ? null : format.format(appearancedate);
}
public void setAppearancedateAsString(java.lang.String appearancedate){
	this.appearancedateIsValid = true;
	this.appearancedateAsRawString = appearancedate;
try{
		if(StringUtils.isNotBlank(appearancedate)){ format.parse(appearancedate);}
}catch (java.text.ParseException pe){
this.appearancedateIsValid = false;
}
	if(appearancedateIsValid){
		try {
			this.appearancedate = (org.apache.commons.lang.StringUtils.isBlank(appearancedate)) ? null : format.parse(appearancedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setAppearancedateAsRawString(java.lang.String appearancedate){
	this.appearancedateAsRawString = appearancedate;
}

public String getAppearancedateAsRawString(){
return this.appearancedateAsRawString;
}
private int totalprice;
public void setTotalprice(int totalprice){
this.totalprice = totalprice;
}
public int getTotalprice(){
return this.totalprice;
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
private Integer customer;
public void setCustomer(Integer customer){
this.customer = customer;
}
public Integer getCustomer(){
return this.customer;
}
private int total;
public void setTotal(int total){
this.total = total;
}
public int getTotal(){
return this.total;
}
private int tax;
public void setTax(int tax){
this.tax = tax;
}
public int getTax(){
return this.tax;
}
private String programname;
public void setProgramname(String programname){
this.programname = programname;
}
public String getProgramname(){
return this.programname;
}
private String invoiceno;
public void setInvoiceno(String invoiceno){
this.invoiceno = invoiceno;
}
public String getInvoiceno(){
return this.invoiceno;
}
private Date invoicedate;
public void setInvoicedate(Date invoicedate){
this.invoicedate = invoicedate;
}
public Date getInvoicedate(){
return this.invoicedate;
}
private boolean invoicedateIsValid = false;
public void setInvoicedateIsValid(boolean invoicedateIsValid){
this.invoicedateIsValid = invoicedateIsValid;
}
public boolean isInvoicedateIsValid(){
return this.invoicedateIsValid;
}
private java.lang.String invoicedateAsRawString ="";
public java.lang.String getInvoicedateAsString(){
    return (invoicedate== null) ? null : format.format(invoicedate);
}
public void setInvoicedateAsString(java.lang.String invoicedate){
	this.invoicedateIsValid = true;
	this.invoicedateAsRawString = invoicedate;
try{
		if(StringUtils.isNotBlank(invoicedate)){ format.parse(invoicedate);}
}catch (java.text.ParseException pe){
this.invoicedateIsValid = false;
}
	if(invoicedateIsValid){
		try {
			this.invoicedate = (org.apache.commons.lang.StringUtils.isBlank(invoicedate)) ? null : format.parse(invoicedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setInvoicedateAsRawString(java.lang.String invoicedate){
	this.invoicedateAsRawString = invoicedate;
}

public String getInvoicedateAsRawString(){
return this.invoicedateAsRawString;
}
private Date receivedate;
public void setReceivedate(Date receivedate){
this.receivedate = receivedate;
}
public Date getReceivedate(){
return this.receivedate;
}
private boolean receivedateIsValid = false;
public void setReceivedateIsValid(boolean receivedateIsValid){
this.receivedateIsValid = receivedateIsValid;
}
public boolean isReceivedateIsValid(){
return this.receivedateIsValid;
}
private java.lang.String receivedateAsRawString ="";
public java.lang.String getReceivedateAsString(){
    return (receivedate== null) ? null : format.format(receivedate);
}
public void setReceivedateAsString(java.lang.String receivedate){
	this.receivedateIsValid = true;
	this.receivedateAsRawString = receivedate;
try{
		if(StringUtils.isNotBlank(receivedate)){ format.parse(receivedate);}
}catch (java.text.ParseException pe){
this.receivedateIsValid = false;
}
	if(receivedateIsValid){
		try {
			this.receivedate = (org.apache.commons.lang.StringUtils.isBlank(receivedate)) ? null : format.parse(receivedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setReceivedateAsRawString(java.lang.String receivedate){
	this.receivedateAsRawString = receivedate;
}

public String getReceivedateAsRawString(){
return this.receivedateAsRawString;
}
private int totalreceiveprice;
public void setTotalreceiveprice(int totalreceiveprice){
this.totalreceiveprice = totalreceiveprice;
}
public int getTotalreceiveprice(){
return this.totalreceiveprice;
}
private Date contractdate;
public void setContractdate(Date contractdate){
this.contractdate = contractdate;
}
public Date getContractdate(){
return this.contractdate;
}
private boolean contractdateIsValid = false;
public void setContractdateIsValid(boolean contractdateIsValid){
this.contractdateIsValid = contractdateIsValid;
}
public boolean isContractdateIsValid(){
return this.contractdateIsValid;
}
private java.lang.String contractdateAsRawString ="";
public java.lang.String getContractdateAsString(){
    return (contractdate== null) ? null : format.format(contractdate);
}
public void setContractdateAsString(java.lang.String contractdate){
	this.contractdateIsValid = true;
	this.contractdateAsRawString = contractdate;
try{
		if(StringUtils.isNotBlank(contractdate)){ format.parse(contractdate);}
}catch (java.text.ParseException pe){
this.contractdateIsValid = false;
}
	if(contractdateIsValid){
		try {
			this.contractdate = (org.apache.commons.lang.StringUtils.isBlank(contractdate)) ? null : format.parse(contractdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setContractdateAsRawString(java.lang.String contractdate){
	this.contractdateAsRawString = contractdate;
}

public String getContractdateAsRawString(){
return this.contractdateAsRawString;
}
private boolean invoiced;
public void setInvoiced(boolean invoiced){
this.invoiced = invoiced;
}
public boolean isInvoiced(){
return this.invoiced;
}
private boolean received;
public void setReceived(boolean received){
this.received = received;
}
public boolean isReceived(){
return this.received;
}
private int commission;
public void setCommission(int commission){
this.commission = commission;
}
public int getCommission(){
return this.commission;
}
private boolean deleted;
public void setDeleted(boolean deleted){
this.deleted = deleted;
}
public boolean isDeleted(){
return this.deleted;
}
private String address2;
public void setAddress2(String address2){
this.address2 = address2;
}
public String getAddress2(){
return this.address2;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	invoiced =false;
	received =false;
	deleted =false;
}
}
