<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/tags/struts-html.tld" prefix="html" %>
<%@ taglib uri="/tags/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>



<%@ page isELIgnored="false" %>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="ユーザー一覧" direct="true" />
	<tiles:put name="content" direct="true">

                    <display:table name="${users}" id="row" requestURI="Users.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowUser.do?id=${row.id}">Show</a> | 
                        <a href="PostUserDetail.do?id=${row.id}"><img src="images/icons/table_edit.png">編集</a>
                        <a href="#" onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteUser.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">削除
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ユーザーネーム">
<nobr>
${row.username}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サイクルマッチング">
<nobr>
${row.cycleMatchings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミッション支払">
<nobr>
${row.commitionPayments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="追加日"><nobr>
<bean:write name="row" property="addeddate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="カナ">
<nobr>
${row.kana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="英語名">
<nobr>
${row.englishname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.sex}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.phonenum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ログイン状態を保存する">
<nobr>
${row.rememberme}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="infoseekmail">
<nobr>
${row.infoseekmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号">
<nobr>
${row.zip}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="建物名">
<nobr>
${row.buildingname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="誕生日"><nobr>
<bean:write name="row" property="birthdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="mailhp">
<nobr>
${row.mailhp}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="mailpass">
<nobr>
${row.mailpass}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="銀行未登録">
<nobr>
${row.bankvalid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="銀行">
<nobr>
${row.bank}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="yuchonum">
<nobr>
${row.yuchonum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="口座番号">
<nobr>
${row.banknumber}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="口座名">
<nobr>
${row.bankaccountname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="身分証明書No">
<nobr>
${row.certificationNumber}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミッション支払残高">
<nobr>
${row.currentcommition}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支払済コミッション">
<nobr>
${row.paidcommition}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="introductionsAsIntroduced">
<nobr>
${row.introductionsAsIntroduced}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="introductionsAsIntroducer">
<nobr>
${row.introductionsAsIntroducer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="身分証明書">
<nobr>
${row.certificationType.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サイクル">
<nobr>
${row.cycles}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ポジション">
<nobr>
${row.positions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="フラグ">
<nobr>
${row.flag}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="禁止">
<nobr>
${row.banned}
</nobr>
</display:column>

                    </display:table>
	</tiles:put>
</tiles:insert>
