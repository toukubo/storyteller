package net.gasweb.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ContractForm
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
private Integer product;
public void setProduct(Integer product){
this.product = product;
}
public Integer getProduct(){
return this.product;
}
private Integer artist;
public void setArtist(Integer artist){
this.artist = artist;
}
public Integer getArtist(){
return this.artist;
}
private Integer organization;
public void setOrganization(Integer organization){
this.organization = organization;
}
public Integer getOrganization(){
return this.organization;
}
private String contracttype;
public void setContracttype(String contracttype){
this.contracttype = contracttype;
}
public String getContracttype(){
return this.contracttype;
}
private String paymentcondition;
public void setPaymentcondition(String paymentcondition){
this.paymentcondition = paymentcondition;
}
public String getPaymentcondition(){
return this.paymentcondition;
}
private boolean outbound;
public void setOutbound(boolean outbound){
this.outbound = outbound;
}
public boolean isOutbound(){
return this.outbound;
}
private float royalty;
public void setRoyalty(float royalty){
this.royalty = royalty;
}
public float getRoyalty(){
return this.royalty;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	outbound =false;
}
}
