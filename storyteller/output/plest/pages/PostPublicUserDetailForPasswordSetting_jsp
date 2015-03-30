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
		<html:form method="POST" action="/PostPublicUserVP">
          <html:hidden name="form" property="id"/>

password<br />
<html:text name="form" property="password" /><br />

account<br />
<html:text name="form" property="account" /><br />

mail<br />
<html:text name="form" property="mail" /><br />

serviceid<br />
<html:text name="form" property="serviceid" /><br />

passwordConfirmation<br />
<html:text name="form" property="passwordConfirmation" /><br />

                                fromFollowing<br />
                                <c:choose>
                                    <c:when test="${empty FromFollowings}">
                                         <select name="fromFollowing" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="fromFollowing" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${FromFollowings}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.fromFollowing.id}">
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


name<br />
<html:text name="form" property="name" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
