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
	<tiles:put name="title" value="管理者一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepAdmin.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Admins.do">






                     パスワード変更済 <select name="passwordchanged" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;




		                     &nbsp;権限
			<c:choose>
				<c:when test="${empty Priviledges}">
					<select name="priviledge" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="priviledge" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Priviledges}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>












                     サマリーを表示する <select name="displayssummery" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;



<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${admins}" id="row" requestURI="Admins.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowAdmin.do?id=${row.id}">Show</a> | 
                        <a href="PostAdminDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteAdmin.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="1ページあたりの最大表示行数">
<nobr>
${row.pagesize}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="パスワード変更済">
<nobr>
${row.passwordchanged}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="権限">
<nobr>
${row.priviledge.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新しいパスワード（確認）">
<nobr>
${row.newpasswordconfirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新しいパスワード">
<nobr>
${row.newpassword}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="状況">
<nobr>
${row.accountstatus}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="小数点以下表示桁数">
<nobr>
${row.decimallevel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サマリーを表示する">
<nobr>
${row.displayssummery}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
