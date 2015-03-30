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
			<form action="GrepSummery.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Summerys.do">


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












	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;






































<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${summerys}" id="row" requestURI="Summerys.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowSummery.do?id=${row.id}">Show</a> | 
                        <a href="PostSummeryDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteSummery.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

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
 <display:column media="html" sortable="true" title="termtype">
<nobr>
${row.termtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="トナーコスト">
<nobr>
${row.estimatedtonercost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="削除後金額">
<nobr>
${row.actualtonercost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="プリンター">
<nobr>
${row.printer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="集計期間"><nobr>
<st:date date="${row.date}" /> </nobr>
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
 <display:column media="html" sortable="true" title="クライアント数">
<nobr>
${row.clientnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="印刷枚数（枚）">
<nobr>
${row.printnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="削減金額">
<nobr>
${row.tonercostsaved}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="平均トナー削減率">
<nobr>
${row.averagetonerdecreaserate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="モノクロ">
<nobr>
${row.averagemonotonerdecreaserate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="カラー">
<nobr>
${row.averagecolortonerdecreaserate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一台あたり印刷枚数（枚/台）">
<nobr>
${row.printingnumperclient}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="モノクロ">
<nobr>
${row.monoprintnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="カラー">
<nobr>
${row.colorprintnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="片面">
<nobr>
${row.onesideprintnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="両面">
<nobr>
${row.bothsideprintnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="drilldownid">
<nobr>
${row.drilldownid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="savingpoint">
<nobr>
${row.savingpoint}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="colorsavingpoint">
<nobr>
${row.colorsavingpoint}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="monosavingpoint">
<nobr>
${row.monosavingpoint}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="chartSummeries">
<nobr>
${row.chartSummeries}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
