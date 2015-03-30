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
	<tiles:put name="title" value="クライアント一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepCustomer.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Customers.do">
























	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;

	      <input type="text" name="startdate"/>yyyy/mm/dd  -   <input type="text" name="enddate"/>yyyy/mm/dd &nbsp;







                      <select name="printout" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;



<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${customers}" id="row" requestURI="Customers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowCustomer.do?id=${row.id}">Show</a> | 
                        <a href="PostCustomerDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a href="DeleteCustomer.do?id=${row.id}"><img src="images/icons/table_delete.png"></a>
                        </display:column>
 <display:column media="html" sortable="true" title="customerDetails">
<nobr>
${row.customerDetails}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="担当者名前(カナ)">
<nobr>
${row.kana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.phone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客分類">
<nobr>
${row.category}
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
 <display:column media="html" sortable="true" title="会社名">
<nobr>
${row.company}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="担当者役職">
<nobr>
${row.officialposition}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引銀行">
<nobr>
${row.dealingsbank}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引開始日"><nobr>
<st:date date="${row.startupdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="締め日"><nobr>
<st:date date="${row.closedate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所番号">
<nobr>
${row.addresno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="契約">
<nobr>
${row.contracts}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="担当者名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="printout">
<nobr>
${row.printout}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
