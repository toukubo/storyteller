package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TargetValueByGroupOfCarLineForm
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
private Integer groupOfCarLine;
public void setGroupOfCarLine(Integer groupOfCarLine){
this.groupOfCarLine = groupOfCarLine;
}
public Integer getGroupOfCarLine(){
return this.groupOfCarLine;
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
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
