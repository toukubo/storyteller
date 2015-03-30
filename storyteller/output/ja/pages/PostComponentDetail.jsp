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
	<tiles:put name="title" value="コンポーネント" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostComponentVP">
          <html:hidden name="form" property="id"/>

                                dataComponent<br />
                                <c:choose>
                                    <c:when test="${empty DataComponents}">
                                         <select name="dataComponent" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="dataComponent" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${DataComponents}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.dataComponent.id}">
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


                                pageLayout<br />
                                <c:choose>
                                    <c:when test="${empty PageLayouts}">
                                         <select name="pageLayout" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="pageLayout" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${PageLayouts}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.pageLayout.id}">
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


                                label<br />
                                <c:choose>
                                    <c:when test="${empty Labels}">
                                         <select name="label" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="label" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Labels}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.label.id}">
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


x<br />
<html:text size="40"  name="form" property="x" /><br />

y<br />
<html:text size="40"  name="form" property="y" /><br />

width<br />
<html:text size="40"  name="form" property="width" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
