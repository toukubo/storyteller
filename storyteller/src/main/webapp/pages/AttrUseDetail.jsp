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
<span class="title">AttrUse ï“èW</span>
		<html:form method="POST" action="/AttrUseVP">
          <html:hidden name="attruse" property="id"/>

                                <c:choose>
                                    <c:when test="${empty attrs}">
                                         <select name="attr" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="attr" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${attrs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq AttrUse.attr.id}">
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
                                    <c:when test="${empty nounUses}">
                                         <select name="nounUse" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="nounUse" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${nounUses}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq AttrUse.nounUse.id}">
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


