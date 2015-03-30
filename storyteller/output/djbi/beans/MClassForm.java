package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MClassForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String dptCd;
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
private Integer mMkr;
public void setMMkr(Integer mMkr){
this.mMkr = mMkr;
}
public Integer getMMkr(){
return this.mMkr;
}
private Date btUpdDt;
public void setBtUpdDt(Date btUpdDt){
this.btUpdDt = btUpdDt;
}
public Date getBtUpdDt(){
return this.btUpdDt;
}
private boolean btUpdDtIsValid = false;
public void setBtUpdDtIsValid(boolean btUpdDtIsValid){
this.btUpdDtIsValid = btUpdDtIsValid;
}
public boolean isBtUpdDtIsValid(){
return this.btUpdDtIsValid;
}
private java.lang.String btUpdDtAsRawString ="";
public java.lang.String getBtUpdDtAsString(){
    return (btUpdDt== null) ? null : format.format(btUpdDt);
}
public void setBtUpdDtAsString(java.lang.String btUpdDt){
	this.btUpdDtIsValid = true;
	this.btUpdDtAsRawString = btUpdDt;
try{
		if(StringUtils.isNotBlank(btUpdDt)){ format.parse(btUpdDt);}
}catch (java.text.ParseException pe){
this.btUpdDtIsValid = false;
}
	if(btUpdDtIsValid){
		try {
			this.btUpdDt = (org.apache.commons.lang.StringUtils.isBlank(btUpdDt)) ? null : format.parse(btUpdDt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setBtUpdDtAsRawString(java.lang.String btUpdDt){
	this.btUpdDtAsRawString = btUpdDt;
}

public String getBtUpdDtAsRawString(){
return this.btUpdDtAsRawString;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
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
