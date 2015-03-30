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
	<tiles:put name="title" value="ユーザー一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepUser.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Users.do">

<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${users}" id="row" requestURI="Users.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowUser.do?id=${row.id}">Show</a> | 
                        <a href="PostUserDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteUser.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="ãã¹ã¯ã¼ã">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ã¡ã¼ã«ã¢ãã¬ã¹">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="excelAccessabilities">
<nobr>
${row.excelAccessabilities}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="部署">
<nobr>
${row.department.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="commentNotificationChoises">
<nobr>
${row.commentNotificationChoises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コメント">
<nobr>
${row.comments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="activityTemplates">
<nobr>
${row.activityTemplates}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ã­ã°ã¤ã³ID">
<nobr>
${row.loginid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workflowTemplates">
<nobr>
${row.workflowTemplates}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="権限">
<nobr>
${row.privilege.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="notifications">
<nobr>
${row.notifications}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="displayedColumns">
<nobr>
${row.displayedColumns}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="åå">
<nobr>
${row.name}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
