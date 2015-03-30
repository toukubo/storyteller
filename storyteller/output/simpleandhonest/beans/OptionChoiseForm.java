package net.simpleandhonest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class OptionChoiseForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer option;
public void setOption(Integer option){
this.option = option;
}
public Integer getOption(){
return this.option;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer choise;
public void setChoise(Integer choise){
this.choise = choise;
}
public Integer getChoise(){
return this.choise;
}
private Integer optionItem;
public void setOptionItem(Integer optionItem){
this.optionItem = optionItem;
}
public Integer getOptionItem(){
return this.optionItem;
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
