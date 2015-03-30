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
銀行
${publicuser.bank}
<br/>
銀行口座番号
${publicuser.bankaccount}
<br/>
名前
${publicuser.name}
<br/>
account
<div>
<logic:iterate id="account" name="publicuser" property="accounts">id
${account.id}
<br/>
パスワード
${account.password}
<br/>
一般ユーザー
${account.publicUser}
<br/>
アカウント
${account.account}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.accounts" id="row" requestURI="ForAccounts.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アカウント">
<nobr>
${row.account}
</nobr>
</display:column>
                        </display:table>
<br/>
アドレス
${publicuser.address}
<br/>
日付
date<st:date date="${publicuser.銀行
${publicuser.bank}
<br/>
銀行口座番号
${publicuser.bankaccount}
<br/>
名前
${publicuser.name}
<br/>
account
<div>
<logic:iterate id="account" name="publicuser" property="accounts">id
${account.id}
<br/>
パスワード
${account.password}
<br/>
一般ユーザー
${account.publicUser}
<br/>
アカウント
${account.account}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.accounts" id="row" requestURI="ForAccounts.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アカウント">
<nobr>
${row.account}
</nobr>
</display:column>
                        </display:table>
<br/>
アドレス
${publicuser.address}
<br/>
日付
date}" /><br/>
superuser
${publicuser.superuser}
<br/>
branchname
${publicuser.branchname}
<br/>
パスワード
${publicuser.password}
<br/>
カナ
${publicuser.kana}
<br/>
支店名
${publicuser.bankbranch}
<br/>
口座名
${publicuser.bankaccountname}
<br/>
アカウント
${publicuser.account}
<br/>
メール
${publicuser.mail}
<br/>
id
${publicuser.id}
<br/>
購入
<div>
<logic:iterate id="purchase" name="publicuser" property="purchases">id
${purchase.id}
<br/>
一般ユーザー
${purchase.publicUser}
<br/>
合計
${purchase.total}
<br/>
合計注文数
${purchase.totalordernum}
<br/>
発送済み
${purchase.shipped}
<br/>
時間
${purchase.hour}
<br/>
請求済み
${purchase.invoiced}
<br/>
支払済
${purchase.paid}
<br/>
月
${purchase.month}
<br/>
年
${purchase.year}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="publicuser.purchases" id="row" requestURI="ForAccounts.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計">
<nobr>
${row.total}
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
 <display:column media="html" sortable="true" title="時間">
<nobr>
${row.hour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="請求済み">
<nobr>
${row.invoiced}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支払済">
<nobr>
${row.paid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="月">
<nobr>
${row.month}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年">
<nobr>
${row.year}
</nobr>
</display:column>
                        </display:table>
<br/>


</div>




	</tiles:put>
</tiles:insert>
