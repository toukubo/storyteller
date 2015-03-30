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
                    <display:table name="${weeklyProccessPlans}" id="row" requestURI="WeeklyProccessPlans.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="WeeklyProccessPlans.do?id=${row.id}">編集</a>
                        <a href="DeleteWeeklyProccessPlan.do?id=${row.id}">削除</a>
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
 <display:column media="html" sortable="true" title="todate"><nobr>
<bean:write name="row" property="todate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="fromdate"><nobr>
<bean:write name="row" property="fromdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="促進活動受注台数">
<nobr>
${row.promotionalcars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規受注台数">
<nobr>
${row.newclientscars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットご提案書件数">
<nobr>
${row.inspectionproposal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲット">
<nobr>
${row.inspectiontarget}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲット店頭接客件数">
<nobr>
${row.inspectionstorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットBC件数">
<nobr>
${row.inspectionbc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットご提案書件数">
<nobr>
${row.inspectionappraisal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットデモ件数">
<nobr>
${row.inspectiondemo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットABホット発生件数">
<nobr>
${row.inspectionabhot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲットメール件数">
<nobr>
${row.oldmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットdm件数">
<nobr>
${row.inspectiondm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットTC件数">
<nobr>
${row.inspectiontc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲット来店確約数">
<nobr>
${row.inspectionvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットSLC件数">
<nobr>
${row.inspectionslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行ターゲットメール件数">
<nobr>
${row.inspectionmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット">
<nobr>
${row.oldtarget}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲットdm件数">
<nobr>
${row.olddm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲットTC件数">
<nobr>
${row.oldtc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲット来店確約数">
<nobr>
${row.oldvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲットSLC件数">
<nobr>
${row.oldslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットご提案書件数">
<nobr>
${row.oldproposal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲット店頭接客件数">
<nobr>
${row.oldstorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲットBC件数">
<nobr>
${row.oldbc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲットデモ件数">
<nobr>
${row.olddemo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲットご提案書件数">
<nobr>
${row.oldappraisal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲットABホット発生件数">
<nobr>
${row.oldabhot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット">
<nobr>
${row.prioritytarget}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットTC件数">
<nobr>
${row.prioritytc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット来店確約数">
<nobr>
${row.priorityvisit}
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
 <display:column media="html" sortable="true" title="重点ターゲットメール件数">
<nobr>
${row.prioritymail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット店頭接客件数">
<nobr>
${row.prioritystorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットBC件数">
<nobr>
${row.prioritybc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットdm件数">
<nobr>
${row.prioritydm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットデモ件数">
<nobr>
${row.prioritydemo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規dm件数">
<nobr>
${row.newclientsdm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規SLC件数">
<nobr>
${row.newclientsslc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規メール件数">
<nobr>
${row.newclientsmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規店頭接客件数">
<nobr>
${row.newclientsstorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規BC件数">
<nobr>
${row.newclientsbc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規デモ件数">
<nobr>
${row.newclientsdemo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規ご提案書件数">
<nobr>
${row.newclientsappraisal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規ABホット発生件数">
<nobr>
${row.newclientsabhot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットご提案書件数">
<nobr>
${row.priorityappraisal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲットABホット発生件数">
<nobr>
${row.priorityabhot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規紹介発生">
<nobr>
${row.newclientsintroduction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規紹介ハガキ発送件数">
<nobr>
${row.newclientsintroductionpostcard}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規紹介以来件数">
<nobr>
${row.newclientsintroductionoffer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規ソトック増加件数">
<nobr>
${row.newclientsstockincrement}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規店頭来店ストック">
<nobr>
${row.newclientsstockstorefront}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規出張・職域展示会ストック">
<nobr>
${row.newclientsstockexhibition}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規ストックその他">
<nobr>
${row.newclientsstockothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規総ストック保有件数">
<nobr>
${row.newclientsstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規TC件数">
<nobr>
${row.newclientstc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規来店確約数">
<nobr>
${row.newclientsvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="月度">
<nobr>
${row.month}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年度">
<nobr>
${row.year}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="週">
<nobr>
${row.week}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="実績">
<nobr>
${row.base.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="実績">
<nobr>
${row.actual}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車検先行7-4ヶ月来店確約数">
<nobr>
${row.inspectionvisitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="低年式ターゲット来店確約数">
<nobr>
${row.oldvisitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重点ターゲット来店確約数">
<nobr>
${row.priorityvisitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新規・他銘柄　獲得活動来店確約数">
<nobr>
${row.newclientsvisitaffirmation}
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
	編集
</span>
<span id="subform">

		<form method="POST" action="PostWeeklyProccessPlanVP.do">
          <html:hidden name="form" property="id"/>

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


todate<br />
<input type="text" name="todateAsString" value="<bean:write name="form" property="todate" format="yyyy/MM/dd" />" /><br />
fromdate<br />
<input type="text" name="fromdateAsString" value="<bean:write name="form" property="fromdate" format="yyyy/MM/dd" />" /><br />
促進活動受注台数<br />
<html:text name="form" property="promotionalcars" /><br />

新規受注台数<br />
<html:text name="form" property="newclientscars" /><br />

車検先行ターゲットご提案書件数<br />
<html:text name="form" property="inspectionproposal" /><br />

車検先行ターゲット<br />
<html:text name="form" property="inspectiontarget" /><br />

車検先行ターゲット店頭接客件数<br />
<html:text name="form" property="inspectionstorefront" /><br />

車検先行ターゲットBC件数<br />
<html:text name="form" property="inspectionbc" /><br />

車検先行ターゲットご提案書件数<br />
<html:text name="form" property="inspectionappraisal" /><br />

車検先行ターゲットデモ件数<br />
<html:text name="form" property="inspectiondemo" /><br />

車検先行ターゲットABホット発生件数<br />
<html:text name="form" property="inspectionabhot" /><br />

低年式ターゲットメール件数<br />
<html:text name="form" property="oldmail" /><br />

車検先行ターゲットdm件数<br />
<html:text name="form" property="inspectiondm" /><br />

車検先行ターゲットTC件数<br />
<html:text name="form" property="inspectiontc" /><br />

車検先行ターゲット来店確約数<br />
<html:text name="form" property="inspectionvisit" /><br />

車検先行ターゲットSLC件数<br />
<html:text name="form" property="inspectionslc" /><br />

車検先行ターゲットメール件数<br />
<html:text name="form" property="inspectionmail" /><br />

重点ターゲット<br />
<html:text name="form" property="oldtarget" /><br />

低年式ターゲットdm件数<br />
<html:text name="form" property="olddm" /><br />

低年式ターゲットTC件数<br />
<html:text name="form" property="oldtc" /><br />

低年式ターゲット来店確約数<br />
<html:text name="form" property="oldvisit" /><br />

低年式ターゲットSLC件数<br />
<html:text name="form" property="oldslc" /><br />

重点ターゲットご提案書件数<br />
<html:text name="form" property="oldproposal" /><br />

低年式ターゲット店頭接客件数<br />
<html:text name="form" property="oldstorefront" /><br />

低年式ターゲットBC件数<br />
<html:text name="form" property="oldbc" /><br />

低年式ターゲットデモ件数<br />
<html:text name="form" property="olddemo" /><br />

低年式ターゲットご提案書件数<br />
<html:text name="form" property="oldappraisal" /><br />

低年式ターゲットABホット発生件数<br />
<html:text name="form" property="oldabhot" /><br />

重点ターゲット<br />
<html:text name="form" property="prioritytarget" /><br />

重点ターゲットTC件数<br />
<html:text name="form" property="prioritytc" /><br />

重点ターゲット来店確約数<br />
<html:text name="form" property="priorityvisit" /><br />

重点ターゲットSLC件数<br />
<html:text name="form" property="priorityslc" /><br />

重点ターゲットご提案書件数<br />
<html:text name="form" property="priorityproposal" /><br />

重点ターゲットメール件数<br />
<html:text name="form" property="prioritymail" /><br />

重点ターゲット店頭接客件数<br />
<html:text name="form" property="prioritystorefront" /><br />

重点ターゲットBC件数<br />
<html:text name="form" property="prioritybc" /><br />

重点ターゲットdm件数<br />
<html:text name="form" property="prioritydm" /><br />

重点ターゲットデモ件数<br />
<html:text name="form" property="prioritydemo" /><br />

新規dm件数<br />
<html:text name="form" property="newclientsdm" /><br />

新規SLC件数<br />
<html:text name="form" property="newclientsslc" /><br />

新規メール件数<br />
<html:text name="form" property="newclientsmail" /><br />

新規店頭接客件数<br />
<html:text name="form" property="newclientsstorefront" /><br />

新規BC件数<br />
<html:text name="form" property="newclientsbc" /><br />

新規デモ件数<br />
<html:text name="form" property="newclientsdemo" /><br />

新規ご提案書件数<br />
<html:text name="form" property="newclientsappraisal" /><br />

新規ABホット発生件数<br />
<html:text name="form" property="newclientsabhot" /><br />

重点ターゲットご提案書件数<br />
<html:text name="form" property="priorityappraisal" /><br />

重点ターゲットABホット発生件数<br />
<html:text name="form" property="priorityabhot" /><br />

新規紹介発生<br />
<html:text name="form" property="newclientsintroduction" /><br />

新規紹介ハガキ発送件数<br />
<html:text name="form" property="newclientsintroductionpostcard" /><br />

新規紹介以来件数<br />
<html:text name="form" property="newclientsintroductionoffer" /><br />

新規ソトック増加件数<br />
<html:text name="form" property="newclientsstockincrement" /><br />

新規店頭来店ストック<br />
<html:text name="form" property="newclientsstockstorefront" /><br />

新規出張・職域展示会ストック<br />
<html:text name="form" property="newclientsstockexhibition" /><br />

新規ストックその他<br />
<html:text name="form" property="newclientsstockothers" /><br />

新規総ストック保有件数<br />
<html:text name="form" property="newclientsstock" /><br />

新規TC件数<br />
<html:text name="form" property="newclientstc" /><br />

新規来店確約数<br />
<html:text name="form" property="newclientsvisit" /><br />

月度<br />
<html:text name="form" property="month" /><br />

年度<br />
<html:text name="form" property="year" /><br />

週<br />
<html:text name="form" property="week" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
                                実績<br />
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


実績<br />
<html:checkbox name="form" property="actual" /><br />

車検先行7-4ヶ月来店確約数<br />
<html:text name="form" property="inspectionvisitaffirmation" /><br />

低年式ターゲット来店確約数<br />
<html:text name="form" property="oldvisitaffirmation" /><br />

重点ターゲット来店確約数<br />
<html:text name="form" property="priorityvisitaffirmation" /><br />

新規・他銘柄　獲得活動来店確約数<br />
<html:text name="form" property="newclientsvisitaffirmation" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="WeeklyProccessPlans.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

