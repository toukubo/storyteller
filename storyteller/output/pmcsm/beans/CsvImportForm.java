package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CsvImportForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer product;
public void setProduct(Integer product){
this.product = product;
}
public Integer getProduct(){
return this.product;
}
private String modelcode;
public void setModelcode(String modelcode){
this.modelcode = modelcode;
}
public String getModelcode(){
return this.modelcode;
}
private String typename;
public void setTypename(String typename){
this.typename = typename;
}
public String getTypename(){
return this.typename;
}
private String shimuke;
public void setShimuke(String shimuke){
this.shimuke = shimuke;
}
public String getShimuke(){
return this.shimuke;
}
private Date shutsuzudate;
public void setShutsuzudate(Date shutsuzudate){
this.shutsuzudate = shutsuzudate;
}
public Date getShutsuzudate(){
return this.shutsuzudate;
}
private boolean shutsuzudateIsValid = false;
public void setShutsuzudateIsValid(boolean shutsuzudateIsValid){
this.shutsuzudateIsValid = shutsuzudateIsValid;
}
public boolean isShutsuzudateIsValid(){
return this.shutsuzudateIsValid;
}
private java.lang.String shutsuzudateAsRawString ="";
public java.lang.String getShutsuzudateAsString(){
    return (shutsuzudate== null) ? null : format.format(shutsuzudate);
}
public void setShutsuzudateAsString(java.lang.String shutsuzudate){
	this.shutsuzudateIsValid = true;
	this.shutsuzudateAsRawString = shutsuzudate;
try{
		if(StringUtils.isNotBlank(shutsuzudate)){ format.parse(shutsuzudate);}
}catch (java.text.ParseException pe){
this.shutsuzudateIsValid = false;
}
	if(shutsuzudateIsValid){
		try {
			this.shutsuzudate = (org.apache.commons.lang.StringUtils.isBlank(shutsuzudate)) ? null : format.parse(shutsuzudate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setShutsuzudateAsRawString(java.lang.String shutsuzudate){
	this.shutsuzudateAsRawString = shutsuzudate;
}

public String getShutsuzudateAsRawString(){
return this.shutsuzudateAsRawString;
}
private Date mp;
public void setMp(Date mp){
this.mp = mp;
}
public Date getMp(){
return this.mp;
}
private boolean mpIsValid = false;
public void setMpIsValid(boolean mpIsValid){
this.mpIsValid = mpIsValid;
}
public boolean isMpIsValid(){
return this.mpIsValid;
}
private java.lang.String mpAsRawString ="";
public java.lang.String getMpAsString(){
    return (mp== null) ? null : format.format(mp);
}
public void setMpAsString(java.lang.String mp){
	this.mpIsValid = true;
	this.mpAsRawString = mp;
try{
		if(StringUtils.isNotBlank(mp)){ format.parse(mp);}
}catch (java.text.ParseException pe){
this.mpIsValid = false;
}
	if(mpIsValid){
		try {
			this.mp = (org.apache.commons.lang.StringUtils.isBlank(mp)) ? null : format.parse(mp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setMpAsRawString(java.lang.String mp){
	this.mpAsRawString = mp;
}

public String getMpAsRawString(){
return this.mpAsRawString;
}
private boolean shutsuzusame;
public void setShutsuzusame(boolean shutsuzusame){
this.shutsuzusame = shutsuzusame;
}
public boolean isShutsuzusame(){
return this.shutsuzusame;
}
private boolean mpsame;
public void setMpsame(boolean mpsame){
this.mpsame = mpsame;
}
public boolean isMpsame(){
return this.mpsame;
}
private boolean modiffication;
public void setModiffication(boolean modiffication){
this.modiffication = modiffication;
}
public boolean isModiffication(){
return this.modiffication;
}
private String productcode;
public void setProductcode(String productcode){
this.productcode = productcode;
}
public String getProductcode(){
return this.productcode;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	shutsuzusame =false;
	mpsame =false;
	modiffication =false;
}
}
