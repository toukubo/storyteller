package net.gasbooknet.beans;
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
private Integer item;
public void setItem(Integer item){
this.item = item;
}
public Integer getItem(){
return this.item;
}
private boolean wrapping;
public void setWrapping(boolean wrapping){
this.wrapping = wrapping;
}
public boolean isWrapping(){
return this.wrapping;
}
private Integer purchase;
public void setPurchase(Integer purchase){
this.purchase = purchase;
}
public Integer getPurchase(){
return this.purchase;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	wapping =false;
	wrapping =false;
}
}
