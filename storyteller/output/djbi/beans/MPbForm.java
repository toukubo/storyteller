package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MPbForm
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
private String delFlg;
public void setDelFlg(String delFlg){
this.delFlg = delFlg;
}
public String getDelFlg(){
return this.delFlg;
}
private Double seqNo;
public void setSeqNo(Double seqNo){
this.seqNo = seqNo;
}
public Double getSeqNo(){
return this.seqNo;
}
private String pbKbn;
public void setPbKbn(String pbKbn){
this.pbKbn = pbKbn;
}
public String getPbKbn(){
return this.pbKbn;
}
private String pbName;
public void setPbName(String pbName){
this.pbName = pbName;
}
public String getPbName(){
return this.pbName;
}
private String dfltKbn;
public void setDfltKbn(String dfltKbn){
this.dfltKbn = dfltKbn;
}
public String getDfltKbn(){
return this.dfltKbn;
}
private Double updDate;
public void setUpdDate(Double updDate){
this.updDate = updDate;
}
public Double getUpdDate(){
return this.updDate;
}
private String updId;
public void setUpdId(String updId){
this.updId = updId;
}
public String getUpdId(){
return this.updId;
}
private Double insDate;
public void setInsDate(Double insDate){
this.insDate = insDate;
}
public Double getInsDate(){
return this.insDate;
}
private String insId;
public void setInsId(String insId){
this.insId = insId;
}
public String getInsId(){
return this.insId;
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
