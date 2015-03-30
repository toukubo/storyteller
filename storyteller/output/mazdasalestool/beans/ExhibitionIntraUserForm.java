package net.mazdasalestool.beans;
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
private Integer dm;
public void setDm(Integer dm){
this.dm = dm;
}
public Integer getDm(){
return this.dm;
}
private Integer tc;
public void setTc(Integer tc){
this.tc = tc;
}
public Integer getTc(){
return this.tc;
}
private Integer visitaffirmation;
public void setVisitaffirmation(Integer visitaffirmation){
this.visitaffirmation = visitaffirmation;
}
public Integer getVisitaffirmation(){
return this.visitaffirmation;
}
private Integer customerabaffirmationvisit;
public void setCustomerabaffirmationvisit(Integer customerabaffirmationvisit){
this.customerabaffirmationvisit = customerabaffirmationvisit;
}
public Integer getCustomerabaffirmationvisit(){
return this.customerabaffirmationvisit;
}
private Integer customerabnonaffirmationvisit;
public void setCustomerabnonaffirmationvisit(Integer customerabnonaffirmationvisit){
this.customerabnonaffirmationvisit = customerabnonaffirmationvisit;
}
public Integer getCustomerabnonaffirmationvisit(){
return this.customerabnonaffirmationvisit;
}
private Integer customernonabaffirmationvisit;
public void setCustomernonabaffirmationvisit(Integer customernonabaffirmationvisit){
this.customernonabaffirmationvisit = customernonabaffirmationvisit;
}
public Integer getCustomernonabaffirmationvisit(){
return this.customernonabaffirmationvisit;
}
private Integer customernonabnonaffirmationvisit;
public void setCustomernonabnonaffirmationvisit(Integer customernonabnonaffirmationvisit){
this.customernonabnonaffirmationvisit = customernonabnonaffirmationvisit;
}
public Integer getCustomernonabnonaffirmationvisit(){
return this.customernonabnonaffirmationvisit;
}
private Integer customernonabfreevisit;
public void setCustomernonabfreevisit(Integer customernonabfreevisit){
this.customernonabfreevisit = customernonabfreevisit;
}
public Integer getCustomernonabfreevisit(){
return this.customernonabfreevisit;
}
private Integer demo;
public void setDemo(Integer demo){
this.demo = demo;
}
public Integer getDemo(){
return this.demo;
}
private Integer engenderabhotcustomer;
public void setEngenderabhotcustomer(Integer engenderabhotcustomer){
this.engenderabhotcustomer = engenderabhotcustomer;
}
public Integer getEngenderabhotcustomer(){
return this.engenderabhotcustomer;
}
private Integer engenderabhotstock;
public void setEngenderabhotstock(Integer engenderabhotstock){
this.engenderabhotstock = engenderabhotstock;
}
public Integer getEngenderabhotstock(){
return this.engenderabhotstock;
}
private Integer engenderabhotfree;
public void setEngenderabhotfree(Integer engenderabhotfree){
this.engenderabhotfree = engenderabhotfree;
}
public Integer getEngenderabhotfree(){
return this.engenderabhotfree;
}
private Integer orderedcarsabcustomer;
public void setOrderedcarsabcustomer(Integer orderedcarsabcustomer){
this.orderedcarsabcustomer = orderedcarsabcustomer;
}
public Integer getOrderedcarsabcustomer(){
return this.orderedcarsabcustomer;
}
private Integer orderedcarsabnewother;
public void setOrderedcarsabnewother(Integer orderedcarsabnewother){
this.orderedcarsabnewother = orderedcarsabnewother;
}
public Integer getOrderedcarsabnewother(){
return this.orderedcarsabnewother;
}
private Integer orderedcarsnonabcustomer;
public void setOrderedcarsnonabcustomer(Integer orderedcarsnonabcustomer){
this.orderedcarsnonabcustomer = orderedcarsnonabcustomer;
}
public Integer getOrderedcarsnonabcustomer(){
return this.orderedcarsnonabcustomer;
}
private Integer orderedcarsnonabstock;
public void setOrderedcarsnonabstock(Integer orderedcarsnonabstock){
this.orderedcarsnonabstock = orderedcarsnonabstock;
}
public Integer getOrderedcarsnonabstock(){
return this.orderedcarsnonabstock;
}
private Integer orderedcarsnonabfree;
public void setOrderedcarsnonabfree(Integer orderedcarsnonabfree){
this.orderedcarsnonabfree = orderedcarsnonabfree;
}
public Integer getOrderedcarsnonabfree(){
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
