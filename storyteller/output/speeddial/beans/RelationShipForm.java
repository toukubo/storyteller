package net.speeddial.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class RelationShipForm
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
private Integer frompublicuser;
public void setFrompublicuser(Integer frompublicuser){
this.frompublicuser = frompublicuser;
}
public Integer getFrompublicuser(){
return this.frompublicuser;
}
private Integer topublicuser;
public void setTopublicuser(Integer topublicuser){
this.topublicuser = topublicuser;
}
public Integer getTopublicuser(){
return this.topublicuser;
}
private Integer relationShipStatus;
public void setRelationShipStatus(Integer relationShipStatus){
this.relationShipStatus = relationShipStatus;
}
public Integer getRelationShipStatus(){
return this.relationShipStatus;
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
