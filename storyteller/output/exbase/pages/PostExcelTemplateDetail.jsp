<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/tags/struts-html.tld" prefix="html" %>
<%@ taglib uri="/tags/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostExcelTemplateVP">
          <html:hidden name="form" property="id"/>

名称<br />
<html:text name="form" property="name" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
