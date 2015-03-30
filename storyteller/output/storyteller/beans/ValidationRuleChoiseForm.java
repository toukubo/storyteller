package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ValidationRuleChoiseForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String actualcode;
public void setActualcode(String actualcode){
this.actualcode = actualcode;
}
public String getActualcode(){
return this.actualcode;
}
private String errormessage;
public void setErrormessage(String errormessage){
this.errormessage = errormessage;
}
public String getErrormessage(){
return this.errormessage;
}
private Integer attrUse;
public void setAttrUse(Integer attrUse){
this.attrUse = attrUse;
}
public Integer getAttrUse(){
return this.attrUse;
}
private Integer validationRule;
public void setValidationRule(Integer validationRule){
this.validationRule = validationRule;
}
public Integer getValidationRule(){
return this.validationRule;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
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
