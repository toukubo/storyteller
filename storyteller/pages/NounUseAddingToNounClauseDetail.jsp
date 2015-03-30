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


		<html:form method="POST" action="/NounUseAddingToNounClauseVPR">
                    <html:hidden name="nounuse" property="id"/>
                    multiple<br>
                                <html:checkbox name="nounuse" property="mutiple" styleClass="criteriaField" styleId="mutiple"/><br>
                         of order<br>
                                <html:text name="nounuse" property="oforder" styleClass="criteriaField" styleId="oforder"/><br>
                                nouns<br>
                                <c:choose>
                                    <c:when test="${empty nouns}">
                                        <select name="noun" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="noun">
                                            <option value=""></option>
                                            <c:forEach var="valueLabel" items="${nouns}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq nounuse.noun.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name} - ${valueLabel.j2eeStory.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br>
                                <bean:define id="c" property="nounClause" name="nounuse" />
                                <input type="hidden" name="nounClause" value="<bean:write name="c" property="id"/>" />
                                <br>
                                
                                <html:submit />
		
		</html:form>
	</body>
</html:html>

