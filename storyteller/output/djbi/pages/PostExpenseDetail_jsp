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
	<tiles:put name="title" value="経費" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostExpenseVP">
          <html:hidden name="form" property="id"/>

                                request<br />
                                <c:choose>
                                    <c:when test="${empty Requests}">
                                         <select name="request" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="request" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Requests}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.request.id}">
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


金額<br />
<html:text size="40"  name="form" property="price" /><br />

支払日<br />
<input type="text" name="paymentdateAsString" value="<st:date date="${form.paymentdate}" />" size="20" />
<br />
支払い先<br />
<html:text size="40"  name="form" property="paymentee" /><br />

請求日<br />
<input type="text" name="requestdateAsString" value="<st:date date="${form.requestdate}" />" size="20" />
<br />
承認済み<br />
<html:checkbox name="form" property="acknowleged" /><br />

                                project<br />
                                <c:choose>
                                    <c:when test="${empty Projects}">
                                         <select name="project" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="project" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Projects}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.project.id}">
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


                                勘定科目<br />
                                <c:choose>
                                    <c:when test="${empty AccountTitles}">
                                         <select name="accountTitle" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="accountTitle" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${AccountTitles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.accountTitle.id}">
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


名前<br />
<html:text size="40"  name="form" property="name" /><br />

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" />" size="20" />
<br />



          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
