package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SRcvStoremnthForm
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
private String spplCd;
public void setSpplCd(String spplCd){
this.spplCd = spplCd;
}
public String getSpplCd(){
return this.spplCd;
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
private String storCd;
public void setStorCd(String storCd){
this.storCd = storCd;
}
public String getStorCd(){
return this.storCd;
}
private Double orderQty;
public void setOrderQty(Double orderQty){
this.orderQty = orderQty;
}
public Double getOrderQty(){
return this.orderQty;
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
private Double smrDayYm;
public void setSmrDayYm(Double smrDayYm){
this.smrDayYm = smrDayYm;
}
public Double getSmrDayYm(){
return this.smrDayYm;
}
private Double orderCostprc;
public void setOrderCostprc(Double orderCostprc){
this.orderCostprc = orderCostprc;
}
public Double getOrderCostprc(){
return this.orderCostprc;
}
private Double orderSellprc;
public void setOrderSellprc(Double orderSellprc){
this.orderSellprc = orderSellprc;
}
public Double getOrderSellprc(){
return this.orderSellprc;
}
private Double rcvQty;
public void setRcvQty(Double rcvQty){
this.rcvQty = rcvQty;
}
public Double getRcvQty(){
return this.rcvQty;
}
private Double rcvCostprc;
public void setRcvCostprc(Double rcvCostprc){
this.rcvCostprc = rcvCostprc;
}
public Double getRcvCostprc(){
return this.rcvCostprc;
}
private Double rcvSellprc;
public void setRcvSellprc(Double rcvSellprc){
this.rcvSellprc = rcvSellprc;
}
public Double getRcvSellprc(){
return this.rcvSellprc;
}
private Double inRcvRtnQty;
public void setInRcvRtnQty(Double inRcvRtnQty){
this.inRcvRtnQty = inRcvRtnQty;
}
public Double getInRcvRtnQty(){
return this.inRcvRtnQty;
}
private Double inRcvRtnCostprc;
public void setInRcvRtnCostprc(Double inRcvRtnCostprc){
this.inRcvRtnCostprc = inRcvRtnCostprc;
}
public Double getInRcvRtnCostprc(){
return this.inRcvRtnCostprc;
}
private Double inRcvRtnSellprc;
public void setInRcvRtnSellprc(Double inRcvRtnSellprc){
this.inRcvRtnSellprc = inRcvRtnSellprc;
}
public Double getInRcvRtnSellprc(){
return this.inRcvRtnSellprc;
}
private Double inTrnsfStorQty;
public void setInTrnsfStorQty(Double inTrnsfStorQty){
this.inTrnsfStorQty = inTrnsfStorQty;
}
public Double getInTrnsfStorQty(){
return this.inTrnsfStorQty;
}
private Double inTrnsfStorCostprc;
public void setInTrnsfStorCostprc(Double inTrnsfStorCostprc){
this.inTrnsfStorCostprc = inTrnsfStorCostprc;
}
public Double getInTrnsfStorCostprc(){
return this.inTrnsfStorCostprc;
}
private Double inTrnsfStorSellprc;
public void setInTrnsfStorSellprc(Double inTrnsfStorSellprc){
this.inTrnsfStorSellprc = inTrnsfStorSellprc;
}
public Double getInTrnsfStorSellprc(){
return this.inTrnsfStorSellprc;
}
private Double inRcvDiscMny;
public void setInRcvDiscMny(Double inRcvDiscMny){
this.inRcvDiscMny = inRcvDiscMny;
}
public Double getInRcvDiscMny(){
return this.inRcvDiscMny;
}
private Double inRcvRebtMny;
public void setInRcvRebtMny(Double inRcvRebtMny){
this.inRcvRebtMny = inRcvRebtMny;
}
public Double getInRcvRebtMny(){
return this.inRcvRebtMny;
}
private Double inTrnsfGropQty;
public void setInTrnsfGropQty(Double inTrnsfGropQty){
this.inTrnsfGropQty = inTrnsfGropQty;
}
public Double getInTrnsfGropQty(){
return this.inTrnsfGropQty;
}
private Double inTrnsfGropCostprc;
public void setInTrnsfGropCostprc(Double inTrnsfGropCostprc){
this.inTrnsfGropCostprc = inTrnsfGropCostprc;
}
public Double getInTrnsfGropCostprc(){
return this.inTrnsfGropCostprc;
}
private Double inTrnsfGropSellprc;
public void setInTrnsfGropSellprc(Double inTrnsfGropSellprc){
this.inTrnsfGropSellprc = inTrnsfGropSellprc;
}
public Double getInTrnsfGropSellprc(){
return this.inTrnsfGropSellprc;
}
private Double prcUp;
public void setPrcUp(Double prcUp){
this.prcUp = prcUp;
}
public Double getPrcUp(){
return this.prcUp;
}
private Double prcupDsMthsl;
public void setPrcupDsMthsl(Double prcupDsMthsl){
this.prcupDsMthsl = prcupDsMthsl;
}
public Double getPrcupDsMthsl(){
return this.prcupDsMthsl;
}
private Double prcupDsOther;
public void setPrcupDsOther(Double prcupDsOther){
this.prcupDsOther = prcupDsOther;
}
public Double getPrcupDsOther(){
return this.prcupDsOther;
}
private Double prcupDsSlip;
public void setPrcupDsSlip(Double prcupDsSlip){
this.prcupDsSlip = prcupDsSlip;
}
public Double getPrcupDsSlip(){
return this.prcupDsSlip;
}
private Double prcDown;
public void setPrcDown(Double prcDown){
this.prcDown = prcDown;
}
public Double getPrcDown(){
return this.prcDown;
}
private Double prcdwnDsMthsl;
public void setPrcdwnDsMthsl(Double prcdwnDsMthsl){
this.prcdwnDsMthsl = prcdwnDsMthsl;
}
public Double getPrcdwnDsMthsl(){
return this.prcdwnDsMthsl;
}
private Double prcdwnDsClrsl;
public void setPrcdwnDsClrsl(Double prcdwnDsClrsl){
this.prcdwnDsClrsl = prcdwnDsClrsl;
}
public Double getPrcdwnDsClrsl(){
return this.prcdwnDsClrsl;
}
private Double prcdwnDsOther;
public void setPrcdwnDsOther(Double prcdwnDsOther){
this.prcdwnDsOther = prcdwnDsOther;
}
public Double getPrcdwnDsOther(){
return this.prcdwnDsOther;
}
private Double prcdwnDsSlip;
public void setPrcdwnDsSlip(Double prcdwnDsSlip){
this.prcdwnDsSlip = prcdwnDsSlip;
}
public Double getPrcdwnDsSlip(){
return this.prcdwnDsSlip;
}
private Double junkQty;
public void setJunkQty(Double junkQty){
this.junkQty = junkQty;
}
public Double getJunkQty(){
return this.junkQty;
}
private Double junkMny;
public void setJunkMny(Double junkMny){
this.junkMny = junkMny;
}
public Double getJunkMny(){
return this.junkMny;
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
