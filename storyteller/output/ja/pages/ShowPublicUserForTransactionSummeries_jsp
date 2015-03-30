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

<tiles:insert definition=".publicLayout">
	<tiles:put name="title" value="##japanese##" direct="true" />
	<tiles:put name="content" direct="true">

<div>
id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount}" /><br/>
ＳＥＱＮＯ
${accounttransaction.seqno}
<br/>
取引日
${accounttransaction.transactiondate}
<br/>
起算日
reckondate<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount}" /><br/>
ＳＥＱＮＯ
${accounttransaction.seqno}
<br/>
取引日
${accounttransaction.transactiondate}
<br/>
起算日
reckondate}" /><br/>
相手科目短縮コード
${accounttransaction.peeraccountingcodeinshort}
<br/>
摘要
${accounttransaction.abstraction}
<br/>
現振判定コード
${accounttransaction.genhuricode}
<br/>
貸借判定
${accounttransaction.taishaku}
<br/>
取引対象者区分
${accounttransaction.peertype}
<br/>
形態コード
${accounttransaction.typecode}
<br/>
任意集計コード１
${accounttransaction.variablestatscodeone}
<br/>
任意集計コード２
${accounttransaction.variablestatscodetwo}
<br/>
消費税区分
${accounttransaction.taxtype}
<br/>
JA用報告書区分
${accounttransaction.reportingtype}
<br/>
情報管理コード
${accounttransaction.infocode}
<br/>
データパターン
${accounttransaction.datapattern}
<br/>
UPDATEUSERID
${accounttransaction.updateuserid}
<br/>
入力日
${accounttransaction.inputeddate}
<br/>
旧基本コード
${accounttransaction.oldbasecode}
<br/>
旧内訳コード
${accounttransaction.olddetailedcode}
<br/>
営農コード
${accounttransaction.category}
<br/>
取引金額
${accounttransaction.value}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.accountTransactions" id="row" requestURI="ForTransactionSummeries.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="農協コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取明NO">
<nobr>
${row.no}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="本体消費税区分">
<nobr>
${row.bodytaxtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="本支所コード">
<nobr>
${row.branch}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="組合員コード"><nobr>
<st:date date="${row.dateinaccount}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ＳＥＱＮＯ">
<nobr>
${row.seqno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引日">
<nobr>
${row.transactiondate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="起算日"><nobr>
<st:date date="${row.reckondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="相手科目短縮コード">
<nobr>
${row.peeraccountingcodeinshort}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="摘要">
<nobr>
${row.abstraction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="現振判定コード">
<nobr>
${row.genhuricode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="貸借判定">
<nobr>
${row.taishaku}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引対象者区分">
<nobr>
${row.peertype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="形態コード">
<nobr>
${row.typecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード１">
<nobr>
${row.variablestatscodeone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード２">
<nobr>
${row.variablestatscodetwo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="消費税区分">
<nobr>
${row.taxtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="JA用報告書区分">
<nobr>
${row.reportingtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="情報管理コード">
<nobr>
${row.infocode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="データパターン">
<nobr>
${row.datapattern}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="UPDATEUSERID">
<nobr>
${row.updateuserid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入力日">
<nobr>
${row.inputeddate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="旧基本コード">
<nobr>
${row.oldbasecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="旧内訳コード">
<nobr>
${row.olddetailedcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="営農コード">
<nobr>
${row.category.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引金額">
<nobr>
${row.value}
</nobr>
</display:column>
                        </display:table>
<br/>
金融機関コード
${publicuser.accountofficecode}
<br/>
店舗コード
${publicuser.shopcode}
<br/>
科目コード
${publicuser.departmentcode}
<br/>
口座番号
${publicuser.accountnumber}
<br/>
口座状態
${publicuser.accountstatus}
<br/>
閉鎖解除年月日
closurebreakdate<st:date date="${publicuser.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount}" /><br/>
ＳＥＱＮＯ
${accounttransaction.seqno}
<br/>
取引日
${accounttransaction.transactiondate}
<br/>
起算日
reckondate<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount}" /><br/>
ＳＥＱＮＯ
${accounttransaction.seqno}
<br/>
取引日
${accounttransaction.transactiondate}
<br/>
起算日
reckondate}" /><br/>
相手科目短縮コード
${accounttransaction.peeraccountingcodeinshort}
<br/>
摘要
${accounttransaction.abstraction}
<br/>
現振判定コード
${accounttransaction.genhuricode}
<br/>
貸借判定
${accounttransaction.taishaku}
<br/>
取引対象者区分
${accounttransaction.peertype}
<br/>
形態コード
${accounttransaction.typecode}
<br/>
任意集計コード１
${accounttransaction.variablestatscodeone}
<br/>
任意集計コード２
${accounttransaction.variablestatscodetwo}
<br/>
消費税区分
${accounttransaction.taxtype}
<br/>
JA用報告書区分
${accounttransaction.reportingtype}
<br/>
情報管理コード
${accounttransaction.infocode}
<br/>
データパターン
${accounttransaction.datapattern}
<br/>
UPDATEUSERID
${accounttransaction.updateuserid}
<br/>
入力日
${accounttransaction.inputeddate}
<br/>
旧基本コード
${accounttransaction.oldbasecode}
<br/>
旧内訳コード
${accounttransaction.olddetailedcode}
<br/>
営農コード
${accounttransaction.category}
<br/>
取引金額
${accounttransaction.value}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.accountTransactions" id="row" requestURI="ForTransactionSummeries.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="農協コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取明NO">
<nobr>
${row.no}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="本体消費税区分">
<nobr>
${row.bodytaxtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="本支所コード">
<nobr>
${row.branch}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="組合員コード"><nobr>
<st:date date="${row.dateinaccount}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ＳＥＱＮＯ">
<nobr>
${row.seqno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引日">
<nobr>
${row.transactiondate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="起算日"><nobr>
<st:date date="${row.reckondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="相手科目短縮コード">
<nobr>
${row.peeraccountingcodeinshort}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="摘要">
<nobr>
${row.abstraction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="現振判定コード">
<nobr>
${row.genhuricode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="貸借判定">
<nobr>
${row.taishaku}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引対象者区分">
<nobr>
${row.peertype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="形態コード">
<nobr>
${row.typecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード１">
<nobr>
${row.variablestatscodeone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード２">
<nobr>
${row.variablestatscodetwo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="消費税区分">
<nobr>
${row.taxtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="JA用報告書区分">
<nobr>
${row.reportingtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="情報管理コード">
<nobr>
${row.infocode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="データパターン">
<nobr>
${row.datapattern}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="UPDATEUSERID">
<nobr>
${row.updateuserid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入力日">
<nobr>
${row.inputeddate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="旧基本コード">
<nobr>
${row.oldbasecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="旧内訳コード">
<nobr>
${row.olddetailedcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="営農コード">
<nobr>
${row.category.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引金額">
<nobr>
${row.value}
</nobr>
</display:column>
                        </display:table>
<br/>
金融機関コード
${publicuser.accountofficecode}
<br/>
店舗コード
${publicuser.shopcode}
<br/>
科目コード
${publicuser.departmentcode}
<br/>
口座番号
${publicuser.accountnumber}
<br/>
口座状態
${publicuser.accountstatus}
<br/>
閉鎖解除年月日
closurebreakdate}" /><br/>
解約区分
${publicuser.closuretype}
<br/>
所属支所コード
${publicuser.branchcode}
<br/>
経営形態
${publicuser.managementtype}
<br/>
地区コード
${publicuser.areacode}
<br/>
任意集計コード１
${publicuser.varialblestatscode}
<br/>
任意集計コード２
${publicuser.varialblestatscodetwo}
<br/>
内訳資料区分
${publicuser.detaileddocumenttype}
<br/>
レイアウトＮＯ
${publicuser.layoutno}
<br/>
帳票制御コード
${publicuser.printingcontrolcode}
<br/>
ソリマチ対象者区分
${publicuser.sorimachitargettype}
<br/>
取引残高
${publicuser.remaining}
<br/>
受入累計
${publicuser.totalincome}
<br/>
最終取引経理年月日
lasttransactiondate<st:date date="${publicuser.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount}" /><br/>
ＳＥＱＮＯ
${accounttransaction.seqno}
<br/>
取引日
${accounttransaction.transactiondate}
<br/>
起算日
reckondate<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount}" /><br/>
ＳＥＱＮＯ
${accounttransaction.seqno}
<br/>
取引日
${accounttransaction.transactiondate}
<br/>
起算日
reckondate}" /><br/>
相手科目短縮コード
${accounttransaction.peeraccountingcodeinshort}
<br/>
摘要
${accounttransaction.abstraction}
<br/>
現振判定コード
${accounttransaction.genhuricode}
<br/>
貸借判定
${accounttransaction.taishaku}
<br/>
取引対象者区分
${accounttransaction.peertype}
<br/>
形態コード
${accounttransaction.typecode}
<br/>
任意集計コード１
${accounttransaction.variablestatscodeone}
<br/>
任意集計コード２
${accounttransaction.variablestatscodetwo}
<br/>
消費税区分
${accounttransaction.taxtype}
<br/>
JA用報告書区分
${accounttransaction.reportingtype}
<br/>
情報管理コード
${accounttransaction.infocode}
<br/>
データパターン
${accounttransaction.datapattern}
<br/>
UPDATEUSERID
${accounttransaction.updateuserid}
<br/>
入力日
${accounttransaction.inputeddate}
<br/>
旧基本コード
${accounttransaction.oldbasecode}
<br/>
旧内訳コード
${accounttransaction.olddetailedcode}
<br/>
営農コード
${accounttransaction.category}
<br/>
取引金額
${accounttransaction.value}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.accountTransactions" id="row" requestURI="ForTransactionSummeries.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="農協コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取明NO">
<nobr>
${row.no}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="本体消費税区分">
<nobr>
${row.bodytaxtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="本支所コード">
<nobr>
${row.branch}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="組合員コード"><nobr>
<st:date date="${row.dateinaccount}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ＳＥＱＮＯ">
<nobr>
${row.seqno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引日">
<nobr>
${row.transactiondate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="起算日"><nobr>
<st:date date="${row.reckondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="相手科目短縮コード">
<nobr>
${row.peeraccountingcodeinshort}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="摘要">
<nobr>
${row.abstraction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="現振判定コード">
<nobr>
${row.genhuricode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="貸借判定">
<nobr>
${row.taishaku}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引対象者区分">
<nobr>
${row.peertype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="形態コード">
<nobr>
${row.typecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード１">
<nobr>
${row.variablestatscodeone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード２">
<nobr>
${row.variablestatscodetwo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="消費税区分">
<nobr>
${row.taxtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="JA用報告書区分">
<nobr>
${row.reportingtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="情報管理コード">
<nobr>
${row.infocode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="データパターン">
<nobr>
${row.datapattern}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="UPDATEUSERID">
<nobr>
${row.updateuserid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入力日">
<nobr>
${row.inputeddate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="旧基本コード">
<nobr>
${row.oldbasecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="旧内訳コード">
<nobr>
${row.olddetailedcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="営農コード">
<nobr>
${row.category.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引金額">
<nobr>
${row.value}
</nobr>
</display:column>
                        </display:table>
<br/>
金融機関コード
${publicuser.accountofficecode}
<br/>
店舗コード
${publicuser.shopcode}
<br/>
科目コード
${publicuser.departmentcode}
<br/>
口座番号
${publicuser.accountnumber}
<br/>
口座状態
${publicuser.accountstatus}
<br/>
閉鎖解除年月日
closurebreakdate<st:date date="${publicuser.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount}" /><br/>
ＳＥＱＮＯ
${accounttransaction.seqno}
<br/>
取引日
${accounttransaction.transactiondate}
<br/>
起算日
reckondate<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount<st:date date="${accounttransaction.id
${publicuser.id}
<br/>
ＪＡコード
${publicuser.code}
<br/>
受入累計
${publicuser.totalcost}
<br/>
情報管理コード
${publicuser.infocode}
<br/>
農協コード
${publicuser.jacode}
<br/>
取引
<div>
<logic:iterate id="accountTransaction" name="publicuser" property="accountTransactions">id
${accounttransaction.id}
<br/>
一般ユーザー
${accounttransaction.publicUser}
<br/>
農協コード
${accounttransaction.code}
<br/>
取明NO
${accounttransaction.no}
<br/>
本体消費税区分
${accounttransaction.bodytaxtype}
<br/>
本支所コード
${accounttransaction.branch}
<br/>
組合員コード
dateinaccount}" /><br/>
ＳＥＱＮＯ
${accounttransaction.seqno}
<br/>
取引日
${accounttransaction.transactiondate}
<br/>
起算日
reckondate}" /><br/>
相手科目短縮コード
${accounttransaction.peeraccountingcodeinshort}
<br/>
摘要
${accounttransaction.abstraction}
<br/>
現振判定コード
${accounttransaction.genhuricode}
<br/>
貸借判定
${accounttransaction.taishaku}
<br/>
取引対象者区分
${accounttransaction.peertype}
<br/>
形態コード
${accounttransaction.typecode}
<br/>
任意集計コード１
${accounttransaction.variablestatscodeone}
<br/>
任意集計コード２
${accounttransaction.variablestatscodetwo}
<br/>
消費税区分
${accounttransaction.taxtype}
<br/>
JA用報告書区分
${accounttransaction.reportingtype}
<br/>
情報管理コード
${accounttransaction.infocode}
<br/>
データパターン
${accounttransaction.datapattern}
<br/>
UPDATEUSERID
${accounttransaction.updateuserid}
<br/>
入力日
${accounttransaction.inputeddate}
<br/>
旧基本コード
${accounttransaction.oldbasecode}
<br/>
旧内訳コード
${accounttransaction.olddetailedcode}
<br/>
営農コード
${accounttransaction.category}
<br/>
取引金額
${accounttransaction.value}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.accountTransactions" id="row" requestURI="ForTransactionSummeries.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="農協コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取明NO">
<nobr>
${row.no}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="本体消費税区分">
<nobr>
${row.bodytaxtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="本支所コード">
<nobr>
${row.branch}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="組合員コード"><nobr>
<st:date date="${row.dateinaccount}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ＳＥＱＮＯ">
<nobr>
${row.seqno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引日">
<nobr>
${row.transactiondate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="起算日"><nobr>
<st:date date="${row.reckondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="相手科目短縮コード">
<nobr>
${row.peeraccountingcodeinshort}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="摘要">
<nobr>
${row.abstraction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="現振判定コード">
<nobr>
${row.genhuricode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="貸借判定">
<nobr>
${row.taishaku}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引対象者区分">
<nobr>
${row.peertype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="形態コード">
<nobr>
${row.typecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード１">
<nobr>
${row.variablestatscodeone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="任意集計コード２">
<nobr>
${row.variablestatscodetwo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="消費税区分">
<nobr>
${row.taxtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="JA用報告書区分">
<nobr>
${row.reportingtype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="情報管理コード">
<nobr>
${row.infocode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="データパターン">
<nobr>
${row.datapattern}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="UPDATEUSERID">
<nobr>
${row.updateuserid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入力日">
<nobr>
${row.inputeddate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="旧基本コード">
<nobr>
${row.oldbasecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="旧内訳コード">
<nobr>
${row.olddetailedcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="営農コード">
<nobr>
${row.category.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="取引金額">
<nobr>
${row.value}
</nobr>
</display:column>
                        </display:table>
<br/>
金融機関コード
${publicuser.accountofficecode}
<br/>
店舗コード
${publicuser.shopcode}
<br/>
科目コード
${publicuser.departmentcode}
<br/>
口座番号
${publicuser.accountnumber}
<br/>
口座状態
${publicuser.accountstatus}
<br/>
閉鎖解除年月日
closurebreakdate}" /><br/>
解約区分
${publicuser.closuretype}
<br/>
所属支所コード
${publicuser.branchcode}
<br/>
経営形態
${publicuser.managementtype}
<br/>
地区コード
${publicuser.areacode}
<br/>
任意集計コード１
${publicuser.varialblestatscode}
<br/>
任意集計コード２
${publicuser.varialblestatscodetwo}
<br/>
内訳資料区分
${publicuser.detaileddocumenttype}
<br/>
レイアウトＮＯ
${publicuser.layoutno}
<br/>
帳票制御コード
${publicuser.printingcontrolcode}
<br/>
ソリマチ対象者区分
${publicuser.sorimachitargettype}
<br/>
取引残高
${publicuser.remaining}
<br/>
受入累計
${publicuser.totalincome}
<br/>
最終取引経理年月日
lasttransactiondate}" /><br/>
要精算額当初金額
${publicuser.nonaccountedatfirst}
<br/>
要精算額累計金額
${publicuser.nonaccountedatlast}
<br/>
集計
				<display:table name="publicuser.transactionSummeries" id="row" requestURI="ForTransactionSummeries.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
                        </display:table>
<br/>
地区
${publicuser.area}
<br/>
userInfo
${publicuser.userInfo}
<br/>
組合員名
${publicuser.name}
<br/>
種類
${publicuser.type}
<br/>


</div>




	</tiles:put>
</tiles:insert>
