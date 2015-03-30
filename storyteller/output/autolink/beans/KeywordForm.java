package net.autolink.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class KeywordForm
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
private String slug;
public void setSlug(String slug){
this.slug = slug;
}
public String getSlug(){
return this.slug;
}
private String permalink;
public void setPermalink(String permalink){
this.permalink = permalink;
}
public String getPermalink(){
return this.permalink;
}
private String haspage;
public void setHaspage(String haspage){
this.haspage = haspage;
}
public String getHaspage(){
return this.haspage;
}
private String value;
public void setValue(String value){
this.value = value;
}
public String getValue(){
return this.value;
}
private boolean useAsKeyword;
public void setUseAsKeyword(boolean useAsKeyword){
this.useAsKeyword = useAsKeyword;
}
public boolean isUseAsKeyword(){
return this.useAsKeyword;
}
private boolean candidate;
public void setCandidate(boolean candidate){
this.candidate = candidate;
}
public boolean isCandidate(){
return this.candidate;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	useAsKeyword =false;
	candidate =false;
}
}
