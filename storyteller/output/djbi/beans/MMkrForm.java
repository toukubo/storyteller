package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MMkrForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String mkrCd;
public void setMkrCd(String mkrCd){
this.mkrCd = mkrCd;
}
public String getMkrCd(){
return this.mkrCd;
}
private String repMkrCd;
public void setRepMkrCd(String repMkrCd){
this.repMkrCd = repMkrCd;
}
public String getRepMkrCd(){
return this.repMkrCd;
}
private String mkrNm;
public void setMkrNm(String mkrNm){
this.mkrNm = mkrNm;
}
public String getMkrNm(){
return this.mkrNm;
}
private String mkrKana;
public void setMkrKana(String mkrKana){
this.mkrKana = mkrKana;
}
public String getMkrKana(){
return this.mkrKana;
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
