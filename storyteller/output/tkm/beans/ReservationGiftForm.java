package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ReservationGiftForm
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
private Integer number;
public void setNumber(Integer number){
this.number = number;
}
public Integer getNumber(){
return this.number;
}
private Integer reservation;
public void setReservation(Integer reservation){
this.reservation = reservation;
}
public Integer getReservation(){
return this.reservation;
}
private Integer gift;
public void setGift(Integer gift){
this.gift = gift;
}
public Integer getGift(){
return this.gift;
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
