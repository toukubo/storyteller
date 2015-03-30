package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CarForm
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
private String groupname;
public void setGroupname(String groupname){
this.groupname = groupname;
}
public String getGroupname(){
return this.groupname;
}
private Integer salescost;
public void setSalescost(Integer salescost){
this.salescost = salescost;
}
public Integer getSalescost(){
return this.salescost;
}
private Boolean lightcar;
public void setLightcar(Boolean lightcar){
this.lightcar = lightcar;
}
public Boolean getLightcar(){
return this.lightcar;
}
private Integer sortorder;
public void setSortorder(Integer sortorder){
this.sortorder = sortorder;
}
public Integer getSortorder(){
return this.sortorder;
}
private String shortcarline;
public void setShortcarline(String shortcarline){
this.shortcarline = shortcarline;
}
public String getShortcarline(){
return this.shortcarline;
}
private Boolean bussinesscar;
public void setBussinesscar(Boolean bussinesscar){
this.bussinesscar = bussinesscar;
}
public Boolean getBussinesscar(){
return this.bussinesscar;
}
private Integer groupOfCarLine;
public void setGroupOfCarLine(Integer groupOfCarLine){
this.groupOfCarLine = groupOfCarLine;
}
public Integer getGroupOfCarLine(){
return this.groupOfCarLine;
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
