<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostTransitionVP">
          <html:hidden name="form" property="id"/>

                                nextActivityTemplate<br />
                                <c:choose>
                                    <c:when test="${empty NextActivityTemplates}">
                                         <select name="nextActivityTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="nextActivityTemplate" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${NextActivityTemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.nextActivityTemplate.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


                                previousActivityTemplate<br />
                                <c:choose>
                                    <c:when test="${empty PreviousActivityTemplates}">
                                         <select name="previousActivityTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="previousActivityTemplate" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${PreviousActivityTemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.previousActivityTemplate.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />





          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
