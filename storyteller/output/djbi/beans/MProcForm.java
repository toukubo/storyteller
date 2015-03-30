package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MProcForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer rowId;
public void setRowId(Integer rowId){
this.rowId = rowId;
}
public Integer getRowId(){
return this.rowId;
}
private String dfltKbn;
public void setDfltKbn(String dfltKbn){
this.dfltKbn = dfltKbn;
}
public String getDfltKbn(){
return this.dfltKbn;
}
private String procKbn;
public void setProcKbn(String procKbn){
this.procKbn = procKbn;
}
public String getProcKbn(){
return this.procKbn;
}
private String procName;
public void setProcName(String procName){
this.procName = procName;
}
public String getProcName(){
return this.procName;
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
