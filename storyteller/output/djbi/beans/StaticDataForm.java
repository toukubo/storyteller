package net.djbi.beans;
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
private int carriage;
public void setCarriage(int carriage){
this.carriage = carriage;
}
public int getCarriage(){
return this.carriage;
}
private String fromaddress;
public void setFromaddress(String fromaddress){
this.fromaddress = fromaddress;
}
public String getFromaddress(){
return this.fromaddress;
}
private String sitename;
public void setSitename(String sitename){
this.sitename = sitename;
}
public String getSitename(){
return this.sitename;
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
private int mapeventspan;
public void setMapeventspan(int mapeventspan){
this.mapeventspan = mapeventspan;
}
public int getMapeventspan(){
return this.mapeventspan;
}
private String creditcardprocesurl;
public void setCreditcardprocesurl(String creditcardprocesurl){
this.creditcardprocesurl = creditcardprocesurl;
}
public String getCreditcardprocesurl(){
return this.creditcardprocesurl;
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
