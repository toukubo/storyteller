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
	<tiles:put name="title" value="マーク" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostMarkVP">
          <html:hidden name="form" property="id"/>

actual<br />
<html:checkbox name="form" property="actual" /><br />

markmodel<br />
<html:text size="40"  name="form" property="markmodel" /><br />

markeemodel<br />
<html:text size="40"  name="form" property="markeemodel" /><br />

マークid<br />
<html:text size="40"  name="form" property="markerid" /><br />

makeeid<br />
<html:text size="40"  name="form" property="makeeid" /><br />

                                markerpublicuser<br />
                                <c:choose>
                                    <c:when test="${empty Markerpublicusers}">
                                         <select name="markerpublicuser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="markerpublicuser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Markerpublicusers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.markerpublicuser.id}">
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


                                markedpublicuser<br />
                                <c:choose>
                                    <c:when test="${empty Markedpublicusers}">
                                         <select name="markedpublicuser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="markedpublicuser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Markedpublicusers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.markedpublicuser.id}">
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
