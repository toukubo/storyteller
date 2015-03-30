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

<tiles:insert definition=".layout">
	<tiles:put name="title" value="struts action template" direct="true" />
	<tiles:put name="side" direct="true">
	</tiles:put>
	<tiles:put name="content" direct="true"  >
<a href="VerbDetail.do?id=${strutsactiontemplate.verb.id}">back to ${strutsactiontemplate.verb.name}</a>

<div>
		<html:form method="POST" action="/StrutsActionTemplateVPR">
                <html:hidden name="strutsactiontemplate" property="id"/>
                template<br>
                                <html:textarea name="strutsactiontemplate" property="template" styleClass="criteriaField" styleId="template" cols="100" rows="70"/><br>
                                name template<br>
                                <html:text name="strutsactiontemplate" property="nametemplate" styleClass="criteriaField" styleId="nametemplate" size="40"/><br>
                    verb<br>
                             <c:choose>
                                 <c:when test="${empty Verbs}">
                                        <select name="verb" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="verb">
                                            <option value=""> </option>
                                            <c:forEach var="valueLabel" items="${Verbs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq strutsactiontemplate.verb.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br>
                                Taregtee Action<br>
                                <c:choose>
                                    <c:when test="${empty strutsactiontemplates}">
                                        <select name="targeteeaction" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="targeteeaction">
                                            <option value=""> </option>
                                            <c:forEach var="valueLabel" items="${strutsactiontemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq strutsactiontemplate.targeteeaction.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.nametemplate}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.nametemplate}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br>
                                Targetee JSP<br>
                                <c:choose>
                                    <c:when test="${empty jsptemplates}">
                                        <select name="jspTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="jspTemplate">
                                            <option value=""> </option> 
                                            <c:forEach var="valueLabel" items="${jsptemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq strutsactiontemplate.jspTemplate.id}">
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
			
			<html:submit />
		</html:form>
	</tiles:put>
</tiles:insert>
		