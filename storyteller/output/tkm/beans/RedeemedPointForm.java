package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class RedeemedPointForm
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
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Date creationDate;
public void setCreationDate(Date creationDate){
this.creationDate = creationDate;
}
public Date getCreationDate(){
return this.creationDate;
}
private boolean creationDateIsValid = false;
public void setCreationDateIsValid(boolean creationDateIsValid){
this.creationDateIsValid = creationDateIsValid;
}
public boolean isCreationDateIsValid(){
return this.creationDateIsValid;
}
private java.lang.String creationDateAsRawString ="";
public java.lang.String getCreationDateAsString(){
    return (creationDate== null) ? null : format.format(creationDate);
}
public void setCreationDateAsString(java.lang.String creationDate){
	this.creationDateIsValid = true;
	this.creationDateAsRawString = creationDate;
try{
		if(StringUtils.isNotBlank(creationDate)){ format.parse(creationDate);}
}catch (java.text.ParseException pe){
this.creationDateIsValid = false;
}
	if(creationDateIsValid){
		try {
			this.creationDate = (org.apache.commons.lang.StringUtils.isBlank(creationDate)) ? null : format.parse(creationDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreationDateAsRawString(java.lang.String creationDate){
	this.creationDateAsRawString = creationDate;
}

public String getCreationDateAsRawString(){
return this.creationDateAsRawString;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private Integer award;
public void setAward(Integer award){
this.award = award;
}
public Integer getAward(){
return this.award;
}
private Integer point;
public void setPoint(Integer point){
this.point = point;
}
public Integer getPoint(){
return this.point;
}
private String firstName;
public void setFirstName(String firstName){
this.firstName = firstName;
}
public String getFirstName(){
return this.firstName;
}
private String firstNameKana;
public void setFirstNameKana(String firstNameKana){
this.firstNameKana = firstNameKana;
}
public String getFirstNameKana(){
return this.firstNameKana;
}
private String familyName;
public void setFamilyName(String familyName){
this.familyName = familyName;
}
public String getFamilyName(){
return this.familyName;
}
private String familyNameKana;
public void setFamilyNameKana(String familyNameKana){
this.familyNameKana = familyNameKana;
}
public String getFamilyNameKana(){
return this.familyNameKana;
}
private String zipCode;
public void setZipCode(String zipCode){
this.zipCode = zipCode;
}
public String getZipCode(){
return this.zipCode;
}
private String addressBuilding;
public void setAddressBuilding(String addressBuilding){
this.addressBuilding = addressBuilding;
}
public String getAddressBuilding(){
return this.addressBuilding;
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
