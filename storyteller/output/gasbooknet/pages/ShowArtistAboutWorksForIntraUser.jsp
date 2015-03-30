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
名前
${artist.name}
<br/>
id
${artist.id}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
<bean:write name="work" property="date" format="yyyy/MM/dd" />
<br/>
年
${work.year}
<br/>
説明
${work.description}
<br/>
id
${work.id}
<br/>
内部ユーザー
${work.intraUser}
<br/>
製品
<div>
<logic:iterate id="product" name="work" property="products">日付
<bean:write name="product" property="date" format="yyyy/MM/dd" />
<br/>
説明
${product.description}
<br/>
id
${product.id}
<br/>
内部ユーザー
${product.intraUser}
<br/>
アイテム
<div>
<logic:iterate id="item" name="product" property="items">id
${item.id}
<br/>
製品
${item.product}
<br/>
アイテムカテゴリ
${item.itemCategory}
<br/>
注文選択
<div>
<logic:iterate id="choise" name="item" property="choises">id
${choise.id}
<br/>
注文数
${choise.ordernum}
<br/>
wraping
${choise.wapping}
<br/>
税込み
${choise.pricewithtax}
<br/>
アイテム
${choise.item}
<br/>
wrapping
${choise.wrapping}
<br/>
purchase
${choise.purchase}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="item.choises" id="row" requestURI="AboutWorksForIntraUser.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr>
${row.ordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="wraping">
<nobr>
${row.wapping}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="税込み">
<nobr>
${row.pricewithtax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アイテム">
<nobr>
${row.item.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="wrapping">
<nobr>
${row.wrapping}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="purchase">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
                        </display:table>
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="product.items" id="row" requestURI="AboutWorksForIntraUser.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="製品">
<nobr>
${row.product.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アイテムカテゴリ">
<nobr>
${row.itemCategory.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="注文選択">
<nobr>
${row.choises}
</nobr>
</display:column>
                        </display:table>
<br/>
c
${product.c}
<br/>
作品
${product.work}
<br/>
人気
${product.poplular}
<br/>
b 
${product.b}
<br/>
a
${product.a}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.products" id="row" requestURI="AboutWorksForIntraUser.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アイテム">
<nobr>
${row.items}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="c">
<nobr>
${row.c}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="b ">
<nobr>
${row.b}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="a">
<nobr>
${row.a}
</nobr>
</display:column>
                        </display:table>
<br/>
人気
${work.poplular}
<br/>
人気度
${work.poplularity}
<br/>
アーティスト
${work.artist}
<br/>
クライアント
${work.client}
<br/>
projectname
${work.projectname}
<br/>
copywrite
${work.copywrite}
<br/>
licenced
${work.licenced}
<br/>
制作意図
${work.productionpurpose}
<br/>
過去の発表履歴
${work.exposurehistory}
<br/>
クレジット表記
${work.credit}
<br/>
clientname
${work.clientname}
<br/>
cilentrequest 
${work.cilentrequest}
<br/>
workAttachments
<div>
<logic:iterate id="workAttachment" name="work" property="workAttachments">id
${workattachment.id}
<br/>
作品
${workattachment.work}
<br/>
付属品
${workattachment.attachment}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.workAttachments" id="row" requestURI="AboutWorksForIntraUser.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="付属品">
<nobr>
${row.attachment.id}
</nobr>
</display:column>
                        </display:table>
<br/>
タイトル
${work.title}
<br/>
ライセンス契約終了年月
<bean:write name="work" property="expiredate" format="yyyy/MM/dd" />
<br/>
ライセンスの可否
${work.licensed}
<br/>
備考
${work.particulars}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.works" id="row" requestURI="AboutWorksForIntraUser.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="年">
<nobr>
${row.year}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="製品">
<nobr>
${row.products}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気度">
<nobr>
${row.poplularity}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="projectname">
<nobr>
${row.projectname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="copywrite">
<nobr>
${row.copywrite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="licenced">
<nobr>
${row.licenced}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="制作意図">
<nobr>
${row.productionpurpose}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="過去の発表履歴">
<nobr>
${row.exposurehistory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クレジット表記">
<nobr>
${row.credit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="clientname">
<nobr>
${row.clientname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cilentrequest ">
<nobr>
${row.cilentrequest}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workAttachments">
<nobr>
${row.workAttachments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ライセンス契約終了年月"><nobr>
<bean:write name="row" property="expiredate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ライセンスの可否">
<nobr>
${row.licensed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="備考">
<nobr>
${row.particulars}
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
                        </display:table>
<br/>


</div>



	</body>
</html:html>


