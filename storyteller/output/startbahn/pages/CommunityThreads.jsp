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
	<tiles:put name="title" value="コミュニティBBS一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepCommunityThread.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="CommunityThreads.do">




		                     &nbsp;コミュニティ<c:choose>
<c:when test="${empty Communitys}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="community" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Communitys}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  




<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${communityThreads}" id="row" requestURI="CommunityThreads.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowCommunityThread.do?id=${row.id}">Show</a> | 
                        <a href="PostCommunityThreadDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteCommunityThread.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBSコメント">
<nobr>
${row.communityComments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミュニティ">
<nobr>
${row.community.id}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
