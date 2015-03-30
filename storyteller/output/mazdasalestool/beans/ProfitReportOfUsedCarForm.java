package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ProfitReportOfUsedCarForm
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
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Integer credit;
public void setCredit(Integer credit){
this.credit = credit;
}
public Integer getCredit(){
return this.credit;
}
private String memo;
public void setMemo(String memo){
this.memo = memo;
}
public String getMemo(){
return this.memo;
}
private Integer salescost;
public void setSalescost(Integer salescost){
this.salescost = salescost;
}
public Integer getSalescost(){
return this.salescost;
}
private Date accepteddate;
public void setAccepteddate(Date accepteddate){
this.accepteddate = accepteddate;
}
public Date getAccepteddate(){
return this.accepteddate;
}
private boolean accepteddateIsValid = false;
public void setAccepteddateIsValid(boolean accepteddateIsValid){
this.accepteddateIsValid = accepteddateIsValid;
}
public boolean isAccepteddateIsValid(){
return this.accepteddateIsValid;
}
private java.lang.String accepteddateAsRawString ="";
public java.lang.String getAccepteddateAsString(){
    return (accepteddate== null) ? null : format.format(accepteddate);
}
public void setAccepteddateAsString(java.lang.String accepteddate){
	this.accepteddateIsValid = true;
	this.accepteddateAsRawString = accepteddate;
try{
		if(StringUtils.isNotBlank(accepteddate)){ format.parse(accepteddate);}
}catch (java.text.ParseException pe){
this.accepteddateIsValid = false;
}
	if(accepteddateIsValid){
		try {
			this.accepteddate = (org.apache.commons.lang.StringUtils.isBlank(accepteddate)) ? null : format.parse(accepteddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setAccepteddateAsRawString(java.lang.String accepteddate){
	this.accepteddateAsRawString = accepteddate;
}

public String getAccepteddateAsRawString(){
return this.accepteddateAsRawString;
}
private String customername;
public void setCustomername(String customername){
this.customername = customername;
}
public String getCustomername(){
return this.customername;
}
private Integer chargesforregisttaxex;
public void setChargesforregisttaxex(Integer chargesforregisttaxex){
this.chargesforregisttaxex = chargesforregisttaxex;
}
public Integer getChargesforregisttaxex(){
return this.chargesforregisttaxex;
}
private Double interest;
public void setInterest(Double interest){
this.interest = interest;
}
public Double getInterest(){
return this.interest;
}
private Integer numofpaymentsforcredit;
public void setNumofpaymentsforcredit(Integer numofpaymentsforcredit){
this.numofpaymentsforcredit = numofpaymentsforcredit;
}
public Integer getNumofpaymentsforcredit(){
return this.numofpaymentsforcredit;
}
private Date registeddate;
public void setRegisteddate(Date registeddate){
this.registeddate = registeddate;
}
public Date getRegisteddate(){
return this.registeddate;
}
private boolean registeddateIsValid = false;
public void setRegisteddateIsValid(boolean registeddateIsValid){
this.registeddateIsValid = registeddateIsValid;
}
public boolean isRegisteddateIsValid(){
return this.registeddateIsValid;
}
private java.lang.String registeddateAsRawString ="";
public java.lang.String getRegisteddateAsString(){
    return (registeddate== null) ? null : format.format(registeddate);
}
public void setRegisteddateAsString(java.lang.String registeddate){
	this.registeddateIsValid = true;
	this.registeddateAsRawString = registeddate;
try{
		if(StringUtils.isNotBlank(registeddate)){ format.parse(registeddate);}
}catch (java.text.ParseException pe){
this.registeddateIsValid = false;
}
	if(registeddateIsValid){
		try {
			this.registeddate = (org.apache.commons.lang.StringUtils.isBlank(registeddate)) ? null : format.parse(registeddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setRegisteddateAsRawString(java.lang.String registeddate){
	this.registeddateAsRawString = registeddate;
}

public String getRegisteddateAsRawString(){
return this.registeddateAsRawString;
}
private Integer priceoftradein;
public void setPriceoftradein(Integer priceoftradein){
this.priceoftradein = priceoftradein;
}
public Integer getPriceoftradein(){
return this.priceoftradein;
}
private Date entereddate;
public void setEntereddate(Date entereddate){
this.entereddate = entereddate;
}
public Date getEntereddate(){
return this.entereddate;
}
private boolean entereddateIsValid = false;
public void setEntereddateIsValid(boolean entereddateIsValid){
this.entereddateIsValid = entereddateIsValid;
}
public boolean isEntereddateIsValid(){
return this.entereddateIsValid;
}
private java.lang.String entereddateAsRawString ="";
public java.lang.String getEntereddateAsString(){
    return (entereddate== null) ? null : format.format(entereddate);
}
public void setEntereddateAsString(java.lang.String entereddate){
	this.entereddateIsValid = true;
	this.entereddateAsRawString = entereddate;
try{
		if(StringUtils.isNotBlank(entereddate)){ format.parse(entereddate);}
}catch (java.text.ParseException pe){
this.entereddateIsValid = false;
}
	if(entereddateIsValid){
		try {
			this.entereddate = (org.apache.commons.lang.StringUtils.isBlank(entereddate)) ? null : format.parse(entereddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setEntereddateAsRawString(java.lang.String entereddate){
	this.entereddateAsRawString = entereddate;
}

public String getEntereddateAsRawString(){
return this.entereddateAsRawString;
}
private Integer modelyearofsalescar;
public void setModelyearofsalescar(Integer modelyearofsalescar){
this.modelyearofsalescar = modelyearofsalescar;
}
public Integer getModelyearofsalescar(){
return this.modelyearofsalescar;
}
private String modelcodeofsalescar;
public void setModelcodeofsalescar(String modelcodeofsalescar){
this.modelcodeofsalescar = modelcodeofsalescar;
}
public String getModelcodeofsalescar(){
return this.modelcodeofsalescar;
}
private String noofsalescar;
public void setNoofsalescar(String noofsalescar){
this.noofsalescar = noofsalescar;
}
public String getNoofsalescar(){
return this.noofsalescar;
}
private Integer sourceofsales;
public void setSourceofsales(Integer sourceofsales){
this.sourceofsales = sourceofsales;
}
public Integer getSourceofsales(){
return this.sourceofsales;
}
private Integer ab;
public void setAb(Integer ab){
this.ab = ab;
}
public Integer getAb(){
return this.ab;
}
private Integer triggerofsales;
public void setTriggerofsales(Integer triggerofsales){
this.triggerofsales = triggerofsales;
}
public Integer getTriggerofsales(){
return this.triggerofsales;
}
private Integer recoverorder;
public void setRecoverorder(Integer recoverorder){
this.recoverorder = recoverorder;
}
public Integer getRecoverorder(){
return this.recoverorder;
}
private Integer registtype;
public void setRegisttype(Integer registtype){
this.registtype = registtype;
}
public Integer getRegisttype(){
return this.registtype;
}
private Integer assignedpricetaxex;
public void setAssignedpricetaxex(Integer assignedpricetaxex){
this.assignedpricetaxex = assignedpricetaxex;
}
public Integer getAssignedpricetaxex(){
return this.assignedpricetaxex;
}
private Integer salespricetaxex;
public void setSalespricetaxex(Integer salespricetaxex){
this.salespricetaxex = salespricetaxex;
}
public Integer getSalespricetaxex(){
return this.salespricetaxex;
}
private Integer costpricetaxex;
public void setCostpricetaxex(Integer costpricetaxex){
this.costpricetaxex = costpricetaxex;
}
public Integer getCostpricetaxex(){
return this.costpricetaxex;
}
private Integer totalpaymenttaxin;
public void setTotalpaymenttaxin(Integer totalpaymenttaxin){
this.totalpaymenttaxin = totalpaymenttaxin;
}
public Integer getTotalpaymenttaxin(){
return this.totalpaymenttaxin;
}
private Integer cash;
public void setCash(Integer cash){
this.cash = cash;
}
public Integer getCash(){
return this.cash;
}
private Integer modelyearoftradein;
public void setModelyearoftradein(Integer modelyearoftradein){
this.modelyearoftradein = modelyearoftradein;
}
public Integer getModelyearoftradein(){
return this.modelyearoftradein;
}
private String modelcodeoftradein;
public void setModelcodeoftradein(String modelcodeoftradein){
this.modelcodeoftradein = modelcodeoftradein;
}
public String getModelcodeoftradein(){
return this.modelcodeoftradein;
}
private String nooftradein;
public void setNooftradein(String nooftradein){
this.nooftradein = nooftradein;
}
public String getNooftradein(){
return this.nooftradein;
}
private Integer priceofnonfreemaintenancetaxex;
public void setPriceofnonfreemaintenancetaxex(Integer priceofnonfreemaintenancetaxex){
this.priceofnonfreemaintenancetaxex = priceofnonfreemaintenancetaxex;
}
public Integer getPriceofnonfreemaintenancetaxex(){
return this.priceofnonfreemaintenancetaxex;
}
private Integer priceofnonfreepartstaxex;
public void setPriceofnonfreepartstaxex(Integer priceofnonfreepartstaxex){
this.priceofnonfreepartstaxex = priceofnonfreepartstaxex;
}
public Integer getPriceofnonfreepartstaxex(){
return this.priceofnonfreepartstaxex;
}
private Integer creditkb;
public void setCreditkb(Integer creditkb){
this.creditkb = creditkb;
}
public Integer getCreditkb(){
return this.creditkb;
}
private Integer priceofpartsforrecover;
public void setPriceofpartsforrecover(Integer priceofpartsforrecover){
this.priceofpartsforrecover = priceofpartsforrecover;
}
public Integer getPriceofpartsforrecover(){
return this.priceofpartsforrecover;
}
private Integer priceofoutsourcingforrecover;
public void setPriceofoutsourcingforrecover(Integer priceofoutsourcingforrecover){
this.priceofoutsourcingforrecover = priceofoutsourcingforrecover;
}
public Integer getPriceofoutsourcingforrecover(){
return this.priceofoutsourcingforrecover;
}
private Integer priceofworkingforrecover;
public void setPriceofworkingforrecover(Integer priceofworkingforrecover){
this.priceofworkingforrecover = priceofworkingforrecover;
}
public Integer getPriceofworkingforrecover(){
return this.priceofworkingforrecover;
}
private Integer improvementReportOfUsedCarProfit;
public void setImprovementReportOfUsedCarProfit(Integer improvementReportOfUsedCarProfit){
this.improvementReportOfUsedCarProfit = improvementReportOfUsedCarProfit;
}
public Integer getImprovementReportOfUsedCarProfit(){
return this.improvementReportOfUsedCarProfit;
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
