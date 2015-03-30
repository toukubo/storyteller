package net.pmcsgml.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PathForm
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
private String filename;
public void setFilename(String filename){
this.filename = filename;
}
public String getFilename(){
return this.filename;
}
private String typename;
public void setTypename(String typename){
this.typename = typename;
}
public String getTypename(){
return this.typename;
}
private Integer paper;
public void setPaper(Integer paper){
this.paper = paper;
}
public Integer getPaper(){
return this.paper;
}
private int chapternum;
public void setChapternum(int chapternum){
this.chapternum = chapternum;
}
public int getChapternum(){
return this.chapternum;
}
private boolean illustration;
public void setIllustration(boolean illustration){
this.illustration = illustration;
}
public boolean isIllustration(){
return this.illustration;
}
private String adaptedperl;
public void setAdaptedperl(String adaptedperl){
this.adaptedperl = adaptedperl;
}
public String getAdaptedperl(){
return this.adaptedperl;
}
private String textcontent;
public void setTextcontent(String textcontent){
this.textcontent = textcontent;
}
public String getTextcontent(){
return this.textcontent;
}
private String convertedtext;
public void setConvertedtext(String convertedtext){
this.convertedtext = convertedtext;
}
public String getConvertedtext(){
return this.convertedtext;
}
private Integer titleTemplate;
public void setTitleTemplate(Integer titleTemplate){
this.titleTemplate = titleTemplate;
}
public Integer getTitleTemplate(){
return this.titleTemplate;
}
private Integer chapter;
public void setChapter(Integer chapter){
this.chapter = chapter;
}
public Integer getChapter(){
return this.chapter;
}
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private String perlfile;
public void setPerlfile(String perlfile){
this.perlfile = perlfile;
}
public String getPerlfile(){
return this.perlfile;
}
private Integer pathSet;
public void setPathSet(Integer pathSet){
this.pathSet = pathSet;
}
public Integer getPathSet(){
return this.pathSet;
}
private String htmlfilepath;
public void setHtmlfilepath(String htmlfilepath){
this.htmlfilepath = htmlfilepath;
}
public String getHtmlfilepath(){
return this.htmlfilepath;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	illustration =false;
}
}
