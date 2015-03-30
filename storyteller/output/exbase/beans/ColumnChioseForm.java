package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ColumnChioseForm
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
private int maxlength;
public void setMaxlength(int maxlength){
this.maxlength = maxlength;
}
public int getMaxlength(){
return this.maxlength;
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
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	displayed =false;
}
}
