package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SSalesStorewekForm
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
private Double smwekMonDate;
public void setSmwekMonDate(Double smwekMonDate){
this.smwekMonDate = smwekMonDate;
}
public Double getSmwekMonDate(){
return this.smwekMonDate;
}
private Double clYearwekSresno;
public void setClYearwekSresno(Double clYearwekSresno){
this.clYearwekSresno = clYearwekSresno;
}
public Double getClYearwekSresno(){
return this.clYearwekSresno;
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
private Double posSellprc;
public void setPosSellprc(Double posSellprc){
this.posSellprc = posSellprc;
}
public Double getPosSellprc(){
return this.posSellprc;
}
private Double buyQty;
public void setBuyQty(Double buyQty){
this.buyQty = buyQty;
}
public Double getBuyQty(){
return this.buyQty;
}
private Double salesQty;
public void setSalesQty(Double salesQty){
this.salesQty = salesQty;
}
public Double getSalesQty(){
return this.salesQty;
}
private Double salesMny;
public void setSalesMny(Double salesMny){
this.salesMny = salesMny;
}
public Double getSalesMny(){
return this.salesMny;
}
private Double inSalesRtnQty;
public void setInSalesRtnQty(Double inSalesRtnQty){
this.inSalesRtnQty = inSalesRtnQty;
}
public Double getInSalesRtnQty(){
return this.inSalesRtnQty;
}
private Double inSalesRtnMny;
public void setInSalesRtnMny(Double inSalesRtnMny){
this.inSalesRtnMny = inSalesRtnMny;
}
public Double getInSalesRtnMny(){
return this.inSalesRtnMny;
}
private Double brgnDiscMny;
public void setBrgnDiscMny(Double brgnDiscMny){
this.brgnDiscMny = brgnDiscMny;
}
public Double getBrgnDiscMny(){
return this.brgnDiscMny;
}
private Double prcdwnAtBrgn;
public void setPrcdwnAtBrgn(Double prcdwnAtBrgn){
this.prcdwnAtBrgn = prcdwnAtBrgn;
}
public Double getPrcdwnAtBrgn(){
return this.prcdwnAtBrgn;
}
private Double otherDiscMny;
public void setOtherDiscMny(Double otherDiscMny){
this.otherDiscMny = otherDiscMny;
}
public Double getOtherDiscMny(){
return this.otherDiscMny;
}
private Double prcdwnAtClrsl;
public void setPrcdwnAtClrsl(Double prcdwnAtClrsl){
this.prcdwnAtClrsl = prcdwnAtClrsl;
}
public Double getPrcdwnAtClrsl(){
return this.prcdwnAtClrsl;
}
private Double prcdwnAtOther;
public void setPrcdwnAtOther(Double prcdwnAtOther){
this.prcdwnAtOther = prcdwnAtOther;
}
public Double getPrcdwnAtOther(){
return this.prcdwnAtOther;
}
private Double prcupAtOther;
public void setPrcupAtOther(Double prcupAtOther){
this.prcupAtOther = prcupAtOther;
}
public Double getPrcupAtOther(){
return this.prcupAtOther;
}
private Double prcdwnMtPos;
public void setPrcdwnMtPos(Double prcdwnMtPos){
this.prcdwnMtPos = prcdwnMtPos;
}
public Double getPrcdwnMtPos(){
return this.prcdwnMtPos;
}
private Double prcdwnMtSlip;
public void setPrcdwnMtSlip(Double prcdwnMtSlip){
this.prcdwnMtSlip = prcdwnMtSlip;
}
public Double getPrcdwnMtSlip(){
return this.prcdwnMtSlip;
}
private String brgnKbn;
public void setBrgnKbn(String brgnKbn){
this.brgnKbn = brgnKbn;
}
public String getBrgnKbn(){
return this.brgnKbn;
}
private String edlpKbn;
public void setEdlpKbn(String edlpKbn){
this.edlpKbn = edlpKbn;
}
public String getEdlpKbn(){
return this.edlpKbn;
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
