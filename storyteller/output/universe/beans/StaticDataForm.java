package net.universe.beans;
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
private int managementrate;
public void setManagementrate(int managementrate){
this.managementrate = managementrate;
}
public int getManagementrate(){
return this.managementrate;
}
private int divisionthreshold;
public void setDivisionthreshold(int divisionthreshold){
this.divisionthreshold = divisionthreshold;
}
public int getDivisionthreshold(){
return this.divisionthreshold;
}
private int receivedeadline;
public void setReceivedeadline(int receivedeadline){
this.receivedeadline = receivedeadline;
}
public int getReceivedeadline(){
return this.receivedeadline;
}
private int paymentdeadline;
public void setPaymentdeadline(int paymentdeadline){
this.paymentdeadline = paymentdeadline;
}
public int getPaymentdeadline(){
return this.paymentdeadline;
}
private String fromaddress;
public void setFromaddress(String fromaddress){
this.fromaddress = fromaddress;
}
public String getFromaddress(){
return this.fromaddress;
}
private String basepath;
public void setBasepath(String basepath){
this.basepath = basepath;
}
public String getBasepath(){
return this.basepath;
}
private boolean unix;
public void setUnix(boolean unix){
this.unix = unix;
}
public boolean isUnix(){
return this.unix;
}
private int marginrate;
public void setMarginrate(int marginrate){
this.marginrate = marginrate;
}
public int getMarginrate(){
return this.marginrate;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	unix =false;
}
}
