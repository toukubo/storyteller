package net.gasbooknet.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NewsSourceForm
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
private String url;
public void setUrl(String url){
this.url = url;
}
public String getUrl(){
return this.url;
}
private String rssurl;
public void setRssurl(String rssurl){
this.rssurl = rssurl;
}
public String getRssurl(){
return this.rssurl;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private boolean original;
public void setOriginal(boolean original){
this.original = original;
}
public boolean isOriginal(){
return this.original;
}
private Integer partnerMedia;
public void setPartnerMedia(Integer partnerMedia){
this.partnerMedia = partnerMedia;
}
public Integer getPartnerMedia(){
return this.partnerMedia;
}
private Integer attachment;
public void setAttachment(Integer attachment){
this.attachment = attachment;
}
public Integer getAttachment(){
return this.attachment;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	original =false;
}
}
