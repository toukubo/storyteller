package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SentenceForm
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
private boolean valid;
public void setValid(boolean valid){
this.valid = valid;
}
public boolean isValid(){
return this.valid;
}
private String strutsConfigCode;
public void setStrutsConfigCode(String strutsConfigCode){
this.strutsConfigCode = strutsConfigCode;
}
public String getStrutsConfigCode(){
return this.strutsConfigCode;
}
private Integer firstobjective;
public void setFirstobjective(Integer firstobjective){
this.firstobjective = firstobjective;
}
public Integer getFirstobjective(){
return this.firstobjective;
}
private Integer verb;
public void setVerb(Integer verb){
this.verb = verb;
}
public Integer getVerb(){
return this.verb;
}
private Integer secountobjective;
public void setSecountobjective(Integer secountobjective){
this.secountobjective = secountobjective;
}
public Integer getSecountobjective(){
return this.secountobjective;
}
private Integer j2eeStory;
public void setJ2eeStory(Integer j2eeStory){
this.j2eeStory = j2eeStory;
}
public Integer getJ2eeStory(){
return this.j2eeStory;
}
private String japanese;
public void setJapanese(String japanese){
this.japanese = japanese;
}
public String getJapanese(){
return this.japanese;
}
private Integer maintest;
public void setMaintest(Integer maintest){
this.maintest = maintest;
}
public Integer getMaintest(){
return this.maintest;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	valid =false;
}
}
