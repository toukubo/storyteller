package net.startbahn.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MpaMarkingForm
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
private boolean actual;
public void setActual(boolean actual){
this.actual = actual;
}
public boolean isActual(){
return this.actual;
}
private String markmodel;
public void setMarkmodel(String markmodel){
this.markmodel = markmodel;
}
public String getMarkmodel(){
return this.markmodel;
}
private Integer mpamarkerid;
public void setMpamarkerid(Integer mpamarkerid){
this.mpamarkerid = mpamarkerid;
}
public Integer getMpamarkerid(){
return this.mpamarkerid;
}
private String mpamarkeemodel;
public void setMpamarkeemodel(String mpamarkeemodel){
this.mpamarkeemodel = mpamarkeemodel;
}
public String getMpamarkeemodel(){
return this.mpamarkeemodel;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private Integer artist;
public void setArtist(Integer artist){
this.artist = artist;
}
public Integer getArtist(){
return this.artist;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	actual =false;
}
}
