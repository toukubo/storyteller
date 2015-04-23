package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AccountSnapshotForm
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
private int totalcost;
public void setTotalcost(int totalcost){
this.totalcost = totalcost;
}
public int getTotalcost(){
return this.totalcost;
}
private int capacityprice;
public void setCapacityprice(int capacityprice){
this.capacityprice = capacityprice;
}
public int getCapacityprice(){
return this.capacityprice;
}
private int capacityleftprice;
public void setCapacityleftprice(int capacityleftprice){
this.capacityleftprice = capacityleftprice;
}
public int getCapacityleftprice(){
return this.capacityleftprice;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
