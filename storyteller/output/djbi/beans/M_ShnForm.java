package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class M_ShnForm
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
private String dptCd;
public void setDptCd(String dptCd){
this.dptCd = dptCd;
}
public String getDptCd(){
return this.dptCd;
}
private String lineCd;
public void setLineCd(String lineCd){
this.lineCd = lineCd;
}
public String getLineCd(){
return this.lineCd;
}
private String clsCd;
public void setClsCd(String clsCd){
this.clsCd = clsCd;
}
public String getClsCd(){
return this.clsCd;
}
private String mdCd;
public void setMdCd(String mdCd){
this.mdCd = mdCd;
}
public String getMdCd(){
return this.mdCd;
}
private String mkrCd;
public void setMkrCd(String mkrCd){
this.mkrCd = mkrCd;
}
public String getMkrCd(){
return this.mkrCd;
}
private String janCd;
public void setJanCd(String janCd){
this.janCd = janCd;
}
public String getJanCd(){
return this.janCd;
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
private String shnKjm;
public void setShnKjm(String shnKjm){
this.shnKjm = shnKjm;
}
public String getShnKjm(){
return this.shnKjm;
}
private String shnKana;
public void setShnKana(String shnKana){
this.shnKana = shnKana;
}
public String getShnKana(){
return this.shnKana;
}
private String specKjm;
public void setSpecKjm(String specKjm){
this.specKjm = specKjm;
}
public String getSpecKjm(){
return this.specKjm;
}
private String trdcoCd;
public void setTrdcoCd(String trdcoCd){
this.trdcoCd = trdcoCd;
}
public String getTrdcoCd(){
return this.trdcoCd;
}
private String sclsCd;
public void setSclsCd(String sclsCd){
this.sclsCd = sclsCd;
}
public String getSclsCd(){
return this.sclsCd;
}
private String pbKbn;
public void setPbKbn(String pbKbn){
this.pbKbn = pbKbn;
}
public String getPbKbn(){
return this.pbKbn;
}
private String procKbn;
public void setProcKbn(String procKbn){
this.procKbn = procKbn;
}
public String getProcKbn(){
return this.procKbn;
}
private String ptnNum;
public void setPtnNum(String ptnNum){
this.ptnNum = ptnNum;
}
public String getPtnNum(){
return this.ptnNum;
}
private Double stdCost;
public void setStdCost(Double stdCost){
this.stdCost = stdCost;
}
public Double getStdCost(){
return this.stdCost;
}
private Double sellPrc;
public void setSellPrc(Double sellPrc){
this.sellPrc = sellPrc;
}
public Double getSellPrc(){
return this.sellPrc;
}
private Double ttlSellPrc;
public void setTtlSellPrc(Double ttlSellPrc){
this.ttlSellPrc = ttlSellPrc;
}
public Double getTtlSellPrc(){
return this.ttlSellPrc;
}
private Double rglrPrice;
public void setRglrPrice(Double rglrPrice){
this.rglrPrice = rglrPrice;
}
public Double getRglrPrice(){
return this.rglrPrice;
}
private Double orderUnit;
public void setOrderUnit(Double orderUnit){
this.orderUnit = orderUnit;
}
public Double getOrderUnit(){
return this.orderUnit;
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
