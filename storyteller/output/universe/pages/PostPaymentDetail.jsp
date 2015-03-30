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
		<html:form method="POST" action="/PostPaymentVP">
          <html:hidden name="form" property="id"/>

commission<br />
<html:text size="40"  name="form" property="commission" /><br />

paymentdate<br />
<input type="text" name="paymentdateAsString" value="<st:date date="${form.paymentdate}" size="20" />" /><br />
paymentflag<br />
<html:checkbox name="form" property="paymentflag" /><br />

                                contract<br />
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


total<br />
<html:text size="40"  name="form" property="total" /><br />

no<br />
<html:text size="40"  name="form" property="no" /><br />

tax<br />
<html:text size="40"  name="form" property="tax" /><br />

managementrate<br />
<html:text size="40"  name="form" property="managementrate" /><br />

managementprice<br />
<html:text size="40"  name="form" property="managementprice" /><br />

withholdingtax<br />
<html:text size="40"  name="form" property="withholdingtax" /><br />

price<br />
<html:text size="40"  name="form" property="price" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
