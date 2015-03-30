package net.gasweb.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ArtistForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String description;
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
private String gasid;
public void setGasid(String gasid){
this.gasid = gasid;
}
public String getGasid(){
return this.gasid;
}
private Date date;
public void setDate(Date date){
this.date = date;
}
public Date getDate(){
return this.date;
}
private boolean dateIsValid = false;
public void setDateIsValid(boolean dateIsValid){
this.dateIsValid = dateIsValid;
}
public boolean isDateIsValid(){
return this.dateIsValid;
}
private java.lang.String dateAsRawString ="";
public java.lang.String getDateAsString(){
    return (date== null) ? null : format.format(date);
}
public void setDateAsString(java.lang.String date){
	this.dateIsValid = true;
	this.dateAsRawString = date;
try{
		if(StringUtils.isNotBlank(date)){ format.parse(date);}
}catch (java.text.ParseException pe){
this.dateIsValid = false;
}
	if(dateIsValid){
		try {
			this.date = (org.apache.commons.lang.StringUtils.isBlank(date)) ? null : format.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateAsRawString(java.lang.String date){
	this.dateAsRawString = date;
}

public String getDateAsRawString(){
return this.dateAsRawString;
}
private boolean imagefileexists;
public void setImagefileexists(boolean imagefileexists){
this.imagefileexists = imagefileexists;
}
public boolean isImagefileexists(){
return this.imagefileexists;
}
private String bankname;
public void setBankname(String bankname){
this.bankname = bankname;
}
public String getBankname(){
return this.bankname;
}
private String banktype;
public void setBanktype(String banktype){
this.banktype = banktype;
}
public String getBanktype(){
return this.banktype;
}
private String branchname;
public void setBranchname(String branchname){
this.branchname = branchname;
}
public String getBranchname(){
return this.branchname;
}
private String banknumber;
public void setBanknumber(String banknumber){
this.banknumber = banknumber;
}
public String getBanknumber(){
return this.banknumber;
}
private int salesamount;
public void setSalesamount(int salesamount){
this.salesamount = salesamount;
}
public int getSalesamount(){
return this.salesamount;
}
private int payedamount;
public void setPayedamount(int payedamount){
this.payedamount = payedamount;
}
public int getPayedamount(){
return this.payedamount;
}
private int lefttopay;
public void setLefttopay(int lefttopay){
this.lefttopay = lefttopay;
}
public int getLefttopay(){
return this.lefttopay;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	imagefileexists =false;
}
}
