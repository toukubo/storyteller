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
<span class="title">Contract 編集</span>
		<html:form method="POST" action="/ContractVP">
          <html:hidden name="contract" property="id"/>

合計<br />
<html:text size="40"  name="form" property="total" /><br />

送料<br />
<html:text size="40"  name="form" property="carriage" /><br />

サブトータル<br />
<html:text size="40"  name="form" property="subtotal" /><br />

合計注文数<br />
<html:text size="40"  name="form" property="totalordernum" /><br />

発送済み<br />
<html:checkbox name="form" property="shipped" /><br />

                                顧客<br />
                                <c:choose>
                                    <c:when test="${empty Customers}">
                                         <select name="customer" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="customer" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Customers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.customer.id}">
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


                                narrator<br />
                                <c:choose>
                                    <c:when test="${empty Narrators}">
                                         <select name="narrator" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="narrator" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Narrators}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.narrator.id}">
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


