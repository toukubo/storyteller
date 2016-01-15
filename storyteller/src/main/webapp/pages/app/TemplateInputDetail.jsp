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

<html:html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title></title>
		
<link href="base.css" rel="stylesheet" type="text/css">
<script src="calendarlay3.js" language="JavaScript"></script>
	</head>
	<body>
<tiles:insert page="/h.jsp"/>


		<html:form method="POST" action="/TemplateInputVPRVerb">
		
		    	    		    <html:hidden name="templateinput" property="id"/>
		    	    		    name<br>
								<html:text name="templateinput" property="name" styleClass="criteriaField" styleId="name"/><br>
								<input type="hidden" name="verb" value="${templateinput.verb.id}" />
                                <html:submit />
		</html:form>
	</body>
</html:html>

