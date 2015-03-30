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
<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">


    <logic:iterate id="model" name="artists">
         名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate<st:date date="${artist.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate}" /><br/>
職種
${artist.typeofbusiness}
<br/>
city
${artist.city}
<br/>
国
${artist.countrystr}
<br/>
電話番号
${artist.phone}
<br/>
担当者電話番号
${artist.responsiblephone}
<br/>
担当者E-Mailアドレス
${artist.responsiblemail}
<br/>
awards
${artist.awards}
<br/>
exhibitions
${artist.exhibitions}
<br/>
クライアント
${artist.clients}
<br/>
支払方法
${artist.paymentmethod}
<br/>
銀行
${artist.bank}
<br/>
支店名
${artist.bankbranch}
<br/>
銀行名
${artist.brankname}
<br/>
銀行口座番号
${artist.bankaccount}
<br/>
口座名
${artist.bankaccountname}
<br/>
ibanno
${artist.ibanno}
<br/>
swiftbicno
${artist.swiftbicno}
<br/>
最近の
${artist.recentlyadded}
<br/>
人気
${artist.poplular}
<br/>
人気度
${artist.poplularity}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
date<st:date date="${work.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate<st:date date="${artist.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate}" /><br/>
職種
${artist.typeofbusiness}
<br/>
city
${artist.city}
<br/>
国
${artist.countrystr}
<br/>
電話番号
${artist.phone}
<br/>
担当者電話番号
${artist.responsiblephone}
<br/>
担当者E-Mailアドレス
${artist.responsiblemail}
<br/>
awards
${artist.awards}
<br/>
exhibitions
${artist.exhibitions}
<br/>
クライアント
${artist.clients}
<br/>
支払方法
${artist.paymentmethod}
<br/>
銀行
${artist.bank}
<br/>
支店名
${artist.bankbranch}
<br/>
銀行名
${artist.brankname}
<br/>
銀行口座番号
${artist.bankaccount}
<br/>
口座名
${artist.bankaccountname}
<br/>
ibanno
${artist.ibanno}
<br/>
swiftbicno
${artist.swiftbicno}
<br/>
最近の
${artist.recentlyadded}
<br/>
人気
${artist.poplular}
<br/>
人気度
${artist.poplularity}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
date}" /><br/>
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
date<st:date date="${product.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate<st:date date="${artist.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate}" /><br/>
職種
${artist.typeofbusiness}
<br/>
city
${artist.city}
<br/>
国
${artist.countrystr}
<br/>
電話番号
${artist.phone}
<br/>
担当者電話番号
${artist.responsiblephone}
<br/>
担当者E-Mailアドレス
${artist.responsiblemail}
<br/>
awards
${artist.awards}
<br/>
exhibitions
${artist.exhibitions}
<br/>
クライアント
${artist.clients}
<br/>
支払方法
${artist.paymentmethod}
<br/>
銀行
${artist.bank}
<br/>
支店名
${artist.bankbranch}
<br/>
銀行名
${artist.brankname}
<br/>
銀行口座番号
${artist.bankaccount}
<br/>
口座名
${artist.bankaccountname}
<br/>
ibanno
${artist.ibanno}
<br/>
swiftbicno
${artist.swiftbicno}
<br/>
最近の
${artist.recentlyadded}
<br/>
人気
${artist.poplular}
<br/>
人気度
${artist.poplularity}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
date<st:date date="${work.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate<st:date date="${artist.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate}" /><br/>
職種
${artist.typeofbusiness}
<br/>
city
${artist.city}
<br/>
国
${artist.countrystr}
<br/>
電話番号
${artist.phone}
<br/>
担当者電話番号
${artist.responsiblephone}
<br/>
担当者E-Mailアドレス
${artist.responsiblemail}
<br/>
awards
${artist.awards}
<br/>
exhibitions
${artist.exhibitions}
<br/>
クライアント
${artist.clients}
<br/>
支払方法
${artist.paymentmethod}
<br/>
銀行
${artist.bank}
<br/>
支店名
${artist.bankbranch}
<br/>
銀行名
${artist.brankname}
<br/>
銀行口座番号
${artist.bankaccount}
<br/>
口座名
${artist.bankaccountname}
<br/>
ibanno
${artist.ibanno}
<br/>
swiftbicno
${artist.swiftbicno}
<br/>
最近の
${artist.recentlyadded}
<br/>
人気
${artist.poplular}
<br/>
人気度
${artist.poplularity}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
date}" /><br/>
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
date}" /><br/>
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
</div>				<display:table name="item.choises" id="row" requestURI=".do" pagesize="0" 
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
</div>				<display:table name="product.items" id="row" requestURI=".do" pagesize="0" 
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
</div>				<display:table name="work.products" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
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
filename
${workattachment.filename}
<br/>
mainvisual
${workattachment.mainvisual}
<br/>
dbFile
${workattachment.dbFile}
<br/>
workAttachmentPreviews
<div>
<logic:iterate id="workAttachmentPreview" name="workattachment" property="workAttachmentPreviews">id
${workattachmentpreview.id}
<br/>
workAttachment
${workattachmentpreview.workAttachment}
<br/>
dbFile
${workattachmentpreview.dbFile}
<br/>
xlspng
${workattachmentpreview.xlspng}
<br/>
thumnailsize
${workattachmentpreview.thumnailsize}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="workattachment.workAttachmentPreviews" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="workAttachment">
<nobr>
${row.workAttachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="xlspng">
<nobr>
${row.xlspng}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="thumnailsize">
<nobr>
${row.thumnailsize}
</nobr>
</display:column>
                        </display:table>
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.workAttachments" id="row" requestURI=".do" pagesize="0" 
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
 <display:column media="html" sortable="true" title="filename">
<nobr>
${row.filename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="mainvisual">
<nobr>
${row.mainvisual}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workAttachmentPreviews">
<nobr>
${row.workAttachmentPreviews}
</nobr>
</display:column>
                        </display:table>
<br/>
タイトル
${work.title}
<br/>
ライセンス契約終了年月
expiredate<st:date date="${work.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate<st:date date="${artist.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate}" /><br/>
職種
${artist.typeofbusiness}
<br/>
city
${artist.city}
<br/>
国
${artist.countrystr}
<br/>
電話番号
${artist.phone}
<br/>
担当者電話番号
${artist.responsiblephone}
<br/>
担当者E-Mailアドレス
${artist.responsiblemail}
<br/>
awards
${artist.awards}
<br/>
exhibitions
${artist.exhibitions}
<br/>
クライアント
${artist.clients}
<br/>
支払方法
${artist.paymentmethod}
<br/>
銀行
${artist.bank}
<br/>
支店名
${artist.bankbranch}
<br/>
銀行名
${artist.brankname}
<br/>
銀行口座番号
${artist.bankaccount}
<br/>
口座名
${artist.bankaccountname}
<br/>
ibanno
${artist.ibanno}
<br/>
swiftbicno
${artist.swiftbicno}
<br/>
最近の
${artist.recentlyadded}
<br/>
人気
${artist.poplular}
<br/>
人気度
${artist.poplularity}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
date<st:date date="${work.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate<st:date date="${artist.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate}" /><br/>
職種
${artist.typeofbusiness}
<br/>
city
${artist.city}
<br/>
国
${artist.countrystr}
<br/>
電話番号
${artist.phone}
<br/>
担当者電話番号
${artist.responsiblephone}
<br/>
担当者E-Mailアドレス
${artist.responsiblemail}
<br/>
awards
${artist.awards}
<br/>
exhibitions
${artist.exhibitions}
<br/>
クライアント
${artist.clients}
<br/>
支払方法
${artist.paymentmethod}
<br/>
銀行
${artist.bank}
<br/>
支店名
${artist.bankbranch}
<br/>
銀行名
${artist.brankname}
<br/>
銀行口座番号
${artist.bankaccount}
<br/>
口座名
${artist.bankaccountname}
<br/>
ibanno
${artist.ibanno}
<br/>
swiftbicno
${artist.swiftbicno}
<br/>
最近の
${artist.recentlyadded}
<br/>
人気
${artist.poplular}
<br/>
人気度
${artist.poplularity}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
date}" /><br/>
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
date<st:date date="${product.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate<st:date date="${artist.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate}" /><br/>
職種
${artist.typeofbusiness}
<br/>
city
${artist.city}
<br/>
国
${artist.countrystr}
<br/>
電話番号
${artist.phone}
<br/>
担当者電話番号
${artist.responsiblephone}
<br/>
担当者E-Mailアドレス
${artist.responsiblemail}
<br/>
awards
${artist.awards}
<br/>
exhibitions
${artist.exhibitions}
<br/>
クライアント
${artist.clients}
<br/>
支払方法
${artist.paymentmethod}
<br/>
銀行
${artist.bank}
<br/>
支店名
${artist.bankbranch}
<br/>
銀行名
${artist.brankname}
<br/>
銀行口座番号
${artist.bankaccount}
<br/>
口座名
${artist.bankaccountname}
<br/>
ibanno
${artist.ibanno}
<br/>
swiftbicno
${artist.swiftbicno}
<br/>
最近の
${artist.recentlyadded}
<br/>
人気
${artist.poplular}
<br/>
人気度
${artist.poplularity}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
date<st:date date="${work.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate<st:date date="${artist.名前
${artist.name}
<br/>
日付
date<st:date date="${artist.名前
${artist.name}
<br/>
日付
date}" /><br/>
アドレス
${artist.address}
<br/>
id
${artist.id}
<br/>
url
${artist.url}
<br/>
担当者
${artist.responsible}
<br/>
メール
${artist.mail}
<br/>
country
${artist.country}
<br/>
内部ユーザー
${artist.intraUser}
<br/>
契約
<div>
<logic:iterate id="contract" name="artist" property="contracts">id
${contract.id}
<br/>
アーティスト
${contract.artist}
<br/>
クライアント
${contract.client}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.contracts" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client.id}
</nobr>
</display:column>
                        </display:table>
<br/>
fax
${artist.fax}
<br/>
contact
${artist.contact}
<br/>
カナ
${artist.kana}
<br/>
artistnum
${artist.artistnum}
<br/>
blogrss
${artist.blogrss}
<br/>
delicious
${artist.delicious}
<br/>
flickraccount
${artist.flickraccount}
<br/>
lastfm　account
${artist.lastfmaccount}
<br/>
profile
${artist.profile}
<br/>
インタビュー
${artist.ininterview}
<br/>
worksandstyle
${artist.worksandstyle}
<br/>
history
${artist.history}
<br/>
誕生日
birthdate}" /><br/>
職種
${artist.typeofbusiness}
<br/>
city
${artist.city}
<br/>
国
${artist.countrystr}
<br/>
電話番号
${artist.phone}
<br/>
担当者電話番号
${artist.responsiblephone}
<br/>
担当者E-Mailアドレス
${artist.responsiblemail}
<br/>
awards
${artist.awards}
<br/>
exhibitions
${artist.exhibitions}
<br/>
クライアント
${artist.clients}
<br/>
支払方法
${artist.paymentmethod}
<br/>
銀行
${artist.bank}
<br/>
支店名
${artist.bankbranch}
<br/>
銀行名
${artist.brankname}
<br/>
銀行口座番号
${artist.bankaccount}
<br/>
口座名
${artist.bankaccountname}
<br/>
ibanno
${artist.ibanno}
<br/>
swiftbicno
${artist.swiftbicno}
<br/>
最近の
${artist.recentlyadded}
<br/>
人気
${artist.poplular}
<br/>
人気度
${artist.poplularity}
<br/>
作品
<div>
<logic:iterate id="work" name="artist" property="works">名前
${work.name}
<br/>
日付
date}" /><br/>
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
date}" /><br/>
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
</div>				<display:table name="item.choises" id="row" requestURI=".do" pagesize="0" 
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
</div>				<display:table name="product.items" id="row" requestURI=".do" pagesize="0" 
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
</div>				<display:table name="work.products" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
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
filename
${workattachment.filename}
<br/>
mainvisual
${workattachment.mainvisual}
<br/>
dbFile
${workattachment.dbFile}
<br/>
workAttachmentPreviews
<div>
<logic:iterate id="workAttachmentPreview" name="workattachment" property="workAttachmentPreviews">id
${workattachmentpreview.id}
<br/>
workAttachment
${workattachmentpreview.workAttachment}
<br/>
dbFile
${workattachmentpreview.dbFile}
<br/>
xlspng
${workattachmentpreview.xlspng}
<br/>
thumnailsize
${workattachmentpreview.thumnailsize}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="workattachment.workAttachmentPreviews" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="workAttachment">
<nobr>
${row.workAttachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="xlspng">
<nobr>
${row.xlspng}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="thumnailsize">
<nobr>
${row.thumnailsize}
</nobr>
</display:column>
                        </display:table>
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.workAttachments" id="row" requestURI=".do" pagesize="0" 
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
 <display:column media="html" sortable="true" title="filename">
<nobr>
${row.filename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="mainvisual">
<nobr>
${row.mainvisual}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workAttachmentPreviews">
<nobr>
${row.workAttachmentPreviews}
</nobr>
</display:column>
                        </display:table>
<br/>
タイトル
${work.title}
<br/>
ライセンス契約終了年月
expiredate}" /><br/>
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
sharedWorkXlsFile
${work.sharedWorkXlsFile}
<br/>
status
${work.status}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
licenced
${work.licenced}
<br/>
japanesecilentrequest
${work.japanesecilentrequest}
<br/>
japaneseclientname
${work.japaneseclientname}
<br/>
japanesecomments
${work.japanesecomments}
<br/>
japanesecopywrite
${work.japanesecopywrite}
<br/>
japanesecredit
${work.japanesecredit}
<br/>
japanesedescription
${work.japanesedescription}
<br/>
japaneseexposurehistory
${work.japaneseexposurehistory}
<br/>
japaneseparticulars
${work.japaneseparticulars}
<br/>
japaneseproductionpurpose
${work.japaneseproductionpurpose}
<br/>
japaneseprojectname
${work.japaneseprojectname}
<br/>
japanesetitle
${work.japanesetitle}
<br/>
workTaggings
<div>
<logic:iterate id="workTagging" name="work" property="workTaggings">id
${worktagging.id}
<br/>
tag
${worktagging.tag}
<br/>
work
${worktagging.work}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.workTaggings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="work">
<nobr>
${row.work.id}
</nobr>
</display:column>
                        </display:table>
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.works" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
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
<st:date date="${row.expiredate}" /> </nobr>
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
 <display:column media="html" sortable="true" title="sharedWorkXlsFile">
<nobr>
${row.sharedWorkXlsFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="status">
<nobr>
${row.status}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="folderrelativepath">
<nobr>
${row.folderrelativepath}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="licenced">
<nobr>
${row.licenced}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesecilentrequest">
<nobr>
${row.japanesecilentrequest}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseclientname">
<nobr>
${row.japaneseclientname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesecomments">
<nobr>
${row.japanesecomments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesecopywrite">
<nobr>
${row.japanesecopywrite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesecredit">
<nobr>
${row.japanesecredit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesedescription">
<nobr>
${row.japanesedescription}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseexposurehistory">
<nobr>
${row.japaneseexposurehistory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseparticulars">
<nobr>
${row.japaneseparticulars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseproductionpurpose">
<nobr>
${row.japaneseproductionpurpose}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseprojectname">
<nobr>
${row.japaneseprojectname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesetitle">
<nobr>
${row.japanesetitle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workTaggings">
<nobr>
${row.workTaggings}
</nobr>
</display:column>
                        </display:table>
<br/>
profileimage
${artist.profileimage}
<br/>
eventAttendances
<div>
<logic:iterate id="eventAttendance" name="artist" property="eventAttendances">id
${eventattendance.id}
<br/>
イベント
${eventattendance.event}
<br/>
アーティスト
${eventattendance.artist}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.eventAttendances" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
                        </display:table>
<br/>
受賞歴
<div>
<logic:iterate id="awordWInner" name="artist" property="awordWInners">id
${awordwinner.id}
<br/>
賞
${awordwinner.award}
<br/>
アーティスト
${awordwinner.artist}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.awordWInners" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="賞">
<nobr>
${row.award.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
                        </display:table>
<br/>
portrait
${artist.portrait}
<br/>
ニュース
				<display:table name="artist.news" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
                        </display:table>
<br/>
ジャンル
${artist.genre}
<br/>
artistXlsFile
${artist.artistXlsFile}
<br/>
account
${artist.account}
<br/>
password
${artist.password}
<br/>
japanesename
${artist.japanesename}
<br/>
japaneserepresentativekana
${artist.japaneserepresentativekana}
<br/>
japaneserepresentativename
${artist.japaneserepresentativename}
<br/>
representativeenglish
${artist.representativeenglish}
<br/>
profilejapanese
${artist.profilejapanese}
<br/>
status
${artist.status}
<br/>
organizer
${artist.organizer}
<br/>
japaneseorganizer
${artist.japaneseorganizer}
<br/>
japanesetypeofbusiness
${artist.japanesetypeofbusiness}
<br/>
japaneseaddress
${artist.japaneseaddress}
<br/>
japaneseresponsible
${artist.japaneseresponsible}
<br/>
japaneseawards
${artist.japaneseawards}
<br/>
japaneseclients
${artist.japaneseclients}
<br/>
japaneseprofile
${artist.japaneseprofile}
<br/>
japanesebranchname
${artist.japanesebranchname}
<br/>
japanesebank
${artist.japanesebank}
<br/>
japanesebankaccountname
${artist.japanesebankaccountname}
<br/>
japaneseexhibitions
${artist.japaneseexhibitions}
<br/>
basiclanguage
${artist.basiclanguage}
<br/>
disciplinestring
${artist.disciplinestring}
<br/>
descipline
${artist.descipline}
<br/>
discipline
${artist.discipline}
<br/>
branchaddress
${artist.branchaddress}
<br/>
ziperror
${artist.ziperror}
<br/>
mainvisual
${artist.mainvisual}
<br/>
artistTaggings
<div>
<logic:iterate id="artistTagging" name="artist" property="artistTaggings">id
${artisttagging.id}
<br/>
tag
${artisttagging.tag}
<br/>
artist
${artisttagging.artist}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.artistTaggings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="artist">
<nobr>
${row.artist.id}
</nobr>
</display:column>
                        </display:table>
<br/>

    </logic:iterate>



</div>
	</body>
</html:html>

