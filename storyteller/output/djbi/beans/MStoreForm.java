package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MStoreForm
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
private String compCd;
public void setCompCd(String compCd){
this.compCd = compCd;
}
public String getCompCd(){
return this.compCd;
}
private String divCd;
public void setDivCd(String divCd){
this.divCd = divCd;
}
public String getDivCd(){
return this.divCd;
}
private String tkyEndYmd;
public void setTkyEndYmd(String tkyEndYmd){
this.tkyEndYmd = tkyEndYmd;
}
public String getTkyEndYmd(){
return this.tkyEndYmd;
}
private String tkyStartYmd;
public void setTkyStartYmd(String tkyStartYmd){
this.tkyStartYmd = tkyStartYmd;
}
public String getTkyStartYmd(){
return this.tkyStartYmd;
}
private String storCd;
public void setStorCd(String storCd){
this.storCd = storCd;
}
public String getStorCd(){
return this.storCd;
}
private String storKjm;
public void setStorKjm(String storKjm){
this.storKjm = storKjm;
}
public String getStorKjm(){
return this.storKjm;
}
private String tdfkCd;
public void setTdfkCd(String tdfkCd){
this.tdfkCd = tdfkCd;
}
public String getTdfkCd(){
return this.tdfkCd;
}
private String regCd;
public void setRegCd(String regCd){
this.regCd = regCd;
}
public String getRegCd(){
return this.regCd;
}
private String imptRegCd;
public void setImptRegCd(String imptRegCd){
this.imptRegCd = imptRegCd;
}
public String getImptRegCd(){
return this.imptRegCd;
}
private String storeKbn;
public void setStoreKbn(String storeKbn){
this.storeKbn = storeKbn;
}
public String getStoreKbn(){
return this.storeKbn;
}
private String splyKbn;
public void setSplyKbn(String splyKbn){
this.splyKbn = splyKbn;
}
public String getSplyKbn(){
return this.splyKbn;
}
private String gytiCd;
public void setGytiCd(String gytiCd){
this.gytiCd = gytiCd;
}
public String getGytiCd(){
return this.gytiCd;
}
private Double areaVal;
public void setAreaVal(Double areaVal){
this.areaVal = areaVal;
}
public Double getAreaVal(){
return this.areaVal;
}
private String mailNo;
public void setMailNo(String mailNo){
this.mailNo = mailNo;
}
public String getMailNo(){
return this.mailNo;
}
private String adrs;
public void setAdrs(String adrs){
this.adrs = adrs;
}
public String getAdrs(){
return this.adrs;
}
private String telNo;
public void setTelNo(String telNo){
this.telNo = telNo;
}
public String getTelNo(){
return this.telNo;
}
private String smryFlg;
public void setSmryFlg(String smryFlg){
this.smryFlg = smryFlg;
}
public String getSmryFlg(){
return this.smryFlg;
}
private String cntrCd;
public void setCntrCd(String cntrCd){
this.cntrCd = cntrCd;
}
public String getCntrCd(){
return this.cntrCd;
}
private String imptCoCd;
public void setImptCoCd(String imptCoCd){
this.imptCoCd = imptCoCd;
}
public String getImptCoCd(){
return this.imptCoCd;
}
private Integer rowId;
public void setRowId(Integer rowId){
this.rowId = rowId;
}
public Integer getRowId(){
return this.rowId;
}
private String rcvTrgtKbn;
public void setRcvTrgtKbn(String rcvTrgtKbn){
this.rcvTrgtKbn = rcvTrgtKbn;
}
public String getRcvTrgtKbn(){
return this.rcvTrgtKbn;
}
private String rcvRebtTrgtKbn;
public void setRcvRebtTrgtKbn(String rcvRebtTrgtKbn){
this.rcvRebtTrgtKbn = rcvRebtTrgtKbn;
}
public String getRcvRebtTrgtKbn(){
return this.rcvRebtTrgtKbn;
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
