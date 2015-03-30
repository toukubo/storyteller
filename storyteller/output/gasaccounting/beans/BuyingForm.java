package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class BuyingForm
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
private Integer organization;
public void setOrganization(Integer organization){
this.organization = organization;
}
public Integer getOrganization(){
return this.organization;
}
private Date deliverydate;
public void setDeliverydate(Date deliverydate){
this.deliverydate = deliverydate;
}
public Date getDeliverydate(){
return this.deliverydate;
}
private boolean deliverydateIsValid = false;
public void setDeliverydateIsValid(boolean deliverydateIsValid){
this.deliverydateIsValid = deliverydateIsValid;
}
public boolean isDeliverydateIsValid(){
return this.deliverydateIsValid;
}
private java.lang.String deliverydateAsRawString ="";
public java.lang.String getDeliverydateAsString(){
    return (deliverydate== null) ? null : format.format(deliverydate);
}
public void setDeliverydateAsString(java.lang.String deliverydate){
	this.deliverydateIsValid = true;
	this.deliverydateAsRawString = deliverydate;
try{
		if(StringUtils.isNotBlank(deliverydate)){ format.parse(deliverydate);}
}catch (java.text.ParseException pe){
this.deliverydateIsValid = false;
}
	if(deliverydateIsValid){
		try {
			this.deliverydate = (org.apache.commons.lang.StringUtils.isBlank(deliverydate)) ? null : format.parse(deliverydate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDeliverydateAsRawString(java.lang.String deliverydate){
	this.deliverydateAsRawString = deliverydate;
}

public String getDeliverydateAsRawString(){
return this.deliverydateAsRawString;
}
private int qty;
public void setQty(int qty){
this.qty = qty;
}
public int getQty(){
return this.qty;
}
private String remark;
public void setRemark(String remark){
this.remark = remark;
}
public String getRemark(){
return this.remark;
}
private int purchaseorderno;
public void setPurchaseorderno(int purchaseorderno){
this.purchaseorderno = purchaseorderno;
}
public int getPurchaseorderno(){
return this.purchaseorderno;
}
private String paymentmethods;
public void setPaymentmethods(String paymentmethods){
this.paymentmethods = paymentmethods;
}
public String getPaymentmethods(){
return this.paymentmethods;
}
private Date orderdate;
public void setOrderdate(Date orderdate){
this.orderdate = orderdate;
}
public Date getOrderdate(){
return this.orderdate;
}
private boolean orderdateIsValid = false;
public void setOrderdateIsValid(boolean orderdateIsValid){
this.orderdateIsValid = orderdateIsValid;
}
public boolean isOrderdateIsValid(){
return this.orderdateIsValid;
}
private java.lang.String orderdateAsRawString ="";
public java.lang.String getOrderdateAsString(){
    return (orderdate== null) ? null : format.format(orderdate);
}
public void setOrderdateAsString(java.lang.String orderdate){
	this.orderdateIsValid = true;
	this.orderdateAsRawString = orderdate;
try{
		if(StringUtils.isNotBlank(orderdate)){ format.parse(orderdate);}
}catch (java.text.ParseException pe){
this.orderdateIsValid = false;
}
	if(orderdateIsValid){
		try {
			this.orderdate = (org.apache.commons.lang.StringUtils.isBlank(orderdate)) ? null : format.parse(orderdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setOrderdateAsRawString(java.lang.String orderdate){
	this.orderdateAsRawString = orderdate;
}

public String getOrderdateAsRawString(){
return this.orderdateAsRawString;
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
    return (paymentdate== null) ? null : format.format(paymentdate);
}
public void setPaymentdateAsString(java.lang.String paymentdate){
	this.paymentdateIsValid = true;
	this.paymentdateAsRawString = paymentdate;
try{
		if(StringUtils.isNotBlank(paymentdate)){ format.parse(paymentdate);}
}catch (java.text.ParseException pe){
this.paymentdateIsValid = false;
}
	if(paymentdateIsValid){
		try {
			this.paymentdate = (org.apache.commons.lang.StringUtils.isBlank(paymentdate)) ? null : format.parse(paymentdate);
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
private float paymentamount;
public void setPaymentamount(float paymentamount){
this.paymentamount = paymentamount;
}
public float getPaymentamount(){
return this.paymentamount;
}
private String purchasingcontent;
public void setPurchasingcontent(String purchasingcontent){
this.purchasingcontent = purchasingcontent;
}
public String getPurchasingcontent(){
return this.purchasingcontent;
}
private int bids;
public void setBids(int bids){
this.bids = bids;
}
public int getBids(){
return this.bids;
}
private float taxamount;
public void setTaxamount(float taxamount){
this.taxamount = taxamount;
}
public float getTaxamount(){
return this.taxamount;
}
private float handpickedamount;
public void setHandpickedamount(float handpickedamount){
this.handpickedamount = handpickedamount;
}
public float getHandpickedamount(){
return this.handpickedamount;
}
private float consumptiontax;
public void setConsumptiontax(float consumptiontax){
this.consumptiontax = consumptiontax;
}
public float getConsumptiontax(){
return this.consumptiontax;
}
private float pretaxamount;
public void setPretaxamount(float pretaxamount){
this.pretaxamount = pretaxamount;
}
public float getPretaxamount(){
return this.pretaxamount;
}
private Integer accountTitle;
public void setAccountTitle(Integer accountTitle){
this.accountTitle = accountTitle;
}
public Integer getAccountTitle(){
return this.accountTitle;
}
private Integer buyingUnit;
public void setBuyingUnit(Integer buyingUnit){
this.buyingUnit = buyingUnit;
}
public Integer getBuyingUnit(){
return this.buyingUnit;
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
