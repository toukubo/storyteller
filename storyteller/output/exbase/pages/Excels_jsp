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
			<form action="GrepExcel.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Excels.do">

<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${excels}" id="row" requestURI="Excels.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowExcel.do?id=${row.id}">Show</a> | 
                        <a href="PostExcelDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteExcel.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="æ´æ°æ¥"><nobr>
<bean:write name="row" property="updatedate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="excelTemplate">
<nobr>
${row.excelTemplate.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="excelVersions">
<nobr>
${row.excelVersions}
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
 <display:column media="html" sortable="true" title="activity">
<nobr>
${row.activity.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ãã¡ã¤ã«å">
<nobr>
${row.name}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
