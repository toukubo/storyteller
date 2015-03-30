package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SupplierDeliveryRateForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer term;
public void setTerm(Integer term){
this.term = term;
}
public Integer getTerm(){
return this.term;
}
private Integer company;
public void setCompany(Integer company){
this.company = company;
}
public Integer getCompany(){
return this.company;
}
private Integer supplier;
public void setSupplier(Integer supplier){
this.supplier = supplier;
}
public Integer getSupplier(){
return this.supplier;
}
private int deliverynum;
public void setDeliverynum(int deliverynum){
this.deliverynum = deliverynum;
}
public int getDeliverynum(){
return this.deliverynum;
}
private int deliverytotal;
public void setDeliverytotal(int deliverytotal){
this.deliverytotal = deliverytotal;
}
public int getDeliverytotal(){
return this.deliverytotal;
}
private int ordertotal;
public void setOrdertotal(int ordertotal){
this.ordertotal = ordertotal;
}
public int getOrdertotal(){
return this.ordertotal;
}
private Integer id;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
