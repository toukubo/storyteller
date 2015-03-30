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
<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>

<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<span class="title">一覧</span>
                    <display:table name="${resultAndProductivitys}" id="row" requestURI="ResultAndProductivitys.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ResultAndProductivitys.do?id=${row.id}">編集</a>
                        <a href="DeleteResultAndProductivity.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="month">
<nobr>
${row.month}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年">
<nobr>
${row.year}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="種類">
<nobr>
${row.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="店舗名">
<nobr>
${row.shop.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="担当者">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="売上新車"><nobr>
<bean:write name="row" property="todate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="売上新車">
<nobr>
${row.salesnew}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車顧客併有車代替台数">
<nobr>
${row.newcustomerparallel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車社員紹介台数">
<nobr>
${row.usedotherintroductionemployee}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車その他の紹介台数">
<nobr>
${row.usedotherintroductionother}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="売上中古車">
<nobr>
${row.salesused}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入庫台数車検">
<nobr>
${row.storageinspection}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入庫台数12点">
<nobr>
${row.storage12}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入庫台数ＭＳＣ">
<nobr>
${row.storagemsc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="assurancenew">
<nobr>
${row.assurancenew}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="assurancecontinuance">
<nobr>
${row.assurancecontinuance}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車利益">
<nobr>
${row.profitnew}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車利益">
<nobr>
${row.profitused}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車顧客代替台数">
<nobr>
${row.newcustomeralternatives}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車顧客増車台数">
<nobr>
${row.newcustomerincrement}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車顧客紹介台数">
<nobr>
${row.newcustomerintroduction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車他銘柄代替台数">
<nobr>
${row.newnewotheralternatives}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車新規台数">
<nobr>
${row.newnewothernew}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車業者仕切台数">
<nobr>
${row.newvendormarket}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車業者紹介台数">
<nobr>
${row.newvendorintroduction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車社員紹介台数">
<nobr>
${row.newotherintroductionemployee}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車その他の紹介台数">
<nobr>
${row.newotherintroductionother}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車顧客代替台数">
<nobr>
${row.usedcustomeralternatives}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車顧客増車台数">
<nobr>
${row.usedcustomerincrement}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車顧客紹介台数">
<nobr>
${row.usedcustomerintroduction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車顧客併有車代替台数">
<nobr>
${row.usedcustomerparallel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車他銘柄代替台数">
<nobr>
${row.usednewotheralternatives}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車新規台数">
<nobr>
${row.usednewothernew}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車業者仕切台数">
<nobr>
${row.usedvendormarket}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車業者紹介台数">
<nobr>
${row.usedvendorintroduction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="売上新車">
<nobr>
${row.base.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="売上新車">
<nobr>
${row.newsales}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="売上中古車">
<nobr>
${row.usedsales}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="保険件数新規件数">
<nobr>
${row.newassurancenew}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="保険件数継続件数">
<nobr>
${row.usedassurancecontinuance}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車利益">
<nobr>
${row.newprofit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車利益">
<nobr>
${row.usedprofit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車その他の紹介台数">
<nobr>
${row.newotherintroductionothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車その他の紹介台数">
<nobr>
${row.usedotherintroductionothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="活動量店頭面談数">
<nobr>
${row.activitystorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="活動量訪問面談数">
<nobr>
${row.activityvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="活動量ＳＬＣ（除くＤＭ）">
<nobr>
${row.activityslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="活動量メール">
<nobr>
${row.activitymail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="活動量電話">
<nobr>
${row.activitytel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客活動量顧客店頭面談数">
<nobr>
${row.customeractivitystorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客活動量顧客訪問面談数">
<nobr>
${row.customeractivityvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客活動量顧客ＳＬＣ（除くＤＭ）">
<nobr>
${row.customeractivityslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客活動量顧客メール">
<nobr>
${row.customeractivitymail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客活動量顧客電話">
<nobr>
${row.customeractivitytel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客数">
<nobr>
${row.customernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ＣＳスコア">
<nobr>
${row.customerscore}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年間の目標">
<nobr>
${row.termgoal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="上期のゴール">
<nobr>
${row.firsthalfgoal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="下期のゴール">
<nobr>
${row.secondhalfgoal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="上期の総括">
<nobr>
${row.firsthalfselfoverview}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="下期の総括">
<nobr>
${row.secondhalfselfoverview}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="自己総括">
<nobr>
${row.selfoverview}
</nobr>
</display:column>

                    </display:table>
<a href="ResultAndProductivitys.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="ResultAndProductivitys.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="ResultAndProductivitys.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="ResultAndProductivitys.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostResultAndProductivityVP.do">
          <html:hidden name="form" property="id"/>

month<br />
<html:text name="form" property="month" /><br />

年<br />
<html:text name="form" property="year" /><br />

種類<br />
<html:text name="form" property="type" /><br />

                                店舗名<br />
                                <c:choose>
                                    <c:when test="${empty Shops}">
                                         <select name="shop" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="shop" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Shops}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.shop.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


                                担当者<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


売上新車<br />
<input type="text" name="todateAsString" value="<bean:write name="form" property="todate" format="yyyy/MM/dd" />" /><br />
売上新車<br />
<html:text name="form" property="salesnew" /><br />

新車顧客併有車代替台数<br />
<html:text name="form" property="newcustomerparallel" /><br />

中古車社員紹介台数<br />
<html:text name="form" property="usedotherintroductionemployee" /><br />

中古車その他の紹介台数<br />
<html:text name="form" property="usedotherintroductionother" /><br />

売上中古車<br />
<html:text name="form" property="salesused" /><br />

入庫台数車検<br />
<html:text name="form" property="storageinspection" /><br />

入庫台数12点<br />
<html:text name="form" property="storage12" /><br />

入庫台数ＭＳＣ<br />
<html:text name="form" property="storagemsc" /><br />

assurancenew<br />
<html:text name="form" property="assurancenew" /><br />

assurancecontinuance<br />
<html:text name="form" property="assurancecontinuance" /><br />

新車利益<br />
<html:text name="form" property="profitnew" /><br />

中古車利益<br />
<html:text name="form" property="profitused" /><br />

新車顧客代替台数<br />
<html:text name="form" property="newcustomeralternatives" /><br />

新車顧客増車台数<br />
<html:text name="form" property="newcustomerincrement" /><br />

新車顧客紹介台数<br />
<html:text name="form" property="newcustomerintroduction" /><br />

新車他銘柄代替台数<br />
<html:text name="form" property="newnewotheralternatives" /><br />

新車新規台数<br />
<html:text name="form" property="newnewothernew" /><br />

新車業者仕切台数<br />
<html:text name="form" property="newvendormarket" /><br />

新車業者紹介台数<br />
<html:text name="form" property="newvendorintroduction" /><br />

新車社員紹介台数<br />
<html:text name="form" property="newotherintroductionemployee" /><br />

新車その他の紹介台数<br />
<html:text name="form" property="newotherintroductionother" /><br />

中古車顧客代替台数<br />
<html:text name="form" property="usedcustomeralternatives" /><br />

中古車顧客増車台数<br />
<html:text name="form" property="usedcustomerincrement" /><br />

中古車顧客紹介台数<br />
<html:text name="form" property="usedcustomerintroduction" /><br />

中古車顧客併有車代替台数<br />
<html:text name="form" property="usedcustomerparallel" /><br />

中古車他銘柄代替台数<br />
<html:text name="form" property="usednewotheralternatives" /><br />

中古車新規台数<br />
<html:text name="form" property="usednewothernew" /><br />

中古車業者仕切台数<br />
<html:text name="form" property="usedvendormarket" /><br />

中古車業者紹介台数<br />
<html:text name="form" property="usedvendorintroduction" /><br />

                                売上新車<br />
                                <c:choose>
                                    <c:when test="${empty Bases}">
                                         <select name="base" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="base" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Bases}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.base.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


売上新車<br />
<html:text name="form" property="newsales" /><br />

売上中古車<br />
<html:text name="form" property="usedsales" /><br />

保険件数新規件数<br />
<html:text name="form" property="newassurancenew" /><br />

保険件数継続件数<br />
<html:text name="form" property="usedassurancecontinuance" /><br />

新車利益<br />
<html:text name="form" property="newprofit" /><br />

新車利益<br />
<html:text name="form" property="usedprofit" /><br />

新車その他の紹介台数<br />
<html:text name="form" property="newotherintroductionothers" /><br />

中古車その他の紹介台数<br />
<html:text name="form" property="usedotherintroductionothers" /><br />

活動量店頭面談数<br />
<html:text name="form" property="activitystorefront" /><br />

活動量訪問面談数<br />
<html:text name="form" property="activityvisit" /><br />

活動量ＳＬＣ（除くＤＭ）<br />
<html:text name="form" property="activityslc" /><br />

活動量メール<br />
<html:text name="form" property="activitymail" /><br />

活動量電話<br />
<html:text name="form" property="activitytel" /><br />

顧客活動量顧客店頭面談数<br />
<html:text name="form" property="customeractivitystorefront" /><br />

顧客活動量顧客訪問面談数<br />
<html:text name="form" property="customeractivityvisit" /><br />

顧客活動量顧客ＳＬＣ（除くＤＭ）<br />
<html:text name="form" property="customeractivityslc" /><br />

顧客活動量顧客メール<br />
<html:text name="form" property="customeractivitymail" /><br />

顧客活動量顧客電話<br />
<html:text name="form" property="customeractivitytel" /><br />

顧客数<br />
<html:text name="form" property="customernum" /><br />

ＣＳスコア<br />
<html:text name="form" property="customerscore" /><br />

年間の目標<br />
<html:text name="form" property="termgoal" /><br />

上期のゴール<br />
<html:text name="form" property="firsthalfgoal" /><br />

下期のゴール<br />
<html:text name="form" property="secondhalfgoal" /><br />

上期の総括<br />
<html:text name="form" property="firsthalfselfoverview" /><br />

下期の総括<br />
<html:text name="form" property="secondhalfselfoverview" /><br />

自己総括<br />
<html:text name="form" property="selfoverview" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="ResultAndProductivitys.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

