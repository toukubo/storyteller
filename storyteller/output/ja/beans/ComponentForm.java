package net.ja.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ComponentForm
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
private Integer dataComponent;
public void setDataComponent(Integer dataComponent){
this.dataComponent = dataComponent;
}
public Integer getDataComponent(){
return this.dataComponent;
}
private Integer pageLayout;
public void setPageLayout(Integer pageLayout){
this.pageLayout = pageLayout;
}
public Integer getPageLayout(){
return this.pageLayout;
}
private Integer label;
public void setLabel(Integer label){
this.label = label;
}
public Integer getLabel(){
return this.label;
}
private int x;
public void setX(int x){
this.x = x;
}
public int getX(){
return this.x;
}
private int y;
public void setY(int y){
this.y = y;
}
public int getY(){
return this.y;
}
private int width;
public void setWidth(int width){
this.width = width;
}
public int getWidth(){
return this.width;
}
private int fontsize;
public void setFontsize(int fontsize){
this.fontsize = fontsize;
}
public int getFontsize(){
return this.fontsize;
}
private String fontcolor;
public void setFontcolor(String fontcolor){
this.fontcolor = fontcolor;
}
public String getFontcolor(){
return this.fontcolor;
}
private Integer buttonComponent;
public void setButtonComponent(Integer buttonComponent){
this.buttonComponent = buttonComponent;
}
public Integer getButtonComponent(){
return this.buttonComponent;
}
private Integer inputText;
public void setInputText(Integer inputText){
this.inputText = inputText;
}
public Integer getInputText(){
return this.inputText;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
