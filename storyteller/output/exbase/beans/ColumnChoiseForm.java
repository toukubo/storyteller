package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ColumnChoiseForm
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
private int maxlength;
public void setMaxlength(int maxlength){
this.maxlength = maxlength;
}
public int getMaxlength(){
return this.maxlength;
}
private boolean displayed;
public void setDisplayed(boolean displayed){
this.displayed = displayed;
}
public boolean isDisplayed(){
return this.displayed;
}
private int excelsheetnum;
public void setExcelsheetnum(int excelsheetnum){
this.excelsheetnum = excelsheetnum;
}
public int getExcelsheetnum(){
return this.excelsheetnum;
}
private int excelrownum;
public void setExcelrownum(int excelrownum){
this.excelrownum = excelrownum;
}
public int getExcelrownum(){
return this.excelrownum;
}
private int excelcolumnnum;
public void setExcelcolumnnum(int excelcolumnnum){
this.excelcolumnnum = excelcolumnnum;
}
public int getExcelcolumnnum(){
return this.excelcolumnnum;
}
private int direction;
public void setDirection(int direction){
this.direction = direction;
}
public int getDirection(){
return this.direction;
}
private boolean update;
public void setUpdate(boolean update){
this.update = update;
}
public boolean isUpdate(){
return this.update;
}
private boolean updateflag;
public void setUpdateflag(boolean updateflag){
this.updateflag = updateflag;
}
public boolean isUpdateflag(){
return this.updateflag;
}
private boolean restriction;
public void setRestriction(boolean restriction){
this.restriction = restriction;
}
public boolean isRestriction(){
return this.restriction;
}
private boolean sorting;
public void setSorting(boolean sorting){
this.sorting = sorting;
}
public boolean isSorting(){
return this.sorting;
}
private boolean ascendant;
public void setAscendant(boolean ascendant){
this.ascendant = ascendant;
}
public boolean isAscendant(){
return this.ascendant;
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
private boolean deleted;
public void setDeleted(boolean deleted){
this.deleted = deleted;
}
public boolean isDeleted(){
return this.deleted;
}
private boolean special;
public void setSpecial(boolean special){
this.special = special;
}
public boolean isSpecial(){
return this.special;
}
private boolean mapped;
public void setMapped(boolean mapped){
this.mapped = mapped;
}
public boolean isMapped(){
return this.mapped;
}
private String updateMethod;
public void setUpdateMethod(String updateMethod){
this.updateMethod = updateMethod;
}
public String getUpdateMethod(){
return this.updateMethod;
}
private boolean usesUserId;
public void setUsesUserId(boolean usesUserId){
this.usesUserId = usesUserId;
}
public boolean isUsesUserId(){
return this.usesUserId;
}
private boolean usesUserDepartment;
public void setUsesUserDepartment(boolean usesUserDepartment){
this.usesUserDepartment = usesUserDepartment;
}
public boolean isUsesUserDepartment(){
return this.usesUserDepartment;
}
private int sortingPriority;
public void setSortingPriority(int sortingPriority){
this.sortingPriority = sortingPriority;
}
public int getSortingPriority(){
return this.sortingPriority;
}
private boolean pretruncate;
public void setPretruncate(boolean pretruncate){
this.pretruncate = pretruncate;
}
public boolean isPretruncate(){
return this.pretruncate;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	displayed =false;
	update =false;
	updateflag =false;
	restriction =false;
	sorting =false;
	ascendant =false;
	deleted =false;
	special =false;
	mapped =false;
	usesUserId =false;
	usesUserDepartment =false;
	pretruncate =false;
}
}
