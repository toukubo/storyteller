package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class BaseForm
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
private String basename;
public void setBasename(String basename){
this.basename = basename;
}
public String getBasename(){
return this.basename;
}
private Integer basecode;
public void setBasecode(Integer basecode){
this.basecode = basecode;
}
public Integer getBasecode(){
return this.basecode;
}
private Boolean newcar;
public void setNewcar(Boolean newcar){
this.newcar = newcar;
}
public Boolean getNewcar(){
return this.newcar;
}
private Boolean usedcar;
public void setUsedcar(Boolean usedcar){
this.usedcar = usedcar;
}
public Boolean getUsedcar(){
return this.usedcar;
}
private String memo;
public void setMemo(String memo){
this.memo = memo;
}
public String getMemo(){
return this.memo;
}
private Integer prefecture;
public void setPrefecture(Integer prefecture){
this.prefecture = prefecture;
}
public Integer getPrefecture(){
return this.prefecture;
}
private Integer block;
public void setBlock(Integer block){
this.block = block;
}
public Integer getBlock(){
return this.block;
}
private Integer sortorder;
public void setSortorder(Integer sortorder){
this.sortorder = sortorder;
}
public Integer getSortorder(){
return this.sortorder;
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
