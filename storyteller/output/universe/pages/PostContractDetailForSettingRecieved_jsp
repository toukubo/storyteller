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
	<tiles:put name="title" value="契約" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostContractVP">
          <html:hidden name="form" property="id"/>

appearancedate<br />
<input type="text" name="appearancedateAsString" value="<st:date date="${form.appearancedate}" size="20" />" /><br />
合計金額<br />
<html:text size="40"  name="form" property="totalprice" /><br />

金額<br />
<html:text size="40"  name="form" property="price" /><br />

                                クライアント<br />
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


合計請求額<br />
<html:text size="40"  name="form" property="total" /><br />

消費税<br />
<html:text size="40"  name="form" property="tax" /><br />

番組名<br />
<html:text size="40"  name="form" property="programname" /><br />

請求ナンバー<br />
<html:text size="40"  name="form" property="invoiceno" /><br />

請求日<br />
<input type="text" name="invoicedateAsString" value="<st:date date="${form.invoicedate}" size="20" />" /><br />
入金日<br />
<input type="text" name="receivedateAsString" value="<st:date date="${form.receivedate}" size="20" />" /><br />
totalreceiveprice<br />
<html:text size="40"  name="form" property="totalreceiveprice" /><br />

contractdate<br />
<input type="text" name="contractdateAsString" value="<st:date date="${form.contractdate}" size="20" />" /><br />
invoiced<br />
<html:checkbox name="form" property="invoiced" /><br />

received<br />
<html:checkbox name="form" property="received" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
