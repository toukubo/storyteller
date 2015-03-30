package net.gasaccounting.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class BuyingUnitForm
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
private Integer job;
public void setJob(Integer job){
this.job = job;
}
public Integer getJob(){
return this.job;
}
private int total;
public void setTotal(int total){
this.total = total;
}
public int getTotal(){
return this.total;
}
private int qty;
public void setQty(int qty){
this.qty = qty;
}
public int getQty(){
return this.qty;
}
private String purchasingcontent;
public void setPurchasingcontent(String purchasingcontent){
this.purchasingcontent = purchasingcontent;
}
public String getPurchasingcontent(){
return this.purchasingcontent;
}
private float taxamount;
public void setTaxamount(float taxamount){
this.taxamount = taxamount;
}
public float getTaxamount(){
return this.taxamount;
}
private float handpickedamount;
public void setHandpickedamount(float handpickedamount){
this.handpickedamount = handpickedamount;
}
public float getHandpickedamount(){
return this.handpickedamount;
}
private float pretaxamount;
public void setPretaxamount(float pretaxamount){
this.pretaxamount = pretaxamount;
}
public float getPretaxamount(){
return this.pretaxamount;
}
private Integer accountTitle;
public void setAccountTitle(Integer accountTitle){
this.accountTitle = accountTitle;
}
public Integer getAccountTitle(){
return this.accountTitle;
}
private float unitcost;
public void setUnitcost(float unitcost){
this.unitcost = unitcost;
}
public float getUnitcost(){
return this.unitcost;
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
