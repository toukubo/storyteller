package net.GKNJR003.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class BM_JNJBMNForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Date tORKDATETIM;
public void setTORKDATETIM(Date tORKDATETIM){
this.tORKDATETIM = tORKDATETIM;
}
public Date getTORKDATETIM(){
return this.tORKDATETIM;
}
private boolean tORKDATETIMIsValid = false;
public void setTORKDATETIMIsValid(boolean tORKDATETIMIsValid){
this.tORKDATETIMIsValid = tORKDATETIMIsValid;
}
public boolean isTORKDATETIMIsValid(){
return this.tORKDATETIMIsValid;
}
private java.lang.String tORKDATETIMAsRawString ="";
public java.lang.String getTORKDATETIMAsString(){
    return (tORKDATETIM== null) ? null : format.format(tORKDATETIM);
}
public void setTORKDATETIMAsString(java.lang.String tORKDATETIM){
	this.tORKDATETIMIsValid = true;
	this.tORKDATETIMAsRawString = tORKDATETIM;
try{
		if(StringUtils.isNotBlank(tORKDATETIM)){ format.parse(tORKDATETIM);}
}catch (java.text.ParseException pe){
this.tORKDATETIMIsValid = false;
}
	if(tORKDATETIMIsValid){
		try {
			this.tORKDATETIM = (org.apache.commons.lang.StringUtils.isBlank(tORKDATETIM)) ? null : format.parse(tORKDATETIM);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTORKDATETIMAsRawString(java.lang.String tORKDATETIM){
	this.tORKDATETIMAsRawString = tORKDATETIM;
}

public String getTORKDATETIMAsRawString(){
return this.tORKDATETIMAsRawString;
}
private String tORKUSRID;
public void setTORKUSRID(String tORKUSRID){
this.tORKUSRID = tORKUSRID;
}
public String getTORKUSRID(){
return this.tORKUSRID;
}
private String uPDDATETIM;
public void setUPDDATETIM(String uPDDATETIM){
this.uPDDATETIM = uPDDATETIM;
}
public String getUPDDATETIM(){
return this.uPDDATETIM;
}
private String uPDAP;
public void setUPDAP(String uPDAP){
this.uPDAP = uPDAP;
}
public String getUPDAP(){
return this.uPDAP;
}
private String uPDUSRID;
public void setUPDUSRID(String uPDUSRID){
this.uPDUSRID = uPDUSRID;
}
public String getUPDUSRID(){
return this.uPDUSRID;
}
private String uPDTNMTNM;
public void setUPDTNMTNM(String uPDTNMTNM){
this.uPDTNMTNM = uPDTNMTNM;
}
public String getUPDTNMTNM(){
return this.uPDTNMTNM;
}
private String copcd;
public void setCopcd(String copcd){
this.copcd = copcd;
}
public String getCopcd(){
return this.copcd;
}
private String jbjbmncd;
public void setJbjbmncd(String jbjbmncd){
this.jbjbmncd = jbjbmncd;
}
public String getJbjbmncd(){
return this.jbjbmncd;
}
private String btryukytncd;
public void setBtryukytncd(String btryukytncd){
this.btryukytncd = btryukytncd;
}
public String getBtryukytncd(){
return this.btryukytncd;
}
private String egstncd;
public void setEgstncd(String egstncd){
this.egstncd = egstncd;
}
public String getEgstncd(){
return this.egstncd;
}
private String bmnnmk;
public void setBmnnmk(String bmnnmk){
this.bmnnmk = bmnnmk;
}
public String getBmnnmk(){
return this.bmnnmk;
}
private String bmnnma;
public void setBmnnma(String bmnnma){
this.bmnnma = bmnnma;
}
public String getBmnnma(){
return this.bmnnma;
}
private String bmnnmrk;
public void setBmnnmrk(String bmnnmrk){
this.bmnnmrk = bmnnmrk;
}
public String getBmnnmrk(){
return this.bmnnmrk;
}
private String bmnnmra;
public void setBmnnmra(String bmnnmra){
this.bmnnmra = bmnnmra;
}
public String getBmnnmra(){
return this.bmnnmra;
}
private String hnsaflg;
public void setHnsaflg(String hnsaflg){
this.hnsaflg = hnsaflg;
}
public String getHnsaflg(){
return this.hnsaflg;
}
private String delflg;
public void setDelflg(String delflg){
this.delflg = delflg;
}
public String getDelflg(){
return this.delflg;
}
private Date torkdatetim;
public void setTorkdatetim(Date torkdatetim){
this.torkdatetim = torkdatetim;
}
public Date getTorkdatetim(){
return this.torkdatetim;
}
private boolean torkdatetimIsValid = false;
public void setTorkdatetimIsValid(boolean torkdatetimIsValid){
this.torkdatetimIsValid = torkdatetimIsValid;
}
public boolean isTorkdatetimIsValid(){
return this.torkdatetimIsValid;
}
private java.lang.String torkdatetimAsRawString ="";
public java.lang.String getTorkdatetimAsString(){
    return (torkdatetim== null) ? null : format.format(torkdatetim);
}
public void setTorkdatetimAsString(java.lang.String torkdatetim){
	this.torkdatetimIsValid = true;
	this.torkdatetimAsRawString = torkdatetim;
try{
		if(StringUtils.isNotBlank(torkdatetim)){ format.parse(torkdatetim);}
}catch (java.text.ParseException pe){
this.torkdatetimIsValid = false;
}
	if(torkdatetimIsValid){
		try {
			this.torkdatetim = (org.apache.commons.lang.StringUtils.isBlank(torkdatetim)) ? null : format.parse(torkdatetim);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTorkdatetimAsRawString(java.lang.String torkdatetim){
	this.torkdatetimAsRawString = torkdatetim;
}

public String getTorkdatetimAsRawString(){
return this.torkdatetimAsRawString;
}
private String torkap;
public void setTorkap(String torkap){
this.torkap = torkap;
}
public String getTorkap(){
return this.torkap;
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
