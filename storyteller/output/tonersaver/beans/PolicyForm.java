package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PolicyForm
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
private String priviledgeowner;
public void setPriviledgeowner(String priviledgeowner){
this.priviledgeowner = priviledgeowner;
}
public String getPriviledgeowner(){
return this.priviledgeowner;
}
private boolean decreaseratebyprinter;
public void setDecreaseratebyprinter(boolean decreaseratebyprinter){
this.decreaseratebyprinter = decreaseratebyprinter;
}
public boolean isDecreaseratebyprinter(){
return this.decreaseratebyprinter;
}
private int decreasedrateforall;
public void setDecreasedrateforall(int decreasedrateforall){
this.decreasedrateforall = decreasedrateforall;
}
public int getDecreasedrateforall(){
return this.decreasedrateforall;
}
private int savingratefornewprinters;
public void setSavingratefornewprinters(int savingratefornewprinters){
this.savingratefornewprinters = savingratefornewprinters;
}
public int getSavingratefornewprinters(){
return this.savingratefornewprinters;
}
private int timetokeeplog;
public void setTimetokeeplog(int timetokeeplog){
this.timetokeeplog = timetokeeplog;
}
public int getTimetokeeplog(){
return this.timetokeeplog;
}
private boolean donotdeletelog;
public void setDonotdeletelog(boolean donotdeletelog){
this.donotdeletelog = donotdeletelog;
}
public boolean isDonotdeletelog(){
return this.donotdeletelog;
}
private boolean keeplog;
public void setKeeplog(boolean keeplog){
this.keeplog = keeplog;
}
public boolean isKeeplog(){
return this.keeplog;
}
private boolean keeplogonserver;
public void setKeeplogonserver(boolean keeplogonserver){
this.keeplogonserver = keeplogonserver;
}
public boolean isKeeplogonserver(){
return this.keeplogonserver;
}
private String logserverhostaddress;
public void setLogserverhostaddress(String logserverhostaddress){
this.logserverhostaddress = logserverhostaddress;
}
public String getLogserverhostaddress(){
return this.logserverhostaddress;
}
private boolean excludesapplications;
public void setExcludesapplications(boolean excludesapplications){
this.excludesapplications = excludesapplications;
}
public boolean isExcludesapplications(){
return this.excludesapplications;
}
private boolean excludesprinters;
public void setExcludesprinters(boolean excludesprinters){
this.excludesprinters = excludesprinters;
}
public boolean isExcludesprinters(){
return this.excludesprinters;
}
private boolean temp;
public void setTemp(boolean temp){
this.temp = temp;
}
public boolean isTemp(){
return this.temp;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
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
private boolean useserverforpolicyconfig;
public void setUseserverforpolicyconfig(boolean useserverforpolicyconfig){
this.useserverforpolicyconfig = useserverforpolicyconfig;
}
public boolean isUseserverforpolicyconfig(){
return this.useserverforpolicyconfig;
}
private int lisenceserviceport;
public void setLisenceserviceport(int lisenceserviceport){
this.lisenceserviceport = lisenceserviceport;
}
public int getLisenceserviceport(){
return this.lisenceserviceport;
}
private boolean transfarslog;
public void setTransfarslog(boolean transfarslog){
this.transfarslog = transfarslog;
}
public boolean isTransfarslog(){
return this.transfarslog;
}
private String excludedapplicationstring;
public void setExcludedapplicationstring(String excludedapplicationstring){
this.excludedapplicationstring = excludedapplicationstring;
}
public String getExcludedapplicationstring(){
return this.excludedapplicationstring;
}
private String excludedprinterstring;
public void setExcludedprinterstring(String excludedprinterstring){
this.excludedprinterstring = excludedprinterstring;
}
public String getExcludedprinterstring(){
return this.excludedprinterstring;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	decreaseratebyprinter =false;
	donotdeletelog =false;
	keeplog =false;
	keeplogonserver =false;
	excludesapplications =false;
	excludesprinters =false;
	temp =false;
	transfarintcp =false;
	useserverforpolicyconfig =false;
	transfarslog =false;
}
}
