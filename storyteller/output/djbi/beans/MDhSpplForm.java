package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MDhSpplForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String dhSpplCd;
public void setDhSpplCd(String dhSpplCd){
this.dhSpplCd = dhSpplCd;
}
public String getDhSpplCd(){
return this.dhSpplCd;
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
private String spplName;
public void setSpplName(String spplName){
this.spplName = spplName;
}
public String getSpplName(){
return this.spplName;
}
private String seqCd;
public void setSeqCd(String seqCd){
this.seqCd = seqCd;
}
public String getSeqCd(){
return this.seqCd;
}
private String delFlg;
public void setDelFlg(String delFlg){
this.delFlg = delFlg;
}
public String getDelFlg(){
return this.delFlg;
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
