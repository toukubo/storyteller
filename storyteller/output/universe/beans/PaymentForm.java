package net.universe.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PaymentForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private int commission;
public void setCommission(int commission){
this.commission = commission;
}
public int getCommission(){
return this.commission;
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
private Integer contract;
public void setContract(Integer contract){
this.contract = contract;
}
public Integer getContract(){
return this.contract;
}
private Integer narrator;
public void setNarrator(Integer narrator){
this.narrator = narrator;
}
public Integer getNarrator(){
return this.narrator;
}
private int total;
public void setTotal(int total){
this.total = total;
}
public int getTotal(){
return this.total;
}
private int no;
public void setNo(int no){
this.no = no;
}
public int getNo(){
return this.no;
}
private int tax;
public void setTax(int tax){
this.tax = tax;
}
public int getTax(){
return this.tax;
}
private int totalprice;
public void setTotalprice(int totalprice){
this.totalprice = totalprice;
}
public int getTotalprice(){
return this.totalprice;
}
private int managementrate;
public void setManagementrate(int managementrate){
this.managementrate = managementrate;
}
public int getManagementrate(){
return this.managementrate;
}
private int managementprice;
public void setManagementprice(int managementprice){
this.managementprice = managementprice;
}
public int getManagementprice(){
return this.managementprice;
}
private int withholdingtax;
public void setWithholdingtax(int withholdingtax){
this.withholdingtax = withholdingtax;
}
public int getWithholdingtax(){
return this.withholdingtax;
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
private Integer contractDetail;
public void setContractDetail(Integer contractDetail){
this.contractDetail = contractDetail;
}
public Integer getContractDetail(){
return this.contractDetail;
}
private boolean payment;
public void setPayment(boolean payment){
this.payment = payment;
}
public boolean isPayment(){
return this.payment;
}
private boolean paid;
public void setPaid(boolean paid){
this.paid = paid;
}
public boolean isPaid(){
return this.paid;
}
private boolean deleted;
public void setDeleted(boolean deleted){
this.deleted = deleted;
}
public boolean isDeleted(){
return this.deleted;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	payment =false;
	paid =false;
	deleted =false;
}
}
