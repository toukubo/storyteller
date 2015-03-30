package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class M_ClassForm
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
private String dptCd;
public void setDptCd(String dptCd){
this.dptCd = dptCd;
}
public String getDptCd(){
return this.dptCd;
}
private String lineCd;
public void setLineCd(String lineCd){
this.lineCd = lineCd;
}
public String getLineCd(){
return this.lineCd;
}
private String clsCd;
public void setClsCd(String clsCd){
this.clsCd = clsCd;
}
public String getClsCd(){
return this.clsCd;
}
private String subclsCd;
public void setSubclsCd(String subclsCd){
this.subclsCd = subclsCd;
}
public String getSubclsCd(){
return this.subclsCd;
}
private String mdCd;
public void setMdCd(String mdCd){
this.mdCd = mdCd;
}
public String getMdCd(){
return this.mdCd;
}
private String mdNm;
public void setMdNm(String mdNm){
this.mdNm = mdNm;
}
public String getMdNm(){
return this.mdNm;
}
private String dptNm;
public void setDptNm(String dptNm){
this.dptNm = dptNm;
}
public String getDptNm(){
return this.dptNm;
}
private String lineNm;
public void setLineNm(String lineNm){
this.lineNm = lineNm;
}
public String getLineNm(){
return this.lineNm;
}
private String clsNm;
public void setClsNm(String clsNm){
this.clsNm = clsNm;
}
public String getClsNm(){
return this.clsNm;
}
private String subclsNm;
public void setSubclsNm(String subclsNm){
this.subclsNm = subclsNm;
}
public String getSubclsNm(){
return this.subclsNm;
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
