package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExhibitionIntraUserForm
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
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private int dm;
public void setDm(int dm){
this.dm = dm;
}
public int getDm(){
return this.dm;
}
private int tc;
public void setTc(int tc){
this.tc = tc;
}
public int getTc(){
return this.tc;
}
private int visitaffirmation;
public void setVisitaffirmation(int visitaffirmation){
this.visitaffirmation = visitaffirmation;
}
public int getVisitaffirmation(){
return this.visitaffirmation;
}
private int customerabaffirmationvisit;
public void setCustomerabaffirmationvisit(int customerabaffirmationvisit){
this.customerabaffirmationvisit = customerabaffirmationvisit;
}
public int getCustomerabaffirmationvisit(){
return this.customerabaffirmationvisit;
}
private int customerabnonaffirmationvisit;
public void setCustomerabnonaffirmationvisit(int customerabnonaffirmationvisit){
this.customerabnonaffirmationvisit = customerabnonaffirmationvisit;
}
public int getCustomerabnonaffirmationvisit(){
return this.customerabnonaffirmationvisit;
}
private int customernonabaffirmationvisit;
public void setCustomernonabaffirmationvisit(int customernonabaffirmationvisit){
this.customernonabaffirmationvisit = customernonabaffirmationvisit;
}
public int getCustomernonabaffirmationvisit(){
return this.customernonabaffirmationvisit;
}
private int customernonabnonaffirmationvisit;
public void setCustomernonabnonaffirmationvisit(int customernonabnonaffirmationvisit){
this.customernonabnonaffirmationvisit = customernonabnonaffirmationvisit;
}
public int getCustomernonabnonaffirmationvisit(){
return this.customernonabnonaffirmationvisit;
}
private int customernonabfreevisit;
public void setCustomernonabfreevisit(int customernonabfreevisit){
this.customernonabfreevisit = customernonabfreevisit;
}
public int getCustomernonabfreevisit(){
return this.customernonabfreevisit;
}
private int demo;
public void setDemo(int demo){
this.demo = demo;
}
public int getDemo(){
return this.demo;
}
private int engenderabhotcustomer;
public void setEngenderabhotcustomer(int engenderabhotcustomer){
this.engenderabhotcustomer = engenderabhotcustomer;
}
public int getEngenderabhotcustomer(){
return this.engenderabhotcustomer;
}
private int engenderabhotstock;
public void setEngenderabhotstock(int engenderabhotstock){
this.engenderabhotstock = engenderabhotstock;
}
public int getEngenderabhotstock(){
return this.engenderabhotstock;
}
private int engenderabhotfree;
public void setEngenderabhotfree(int engenderabhotfree){
this.engenderabhotfree = engenderabhotfree;
}
public int getEngenderabhotfree(){
return this.engenderabhotfree;
}
private int orderedcarsabcustomer;
public void setOrderedcarsabcustomer(int orderedcarsabcustomer){
this.orderedcarsabcustomer = orderedcarsabcustomer;
}
public int getOrderedcarsabcustomer(){
return this.orderedcarsabcustomer;
}
private int orderedcarsabnewother;
public void setOrderedcarsabnewother(int orderedcarsabnewother){
this.orderedcarsabnewother = orderedcarsabnewother;
}
public int getOrderedcarsabnewother(){
return this.orderedcarsabnewother;
}
private int orderedcarsnonabcustomer;
public void setOrderedcarsnonabcustomer(int orderedcarsnonabcustomer){
this.orderedcarsnonabcustomer = orderedcarsnonabcustomer;
}
public int getOrderedcarsnonabcustomer(){
return this.orderedcarsnonabcustomer;
}
private int orderedcarsnonabstock;
public void setOrderedcarsnonabstock(int orderedcarsnonabstock){
this.orderedcarsnonabstock = orderedcarsnonabstock;
}
public int getOrderedcarsnonabstock(){
return this.orderedcarsnonabstock;
}
private int orderedcarsnonabfree;
public void setOrderedcarsnonabfree(int orderedcarsnonabfree){
this.orderedcarsnonabfree = orderedcarsnonabfree;
}
public int getOrderedcarsnonabfree(){
return this.orderedcarsnonabfree;
}
private Integer exhibition;
public void setExhibition(Integer exhibition){
this.exhibition = exhibition;
}
public Integer getExhibition(){
return this.exhibition;
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
