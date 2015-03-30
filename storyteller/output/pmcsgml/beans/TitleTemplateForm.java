package net.pmcsgml.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TitleTemplateForm
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
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
private String je;
public void setJe(String je){
this.je = je;
}
public String getJe(){
return this.je;
}
private Integer chapterTemplate;
public void setChapterTemplate(Integer chapterTemplate){
this.chapterTemplate = chapterTemplate;
}
public Integer getChapterTemplate(){
return this.chapterTemplate;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
}
}
