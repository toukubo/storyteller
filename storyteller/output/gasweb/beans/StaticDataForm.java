package net.gasweb.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
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
private String notificationmailaddressofimagemagic;
public void setNotificationmailaddressofimagemagic(String notificationmailaddressofimagemagic){
this.notificationmailaddressofimagemagic = notificationmailaddressofimagemagic;
}
public String getNotificationmailaddressofimagemagic(){
return this.notificationmailaddressofimagemagic;
}
private String mailbodyofnotificationtogas;
public void setMailbodyofnotificationtogas(String mailbodyofnotificationtogas){
this.mailbodyofnotificationtogas = mailbodyofnotificationtogas;
}
public String getMailbodyofnotificationtogas(){
return this.mailbodyofnotificationtogas;
}
private String categorynameforcolormeshop;
public void setCategorynameforcolormeshop(String categorynameforcolormeshop){
this.categorynameforcolormeshop = categorynameforcolormeshop;
}
public String getCategorynameforcolormeshop(){
return this.categorynameforcolormeshop;
}
private Integer recommendedproductid;
public void setRecommendedproductid(Integer recommendedproductid){
this.recommendedproductid = recommendedproductid;
}
public Integer getRecommendedproductid(){
return this.recommendedproductid;
}
private int deliverationfee;
public void setDeliverationfee(int deliverationfee){
this.deliverationfee = deliverationfee;
}
public int getDeliverationfee(){
return this.deliverationfee;
}
private String bankinginfomarion;
public void setBankinginfomarion(String bankinginfomarion){
this.bankinginfomarion = bankinginfomarion;
}
public String getBankinginfomarion(){
return this.bankinginfomarion;
}
private String pophost;
public void setPophost(String pophost){
this.pophost = pophost;
}
public String getPophost(){
return this.pophost;
}
private String popaccount;
public void setPopaccount(String popaccount){
this.popaccount = popaccount;
}
public String getPopaccount(){
return this.popaccount;
}
private String poppassword;
public void setPoppassword(String poppassword){
this.poppassword = poppassword;
}
public String getPoppassword(){
return this.poppassword;
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
