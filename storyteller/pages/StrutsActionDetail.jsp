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
<tiles:insert page="/h.jsp"/>

<div class="main">
<span class="title">StrutsAction ï“èW</span>
		<html:form method="POST" action="/StrutsActionVP">
          <html:hidden name="strutsaction" property="id"/>

code<br />
<html:text name="strutsaction" property="code" /><br />

filename<br />
<html:text name="strutsaction" property="filename" /><br />

                                <c:choose>
                                    <c:when test="${empty sentences}">
                                         <select name="sentence" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="sentence" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${sentences}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq StrutsAction.sentence.id}">
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

                                <c:choose>
                                    <c:when test="${empty targeteejsps}">
                                         <select name="targeteejsp" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="targeteejsp" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${targeteejsps}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq StrutsAction.targeteejsp.id}">
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

                                <c:choose>
                                    <c:when test="${empty targeteeactions}">
                                         <select name="targeteeaction" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="targeteeaction" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${targeteeactions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq StrutsAction.targeteeaction.id}">
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



          <html:submit value="ï€ë∂"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


