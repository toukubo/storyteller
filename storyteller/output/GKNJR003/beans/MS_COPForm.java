package net.GKNJR003.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MS_COPForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String tORKDATETIM;
public void setTORKDATETIM(String tORKDATETIM){
this.tORKDATETIM = tORKDATETIM;
}
public String getTORKDATETIM(){
return this.tORKDATETIM;
}
private String tORKAP;
public void setTORKAP(String tORKAP){
this.tORKAP = tORKAP;
}
public String getTORKAP(){
return this.tORKAP;
}
private String tORKUSRID;
public void setTORKUSRID(String tORKUSRID){
this.tORKUSRID = tORKUSRID;
}
public String getTORKUSRID(){
return this.tORKUSRID;
}
private String sHRIYMDATE;
public void setSHRIYMDATE(String sHRIYMDATE){
this.sHRIYMDATE = sHRIYMDATE;
}
public String getSHRIYMDATE(){
return this.sHRIYMDATE;
}
private String oUTJN;
public void setOUTJN(String oUTJN){
this.oUTJN = oUTJN;
}
public String getOUTJN(){
return this.oUTJN;
}
private String copcd;
public void setCopcd(String copcd){
this.copcd = copcd;
}
public String getCopcd(){
return this.copcd;
}
private String delflg;
public void setDelflg(String delflg){
this.delflg = delflg;
}
public String getDelflg(){
return this.delflg;
}
private String copnmk;
public void setCopnmk(String copnmk){
this.copnmk = copnmk;
}
public String getCopnmk(){
return this.copnmk;
}
private String copnma;
public void setCopnma(String copnma){
this.copnma = copnma;
}
public String getCopnma(){
return this.copnma;
}
private String copnmrk;
public void setCopnmrk(String copnmrk){
this.copnmrk = copnmrk;
}
public String getCopnmrk(){
return this.copnmrk;
}
private String copnmra;
public void setCopnmra(String copnmra){
this.copnmra = copnmra;
}
public String getCopnmra(){
return this.copnmra;
}
private String copkirtkbn;
public void setCopkirtkbn(String copkirtkbn){
this.copkirtkbn = copkirtkbn;
}
public String getCopkirtkbn(){
return this.copkirtkbn;
}
private String copkbn;
public void setCopkbn(String copkbn){
this.copkbn = copkbn;
}
public String getCopkbn(){
return this.copkbn;
}
private String kesnkbn;
public void setKesnkbn(String kesnkbn){
this.kesnkbn = kesnkbn;
}
public String getKesnkbn(){
return this.kesnkbn;
}
private String kesndra;
public void setKesndra(String kesndra){
this.kesndra = kesndra;
}
public String getKesndra(){
return this.kesndra;
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
