package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class M_MkrForm
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
private String mkrCd;
public void setMkrCd(String mkrCd){
this.mkrCd = mkrCd;
}
public String getMkrCd(){
return this.mkrCd;
}
private String repMkrCd;
public void setRepMkrCd(String repMkrCd){
this.repMkrCd = repMkrCd;
}
public String getRepMkrCd(){
return this.repMkrCd;
}
private String mkrNm;
public void setMkrNm(String mkrNm){
this.mkrNm = mkrNm;
}
public String getMkrNm(){
return this.mkrNm;
}
private String mkrKana;
public void setMkrKana(String mkrKana){
this.mkrKana = mkrKana;
}
public String getMkrKana(){
return this.mkrKana;
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
