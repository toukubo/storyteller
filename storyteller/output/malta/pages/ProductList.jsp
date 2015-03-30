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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 
<%@ page isELIgnored="false" %>
<tiles:insert definition=".publicLayout">
	<tiles:put name="title" value="製品" direct="true" />
	<tiles:put name="content" direct="true">
	
	

    <logic:iterate id="product" name="products">
         注釈
${product.note}
<br/>
id
${product.id}
<br/>
削除済み
${product.removed}
<br/>
商品No
${product.no}
<br/>
カテゴリー
${product.category}
<br/>
アイテム
<div>
<logic:iterate id="item" name="product" property="items">注釈
${item.note}
<br/>
id
${item.id}
<br/>
商品No
${item.no}
<br/>
選択
<div>
<logic:iterate id="choise" name="item" property="choises">id
${choise.id}
<br/>
注文数
${choise.ordernum}
<br/>
税込み
${choise.pricewithtax}
<br/>
ラッピングあり
${choise.wrapping}
<br/>
購入
${choise.purchase}
<br/>
deliveryAddressChoises
<div>
<logic:iterate id="deliveryAddressChoise" name="choise" property="deliveryAddressChoises">id
${deliveryaddresschoise.id}
<br/>
注文数
${deliveryaddresschoise.ordernum}
<br/>
配送希望日
${deliveryaddresschoise.preferreddate}
<br/>
配送希望時間
${deliveryaddresschoise.preferredtime}
<br/>
deliveryAddress
${deliveryaddresschoise.deliveryAddress}
<br/>
choise
${deliveryaddresschoise.choise}
<br/>
giftCard
${deliveryaddresschoise.giftCard}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="choise.deliveryAddressChoises" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr>
${row.ordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送希望日">
<nobr>
${row.preferreddate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送希望時間">
<nobr>
${row.preferredtime}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliveryAddress">
<nobr>
${row.deliveryAddress.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="choise">
<nobr>
${row.choise.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="giftCard">
<nobr>
${row.giftCard.name}
</nobr>
</display:column>
                        </display:table>
<br/>
アイテム
${choise.item}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="item.choises" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr>
${row.ordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="税込み">
<nobr>
${row.pricewithtax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ラッピングあり">
<nobr>
${row.wrapping}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliveryAddressChoises">
<nobr>
${row.deliveryAddressChoises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アイテム">
<nobr>
${row.item.id}
</nobr>
</display:column>
                        </display:table>
<br/>
税込み
${item.pricewithtax}
<br/>
素材
${item.material}
<br/>
キャッチコピー
${item.catchcopy}
<br/>
在庫数
${item.stocknum}
<br/>
main
${item.main}
<br/>
製品
${item.product}
<br/>
送料
${item.carriage}
<br/>
zoom
${item.zoom}
<br/>
detailed
				<display:table name="item.detailed" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
                        </display:table>
<br/>
defaultattachment
${item.defaultattachment}
<br/>
名前
${item.name}
<br/>
サイズ
${item.size}
<br/>
説明
${item.description}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="product.items" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="注釈">
<nobr>
${row.note}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="商品No">
<nobr>
${row.no}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="選択">
<nobr>
${row.choises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="税込み">
<nobr>
${row.pricewithtax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="素材">
<nobr>
${row.material}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="キャッチコピー">
<nobr>
${row.catchcopy}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="在庫数">
<nobr>
${row.stocknum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="main">
<nobr>
${row.main}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="製品">
<nobr>
${row.product.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="送料">
<nobr>
${row.carriage.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="zoom">
<nobr>
${row.zoom}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="detailed">
<nobr>
${row.detailed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="defaultattachment">
<nobr>
${row.defaultattachment}
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
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
                        </display:table>
<br/>
税込み
${product.pricewithtax}
<br/>
素材
${product.material}
<br/>
キャッチコピー
${product.catchcopy}
<br/>
在庫数
${product.stocknum}
<br/>
公開
${product.pub}
<br/>
thumnail
${product.thumnail}
<br/>
スライドショー
${product.slideshow}
<br/>
名前
${product.name}
<br/>
サイズ
${product.size}
<br/>
説明
${product.description}
<br/>
日付
date<st:date date="${product.注釈
${product.note}
<br/>
id
${product.id}
<br/>
削除済み
${product.removed}
<br/>
商品No
${product.no}
<br/>
カテゴリー
${product.category}
<br/>
アイテム
<div>
<logic:iterate id="item" name="product" property="items">注釈
${item.note}
<br/>
id
${item.id}
<br/>
商品No
${item.no}
<br/>
選択
<div>
<logic:iterate id="choise" name="item" property="choises">id
${choise.id}
<br/>
注文数
${choise.ordernum}
<br/>
税込み
${choise.pricewithtax}
<br/>
ラッピングあり
${choise.wrapping}
<br/>
購入
${choise.purchase}
<br/>
deliveryAddressChoises
<div>
<logic:iterate id="deliveryAddressChoise" name="choise" property="deliveryAddressChoises">id
${deliveryaddresschoise.id}
<br/>
注文数
${deliveryaddresschoise.ordernum}
<br/>
配送希望日
${deliveryaddresschoise.preferreddate}
<br/>
配送希望時間
${deliveryaddresschoise.preferredtime}
<br/>
deliveryAddress
${deliveryaddresschoise.deliveryAddress}
<br/>
choise
${deliveryaddresschoise.choise}
<br/>
giftCard
${deliveryaddresschoise.giftCard}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="choise.deliveryAddressChoises" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr>
${row.ordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送希望日">
<nobr>
${row.preferreddate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送希望時間">
<nobr>
${row.preferredtime}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliveryAddress">
<nobr>
${row.deliveryAddress.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="choise">
<nobr>
${row.choise.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="giftCard">
<nobr>
${row.giftCard.name}
</nobr>
</display:column>
                        </display:table>
<br/>
アイテム
${choise.item}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="item.choises" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr>
${row.ordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="税込み">
<nobr>
${row.pricewithtax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ラッピングあり">
<nobr>
${row.wrapping}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliveryAddressChoises">
<nobr>
${row.deliveryAddressChoises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アイテム">
<nobr>
${row.item.id}
</nobr>
</display:column>
                        </display:table>
<br/>
税込み
${item.pricewithtax}
<br/>
素材
${item.material}
<br/>
キャッチコピー
${item.catchcopy}
<br/>
在庫数
${item.stocknum}
<br/>
main
${item.main}
<br/>
製品
${item.product}
<br/>
送料
${item.carriage}
<br/>
zoom
${item.zoom}
<br/>
detailed
				<display:table name="item.detailed" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
                        </display:table>
<br/>
defaultattachment
${item.defaultattachment}
<br/>
名前
${item.name}
<br/>
サイズ
${item.size}
<br/>
説明
${item.description}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="product.items" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="注釈">
<nobr>
${row.note}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="商品No">
<nobr>
${row.no}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="選択">
<nobr>
${row.choises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="税込み">
<nobr>
${row.pricewithtax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="素材">
<nobr>
${row.material}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="キャッチコピー">
<nobr>
${row.catchcopy}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="在庫数">
<nobr>
${row.stocknum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="main">
<nobr>
${row.main}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="製品">
<nobr>
${row.product.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="送料">
<nobr>
${row.carriage.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="zoom">
<nobr>
${row.zoom}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="detailed">
<nobr>
${row.detailed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="defaultattachment">
<nobr>
${row.defaultattachment}
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
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
                        </display:table>
<br/>
税込み
${product.pricewithtax}
<br/>
素材
${product.material}
<br/>
キャッチコピー
${product.catchcopy}
<br/>
在庫数
${product.stocknum}
<br/>
公開
${product.pub}
<br/>
thumnail
${product.thumnail}
<br/>
スライドショー
${product.slideshow}
<br/>
名前
${product.name}
<br/>
サイズ
${product.size}
<br/>
説明
${product.description}
<br/>
日付
date}" /><br/>

    </logic:iterate>




	</tiles:put>
</tiles:insert>


