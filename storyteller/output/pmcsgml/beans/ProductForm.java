package net.pmcsgml.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ProductForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private boolean parent;
public void setParent(boolean parent){
this.parent = parent;
}
public boolean isParent(){
return this.parent;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private Integer manual;
public void setManual(Integer manual){
this.manual = manual;
}
public Integer getManual(){
return this.manual;
}
private String modelcode;
public void setModelcode(String modelcode){
this.modelcode = modelcode;
}
public String getModelcode(){
return this.modelcode;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String filename;
public void setFilename(String filename){
this.filename = filename;
}
public String getFilename(){
return this.filename;
}
private String typename;
public void setTypename(String typename){
this.typename = typename;
}
public String getTypename(){
return this.typename;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String shimuke;
public void setShimuke(String shimuke){
this.shimuke = shimuke;
}
public String getShimuke(){
return this.shimuke;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	parent =false;
}
}
