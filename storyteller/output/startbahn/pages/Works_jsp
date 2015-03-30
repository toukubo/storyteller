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
	<tiles:put name="title" value="作品一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepWork.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Works.do">


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









                     クライアント <select name="client" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;




                      <select name="licensed" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;




                      <select name="licensingpossibleafterexpired" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;














	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;

	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;











	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;




<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${works}" id="row" requestURI="Works.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowWork.do?id=${row.id}">Show</a> | 
                        <a href="PostWorkDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteWork.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジャンル">
<nobr>
${row.genre}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="copywrite">
<nobr>
${row.copywrite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="exposurehistory">
<nobr>
${row.exposurehistory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cilentrequest">
<nobr>
${row.cilentrequest}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="licensed">
<nobr>
${row.licensed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コメント">
<nobr>
${row.comments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="licensingpossibleafterexpired">
<nobr>
${row.licensingpossibleafterexpired}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="folderrelativepath">
<nobr>
${row.folderrelativepath}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="attachments">
<nobr>
${row.attachments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auctions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コンセプト">
<nobr>
${row.concept}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="containings">
<nobr>
${row.containings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="レビュー">
<nobr>
${row.reviews}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="更新日"><nobr>
<st:date date="${row.updatedate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="productiondate"><nobr>
<st:date date="${row.productiondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="素材">
<nobr>
${row.material}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="youtubeurl">
<nobr>
${row.youtubeurl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品コメント">
<nobr>
${row.workComments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サイズ">
<nobr>
${row.size}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="年">
<nobr>
${row.year}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
