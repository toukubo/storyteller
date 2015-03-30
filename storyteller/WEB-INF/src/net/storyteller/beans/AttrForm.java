package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AttrForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer noun;
public void setNoun(Integer noun){
this.noun = noun;
}
public Integer getNoun(){
return this.noun;
}
private String japanese;
public void setJapanese(String japanese){
this.japanese = japanese;
}
public String getJapanese(){
return this.japanese;
}
private String classtype;
public void setClasstype(String classtype){
this.classtype = classtype;
}
public String getClasstype(){
return this.classtype;
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
