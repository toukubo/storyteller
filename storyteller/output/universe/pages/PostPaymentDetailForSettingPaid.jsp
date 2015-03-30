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
	<tiles:put name="title" value="支払い" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPaymentVP">
          <html:hidden name="form" property="id"/>

振込手数料<br />
<html:text size="40"  name="form" property="commission" /><br />

支払日<br />
<input type="text" name="paymentdateAsString" value="<st:date date="${form.paymentdate}" />" size="20" />
<br />
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


                                出演者<br />
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


合計<br />
<html:text size="40"  name="form" property="total" /><br />

分割番号<br />
<html:text size="40"  name="form" property="no" /><br />

消費税<br />
<html:text size="40"  name="form" property="tax" /><br />

合計金額<br />
<html:text size="40"  name="form" property="totalprice" /><br />

マネジメント料率<br />
<html:text size="40"  name="form" property="managementrate" /><br />

マネジメント料<br />
<html:text size="40"  name="form" property="managementprice" /><br />

源泉税<br />
<html:text size="40"  name="form" property="withholdingtax" /><br />

金額<br />
<html:text size="40"  name="form" property="price" /><br />

                                contractDetail<br />
                                <c:choose>
                                    <c:when test="${empty ContractDetails}">
                                         <select name="contractDetail" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="contractDetail" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ContractDetails}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.contractDetail.id}">
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


payment<br />
<html:checkbox name="form" property="payment" /><br />

paid<br />
<html:checkbox name="form" property="paid" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
