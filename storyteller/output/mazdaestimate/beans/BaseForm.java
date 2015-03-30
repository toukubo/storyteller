package net.mazdaestimate.beans;
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
private Integer prefecture;
public void setPrefecture(Integer prefecture){
this.prefecture = prefecture;
}
public Integer getPrefecture(){
return this.prefecture;
}
private String memo;
public void setMemo(String memo){
this.memo = memo;
}
public String getMemo(){
return this.memo;
}
private int basecode;
public void setBasecode(int basecode){
this.basecode = basecode;
}
public int getBasecode(){
return this.basecode;
}
private boolean newcar;
public void setNewcar(boolean newcar){
this.newcar = newcar;
}
public boolean isNewcar(){
return this.newcar;
}
private boolean usedcar;
public void setUsedcar(boolean usedcar){
this.usedcar = usedcar;
}
public boolean isUsedcar(){
return this.usedcar;
}
private Integer block;
public void setBlock(Integer block){
this.block = block;
}
public Integer getBlock(){
return this.block;
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
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	newcar =false;
	usedcar =false;
}
}
