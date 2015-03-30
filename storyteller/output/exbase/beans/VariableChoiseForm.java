package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class VariableChoiseForm
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
private Integer excelTemplate;
public void setExcelTemplate(Integer excelTemplate){
this.excelTemplate = excelTemplate;
}
public Integer getExcelTemplate(){
return this.excelTemplate;
}
private Integer columnDefinition;
public void setColumnDefinition(Integer columnDefinition){
this.columnDefinition = columnDefinition;
}
public Integer getColumnDefinition(){
return this.columnDefinition;
}
private String restrictionOperator;
public void setRestrictionOperator(String restrictionOperator){
this.restrictionOperator = restrictionOperator;
}
public String getRestrictionOperator(){
return this.restrictionOperator;
}
private String restrictionValue;
public void setRestrictionValue(String restrictionValue){
this.restrictionValue = restrictionValue;
}
public String getRestrictionValue(){
return this.restrictionValue;
}
private Integer restrictedColumnDefinition;
public void setRestrictedColumnDefinition(Integer restrictedColumnDefinition){
this.restrictedColumnDefinition = restrictedColumnDefinition;
}
public Integer getRestrictedColumnDefinition(){
return this.restrictedColumnDefinition;
}
private Integer labelColumnDefinition;
public void setLabelColumnDefinition(Integer labelColumnDefinition){
this.labelColumnDefinition = labelColumnDefinition;
}
public Integer getLabelColumnDefinition(){
return this.labelColumnDefinition;
}
private Integer optionColumnDefinition;
public void setOptionColumnDefinition(Integer optionColumnDefinition){
this.optionColumnDefinition = optionColumnDefinition;
}
public Integer getOptionColumnDefinition(){
return this.optionColumnDefinition;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
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
