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
	<tiles:put name="title" value="経費一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepExpense.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Expenses.do">
		                     &nbsp;
			<c:choose>
				<c:when test="${empty Requests}">
					<select name="request" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="request" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Requests}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>








	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;



	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;

                     承認済み <select name="acknowleged" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;


		                     &nbsp;
			<c:choose>
				<c:when test="${empty Projects}">
					<select name="project" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="project" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Projects}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;勘定科目
			<c:choose>
				<c:when test="${empty AccountTitles}">
					<select name="accountTitle" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="accountTitle" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${AccountTitles}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>






	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;


<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${expenses}" id="row" requestURI="Expenses.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowExpense.do?id=${row.id}">Show</a> | 
                        <a href="PostExpenseDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteExpense.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="request">
<nobr>
${row.request.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支払日"><nobr>
<st:date date="${row.paymentdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="支払い先">
<nobr>
${row.paymentee}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="請求日"><nobr>
<st:date date="${row.requestdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="承認済み">
<nobr>
${row.acknowleged}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="project">
<nobr>
${row.project.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="勘定科目">
<nobr>
${row.accountTitle.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
