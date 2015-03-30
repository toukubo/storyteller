package net.ars.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ApprovalForm
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
private Date approvaldate;
public void setApprovaldate(Date approvaldate){
this.approvaldate = approvaldate;
}
public Date getApprovaldate(){
return this.approvaldate;
}
private boolean approvaldateIsValid = false;
public void setApprovaldateIsValid(boolean approvaldateIsValid){
this.approvaldateIsValid = approvaldateIsValid;
}
public boolean isApprovaldateIsValid(){
return this.approvaldateIsValid;
}
private java.lang.String approvaldateAsRawString ="";
public java.lang.String getApprovaldateAsString(){
    return (approvaldate== null) ? null : format.format(approvaldate);
}
public void setApprovaldateAsString(java.lang.String approvaldate){
	this.approvaldateIsValid = true;
	this.approvaldateAsRawString = approvaldate;
try{
		if(StringUtils.isNotBlank(approvaldate)){ format.parse(approvaldate);}
}catch (java.text.ParseException pe){
this.approvaldateIsValid = false;
}
	if(approvaldateIsValid){
		try {
			this.approvaldate = (org.apache.commons.lang.StringUtils.isBlank(approvaldate)) ? null : format.parse(approvaldate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setApprovaldateAsRawString(java.lang.String approvaldate){
	this.approvaldateAsRawString = approvaldate;
}

public String getApprovaldateAsRawString(){
return this.approvaldateAsRawString;
}
private Integer accident;
public void setAccident(Integer accident){
this.accident = accident;
}
public Integer getAccident(){
return this.accident;
}
private Integer position;
public void setPosition(Integer position){
this.position = position;
}
public Integer getPosition(){
return this.position;
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
