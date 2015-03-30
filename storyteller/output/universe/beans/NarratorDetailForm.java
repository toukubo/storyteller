package net.universe.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NarratorDetailForm
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
private String kana;
public void setKana(String kana){
this.kana = kana;
}
public String getKana(){
return this.kana;
}
private boolean male;
public void setMale(boolean male){
this.male = male;
}
public boolean isMale(){
return this.male;
}
private boolean deleted;
public void setDeleted(boolean deleted){
this.deleted = deleted;
}
public boolean isDeleted(){
return this.deleted;
}
private Integer narrator;
public void setNarrator(Integer narrator){
this.narrator = narrator;
}
public Integer getNarrator(){
return this.narrator;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer contractDetail;
public void setContractDetail(Integer contractDetail){
this.contractDetail = contractDetail;
}
public Integer getContractDetail(){
return this.contractDetail;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	male =false;
	deleted =false;
}
}
