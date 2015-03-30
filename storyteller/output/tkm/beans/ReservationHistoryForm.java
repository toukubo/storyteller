package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ReservationHistoryForm
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
private String memo;
public void setMemo(String memo){
this.memo = memo;
}
public String getMemo(){
return this.memo;
}
private Integer reservation;
public void setReservation(Integer reservation){
this.reservation = reservation;
}
public Integer getReservation(){
return this.reservation;
}
private Integer shopId;
public void setShopId(Integer shopId){
this.shopId = shopId;
}
public Integer getShopId(){
return this.shopId;
}
private String planName;
public void setPlanName(String planName){
this.planName = planName;
}
public String getPlanName(){
return this.planName;
}
private Integer planId;
public void setPlanId(Integer planId){
this.planId = planId;
}
public Integer getPlanId(){
return this.planId;
}
private String tableTypeThemeTitle;
public void setTableTypeThemeTitle(String tableTypeThemeTitle){
this.tableTypeThemeTitle = tableTypeThemeTitle;
}
public String getTableTypeThemeTitle(){
return this.tableTypeThemeTitle;
}
private Integer tableTypeThemeId;
public void setTableTypeThemeId(Integer tableTypeThemeId){
this.tableTypeThemeId = tableTypeThemeId;
}
public Integer getTableTypeThemeId(){
return this.tableTypeThemeId;
}
private String giftDetail;
public void setGiftDetail(String giftDetail){
this.giftDetail = giftDetail;
}
public String getGiftDetail(){
return this.giftDetail;
}
private String priceDetail;
public void setPriceDetail(String priceDetail){
this.priceDetail = priceDetail;
}
public String getPriceDetail(){
return this.priceDetail;
}
private Boolean callTaxi;
public void setCallTaxi(Boolean callTaxi){
this.callTaxi = callTaxi;
}
public Boolean getCallTaxi(){
return this.callTaxi;
}
private String shopName;
public void setShopName(String shopName){
this.shopName = shopName;
}
public String getShopName(){
return this.shopName;
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
