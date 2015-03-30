package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ProfitReportOfNewCarForm
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
private Integer car;
public void setCar(Integer car){
this.car = car;
}
public Integer getCar(){
return this.car;
}
private boolean cancel;
public void setCancel(boolean cancel){
this.cancel = cancel;
}
public boolean isCancel(){
return this.cancel;
}
private boolean remain;
public void setRemain(boolean remain){
this.remain = remain;
}
public boolean isRemain(){
return this.remain;
}
private Integer orderno;
public void setOrderno(Integer orderno){
this.orderno = orderno;
}
public Integer getOrderno(){
return this.orderno;
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
private Integer numofcars;
public void setNumofcars(Integer numofcars){
this.numofcars = numofcars;
}
public Integer getNumofcars(){
return this.numofcars;
}
private String typecode;
public void setTypecode(String typecode){
this.typecode = typecode;
}
public String getTypecode(){
return this.typecode;
}
private String customername;
public void setCustomername(String customername){
this.customername = customername;
}
public String getCustomername(){
return this.customername;
}
private Double winnerspoint;
public void setWinnerspoint(Double winnerspoint){
this.winnerspoint = winnerspoint;
}
public Double getWinnerspoint(){
return this.winnerspoint;
}
private boolean owntradein;
public void setOwntradein(boolean owntradein){
this.owntradein = owntradein;
}
public boolean isOwntradein(){
return this.owntradein;
}
private String carlineoftradein;
public void setCarlineoftradein(String carlineoftradein){
this.carlineoftradein = carlineoftradein;
}
public String getCarlineoftradein(){
return this.carlineoftradein;
}
private Integer priceofmaintaxin;
public void setPriceofmaintaxin(Integer priceofmaintaxin){
this.priceofmaintaxin = priceofmaintaxin;
}
public Integer getPriceofmaintaxin(){
return this.priceofmaintaxin;
}
private Double profitrateofmain;
public void setProfitrateofmain(Double profitrateofmain){
this.profitrateofmain = profitrateofmain;
}
public Double getProfitrateofmain(){
return this.profitrateofmain;
}
private Integer priceofwithoptionstaxin;
public void setPriceofwithoptionstaxin(Integer priceofwithoptionstaxin){
this.priceofwithoptionstaxin = priceofwithoptionstaxin;
}
public Integer getPriceofwithoptionstaxin(){
return this.priceofwithoptionstaxin;
}
private Double profitrateofwithoptions;
public void setProfitrateofwithoptions(Double profitrateofwithoptions){
this.profitrateofwithoptions = profitrateofwithoptions;
}
public Double getProfitrateofwithoptions(){
return this.profitrateofwithoptions;
}
private Integer discounttaxin;
public void setDiscounttaxin(Integer discounttaxin){
this.discounttaxin = discounttaxin;
}
public Integer getDiscounttaxin(){
return this.discounttaxin;
}
private Integer chargesforregisttaxin;
public void setChargesforregisttaxin(Integer chargesforregisttaxin){
this.chargesforregisttaxin = chargesforregisttaxin;
}
public Integer getChargesforregisttaxin(){
return this.chargesforregisttaxin;
}
private Integer chargesforregisttaxex;
public void setChargesforregisttaxex(Integer chargesforregisttaxex){
this.chargesforregisttaxex = chargesforregisttaxex;
}
public Integer getChargesforregisttaxex(){
return this.chargesforregisttaxex;
}
private Integer principalofcredit;
public void setPrincipalofcredit(Integer principalofcredit){
this.principalofcredit = principalofcredit;
}
public Integer getPrincipalofcredit(){
return this.principalofcredit;
}
private Integer profitofcredit;
public void setProfitofcredit(Integer profitofcredit){
this.profitofcredit = profitofcredit;
}
public Integer getProfitofcredit(){
return this.profitofcredit;
}
private Integer actionforcredit;
public void setActionforcredit(Integer actionforcredit){
this.actionforcredit = actionforcredit;
}
public Integer getActionforcredit(){
return this.actionforcredit;
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
private Integer feeofintroduction;
public void setFeeofintroduction(Integer feeofintroduction){
this.feeofintroduction = feeofintroduction;
}
public Integer getFeeofintroduction(){
return this.feeofintroduction;
}
private Date submitteddateofordersheet;
public void setSubmitteddateofordersheet(Date submitteddateofordersheet){
this.submitteddateofordersheet = submitteddateofordersheet;
}
public Date getSubmitteddateofordersheet(){
return this.submitteddateofordersheet;
}
private boolean submitteddateofordersheetIsValid = false;
public void setSubmitteddateofordersheetIsValid(boolean submitteddateofordersheetIsValid){
this.submitteddateofordersheetIsValid = submitteddateofordersheetIsValid;
}
public boolean isSubmitteddateofordersheetIsValid(){
return this.submitteddateofordersheetIsValid;
}
private java.lang.String submitteddateofordersheetAsRawString ="";
public java.lang.String getSubmitteddateofordersheetAsString(){
    return (submitteddateofordersheet== null) ? null : format.format(submitteddateofordersheet);
}
public void setSubmitteddateofordersheetAsString(java.lang.String submitteddateofordersheet){
	this.submitteddateofordersheetIsValid = true;
	this.submitteddateofordersheetAsRawString = submitteddateofordersheet;
try{
		if(StringUtils.isNotBlank(submitteddateofordersheet)){ format.parse(submitteddateofordersheet);}
}catch (java.text.ParseException pe){
this.submitteddateofordersheetIsValid = false;
}
	if(submitteddateofordersheetIsValid){
		try {
			this.submitteddateofordersheet = (org.apache.commons.lang.StringUtils.isBlank(submitteddateofordersheet)) ? null : format.parse(submitteddateofordersheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setSubmitteddateofordersheetAsRawString(java.lang.String submitteddateofordersheet){
	this.submitteddateofordersheetAsRawString = submitteddateofordersheet;
}

public String getSubmitteddateofordersheetAsRawString(){
return this.submitteddateofordersheetAsRawString;
}
private Date submitteddateofparkingspacecertificate;
public void setSubmitteddateofparkingspacecertificate(Date submitteddateofparkingspacecertificate){
this.submitteddateofparkingspacecertificate = submitteddateofparkingspacecertificate;
}
public Date getSubmitteddateofparkingspacecertificate(){
return this.submitteddateofparkingspacecertificate;
}
private boolean submitteddateofparkingspacecertificateIsValid = false;
public void setSubmitteddateofparkingspacecertificateIsValid(boolean submitteddateofparkingspacecertificateIsValid){
this.submitteddateofparkingspacecertificateIsValid = submitteddateofparkingspacecertificateIsValid;
}
public boolean isSubmitteddateofparkingspacecertificateIsValid(){
return this.submitteddateofparkingspacecertificateIsValid;
}
private java.lang.String submitteddateofparkingspacecertificateAsRawString ="";
public java.lang.String getSubmitteddateofparkingspacecertificateAsString(){
    return (submitteddateofparkingspacecertificate== null) ? null : format.format(submitteddateofparkingspacecertificate);
}
public void setSubmitteddateofparkingspacecertificateAsString(java.lang.String submitteddateofparkingspacecertificate){
	this.submitteddateofparkingspacecertificateIsValid = true;
	this.submitteddateofparkingspacecertificateAsRawString = submitteddateofparkingspacecertificate;
try{
		if(StringUtils.isNotBlank(submitteddateofparkingspacecertificate)){ format.parse(submitteddateofparkingspacecertificate);}
}catch (java.text.ParseException pe){
this.submitteddateofparkingspacecertificateIsValid = false;
}
	if(submitteddateofparkingspacecertificateIsValid){
		try {
			this.submitteddateofparkingspacecertificate = (org.apache.commons.lang.StringUtils.isBlank(submitteddateofparkingspacecertificate)) ? null : format.parse(submitteddateofparkingspacecertificate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setSubmitteddateofparkingspacecertificateAsRawString(java.lang.String submitteddateofparkingspacecertificate){
	this.submitteddateofparkingspacecertificateAsRawString = submitteddateofparkingspacecertificate;
}

public String getSubmitteddateofparkingspacecertificateAsRawString(){
return this.submitteddateofparkingspacecertificateAsRawString;
}
private Date receiptdateofparkingspacecertificate;
public void setReceiptdateofparkingspacecertificate(Date receiptdateofparkingspacecertificate){
this.receiptdateofparkingspacecertificate = receiptdateofparkingspacecertificate;
}
public Date getReceiptdateofparkingspacecertificate(){
return this.receiptdateofparkingspacecertificate;
}
private boolean receiptdateofparkingspacecertificateIsValid = false;
public void setReceiptdateofparkingspacecertificateIsValid(boolean receiptdateofparkingspacecertificateIsValid){
this.receiptdateofparkingspacecertificateIsValid = receiptdateofparkingspacecertificateIsValid;
}
public boolean isReceiptdateofparkingspacecertificateIsValid(){
return this.receiptdateofparkingspacecertificateIsValid;
}
private java.lang.String receiptdateofparkingspacecertificateAsRawString ="";
public java.lang.String getReceiptdateofparkingspacecertificateAsString(){
    return (receiptdateofparkingspacecertificate== null) ? null : format.format(receiptdateofparkingspacecertificate);
}
public void setReceiptdateofparkingspacecertificateAsString(java.lang.String receiptdateofparkingspacecertificate){
	this.receiptdateofparkingspacecertificateIsValid = true;
	this.receiptdateofparkingspacecertificateAsRawString = receiptdateofparkingspacecertificate;
try{
		if(StringUtils.isNotBlank(receiptdateofparkingspacecertificate)){ format.parse(receiptdateofparkingspacecertificate);}
}catch (java.text.ParseException pe){
this.receiptdateofparkingspacecertificateIsValid = false;
}
	if(receiptdateofparkingspacecertificateIsValid){
		try {
			this.receiptdateofparkingspacecertificate = (org.apache.commons.lang.StringUtils.isBlank(receiptdateofparkingspacecertificate)) ? null : format.parse(receiptdateofparkingspacecertificate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setReceiptdateofparkingspacecertificateAsRawString(java.lang.String receiptdateofparkingspacecertificate){
	this.receiptdateofparkingspacecertificateAsRawString = receiptdateofparkingspacecertificate;
}

public String getReceiptdateofparkingspacecertificateAsRawString(){
return this.receiptdateofparkingspacecertificateAsRawString;
}
private Date collecteddateofsealcertificate;
public void setCollecteddateofsealcertificate(Date collecteddateofsealcertificate){
this.collecteddateofsealcertificate = collecteddateofsealcertificate;
}
public Date getCollecteddateofsealcertificate(){
return this.collecteddateofsealcertificate;
}
private boolean collecteddateofsealcertificateIsValid = false;
public void setCollecteddateofsealcertificateIsValid(boolean collecteddateofsealcertificateIsValid){
this.collecteddateofsealcertificateIsValid = collecteddateofsealcertificateIsValid;
}
public boolean isCollecteddateofsealcertificateIsValid(){
return this.collecteddateofsealcertificateIsValid;
}
private java.lang.String collecteddateofsealcertificateAsRawString ="";
public java.lang.String getCollecteddateofsealcertificateAsString(){
    return (collecteddateofsealcertificate== null) ? null : format.format(collecteddateofsealcertificate);
}
public void setCollecteddateofsealcertificateAsString(java.lang.String collecteddateofsealcertificate){
	this.collecteddateofsealcertificateIsValid = true;
	this.collecteddateofsealcertificateAsRawString = collecteddateofsealcertificate;
try{
		if(StringUtils.isNotBlank(collecteddateofsealcertificate)){ format.parse(collecteddateofsealcertificate);}
}catch (java.text.ParseException pe){
this.collecteddateofsealcertificateIsValid = false;
}
	if(collecteddateofsealcertificateIsValid){
		try {
			this.collecteddateofsealcertificate = (org.apache.commons.lang.StringUtils.isBlank(collecteddateofsealcertificate)) ? null : format.parse(collecteddateofsealcertificate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCollecteddateofsealcertificateAsRawString(java.lang.String collecteddateofsealcertificate){
	this.collecteddateofsealcertificateAsRawString = collecteddateofsealcertificate;
}

public String getCollecteddateofsealcertificateAsRawString(){
return this.collecteddateofsealcertificateAsRawString;
}
private Date collecteddateofproxy;
public void setCollecteddateofproxy(Date collecteddateofproxy){
this.collecteddateofproxy = collecteddateofproxy;
}
public Date getCollecteddateofproxy(){
return this.collecteddateofproxy;
}
private boolean collecteddateofproxyIsValid = false;
public void setCollecteddateofproxyIsValid(boolean collecteddateofproxyIsValid){
this.collecteddateofproxyIsValid = collecteddateofproxyIsValid;
}
public boolean isCollecteddateofproxyIsValid(){
return this.collecteddateofproxyIsValid;
}
private java.lang.String collecteddateofproxyAsRawString ="";
public java.lang.String getCollecteddateofproxyAsString(){
    return (collecteddateofproxy== null) ? null : format.format(collecteddateofproxy);
}
public void setCollecteddateofproxyAsString(java.lang.String collecteddateofproxy){
	this.collecteddateofproxyIsValid = true;
	this.collecteddateofproxyAsRawString = collecteddateofproxy;
try{
		if(StringUtils.isNotBlank(collecteddateofproxy)){ format.parse(collecteddateofproxy);}
}catch (java.text.ParseException pe){
this.collecteddateofproxyIsValid = false;
}
	if(collecteddateofproxyIsValid){
		try {
			this.collecteddateofproxy = (org.apache.commons.lang.StringUtils.isBlank(collecteddateofproxy)) ? null : format.parse(collecteddateofproxy);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCollecteddateofproxyAsRawString(java.lang.String collecteddateofproxy){
	this.collecteddateofproxyAsRawString = collecteddateofproxy;
}

public String getCollecteddateofproxyAsRawString(){
return this.collecteddateofproxyAsRawString;
}
private Date collecteddateofresidencecertificate;
public void setCollecteddateofresidencecertificate(Date collecteddateofresidencecertificate){
this.collecteddateofresidencecertificate = collecteddateofresidencecertificate;
}
public Date getCollecteddateofresidencecertificate(){
return this.collecteddateofresidencecertificate;
}
private boolean collecteddateofresidencecertificateIsValid = false;
public void setCollecteddateofresidencecertificateIsValid(boolean collecteddateofresidencecertificateIsValid){
this.collecteddateofresidencecertificateIsValid = collecteddateofresidencecertificateIsValid;
}
public boolean isCollecteddateofresidencecertificateIsValid(){
return this.collecteddateofresidencecertificateIsValid;
}
private java.lang.String collecteddateofresidencecertificateAsRawString ="";
public java.lang.String getCollecteddateofresidencecertificateAsString(){
    return (collecteddateofresidencecertificate== null) ? null : format.format(collecteddateofresidencecertificate);
}
public void setCollecteddateofresidencecertificateAsString(java.lang.String collecteddateofresidencecertificate){
	this.collecteddateofresidencecertificateIsValid = true;
	this.collecteddateofresidencecertificateAsRawString = collecteddateofresidencecertificate;
try{
		if(StringUtils.isNotBlank(collecteddateofresidencecertificate)){ format.parse(collecteddateofresidencecertificate);}
}catch (java.text.ParseException pe){
this.collecteddateofresidencecertificateIsValid = false;
}
	if(collecteddateofresidencecertificateIsValid){
		try {
			this.collecteddateofresidencecertificate = (org.apache.commons.lang.StringUtils.isBlank(collecteddateofresidencecertificate)) ? null : format.parse(collecteddateofresidencecertificate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCollecteddateofresidencecertificateAsRawString(java.lang.String collecteddateofresidencecertificate){
	this.collecteddateofresidencecertificateAsRawString = collecteddateofresidencecertificate;
}

public String getCollecteddateofresidencecertificateAsRawString(){
return this.collecteddateofresidencecertificateAsRawString;
}
private Date senddateofcreditapplication;
public void setSenddateofcreditapplication(Date senddateofcreditapplication){
this.senddateofcreditapplication = senddateofcreditapplication;
}
public Date getSenddateofcreditapplication(){
return this.senddateofcreditapplication;
}
private boolean senddateofcreditapplicationIsValid = false;
public void setSenddateofcreditapplicationIsValid(boolean senddateofcreditapplicationIsValid){
this.senddateofcreditapplicationIsValid = senddateofcreditapplicationIsValid;
}
public boolean isSenddateofcreditapplicationIsValid(){
return this.senddateofcreditapplicationIsValid;
}
private java.lang.String senddateofcreditapplicationAsRawString ="";
public java.lang.String getSenddateofcreditapplicationAsString(){
    return (senddateofcreditapplication== null) ? null : format.format(senddateofcreditapplication);
}
public void setSenddateofcreditapplicationAsString(java.lang.String senddateofcreditapplication){
	this.senddateofcreditapplicationIsValid = true;
	this.senddateofcreditapplicationAsRawString = senddateofcreditapplication;
try{
		if(StringUtils.isNotBlank(senddateofcreditapplication)){ format.parse(senddateofcreditapplication);}
}catch (java.text.ParseException pe){
this.senddateofcreditapplicationIsValid = false;
}
	if(senddateofcreditapplicationIsValid){
		try {
			this.senddateofcreditapplication = (org.apache.commons.lang.StringUtils.isBlank(senddateofcreditapplication)) ? null : format.parse(senddateofcreditapplication);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setSenddateofcreditapplicationAsRawString(java.lang.String senddateofcreditapplication){
	this.senddateofcreditapplicationAsRawString = senddateofcreditapplication;
}

public String getSenddateofcreditapplicationAsRawString(){
return this.senddateofcreditapplicationAsRawString;
}
private Date submitteddateofregistrequest;
public void setSubmitteddateofregistrequest(Date submitteddateofregistrequest){
this.submitteddateofregistrequest = submitteddateofregistrequest;
}
public Date getSubmitteddateofregistrequest(){
return this.submitteddateofregistrequest;
}
private boolean submitteddateofregistrequestIsValid = false;
public void setSubmitteddateofregistrequestIsValid(boolean submitteddateofregistrequestIsValid){
this.submitteddateofregistrequestIsValid = submitteddateofregistrequestIsValid;
}
public boolean isSubmitteddateofregistrequestIsValid(){
return this.submitteddateofregistrequestIsValid;
}
private java.lang.String submitteddateofregistrequestAsRawString ="";
public java.lang.String getSubmitteddateofregistrequestAsString(){
    return (submitteddateofregistrequest== null) ? null : format.format(submitteddateofregistrequest);
}
public void setSubmitteddateofregistrequestAsString(java.lang.String submitteddateofregistrequest){
	this.submitteddateofregistrequestIsValid = true;
	this.submitteddateofregistrequestAsRawString = submitteddateofregistrequest;
try{
		if(StringUtils.isNotBlank(submitteddateofregistrequest)){ format.parse(submitteddateofregistrequest);}
}catch (java.text.ParseException pe){
this.submitteddateofregistrequestIsValid = false;
}
	if(submitteddateofregistrequestIsValid){
		try {
			this.submitteddateofregistrequest = (org.apache.commons.lang.StringUtils.isBlank(submitteddateofregistrequest)) ? null : format.parse(submitteddateofregistrequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setSubmitteddateofregistrequestAsRawString(java.lang.String submitteddateofregistrequest){
	this.submitteddateofregistrequestAsRawString = submitteddateofregistrequest;
}

public String getSubmitteddateofregistrequestAsRawString(){
return this.submitteddateofregistrequestAsRawString;
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
private boolean sendthankyouletter;
public void setSendthankyouletter(boolean sendthankyouletter){
this.sendthankyouletter = sendthankyouletter;
}
public boolean isSendthankyouletter(){
return this.sendthankyouletter;
}
private boolean sendthankyouletterbymanager;
public void setSendthankyouletterbymanager(boolean sendthankyouletterbymanager){
this.sendthankyouletterbymanager = sendthankyouletterbymanager;
}
public boolean isSendthankyouletterbymanager(){
return this.sendthankyouletterbymanager;
}
private Integer employeecodeofregist;
public void setEmployeecodeofregist(Integer employeecodeofregist){
this.employeecodeofregist = employeecodeofregist;
}
public Integer getEmployeecodeofregist(){
return this.employeecodeofregist;
}
private String forecastofregist;
public void setForecastofregist(String forecastofregist){
this.forecastofregist = forecastofregist;
}
public String getForecastofregist(){
return this.forecastofregist;
}
private String carryregist;
public void setCarryregist(String carryregist){
this.carryregist = carryregist;
}
public String getCarryregist(){
return this.carryregist;
}
private String collectadvancereceipt;
public void setCollectadvancereceipt(String collectadvancereceipt){
this.collectadvancereceipt = collectadvancereceipt;
}
public String getCollectadvancereceipt(){
return this.collectadvancereceipt;
}
private Integer proceeds;
public void setProceeds(Integer proceeds){
this.proceeds = proceeds;
}
public Integer getProceeds(){
return this.proceeds;
}
private Integer priceoftradein;
public void setPriceoftradein(Integer priceoftradein){
this.priceoftradein = priceoftradein;
}
public Integer getPriceoftradein(){
return this.priceoftradein;
}
private Integer applicationfee;
public void setApplicationfee(Integer applicationfee){
this.applicationfee = applicationfee;
}
public Integer getApplicationfee(){
return this.applicationfee;
}
private Date collecteddateofapplicationfee;
public void setCollecteddateofapplicationfee(Date collecteddateofapplicationfee){
this.collecteddateofapplicationfee = collecteddateofapplicationfee;
}
public Date getCollecteddateofapplicationfee(){
return this.collecteddateofapplicationfee;
}
private boolean collecteddateofapplicationfeeIsValid = false;
public void setCollecteddateofapplicationfeeIsValid(boolean collecteddateofapplicationfeeIsValid){
this.collecteddateofapplicationfeeIsValid = collecteddateofapplicationfeeIsValid;
}
public boolean isCollecteddateofapplicationfeeIsValid(){
return this.collecteddateofapplicationfeeIsValid;
}
private java.lang.String collecteddateofapplicationfeeAsRawString ="";
public java.lang.String getCollecteddateofapplicationfeeAsString(){
    return (collecteddateofapplicationfee== null) ? null : format.format(collecteddateofapplicationfee);
}
public void setCollecteddateofapplicationfeeAsString(java.lang.String collecteddateofapplicationfee){
	this.collecteddateofapplicationfeeIsValid = true;
	this.collecteddateofapplicationfeeAsRawString = collecteddateofapplicationfee;
try{
		if(StringUtils.isNotBlank(collecteddateofapplicationfee)){ format.parse(collecteddateofapplicationfee);}
}catch (java.text.ParseException pe){
this.collecteddateofapplicationfeeIsValid = false;
}
	if(collecteddateofapplicationfeeIsValid){
		try {
			this.collecteddateofapplicationfee = (org.apache.commons.lang.StringUtils.isBlank(collecteddateofapplicationfee)) ? null : format.parse(collecteddateofapplicationfee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCollecteddateofapplicationfeeAsRawString(java.lang.String collecteddateofapplicationfee){
	this.collecteddateofapplicationfeeAsRawString = collecteddateofapplicationfee;
}

public String getCollecteddateofapplicationfeeAsRawString(){
return this.collecteddateofapplicationfeeAsRawString;
}
private Integer advancereceipt;
public void setAdvancereceipt(Integer advancereceipt){
this.advancereceipt = advancereceipt;
}
public Integer getAdvancereceipt(){
return this.advancereceipt;
}
private Date collecteddateofadvancereceipt;
public void setCollecteddateofadvancereceipt(Date collecteddateofadvancereceipt){
this.collecteddateofadvancereceipt = collecteddateofadvancereceipt;
}
public Date getCollecteddateofadvancereceipt(){
return this.collecteddateofadvancereceipt;
}
private boolean collecteddateofadvancereceiptIsValid = false;
public void setCollecteddateofadvancereceiptIsValid(boolean collecteddateofadvancereceiptIsValid){
this.collecteddateofadvancereceiptIsValid = collecteddateofadvancereceiptIsValid;
}
public boolean isCollecteddateofadvancereceiptIsValid(){
return this.collecteddateofadvancereceiptIsValid;
}
private java.lang.String collecteddateofadvancereceiptAsRawString ="";
public java.lang.String getCollecteddateofadvancereceiptAsString(){
    return (collecteddateofadvancereceipt== null) ? null : format.format(collecteddateofadvancereceipt);
}
public void setCollecteddateofadvancereceiptAsString(java.lang.String collecteddateofadvancereceipt){
	this.collecteddateofadvancereceiptIsValid = true;
	this.collecteddateofadvancereceiptAsRawString = collecteddateofadvancereceipt;
try{
		if(StringUtils.isNotBlank(collecteddateofadvancereceipt)){ format.parse(collecteddateofadvancereceipt);}
}catch (java.text.ParseException pe){
this.collecteddateofadvancereceiptIsValid = false;
}
	if(collecteddateofadvancereceiptIsValid){
		try {
			this.collecteddateofadvancereceipt = (org.apache.commons.lang.StringUtils.isBlank(collecteddateofadvancereceipt)) ? null : format.parse(collecteddateofadvancereceipt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCollecteddateofadvancereceiptAsRawString(java.lang.String collecteddateofadvancereceipt){
	this.collecteddateofadvancereceiptAsRawString = collecteddateofadvancereceipt;
}

public String getCollecteddateofadvancereceiptAsRawString(){
return this.collecteddateofadvancereceiptAsRawString;
}
private Integer remainder;
public void setRemainder(Integer remainder){
this.remainder = remainder;
}
public Integer getRemainder(){
return this.remainder;
}
private Date collecteddateofremainder;
public void setCollecteddateofremainder(Date collecteddateofremainder){
this.collecteddateofremainder = collecteddateofremainder;
}
public Date getCollecteddateofremainder(){
return this.collecteddateofremainder;
}
private boolean collecteddateofremainderIsValid = false;
public void setCollecteddateofremainderIsValid(boolean collecteddateofremainderIsValid){
this.collecteddateofremainderIsValid = collecteddateofremainderIsValid;
}
public boolean isCollecteddateofremainderIsValid(){
return this.collecteddateofremainderIsValid;
}
private java.lang.String collecteddateofremainderAsRawString ="";
public java.lang.String getCollecteddateofremainderAsString(){
    return (collecteddateofremainder== null) ? null : format.format(collecteddateofremainder);
}
public void setCollecteddateofremainderAsString(java.lang.String collecteddateofremainder){
	this.collecteddateofremainderIsValid = true;
	this.collecteddateofremainderAsRawString = collecteddateofremainder;
try{
		if(StringUtils.isNotBlank(collecteddateofremainder)){ format.parse(collecteddateofremainder);}
}catch (java.text.ParseException pe){
this.collecteddateofremainderIsValid = false;
}
	if(collecteddateofremainderIsValid){
		try {
			this.collecteddateofremainder = (org.apache.commons.lang.StringUtils.isBlank(collecteddateofremainder)) ? null : format.parse(collecteddateofremainder);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setCollecteddateofremainderAsRawString(java.lang.String collecteddateofremainder){
	this.collecteddateofremainderAsRawString = collecteddateofremainder;
}

public String getCollecteddateofremainderAsRawString(){
return this.collecteddateofremainderAsRawString;
}
private Integer navigation;
public void setNavigation(Integer navigation){
this.navigation = navigation;
}
public Integer getNavigation(){
return this.navigation;
}
private Integer companyOfCredit;
public void setCompanyOfCredit(Integer companyOfCredit){
this.companyOfCredit = companyOfCredit;
}
public Integer getCompanyOfCredit(){
return this.companyOfCredit;
}
private Integer police;
public void setPolice(Integer police){
this.police = police;
}
public Integer getPolice(){
return this.police;
}
private Integer improvementReportOfNewCarProfit;
public void setImprovementReportOfNewCarProfit(Integer improvementReportOfNewCarProfit){
this.improvementReportOfNewCarProfit = improvementReportOfNewCarProfit;
}
public Integer getImprovementReportOfNewCarProfit(){
return this.improvementReportOfNewCarProfit;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	cancel =false;
	remain =false;
	owntradein =false;
	sendthankyouletter =false;
	sendthankyouletterbymanager =false;
}
}
