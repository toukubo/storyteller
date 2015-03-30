package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class DeliveryRatePerClientForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat simpleformat = new java.text.SimpleDateFormat("yyyy/MM/dd");private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd hh:mm:ss");static { format.setLenient(true); }private int deliveryratetotal;
public void setDeliveryratetotal(int deliveryratetotal){
this.deliveryratetotal = deliveryratetotal;
}
public int getDeliveryratetotal(){
return this.deliveryratetotal;
}
private int nondeliverdnum;
public void setNondeliverdnum(int nondeliverdnum){
this.nondeliverdnum = nondeliverdnum;
}
public int getNondeliverdnum(){
return this.nondeliverdnum;
}
private int nondeliverdtotal;
public void setNondeliverdtotal(int nondeliverdtotal){
this.nondeliverdtotal = nondeliverdtotal;
}
public int getNondeliverdtotal(){
return this.nondeliverdtotal;
}
private int deliveryratenum;
public void setDeliveryratenum(int deliveryratenum){
this.deliveryratenum = deliveryratenum;
}
public int getDeliveryratenum(){
return this.deliveryratenum;
}
private int deliverytotal;
public void setDeliverytotal(int deliverytotal){
this.deliverytotal = deliverytotal;
}
public int getDeliverytotal(){
return this.deliverytotal;
}
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private Integer client;
public void setClient(Integer client){
this.client = client;
}
public Integer getClient(){
return this.client;
}
private Integer corporation;
public void setCorporation(Integer corporation){
this.corporation = corporation;
}
public Integer getCorporation(){
return this.corporation;
}
private int deliverynum;
public void setDeliverynum(int deliverynum){
this.deliverynum = deliverynum;
}
public int getDeliverynum(){
return this.deliverynum;
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
FormFile[] formFiles = new FormFile[10];
public void setFormFiles(FormFile[] formFiles){
this.formFiles = formFiles;
}
public FormFile[] getFormFiles(){
return this.formFiles;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
