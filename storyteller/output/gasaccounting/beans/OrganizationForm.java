package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class OrganizationForm
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
private String name;
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
private int phonenum;
public void setPhonenum(int phonenum){
this.phonenum = phonenum;
}
public int getPhonenum(){
return this.phonenum;
}
private String companyname;
public void setCompanyname(String companyname){
this.companyname = companyname;
}
public String getCompanyname(){
return this.companyname;
}
private String furigana;
public void setFurigana(String furigana){
this.furigana = furigana;
}
public String getFurigana(){
return this.furigana;
}
private String companyaddress;
public void setCompanyaddress(String companyaddress){
this.companyaddress = companyaddress;
}
public String getCompanyaddress(){
return this.companyaddress;
}
private int postcode;
public void setPostcode(int postcode){
this.postcode = postcode;
}
public int getPostcode(){
return this.postcode;
}
private int faxnum;
public void setFaxnum(int faxnum){
this.faxnum = faxnum;
}
public int getFaxnum(){
return this.faxnum;
}
private String president;
public void setPresident(String president){
this.president = president;
}
public String getPresident(){
return this.president;
}
private String storename;
public void setStorename(String storename){
this.storename = storename;
}
public String getStorename(){
return this.storename;
}
private Date creationdate;
public void setCreationdate(Date creationdate){
this.creationdate = creationdate;
}
public Date getCreationdate(){
return this.creationdate;
}
private boolean creationdateIsValid = false;
public void setCreationdateIsValid(boolean creationdateIsValid){
this.creationdateIsValid = creationdateIsValid;
}
public boolean isCreationdateIsValid(){
return this.creationdateIsValid;
}
private java.lang.String creationdateAsRawString ="";
public java.lang.String getCreationdateAsString(){
    return (creationdate== null) ? null : format.format(creationdate);
}
public void setCreationdateAsString(java.lang.String creationdate){
	this.creationdateIsValid = true;
	this.creationdateAsRawString = creationdate;
try{
		if(StringUtils.isNotBlank(creationdate)){ format.parse(creationdate);}
}catch (java.text.ParseException pe){
this.creationdateIsValid = false;
}
	if(creationdateIsValid){
		try {
			this.creationdate = (org.apache.commons.lang.StringUtils.isBlank(creationdate)) ? null : format.parse(creationdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreationdateAsRawString(java.lang.String creationdate){
	this.creationdateAsRawString = creationdate;
}

public String getCreationdateAsRawString(){
return this.creationdateAsRawString;
}
private float capital;
public void setCapital(float capital){
this.capital = capital;
}
public float getCapital(){
return this.capital;
}
private float annualsales;
public void setAnnualsales(float annualsales){
this.annualsales = annualsales;
}
public float getAnnualsales(){
return this.annualsales;
}
private int employeenum;
public void setEmployeenum(int employeenum){
this.employeenum = employeenum;
}
public int getEmployeenum(){
return this.employeenum;
}
private String businessdesc;
public void setBusinessdesc(String businessdesc){
this.businessdesc = businessdesc;
}
public String getBusinessdesc(){
return this.businessdesc;
}
private String majortradpartner1;
public void setMajortradpartner1(String majortradpartner1){
this.majortradpartner1 = majortradpartner1;
}
public String getMajortradpartner1(){
return this.majortradpartner1;
}
private String majortradpartner2;
public void setMajortradpartner2(String majortradpartner2){
this.majortradpartner2 = majortradpartner2;
}
public String getMajortradpartner2(){
return this.majortradpartner2;
}
private String majortradpartner3;
public void setMajortradpartner3(String majortradpartner3){
this.majortradpartner3 = majortradpartner3;
}
public String getMajortradpartner3(){
return this.majortradpartner3;
}
private String bankers;
public void setBankers(String bankers){
this.bankers = bankers;
}
public String getBankers(){
return this.bankers;
}
private String paymentsite;
public void setPaymentsite(String paymentsite){
this.paymentsite = paymentsite;
}
public String getPaymentsite(){
return this.paymentsite;
}
private boolean supplier;
public void setSupplier(boolean supplier){
this.supplier = supplier;
}
public boolean isSupplier(){
return this.supplier;
}
private boolean customer;
public void setCustomer(boolean customer){
this.customer = customer;
}
public boolean isCustomer(){
return this.customer;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	supplier =false;
	customer =false;
}
}
