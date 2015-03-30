package net.gasweb.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ChoiseForm
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
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private boolean wapping;
public void setWapping(boolean wapping){
this.wapping = wapping;
}
public boolean isWapping(){
return this.wapping;
}
private int pricewithtax;
public void setPricewithtax(int pricewithtax){
this.pricewithtax = pricewithtax;
}
public int getPricewithtax(){
return this.pricewithtax;
}
private Integer product;
public void setProduct(Integer product){
this.product = product;
}
public Integer getProduct(){
return this.product;
}
private Integer cart;
public void setCart(Integer cart){
this.cart = cart;
}
public Integer getCart(){
return this.cart;
}
private Integer paymentToArtist;
public void setPaymentToArtist(Integer paymentToArtist){
this.paymentToArtist = paymentToArtist;
}
public Integer getPaymentToArtist(){
return this.paymentToArtist;
}
private Integer product1;
public void setProduct1(Integer product1){
this.product1 = product1;
}
public Integer getProduct1(){
return this.product1;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	wapping =false;
}
}
