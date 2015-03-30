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
	<tiles:put name="title" value="印刷ログ一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepPrinting.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Printings.do">




		                     &nbsp;ユーザー
			<c:choose>
				<c:when test="${empty Users}">
					<select name="user" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="user" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Users}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;部署
			<c:choose>
				<c:when test="${empty Departments}">
					<select name="department" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="department" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Departments}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>
















                      <select name="oneside" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;


                     色 <select name="color" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;




	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;


<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${printings}" id="row" requestURI="Printings.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowPrinting.do?id=${row.id}">Show</a> | 
                        <a href="PostPrintingDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeletePrinting.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="ファイル名">
<nobr>
${row.filename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ユーザー">
<nobr>
${row.user.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="部署">
<nobr>
${row.department.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コンピューター">
<nobr>
${row.computer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="savingrate">
<nobr>
${row.savingrate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="数">
<nobr>
${row.num}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="applicationname">
<nobr>
${row.applicationname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filepath">
<nobr>
${row.filepath}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="papersize">
<nobr>
${row.papersize}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oneside">
<nobr>
${row.oneside}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="色">
<nobr>
${row.color}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="プリンター">
<nobr>
${row.printer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
