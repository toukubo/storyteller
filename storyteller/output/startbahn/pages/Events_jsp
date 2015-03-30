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
	<tiles:put name="title" value="Event 一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepEvent.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Events.do">


                     最近の <select name="recentlyadded" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;


		                     &nbsp;アーティスト<c:choose>
<c:when test="${empty Artists}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="artist" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Artists}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  



                     人気 <select name="poplular" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;








	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;


<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${events}" id="row" requestURI="Events.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowEvent.do?id=${row.id}">Show</a> | 
                        <a href="PostEventDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteEvent.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="attachments">
<nobr>
${row.attachments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
