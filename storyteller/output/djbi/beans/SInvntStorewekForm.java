package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SInvntStorewekForm
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
private Double stmInvntQty;
public void setStmInvntQty(Double stmInvntQty){
this.stmInvntQty = stmInvntQty;
}
public Double getStmInvntQty(){
return this.stmInvntQty;
}
private Double stmInvntSellprc;
public void setStmInvntSellprc(Double stmInvntSellprc){
this.stmInvntSellprc = stmInvntSellprc;
}
public Double getStmInvntSellprc(){
return this.stmInvntSellprc;
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
