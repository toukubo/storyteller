<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 

<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div>
id
${collector.id}
<br/>
一般ユーザー
${collector.publicUser}
<br/>
購入
<div>
<logic:iterate id="purchase" name="collector" property="purchases">id
${purchase.id}
<br/>
合計
${purchase.total}
<br/>
送料
${purchase.carriage}
<br/>
サブトータル
${purchase.subtotal}
<br/>
合計注文数
${purchase.totalordernum}
<br/>
発送済み
${purchase.shipped}
<br/>
コレクター
${purchase.collector}
<br/>
オークション
${purchase.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="collector.purchases" id="row" requestURI="AsHome.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="合計">
<nobr>
${row.total}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="送料">
<nobr>
${row.carriage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サブトータル">
<nobr>
${row.subtotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計注文数">
<nobr>
${row.totalordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="発送済み">
<nobr>
${row.shipped}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
入札
<div>
<logic:iterate id="betting" name="collector" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="collector.bettings" id="row" requestURI="AsHome.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="collector" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="AsHome.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.id
${collector.id}
<br/>
一般ユーザー
${collector.publicUser}
<br/>
購入
<div>
<logic:iterate id="purchase" name="collector" property="purchases">id
${purchase.id}
<br/>
合計
${purchase.total}
<br/>
送料
${purchase.carriage}
<br/>
サブトータル
${purchase.subtotal}
<br/>
合計注文数
${purchase.totalordernum}
<br/>
発送済み
${purchase.shipped}
<br/>
コレクター
${purchase.collector}
<br/>
オークション
${purchase.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="collector.purchases" id="row" requestURI="AsHome.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="合計">
<nobr>
${row.total}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="送料">
<nobr>
${row.carriage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サブトータル">
<nobr>
${row.subtotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計注文数">
<nobr>
${row.totalordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="発送済み">
<nobr>
${row.shipped}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
入札
<div>
<logic:iterate id="betting" name="collector" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="collector.bettings" id="row" requestURI="AsHome.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="collector" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="AsHome.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="collector.auctions" id="row" requestURI="AsHome.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
<br/>


</div>



	</body>
</html:html>


