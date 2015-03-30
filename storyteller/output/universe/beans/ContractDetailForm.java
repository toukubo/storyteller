package net.universe.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ContractDetailForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
private int num;
public void setNum(int num){
this.num = num;
}
public int getNum(){
return this.num;
}
private Integer contract;
public void setContract(Integer contract){
this.contract = contract;
}
public Integer getContract(){
return this.contract;
}
private Integer narrator;
public void setNarrator(Integer narrator){
this.narrator = narrator;
}
public Integer getNarrator(){
return this.narrator;
}
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private Date appearancedate;
public void setAppearancedate(Date appearancedate){
this.appearancedate = appearancedate;
}
public Date getAppearancedate(){
return this.appearancedate;
}
private boolean appearancedateIsValid = false;
public void setAppearancedateIsValid(boolean appearancedateIsValid){
this.appearancedateIsValid = appearancedateIsValid;
}
public boolean isAppearancedateIsValid(){
return this.appearancedateIsValid;
}
private java.lang.String appearancedateAsRawString ="";
public java.lang.String getAppearancedateAsString(){
    return (appearancedate== null) ? null : format.format(appearancedate);
}
public void setAppearancedateAsString(java.lang.String appearancedate){
	this.appearancedateIsValid = true;
	this.appearancedateAsRawString = appearancedate;
try{
		if(StringUtils.isNotBlank(appearancedate)){ format.parse(appearancedate);}
}catch (java.text.ParseException pe){
this.appearancedateIsValid = false;
}
	if(appearancedateIsValid){
		try {
			this.appearancedate = (org.apache.commons.lang.StringUtils.isBlank(appearancedate)) ? null : format.parse(appearancedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setAppearancedateAsRawString(java.lang.String appearancedate){
	this.appearancedateAsRawString = appearancedate;
}

public String getAppearancedateAsRawString(){
return this.appearancedateAsRawString;
}
private int tax;
public void setTax(int tax){
this.tax = tax;
}
public int getTax(){
return this.tax;
}
private String memo;
public void setMemo(String memo){
this.memo = memo;
}
public String getMemo(){
return this.memo;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private int total;
public void setTotal(int total){
this.total = total;
}
public int getTotal(){
return this.total;
}
private boolean deleted;
public void setDeleted(boolean deleted){
this.deleted = deleted;
}
public boolean isDeleted(){
return this.deleted;
}
private Integer narratorDetail;
public void setNarratorDetail(Integer narratorDetail){
this.narratorDetail = narratorDetail;
}
public Integer getNarratorDetail(){
return this.narratorDetail;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	deleted =false;
}
}
