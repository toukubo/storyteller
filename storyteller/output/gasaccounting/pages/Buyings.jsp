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

<span class="title">仕入一覧</span>
                    <display:table name="${buyings}" id="row" requestURI="Buyings.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Buyings.do?id=${row.id}">編集</a>
                        <a href="DeleteBuying.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジョブ">
<nobr>
${row.job.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="団体">
<nobr>
${row.organization.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送日"><nobr>
<bean:write name="row" property="deliverydate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="個数">
<nobr>
${row.qty}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="備考">
<nobr>
${row.remark}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="purchaseorderno">
<nobr>
${row.purchaseorderno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="paymentmethods">
<nobr>
${row.paymentmethods}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="orderdate"><nobr>
<bean:write name="row" property="orderdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="paymentdate"><nobr>
<bean:write name="row" property="paymentdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="paymentamount">
<nobr>
${row.paymentamount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="purchasingcontent">
<nobr>
${row.purchasingcontent}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="bids">
<nobr>
${row.bids}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="taxamount">
<nobr>
${row.taxamount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="handpickedamount">
<nobr>
${row.handpickedamount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="consumptiontax">
<nobr>
${row.consumptiontax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="pretaxamount">
<nobr>
${row.pretaxamount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="accountTitle">
<nobr>
${row.accountTitle.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="buyingUnit">
<nobr>
${row.buyingUnit.id}
</nobr>
</display:column>

                    </display:table>
<a href="Buyings.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Buyings.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Buyings.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Buyings.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	仕入編集
</span>
<span id="subform">

		<form method="POST" action="PostBuyingVP.do">
          <html:hidden name="form" property="id"/>

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


配送日<br />
<input type="text" name="deliverydateAsString" value="<bean:write name="form" property="deliverydate" format="yyyy/MM/dd" />" /><br />
個数<br />
<html:text name="form" property="qty" /><br />

備考<br />
<html:text name="form" property="remark" /><br />

purchaseorderno<br />
<html:text name="form" property="purchaseorderno" /><br />

paymentmethods<br />
<html:text name="form" property="paymentmethods" /><br />

orderdate<br />
<input type="text" name="orderdateAsString" value="<bean:write name="form" property="orderdate" format="yyyy/MM/dd" />" /><br />
paymentdate<br />
<input type="text" name="paymentdateAsString" value="<bean:write name="form" property="paymentdate" format="yyyy/MM/dd" />" /><br />
paymentamount<br />
<html:text name="form" property="paymentamount" /><br />

purchasingcontent<br />
<html:text name="form" property="purchasingcontent" /><br />

bids<br />
<html:text name="form" property="bids" /><br />

taxamount<br />
<html:text name="form" property="taxamount" /><br />

handpickedamount<br />
<html:text name="form" property="handpickedamount" /><br />

consumptiontax<br />
<html:text name="form" property="consumptiontax" /><br />

pretaxamount<br />
<html:text name="form" property="pretaxamount" /><br />

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


                                buyingUnit<br />
                                <c:choose>
                                    <c:when test="${empty BuyingUnits}">
                                         <select name="buyingUnit" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="buyingUnit" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${BuyingUnits}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.buyingUnit.id}">
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




          <html:submit value="save" />
		</form>
</span>
                        <a href="Buyings.do">新規仕入作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

