package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ImprovementReportOfNewCarProfitForm
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
private Integer remianofacceptedlastmonth;
public void setRemianofacceptedlastmonth(Integer remianofacceptedlastmonth){
this.remianofacceptedlastmonth = remianofacceptedlastmonth;
}
public Integer getRemianofacceptedlastmonth(){
return this.remianofacceptedlastmonth;
}
private Integer remainofregistedlastmonth;
public void setRemainofregistedlastmonth(Integer remainofregistedlastmonth){
this.remainofregistedlastmonth = remainofregistedlastmonth;
}
public Integer getRemainofregistedlastmonth(){
return this.remainofregistedlastmonth;
}
private Integer numofaccepted;
public void setNumofaccepted(Integer numofaccepted){
this.numofaccepted = numofaccepted;
}
public Integer getNumofaccepted(){
return this.numofaccepted;
}
private Integer numofregisted;
public void setNumofregisted(Integer numofregisted){
this.numofregisted = numofregisted;
}
public Integer getNumofregisted(){
return this.numofregisted;
}
private Integer incentiveoflevelget;
public void setIncentiveoflevelget(Integer incentiveoflevelget){
this.incentiveoflevelget = incentiveoflevelget;
}
public Integer getIncentiveoflevelget(){
return this.incentiveoflevelget;
}
private Integer volumeaction;
public void setVolumeaction(Integer volumeaction){
this.volumeaction = volumeaction;
}
public Integer getVolumeaction(){
return this.volumeaction;
}
private Integer profitofnewcar;
public void setProfitofnewcar(Integer profitofnewcar){
this.profitofnewcar = profitofnewcar;
}
public Integer getProfitofnewcar(){
return this.profitofnewcar;
}
private Integer priceofmainnewcar;
public void setPriceofmainnewcar(Integer priceofmainnewcar){
this.priceofmainnewcar = priceofmainnewcar;
}
public Integer getPriceofmainnewcar(){
return this.priceofmainnewcar;
}
private Integer profitofmainnewcar;
public void setProfitofmainnewcar(Integer profitofmainnewcar){
this.profitofmainnewcar = profitofmainnewcar;
}
public Integer getProfitofmainnewcar(){
return this.profitofmainnewcar;
}
private Integer priceofwithoptionsnewcar;
public void setPriceofwithoptionsnewcar(Integer priceofwithoptionsnewcar){
this.priceofwithoptionsnewcar = priceofwithoptionsnewcar;
}
public Integer getPriceofwithoptionsnewcar(){
return this.priceofwithoptionsnewcar;
}
private Integer profitofwithoptionsnewcar;
public void setProfitofwithoptionsnewcar(Integer profitofwithoptionsnewcar){
this.profitofwithoptionsnewcar = profitofwithoptionsnewcar;
}
public Integer getProfitofwithoptionsnewcar(){
return this.profitofwithoptionsnewcar;
}
private Integer discountnewcar;
public void setDiscountnewcar(Integer discountnewcar){
this.discountnewcar = discountnewcar;
}
public Integer getDiscountnewcar(){
return this.discountnewcar;
}
private Integer chargeforregistnewcar;
public void setChargeforregistnewcar(Integer chargeforregistnewcar){
this.chargeforregistnewcar = chargeforregistnewcar;
}
public Integer getChargeforregistnewcar(){
return this.chargeforregistnewcar;
}
private Integer profitofcarnewcar;
public void setProfitofcarnewcar(Integer profitofcarnewcar){
this.profitofcarnewcar = profitofcarnewcar;
}
public Integer getProfitofcarnewcar(){
return this.profitofcarnewcar;
}
private Integer principalofcreditnewcar;
public void setPrincipalofcreditnewcar(Integer principalofcreditnewcar){
this.principalofcreditnewcar = principalofcreditnewcar;
}
public Integer getPrincipalofcreditnewcar(){
return this.principalofcreditnewcar;
}
private Integer profitofcreditnewcar;
public void setProfitofcreditnewcar(Integer profitofcreditnewcar){
this.profitofcreditnewcar = profitofcreditnewcar;
}
public Integer getProfitofcreditnewcar(){
return this.profitofcreditnewcar;
}
private Integer profitofsalesnewcar;
public void setProfitofsalesnewcar(Integer profitofsalesnewcar){
this.profitofsalesnewcar = profitofsalesnewcar;
}
public Integer getProfitofsalesnewcar(){
return this.profitofsalesnewcar;
}
private Integer actionsnewcar;
public void setActionsnewcar(Integer actionsnewcar){
this.actionsnewcar = actionsnewcar;
}
public Integer getActionsnewcar(){
return this.actionsnewcar;
}
private Integer marginalprofitnewcar;
public void setMarginalprofitnewcar(Integer marginalprofitnewcar){
this.marginalprofitnewcar = marginalprofitnewcar;
}
public Integer getMarginalprofitnewcar(){
return this.marginalprofitnewcar;
}
private Integer volumeactionnewcar;
public void setVolumeactionnewcar(Integer volumeactionnewcar){
this.volumeactionnewcar = volumeactionnewcar;
}
public Integer getVolumeactionnewcar(){
return this.volumeactionnewcar;
}
private Integer monthlyprofitnewcar;
public void setMonthlyprofitnewcar(Integer monthlyprofitnewcar){
this.monthlyprofitnewcar = monthlyprofitnewcar;
}
public Integer getMonthlyprofitnewcar(){
return this.monthlyprofitnewcar;
}
private Integer profitofusedcar;
public void setProfitofusedcar(Integer profitofusedcar){
this.profitofusedcar = profitofusedcar;
}
public Integer getProfitofusedcar(){
return this.profitofusedcar;
}
private Integer priceofmainusedcar;
public void setPriceofmainusedcar(Integer priceofmainusedcar){
this.priceofmainusedcar = priceofmainusedcar;
}
public Integer getPriceofmainusedcar(){
return this.priceofmainusedcar;
}
private Integer profitofmainusedcar;
public void setProfitofmainusedcar(Integer profitofmainusedcar){
this.profitofmainusedcar = profitofmainusedcar;
}
public Integer getProfitofmainusedcar(){
return this.profitofmainusedcar;
}
private Integer priceofwithoptionsusedcar;
public void setPriceofwithoptionsusedcar(Integer priceofwithoptionsusedcar){
this.priceofwithoptionsusedcar = priceofwithoptionsusedcar;
}
public Integer getPriceofwithoptionsusedcar(){
return this.priceofwithoptionsusedcar;
}
private Integer profitofwithoptionsusedcar;
public void setProfitofwithoptionsusedcar(Integer profitofwithoptionsusedcar){
this.profitofwithoptionsusedcar = profitofwithoptionsusedcar;
}
public Integer getProfitofwithoptionsusedcar(){
return this.profitofwithoptionsusedcar;
}
private Integer discountusedcar;
public void setDiscountusedcar(Integer discountusedcar){
this.discountusedcar = discountusedcar;
}
public Integer getDiscountusedcar(){
return this.discountusedcar;
}
private Integer chargesforregistusedcar;
public void setChargesforregistusedcar(Integer chargesforregistusedcar){
this.chargesforregistusedcar = chargesforregistusedcar;
}
public Integer getChargesforregistusedcar(){
return this.chargesforregistusedcar;
}
private Integer profitofcarusedcar;
public void setProfitofcarusedcar(Integer profitofcarusedcar){
this.profitofcarusedcar = profitofcarusedcar;
}
public Integer getProfitofcarusedcar(){
return this.profitofcarusedcar;
}
private Integer principalofcreditusedcar;
public void setPrincipalofcreditusedcar(Integer principalofcreditusedcar){
this.principalofcreditusedcar = principalofcreditusedcar;
}
public Integer getPrincipalofcreditusedcar(){
return this.principalofcreditusedcar;
}
private Integer profitofcreditusedcar;
public void setProfitofcreditusedcar(Integer profitofcreditusedcar){
this.profitofcreditusedcar = profitofcreditusedcar;
}
public Integer getProfitofcreditusedcar(){
return this.profitofcreditusedcar;
}
private Integer marginalprofitusedcar;
public void setMarginalprofitusedcar(Integer marginalprofitusedcar){
this.marginalprofitusedcar = marginalprofitusedcar;
}
public Integer getMarginalprofitusedcar(){
return this.marginalprofitusedcar;
}
private Integer costofrecover;
public void setCostofrecover(Integer costofrecover){
this.costofrecover = costofrecover;
}
public Integer getCostofrecover(){
return this.costofrecover;
}
private Integer monthlyprofitusedcar;
public void setMonthlyprofitusedcar(Integer monthlyprofitusedcar){
this.monthlyprofitusedcar = monthlyprofitusedcar;
}
public Integer getMonthlyprofitusedcar(){
return this.monthlyprofitusedcar;
}
private Integer month;
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
private Integer base;
public void setBase(Integer base){
this.base = base;
}
public Integer getBase(){
return this.base;
}
private Integer numofusedcars;
public void setNumofusedcars(Integer numofusedcars){
this.numofusedcars = numofusedcars;
}
public Integer getNumofusedcars(){
return this.numofusedcars;
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
