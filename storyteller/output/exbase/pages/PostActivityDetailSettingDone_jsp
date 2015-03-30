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
		<html:form method="POST" action="/PostActivityVP">
          <html:hidden name="form" property="id"/>

æ´æ°æ¥ä»<br />
<input type="text" name="updatedateAsString" value="<bean:write name="form" property="updatedate" format="yyyy/MM/dd" />" /><br />
éç¥æ¸ã¿<br />
<html:checkbox name="form" property="notified" /><br />

                                activityTemplate<br />
                                <c:choose>
                                    <c:when test="${empty ActivityTemplates}">
                                         <select name="activityTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="activityTemplate" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ActivityTemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.activityTemplate.id}">
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


                                æ¥æ¬èª<br />
                                <c:choose>
                                    <c:when test="${empty Workflows}">
                                         <select name="workflow" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="workflow" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Workflows}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.workflow.id}">
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


                                æ¥æ¬èª<br />
                                <c:choose>
                                    <c:when test="${empty Excels}">
                                         <select name="excel" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="excel" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Excels}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.excel.id}">
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


æ¥æ¬èª<br />
<html:checkbox name="form" property="done" /><br />

                                confirmation<br />
                                <c:choose>
                                    <c:when test="${empty Confirmations}">
                                         <select name="confirmation" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="confirmation" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Confirmations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.confirmation.id}">
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
