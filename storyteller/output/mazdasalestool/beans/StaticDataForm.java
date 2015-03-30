package net.mazdasalestool.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
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
private Integer termbasisnum;
public void setTermbasisnum(Integer termbasisnum){
this.termbasisnum = termbasisnum;
}
public Integer getTermbasisnum(){
return this.termbasisnum;
}
private Integer termbasisyear;
public void setTermbasisyear(Integer termbasisyear){
this.termbasisyear = termbasisyear;
}
public Integer getTermbasisyear(){
return this.termbasisyear;
}
private String winnerspointcomment;
public void setWinnerspointcomment(String winnerspointcomment){
this.winnerspointcomment = winnerspointcomment;
}
public String getWinnerspointcomment(){
return this.winnerspointcomment;
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
