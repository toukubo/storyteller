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
<tiles:insert definition=".layout">
	<tiles:put name="title" value="オークション一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepAuction.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Auctions.do">


		                     &nbsp;作品<c:choose>
<c:when test="${empty Works}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="work" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Works}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  



		                     &nbsp;購入<c:choose>
<c:when test="${empty Purchases}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="purchase" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Purchases}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  





		                     &nbsp;コレクター<c:choose>
<c:when test="${empty Collectors}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="collector" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Collectors}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  





	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;


<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${auctions}" id="row" requestURI="Auctions.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowAuction.do?id=${row.id}">Show</a> | 
                        <a href="PostAuctionDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteAuction.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
