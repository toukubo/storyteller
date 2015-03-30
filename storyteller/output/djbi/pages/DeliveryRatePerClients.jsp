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
	<tiles:put name="title" value="一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepDeliveryRatePerClient.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="DeliveryRatePerClients.do">




		                     &nbsp;クライアント
			<c:choose>
				<c:when test="${empty Clients}">
					<select name="client" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="client" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Clients}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>


















		                     &nbsp;
			<c:choose>
				<c:when test="${empty Corporations}">
					<select name="corporation" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="corporation" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Corporations}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>





<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${deliveryRatePerClients}" id="row" requestURI="DeliveryRatePerClients.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowDeliveryRatePerClient.do?id=${row.id}">Show</a> | 
                        <a href="PostDeliveryRatePerClientDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteDeliveryRatePerClient.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr>
${row.ordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ordertotal">
<nobr>
${row.ordertotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliverytotal">
<nobr>
${row.deliverytotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliverynum">
<nobr>
${row.deliverynum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="nondeliverdtotal">
<nobr>
${row.nondeliverdtotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="nondeliverdnum">
<nobr>
${row.nondeliverdnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliveryratetotal">
<nobr>
${row.deliveryratetotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliveryratenum">
<nobr>
${row.deliveryratenum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="corporation">
<nobr>
${row.corporation.name}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
