package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NounUseForm
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
private boolean mutiple;
public void setMutiple(boolean mutiple){
this.mutiple = mutiple;
}
public boolean isMutiple(){
return this.mutiple;
}
private int oforder;
public void setOforder(int oforder){
this.oforder = oforder;
}
public int getOforder(){
return this.oforder;
}
private Integer noun;
public void setNoun(Integer noun){
this.noun = noun;
}
public Integer getNoun(){
return this.noun;
}
private Integer nounClause;
public void setNounClause(Integer nounClause){
this.nounClause = nounClause;
}
public Integer getNounClause(){
return this.nounClause;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	mutiple =false;
}
}
