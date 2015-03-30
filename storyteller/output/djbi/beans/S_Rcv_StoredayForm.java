package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class S_Rcv_StoredayForm
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
private String spplCd;
public void setSpplCd(String spplCd){
this.spplCd = spplCd;
}
public String getSpplCd(){
return this.spplCd;
}
private String janCd;
public void setJanCd(String janCd){
this.janCd = janCd;
}
public String getJanCd(){
return this.janCd;
}
private Double orderQty;
public void setOrderQty(Double orderQty){
this.orderQty = orderQty;
}
public Double getOrderQty(){
return this.orderQty;
}
private Double orderCostprc;
public void setOrderCostprc(Double orderCostprc){
this.orderCostprc = orderCostprc;
}
public Double getOrderCostprc(){
return this.orderCostprc;
}
private String smrDayYmd;
public void setSmrDayYmd(String smrDayYmd){
this.smrDayYmd = smrDayYmd;
}
public String getSmrDayYmd(){
return this.smrDayYmd;
}
private String inpDayYmd;
public void setInpDayYmd(String inpDayYmd){
this.inpDayYmd = inpDayYmd;
}
public String getInpDayYmd(){
return this.inpDayYmd;
}
private String actDayYmd;
public void setActDayYmd(String actDayYmd){
this.actDayYmd = actDayYmd;
}
public String getActDayYmd(){
return this.actDayYmd;
}
private String divCd;
public void setDivCd(String divCd){
this.divCd = divCd;
}
public String getDivCd(){
return this.divCd;
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
private String inRcvRtnSellprc;
public void setInRcvRtnSellprc(String inRcvRtnSellprc){
this.inRcvRtnSellprc = inRcvRtnSellprc;
}
public String getInRcvRtnSellprc(){
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
private Double prcDown;
public void setPrcDown(Double prcDown){
this.prcDown = prcDown;
}
public Double getPrcDown(){
return this.prcDown;
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
private Double lmstSellprc;
public void setLmstSellprc(Double lmstSellprc){
this.lmstSellprc = lmstSellprc;
}
public Double getLmstSellprc(){
return this.lmstSellprc;
}
private Double lmstSellprcIntax;
public void setLmstSellprcIntax(Double lmstSellprcIntax){
this.lmstSellprcIntax = lmstSellprcIntax;
}
public Double getLmstSellprcIntax(){
return this.lmstSellprcIntax;
}
private Double lmstCostprc;
public void setLmstCostprc(Double lmstCostprc){
this.lmstCostprc = lmstCostprc;
}
public Double getLmstCostprc(){
return this.lmstCostprc;
}
private Double lrcvQty;
public void setLrcvQty(Double lrcvQty){
this.lrcvQty = lrcvQty;
}
public Double getLrcvQty(){
return this.lrcvQty;
}
private Double lrcvCostprc;
public void setLrcvCostprc(Double lrcvCostprc){
this.lrcvCostprc = lrcvCostprc;
}
public Double getLrcvCostprc(){
return this.lrcvCostprc;
}
private Double lrcvSellprc;
public void setLrcvSellprc(Double lrcvSellprc){
this.lrcvSellprc = lrcvSellprc;
}
public Double getLrcvSellprc(){
return this.lrcvSellprc;
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
