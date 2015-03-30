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
	<tiles:put name="title" value="一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepS_Sales_Storeday.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="S_Sales_Storedays.do">

























































<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${s_Sales_Storedays}" id="row" requestURI="S_Sales_Storedays.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowS_Sales_Storeday.do?id=${row.id}">Show</a> | 
                        <a href="PostS_Sales_StoredayDetail.do?id=${row.id}"><img src="images/icons/table_edit.png"></a>
                        <a onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteS_Sales_Storeday.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="compCd">
<nobr>
${row.compCd}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="janCd">
<nobr>
${row.janCd}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="smrDayYmd">
<nobr>
${row.smrDayYmd}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="inpDayYmd">
<nobr>
${row.inpDayYmd}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="actDayYmd">
<nobr>
${row.actDayYmd}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="divCd">
<nobr>
${row.divCd}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="storCd">
<nobr>
${row.storCd}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="mstSellprc">
<nobr>
${row.mstSellprc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="mstSellprcIntax">
<nobr>
${row.mstSellprcIntax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="mstCostprc">
<nobr>
${row.mstCostprc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lmstSellprc">
<nobr>
${row.lmstSellprc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lmstSellprcIntax">
<nobr>
${row.lmstSellprcIntax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lmstCostprc">
<nobr>
${row.lmstCostprc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="posSellprc">
<nobr>
${row.posSellprc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="buyQty">
<nobr>
${row.buyQty}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="salesQty">
<nobr>
${row.salesQty}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="salesMny">
<nobr>
${row.salesMny}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="inSalesRtnQty">
<nobr>
${row.inSalesRtnQty}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="inSalesRtnMny">
<nobr>
${row.inSalesRtnMny}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="brgnDiscMny">
<nobr>
${row.brgnDiscMny}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="otherDiscMny">
<nobr>
${row.otherDiscMny}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="brgnKbn">
<nobr>
${row.brgnKbn}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="edlpKbn">
<nobr>
${row.edlpKbn}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lposSellprc">
<nobr>
${row.lposSellprc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lbuyQty">
<nobr>
${row.lbuyQty}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lsalesQty">
<nobr>
${row.lsalesQty}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lsalesMny">
<nobr>
${row.lsalesMny}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
