package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SummeryOfProductslOfAMonthAboutSalesForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private int month;
public void setMonth(int month){
this.month = month;
}
public int getMonth(){
return this.month;
}
private int year;
public void setYear(int year){
this.year = year;
}
public int getYear(){
return this.year;
}
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private int icpage;
public void setIcpage(int icpage){
this.icpage = icpage;
}
public int getIcpage(){
return this.icpage;
}
private int normalsalesnum;
public void setNormalsalesnum(int normalsalesnum){
this.normalsalesnum = normalsalesnum;
}
public int getNormalsalesnum(){
return this.normalsalesnum;
}
private int icnum;
public void setIcnum(int icnum){
this.icnum = icnum;
}
public int getIcnum(){
return this.icnum;
}
private int webnum;
public void setWebnum(int webnum){
this.webnum = webnum;
}
public int getWebnum(){
return this.webnum;
}
private int totalnum;
public void setTotalnum(int totalnum){
this.totalnum = totalnum;
}
public int getTotalnum(){
return this.totalnum;
}
private int normalsmpage;
public void setNormalsmpage(int normalsmpage){
this.normalsmpage = normalsmpage;
}
public int getNormalsmpage(){
return this.normalsmpage;
}
private int webpage;
public void setWebpage(int webpage){
this.webpage = webpage;
}
public int getWebpage(){
return this.webpage;
}
private int totalpage;
public void setTotalpage(int totalpage){
this.totalpage = totalpage;
}
public int getTotalpage(){
return this.totalpage;
}
private int normaleditproduction;
public void setNormaleditproduction(int normaleditproduction){
this.normaleditproduction = normaleditproduction;
}
public int getNormaleditproduction(){
return this.normaleditproduction;
}
private int iceditproduction;
public void setIceditproduction(int iceditproduction){
this.iceditproduction = iceditproduction;
}
public int getIceditproduction(){
return this.iceditproduction;
}
private int webeditproduction;
public void setWebeditproduction(int webeditproduction){
this.webeditproduction = webeditproduction;
}
public int getWebeditproduction(){
return this.webeditproduction;
}
private int totaleditproduction;
public void setTotaleditproduction(int totaleditproduction){
this.totaleditproduction = totaleditproduction;
}
public int getTotaleditproduction(){
return this.totaleditproduction;
}
private int normalpayment;
public void setNormalpayment(int normalpayment){
this.normalpayment = normalpayment;
}
public int getNormalpayment(){
return this.normalpayment;
}
private int icpayment;
public void setIcpayment(int icpayment){
this.icpayment = icpayment;
}
public int getIcpayment(){
return this.icpayment;
}
private int webpayment;
public void setWebpayment(int webpayment){
this.webpayment = webpayment;
}
public int getWebpayment(){
return this.webpayment;
}
private int totalpayment;
public void setTotalpayment(int totalpayment){
this.totalpayment = totalpayment;
}
public int getTotalpayment(){
return this.totalpayment;
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
