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
ヘッダー
${site.header}
<br/>
id
${site.id}
<br/>
url
${site.url}
<br/>
フッター
${site.footer}
<br/>
モバイルURL
${site.mobileurl}
<br/>
specialtemplateusing
${site.specialtemplateusing}
<br/>
userexporturl
${site.userexporturl}
<br/>
ハッシュ
${site.hash}
<br/>
パブリックユーザー
<div>
<logic:iterate id="publicUser" name="site" property="publicUsers">id
${publicuser.id}
<br/>
パスワード
${publicuser.password}
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
配送日
${publicuser.deliverydate}
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
削除済み
${publicuser.removed}
<br/>
サイト
${publicuser.site}
<br/>
名前
${publicuser.name}
<br/>
アドレス
${publicuser.address}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="site.publicUsers" id="row" requestURI="ForUrls.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
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
 <display:column media="html" sortable="true" title="配送日">
<nobr>
${row.deliverydate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="カナ">
<nobr>
${row.kana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.phone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送時間">
<nobr>
${row.devliveryhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.deliveryphone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="カナ">
<nobr>
${row.deliverykana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所">
<nobr>
${row.deliveryblocknumber}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所">
<nobr>
${row.deliveryaddress}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.deliveryname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号4桁">
<nobr>
${row.deliveryzipfour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号3桁">
<nobr>
${row.deliveryzipthree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="都道府県">
<nobr>
${row.deliverypref}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="別のアドレスへ">
<nobr>
${row.delivertodifferentaddress}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所">
<nobr>
${row.blocknumber}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="男性">
<nobr>
${row.male}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="誕生日">
<nobr>
${row.brithday}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール確認">
<nobr>
${row.mailforconfirm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="生月">
<nobr>
${row.birthmonth}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="municipality">
<nobr>
${row.municipality}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="生年">
<nobr>
${row.birthyear}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="携帯番号">
<nobr>
${row.keitai}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="建物名">
<nobr>
${row.buildingname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="県">
<nobr>
${row.pref}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="管理者">
<nobr>
${row.admin}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="削除済み">
<nobr>
${row.removed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サイト">
<nobr>
${row.site.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>
                        </display:table>
<br/>
メールマガジン
<div>
<logic:iterate id="mailmag" name="site" property="mailmags">id
${mailmag.id}
<br/>
人気度
${mailmag.poplularity}
<br/>
最近の
${mailmag.recentlyadded}
<br/>
分割配送の
${mailmag.devidedlyderivered}
<br/>
予約日時
<bean:write name="mailmag" property="reservationdate" format="yyyy/MM/dd" />
<br/>
分割
<div>
<logic:iterate id="division" name="mailmag" property="divisions">id
${division.id}
<br/>
終了日時
<bean:write name="division" property="enddate" format="yyyy/MM/dd" />
<br/>
開始日時
<bean:write name="division" property="startdate" format="yyyy/MM/dd" />
<br/>
最初のメール
${division.startmail}
<br/>
メールマガジン
${division.mailmag}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="mailmag.divisions" id="row" requestURI="ForUrls.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="終了日時"><nobr>
<bean:write name="row" property="enddate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="開始日時"><nobr>
<bean:write name="row" property="startdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="最初のメール">
<nobr>
${row.startmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メールマガジン">
<nobr>
${row.mailmag.id}
</nobr>
</display:column>
                        </display:table>
<br/>
urls
<div>
<logic:iterate id="url" name="mailmag" property="urls">id
${url.id}
<br/>
url
${url.url}
<br/>
短縮URL
${url.shorturl}
<br/>
クリック数
${url.clicknum}
<br/>
メールマガジン
${url.mailmag}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="mailmag.urls" id="row" requestURI="ForUrls.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="url">
<nobr>
${row.url}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="短縮URL">
<nobr>
${row.shorturl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クリック数">
<nobr>
${row.clicknum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メールマガジン">
<nobr>
${row.mailmag.id}
</nobr>
</display:column>
                        </display:table>
<br/>
サイト
${mailmag.site}
<br/>
予約済みの
${mailmag.reserved}
<br/>
タイトル
${mailmag.title}
<br/>
説明
${mailmag.description}
<br/>
日付
<bean:write name="mailmag" property="date" format="yyyy/MM/dd" />
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="site.mailmags" id="row" requestURI="ForUrls.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気度">
<nobr>
${row.poplularity}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="分割配送の">
<nobr>
${row.devidedlyderivered}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="予約日時"><nobr>
<bean:write name="row" property="reservationdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="分割">
<nobr>
${row.divisions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="urls">
<nobr>
${row.urls}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サイト">
<nobr>
${row.site.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="予約済みの">
<nobr>
${row.reserved}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
                        </display:table>
<br/>


</div>



	</body>
</html:html>


