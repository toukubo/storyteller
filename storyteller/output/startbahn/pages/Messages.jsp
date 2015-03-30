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
	<tiles:put name="title" value="メッセージ一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepMessage.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Messages.do">










                      <select name="system" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;







<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${messages}" id="row" requestURI="Messages.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowMessage.do?id=${row.id}">Show</a> | 
                        <a href="PostMessageDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteMessage.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="fromid">
<nobr>
${row.fromid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="toid">
<nobr>
${row.toid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="frommodel">
<nobr>
${row.frommodel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="tomodel">
<nobr>
${row.tomodel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="system">
<nobr>
${row.system}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="toPublicUser">
<nobr>
${row.toPublicUser}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="fromPubilcUser">
<nobr>
${row.fromPubilcUser}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
