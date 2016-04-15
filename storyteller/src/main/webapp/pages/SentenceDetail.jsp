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
<span class="title">Sentence ï“èW</span>
		<html:form method="POST" action="/SentenceVP">
          <html:hidden name="sentence" property="id"/>

name<br />
<html:text name="sentence" property="name" /><br />

valid<br />
<html:text name="sentence" property="valid" /><br />

strutsConfigCode<br />
<html:text name="sentence" property="strutsConfigCode" /><br />

                                <c:choose>
                                    <c:when test="${empty firstobjectives}">
                                         <select name="firstobjective" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="firstobjective" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${firstobjectives}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Sentence.firstobjective.id}">
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
                                    <c:when test="${empty verbs}">
                                         <select name="verb" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="verb" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${verbs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Sentence.verb.id}">
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
                                    <c:when test="${empty secountobjectives}">
                                         <select name="secountobjective" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="secountobjective" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${secountobjectives}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Sentence.secountobjective.id}">
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
                                    <c:when test="${empty j2eeStorys}">
                                         <select name="j2eeStory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="j2eeStory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${j2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Sentence.j2eeStory.id}">
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


