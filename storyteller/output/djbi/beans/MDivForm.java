package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MDivForm
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
private String coKjm;
public void setCoKjm(String coKjm){
this.coKjm = coKjm;
}
public String getCoKjm(){
return this.coKjm;
}
private Double seqNo;
public void setSeqNo(Double seqNo){
this.seqNo = seqNo;
}
public Double getSeqNo(){
return this.seqNo;
}
private Double tdfkSeqNo;
public void setTdfkSeqNo(Double tdfkSeqNo){
this.tdfkSeqNo = tdfkSeqNo;
}
public Double getTdfkSeqNo(){
return this.tdfkSeqNo;
}
private String coIfCd;
public void setCoIfCd(String coIfCd){
this.coIfCd = coIfCd;
}
public String getCoIfCd(){
return this.coIfCd;
}
private Integer rowId;
public void setRowId(Integer rowId){
this.rowId = rowId;
}
public Integer getRowId(){
return this.rowId;
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
