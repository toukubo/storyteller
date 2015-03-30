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
	<tiles:put name="title" value="支払い一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepPayment.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Payments.do">


	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;

		                     &nbsp;契約
			<c:choose>
				<c:when test="${empty Contracts}">
					<select name="contract" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="contract" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Contracts}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;出演者
			<c:choose>
				<c:when test="${empty Narrators}">
					<select name="narrator" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="narrator" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Narrators}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>






















		                     &nbsp;
			<c:choose>
				<c:when test="${empty ContractDetails}">
					<select name="contractDetail" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="contractDetail" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${ContractDetails}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




                      <select name="payment" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;


                      <select name="paid" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;



<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${payments}" id="row" requestURI="Payments.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowPayment.do?id=${row.id}">Show</a> | 
                        <a href="PostPaymentDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a href="DeletePayment.do?id=${row.id}"><img src="images/icons/table_delete.png"></a>
                        </display:column>
 <display:column media="html" sortable="true" title="振込手数料">
<nobr>
${row.commission}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支払日"><nobr>
<st:date date="${row.paymentdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="契約">
<nobr>
${row.contract.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="出演者">
<nobr>
${row.narrator.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計">
<nobr>
${row.total}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="分割番号">
<nobr>
${row.no}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="消費税">
<nobr>
${row.tax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計金額">
<nobr>
${row.totalprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="マネジメント料率">
<nobr>
${row.managementrate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="マネジメント料">
<nobr>
${row.managementprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="源泉税">
<nobr>
${row.withholdingtax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="contractDetail">
<nobr>
${row.contractDetail.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="payment">
<nobr>
${row.payment}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="paid">
<nobr>
${row.paid}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
