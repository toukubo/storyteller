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
	<tiles:put name="title" value="週間プロセス計画" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostWeeklyProccessPlanVP">
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




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
