package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SInvntStoredayForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer rowId;
public void setRowId(Integer rowId){
this.rowId = rowId;
}
public Integer getRowId(){
return this.rowId;
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
private String janCd;
public void setJanCd(String janCd){
this.janCd = janCd;
}
public String getJanCd(){
return this.janCd;
}
private Double tkyEndYmd;
public void setTkyEndYmd(Double tkyEndYmd){
this.tkyEndYmd = tkyEndYmd;
}
public Double getTkyEndYmd(){
return this.tkyEndYmd;
}
private Double tkyStartYmd;
public void setTkyStartYmd(Double tkyStartYmd){
this.tkyStartYmd = tkyStartYmd;
}
public Double getTkyStartYmd(){
return this.tkyStartYmd;
}
private String storCd;
public void setStorCd(String storCd){
this.storCd = storCd;
}
public String getStorCd(){
return this.storCd;
}
private Double mstSellprc;
public void setMstSellprc(Double mstSellprc){
this.mstSellprc = mstSellprc;
}
public Double getMstSellprc(){
return this.mstSellprc;
}
private Double mstSellprcIntax;
public void setMstSellprcIntax(Double mstSellprcIntax){
this.mstSellprcIntax = mstSellprcIntax;
}
public Double getMstSellprcIntax(){
return this.mstSellprcIntax;
}
private Double mstCostprc;
public void setMstCostprc(Double mstCostprc){
this.mstCostprc = mstCostprc;
}
public Double getMstCostprc(){
return this.mstCostprc;
}
private Double invntQty;
public void setInvntQty(Double invntQty){
this.invntQty = invntQty;
}
public Double getInvntQty(){
return this.invntQty;
}
private Double invntSellprc;
public void setInvntSellprc(Double invntSellprc){
this.invntSellprc = invntSellprc;
}
public Double getInvntSellprc(){
return this.invntSellprc;
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
