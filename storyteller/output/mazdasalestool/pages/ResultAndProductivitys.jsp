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

<%@ page isELIgnored="false" %>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="営業成果と生産性一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">営業成果と生産性一覧</span>
                    <display:table name="${resultAndProductivitys}" id="row" requestURI="ResultAndProductivitys.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ResultAndProductivitys.do?id=${row.id}">編集</a>
                        <a href="DeleteResultAndProductivity.do?id=${row.id}">削除</a>
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
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
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
 <display:column media="html" sortable="true" title="中古車利益">
<nobr>
${row.usedprofit}
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
 <display:column media="html" sortable="true" title="顧客数">
<nobr>
${row.customernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客防衛率">
<nobr>
${row.customerprotectionrate}
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
 <display:column media="html" sortable="true" title="管理保険付保率">
<nobr>
${row.customerassuarancerate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車法人・業販・その他ルート">
<nobr>
${row.newotherroute}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車法人・業販・その他ルート">
<nobr>
${row.usedotherroute}
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
	営業成果と生産性編集
</span>
<span id="subform">

		<form method="POST" action="PostResultAndProductivityVP.do">
          <html:hidden name="form" property="id"/>

月<br />
<html:text name="form" property="month" /><br />

年<br />
<html:text name="form" property="year" /><br />

                                内部ユーザー<br />
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
<html:text name="form" property="newsales" /><br />

売上中古車<br />
<html:text name="form" property="usedsales" /><br />

入庫台数車検<br />
<html:text name="form" property="storageinspection" /><br />

入庫台数12点<br />
<html:text name="form" property="storage12" /><br />

入庫台数ＭＳＣ<br />
<html:text name="form" property="storagemsc" /><br />

保険件数新規件数<br />
<html:text name="form" property="newassurancenew" /><br />

保険件数継続件数<br />
<html:text name="form" property="usedassurancecontinuance" /><br />

新車利益<br />
<html:text name="form" property="newprofit" /><br />

中古車利益<br />
<html:text name="form" property="usedprofit" /><br />

新車顧客代替台数<br />
<html:text name="form" property="newcustomeralternatives" /><br />

新車顧客増車台数<br />
<html:text name="form" property="newcustomerincrement" /><br />

新車他銘柄代替台数<br />
<html:text name="form" property="newnewotheralternatives" /><br />

新車新規台数<br />
<html:text name="form" property="newnewothernew" /><br />

中古車顧客代替台数<br />
<html:text name="form" property="usedcustomeralternatives" /><br />

中古車顧客増車台数<br />
<html:text name="form" property="usedcustomerincrement" /><br />

中古車他銘柄代替台数<br />
<html:text name="form" property="usednewotheralternatives" /><br />

中古車新規台数<br />
<html:text name="form" property="usednewothernew" /><br />

顧客数<br />
<html:text name="form" property="customernum" /><br />

顧客防衛率<br />
<html:text name="form" property="customerprotectionrate" /><br />

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

管理保険付保率<br />
<html:text name="form" property="customerassuarancerate" /><br />

新車法人・業販・その他ルート<br />
<html:text name="form" property="newotherroute" /><br />

中古車法人・業販・その他ルート<br />
<html:text name="form" property="usedotherroute" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="ResultAndProductivitys.do">新規営業成果と生産性作成</a>
</div>




	</tiles:put>
</tiles:insert>
