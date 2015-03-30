package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class InvoiceUnitForm
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
private float enteredprice;
public void setEnteredprice(float enteredprice){
this.enteredprice = enteredprice;
}
public float getEnteredprice(){
return this.enteredprice;
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
