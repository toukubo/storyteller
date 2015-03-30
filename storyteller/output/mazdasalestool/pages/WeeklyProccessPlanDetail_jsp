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

<html:html>
<tiles:insert page="/h.jsp"/>

<div class="main">
<span class="title">WeeklyProccessPlan 編集</span>
		<html:form method="POST" action="/WeeklyProccessPlanVP">
          <html:hidden name="weeklyProccessPlan" property="id"/>

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


                                拠点<br />
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

低年式ターゲット対象件数<br />
<html:text name="form" property="oldtarget" /><br />

低年式ターゲットDM件数<br />
<html:text name="form" property="olddm" /><br />

低年式ターゲットTC件数<br />
<html:text name="form" property="oldtc" /><br />

低年式ターゲットメール件数<br />
<html:text name="form" property="oldmail" /><br />

低年式ターゲット来店確約数<br />
<html:text name="form" property="oldvisitaffirmation" /><br />

低年式ターゲットSLC件数<br />
<html:text name="form" property="oldslc" /><br />

低年式ターゲットご提案書件数<br />
<html:text name="form" property="oldproposal" /><br />

低年式ターゲット店頭接客件数<br />
<html:text name="form" property="oldstorefront" /><br />

低年式ターゲットＢＣ件数<br />
<html:text name="form" property="oldbc" /><br />

低年式ターゲットデモ件数<br />
<html:text name="form" property="olddemo" /><br />

低年式ターゲット査定件数<br />
<html:text name="form" property="oldappraisal" /><br />

低年式ターゲットＡＢホット発生件数<br />
<html:text name="form" property="oldabhot" /><br />

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

inspectionbc1<br />
<html:text name="form" property="inspectionbc1" /><br />

車検先行7-4ヶ月DM件数<br />
<html:text name="form" property="inspectiondm" /><br />



          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


