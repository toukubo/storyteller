package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SDlvrCtlForm
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
private Double actlDate;
public void setActlDate(Double actlDate){
this.actlDate = actlDate;
}
public Double getActlDate(){
return this.actlDate;
}
private Double fyStartYm;
public void setFyStartYm(Double fyStartYm){
this.fyStartYm = fyStartYm;
}
public Double getFyStartYm(){
return this.fyStartYm;
}
private Double orderQty;
public void setOrderQty(Double orderQty){
this.orderQty = orderQty;
}
public Double getOrderQty(){
return this.orderQty;
}
private Double dlvrPymd;
public void setDlvrPymd(Double dlvrPymd){
this.dlvrPymd = dlvrPymd;
}
public Double getDlvrPymd(){
return this.dlvrPymd;
}
private Double dlvrYmd;
public void setDlvrYmd(Double dlvrYmd){
this.dlvrYmd = dlvrYmd;
}
public Double getDlvrYmd(){
return this.dlvrYmd;
}
private Double dlvrQty;
public void setDlvrQty(Double dlvrQty){
this.dlvrQty = dlvrQty;
}
public Double getDlvrQty(){
return this.dlvrQty;
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
