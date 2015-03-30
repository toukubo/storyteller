package net.crm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PurchaseForm
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
private Integer campaign;
public void setCampaign(Integer campaign){
this.campaign = campaign;
}
public Integer getCampaign(){
return this.campaign;
}
private Integer product;
public void setProduct(Integer product){
this.product = product;
}
public Integer getProduct(){
return this.product;
}
private Integer siteAccess;
public void setSiteAccess(Integer siteAccess){
this.siteAccess = siteAccess;
}
public Integer getSiteAccess(){
return this.siteAccess;
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
