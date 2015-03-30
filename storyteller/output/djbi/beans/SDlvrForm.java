package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SDlvrForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String compCd;
public void setCompCd(String compCd){
this.compCd = compCd;
}
public String getCompCd(){
return this.compCd;
}
private String janCd;
public void setJanCd(String janCd){
this.janCd = janCd;
}
public String getJanCd(){
return this.janCd;
}
private String trdcoCd;
public void setTrdcoCd(String trdcoCd){
this.trdcoCd = trdcoCd;
}
public String getTrdcoCd(){
return this.trdcoCd;
}
private String actlDate;
public void setActlDate(String actlDate){
this.actlDate = actlDate;
}
public String getActlDate(){
return this.actlDate;
}
private String fyStartYm;
public void setFyStartYm(String fyStartYm){
this.fyStartYm = fyStartYm;
}
public String getFyStartYm(){
return this.fyStartYm;
}
private Double orderQty;
public void setOrderQty(Double orderQty){
this.orderQty = orderQty;
}
public Double getOrderQty(){
return this.orderQty;
}
private String orderCostprc;
public void setOrderCostprc(String orderCostprc){
this.orderCostprc = orderCostprc;
}
public String getOrderCostprc(){
return this.orderCostprc;
}
private String dlvrYmd;
public void setDlvrYmd(String dlvrYmd){
this.dlvrYmd = dlvrYmd;
}
public String getDlvrYmd(){
return this.dlvrYmd;
}
private Double dlvrQty;
public void setDlvrQty(Double dlvrQty){
this.dlvrQty = dlvrQty;
}
public Double getDlvrQty(){
return this.dlvrQty;
}
private Double dlvrCostprc;
public void setDlvrCostprc(Double dlvrCostprc){
this.dlvrCostprc = dlvrCostprc;
}
public Double getDlvrCostprc(){
return this.dlvrCostprc;
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
