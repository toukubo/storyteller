package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ProductForm
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
private boolean parent;
public void setParent(boolean parent){
this.parent = parent;
}
public boolean isParent(){
return this.parent;
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
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
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
private String productcode;
public void setProductcode(String productcode){
this.productcode = productcode;
}
public String getProductcode(){
return this.productcode;
}
private Integer manual;
public void setManual(Integer manual){
this.manual = manual;
}
public Integer getManual(){
return this.manual;
}
private Date temprarymp;
public void setTemprarymp(Date temprarymp){
this.temprarymp = temprarymp;
}
public Date getTemprarymp(){
return this.temprarymp;
}
private boolean temprarympIsValid = false;
public void setTemprarympIsValid(boolean temprarympIsValid){
this.temprarympIsValid = temprarympIsValid;
}
public boolean isTemprarympIsValid(){
return this.temprarympIsValid;
}
private java.lang.String temprarympAsRawString ="";
public java.lang.String getTemprarympAsString(){
    return (temprarymp== null) ? null : format.format(temprarymp);
}
public void setTemprarympAsString(java.lang.String temprarymp){
	this.temprarympIsValid = true;
	this.temprarympAsRawString = temprarymp;
try{
		if(StringUtils.isNotBlank(temprarymp)){ format.parse(temprarymp);}
}catch (java.text.ParseException pe){
this.temprarympIsValid = false;
}
	if(temprarympIsValid){
		try {
			this.temprarymp = (org.apache.commons.lang.StringUtils.isBlank(temprarymp)) ? null : format.parse(temprarymp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTemprarympAsRawString(java.lang.String temprarymp){
	this.temprarympAsRawString = temprarymp;
}

public String getTemprarympAsRawString(){
return this.temprarympAsRawString;
}
private String abroaddomestic;
public void setAbroaddomestic(String abroaddomestic){
this.abroaddomestic = abroaddomestic;
}
public String getAbroaddomestic(){
return this.abroaddomestic;
}
private boolean stopped;
public void setStopped(boolean stopped){
this.stopped = stopped;
}
public boolean isStopped(){
return this.stopped;
}
private String stoppedreason;
public void setStoppedreason(String stoppedreason){
this.stoppedreason = stoppedreason;
}
public String getStoppedreason(){
return this.stoppedreason;
}
private boolean mbg;
public void setMbg(boolean mbg){
this.mbg = mbg;
}
public boolean isMbg(){
return this.mbg;
}
private Date basedeadline;
public void setBasedeadline(Date basedeadline){
this.basedeadline = basedeadline;
}
public Date getBasedeadline(){
return this.basedeadline;
}
private boolean basedeadlineIsValid = false;
public void setBasedeadlineIsValid(boolean basedeadlineIsValid){
this.basedeadlineIsValid = basedeadlineIsValid;
}
public boolean isBasedeadlineIsValid(){
return this.basedeadlineIsValid;
}
private java.lang.String basedeadlineAsRawString ="";
public java.lang.String getBasedeadlineAsString(){
    return (basedeadline== null) ? null : format.format(basedeadline);
}
public void setBasedeadlineAsString(java.lang.String basedeadline){
	this.basedeadlineIsValid = true;
	this.basedeadlineAsRawString = basedeadline;
try{
		if(StringUtils.isNotBlank(basedeadline)){ format.parse(basedeadline);}
}catch (java.text.ParseException pe){
this.basedeadlineIsValid = false;
}
	if(basedeadlineIsValid){
		try {
			this.basedeadline = (org.apache.commons.lang.StringUtils.isBlank(basedeadline)) ? null : format.parse(basedeadline);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setBasedeadlineAsRawString(java.lang.String basedeadline){
	this.basedeadlineAsRawString = basedeadline;
}

public String getBasedeadlineAsRawString(){
return this.basedeadlineAsRawString;
}
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private int payment;
public void setPayment(int payment){
this.payment = payment;
}
public int getPayment(){
return this.payment;
}
private int websales;
public void setWebsales(int websales){
this.websales = websales;
}
public int getWebsales(){
return this.websales;
}
private int icsales;
public void setIcsales(int icsales){
this.icsales = icsales;
}
public int getIcsales(){
return this.icsales;
}
private String departmentcode;
public void setDepartmentcode(String departmentcode){
this.departmentcode = departmentcode;
}
public String getDepartmentcode(){
return this.departmentcode;
}
private boolean master;
public void setMaster(boolean master){
this.master = master;
}
public boolean isMaster(){
return this.master;
}
private int refno;
public void setRefno(int refno){
this.refno = refno;
}
public int getRefno(){
return this.refno;
}
private int salesnum;
public void setSalesnum(int salesnum){
this.salesnum = salesnum;
}
public int getSalesnum(){
return this.salesnum;
}
private int salesprice;
public void setSalesprice(int salesprice){
this.salesprice = salesprice;
}
public int getSalesprice(){
return this.salesprice;
}
private int icsalesnum;
public void setIcsalesnum(int icsalesnum){
this.icsalesnum = icsalesnum;
}
public int getIcsalesnum(){
return this.icsalesnum;
}
private int websalesnum;
public void setWebsalesnum(int websalesnum){
this.websalesnum = websalesnum;
}
public int getWebsalesnum(){
return this.websalesnum;
}
private String responsiblecomponey;
public void setResponsiblecomponey(String responsiblecomponey){
this.responsiblecomponey = responsiblecomponey;
}
public String getResponsiblecomponey(){
return this.responsiblecomponey;
}
private String productionflag;
public void setProductionflag(String productionflag){
this.productionflag = productionflag;
}
public String getProductionflag(){
return this.productionflag;
}
private Integer summeryOfProductslOfAMonthAboutSales;
public void setSummeryOfProductslOfAMonthAboutSales(Integer summeryOfProductslOfAMonthAboutSales){
this.summeryOfProductslOfAMonthAboutSales = summeryOfProductslOfAMonthAboutSales;
}
public Integer getSummeryOfProductslOfAMonthAboutSales(){
return this.summeryOfProductslOfAMonthAboutSales;
}
private Integer comparisonaswork;
public void setComparisonaswork(Integer comparisonaswork){
this.comparisonaswork = comparisonaswork;
}
public Integer getComparisonaswork(){
return this.comparisonaswork;
}
private Integer comparisonasmaster;
public void setComparisonasmaster(Integer comparisonasmaster){
this.comparisonasmaster = comparisonasmaster;
}
public Integer getComparisonasmaster(){
return this.comparisonasmaster;
}
private boolean holded;
public void setHolded(boolean holded){
this.holded = holded;
}
public boolean isHolded(){
return this.holded;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	parent =false;
	removed =false;
	stopped =false;
	mbg =false;
	master =false;
	holded =false;
}
}
