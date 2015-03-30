package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
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
private String documentArrivedReportTemplate;
public void setDocumentArrivedReportTemplate(String documentArrivedReportTemplate){
this.documentArrivedReportTemplate = documentArrivedReportTemplate;
}
public String getDocumentArrivedReportTemplate(){
return this.documentArrivedReportTemplate;
}
private String documentRequestTemplate;
public void setDocumentRequestTemplate(String documentRequestTemplate){
this.documentRequestTemplate = documentRequestTemplate;
}
public String getDocumentRequestTemplate(){
return this.documentRequestTemplate;
}
private String inforssurl;
public void setInforssurl(String inforssurl){
this.inforssurl = inforssurl;
}
public String getInforssurl(){
return this.inforssurl;
}
private String reportmail;
public void setReportmail(String reportmail){
this.reportmail = reportmail;
}
public String getReportmail(){
return this.reportmail;
}
private int crtmax;
public void setCrtmax(int crtmax){
this.crtmax = crtmax;
}
public int getCrtmax(){
return this.crtmax;
}
private int arpmax;
public void setArpmax(int arpmax){
this.arpmax = arpmax;
}
public int getArpmax(){
return this.arpmax;
}
private int rrvmax;
public void setRrvmax(int rrvmax){
this.rrvmax = rrvmax;
}
public int getRrvmax(){
return this.rrvmax;
}
private int smdzeromax;
public void setSmdzeromax(int smdzeromax){
this.smdzeromax = smdzeromax;
}
public int getSmdzeromax(){
return this.smdzeromax;
}
private int smdtwomax;
public void setSmdtwomax(int smdtwomax){
this.smdtwomax = smdtwomax;
}
public int getSmdtwomax(){
return this.smdtwomax;
}
private int smdsixmax;
public void setSmdsixmax(int smdsixmax){
this.smdsixmax = smdsixmax;
}
public int getSmdsixmax(){
return this.smdsixmax;
}
private int kurumitanka;
public void setKurumitanka(int kurumitanka){
this.kurumitanka = kurumitanka;
}
public int getKurumitanka(){
return this.kurumitanka;
}
private int printtanka;
public void setPrinttanka(int printtanka){
this.printtanka = printtanka;
}
public int getPrinttanka(){
return this.printtanka;
}
private int webtanka;
public void setWebtanka(int webtanka){
this.webtanka = webtanka;
}
public int getWebtanka(){
return this.webtanka;
}
private int smdeightmax;
public void setSmdeightmax(int smdeightmax){
this.smdeightmax = smdeightmax;
}
public int getSmdeightmax(){
return this.smdeightmax;
}
private int trtmax;
public void setTrtmax(int trtmax){
this.trtmax = trtmax;
}
public int getTrtmax(){
return this.trtmax;
}
private String smtphostname;
public void setSmtphostname(String smtphostname){
this.smtphostname = smtphostname;
}
public String getSmtphostname(){
return this.smtphostname;
}
private int currentyearforsmdzero;
public void setCurrentyearforsmdzero(int currentyearforsmdzero){
this.currentyearforsmdzero = currentyearforsmdzero;
}
public int getCurrentyearforsmdzero(){
return this.currentyearforsmdzero;
}
private int currentyearforsmdtwo;
public void setCurrentyearforsmdtwo(int currentyearforsmdtwo){
this.currentyearforsmdtwo = currentyearforsmdtwo;
}
public int getCurrentyearforsmdtwo(){
return this.currentyearforsmdtwo;
}
private int currentyearforsmdsix;
public void setCurrentyearforsmdsix(int currentyearforsmdsix){
this.currentyearforsmdsix = currentyearforsmdsix;
}
public int getCurrentyearforsmdsix(){
return this.currentyearforsmdsix;
}
private int currentyearforsmdeight;
public void setCurrentyearforsmdeight(int currentyearforsmdeight){
this.currentyearforsmdeight = currentyearforsmdeight;
}
public int getCurrentyearforsmdeight(){
return this.currentyearforsmdeight;
}
private String sgmlurl;
public void setSgmlurl(String sgmlurl){
this.sgmlurl = sgmlurl;
}
public String getSgmlurl(){
return this.sgmlurl;
}
private int currentrefno;
public void setCurrentrefno(int currentrefno){
this.currentrefno = currentrefno;
}
public int getCurrentrefno(){
return this.currentrefno;
}
private int totalpagenuminpreviousexecution;
public void setTotalpagenuminpreviousexecution(int totalpagenuminpreviousexecution){
this.totalpagenuminpreviousexecution = totalpagenuminpreviousexecution;
}
public int getTotalpagenuminpreviousexecution(){
return this.totalpagenuminpreviousexecution;
}
private int totalpaymentinpreviousexecution;
public void setTotalpaymentinpreviousexecution(int totalpaymentinpreviousexecution){
this.totalpaymentinpreviousexecution = totalpaymentinpreviousexecution;
}
public int getTotalpaymentinpreviousexecution(){
return this.totalpaymentinpreviousexecution;
}
private int firsthalfpagenuminpreviousexecution;
public void setFirsthalfpagenuminpreviousexecution(int firsthalfpagenuminpreviousexecution){
this.firsthalfpagenuminpreviousexecution = firsthalfpagenuminpreviousexecution;
}
public int getFirsthalfpagenuminpreviousexecution(){
return this.firsthalfpagenuminpreviousexecution;
}
private int firsthalfpaymentinpreviousexecution;
public void setFirsthalfpaymentinpreviousexecution(int firsthalfpaymentinpreviousexecution){
this.firsthalfpaymentinpreviousexecution = firsthalfpaymentinpreviousexecution;
}
public int getFirsthalfpaymentinpreviousexecution(){
return this.firsthalfpaymentinpreviousexecution;
}
private int secoundhalfpagenuminpreviousexecution;
public void setSecoundhalfpagenuminpreviousexecution(int secoundhalfpagenuminpreviousexecution){
this.secoundhalfpagenuminpreviousexecution = secoundhalfpagenuminpreviousexecution;
}
public int getSecoundhalfpagenuminpreviousexecution(){
return this.secoundhalfpagenuminpreviousexecution;
}
private int secoundhalfpaymentinpreviousexecution;
public void setSecoundhalfpaymentinpreviousexecution(int secoundhalfpaymentinpreviousexecution){
this.secoundhalfpaymentinpreviousexecution = secoundhalfpaymentinpreviousexecution;
}
public int getSecoundhalfpaymentinpreviousexecution(){
return this.secoundhalfpaymentinpreviousexecution;
}
private boolean unix;
public void setUnix(boolean unix){
this.unix = unix;
}
public boolean isUnix(){
return this.unix;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	unix =false;
}
}
