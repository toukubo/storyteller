package net.craftclip.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MovieForm
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
private int soundFk;
public void setSoundFk(int soundFk){
this.soundFk = soundFk;
}
public int getSoundFk(){
return this.soundFk;
}
private String size;
public void setSize(String size){
this.size = size;
}
public String getSize(){
return this.size;
}
private String background;
public void setBackground(String background){
this.background = background;
}
public String getBackground(){
return this.background;
}
private int account_fk;
public void setAccount_fk(int account_fk){
this.account_fk = account_fk;
}
public int getAccount_fk(){
return this.account_fk;
}
private String status;
public void setStatus(String status){
this.status = status;
}
public String getStatus(){
return this.status;
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
