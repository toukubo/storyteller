package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class EstimationForm
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
private int totalcost;
public void setTotalcost(int totalcost){
this.totalcost = totalcost;
}
public int getTotalcost(){
return this.totalcost;
}
private Integer j2eeStory;
public void setJ2eeStory(Integer j2eeStory){
this.j2eeStory = j2eeStory;
}
public Integer getJ2eeStory(){
return this.j2eeStory;
}
private int totalprice;
public void setTotalprice(int totalprice){
this.totalprice = totalprice;
}
public int getTotalprice(){
return this.totalprice;
}
private boolean adapted;
public void setAdapted(boolean adapted){
this.adapted = adapted;
}
public boolean isAdapted(){
return this.adapted;
}
private int totalsentencenum;
public void setTotalsentencenum(int totalsentencenum){
this.totalsentencenum = totalsentencenum;
}
public int getTotalsentencenum(){
return this.totalsentencenum;
}
private int sentenceunit;
public void setSentenceunit(int sentenceunit){
this.sentenceunit = sentenceunit;
}
public int getSentenceunit(){
return this.sentenceunit;
}
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	adapted =false;
}
}
