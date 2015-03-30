package net.estimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CategoryForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private Integer estimation;
public void setEstimation(Integer estimation){
this.estimation = estimation;
}
public Integer getEstimation(){
return this.estimation;
}
private int genka;
public void setGenka(int genka){
this.genka = genka;
}
public int getGenka(){
return this.genka;
}
private int contract;
public void setContract(int contract){
this.contract = contract;
}
public int getContract(){
return this.contract;
}
private int arari;
public void setArari(int arari){
this.arari = arari;
}
public int getArari(){
return this.arari;
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
