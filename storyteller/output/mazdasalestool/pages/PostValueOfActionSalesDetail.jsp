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
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostValueOfActionSalesVP">
          <html:hidden name="form" property="id"/>

price<br />
<html:text name="form" property="price" /><br />

                                profitReportOfNewCar<br />
                                <c:choose>
                                    <c:when test="${empty ProfitReportOfNewCars}">
                                         <select name="profitReportOfNewCar" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="profitReportOfNewCar" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ProfitReportOfNewCars}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.profitReportOfNewCar.id}">
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


                                actionForSales<br />
                                <c:choose>
                                    <c:when test="${empty ActionForSaless}">
                                         <select name="actionForSales" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="actionForSales" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ActionForSaless}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.actionForSales.id}">
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
