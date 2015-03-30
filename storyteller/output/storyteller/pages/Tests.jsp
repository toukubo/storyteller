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
			<form action="GrepTest.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Tests.do">


		                     &nbsp;ストーリー<c:choose>
<c:when test="${empty J2eeStorys}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="j2eeStory" ><option value="">All</option>
<c:forEach var="valueLabel" items="${J2eeStorys}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  











                     デバグ済み <select name="debuged" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;


                     チェック済み <select name="checked" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;






		                     &nbsp;jsp<c:choose>
<c:when test="${empty Jsps}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="jsp" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Jsps}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  


















<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${tests}" id="row" requestURI="Tests.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowTest.do?id=${row.id}">Show</a> | 
                        <a href="PostTestDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteTest.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="ストーリー">
<nobr>
${row.j2eeStory.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="担当者">
<nobr>
${row.responsible}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="再現手順">
<nobr>
${row.stepstorepeat}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="期待される動作">
<nobr>
${row.whatyouexpectedtosee}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="表示内容">
<nobr>
${row.whatyousawinstead}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="デバグ済み">
<nobr>
${row.debuged}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="チェック済み">
<nobr>
${row.checked}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="割り当てた人">
<nobr>
${row.creator}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="デバッグ担当">
<nobr>
${row.debugger}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="jsp">
<nobr>
${row.jsp.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サマリー">
<nobr>
${row.summery}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="asnormal">
<nobr>
${row.asnormal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="asmain">
<nobr>
${row.asmain}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="見積内訳">
<nobr>
${row.estimationChoises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="modifiedpagetitle">
<nobr>
${row.modifiedpagetitle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="modifiedpage">
<nobr>
${row.modifiedpage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="modifiedpagefilename">
<nobr>
${row.modifiedpagefilename}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
