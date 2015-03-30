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
<span class="title">Payment 編集</span>
		<html:form method="POST" action="/PaymentVP">
          <html:hidden name="payment" property="id"/>

金額<br />
<html:text size="40"  name="form" property="price" /><br />

合計金額<br />
<html:text size="40"  name="form" property="totalprice" /><br />

消費税<br />
<html:text size="40"  name="form" property="tax" /><br />

源泉税<br />
<html:text size="40"  name="form" property="withholdingtax" /><br />

振込手数料<br />
<html:text size="40"  name="form" property="commission" /><br />

分割番号<br />
<html:text size="40"  name="form" property="no" /><br />

請求<br />
<html:checkbox name="form" property="invoice" /><br />

入金<br />
<html:checkbox name="form" property="receive" /><br />

支払<br />
<html:checkbox name="form" property="payment" /><br />

                                契約<br />
                                <c:choose>
                                    <c:when test="${empty Contracts}">
                                         <select name="contract" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="contract" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Contracts}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.contract.id}">
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


