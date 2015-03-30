package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TestForm
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
private Integer j2eeStory;
public void setJ2eeStory(Integer j2eeStory){
this.j2eeStory = j2eeStory;
}
public Integer getJ2eeStory(){
return this.j2eeStory;
}
private Integer responsible;
public void setResponsible(Integer responsible){
this.responsible = responsible;
}
public Integer getResponsible(){
return this.responsible;
}
private String stepstorepeat;
public void setStepstorepeat(String stepstorepeat){
this.stepstorepeat = stepstorepeat;
}
public String getStepstorepeat(){
return this.stepstorepeat;
}
private String whatyouexpectedtosee;
public void setWhatyouexpectedtosee(String whatyouexpectedtosee){
this.whatyouexpectedtosee = whatyouexpectedtosee;
}
public String getWhatyouexpectedtosee(){
return this.whatyouexpectedtosee;
}
private String whatyousawinstead;
public void setWhatyousawinstead(String whatyousawinstead){
this.whatyousawinstead = whatyousawinstead;
}
public String getWhatyousawinstead(){
return this.whatyousawinstead;
}
private boolean debuged;
public void setDebuged(boolean debuged){
this.debuged = debuged;
}
public boolean isDebuged(){
return this.debuged;
}
private boolean checked;
public void setChecked(boolean checked){
this.checked = checked;
}
public boolean isChecked(){
return this.checked;
}
private Integer creator;
public void setCreator(Integer creator){
this.creator = creator;
}
public Integer getCreator(){
return this.creator;
}
private Integer debugger;
public void setDebugger(Integer debugger){
this.debugger = debugger;
}
public Integer getDebugger(){
return this.debugger;
}
private Integer jsp;
public void setJsp(Integer jsp){
this.jsp = jsp;
}
public Integer getJsp(){
return this.jsp;
}
private String summery;
public void setSummery(String summery){
this.summery = summery;
}
public String getSummery(){
return this.summery;
}
private Integer asnormal;
public void setAsnormal(Integer asnormal){
this.asnormal = asnormal;
}
public Integer getAsnormal(){
return this.asnormal;
}
private Integer asmain;
public void setAsmain(Integer asmain){
this.asmain = asmain;
}
public Integer getAsmain(){
return this.asmain;
}
private String modifiedpagetitle;
public void setModifiedpagetitle(String modifiedpagetitle){
this.modifiedpagetitle = modifiedpagetitle;
}
public String getModifiedpagetitle(){
return this.modifiedpagetitle;
}
private String modifiedpage;
public void setModifiedpage(String modifiedpage){
this.modifiedpage = modifiedpage;
}
public String getModifiedpage(){
return this.modifiedpage;
}
private String modifiedpagefilename;
public void setModifiedpagefilename(String modifiedpagefilename){
this.modifiedpagefilename = modifiedpagefilename;
}
public String getModifiedpagefilename(){
return this.modifiedpagefilename;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	debuged =false;
	checked =false;
}
}
