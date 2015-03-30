package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MWeekNoForm
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
private Double smwekMonDate;
public void setSmwekMonDate(Double smwekMonDate){
this.smwekMonDate = smwekMonDate;
}
public Double getSmwekMonDate(){
return this.smwekMonDate;
}
private Double clYear;
public void setClYear(Double clYear){
this.clYear = clYear;
}
public Double getClYear(){
return this.clYear;
}
private Double clWekSresno;
public void setClWekSresno(Double clWekSresno){
this.clWekSresno = clWekSresno;
}
public Double getClWekSresno(){
return this.clWekSresno;
}
private Double clMnth;
public void setClMnth(Double clMnth){
this.clMnth = clMnth;
}
public Double getClMnth(){
return this.clMnth;
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
