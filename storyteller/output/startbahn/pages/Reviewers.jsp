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
			<form action="GrepReviewer.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Reviewers.do">


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

                    <display:table name="${reviewers}" id="row" requestURI="Reviewers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowReviewer.do?id=${row.id}">Show</a> | 
                        <a href="PostReviewerDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteReviewer.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="レビュー">
<nobr>
${row.reviews}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
