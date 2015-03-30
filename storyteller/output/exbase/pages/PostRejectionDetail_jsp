<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostRejectionVP">
          <html:hidden name="form" property="id"/>

                                activity<br />
                                <c:choose>
                                    <c:when test="${empty Activitys}">
                                         <select name="activity" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="activity" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Activitys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.activity.id}">
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


                                targetActivity<br />
                                <c:choose>
                                    <c:when test="${empty TargetActivitys}">
                                         <select name="targetActivity" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="targetActivity" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${TargetActivitys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.targetActivity.id}">
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
<html:text name="form" property="description" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
