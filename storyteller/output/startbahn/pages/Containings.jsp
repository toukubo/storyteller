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
	<tiles:put name="title" value="Containing一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepContaining.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Containings.do">




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



		                     &nbsp;フォルダ<c:choose>
<c:when test="${empty Folders}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="folder" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Folders}">
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

                    <display:table name="${containings}" id="row" requestURI="Containings.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowContaining.do?id=${row.id}">Show</a> | 
                        <a href="PostContainingDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteContaining.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="フォルダ">
<nobr>
${row.folder.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="model">
<nobr>
${row.model}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
