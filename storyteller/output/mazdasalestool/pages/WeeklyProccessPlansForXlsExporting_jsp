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
	<tiles:put name="title" value="週間プロセス計画一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">週間プロセス計画一覧</span>
                    <display:table name="${weeklyProccessPlans}" id="row" requestURI="WeeklyProccessPlans.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="WeeklyProccessPlans.do?id=${row.id}">編集</a>
                        <a href="DeleteWeeklyProccessPlan.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="退社時刻"><nobr>
<bean:write name="row" property="leavetime" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="実績">
<nobr>
${row.actual}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="顧客代替・増車　促進活動受注台数">
<nobr>
${row.promotionalcars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月対象件数">
<nobr>
${row.inspectiontarget}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月TC件数">
<nobr>
${row.inspectiontc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月メール件数">
<nobr>
${row.inspectionmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月来店確約数">
<nobr>
${row.inspectionvisitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月SLC件数">
<nobr>
${row.inspectionslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月ご提案書件数">
<nobr>
${row.inspectionproposal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月店頭接客件数">
<nobr>
${row.inspectionstorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月ＢＣ件数">
<nobr>
${row.inspectionbc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月デモ件数">
<nobr>
${row.inspectiondemo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月査定件数">
<nobr>
${row.inspectionappraisal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月ＡＢホット発生件数">
<nobr>
${row.inspectionabhot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット対象件数">
<nobr>
${row.prioritytarget}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットDM件数">
<nobr>
${row.prioritydm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットTC件数">
<nobr>
${row.prioritytc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットメール件数">
<nobr>
${row.prioritymail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット来店確約数">
<nobr>
${row.priorityvisitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットSLC件数">
<nobr>
${row.priorityslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットご提案書件数">
<nobr>
${row.priorityproposal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット店頭接客件数">
<nobr>
${row.prioritystorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットＢＣ件数">
<nobr>
${row.prioritybc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットデモ件数">
<nobr>
${row.prioritydemo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット査定件数">
<nobr>
${row.priorityappraisal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットＡＢホット発生件数">
<nobr>
${row.priorityabhot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動受注台数">
<nobr>
${row.newclientscars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動紹介ハガキ発送件数">
<nobr>
${row.newclientsintroductionpostcard}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動紹介依頼件数">
<nobr>
${row.newclientsintroductionoffer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動紹介発生">
<nobr>
${row.newclientsintroduction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動店頭来店ストック">
<nobr>
${row.newclientsstockstorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動出張・職域展示会">
<nobr>
${row.newclientsstockexhibition}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動その他">
<nobr>
${row.newclientsstockothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動総ストック保有件数">
<nobr>
${row.newclientsstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動ＤＭ件数">
<nobr>
${row.newclientsdm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動ＴＣ件数">
<nobr>
${row.newclientstc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動メール件数">
<nobr>
${row.newclientsmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動来店確約数">
<nobr>
${row.newclientsvisitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動SLC件数">
<nobr>
${row.newclientsslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動店頭接客件数">
<nobr>
${row.newclientsstorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動ＢＣ件数">
<nobr>
${row.newclientsbc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動デモ件数">
<nobr>
${row.newclientsdemo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動査定件数">
<nobr>
${row.newclientsappraisal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動ＡＢホット発生件数">
<nobr>
${row.newclientsabhot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="base">
<nobr>
${row.base.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="出社時刻"><nobr>
<bean:write name="row" property="cometime" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月DM件数">
<nobr>
${row.inspectiondm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ABホット発生顧客">
<nobr>
${row.engenderabhotcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ABホット発生ストック">
<nobr>
${row.engenderabhotstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ABホット発生フリー">
<nobr>
${row.engenderabhotfree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="VIP">
<nobr>
${row.vip}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="その他受注台数">
<nobr>
${row.othercars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数AB">
<nobr>
${row.clientab}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数NON-AB顧客">
<nobr>
${row.clientnonabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数NON-ABストック">
<nobr>
${row.clientnonabstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数NON-ABフリー">
<nobr>
${row.clientnonabfree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数AB顧客">
<nobr>
${row.ordercarsabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数AB新他">
<nobr>
${row.ordercarsabnewother}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数NON-AB顧客">
<nobr>
${row.ordercarsnonabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数NON-ABストック">
<nobr>
${row.ordercarsnonabstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数NON-ABフリー">
<nobr>
${row.ordercarsnonabfree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="inspectioncars">
<nobr>
${row.inspectioncars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="prioritycars">
<nobr>
${row.prioritycars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldtarget">
<nobr>
${row.oldtarget}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="olddm">
<nobr>
${row.olddm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldtc">
<nobr>
${row.oldtc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldmail">
<nobr>
${row.oldmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldvisitaffirmation">
<nobr>
${row.oldvisitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldslc">
<nobr>
${row.oldslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldproposal">
<nobr>
${row.oldproposal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldstorefront">
<nobr>
${row.oldstorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldbc">
<nobr>
${row.oldbc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="olddemo">
<nobr>
${row.olddemo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldappraisal">
<nobr>
${row.oldappraisal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oldabhot">
<nobr>
${row.oldabhot}
</nobr>
</display:column>

                    </display:table>
<a href="WeeklyProccessPlans.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="WeeklyProccessPlans.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="WeeklyProccessPlans.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="WeeklyProccessPlans.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	週間プロセス計画編集
</span>
<span id="subform">

		<form method="POST" action="PostWeeklyProccessPlanVP.do">
          <html:hidden name="form" property="id"/>

退社時刻<br />
<input type="text" name="leavetimeAsString" value="<bean:write name="form" property="leavetime" format="yyyy/MM/dd" />" /><br />
日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
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


実績<br />
<html:checkbox name="form" property="actual" /><br />

顧客代替・増車　促進活動受注台数<br />
<html:text name="form" property="promotionalcars" /><br />

車検先行7-4ヶ月対象件数<br />
<html:text name="form" property="inspectiontarget" /><br />

車検先行7-4ヶ月TC件数<br />
<html:text name="form" property="inspectiontc" /><br />

車検先行7-4ヶ月メール件数<br />
<html:text name="form" property="inspectionmail" /><br />

車検先行7-4ヶ月来店確約数<br />
<html:text name="form" property="inspectionvisitaffirmation" /><br />

車検先行7-4ヶ月SLC件数<br />
<html:text name="form" property="inspectionslc" /><br />

車検先行7-4ヶ月ご提案書件数<br />
<html:text name="form" property="inspectionproposal" /><br />

車検先行7-4ヶ月店頭接客件数<br />
<html:text name="form" property="inspectionstorefront" /><br />

車検先行7-4ヶ月ＢＣ件数<br />
<html:text name="form" property="inspectionbc" /><br />

車検先行7-4ヶ月デモ件数<br />
<html:text name="form" property="inspectiondemo" /><br />

車検先行7-4ヶ月査定件数<br />
<html:text name="form" property="inspectionappraisal" /><br />

車検先行7-4ヶ月ＡＢホット発生件数<br />
<html:text name="form" property="inspectionabhot" /><br />

重点ターゲット対象件数<br />
<html:text name="form" property="prioritytarget" /><br />

重点ターゲットDM件数<br />
<html:text name="form" property="prioritydm" /><br />

重点ターゲットTC件数<br />
<html:text name="form" property="prioritytc" /><br />

重点ターゲットメール件数<br />
<html:text name="form" property="prioritymail" /><br />

重点ターゲット来店確約数<br />
<html:text name="form" property="priorityvisitaffirmation" /><br />

重点ターゲットSLC件数<br />
<html:text name="form" property="priorityslc" /><br />

重点ターゲットご提案書件数<br />
<html:text name="form" property="priorityproposal" /><br />

重点ターゲット店頭接客件数<br />
<html:text name="form" property="prioritystorefront" /><br />

重点ターゲットＢＣ件数<br />
<html:text name="form" property="prioritybc" /><br />

重点ターゲットデモ件数<br />
<html:text name="form" property="prioritydemo" /><br />

重点ターゲット査定件数<br />
<html:text name="form" property="priorityappraisal" /><br />

重点ターゲットＡＢホット発生件数<br />
<html:text name="form" property="priorityabhot" /><br />

新規・他銘柄　獲得活動受注台数<br />
<html:text name="form" property="newclientscars" /><br />

新規・他銘柄　獲得活動紹介ハガキ発送件数<br />
<html:text name="form" property="newclientsintroductionpostcard" /><br />

新規・他銘柄　獲得活動紹介依頼件数<br />
<html:text name="form" property="newclientsintroductionoffer" /><br />

新規・他銘柄　獲得活動紹介発生<br />
<html:text name="form" property="newclientsintroduction" /><br />

新規・他銘柄　獲得活動店頭来店ストック<br />
<html:text name="form" property="newclientsstockstorefront" /><br />

新規・他銘柄　獲得活動出張・職域展示会<br />
<html:text name="form" property="newclientsstockexhibition" /><br />

新規・他銘柄　獲得活動その他<br />
<html:text name="form" property="newclientsstockothers" /><br />

新規・他銘柄　獲得活動総ストック保有件数<br />
<html:text name="form" property="newclientsstock" /><br />

新規・他銘柄　獲得活動ＤＭ件数<br />
<html:text name="form" property="newclientsdm" /><br />

新規・他銘柄　獲得活動ＴＣ件数<br />
<html:text name="form" property="newclientstc" /><br />

新規・他銘柄　獲得活動メール件数<br />
<html:text name="form" property="newclientsmail" /><br />

新規・他銘柄　獲得活動来店確約数<br />
<html:text name="form" property="newclientsvisitaffirmation" /><br />

新規・他銘柄　獲得活動SLC件数<br />
<html:text name="form" property="newclientsslc" /><br />

新規・他銘柄　獲得活動店頭接客件数<br />
<html:text name="form" property="newclientsstorefront" /><br />

新規・他銘柄　獲得活動ＢＣ件数<br />
<html:text name="form" property="newclientsbc" /><br />

新規・他銘柄　獲得活動デモ件数<br />
<html:text name="form" property="newclientsdemo" /><br />

新規・他銘柄　獲得活動査定件数<br />
<html:text name="form" property="newclientsappraisal" /><br />

新規・他銘柄　獲得活動ＡＢホット発生件数<br />
<html:text name="form" property="newclientsabhot" /><br />

                                base<br />
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


出社時刻<br />
<input type="text" name="cometimeAsString" value="<bean:write name="form" property="cometime" format="yyyy/MM/dd" />" /><br />
車検先行7-4ヶ月DM件数<br />
<html:text name="form" property="inspectiondm" /><br />

ABホット発生顧客<br />
<html:text name="form" property="engenderabhotcustomer" /><br />

ABホット発生ストック<br />
<html:text name="form" property="engenderabhotstock" /><br />

ABホット発生フリー<br />
<html:text name="form" property="engenderabhotfree" /><br />

VIP<br />
<html:text name="form" property="vip" /><br />

その他受注台数<br />
<html:text name="form" property="othercars" /><br />

来店接客数AB<br />
<html:text name="form" property="clientab" /><br />

来店接客数NON-AB顧客<br />
<html:text name="form" property="clientnonabcustomer" /><br />

来店接客数NON-ABストック<br />
<html:text name="form" property="clientnonabstock" /><br />

来店接客数NON-ABフリー<br />
<html:text name="form" property="clientnonabfree" /><br />

受注台数AB顧客<br />
<html:text name="form" property="ordercarsabcustomer" /><br />

受注台数AB新他<br />
<html:text name="form" property="ordercarsabnewother" /><br />

受注台数NON-AB顧客<br />
<html:text name="form" property="ordercarsnonabcustomer" /><br />

受注台数NON-ABストック<br />
<html:text name="form" property="ordercarsnonabstock" /><br />

受注台数NON-ABフリー<br />
<html:text name="form" property="ordercarsnonabfree" /><br />

inspectioncars<br />
<html:text name="form" property="inspectioncars" /><br />

prioritycars<br />
<html:text name="form" property="prioritycars" /><br />

oldtarget<br />
<html:text name="form" property="oldtarget" /><br />

olddm<br />
<html:text name="form" property="olddm" /><br />

oldtc<br />
<html:text name="form" property="oldtc" /><br />

oldmail<br />
<html:text name="form" property="oldmail" /><br />

oldvisitaffirmation<br />
<html:text name="form" property="oldvisitaffirmation" /><br />

oldslc<br />
<html:text name="form" property="oldslc" /><br />

oldproposal<br />
<html:text name="form" property="oldproposal" /><br />

oldstorefront<br />
<html:text name="form" property="oldstorefront" /><br />

oldbc<br />
<html:text name="form" property="oldbc" /><br />

olddemo<br />
<html:text name="form" property="olddemo" /><br />

oldappraisal<br />
<html:text name="form" property="oldappraisal" /><br />

oldabhot<br />
<html:text name="form" property="oldabhot" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="WeeklyProccessPlans.do">新規週間プロセス計画作成</a>
</div>




	</tiles:put>
</tiles:insert>
