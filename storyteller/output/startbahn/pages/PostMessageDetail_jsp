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
	<tiles:put name="title" value="メッセージ" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostMessageVP">
          <html:hidden name="form" property="id"/>

fromid<br />
<html:text size="40"  name="form" property="fromid" /><br />

toid<br />
<html:text size="40"  name="form" property="toid" /><br />

frommodel<br />
<html:text size="40"  name="form" property="frommodel" /><br />

tomodel<br />
<html:text size="40"  name="form" property="tomodel" /><br />

system<br />
<html:checkbox name="form" property="system" /><br />

                                toPublicUser<br />
                                <c:choose>
                                    <c:when test="${empty ToPublicUsers}">
                                         <select name="toPublicUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="toPublicUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ToPublicUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.toPublicUser.id}">
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


                                fromPubilcUser<br />
                                <c:choose>
                                    <c:when test="${empty FromPubilcUsers}">
                                         <select name="fromPubilcUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="fromPubilcUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${FromPubilcUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.fromPubilcUser.id}">
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


description<br />
<html:text size="40"  name="form" property="description" /><br />

title<br />
<html:text size="40"  name="form" property="title" /><br />

date<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />
draft<br />
<html:checkbox name="form" property="draft" /><br />

drafts<br />
<html:checkbox name="form" property="drafts" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
