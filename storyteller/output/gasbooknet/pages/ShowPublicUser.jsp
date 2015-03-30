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
${publicuser.name}
<br/>
アドレス
${publicuser.address}
<br/>
id
${publicuser.id}
<br/>
パスワード
${publicuser.password}
<br/>
削除済み
${publicuser.removed}
<br/>
メール
${publicuser.mail}
<br/>
郵便番号3桁
${publicuser.zipthree}
<br/>
郵便番号4桁
${publicuser.zipfour}
<br/>
カナ
${publicuser.kana}
<br/>
電話番号
${publicuser.phone}
<br/>
配送時間
${publicuser.devliveryhour}
<br/>
配送日
${publicuser.deliverydate}
<br/>
電話番号
${publicuser.deliveryphone}
<br/>
カナ
${publicuser.deliverykana}
<br/>
住所
${publicuser.deliveryblocknumber}
<br/>
住所
${publicuser.deliveryaddress}
<br/>
名前
${publicuser.deliveryname}
<br/>
郵便番号4桁
${publicuser.deliveryzipfour}
<br/>
郵便番号3桁
${publicuser.deliveryzipthree}
<br/>
都道府県
${publicuser.deliverypref}
<br/>
別のアドレスへ
${publicuser.delivertodifferentaddress}
<br/>
住所
${publicuser.blocknumber}
<br/>
男性
${publicuser.male}
<br/>
誕生日
${publicuser.brithday}
<br/>
メール確認
${publicuser.mailforconfirm}
<br/>
生月
${publicuser.birthmonth}
<br/>
municipality
${publicuser.municipality}
<br/>
生年
${publicuser.birthyear}
<br/>
携帯番号
${publicuser.keitai}
<br/>
建物名
${publicuser.buildingname}
<br/>
県
${publicuser.pref}
<br/>
管理者
${publicuser.admin}
<br/>
アクセスログ
<div>
<logic:iterate id="accessLog" name="publicuser" property="accessLogs">日付
date<st:date date="${accesslog.名前
${publicuser.name}
<br/>
アドレス
${publicuser.address}
<br/>
id
${publicuser.id}
<br/>
パスワード
${publicuser.password}
<br/>
削除済み
${publicuser.removed}
<br/>
メール
${publicuser.mail}
<br/>
郵便番号3桁
${publicuser.zipthree}
<br/>
郵便番号4桁
${publicuser.zipfour}
<br/>
カナ
${publicuser.kana}
<br/>
電話番号
${publicuser.phone}
<br/>
配送時間
${publicuser.devliveryhour}
<br/>
配送日
${publicuser.deliverydate}
<br/>
電話番号
${publicuser.deliveryphone}
<br/>
カナ
${publicuser.deliverykana}
<br/>
住所
${publicuser.deliveryblocknumber}
<br/>
住所
${publicuser.deliveryaddress}
<br/>
名前
${publicuser.deliveryname}
<br/>
郵便番号4桁
${publicuser.deliveryzipfour}
<br/>
郵便番号3桁
${publicuser.deliveryzipthree}
<br/>
都道府県
${publicuser.deliverypref}
<br/>
別のアドレスへ
${publicuser.delivertodifferentaddress}
<br/>
住所
${publicuser.blocknumber}
<br/>
男性
${publicuser.male}
<br/>
誕生日
${publicuser.brithday}
<br/>
メール確認
${publicuser.mailforconfirm}
<br/>
生月
${publicuser.birthmonth}
<br/>
municipality
${publicuser.municipality}
<br/>
生年
${publicuser.birthyear}
<br/>
携帯番号
${publicuser.keitai}
<br/>
建物名
${publicuser.buildingname}
<br/>
県
${publicuser.pref}
<br/>
管理者
${publicuser.admin}
<br/>
アクセスログ
<div>
<logic:iterate id="accessLog" name="publicuser" property="accessLogs">日付
date}" /><br/>
id
${accesslog.id}
<br/>
uri
${accesslog.uri}
<br/>
model
${accesslog.model}
<br/>
ページタイトル
${accesslog.pagetitle}
<br/>
一般ユーザー
${accesslog.publicUser}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.accessLogs" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="uri">
<nobr>
${row.uri}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="model">
<nobr>
${row.model}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ページタイトル">
<nobr>
${row.pagetitle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
                        </display:table>
<br/>
注文
<div>
<logic:iterate id="order" name="publicuser" property="orders">carriage
${order.carriage}
<br/>
total
${order.total}
<br/>
shipped
${order.shipped}
<br/>
subtotal
${order.subtotal}
<br/>
choises
<div>
<logic:iterate id="choise" name="order" property="choises">id
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
</div>				<display:table name="order.choises" id="row" requestURI=".do" pagesize="0" 
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
totalordernum
${order.totalordernum}
<br/>
publicUser
${order.publicUser}
<br/>
id
${order.id}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.orders" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="carriage">
<nobr>
${row.carriage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="total">
<nobr>
${row.total}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="shipped">
<nobr>
${row.shipped}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="subtotal">
<nobr>
${row.subtotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="choises">
<nobr>
${row.choises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="totalordernum">
<nobr>
${row.totalordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="publicUser">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
                        </display:table>
<br/>
purchases
<div>
<logic:iterate id="purchase" name="publicuser" property="purchases">id
${purchase.id}
<br/>
合計
${purchase.total}
<br/>
一般ユーザー
${purchase.publicUser}
<br/>
注文選択
<div>
<logic:iterate id="choise" name="purchase" property="choises">id
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
</div>				<display:table name="purchase.choises" id="row" requestURI=".do" pagesize="0" 
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
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.purchases" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="合計">
<nobr>
${row.total}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="注文選択">
<nobr>
${row.choises}
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
                        </display:table>
<br/>


</div>



	</body>
</html:html>


