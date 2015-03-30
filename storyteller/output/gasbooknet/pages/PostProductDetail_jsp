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
	<tiles:put name="title" value="製品" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostProductVP">
          <html:hidden name="form" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />
説明<br />
<html:text size="40"  name="form" property="description" /><br />

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


                                c<br />
                                <c:choose>
                                    <c:when test="${empty Cs}">
                                         <select name="c" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="c" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Cs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.c.id}">
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


                                作品<br />
                                <c:choose>
                                    <c:when test="${empty Works}">
                                         <select name="work" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="work" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Works}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.work.id}">
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


人気<br />
<html:checkbox name="form" property="poplular" /><br />

                                b <br />
                                <c:choose>
                                    <c:when test="${empty Bs}">
                                         <select name="b" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="b" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Bs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.b.id}">
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


                                a<br />
                                <c:choose>
                                    <c:when test="${empty As}">
                                         <select name="a" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="a" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${As}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.a.id}">
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


                                brand<br />
                                <c:choose>
                                    <c:when test="${empty Brands}">
                                         <select name="brand" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="brand" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Brands}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.brand.id}">
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
