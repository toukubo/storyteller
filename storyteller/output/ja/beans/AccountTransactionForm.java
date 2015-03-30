package net.ja.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AccountTransactionForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String basiccode;
public void setBasiccode(String basiccode){
this.basiccode = basiccode;
}
public String getBasiccode(){
return this.basiccode;
}
private String detailcode;
public void setDetailcode(String detailcode){
this.detailcode = detailcode;
}
public String getDetailcode(){
return this.detailcode;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String no;
public void setNo(String no){
this.no = no;
}
public String getNo(){
return this.no;
}
private String bodytaxtype;
public void setBodytaxtype(String bodytaxtype){
this.bodytaxtype = bodytaxtype;
}
public String getBodytaxtype(){
return this.bodytaxtype;
}
private String branch;
public void setBranch(String branch){
this.branch = branch;
}
public String getBranch(){
return this.branch;
}
private Date dateinaccount;
public void setDateinaccount(Date dateinaccount){
this.dateinaccount = dateinaccount;
}
public Date getDateinaccount(){
return this.dateinaccount;
}
private boolean dateinaccountIsValid = false;
public void setDateinaccountIsValid(boolean dateinaccountIsValid){
this.dateinaccountIsValid = dateinaccountIsValid;
}
public boolean isDateinaccountIsValid(){
return this.dateinaccountIsValid;
}
private java.lang.String dateinaccountAsRawString ="";
public java.lang.String getDateinaccountAsString(){
    return (dateinaccount== null) ? null : format.format(dateinaccount);
}
public void setDateinaccountAsString(java.lang.String dateinaccount){
	this.dateinaccountIsValid = true;
	this.dateinaccountAsRawString = dateinaccount;
try{
		if(StringUtils.isNotBlank(dateinaccount)){ format.parse(dateinaccount);}
}catch (java.text.ParseException pe){
this.dateinaccountIsValid = false;
}
	if(dateinaccountIsValid){
		try {
			this.dateinaccount = (org.apache.commons.lang.StringUtils.isBlank(dateinaccount)) ? null : format.parse(dateinaccount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateinaccountAsRawString(java.lang.String dateinaccount){
	this.dateinaccountAsRawString = dateinaccount;
}

public String getDateinaccountAsRawString(){
return this.dateinaccountAsRawString;
}
private String seqno;
public void setSeqno(String seqno){
this.seqno = seqno;
}
public String getSeqno(){
return this.seqno;
}
private String transactiondate;
public void setTransactiondate(String transactiondate){
this.transactiondate = transactiondate;
}
public String getTransactiondate(){
return this.transactiondate;
}
private Date reckondate;
public void setReckondate(Date reckondate){
this.reckondate = reckondate;
}
public Date getReckondate(){
return this.reckondate;
}
private boolean reckondateIsValid = false;
public void setReckondateIsValid(boolean reckondateIsValid){
this.reckondateIsValid = reckondateIsValid;
}
public boolean isReckondateIsValid(){
return this.reckondateIsValid;
}
private java.lang.String reckondateAsRawString ="";
public java.lang.String getReckondateAsString(){
    return (reckondate== null) ? null : format.format(reckondate);
}
public void setReckondateAsString(java.lang.String reckondate){
	this.reckondateIsValid = true;
	this.reckondateAsRawString = reckondate;
try{
		if(StringUtils.isNotBlank(reckondate)){ format.parse(reckondate);}
}catch (java.text.ParseException pe){
this.reckondateIsValid = false;
}
	if(reckondateIsValid){
		try {
			this.reckondate = (org.apache.commons.lang.StringUtils.isBlank(reckondate)) ? null : format.parse(reckondate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setReckondateAsRawString(java.lang.String reckondate){
	this.reckondateAsRawString = reckondate;
}

public String getReckondateAsRawString(){
return this.reckondateAsRawString;
}
private String peeraccountingcodeinshort;
public void setPeeraccountingcodeinshort(String peeraccountingcodeinshort){
this.peeraccountingcodeinshort = peeraccountingcodeinshort;
}
public String getPeeraccountingcodeinshort(){
return this.peeraccountingcodeinshort;
}
private String abstraction;
public void setAbstraction(String abstraction){
this.abstraction = abstraction;
}
public String getAbstraction(){
return this.abstraction;
}
private String genhuricode;
public void setGenhuricode(String genhuricode){
this.genhuricode = genhuricode;
}
public String getGenhuricode(){
return this.genhuricode;
}
private String taishaku;
public void setTaishaku(String taishaku){
this.taishaku = taishaku;
}
public String getTaishaku(){
return this.taishaku;
}
private String peertype;
public void setPeertype(String peertype){
this.peertype = peertype;
}
public String getPeertype(){
return this.peertype;
}
private String typecode;
public void setTypecode(String typecode){
this.typecode = typecode;
}
public String getTypecode(){
return this.typecode;
}
private String variablestatscodeone;
public void setVariablestatscodeone(String variablestatscodeone){
this.variablestatscodeone = variablestatscodeone;
}
public String getVariablestatscodeone(){
return this.variablestatscodeone;
}
private String variablestatscodetwo;
public void setVariablestatscodetwo(String variablestatscodetwo){
this.variablestatscodetwo = variablestatscodetwo;
}
public String getVariablestatscodetwo(){
return this.variablestatscodetwo;
}
private String taxtype;
public void setTaxtype(String taxtype){
this.taxtype = taxtype;
}
public String getTaxtype(){
return this.taxtype;
}
private String reportingtype;
public void setReportingtype(String reportingtype){
this.reportingtype = reportingtype;
}
public String getReportingtype(){
return this.reportingtype;
}
private String infocode;
public void setInfocode(String infocode){
this.infocode = infocode;
}
public String getInfocode(){
return this.infocode;
}
private String datapattern;
public void setDatapattern(String datapattern){
this.datapattern = datapattern;
}
public String getDatapattern(){
return this.datapattern;
}
private String updateuserid;
public void setUpdateuserid(String updateuserid){
this.updateuserid = updateuserid;
}
public String getUpdateuserid(){
return this.updateuserid;
}
private String inputeddate;
public void setInputeddate(String inputeddate){
this.inputeddate = inputeddate;
}
public String getInputeddate(){
return this.inputeddate;
}
private String oldbasecode;
public void setOldbasecode(String oldbasecode){
this.oldbasecode = oldbasecode;
}
public String getOldbasecode(){
return this.oldbasecode;
}
private String olddetailedcode;
public void setOlddetailedcode(String olddetailedcode){
this.olddetailedcode = olddetailedcode;
}
public String getOlddetailedcode(){
return this.olddetailedcode;
}
private Integer category;
public void setCategory(Integer category){
this.category = category;
}
public Integer getCategory(){
return this.category;
}
private String value;
public void setValue(String value){
this.value = value;
}
public String getValue(){
return this.value;
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
