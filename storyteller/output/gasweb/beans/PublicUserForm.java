package net.gasweb.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PublicUserForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String name;
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
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private boolean admin;
public void setAdmin(boolean admin){
this.admin = admin;
}
public boolean isAdmin(){
return this.admin;
}
private int zipthree;
public void setZipthree(int zipthree){
this.zipthree = zipthree;
}
public int getZipthree(){
return this.zipthree;
}
private int zipfour;
public void setZipfour(int zipfour){
this.zipfour = zipfour;
}
public int getZipfour(){
return this.zipfour;
}
private String pref;
public void setPref(String pref){
this.pref = pref;
}
public String getPref(){
return this.pref;
}
private String phone;
public void setPhone(String phone){
this.phone = phone;
}
public String getPhone(){
return this.phone;
}
private String buildingname;
public void setBuildingname(String buildingname){
this.buildingname = buildingname;
}
public String getBuildingname(){
return this.buildingname;
}
private String keitai;
public void setKeitai(String keitai){
this.keitai = keitai;
}
public String getKeitai(){
return this.keitai;
}
private int birthyear;
public void setBirthyear(int birthyear){
this.birthyear = birthyear;
}
public int getBirthyear(){
return this.birthyear;
}
private String municipality;
public void setMunicipality(String municipality){
this.municipality = municipality;
}
public String getMunicipality(){
return this.municipality;
}
private int birthmonth;
public void setBirthmonth(int birthmonth){
this.birthmonth = birthmonth;
}
public int getBirthmonth(){
return this.birthmonth;
}
private String mailforconfirm;
public void setMailforconfirm(String mailforconfirm){
this.mailforconfirm = mailforconfirm;
}
public String getMailforconfirm(){
return this.mailforconfirm;
}
private int brithday;
public void setBrithday(int brithday){
this.brithday = brithday;
}
public int getBrithday(){
return this.brithday;
}
private boolean male;
public void setMale(boolean male){
this.male = male;
}
public boolean isMale(){
return this.male;
}
private String blocknumber;
public void setBlocknumber(String blocknumber){
this.blocknumber = blocknumber;
}
public String getBlocknumber(){
return this.blocknumber;
}
private String kana;
public void setKana(String kana){
this.kana = kana;
}
public String getKana(){
return this.kana;
}
private boolean delivertodifferentaddress;
public void setDelivertodifferentaddress(boolean delivertodifferentaddress){
this.delivertodifferentaddress = delivertodifferentaddress;
}
public boolean isDelivertodifferentaddress(){
return this.delivertodifferentaddress;
}
private String deliverypref;
public void setDeliverypref(String deliverypref){
this.deliverypref = deliverypref;
}
public String getDeliverypref(){
return this.deliverypref;
}
private int deliveryzipthree;
public void setDeliveryzipthree(int deliveryzipthree){
this.deliveryzipthree = deliveryzipthree;
}
public int getDeliveryzipthree(){
return this.deliveryzipthree;
}
private int deliveryzipfour;
public void setDeliveryzipfour(int deliveryzipfour){
this.deliveryzipfour = deliveryzipfour;
}
public int getDeliveryzipfour(){
return this.deliveryzipfour;
}
private String deliveryname;
public void setDeliveryname(String deliveryname){
this.deliveryname = deliveryname;
}
public String getDeliveryname(){
return this.deliveryname;
}
private String deliveryaddress;
public void setDeliveryaddress(String deliveryaddress){
this.deliveryaddress = deliveryaddress;
}
public String getDeliveryaddress(){
return this.deliveryaddress;
}
private String deliveryblocknumber;
public void setDeliveryblocknumber(String deliveryblocknumber){
this.deliveryblocknumber = deliveryblocknumber;
}
public String getDeliveryblocknumber(){
return this.deliveryblocknumber;
}
private String deliverykana;
public void setDeliverykana(String deliverykana){
this.deliverykana = deliverykana;
}
public String getDeliverykana(){
return this.deliverykana;
}
private int deliveryphone;
public void setDeliveryphone(int deliveryphone){
this.deliveryphone = deliveryphone;
}
public int getDeliveryphone(){
return this.deliveryphone;
}
private int deliverydate;
public void setDeliverydate(int deliverydate){
this.deliverydate = deliverydate;
}
public int getDeliverydate(){
return this.deliverydate;
}
private int devliveryhour;
public void setDevliveryhour(int devliveryhour){
this.devliveryhour = devliveryhour;
}
public int getDevliveryhour(){
return this.devliveryhour;
}
private Integer currentcart;
public void setCurrentcart(Integer currentcart){
this.currentcart = currentcart;
}
public Integer getCurrentcart(){
return this.currentcart;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
	admin =false;
	male =false;
	delivertodifferentaddress =false;
}
}
