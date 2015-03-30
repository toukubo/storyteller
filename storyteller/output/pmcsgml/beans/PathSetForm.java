package net.pmcsgml.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PathSetForm
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
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private Integer chapter;
public void setChapter(Integer chapter){
this.chapter = chapter;
}
public Integer getChapter(){
return this.chapter;
}
private Integer partslistpath;
public void setPartslistpath(Integer partslistpath){
this.partslistpath = partslistpath;
}
public Integer getPartslistpath(){
return this.partslistpath;
}
private Integer illustrationpath;
public void setIllustrationpath(Integer illustrationpath){
this.illustrationpath = illustrationpath;
}
public Integer getIllustrationpath(){
return this.illustrationpath;
}
private Integer cnstpath;
public void setCnstpath(Integer cnstpath){
this.cnstpath = cnstpath;
}
public Integer getCnstpath(){
return this.cnstpath;
}
private Integer langpath;
public void setLangpath(Integer langpath){
this.langpath = langpath;
}
public Integer getLangpath(){
return this.langpath;
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
