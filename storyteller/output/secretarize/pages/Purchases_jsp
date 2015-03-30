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
	<tiles:put name="title" value="購入一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepPurchase.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Purchases.do">


		                     &nbsp;一般ユーザー
			<c:choose>
				<c:when test="${empty PublicUsers}">
					<select name="publicUser" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="publicUser" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${PublicUsers}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>








                     発送済み <select name="shipped" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;




                     請求済み <select name="invoiced" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;


                     支払済 <select name="paid" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;







<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${purchases}" id="row" requestURI="Purchases.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowPurchase.do?id=${row.id}">Show</a> | 
                        <a href="PostPurchaseDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a href="DeletePurchase.do?id=${row.id}"><img src="images/icons/table_delete.png"></a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計">
<nobr>
${row.total}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計注文数">
<nobr>
${row.totalordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="発送済み">
<nobr>
${row.shipped}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間">
<nobr>
${row.hour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="請求済み">
<nobr>
${row.invoiced}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支払済">
<nobr>
${row.paid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="月">
<nobr>
${row.month}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年">
<nobr>
${row.year}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
