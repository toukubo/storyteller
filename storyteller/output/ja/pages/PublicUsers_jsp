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






















	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;

























	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;







		                     &nbsp;地区
			<c:choose>
				<c:when test="${empty Areas}">
					<select name="area" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="area" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Areas}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;
			<c:choose>
				<c:when test="${empty UserInfos}">
					<select name="userInfo" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="userInfo" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${UserInfos}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>









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
 <display:column media="html" sortable="true" title="ＪＡコード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受入累計">
<nobr>
${row.totalcost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="情報管理コード">
<nobr>
${row.infocode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="農協コード">
<nobr>
${row.jacode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引">
<nobr>
${row.accountTransactions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="金融機関コード">
<nobr>
${row.accountofficecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="店舗コード">
<nobr>
${row.shopcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="科目コード">
<nobr>
${row.departmentcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="口座番号">
<nobr>
${row.accountnumber}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="口座状態">
<nobr>
${row.accountstatus}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="閉鎖解除年月日"><nobr>
<st:date date="${row.closurebreakdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="解約区分">
<nobr>
${row.closuretype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="所属支所コード">
<nobr>
${row.branchcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="経営形態">
<nobr>
${row.managementtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="地区コード">
<nobr>
${row.areacode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード１">
<nobr>
${row.varialblestatscode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード２">
<nobr>
${row.varialblestatscodetwo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="内訳資料区分">
<nobr>
${row.detaileddocumenttype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="レイアウトＮＯ">
<nobr>
${row.layoutno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="帳票制御コード">
<nobr>
${row.printingcontrolcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ソリマチ対象者区分">
<nobr>
${row.sorimachitargettype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引残高">
<nobr>
${row.remaining}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受入累計">
<nobr>
${row.totalincome}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="最終取引経理年月日"><nobr>
<st:date date="${row.lasttransactiondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="要精算額当初金額">
<nobr>
${row.nonaccountedatfirst}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="要精算額累計金額">
<nobr>
${row.nonaccountedatlast}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="集計">
<nobr>
${row.transactionSummeries}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="地区">
<nobr>
${row.area.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="userInfo">
<nobr>
${row.userInfo.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="組合員名">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="種類">
<nobr>
${row.type}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
