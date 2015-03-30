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
	<tiles:put name="title" value="出演者一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepNarrator.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Narrators.do">


















                     男性 <select name="male" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;










                     法人 <select name="corporation" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;






                      <select name="paywithtax" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;



<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${narrators}" id="row" requestURI="Narrators.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowNarrator.do?id=${row.id}">Show</a> | 
                        <a href="PostNarratorDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a href="DeleteNarrator.do?id=${row.id}"><img src="images/icons/table_delete.png"></a>
                        </display:column>
 <display:column media="html" sortable="true" title="contractDetails">
<nobr>
${row.contractDetails}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="契約金">
<nobr>
${row.contractfee}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="基本情報マネジメント率">
<nobr>
${row.managementfee}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

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
 <display:column media="html" sortable="true" title="郵便番号3桁">
<nobr>
${row.zipthree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号4桁">
<nobr>
${row.zipfour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.phone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="男性">
<nobr>
${row.male}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="携帯電話番号">
<nobr>
${row.mobilephone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メモ">
<nobr>
${row.memo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入金先銀行">
<nobr>
${row.paymentbank}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="法人">
<nobr>
${row.corporation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所">
<nobr>
${row.address}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="paywithtax">
<nobr>
${row.paywithtax}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
