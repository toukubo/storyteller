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
	<tiles:put name="title" value="コンポーネント一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepComponent.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Components.do">


		                     &nbsp;
			<c:choose>
				<c:when test="${empty DataComponents}">
					<select name="dataComponent" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="dataComponent" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${DataComponents}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;
			<c:choose>
				<c:when test="${empty PageLayouts}">
					<select name="pageLayout" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="pageLayout" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${PageLayouts}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;
			<c:choose>
				<c:when test="${empty Labels}">
					<select name="label" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="label" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Labels}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>











<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${components}" id="row" requestURI="Components.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowComponent.do?id=${row.id}">Show</a> | 
                        <a href="PostComponentDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a href="DeleteComponent.do?id=${row.id}"><img src="images/icons/table_delete.png"></a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="dataComponent">
<nobr>
${row.dataComponent.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="pageLayout">
<nobr>
${row.pageLayout.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="label">
<nobr>
${row.label.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="x">
<nobr>
${row.x}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="y">
<nobr>
${row.y}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="width">
<nobr>
${row.width}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
