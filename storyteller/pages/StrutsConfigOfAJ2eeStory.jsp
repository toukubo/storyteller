<?xml version="1.0"?>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ page isELIgnored="false" %>

${j2eeStory.strutsconfigcontent}
<!DOCTYPE struts-config PUBLIC "-//Apache Software Foundation//DTD Struts Configuration 1.2//EN" "http://struts.apache.org/dtds/struts-config_1_2.dtd">
<struts-config>
  <data-sources>
  </data-sources>
  <form-beans>
	  <logic:iterate id="noun" name="j2eeStory" property="nouns">
	    <form-bean name="manage${noun.name}Form" type="net.${j2eeStory.name}.model.crud.${noun.name}Form"/>
	    <form-bean name="${noun.name}Form" type="net.${j2eeStory.name}.beans.${noun.name}Form"/>
	  </logic:iterate>
  </form-beans>
  <global-exceptions>
  </global-exceptions>
  <global-forwards>
  </global-forwards>
  <action-mappings>
  <logic:iterate id="sentence" name="sentences" >
  	${sentence.strutsConfigCode}
  	
  </logic:iterate>
  </action-mappings>
  <controller processorClass="org.apache.struts.tiles.TilesRequestProcessor"/>
  <message-resources parameter="MessageResources"/>
  <plug-in className="org.apache.struts.tiles.TilesPlugin">
    <set-property property="definitions-config" value="/WEB-INF/tiles-defs.xml"/>
    <set-property property="moduleAware" value="true"/>
  </plug-in>
  <plug-in className="org.apache.struts.validator.ValidatorPlugIn">
    <set-property property="pathnames" value="/WEB-INF/validator-rules.xml,/WEB-INF/validation.xml"/>
  </plug-in>
</struts-config>


