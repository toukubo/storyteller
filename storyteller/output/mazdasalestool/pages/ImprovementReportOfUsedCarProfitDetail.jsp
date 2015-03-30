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
<span class="title">ImprovementReportOfUsedCarProfit 編集</span>
		<html:form method="POST" action="/ImprovementReportOfUsedCarProfitVP">
          <html:hidden name="improvementReportOfUsedCarProfit" property="id"/>

当月計画<br />
<html:text size="20"  name="form" property="numofplan" /><br />

予測台数<br />
<html:text size="20"  name="form" property="numofforecast" /><br />

                                profitReportOfUsedCar<br />
                                <c:choose>
                                    <c:when test="${empty ProfitReportOfUsedCars}">
                                         <select name="profitReportOfUsedCar" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="profitReportOfUsedCar" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ProfitReportOfUsedCars}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.profitReportOfUsedCar.id}">
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


month<br />
<html:text size="20"  name="form" property="month" /><br />

year<br />
<html:text size="20"  name="form" property="year" /><br />

                                base<br />
                                <c:choose>
                                    <c:when test="${empty Bases}">
                                         <select name="base" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="base" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Bases}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.base.id}">
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


