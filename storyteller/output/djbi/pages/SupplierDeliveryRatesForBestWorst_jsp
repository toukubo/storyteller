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

<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>


<%@ page isELIgnored="false" %>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="仕入先別納品率一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepSupplierDeliveryRate.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="SupplierDeliveryRates.do">
		                     &nbsp;期間
			<c:choose>
				<c:when test="${empty Terms}">
					<select name="term" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="term" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Terms}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;会社
			<c:choose>
				<c:when test="${empty Companys}">
					<select name="company" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="company" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Companys}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;仕入先
			<c:choose>
				<c:when test="${empty Suppliers}">
					<select name="supplier" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="supplier" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Suppliers}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>















<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${supplierDeliveryRates}" id="row" requestURI="SupplierDeliveryRates.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowSupplierDeliveryRate.do?id=${row.id}">Show</a> | 
                        <a href="PostSupplierDeliveryRateDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteSupplierDeliveryRate.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="期間">
<nobr>
${row.term.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="会社">
<nobr>
${row.company.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="仕入先">
<nobr>
${row.supplier.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliverynum">
<nobr>
${row.deliverynum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliverytotal">
<nobr>
${row.deliverytotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ordertotal">
<nobr>
${row.ordertotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr>
${row.ordernum}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
