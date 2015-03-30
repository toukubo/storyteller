package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String basepath;
public void setBasepath(String basepath){
this.basepath = basepath;
}
public String getBasepath(){
return this.basepath;
}
private boolean unix;
public void setUnix(boolean unix){
this.unix = unix;
}
public boolean isUnix(){
return this.unix;
}
private int mapeventspan;
public void setMapeventspan(int mapeventspan){
this.mapeventspan = mapeventspan;
}
public int getMapeventspan(){
return this.mapeventspan;
}
private String creditcardprocesurl;
public void setCreditcardprocesurl(String creditcardprocesurl){
this.creditcardprocesurl = creditcardprocesurl;
}
public String getCreditcardprocesurl(){
return this.creditcardprocesurl;
}
private String sitename;
public void setSitename(String sitename){
this.sitename = sitename;
}
public String getSitename(){
return this.sitename;
}
private String fromaddress;
public void setFromaddress(String fromaddress){
this.fromaddress = fromaddress;
}
public String getFromaddress(){
return this.fromaddress;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private int carriage;
public void setCarriage(int carriage){
this.carriage = carriage;
}
public int getCarriage(){
return this.carriage;
}
private int timetokeeplog;
public void setTimetokeeplog(int timetokeeplog){
this.timetokeeplog = timetokeeplog;
}
public int getTimetokeeplog(){
return this.timetokeeplog;
}
private float colorunitcost;
public void setColorunitcost(float colorunitcost){
this.colorunitcost = colorunitcost;
}
public float getColorunitcost(){
return this.colorunitcost;
}
private float monounitcost;
public void setMonounitcost(float monounitcost){
this.monounitcost = monounitcost;
}
public float getMonounitcost(){
return this.monounitcost;
}
private int logserverport;
public void setLogserverport(int logserverport){
this.logserverport = logserverport;
}
public int getLogserverport(){
return this.logserverport;
}
private boolean transfarslog;
public void setTransfarslog(boolean transfarslog){
this.transfarslog = transfarslog;
}
public boolean isTransfarslog(){
return this.transfarslog;
}
private int transfarpeerhost;
public void setTransfarpeerhost(int transfarpeerhost){
this.transfarpeerhost = transfarpeerhost;
}
public int getTransfarpeerhost(){
return this.transfarpeerhost;
}
private int transfarport;
public void setTransfarport(int transfarport){
this.transfarport = transfarport;
}
public int getTransfarport(){
return this.transfarport;
}
private boolean transfarintcp;
public void setTransfarintcp(boolean transfarintcp){
this.transfarintcp = transfarintcp;
}
public boolean isTransfarintcp(){
return this.transfarintcp;
}
private boolean logserverintcp;
public void setLogserverintcp(boolean logserverintcp){
this.logserverintcp = logserverintcp;
}
public boolean isLogserverintcp(){
return this.logserverintcp;
}
private int sessiontimout;
public void setSessiontimout(int sessiontimout){
this.sessiontimout = sessiontimout;
}
public int getSessiontimout(){
return this.sessiontimout;
}
private int timetokeepaccesslog;
public void setTimetokeepaccesslog(int timetokeepaccesslog){
this.timetokeepaccesslog = timetokeepaccesslog;
}
public int getTimetokeepaccesslog(){
return this.timetokeepaccesslog;
}
private int lisenceserviceport;
public void setLisenceserviceport(int lisenceserviceport){
this.lisenceserviceport = lisenceserviceport;
}
public int getLisenceserviceport(){
return this.lisenceserviceport;
}
private String minimumpasswordlength;
public void setMinimumpasswordlength(String minimumpasswordlength){
this.minimumpasswordlength = minimumpasswordlength;
}
public String getMinimumpasswordlength(){
return this.minimumpasswordlength;
}
private boolean controlspasswordpolicy;
public void setControlspasswordpolicy(boolean controlspasswordpolicy){
this.controlspasswordpolicy = controlspasswordpolicy;
}
public boolean isControlspasswordpolicy(){
return this.controlspasswordpolicy;
}
private String passwordduration;
public void setPasswordduration(String passwordduration){
this.passwordduration = passwordduration;
}
public String getPasswordduration(){
return this.passwordduration;
}
private String passwordreuselimitation;
public void setPasswordreuselimitation(String passwordreuselimitation){
this.passwordreuselimitation = passwordreuselimitation;
}
public String getPasswordreuselimitation(){
return this.passwordreuselimitation;
}
private String passwordrule;
public void setPasswordrule(String passwordrule){
this.passwordrule = passwordrule;
}
public String getPasswordrule(){
return this.passwordrule;
}
private String passwordlockrule;
public void setPasswordlockrule(String passwordlockrule){
this.passwordlockrule = passwordlockrule;
}
public String getPasswordlockrule(){
return this.passwordlockrule;
}
private String lockoutduration;
public void setLockoutduration(String lockoutduration){
this.lockoutduration = lockoutduration;
}
public String getLockoutduration(){
return this.lockoutduration;
}
private int currentprintnum;
public void setCurrentprintnum(int currentprintnum){
this.currentprintnum = currentprintnum;
}
public int getCurrentprintnum(){
return this.currentprintnum;
}
private double currentcolorsavingpoint;
public void setCurrentcolorsavingpoint(double currentcolorsavingpoint){
this.currentcolorsavingpoint = currentcolorsavingpoint;
}
public double getCurrentcolorsavingpoint(){
return this.currentcolorsavingpoint;
}
private double currentmonosavingpoint;
public void setCurrentmonosavingpoint(double currentmonosavingpoint){
this.currentmonosavingpoint = currentmonosavingpoint;
}
public double getCurrentmonosavingpoint(){
return this.currentmonosavingpoint;
}
private int currentmonoprintnum;
public void setCurrentmonoprintnum(int currentmonoprintnum){
this.currentmonoprintnum = currentmonoprintnum;
}
public int getCurrentmonoprintnum(){
return this.currentmonoprintnum;
}
private int currentcolorprintnum;
public void setCurrentcolorprintnum(int currentcolorprintnum){
this.currentcolorprintnum = currentcolorprintnum;
}
public int getCurrentcolorprintnum(){
return this.currentcolorprintnum;
}
private int currenttonercost;
public void setCurrenttonercost(int currenttonercost){
this.currenttonercost = currenttonercost;
}
public int getCurrenttonercost(){
return this.currenttonercost;
}
private int dailycronhour;
public void setDailycronhour(int dailycronhour){
this.dailycronhour = dailycronhour;
}
public int getDailycronhour(){
return this.dailycronhour;
}
private boolean cronenabled;
public void setCronenabled(boolean cronenabled){
this.cronenabled = cronenabled;
}
public boolean isCronenabled(){
return this.cronenabled;
}
private boolean initialized;
public void setInitialized(boolean initialized){
this.initialized = initialized;
}
public boolean isInitialized(){
return this.initialized;
}
private boolean onsummeryupdate;
public void setOnsummeryupdate(boolean onsummeryupdate){
this.onsummeryupdate = onsummeryupdate;
}
public boolean isOnsummeryupdate(){
return this.onsummeryupdate;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	unix =false;
	transfarslog =false;
	transfarintcp =false;
	logserverintcp =false;
	controlspasswordpolicy =false;
	cronenabled =false;
	initialized =false;
	onsummeryupdate =false;
}
}
