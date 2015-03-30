package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class InvoiceForm
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
private String currency;
public void setCurrency(String currency){
this.currency = currency;
}
public String getCurrency(){
return this.currency;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Integer job;
public void setJob(Integer job){
this.job = job;
}
public Integer getJob(){
return this.job;
}
private int code;
public void setCode(int code){
this.code = code;
}
public int getCode(){
return this.code;
}
private Integer organization;
public void setOrganization(Integer organization){
this.organization = organization;
}
public Integer getOrganization(){
return this.organization;
}
private float total;
public void setTotal(float total){
this.total = total;
}
public float getTotal(){
return this.total;
}
private String subject;
public void setSubject(String subject){
this.subject = subject;
}
public String getSubject(){
return this.subject;
}
private Date billingdate;
public void setBillingdate(Date billingdate){
this.billingdate = billingdate;
}
public Date getBillingdate(){
return this.billingdate;
}
private boolean billingdateIsValid = false;
public void setBillingdateIsValid(boolean billingdateIsValid){
this.billingdateIsValid = billingdateIsValid;
}
public boolean isBillingdateIsValid(){
return this.billingdateIsValid;
}
private java.lang.String billingdateAsRawString ="";
public java.lang.String getBillingdateAsString(){
    return (billingdate== null) ? null : format.format(billingdate);
}
public void setBillingdateAsString(java.lang.String billingdate){
	this.billingdateIsValid = true;
	this.billingdateAsRawString = billingdate;
try{
		if(StringUtils.isNotBlank(billingdate)){ format.parse(billingdate);}
}catch (java.text.ParseException pe){
this.billingdateIsValid = false;
}
	if(billingdateIsValid){
		try {
			this.billingdate = (org.apache.commons.lang.StringUtils.isBlank(billingdate)) ? null : format.parse(billingdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setBillingdateAsRawString(java.lang.String billingdate){
	this.billingdateAsRawString = billingdate;
}

public String getBillingdateAsRawString(){
return this.billingdateAsRawString;
}
private Date duedate;
public void setDuedate(Date duedate){
this.duedate = duedate;
}
public Date getDuedate(){
return this.duedate;
}
private boolean duedateIsValid = false;
public void setDuedateIsValid(boolean duedateIsValid){
this.duedateIsValid = duedateIsValid;
}
public boolean isDuedateIsValid(){
return this.duedateIsValid;
}
private java.lang.String duedateAsRawString ="";
public java.lang.String getDuedateAsString(){
    return (duedate== null) ? null : format.format(duedate);
}
public void setDuedateAsString(java.lang.String duedate){
	this.duedateIsValid = true;
	this.duedateAsRawString = duedate;
try{
		if(StringUtils.isNotBlank(duedate)){ format.parse(duedate);}
}catch (java.text.ParseException pe){
this.duedateIsValid = false;
}
	if(duedateIsValid){
		try {
			this.duedate = (org.apache.commons.lang.StringUtils.isBlank(duedate)) ? null : format.parse(duedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDuedateAsRawString(java.lang.String duedate){
	this.duedateAsRawString = duedate;
}

public String getDuedateAsRawString(){
return this.duedateAsRawString;
}
private float payment;
public void setPayment(float payment){
this.payment = payment;
}
public float getPayment(){
return this.payment;
}
private String infotransfer;
public void setInfotransfer(String infotransfer){
this.infotransfer = infotransfer;
}
public String getInfotransfer(){
return this.infotransfer;
}
private float taxbeforecharges;
public void setTaxbeforecharges(float taxbeforecharges){
this.taxbeforecharges = taxbeforecharges;
}
public float getTaxbeforecharges(){
return this.taxbeforecharges;
}
private float totconsumptiontax;
public void setTotconsumptiontax(float totconsumptiontax){
this.totconsumptiontax = totconsumptiontax;
}
public float getTotconsumptiontax(){
return this.totconsumptiontax;
}
private float cost;
public void setCost(float cost){
this.cost = cost;
}
public float getCost(){
return this.cost;
}
private float margin;
public void setMargin(float margin){
this.margin = margin;
}
public float getMargin(){
return this.margin;
}
private float marginrate;
public void setMarginrate(float marginrate){
this.marginrate = marginrate;
}
public float getMarginrate(){
return this.marginrate;
}
private int partno;
public void setPartno(int partno){
this.partno = partno;
}
public int getPartno(){
return this.partno;
}
private String productname;
public void setProductname(String productname){
this.productname = productname;
}
public String getProductname(){
return this.productname;
}
private int qty;
public void setQty(int qty){
this.qty = qty;
}
public int getQty(){
return this.qty;
}
private float purchaseprice;
public void setPurchaseprice(float purchaseprice){
this.purchaseprice = purchaseprice;
}
public float getPurchaseprice(){
return this.purchaseprice;
}
private String overseas;
public void setOverseas(String overseas){
this.overseas = overseas;
}
public String getOverseas(){
return this.overseas;
}
private float rate;
public void setRate(float rate){
this.rate = rate;
}
public float getRate(){
return this.rate;
}
private float retailprice;
public void setRetailprice(float retailprice){
this.retailprice = retailprice;
}
public float getRetailprice(){
return this.retailprice;
}
private float rackrate;
public void setRackrate(float rackrate){
this.rackrate = rackrate;
}
public float getRackrate(){
return this.rackrate;
}
private float wholesaleprice;
public void setWholesaleprice(float wholesaleprice){
this.wholesaleprice = wholesaleprice;
}
public float getWholesaleprice(){
return this.wholesaleprice;
}
private float salestax;
public void setSalestax(float salestax){
this.salestax = salestax;
}
public float getSalestax(){
return this.salestax;
}
private String taxinternorextern;
public void setTaxinternorextern(String taxinternorextern){
this.taxinternorextern = taxinternorextern;
}
public String getTaxinternorextern(){
return this.taxinternorextern;
}
private float tax;
public void setTax(float tax){
this.tax = tax;
}
public float getTax(){
return this.tax;
}
private float pretaxsales;
public void setPretaxsales(float pretaxsales){
this.pretaxsales = pretaxsales;
}
public float getPretaxsales(){
return this.pretaxsales;
}
private String remark;
public void setRemark(String remark){
this.remark = remark;
}
public String getRemark(){
return this.remark;
}
private Integer invoiceUnit;
public void setInvoiceUnit(Integer invoiceUnit){
this.invoiceUnit = invoiceUnit;
}
public Integer getInvoiceUnit(){
return this.invoiceUnit;
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
