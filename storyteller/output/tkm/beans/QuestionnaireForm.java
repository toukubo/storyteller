package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class QuestionnaireForm
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
private Integer reservation;
public void setReservation(Integer reservation){
this.reservation = reservation;
}
public Integer getReservation(){
return this.reservation;
}
private Integer siteUserbility;
public void setSiteUserbility(Integer siteUserbility){
this.siteUserbility = siteUserbility;
}
public Integer getSiteUserbility(){
return this.siteUserbility;
}
private String siteUserbilityReason;
public void setSiteUserbilityReason(String siteUserbilityReason){
this.siteUserbilityReason = siteUserbilityReason;
}
public String getSiteUserbilityReason(){
return this.siteUserbilityReason;
}
private String functionDemand;
public void setFunctionDemand(String functionDemand){
this.functionDemand = functionDemand;
}
public String getFunctionDemand(){
return this.functionDemand;
}
private Integer foodSatisfaction;
public void setFoodSatisfaction(Integer foodSatisfaction){
this.foodSatisfaction = foodSatisfaction;
}
public Integer getFoodSatisfaction(){
return this.foodSatisfaction;
}
private Integer atmosphereSatisfaction;
public void setAtmosphereSatisfaction(Integer atmosphereSatisfaction){
this.atmosphereSatisfaction = atmosphereSatisfaction;
}
public Integer getAtmosphereSatisfaction(){
return this.atmosphereSatisfaction;
}
private Integer serviceSatisfaction;
public void setServiceSatisfaction(Integer serviceSatisfaction){
this.serviceSatisfaction = serviceSatisfaction;
}
public Integer getServiceSatisfaction(){
return this.serviceSatisfaction;
}
private Integer priceSatisfaction;
public void setPriceSatisfaction(Integer priceSatisfaction){
this.priceSatisfaction = priceSatisfaction;
}
public Integer getPriceSatisfaction(){
return this.priceSatisfaction;
}
private String concreteReason;
public void setConcreteReason(String concreteReason){
this.concreteReason = concreteReason;
}
public String getConcreteReason(){
return this.concreteReason;
}
private String commentForShop;
public void setCommentForShop(String commentForShop){
this.commentForShop = commentForShop;
}
public String getCommentForShop(){
return this.commentForShop;
}
private String recommendedShop;
public void setRecommendedShop(String recommendedShop){
this.recommendedShop = recommendedShop;
}
public String getRecommendedShop(){
return this.recommendedShop;
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
