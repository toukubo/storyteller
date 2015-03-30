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
	<tiles:put name="title" value="契約一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepContract.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Contracts.do">
	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;







		                     &nbsp;クライアント
			<c:choose>
				<c:when test="${empty Customers}">
					<select name="customer" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="customer" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Customers}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>












	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;

	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;





	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;

                      <select name="invoiced" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;


                      <select name="received" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;



<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${contracts}" id="row" requestURI="Contracts.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowContract.do?id=${row.id}">Show</a> | 
                        <a href="PostContractDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a href="DeleteContract.do?id=${row.id}"><img src="images/icons/table_delete.png"></a>
                        </display:column>
 <display:column media="html" sortable="true" title="appearancedate"><nobr>
<st:date date="${row.appearancedate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計金額">
<nobr>
${row.totalprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.customer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計請求額">
<nobr>
${row.total}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="消費税">
<nobr>
${row.tax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="番組名">
<nobr>
${row.programname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="請求ナンバー">
<nobr>
${row.invoiceno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="請求日"><nobr>
<st:date date="${row.invoicedate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="入金日"><nobr>
<st:date date="${row.receivedate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="契約詳細">
<nobr>
${row.contractDetails}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="totalreceiveprice">
<nobr>
${row.totalreceiveprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="contractdate"><nobr>
<st:date date="${row.contractdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="invoiced">
<nobr>
${row.invoiced}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="received">
<nobr>
${row.received}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
