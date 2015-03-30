<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">
<span id="title">
	仕入編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostBuyingVP">
          <html:hidden name="form" property="id"/>

配送日<br />
<input type="text" name="deliverydateAsString" value="<bean:write name="form" property="deliverydate" format="yyyy/MM/dd" />" /><br />
orderdate<br />
<input type="text" name="orderdateAsString" value="<bean:write name="form" property="orderdate" format="yyyy/MM/dd" />" /><br />
department<br />
<html:text name="form" property="department" /><br />

supplyinginf<br />
<html:text name="form" property="supplyinginf" /><br />

purchaseorderno<br />
<html:text name="form" property="purchaseorderno" /><br />

paymentmethods<br />
<html:text name="form" property="paymentmethods" /><br />

paymentdate<br />
<input type="text" name="paymentdateAsString" value="<bean:write name="form" property="paymentdate" format="yyyy/MM/dd" />" /><br />
pretaxamount<br />
<html:text name="form" property="pretaxamount" /><br />

handpickedamount<br />
<html:text name="form" property="handpickedamount" /><br />

paymentamount<br />
<html:text name="form" property="paymentamount" /><br />

purchasingcontent<br />
<html:text name="form" property="purchasingcontent" /><br />

ledgeracccode<br />
<html:text name="form" property="ledgeracccode" /><br />

accountname<br />
<html:text name="form" property="accountname" /><br />

個数<br />
<html:text name="form" property="qty" /><br />

bids<br />
<html:text name="form" property="bids" /><br />

taxamount<br />
<html:text name="form" property="taxamount" /><br />

consumptiontax<br />
<html:text name="form" property="consumptiontax" /><br />

備考<br />
<html:text name="form" property="remark" /><br />

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


                                ジョブ<br />
                                <c:choose>
                                    <c:when test="${empty Jobs}">
                                         <select name="job" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="job" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Jobs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.job.id}">
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


supplierinf<br />
<html:text name="form" property="supplierinf" /><br />

                                accountTitle<br />
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


                                団体<br />
                                <c:choose>
                                    <c:when test="${empty Organizations}">
                                         <select name="organization" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="organization" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Organizations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.organization.id}">
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

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


