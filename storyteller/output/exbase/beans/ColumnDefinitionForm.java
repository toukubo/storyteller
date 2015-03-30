package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ColumnDefinitionForm
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
private Integer tableDefinition;
public void setTableDefinition(Integer tableDefinition){
this.tableDefinition = tableDefinition;
}
public Integer getTableDefinition(){
return this.tableDefinition;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer type;
public void setType(Integer type){
this.type = type;
}
public Integer getType(){
return this.type;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private String japanese;
public void setJapanese(String japanese){
this.japanese = japanese;
}
public String getJapanese(){
return this.japanese;
}
private boolean keycolumn;
public void setKeycolumn(boolean keycolumn){
this.keycolumn = keycolumn;
}
public boolean isKeycolumn(){
return this.keycolumn;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
	keycolumn =false;
}
}
