package net.estimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class EstimationForm
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
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
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
private Integer total;
public void setTotal(Integer total){
this.total = total;
}
public Integer getTotal(){
return this.total;
}
private Integer customer;
public void setCustomer(Integer customer){
this.customer = customer;
}
public Integer getCustomer(){
return this.customer;
}
private Integer account;
public void setAccount(Integer account){
this.account = account;
}
public Integer getAccount(){
return this.account;
}
private Integer creator;
public void setCreator(Integer creator){
this.creator = creator;
}
public Integer getCreator(){
return this.creator;
}
private boolean dirty;
public void setDirty(boolean dirty){
this.dirty = dirty;
}
public boolean isDirty(){
return this.dirty;
}
private int genka;
public void setGenka(int genka){
this.genka = genka;
}
public int getGenka(){
return this.genka;
}
private Date createdate;
public void setCreatedate(Date createdate){
this.createdate = createdate;
}
public Date getCreatedate(){
return this.createdate;
}
private boolean createdateIsValid = false;
public void setCreatedateIsValid(boolean createdateIsValid){
this.createdateIsValid = createdateIsValid;
}
public boolean isCreatedateIsValid(){
return this.createdateIsValid;
}
private java.lang.String createdateAsRawString ="";
public java.lang.String getCreatedateAsString(){
    return (createdate== null) ? null : format.format(createdate);
}
public void setCreatedateAsString(java.lang.String createdate){
	this.createdateIsValid = true;
	this.createdateAsRawString = createdate;
try{
		if(StringUtils.isNotBlank(createdate)){ format.parse(createdate);}
}catch (java.text.ParseException pe){
this.createdateIsValid = false;
}
	if(createdateIsValid){
		try {
			this.createdate = (org.apache.commons.lang.StringUtils.isBlank(createdate)) ? null : format.parse(createdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCreatedateAsRawString(java.lang.String createdate){
	this.createdateAsRawString = createdate;
}

public String getCreatedateAsRawString(){
return this.createdateAsRawString;
}
private Date submissiondate;
public void setSubmissiondate(Date submissiondate){
this.submissiondate = submissiondate;
}
public Date getSubmissiondate(){
return this.submissiondate;
}
private boolean submissiondateIsValid = false;
public void setSubmissiondateIsValid(boolean submissiondateIsValid){
this.submissiondateIsValid = submissiondateIsValid;
}
public boolean isSubmissiondateIsValid(){
return this.submissiondateIsValid;
}
private java.lang.String submissiondateAsRawString ="";
public java.lang.String getSubmissiondateAsString(){
    return (submissiondate== null) ? null : format.format(submissiondate);
}
public void setSubmissiondateAsString(java.lang.String submissiondate){
	this.submissiondateIsValid = true;
	this.submissiondateAsRawString = submissiondate;
try{
		if(StringUtils.isNotBlank(submissiondate)){ format.parse(submissiondate);}
}catch (java.text.ParseException pe){
this.submissiondateIsValid = false;
}
	if(submissiondateIsValid){
		try {
			this.submissiondate = (org.apache.commons.lang.StringUtils.isBlank(submissiondate)) ? null : format.parse(submissiondate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setSubmissiondateAsRawString(java.lang.String submissiondate){
	this.submissiondateAsRawString = submissiondate;
}

public String getSubmissiondateAsRawString(){
return this.submissiondateAsRawString;
}
private String estimatecode;
public void setEstimatecode(String estimatecode){
this.estimatecode = estimatecode;
}
public String getEstimatecode(){
return this.estimatecode;
}
private String submissionmean;
public void setSubmissionmean(String submissionmean){
this.submissionmean = submissionmean;
}
public String getSubmissionmean(){
return this.submissionmean;
}
private boolean requested;
public void setRequested(boolean requested){
this.requested = requested;
}
public boolean isRequested(){
return this.requested;
}
private boolean rejected;
public void setRejected(boolean rejected){
this.rejected = rejected;
}
public boolean isRejected(){
return this.rejected;
}
private boolean confirmation3;
public void setConfirmation3(boolean confirmation3){
this.confirmation3 = confirmation3;
}
public boolean isConfirmation3(){
return this.confirmation3;
}
private boolean confirmation4;
public void setConfirmation4(boolean confirmation4){
this.confirmation4 = confirmation4;
}
public boolean isConfirmation4(){
return this.confirmation4;
}
private Integer net;
public void setNet(Integer net){
this.net = net;
}
public Integer getNet(){
return this.net;
}
private Date estimateexpirationdate;
public void setEstimateexpirationdate(Date estimateexpirationdate){
this.estimateexpirationdate = estimateexpirationdate;
}
public Date getEstimateexpirationdate(){
return this.estimateexpirationdate;
}
private boolean estimateexpirationdateIsValid = false;
public void setEstimateexpirationdateIsValid(boolean estimateexpirationdateIsValid){
this.estimateexpirationdateIsValid = estimateexpirationdateIsValid;
}
public boolean isEstimateexpirationdateIsValid(){
return this.estimateexpirationdateIsValid;
}
private java.lang.String estimateexpirationdateAsRawString ="";
public java.lang.String getEstimateexpirationdateAsString(){
    return (estimateexpirationdate== null) ? null : format.format(estimateexpirationdate);
}
public void setEstimateexpirationdateAsString(java.lang.String estimateexpirationdate){
	this.estimateexpirationdateIsValid = true;
	this.estimateexpirationdateAsRawString = estimateexpirationdate;
try{
		if(StringUtils.isNotBlank(estimateexpirationdate)){ format.parse(estimateexpirationdate);}
}catch (java.text.ParseException pe){
this.estimateexpirationdateIsValid = false;
}
	if(estimateexpirationdateIsValid){
		try {
			this.estimateexpirationdate = (org.apache.commons.lang.StringUtils.isBlank(estimateexpirationdate)) ? null : format.parse(estimateexpirationdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setEstimateexpirationdateAsRawString(java.lang.String estimateexpirationdate){
	this.estimateexpirationdateAsRawString = estimateexpirationdate;
}

public String getEstimateexpirationdateAsRawString(){
return this.estimateexpirationdateAsRawString;
}
private String paymentcondition;
public void setPaymentcondition(String paymentcondition){
this.paymentcondition = paymentcondition;
}
public String getPaymentcondition(){
return this.paymentcondition;
}
private boolean printable;
public void setPrintable(boolean printable){
this.printable = printable;
}
public boolean isPrintable(){
return this.printable;
}
private int riekiritsu;
public void setRiekiritsu(int riekiritsu){
this.riekiritsu = riekiritsu;
}
public int getRiekiritsu(){
return this.riekiritsu;
}
private String showtax;
public void setShowtax(String showtax){
this.showtax = showtax;
}
public String getShowtax(){
return this.showtax;
}
private String shownet;
public void setShownet(String shownet){
this.shownet = shownet;
}
public String getShownet(){
return this.shownet;
}
private String customerresponsible;
public void setCustomerresponsible(String customerresponsible){
this.customerresponsible = customerresponsible;
}
public String getCustomerresponsible(){
return this.customerresponsible;
}
private int expirationaftersubmit;
public void setExpirationaftersubmit(int expirationaftersubmit){
this.expirationaftersubmit = expirationaftersubmit;
}
public int getExpirationaftersubmit(){
return this.expirationaftersubmit;
}
private String quickpaymentcondition;
public void setQuickpaymentcondition(String quickpaymentcondition){
this.quickpaymentcondition = quickpaymentcondition;
}
public String getQuickpaymentcondition(){
return this.quickpaymentcondition;
}
private boolean summed;
public void setSummed(boolean summed){
this.summed = summed;
}
public boolean isSummed(){
return this.summed;
}
private String quickcomponeyname;
public void setQuickcomponeyname(String quickcomponeyname){
this.quickcomponeyname = quickcomponeyname;
}
public String getQuickcomponeyname(){
return this.quickcomponeyname;
}
private String quickaddress;
public void setQuickaddress(String quickaddress){
this.quickaddress = quickaddress;
}
public String getQuickaddress(){
return this.quickaddress;
}
private String quickresponsible;
public void setQuickresponsible(String quickresponsible){
this.quickresponsible = quickresponsible;
}
public String getQuickresponsible(){
return this.quickresponsible;
}
private String nounyuusaki;
public void setNounyuusaki(String nounyuusaki){
this.nounyuusaki = nounyuusaki;
}
public String getNounyuusaki(){
return this.nounyuusaki;
}
private String nounyuusakitel;
public void setNounyuusakitel(String nounyuusakitel){
this.nounyuusakitel = nounyuusakitel;
}
public String getNounyuusakitel(){
return this.nounyuusakitel;
}
private String genbatel;
public void setGenbatel(String genbatel){
this.genbatel = genbatel;
}
public String getGenbatel(){
return this.genbatel;
}
private Date contractdate;
public void setContractdate(Date contractdate){
this.contractdate = contractdate;
}
public Date getContractdate(){
return this.contractdate;
}
private boolean contractdateIsValid = false;
public void setContractdateIsValid(boolean contractdateIsValid){
this.contractdateIsValid = contractdateIsValid;
}
public boolean isContractdateIsValid(){
return this.contractdateIsValid;
}
private java.lang.String contractdateAsRawString ="";
public java.lang.String getContractdateAsString(){
    return (contractdate== null) ? null : format.format(contractdate);
}
public void setContractdateAsString(java.lang.String contractdate){
	this.contractdateIsValid = true;
	this.contractdateAsRawString = contractdate;
try{
		if(StringUtils.isNotBlank(contractdate)){ format.parse(contractdate);}
}catch (java.text.ParseException pe){
this.contractdateIsValid = false;
}
	if(contractdateIsValid){
		try {
			this.contractdate = (org.apache.commons.lang.StringUtils.isBlank(contractdate)) ? null : format.parse(contractdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setContractdateAsRawString(java.lang.String contractdate){
	this.contractdateAsRawString = contractdate;
}

public String getContractdateAsRawString(){
return this.contractdateAsRawString;
}
private Date tyakkoudate;
public void setTyakkoudate(Date tyakkoudate){
this.tyakkoudate = tyakkoudate;
}
public Date getTyakkoudate(){
return this.tyakkoudate;
}
private boolean tyakkoudateIsValid = false;
public void setTyakkoudateIsValid(boolean tyakkoudateIsValid){
this.tyakkoudateIsValid = tyakkoudateIsValid;
}
public boolean isTyakkoudateIsValid(){
return this.tyakkoudateIsValid;
}
private java.lang.String tyakkoudateAsRawString ="";
public java.lang.String getTyakkoudateAsString(){
    return (tyakkoudate== null) ? null : format.format(tyakkoudate);
}
public void setTyakkoudateAsString(java.lang.String tyakkoudate){
	this.tyakkoudateIsValid = true;
	this.tyakkoudateAsRawString = tyakkoudate;
try{
		if(StringUtils.isNotBlank(tyakkoudate)){ format.parse(tyakkoudate);}
}catch (java.text.ParseException pe){
this.tyakkoudateIsValid = false;
}
	if(tyakkoudateIsValid){
		try {
			this.tyakkoudate = (org.apache.commons.lang.StringUtils.isBlank(tyakkoudate)) ? null : format.parse(tyakkoudate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTyakkoudateAsRawString(java.lang.String tyakkoudate){
	this.tyakkoudateAsRawString = tyakkoudate;
}

public String getTyakkoudateAsRawString(){
return this.tyakkoudateAsRawString;
}
private Date shunkoudate;
public void setShunkoudate(Date shunkoudate){
this.shunkoudate = shunkoudate;
}
public Date getShunkoudate(){
return this.shunkoudate;
}
private boolean shunkoudateIsValid = false;
public void setShunkoudateIsValid(boolean shunkoudateIsValid){
this.shunkoudateIsValid = shunkoudateIsValid;
}
public boolean isShunkoudateIsValid(){
return this.shunkoudateIsValid;
}
private java.lang.String shunkoudateAsRawString ="";
public java.lang.String getShunkoudateAsString(){
    return (shunkoudate== null) ? null : format.format(shunkoudate);
}
public void setShunkoudateAsString(java.lang.String shunkoudate){
	this.shunkoudateIsValid = true;
	this.shunkoudateAsRawString = shunkoudate;
try{
		if(StringUtils.isNotBlank(shunkoudate)){ format.parse(shunkoudate);}
}catch (java.text.ParseException pe){
this.shunkoudateIsValid = false;
}
	if(shunkoudateIsValid){
		try {
			this.shunkoudate = (org.apache.commons.lang.StringUtils.isBlank(shunkoudate)) ? null : format.parse(shunkoudate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setShunkoudateAsRawString(java.lang.String shunkoudate){
	this.shunkoudateAsRawString = shunkoudate;
}

public String getShunkoudateAsRawString(){
return this.shunkoudateAsRawString;
}
private int toritsukeestimate;
public void setToritsukeestimate(int toritsukeestimate){
this.toritsukeestimate = toritsukeestimate;
}
public int getToritsukeestimate(){
return this.toritsukeestimate;
}
private int toritsukecontract;
public void setToritsukecontract(int toritsukecontract){
this.toritsukecontract = toritsukecontract;
}
public int getToritsukecontract(){
return this.toritsukecontract;
}
private int tritsukegenka;
public void setTritsukegenka(int tritsukegenka){
this.tritsukegenka = tritsukegenka;
}
public int getTritsukegenka(){
return this.tritsukegenka;
}
private int toritsukearari;
public void setToritsukearari(int toritsukearari){
this.toritsukearari = toritsukearari;
}
public int getToritsukearari(){
return this.toritsukearari;
}
private int unpanestimate;
public void setUnpanestimate(int unpanestimate){
this.unpanestimate = unpanestimate;
}
public int getUnpanestimate(){
return this.unpanestimate;
}
private int unpancontract;
public void setUnpancontract(int unpancontract){
this.unpancontract = unpancontract;
}
public int getUnpancontract(){
return this.unpancontract;
}
private int unpangenka;
public void setUnpangenka(int unpangenka){
this.unpangenka = unpangenka;
}
public int getUnpangenka(){
return this.unpangenka;
}
private int unpanarari;
public void setUnpanarari(int unpanarari){
this.unpanarari = unpanarari;
}
public int getUnpanarari(){
return this.unpanarari;
}
private int miscestimate;
public void setMiscestimate(int miscestimate){
this.miscestimate = miscestimate;
}
public int getMiscestimate(){
return this.miscestimate;
}
private int misccontract;
public void setMisccontract(int misccontract){
this.misccontract = misccontract;
}
public int getMisccontract(){
return this.misccontract;
}
private int miscgenka;
public void setMiscgenka(int miscgenka){
this.miscgenka = miscgenka;
}
public int getMiscgenka(){
return this.miscgenka;
}
private int miscarari;
public void setMiscarari(int miscarari){
this.miscarari = miscarari;
}
public int getMiscarari(){
return this.miscarari;
}
private int sumconract;
public void setSumconract(int sumconract){
this.sumconract = sumconract;
}
public int getSumconract(){
return this.sumconract;
}
private int sumarari;
public void setSumarari(int sumarari){
this.sumarari = sumarari;
}
public int getSumarari(){
return this.sumarari;
}
private String kobannashi;
public void setKobannashi(String kobannashi){
this.kobannashi = kobannashi;
}
public String getKobannashi(){
return this.kobannashi;
}
private Integer sales;
public void setSales(Integer sales){
this.sales = sales;
}
public Integer getSales(){
return this.sales;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	dirty =false;
	requested =false;
	rejected =false;
	confirmation3 =false;
	confirmation4 =false;
	printable =false;
	summed =false;
}
}
