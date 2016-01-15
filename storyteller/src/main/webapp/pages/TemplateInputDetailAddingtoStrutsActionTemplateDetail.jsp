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
		<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS"/>
		<title></title>
		
<link href="base.css" rel="stylesheet" type="text/css">
<script src="calendarlay3.js" language="JavaScript"></script>
	</head>
	<body>
	

<div class="main">
		<html:form method="POST" action="/TemplateInputDetailAddingtoStrutsActionTemplateVPR"><br>
			<html:hidden name="templateinput" property="id"/><br>
			name<br>
			<html:text name="templateinput" property="name" styleClass="criteriaField" styleId="name"/><br>
			struts template<br>

                                <c:choose>
                                    <c:when test="${empty strutsactiontemplates}">
                                        <select name="strutsActionTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="strutsActionTemplate">
                                            <option value=""></option>
                                            <c:forEach var="valueLabel" items="${strutsactiontemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq templateinput.strutsActionTemplate.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.nametemplate}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.nametemplate}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                                <br>
                                
                                
                                verb<br>
                                
                                
                                <c:choose>
                                    <c:when test="${empty verbs}">
                                        <select name="verb" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="verb">
                                            <option value=""></option>
                                            <c:forEach var="valueLabel" items="${verbs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq templateinput.verb.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                                
		<html:submit />
		</html:form>
</div>
<div class="sub">

</div>
	</body>
</html:html>

