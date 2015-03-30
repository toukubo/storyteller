<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>

<%@ page import="java.util.*" %>

<html:html><tiles:insert page="/h.jsp"/>

<div class="main">
		<html:form method="POST" action="/TemplateInputAddingToJSPTemplateVPR"><br>
			<html:hidden name="templateinputform" property="id"/><br>
			name<br>
			<html:text name="templateinputform" property="name" styleClass="criteriaField" styleId="name"/><br>
			value<br>
			<html:text name="templateinputform" property="value" styleClass="criteriaField" styleId="value"/><br>

                                <c:choose>
                                    <c:when test="${empty jsptemplates}">
                                        <select name="jSPTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="jSPTemplate">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${jsptemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq templateinputform.jSPTemplate}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                                
                                
                                <c:choose>
                                    <c:when test="${empty verbs}">
                                        <select name="verb" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="verb">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${verbs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq templateinputform.verb}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
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

