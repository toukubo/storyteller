<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<%@ page import="java.util.*" %>

<html:html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS"/>
		<title></title>
		
<link href="base.css" rel="stylesheet" type="text/css">
<script src="calendarlay3.js" language="JavaScript"></script>
	</head>
	<body>
		<tiles:insert page="/menu.jsp" />

		<html:form method="POST" action="">
		</html:form>
	</body>
</html:html>

