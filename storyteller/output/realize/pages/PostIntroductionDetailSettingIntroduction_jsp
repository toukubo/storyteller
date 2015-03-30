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
		<html:form method="POST" action="/PostIntroductionVP">
          <html:hidden name="form" property="id"/>

                                コミッション支払<br />
                                <c:choose>
                                    <c:when test="${empty CommitionPayments}">
                                         <select name="commitionPayment" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="commitionPayment" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${CommitionPayments}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.commitionPayment.id}">
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


                                introducer<br />
                                <c:choose>
                                    <c:when test="${empty Introducers}">
                                         <select name="introducer" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="introducer" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Introducers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.introducer.id}">
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
                                introducedUser<br />
                                <c:choose>
                                    <c:when test="${empty IntroducedUsers}">
                                         <select name="introducedUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="introducedUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntroducedUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.introducedUser.id}">
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
