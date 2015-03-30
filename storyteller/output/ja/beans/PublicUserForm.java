package net.ja.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PublicUserForm
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
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private int totalcost;
public void setTotalcost(int totalcost){
this.totalcost = totalcost;
}
public int getTotalcost(){
return this.totalcost;
}
private String infocode;
public void setInfocode(String infocode){
this.infocode = infocode;
}
public String getInfocode(){
return this.infocode;
}
private String jacode;
public void setJacode(String jacode){
this.jacode = jacode;
}
public String getJacode(){
return this.jacode;
}
private String accountofficecode;
public void setAccountofficecode(String accountofficecode){
this.accountofficecode = accountofficecode;
}
public String getAccountofficecode(){
return this.accountofficecode;
}
private String shopcode;
public void setShopcode(String shopcode){
this.shopcode = shopcode;
}
public String getShopcode(){
return this.shopcode;
}
private String departmentcode;
public void setDepartmentcode(String departmentcode){
this.departmentcode = departmentcode;
}
public String getDepartmentcode(){
return this.departmentcode;
}
private String accountnumber;
public void setAccountnumber(String accountnumber){
this.accountnumber = accountnumber;
}
public String getAccountnumber(){
return this.accountnumber;
}
private String accountstatus;
public void setAccountstatus(String accountstatus){
this.accountstatus = accountstatus;
}
public String getAccountstatus(){
return this.accountstatus;
}
private Date closurebreakdate;
public void setClosurebreakdate(Date closurebreakdate){
this.closurebreakdate = closurebreakdate;
}
public Date getClosurebreakdate(){
return this.closurebreakdate;
}
private boolean closurebreakdateIsValid = false;
public void setClosurebreakdateIsValid(boolean closurebreakdateIsValid){
this.closurebreakdateIsValid = closurebreakdateIsValid;
}
public boolean isClosurebreakdateIsValid(){
return this.closurebreakdateIsValid;
}
private java.lang.String closurebreakdateAsRawString ="";
public java.lang.String getClosurebreakdateAsString(){
    return (closurebreakdate== null) ? null : format.format(closurebreakdate);
}
public void setClosurebreakdateAsString(java.lang.String closurebreakdate){
	this.closurebreakdateIsValid = true;
	this.closurebreakdateAsRawString = closurebreakdate;
try{
		if(StringUtils.isNotBlank(closurebreakdate)){ format.parse(closurebreakdate);}
}catch (java.text.ParseException pe){
this.closurebreakdateIsValid = false;
}
	if(closurebreakdateIsValid){
		try {
			this.closurebreakdate = (org.apache.commons.lang.StringUtils.isBlank(closurebreakdate)) ? null : format.parse(closurebreakdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setClosurebreakdateAsRawString(java.lang.String closurebreakdate){
	this.closurebreakdateAsRawString = closurebreakdate;
}

public String getClosurebreakdateAsRawString(){
return this.closurebreakdateAsRawString;
}
private String closuretype;
public void setClosuretype(String closuretype){
this.closuretype = closuretype;
}
public String getClosuretype(){
return this.closuretype;
}
private String branchcode;
public void setBranchcode(String branchcode){
this.branchcode = branchcode;
}
public String getBranchcode(){
return this.branchcode;
}
private String managementtype;
public void setManagementtype(String managementtype){
this.managementtype = managementtype;
}
public String getManagementtype(){
return this.managementtype;
}
private String areacode;
public void setAreacode(String areacode){
this.areacode = areacode;
}
public String getAreacode(){
return this.areacode;
}
private String varialblestatscode;
public void setVarialblestatscode(String varialblestatscode){
this.varialblestatscode = varialblestatscode;
}
public String getVarialblestatscode(){
return this.varialblestatscode;
}
private String varialblestatscodetwo;
public void setVarialblestatscodetwo(String varialblestatscodetwo){
this.varialblestatscodetwo = varialblestatscodetwo;
}
public String getVarialblestatscodetwo(){
return this.varialblestatscodetwo;
}
private String detaileddocumenttype;
public void setDetaileddocumenttype(String detaileddocumenttype){
this.detaileddocumenttype = detaileddocumenttype;
}
public String getDetaileddocumenttype(){
return this.detaileddocumenttype;
}
private String layoutno;
public void setLayoutno(String layoutno){
this.layoutno = layoutno;
}
public String getLayoutno(){
return this.layoutno;
}
private String printingcontrolcode;
public void setPrintingcontrolcode(String printingcontrolcode){
this.printingcontrolcode = printingcontrolcode;
}
public String getPrintingcontrolcode(){
return this.printingcontrolcode;
}
private String sorimachitargettype;
public void setSorimachitargettype(String sorimachitargettype){
this.sorimachitargettype = sorimachitargettype;
}
public String getSorimachitargettype(){
return this.sorimachitargettype;
}
private int remaining;
public void setRemaining(int remaining){
this.remaining = remaining;
}
public int getRemaining(){
return this.remaining;
}
private int totalincome;
public void setTotalincome(int totalincome){
this.totalincome = totalincome;
}
public int getTotalincome(){
return this.totalincome;
}
private Date lasttransactiondate;
public void setLasttransactiondate(Date lasttransactiondate){
this.lasttransactiondate = lasttransactiondate;
}
public Date getLasttransactiondate(){
return this.lasttransactiondate;
}
private boolean lasttransactiondateIsValid = false;
public void setLasttransactiondateIsValid(boolean lasttransactiondateIsValid){
this.lasttransactiondateIsValid = lasttransactiondateIsValid;
}
public boolean isLasttransactiondateIsValid(){
return this.lasttransactiondateIsValid;
}
private java.lang.String lasttransactiondateAsRawString ="";
public java.lang.String getLasttransactiondateAsString(){
    return (lasttransactiondate== null) ? null : format.format(lasttransactiondate);
}
public void setLasttransactiondateAsString(java.lang.String lasttransactiondate){
	this.lasttransactiondateIsValid = true;
	this.lasttransactiondateAsRawString = lasttransactiondate;
try{
		if(StringUtils.isNotBlank(lasttransactiondate)){ format.parse(lasttransactiondate);}
}catch (java.text.ParseException pe){
this.lasttransactiondateIsValid = false;
}
	if(lasttransactiondateIsValid){
		try {
			this.lasttransactiondate = (org.apache.commons.lang.StringUtils.isBlank(lasttransactiondate)) ? null : format.parse(lasttransactiondate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setLasttransactiondateAsRawString(java.lang.String lasttransactiondate){
	this.lasttransactiondateAsRawString = lasttransactiondate;
}

public String getLasttransactiondateAsRawString(){
return this.lasttransactiondateAsRawString;
}
private int nonaccountedatfirst;
public void setNonaccountedatfirst(int nonaccountedatfirst){
this.nonaccountedatfirst = nonaccountedatfirst;
}
public int getNonaccountedatfirst(){
return this.nonaccountedatfirst;
}
private int nonaccountedatlast;
public void setNonaccountedatlast(int nonaccountedatlast){
this.nonaccountedatlast = nonaccountedatlast;
}
public int getNonaccountedatlast(){
return this.nonaccountedatlast;
}
private Integer area;
public void setArea(Integer area){
this.area = area;
}
public Integer getArea(){
return this.area;
}
private Integer userInfo;
public void setUserInfo(Integer userInfo){
this.userInfo = userInfo;
}
public Integer getUserInfo(){
return this.userInfo;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
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
