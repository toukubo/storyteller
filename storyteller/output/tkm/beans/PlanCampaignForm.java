package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PlanCampaignForm
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
private Integer plan;
public void setPlan(Integer plan){
this.plan = plan;
}
public Integer getPlan(){
return this.plan;
}
private Integer extraPoint;
public void setExtraPoint(Integer extraPoint){
this.extraPoint = extraPoint;
}
public Integer getExtraPoint(){
return this.extraPoint;
}
private Integer campaign;
public void setCampaign(Integer campaign){
this.campaign = campaign;
}
public Integer getCampaign(){
return this.campaign;
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
