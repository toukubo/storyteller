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
	<tiles:put name="title" value="一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepCampaign.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Campaigns.do">


		                     &nbsp;メールマガジン
			<c:choose>
				<c:when test="${empty Mailmags}">
					<select name="mailmag" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="mailmag" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Mailmags}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>








		                     &nbsp;内部ユーザー
			<c:choose>
				<c:when test="${empty IntraUsers}">
					<select name="intraUser" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="intraUser" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${IntraUsers}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>






		                     &nbsp;
			<c:choose>
				<c:when test="${empty CampaignTypes}">
					<select name="campaignType" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="campaignType" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${CampaignTypes}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>






	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;


<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${campaigns}" id="row" requestURI="Campaigns.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowCampaign.do?id=${row.id}">Show</a> | 
                        <a href="PostCampaignDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteCampaign.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="メールマガジン">
<nobr>
${row.mailmag.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchases}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ROI">
<nobr>
${row.roi}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="campaignType">
<nobr>
${row.campaignType.name}
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
