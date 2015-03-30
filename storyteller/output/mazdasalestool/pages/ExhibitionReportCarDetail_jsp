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
<span class="title">ExhibitionReportCar 編集</span>
		<html:form method="POST" action="/ExhibitionReportCarVP">
          <html:hidden name="exhibitionReportCar" property="id"/>

注文<br />
<html:checkbox name="form" property="order" /><br />

数<br />
<html:text name="form" property="num" /><br />

                                展示会報告<br />
                                <c:choose>
                                    <c:when test="${empty ExhibitionReports}">
                                         <select name="exhibitionReport" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="exhibitionReport" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ExhibitionReports}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.exhibitionReport.id}">
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


                                車種<br />
                                <c:choose>
                                    <c:when test="${empty Cars}">
                                         <select name="car" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="car" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Cars}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.car.id}">
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


