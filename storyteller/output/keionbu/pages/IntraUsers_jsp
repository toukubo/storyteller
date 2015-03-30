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
	<tiles:put name="title" value="内部ユーザー一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepIntraUser.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="IntraUsers.do">






                     削除済み <select name="removed" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;


	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;





























	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;












<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${intraUsers}" id="row" requestURI="IntraUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowIntraUser.do?id=${row.id}">Show</a> | 
                        <a href="PostIntraUserDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a href="DeleteIntraUser.do?id=${row.id}"><img src="images/icons/table_delete.png"></a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="削除済み">
<nobr>
${row.removed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="更新日"><nobr>
<st:date date="${row.updatedate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="市区町村">
<nobr>
${row.city}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="都道府県">
<nobr>
${row.prefecture}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名">
<nobr>
${row.firstname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号">
<nobr>
${row.zipcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名かな">
<nobr>
${row.firstnamekana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="姓">
<nobr>
${row.familyname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="姓かな">
<nobr>
${row.familynamekana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ニックネーム">
<nobr>
${row.nickname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="所属">
<nobr>
${row.affiliation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="端末ID">
<nobr>
${row.utn}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="携帯番号">
<nobr>
${row.mobileno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="携帯アドレス">
<nobr>
${row.mobilemail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.telno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="建物名">
<nobr>
${row.building}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作成日"><nobr>
<st:date date="${row.createdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="パート">
<nobr>
${row.instruments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="紹介者">
<nobr>
${row.introductionFrom}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="introductionTo">
<nobr>
${row.introductionTo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジャンル">
<nobr>
${row.genres}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
