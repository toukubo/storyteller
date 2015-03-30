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
		<html:form method="POST" action="/PostPositionVP">
          <html:hidden name="form" property="id"/>

                                周期的<br />
                                <c:choose>
                                    <c:when test="${empty Cycles}">
                                         <select name="cycle" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="cycle" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Cycles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.cycle.id}">
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


cycled<br />
<html:checkbox name="form" property="cycled" /><br />

                                parent<br />
                                <c:choose>
                                    <c:when test="${empty ParentPositionAsLefts}">
                                         <select name="parentPositionAsLeft" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="parentPositionAsLeft" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ParentPositionAsLefts}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.parentPositionAsLeft.id}">
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


                                leftChildPosition<br />
                                <c:choose>
                                    <c:when test="${empty LeftChildPositions}">
                                         <select name="leftChildPosition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="leftChildPosition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${LeftChildPositions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.leftChildPosition.id}">
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


                                parent<br />
                                <c:choose>
                                    <c:when test="${empty ParentPositionAsRights}">
                                         <select name="parentPositionAsRight" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="parentPositionAsRight" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ParentPositionAsRights}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.parentPositionAsRight.id}">
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


                                rightChildPosition<br />
                                <c:choose>
                                    <c:when test="${empty RightChildPositions}">
                                         <select name="rightChildPosition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="rightChildPosition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${RightChildPositions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.rightChildPosition.id}">
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
