package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ResultAndProductivityForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer month;
public void setMonth(Integer month){
this.month = month;
}
public Integer getMonth(){
return this.month;
}
private Integer year;
public void setYear(Integer year){
this.year = year;
}
public Integer getYear(){
return this.year;
}
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer shop;
public void setShop(Integer shop){
this.shop = shop;
}
public Integer getShop(){
return this.shop;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Date todate;
public void setTodate(Date todate){
this.todate = todate;
}
public Date getTodate(){
return this.todate;
}
private boolean todateIsValid = false;
public void setTodateIsValid(boolean todateIsValid){
this.todateIsValid = todateIsValid;
}
public boolean isTodateIsValid(){
return this.todateIsValid;
}
private java.lang.String todateAsRawString ="";
public java.lang.String getTodateAsString(){
    return (todate== null) ? null : format.format(todate);
}
public void setTodateAsString(java.lang.String todate){
	this.todateIsValid = true;
	this.todateAsRawString = todate;
try{
		if(StringUtils.isNotBlank(todate)){ format.parse(todate);}
}catch (java.text.ParseException pe){
this.todateIsValid = false;
}
	if(todateIsValid){
		try {
			this.todate = (org.apache.commons.lang.StringUtils.isBlank(todate)) ? null : format.parse(todate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTodateAsRawString(java.lang.String todate){
	this.todateAsRawString = todate;
}

public String getTodateAsRawString(){
return this.todateAsRawString;
}
private Integer salesnew;
public void setSalesnew(Integer salesnew){
this.salesnew = salesnew;
}
public Integer getSalesnew(){
return this.salesnew;
}
private Integer newcustomerparallel;
public void setNewcustomerparallel(Integer newcustomerparallel){
this.newcustomerparallel = newcustomerparallel;
}
public Integer getNewcustomerparallel(){
return this.newcustomerparallel;
}
private Integer usedotherintroductionemployee;
public void setUsedotherintroductionemployee(Integer usedotherintroductionemployee){
this.usedotherintroductionemployee = usedotherintroductionemployee;
}
public Integer getUsedotherintroductionemployee(){
return this.usedotherintroductionemployee;
}
private Integer usedotherintroductionother;
public void setUsedotherintroductionother(Integer usedotherintroductionother){
this.usedotherintroductionother = usedotherintroductionother;
}
public Integer getUsedotherintroductionother(){
return this.usedotherintroductionother;
}
private Integer salesused;
public void setSalesused(Integer salesused){
this.salesused = salesused;
}
public Integer getSalesused(){
return this.salesused;
}
private Integer storageinspection;
public void setStorageinspection(Integer storageinspection){
this.storageinspection = storageinspection;
}
public Integer getStorageinspection(){
return this.storageinspection;
}
private Integer storage12;
public void setStorage12(Integer storage12){
this.storage12 = storage12;
}
public Integer getStorage12(){
return this.storage12;
}
private Integer storagemsc;
public void setStoragemsc(Integer storagemsc){
this.storagemsc = storagemsc;
}
public Integer getStoragemsc(){
return this.storagemsc;
}
private Integer assurancenew;
public void setAssurancenew(Integer assurancenew){
this.assurancenew = assurancenew;
}
public Integer getAssurancenew(){
return this.assurancenew;
}
private Integer assurancecontinuance;
public void setAssurancecontinuance(Integer assurancecontinuance){
this.assurancecontinuance = assurancecontinuance;
}
public Integer getAssurancecontinuance(){
return this.assurancecontinuance;
}
private Integer profitnew;
public void setProfitnew(Integer profitnew){
this.profitnew = profitnew;
}
public Integer getProfitnew(){
return this.profitnew;
}
private Integer profitused;
public void setProfitused(Integer profitused){
this.profitused = profitused;
}
public Integer getProfitused(){
return this.profitused;
}
private Integer newcustomeralternatives;
public void setNewcustomeralternatives(Integer newcustomeralternatives){
this.newcustomeralternatives = newcustomeralternatives;
}
public Integer getNewcustomeralternatives(){
return this.newcustomeralternatives;
}
private Integer newcustomerincrement;
public void setNewcustomerincrement(Integer newcustomerincrement){
this.newcustomerincrement = newcustomerincrement;
}
public Integer getNewcustomerincrement(){
return this.newcustomerincrement;
}
private Integer newcustomerintroduction;
public void setNewcustomerintroduction(Integer newcustomerintroduction){
this.newcustomerintroduction = newcustomerintroduction;
}
public Integer getNewcustomerintroduction(){
return this.newcustomerintroduction;
}
private Integer newnewotheralternatives;
public void setNewnewotheralternatives(Integer newnewotheralternatives){
this.newnewotheralternatives = newnewotheralternatives;
}
public Integer getNewnewotheralternatives(){
return this.newnewotheralternatives;
}
private Integer newnewothernew;
public void setNewnewothernew(Integer newnewothernew){
this.newnewothernew = newnewothernew;
}
public Integer getNewnewothernew(){
return this.newnewothernew;
}
private Integer newvendormarket;
public void setNewvendormarket(Integer newvendormarket){
this.newvendormarket = newvendormarket;
}
public Integer getNewvendormarket(){
return this.newvendormarket;
}
private Integer newvendorintroduction;
public void setNewvendorintroduction(Integer newvendorintroduction){
this.newvendorintroduction = newvendorintroduction;
}
public Integer getNewvendorintroduction(){
return this.newvendorintroduction;
}
private Integer newotherintroductionemployee;
public void setNewotherintroductionemployee(Integer newotherintroductionemployee){
this.newotherintroductionemployee = newotherintroductionemployee;
}
public Integer getNewotherintroductionemployee(){
return this.newotherintroductionemployee;
}
private Integer newotherintroductionother;
public void setNewotherintroductionother(Integer newotherintroductionother){
this.newotherintroductionother = newotherintroductionother;
}
public Integer getNewotherintroductionother(){
return this.newotherintroductionother;
}
private Integer usedcustomeralternatives;
public void setUsedcustomeralternatives(Integer usedcustomeralternatives){
this.usedcustomeralternatives = usedcustomeralternatives;
}
public Integer getUsedcustomeralternatives(){
return this.usedcustomeralternatives;
}
private Integer usedcustomerincrement;
public void setUsedcustomerincrement(Integer usedcustomerincrement){
this.usedcustomerincrement = usedcustomerincrement;
}
public Integer getUsedcustomerincrement(){
return this.usedcustomerincrement;
}
private Integer usedcustomerintroduction;
public void setUsedcustomerintroduction(Integer usedcustomerintroduction){
this.usedcustomerintroduction = usedcustomerintroduction;
}
public Integer getUsedcustomerintroduction(){
return this.usedcustomerintroduction;
}
private Integer usedcustomerparallel;
public void setUsedcustomerparallel(Integer usedcustomerparallel){
this.usedcustomerparallel = usedcustomerparallel;
}
public Integer getUsedcustomerparallel(){
return this.usedcustomerparallel;
}
private Integer usednewotheralternatives;
public void setUsednewotheralternatives(Integer usednewotheralternatives){
this.usednewotheralternatives = usednewotheralternatives;
}
public Integer getUsednewotheralternatives(){
return this.usednewotheralternatives;
}
private Integer usednewothernew;
public void setUsednewothernew(Integer usednewothernew){
this.usednewothernew = usednewothernew;
}
public Integer getUsednewothernew(){
return this.usednewothernew;
}
private Integer usedvendormarket;
public void setUsedvendormarket(Integer usedvendormarket){
this.usedvendormarket = usedvendormarket;
}
public Integer getUsedvendormarket(){
return this.usedvendormarket;
}
private Integer usedvendorintroduction;
public void setUsedvendorintroduction(Integer usedvendorintroduction){
this.usedvendorintroduction = usedvendorintroduction;
}
public Integer getUsedvendorintroduction(){
return this.usedvendorintroduction;
}
private Integer base;
public void setBase(Integer base){
this.base = base;
}
public Integer getBase(){
return this.base;
}
private int newsales;
public void setNewsales(int newsales){
this.newsales = newsales;
}
public int getNewsales(){
return this.newsales;
}
private int usedsales;
public void setUsedsales(int usedsales){
this.usedsales = usedsales;
}
public int getUsedsales(){
return this.usedsales;
}
private int newassurancenew;
public void setNewassurancenew(int newassurancenew){
this.newassurancenew = newassurancenew;
}
public int getNewassurancenew(){
return this.newassurancenew;
}
private int usedassurancecontinuance;
public void setUsedassurancecontinuance(int usedassurancecontinuance){
this.usedassurancecontinuance = usedassurancecontinuance;
}
public int getUsedassurancecontinuance(){
return this.usedassurancecontinuance;
}
private int newprofit;
public void setNewprofit(int newprofit){
this.newprofit = newprofit;
}
public int getNewprofit(){
return this.newprofit;
}
private int usedprofit;
public void setUsedprofit(int usedprofit){
this.usedprofit = usedprofit;
}
public int getUsedprofit(){
return this.usedprofit;
}
private int newotherintroductionothers;
public void setNewotherintroductionothers(int newotherintroductionothers){
this.newotherintroductionothers = newotherintroductionothers;
}
public int getNewotherintroductionothers(){
return this.newotherintroductionothers;
}
private int usedotherintroductionothers;
public void setUsedotherintroductionothers(int usedotherintroductionothers){
this.usedotherintroductionothers = usedotherintroductionothers;
}
public int getUsedotherintroductionothers(){
return this.usedotherintroductionothers;
}
private int activitystorefront;
public void setActivitystorefront(int activitystorefront){
this.activitystorefront = activitystorefront;
}
public int getActivitystorefront(){
return this.activitystorefront;
}
private int activityvisit;
public void setActivityvisit(int activityvisit){
this.activityvisit = activityvisit;
}
public int getActivityvisit(){
return this.activityvisit;
}
private int activityslc;
public void setActivityslc(int activityslc){
this.activityslc = activityslc;
}
public int getActivityslc(){
return this.activityslc;
}
private int activitymail;
public void setActivitymail(int activitymail){
this.activitymail = activitymail;
}
public int getActivitymail(){
return this.activitymail;
}
private int activitytel;
public void setActivitytel(int activitytel){
this.activitytel = activitytel;
}
public int getActivitytel(){
return this.activitytel;
}
private int customeractivitystorefront;
public void setCustomeractivitystorefront(int customeractivitystorefront){
this.customeractivitystorefront = customeractivitystorefront;
}
public int getCustomeractivitystorefront(){
return this.customeractivitystorefront;
}
private int customeractivityvisit;
public void setCustomeractivityvisit(int customeractivityvisit){
this.customeractivityvisit = customeractivityvisit;
}
public int getCustomeractivityvisit(){
return this.customeractivityvisit;
}
private int customeractivityslc;
public void setCustomeractivityslc(int customeractivityslc){
this.customeractivityslc = customeractivityslc;
}
public int getCustomeractivityslc(){
return this.customeractivityslc;
}
private int customeractivitymail;
public void setCustomeractivitymail(int customeractivitymail){
this.customeractivitymail = customeractivitymail;
}
public int getCustomeractivitymail(){
return this.customeractivitymail;
}
private int customeractivitytel;
public void setCustomeractivitytel(int customeractivitytel){
this.customeractivitytel = customeractivitytel;
}
public int getCustomeractivitytel(){
return this.customeractivitytel;
}
private int customernum;
public void setCustomernum(int customernum){
this.customernum = customernum;
}
public int getCustomernum(){
return this.customernum;
}
private int customerscore;
public void setCustomerscore(int customerscore){
this.customerscore = customerscore;
}
public int getCustomerscore(){
return this.customerscore;
}
private String termgoal;
public void setTermgoal(String termgoal){
this.termgoal = termgoal;
}
public String getTermgoal(){
return this.termgoal;
}
private String firsthalfgoal;
public void setFirsthalfgoal(String firsthalfgoal){
this.firsthalfgoal = firsthalfgoal;
}
public String getFirsthalfgoal(){
return this.firsthalfgoal;
}
private String secondhalfgoal;
public void setSecondhalfgoal(String secondhalfgoal){
this.secondhalfgoal = secondhalfgoal;
}
public String getSecondhalfgoal(){
return this.secondhalfgoal;
}
private String firsthalfselfoverview;
public void setFirsthalfselfoverview(String firsthalfselfoverview){
this.firsthalfselfoverview = firsthalfselfoverview;
}
public String getFirsthalfselfoverview(){
return this.firsthalfselfoverview;
}
private String secondhalfselfoverview;
public void setSecondhalfselfoverview(String secondhalfselfoverview){
this.secondhalfselfoverview = secondhalfselfoverview;
}
public String getSecondhalfselfoverview(){
return this.secondhalfselfoverview;
}
private String selfoverview;
public void setSelfoverview(String selfoverview){
this.selfoverview = selfoverview;
}
public String getSelfoverview(){
return this.selfoverview;
}
private double customerprotectionrate;
public void setCustomerprotectionrate(double customerprotectionrate){
this.customerprotectionrate = customerprotectionrate;
}
public double getCustomerprotectionrate(){
return this.customerprotectionrate;
}
private double customerassurancerate;
public void setCustomerassurancerate(double customerassurancerate){
this.customerassurancerate = customerassurancerate;
}
public double getCustomerassurancerate(){
return this.customerassurancerate;
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
