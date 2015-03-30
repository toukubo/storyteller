package net.estimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class EstimationRawForm
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
private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private float height;
public void setHeight(float height){
this.height = height;
}
public float getHeight(){
return this.height;
}
private float width;
public void setWidth(float width){
this.width = width;
}
public float getWidth(){
return this.width;
}
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private float percentage;
public void setPercentage(float percentage){
this.percentage = percentage;
}
public float getPercentage(){
return this.percentage;
}
private Integer estimation;
public void setEstimation(Integer estimation){
this.estimation = estimation;
}
public Integer getEstimation(){
return this.estimation;
}
private boolean dirty;
public void setDirty(boolean dirty){
this.dirty = dirty;
}
public boolean isDirty(){
return this.dirty;
}
private int genka;
public void setGenka(int genka){
this.genka = genka;
}
public int getGenka(){
return this.genka;
}
private int rawnum;
public void setRawnum(int rawnum){
this.rawnum = rawnum;
}
public int getRawnum(){
return this.rawnum;
}
private int kasho;
public void setKasho(int kasho){
this.kasho = kasho;
}
public int getKasho(){
return this.kasho;
}
private int tanka;
public void setTanka(int tanka){
this.tanka = tanka;
}
public int getTanka(){
return this.tanka;
}
private int tankabyauto;
public void setTankabyauto(int tankabyauto){
this.tankabyauto = tankabyauto;
}
public int getTankabyauto(){
return this.tankabyauto;
}
private String unit;
public void setUnit(String unit){
this.unit = unit;
}
public String getUnit(){
return this.unit;
}
private String quickunit;
public void setQuickunit(String quickunit){
this.quickunit = quickunit;
}
public String getQuickunit(){
return this.quickunit;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	dirty =false;
}
}
