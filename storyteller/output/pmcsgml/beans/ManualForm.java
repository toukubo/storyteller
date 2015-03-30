package net.pmcsgml.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ManualForm
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
private String sgmlcode;
public void setSgmlcode(String sgmlcode){
this.sgmlcode = sgmlcode;
}
public String getSgmlcode(){
return this.sgmlcode;
}
private String pathfilecontent;
public void setPathfilecontent(String pathfilecontent){
this.pathfilecontent = pathfilecontent;
}
public String getPathfilecontent(){
return this.pathfilecontent;
}
private String haihukubun;
public void setHaihukubun(String haihukubun){
this.haihukubun = haihukubun;
}
public String getHaihukubun(){
return this.haihukubun;
}
private String productioncode;
public void setProductioncode(String productioncode){
this.productioncode = productioncode;
}
public String getProductioncode(){
return this.productioncode;
}
private Integer oemMaker;
public void setOemMaker(Integer oemMaker){
this.oemMaker = oemMaker;
}
public Integer getOemMaker(){
return this.oemMaker;
}
private Integer pathFile;
public void setPathFile(Integer pathFile){
this.pathFile = pathFile;
}
public Integer getPathFile(){
return this.pathFile;
}
private String productillustfilename;
public void setProductillustfilename(String productillustfilename){
this.productillustfilename = productillustfilename;
}
public String getProductillustfilename(){
return this.productillustfilename;
}
private Integer textcontentsZip;
public void setTextcontentsZip(Integer textcontentsZip){
this.textcontentsZip = textcontentsZip;
}
public Integer getTextcontentsZip(){
return this.textcontentsZip;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String typename;
public void setTypename(String typename){
this.typename = typename;
}
public String getTypename(){
return this.typename;
}
private String shimuke;
public void setShimuke(String shimuke){
this.shimuke = shimuke;
}
public String getShimuke(){
return this.shimuke;
}
private String productname;
public void setProductname(String productname){
this.productname = productname;
}
public String getProductname(){
return this.productname;
}
private String productcode;
public void setProductcode(String productcode){
this.productcode = productcode;
}
public String getProductcode(){
return this.productcode;
}
private String abroaddometic;
public void setAbroaddometic(String abroaddometic){
this.abroaddometic = abroaddometic;
}
public String getAbroaddometic(){
return this.abroaddometic;
}
private String oemfilename;
public void setOemfilename(String oemfilename){
this.oemfilename = oemfilename;
}
public String getOemfilename(){
return this.oemfilename;
}
private String referencedmanualfilename;
public void setReferencedmanualfilename(String referencedmanualfilename){
this.referencedmanualfilename = referencedmanualfilename;
}
public String getReferencedmanualfilename(){
return this.referencedmanualfilename;
}
private String hinjofilenme;
public void setHinjofilenme(String hinjofilenme){
this.hinjofilenme = hinjofilenme;
}
public String getHinjofilenme(){
return this.hinjofilenme;
}
private String assylistfilename;
public void setAssylistfilename(String assylistfilename){
this.assylistfilename = assylistfilename;
}
public String getAssylistfilename(){
return this.assylistfilename;
}
private String assyconstfilename;
public void setAssyconstfilename(String assyconstfilename){
this.assyconstfilename = assyconstfilename;
}
public String getAssyconstfilename(){
return this.assyconstfilename;
}
private String assylistperlfile;
public void setAssylistperlfile(String assylistperlfile){
this.assylistperlfile = assylistperlfile;
}
public String getAssylistperlfile(){
return this.assylistperlfile;
}
private String assyconstperlfile;
public void setAssyconstperlfile(String assyconstperlfile){
this.assyconstperlfile = assyconstperlfile;
}
public String getAssyconstperlfile(){
return this.assyconstperlfile;
}
private Integer htmlPathFile;
public void setHtmlPathFile(Integer htmlPathFile){
this.htmlPathFile = htmlPathFile;
}
public Integer getHtmlPathFile(){
return this.htmlPathFile;
}
private String jutenfilename;
public void setJutenfilename(String jutenfilename){
this.jutenfilename = jutenfilename;
}
public String getJutenfilename(){
return this.jutenfilename;
}
private boolean done;
public void setDone(boolean done){
this.done = done;
}
public boolean isDone(){
return this.done;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	done =false;
}
}
