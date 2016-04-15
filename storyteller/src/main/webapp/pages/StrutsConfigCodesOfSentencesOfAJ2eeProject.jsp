<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<%@ page import="java.util.*" %>

<html:html><tiles:insert page="/h.jsp"/>

	<div class="main">
		<logic:iterate id="c" name="strutsactioncodes">
		<textarea cols="100" rows="50"><bean:write name="c" /></textarea>
		<hr>
		</logic:iterate>
	</div>		
	<div class="sub">
		<bean:write name="j2eestory" property="name"/>
	</div>
	</body>
</html:html>

