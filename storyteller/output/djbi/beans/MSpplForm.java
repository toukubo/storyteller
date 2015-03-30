package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MSpplForm
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
private String delFlg;
public void setDelFlg(String delFlg){
this.delFlg = delFlg;
}
public String getDelFlg(){
return this.delFlg;
}
private String spplRykj;
public void setSpplRykj(String spplRykj){
this.spplRykj = spplRykj;
}
public String getSpplRykj(){
return this.spplRykj;
}
private Double rmvDate;
public void setRmvDate(Double rmvDate){
this.rmvDate = rmvDate;
}
public Double getRmvDate(){
return this.rmvDate;
}
private String rmvId;
public void setRmvId(String rmvId){
this.rmvId = rmvId;
}
public String getRmvId(){
return this.rmvId;
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
