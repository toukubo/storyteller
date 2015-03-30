package net.pmcsgml.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ChapterForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private boolean locked;
public void setLocked(boolean locked){
this.locked = locked;
}
public boolean isLocked(){
return this.locked;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer manual;
public void setManual(Integer manual){
this.manual = manual;
}
public Integer getManual(){
return this.manual;
}
private Integer chapterTemplate;
public void setChapterTemplate(Integer chapterTemplate){
this.chapterTemplate = chapterTemplate;
}
public Integer getChapterTemplate(){
return this.chapterTemplate;
}
private boolean unused;
public void setUnused(boolean unused){
this.unused = unused;
}
public boolean isUnused(){
return this.unused;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	locked =false;
	unused =false;
}
}
