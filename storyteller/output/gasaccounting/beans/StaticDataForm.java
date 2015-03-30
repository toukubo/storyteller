package net.gasaccounting.beans;
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
private int icalsyncspan;
public void setIcalsyncspan(int icalsyncspan){
this.icalsyncspan = icalsyncspan;
}
public int getIcalsyncspan(){
return this.icalsyncspan;
}
private String apid;
public void setApid(String apid){
this.apid = apid;
}
public String getApid(){
return this.apid;
}
private String japanesehollidayurl;
public void setJapanesehollidayurl(String japanesehollidayurl){
this.japanesehollidayurl = japanesehollidayurl;
}
public String getJapanesehollidayurl(){
return this.japanesehollidayurl;
}
private float overtimeworkrate;
public void setOvertimeworkrate(float overtimeworkrate){
this.overtimeworkrate = overtimeworkrate;
}
public float getOvertimeworkrate(){
return this.overtimeworkrate;
}
private float hollidayworkrate;
public void setHollidayworkrate(float hollidayworkrate){
this.hollidayworkrate = hollidayworkrate;
}
public float getHollidayworkrate(){
return this.hollidayworkrate;
}
private float midnightworkrate;
public void setMidnightworkrate(float midnightworkrate){
this.midnightworkrate = midnightworkrate;
}
public float getMidnightworkrate(){
return this.midnightworkrate;
}
private String accountingofficemailaddress;
public void setAccountingofficemailaddress(String accountingofficemailaddress){
this.accountingofficemailaddress = accountingofficemailaddress;
}
public String getAccountingofficemailaddress(){
return this.accountingofficemailaddress;
}
private String smtphost;
public void setSmtphost(String smtphost){
this.smtphost = smtphost;
}
public String getSmtphost(){
return this.smtphost;
}
private String smtpacocunt;
public void setSmtpacocunt(String smtpacocunt){
this.smtpacocunt = smtpacocunt;
}
public String getSmtpacocunt(){
return this.smtpacocunt;
}
private String smtppassword;
public void setSmtppassword(String smtppassword){
this.smtppassword = smtppassword;
}
public String getSmtppassword(){
return this.smtppassword;
}
private String gasaccountingurl;
public void setGasaccountingurl(String gasaccountingurl){
this.gasaccountingurl = gasaccountingurl;
}
public String getGasaccountingurl(){
return this.gasaccountingurl;
}
private String hashforaccountingoffice;
public void setHashforaccountingoffice(String hashforaccountingoffice){
this.hashforaccountingoffice = hashforaccountingoffice;
}
public String getHashforaccountingoffice(){
return this.hashforaccountingoffice;
}
private String mailtitleforaccountingoffice;
public void setMailtitleforaccountingoffice(String mailtitleforaccountingoffice){
this.mailtitleforaccountingoffice = mailtitleforaccountingoffice;
}
public String getMailtitleforaccountingoffice(){
return this.mailtitleforaccountingoffice;
}
private String mailbodyforaccountingoffice;
public void setMailbodyforaccountingoffice(String mailbodyforaccountingoffice){
this.mailbodyforaccountingoffice = mailbodyforaccountingoffice;
}
public String getMailbodyforaccountingoffice(){
return this.mailbodyforaccountingoffice;
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
