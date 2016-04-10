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
<span class="title">NounUse ï“èW</span>
		<html:form method="POST" action="/NounUseVP">
          <html:hidden name="nounuse" property="id"/>

mutiple<br />
<html:text name="nounuse" property="mutiple" /><br />

oforder<br />
<html:text name="nounuse" property="oforder" /><br />

                                <c:choose>
                                    <c:when test="${empty nouns}">
                                         <select name="noun" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="noun" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${nouns}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq NounUse.noun.id}">
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
                                    <c:when test="${empty nounClauses}">
                                         <select name="nounClause" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="nounClause" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${nounClauses}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq NounUse.nounClause.id}">
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


