package net.mazdasalestool.beans;
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
private Integer id;
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
private Integer newsales;
public void setNewsales(Integer newsales){
this.newsales = newsales;
}
public Integer getNewsales(){
return this.newsales;
}
private Integer usedsales;
public void setUsedsales(Integer usedsales){
this.usedsales = usedsales;
}
public Integer getUsedsales(){
return this.usedsales;
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
private Integer newassurancenew;
public void setNewassurancenew(Integer newassurancenew){
this.newassurancenew = newassurancenew;
}
public Integer getNewassurancenew(){
return this.newassurancenew;
}
private Integer usedassurancecontinuance;
public void setUsedassurancecontinuance(Integer usedassurancecontinuance){
this.usedassurancecontinuance = usedassurancecontinuance;
}
public Integer getUsedassurancecontinuance(){
return this.usedassurancecontinuance;
}
private Integer newprofit;
public void setNewprofit(Integer newprofit){
this.newprofit = newprofit;
}
public Integer getNewprofit(){
return this.newprofit;
}
private Integer usedprofit;
public void setUsedprofit(Integer usedprofit){
this.usedprofit = usedprofit;
}
public Integer getUsedprofit(){
return this.usedprofit;
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
private Integer customernum;
public void setCustomernum(Integer customernum){
this.customernum = customernum;
}
public Integer getCustomernum(){
return this.customernum;
}
private Integer customerprotectionrate;
public void setCustomerprotectionrate(Integer customerprotectionrate){
this.customerprotectionrate = customerprotectionrate;
}
public Integer getCustomerprotectionrate(){
return this.customerprotectionrate;
}
private Integer customerscore;
public void setCustomerscore(Integer customerscore){
this.customerscore = customerscore;
}
public Integer getCustomerscore(){
return this.customerscore;
}
private Integer termgoal;
public void setTermgoal(Integer termgoal){
this.termgoal = termgoal;
}
public Integer getTermgoal(){
return this.termgoal;
}
private Integer firsthalfgoal;
public void setFirsthalfgoal(Integer firsthalfgoal){
this.firsthalfgoal = firsthalfgoal;
}
public Integer getFirsthalfgoal(){
return this.firsthalfgoal;
}
private Integer secondhalfgoal;
public void setSecondhalfgoal(Integer secondhalfgoal){
this.secondhalfgoal = secondhalfgoal;
}
public Integer getSecondhalfgoal(){
return this.secondhalfgoal;
}
private Integer firsthalfselfoverview;
public void setFirsthalfselfoverview(Integer firsthalfselfoverview){
this.firsthalfselfoverview = firsthalfselfoverview;
}
public Integer getFirsthalfselfoverview(){
return this.firsthalfselfoverview;
}
private Integer secondhalfselfoverview;
public void setSecondhalfselfoverview(Integer secondhalfselfoverview){
this.secondhalfselfoverview = secondhalfselfoverview;
}
public Integer getSecondhalfselfoverview(){
return this.secondhalfselfoverview;
}
private Integer selfoverview;
public void setSelfoverview(Integer selfoverview){
this.selfoverview = selfoverview;
}
public Integer getSelfoverview(){
return this.selfoverview;
}
private Integer customerassuarancerate;
public void setCustomerassuarancerate(Integer customerassuarancerate){
this.customerassuarancerate = customerassuarancerate;
}
public Integer getCustomerassuarancerate(){
return this.customerassuarancerate;
}
private Integer newotherroute;
public void setNewotherroute(Integer newotherroute){
this.newotherroute = newotherroute;
}
public Integer getNewotherroute(){
return this.newotherroute;
}
private Integer usedotherroute;
public void setUsedotherroute(Integer usedotherroute){
this.usedotherroute = usedotherroute;
}
public Integer getUsedotherroute(){
return this.usedotherroute;
}
private Integer newcustomerparallel;
public void setNewcustomerparallel(Integer newcustomerparallel){
this.newcustomerparallel = newcustomerparallel;
}
public Integer getNewcustomerparallel(){
return this.newcustomerparallel;
}
private Integer newcustomerintroduction;
public void setNewcustomerintroduction(Integer newcustomerintroduction){
this.newcustomerintroduction = newcustomerintroduction;
}
public Integer getNewcustomerintroduction(){
return this.newcustomerintroduction;
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
private Integer newotherintroductionothers;
public void setNewotherintroductionothers(Integer newotherintroductionothers){
this.newotherintroductionothers = newotherintroductionothers;
}
public Integer getNewotherintroductionothers(){
return this.newotherintroductionothers;
}
private Integer usedcustomerparallel;
public void setUsedcustomerparallel(Integer usedcustomerparallel){
this.usedcustomerparallel = usedcustomerparallel;
}
public Integer getUsedcustomerparallel(){
return this.usedcustomerparallel;
}
private Integer usedcustomerintroduction;
public void setUsedcustomerintroduction(Integer usedcustomerintroduction){
this.usedcustomerintroduction = usedcustomerintroduction;
}
public Integer getUsedcustomerintroduction(){
return this.usedcustomerintroduction;
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
private Integer usedotherintroductionemployee;
public void setUsedotherintroductionemployee(Integer usedotherintroductionemployee){
this.usedotherintroductionemployee = usedotherintroductionemployee;
}
public Integer getUsedotherintroductionemployee(){
return this.usedotherintroductionemployee;
}
private Integer usedotherintroductionothers;
public void setUsedotherintroductionothers(Integer usedotherintroductionothers){
this.usedotherintroductionothers = usedotherintroductionothers;
}
public Integer getUsedotherintroductionothers(){
return this.usedotherintroductionothers;
}
private Integer activitystorefront;
public void setActivitystorefront(Integer activitystorefront){
this.activitystorefront = activitystorefront;
}
public Integer getActivitystorefront(){
return this.activitystorefront;
}
private Integer activityvisit;
public void setActivityvisit(Integer activityvisit){
this.activityvisit = activityvisit;
}
public Integer getActivityvisit(){
return this.activityvisit;
}
private Integer activityslc;
public void setActivityslc(Integer activityslc){
this.activityslc = activityslc;
}
public Integer getActivityslc(){
return this.activityslc;
}
private Integer activitymail;
public void setActivitymail(Integer activitymail){
this.activitymail = activitymail;
}
public Integer getActivitymail(){
return this.activitymail;
}
private Integer activitytel;
public void setActivitytel(Integer activitytel){
this.activitytel = activitytel;
}
public Integer getActivitytel(){
return this.activitytel;
}
private Integer customeractivitystorefront;
public void setCustomeractivitystorefront(Integer customeractivitystorefront){
this.customeractivitystorefront = customeractivitystorefront;
}
public Integer getCustomeractivitystorefront(){
return this.customeractivitystorefront;
}
private Integer customeractivityvisit;
public void setCustomeractivityvisit(Integer customeractivityvisit){
this.customeractivityvisit = customeractivityvisit;
}
public Integer getCustomeractivityvisit(){
return this.customeractivityvisit;
}
private Integer customeractivityslc;
public void setCustomeractivityslc(Integer customeractivityslc){
this.customeractivityslc = customeractivityslc;
}
public Integer getCustomeractivityslc(){
return this.customeractivityslc;
}
private Integer customeractivitymail;
public void setCustomeractivitymail(Integer customeractivitymail){
this.customeractivitymail = customeractivitymail;
}
public Integer getCustomeractivitymail(){
return this.customeractivitymail;
}
private Integer customeractivitytel;
public void setCustomeractivitytel(Integer customeractivitytel){
this.customeractivitytel = customeractivitytel;
}
public Integer getCustomeractivitytel(){
return this.customeractivitytel;
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
