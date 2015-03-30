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
<span class="title">ExhibitionIntraUser 編集</span>
		<html:form method="POST" action="/ExhibitionIntraUserVP">
          <html:hidden name="exhibitionIntraUser" property="id"/>

                                内部ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
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


DM発信数<br />
<html:text name="form" property="dm" /><br />

TC数<br />
<html:text name="form" property="tc" /><br />

来店確約<br />
<html:text name="form" property="visitaffirmation" /><br />

来店接客数AB確約来店<br />
<html:text name="form" property="customerabaffirmationvisit" /><br />

来店接客数AB確約外来店<br />
<html:text name="form" property="customerabnonaffirmationvisit" /><br />

来店接客数NONAB確約来店<br />
<html:text name="form" property="customernonabaffirmationvisit" /><br />

来店接客数NONAB確約外来店<br />
<html:text name="form" property="customernonabnonaffirmationvisit" /><br />

来店接客数フリー来店<br />
<html:text name="form" property="customernonabfreevisit" /><br />

デモ<br />
<html:text name="form" property="demo" /><br />

ABホット発生顧客<br />
<html:text name="form" property="engenderabhotcustomer" /><br />

ABホット発生ストック<br />
<html:text name="form" property="engenderabhotstock" /><br />

ABホット発生フリー<br />
<html:text name="form" property="engenderabhotfree" /><br />

受注台数AB顧客<br />
<html:text name="form" property="orderedcarsabcustomer" /><br />

受注台数新他<br />
<html:text name="form" property="orderedcarsabnewother" /><br />

受注台数NONAB顧客<br />
<html:text name="form" property="orderedcarsnonabcustomer" /><br />

受注台数ストック<br />
<html:text name="form" property="orderedcarsnonabstock" /><br />

受注台数フリー<br />
<html:text name="form" property="orderedcarsnonabfree" /><br />

                                展示会<br />
                                <c:choose>
                                    <c:when test="${empty Exhibitions}">
                                         <select name="exhibition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="exhibition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Exhibitions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.exhibition.id}">
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




          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


