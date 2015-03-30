package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaffForm
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
private Boolean cached;
public void setCached(Boolean cached){
this.cached = cached;
}
public Boolean getCached(){
return this.cached;
}
private Integer image;
public void setImage(Integer image){
this.image = image;
}
public Integer getImage(){
return this.image;
}
private String body;
public void setBody(String body){
this.body = body;
}
public String getBody(){
return this.body;
}
private Integer shopTheme;
public void setShopTheme(Integer shopTheme){
this.shopTheme = shopTheme;
}
public Integer getShopTheme(){
return this.shopTheme;
}
private String catchPhrase;
public void setCatchPhrase(String catchPhrase){
this.catchPhrase = catchPhrase;
}
public String getCatchPhrase(){
return this.catchPhrase;
}
private String nameKana;
public void setNameKana(String nameKana){
this.nameKana = nameKana;
}
public String getNameKana(){
return this.nameKana;
}
private String post;
public void setPost(String post){
this.post = post;
}
public String getPost(){
return this.post;
}
private Integer movie;
public void setMovie(Integer movie){
this.movie = movie;
}
public Integer getMovie(){
return this.movie;
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
