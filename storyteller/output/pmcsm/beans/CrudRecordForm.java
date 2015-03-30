package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CrudRecordForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String attribute;
public void setAttribute(String attribute){
this.attribute = attribute;
}
public String getAttribute(){
return this.attribute;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String modelname;
public void setModelname(String modelname){
this.modelname = modelname;
}
public String getModelname(){
return this.modelname;
}
private boolean c;
public void setC(boolean c){
this.c = c;
}
public boolean isC(){
return this.c;
}
private boolean d;
public void setD(boolean d){
this.d = d;
}
public boolean isD(){
return this.d;
}
private boolean u;
public void setU(boolean u){
this.u = u;
}
public boolean isU(){
return this.u;
}
private Integer modification;
public void setModification(Integer modification){
this.modification = modification;
}
public Integer getModification(){
return this.modification;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	c =false;
	d =false;
	u =false;
}
}
