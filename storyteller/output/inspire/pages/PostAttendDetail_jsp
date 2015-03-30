<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/tags/struts-html.tld" prefix="html" %>
<%@ taglib uri="/tags/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostAttendVP">
          <html:hidden name="form" property="id"/>

publish<br />
<html:text name="form" property="publish" /><br />

                                イベント<br />
                                <c:choose>
                                    <c:when test="${empty Events}">
                                         <select name="event" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="event" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Events}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.event.id}">
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


                                ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty Users}">
                                         <select name="user" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="user" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Users}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.user.id}">
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


date<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />



          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
