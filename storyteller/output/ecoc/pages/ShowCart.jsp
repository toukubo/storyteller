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
${cart.id}
<br/>
パスワード
${cart.password}
<br/>
合計
${cart.total}
<br/>
メール
${cart.mail}
<br/>
郵便番号3桁
${cart.zipthree}
<br/>
郵便番号4桁
${cart.zipfour}
<br/>
配送日
${cart.deliverydate}
<br/>
送料
${cart.carriage}
<br/>
サブトータル
${cart.subtotal}
<br/>
合計注文数
${cart.totalordernum}
<br/>
カナ
${cart.kana}
<br/>
電話番号
${cart.phone}
<br/>
配送時間
${cart.devliveryhour}
<br/>
電話番号
${cart.deliveryphone}
<br/>
カナ
${cart.deliverykana}
<br/>
住所
${cart.deliveryblocknumber}
<br/>
住所
${cart.deliveryaddress}
<br/>
名前
${cart.deliveryname}
<br/>
郵便番号4桁
${cart.deliveryzipfour}
<br/>
郵便番号3桁
${cart.deliveryzipthree}
<br/>
都道府県
${cart.deliverypref}
<br/>
別のアドレスへ
${cart.delivertodifferentaddress}
<br/>
住所
${cart.blocknumber}
<br/>
男性
${cart.male}
<br/>
誕生日
${cart.brithday}
<br/>
メール確認
${cart.mailforconfirm}
<br/>
生月
${cart.birthmonth}
<br/>
municipality
${cart.municipality}
<br/>
生年
${cart.birthyear}
<br/>
携帯番号
${cart.keitai}
<br/>
建物名
${cart.buildingname}
<br/>
県
${cart.pref}
<br/>
管理者
${cart.admin}
<br/>
削除済み
${cart.removed}
<br/>
商品選択
<div>
<logic:iterate id="choise" name="cart" property="choises">id
${choise.id}
<br/>
製品
${choise.product}
<br/>
注文数
${choise.ordernum}
<br/>
税込み
${choise.pricewithtax}
<br/>
wapping
${choise.wapping}
<br/>
注文
${choise.cart}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="cart.choises" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="製品">
<nobr>
${row.product.id}
</nobr>
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
 <display:column media="html" sortable="true" title="wapping">
<nobr>
${row.wapping}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="注文">
<nobr>
${row.cart.id}
</nobr>
</display:column>
                        </display:table>
<br/>
名前
${cart.name}
<br/>
アドレス
${cart.address}
<br/>


</div>



	</body>
</html:html>


