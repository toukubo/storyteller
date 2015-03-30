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
	<tiles:put name="title" value="Exchange" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostExchangeVP">
          <html:hidden name="form" property="id"/>

                                パブリックユーザー<br />
                                <c:choose>
                                    <c:when test="${empty Topublicusers}">
                                         <select name="topublicuser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="topublicuser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Topublicusers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.topublicuser.id}">
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


                                パブリックユーザー<br />
                                <c:choose>
                                    <c:when test="${empty Frompublicusers}">
                                         <select name="frompublicuser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="frompublicuser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Frompublicusers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.frompublicuser.id}">
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


日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />



          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
