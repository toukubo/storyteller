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
	<tiles:put name="title" value="アーティスト一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepArtist.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Artists.do">


		                     &nbsp;一般ユーザー<c:choose>
<c:when test="${empty PublicUsers}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="publicUser" ><option value="">All</option>
<c:forEach var="valueLabel" items="${PublicUsers}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  
















<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${artists}" id="row" requestURI="Artists.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowArtist.do?id=${row.id}">Show</a> | 
                        <a href="PostArtistDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteArtist.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.works}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="portrait">
<nobr>
${row.portrait}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="発生状況">
<nobr>
${row.events}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティストBBS">
<nobr>
${row.artistThreads}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="プロフィール">
<nobr>
${row.historicalProfiles}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="履歴">
<nobr>
${row.actionHistories}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
