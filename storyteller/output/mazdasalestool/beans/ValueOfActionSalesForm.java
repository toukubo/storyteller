package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ValueOfActionSalesForm
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
private Integer price;
public void setPrice(Integer price){
this.price = price;
}
public Integer getPrice(){
return this.price;
}
private Integer profitReportOfNewCar;
public void setProfitReportOfNewCar(Integer profitReportOfNewCar){
this.profitReportOfNewCar = profitReportOfNewCar;
}
public Integer getProfitReportOfNewCar(){
return this.profitReportOfNewCar;
}
private Integer actionForSales;
public void setActionForSales(Integer actionForSales){
this.actionForSales = actionForSales;
}
public Integer getActionForSales(){
return this.actionForSales;
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
