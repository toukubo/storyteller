package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ShopForm
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
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
}
private Integer child;
public void setChild(Integer child){
this.child = child;
}
public Integer getChild(){
return this.child;
}
private String phoneNumber;
public void setPhoneNumber(String phoneNumber){
this.phoneNumber = phoneNumber;
}
public String getPhoneNumber(){
return this.phoneNumber;
}
private String addressBuilding;
public void setAddressBuilding(String addressBuilding){
this.addressBuilding = addressBuilding;
}
public String getAddressBuilding(){
return this.addressBuilding;
}
private Integer prefecture;
public void setPrefecture(Integer prefecture){
this.prefecture = prefecture;
}
public Integer getPrefecture(){
return this.prefecture;
}
private String nameKana;
public void setNameKana(String nameKana){
this.nameKana = nameKana;
}
public String getNameKana(){
return this.nameKana;
}
private String station;
public void setStation(String station){
this.station = station;
}
public String getStation(){
return this.station;
}
private String serviceCharge;
public void setServiceCharge(String serviceCharge){
this.serviceCharge = serviceCharge;
}
public String getServiceCharge(){
return this.serviceCharge;
}
private Integer parking;
public void setParking(Integer parking){
this.parking = parking;
}
public Integer getParking(){
return this.parking;
}
private Integer wheelchair;
public void setWheelchair(Integer wheelchair){
this.wheelchair = wheelchair;
}
public Integer getWheelchair(){
return this.wheelchair;
}
private Integer pet;
public void setPet(Integer pet){
this.pet = pet;
}
public Integer getPet(){
return this.pet;
}
private Integer smoking;
public void setSmoking(Integer smoking){
this.smoking = smoking;
}
public Integer getSmoking(){
return this.smoking;
}
private Integer backEntrance;
public void setBackEntrance(Integer backEntrance){
this.backEntrance = backEntrance;
}
public Integer getBackEntrance(){
return this.backEntrance;
}
private Integer chartered;
public void setChartered(Integer chartered){
this.chartered = chartered;
}
public Integer getChartered(){
return this.chartered;
}
private String openHours;
public void setOpenHours(String openHours){
this.openHours = openHours;
}
public String getOpenHours(){
return this.openHours;
}
private String regularHoliday;
public void setRegularHoliday(String regularHoliday){
this.regularHoliday = regularHoliday;
}
public String getRegularHoliday(){
return this.regularHoliday;
}
private String seatNum;
public void setSeatNum(String seatNum){
this.seatNum = seatNum;
}
public String getSeatNum(){
return this.seatNum;
}
private Float lng;
public void setLng(Float lng){
this.lng = lng;
}
public Float getLng(){
return this.lng;
}
private Float lat;
public void setLat(Float lat){
this.lat = lat;
}
public Float getLat(){
return this.lat;
}
private Integer averageDinnerCost;
public void setAverageDinnerCost(Integer averageDinnerCost){
this.averageDinnerCost = averageDinnerCost;
}
public Integer getAverageDinnerCost(){
return this.averageDinnerCost;
}
private Integer averageLunchCost;
public void setAverageLunchCost(Integer averageLunchCost){
this.averageLunchCost = averageLunchCost;
}
public Integer getAverageLunchCost(){
return this.averageLunchCost;
}
private String cancelCharge;
public void setCancelCharge(String cancelCharge){
this.cancelCharge = cancelCharge;
}
public String getCancelCharge(){
return this.cancelCharge;
}
private Boolean amexCard;
public void setAmexCard(Boolean amexCard){
this.amexCard = amexCard;
}
public Boolean getAmexCard(){
return this.amexCard;
}
private Boolean dinersCard;
public void setDinersCard(Boolean dinersCard){
this.dinersCard = dinersCard;
}
public Boolean getDinersCard(){
return this.dinersCard;
}
private Boolean visaCard;
public void setVisaCard(Boolean visaCard){
this.visaCard = visaCard;
}
public Boolean getVisaCard(){
return this.visaCard;
}
private Boolean masterCard;
public void setMasterCard(Boolean masterCard){
this.masterCard = masterCard;
}
public Boolean getMasterCard(){
return this.masterCard;
}
private Boolean otherCard;
public void setOtherCard(Boolean otherCard){
this.otherCard = otherCard;
}
public Boolean getOtherCard(){
return this.otherCard;
}
private Boolean jcbCard;
public void setJcbCard(Boolean jcbCard){
this.jcbCard = jcbCard;
}
public Boolean getJcbCard(){
return this.jcbCard;
}
private Integer floorImage;
public void setFloorImage(Integer floorImage){
this.floorImage = floorImage;
}
public Integer getFloorImage(){
return this.floorImage;
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
