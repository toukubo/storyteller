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
	<tiles:put name="title" value="一般ユーザー一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepPublicUser.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="PublicUsers.do">








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



















		                     &nbsp;コレクター<c:choose>
<c:when test="${empty Collectors}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="collector" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Collectors}">
<option value="${valueLabel.id}">${valueLabel.name}</option>
</c:forEach>
</select>
</c:otherwise>
</c:choose>
</form>  













		                     &nbsp;<c:choose>
<c:when test="${empty Reviewers}">
<select name="site" disabled="disabled"/>
</c:when>
<c:otherwise>
<select name="reviewer" ><option value="">All</option>
<c:forEach var="valueLabel" items="${Reviewers}">
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

                    <display:table name="${publicUsers}" id="row" requestURI="PublicUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowPublicUser.do?id=${row.id}">Show</a> | 
                        <a href="PostPublicUserDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeletePublicUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="url">
<nobr>
${row.url}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気度">
<nobr>
${row.poplularity}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="カナ">
<nobr>
${row.kana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アカウント">
<nobr>
${row.account}
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
 <display:column media="html" sortable="true" title="contact">
<nobr>
${row.contact}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="blogrss">
<nobr>
${row.blogrss}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="delicious">
<nobr>
${row.delicious}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="flickraccount">
<nobr>
${row.flickraccount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profile">
<nobr>
${row.profile}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ininterview">
<nobr>
${row.ininterview}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="history">
<nobr>
${row.history}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="誕生日"><nobr>
<st:date date="${row.birthdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="city">
<nobr>
${row.city}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="countrystr">
<nobr>
${row.countrystr}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="clients">
<nobr>
${row.clients}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="銀行">
<nobr>
${row.bank}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支店名">
<nobr>
${row.bankbranch}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="銀行名">
<nobr>
${row.brankname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="銀行口座番号">
<nobr>
${row.bankaccount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="口座名">
<nobr>
${row.bankaccountname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="branchaddress">
<nobr>
${row.branchaddress}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="参加">
<nobr>
${row.joinings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="topimageid">
<nobr>
${row.topimageid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="favoritegenre">
<nobr>
${row.favoritegenre}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="belonging">
<nobr>
${row.belonging}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="birthplace">
<nobr>
${row.birthplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="フォルダ">
<nobr>
${row.folders}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="fromMessage">
<nobr>
${row.fromMessage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="toMessage">
<nobr>
${row.toMessage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
