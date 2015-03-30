package net.gasweb.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PaymentToArtistForm
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
private boolean payed;
public void setPayed(boolean payed){
this.payed = payed;
}
public boolean isPayed(){
return this.payed;
}
private Integer recipient;
public void setRecipient(Integer recipient){
this.recipient = recipient;
}
public Integer getRecipient(){
return this.recipient;
}
private float value;
public void setValue(float value){
this.value = value;
}
public float getValue(){
return this.value;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	payed =false;
}
}
