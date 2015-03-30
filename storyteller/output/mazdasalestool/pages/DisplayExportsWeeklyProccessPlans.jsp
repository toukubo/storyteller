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
                    <display:table name="${weeklyProccessPlans}" id="row" requestURI="WeeklyProccessPlans.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="leavetime" title="退社時刻"/>
<display:column media="xml csv excel pdf" property="date" title="日付"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="actual" title="実績"/>
<display:column media="xml csv excel pdf" property="promotionalcars" title="顧客代替・増車　促進活動受注台数"/>
<display:column media="xml csv excel pdf" property="inspectiontarget" title="車検先行7-4ヶ月対象件数"/>
<display:column media="xml csv excel pdf" property="inspectiontc" title="車検先行7-4ヶ月TC件数"/>
<display:column media="xml csv excel pdf" property="inspectionmail" title="車検先行7-4ヶ月メール件数"/>
<display:column media="xml csv excel pdf" property="inspectionvisitaffirmation" title="車検先行7-4ヶ月来店確約数"/>
<display:column media="xml csv excel pdf" property="inspectionslc" title="車検先行7-4ヶ月SLC件数"/>
<display:column media="xml csv excel pdf" property="inspectionproposal" title="車検先行7-4ヶ月ご提案書件数"/>
<display:column media="xml csv excel pdf" property="inspectionstorefront" title="車検先行7-4ヶ月店頭接客件数"/>
<display:column media="xml csv excel pdf" property="inspectionbc" title="車検先行7-4ヶ月ＢＣ件数"/>
<display:column media="xml csv excel pdf" property="inspectiondemo" title="車検先行7-4ヶ月デモ件数"/>
<display:column media="xml csv excel pdf" property="inspectionappraisal" title="車検先行7-4ヶ月査定件数"/>
<display:column media="xml csv excel pdf" property="inspectionabhot" title="車検先行7-4ヶ月ＡＢホット発生件数"/>
<display:column media="xml csv excel pdf" property="prioritytarget" title="重点ターゲット対象件数"/>
<display:column media="xml csv excel pdf" property="prioritydm" title="重点ターゲットDM件数"/>
<display:column media="xml csv excel pdf" property="prioritytc" title="重点ターゲットTC件数"/>
<display:column media="xml csv excel pdf" property="prioritymail" title="重点ターゲットメール件数"/>
<display:column media="xml csv excel pdf" property="priorityvisitaffirmation" title="重点ターゲット来店確約数"/>
<display:column media="xml csv excel pdf" property="priorityslc" title="重点ターゲットSLC件数"/>
<display:column media="xml csv excel pdf" property="priorityproposal" title="重点ターゲットご提案書件数"/>
<display:column media="xml csv excel pdf" property="prioritystorefront" title="重点ターゲット店頭接客件数"/>
<display:column media="xml csv excel pdf" property="prioritybc" title="重点ターゲットＢＣ件数"/>
<display:column media="xml csv excel pdf" property="prioritydemo" title="重点ターゲットデモ件数"/>
<display:column media="xml csv excel pdf" property="priorityappraisal" title="重点ターゲット査定件数"/>
<display:column media="xml csv excel pdf" property="priorityabhot" title="重点ターゲットＡＢホット発生件数"/>
<display:column media="xml csv excel pdf" property="newclientscars" title="新規・他銘柄　獲得活動受注台数"/>
<display:column media="xml csv excel pdf" property="newclientsintroductionpostcard" title="新規・他銘柄　獲得活動紹介ハガキ発送件数"/>
<display:column media="xml csv excel pdf" property="newclientsintroductionoffer" title="新規・他銘柄　獲得活動紹介依頼件数"/>
<display:column media="xml csv excel pdf" property="newclientsintroduction" title="新規・他銘柄　獲得活動紹介発生"/>
<display:column media="xml csv excel pdf" property="newclientsstockstorefront" title="新規・他銘柄　獲得活動店頭来店ストック"/>
<display:column media="xml csv excel pdf" property="newclientsstockexhibition" title="新規・他銘柄　獲得活動出張・職域展示会"/>
<display:column media="xml csv excel pdf" property="newclientsstockothers" title="新規・他銘柄　獲得活動その他"/>
<display:column media="xml csv excel pdf" property="newclientsstock" title="新規・他銘柄　獲得活動総ストック保有件数"/>
<display:column media="xml csv excel pdf" property="newclientsdm" title="新規・他銘柄　獲得活動ＤＭ件数"/>
<display:column media="xml csv excel pdf" property="newclientstc" title="新規・他銘柄　獲得活動ＴＣ件数"/>
<display:column media="xml csv excel pdf" property="newclientsmail" title="新規・他銘柄　獲得活動メール件数"/>
<display:column media="xml csv excel pdf" property="newclientsvisitaffirmation" title="新規・他銘柄　獲得活動来店確約数"/>
<display:column media="xml csv excel pdf" property="newclientsslc" title="新規・他銘柄　獲得活動SLC件数"/>
<display:column media="xml csv excel pdf" property="newclientsstorefront" title="新規・他銘柄　獲得活動店頭接客件数"/>
<display:column media="xml csv excel pdf" property="newclientsbc" title="新規・他銘柄　獲得活動ＢＣ件数"/>
<display:column media="xml csv excel pdf" property="newclientsdemo" title="新規・他銘柄　獲得活動デモ件数"/>
<display:column media="xml csv excel pdf" property="newclientsappraisal" title="新規・他銘柄　獲得活動査定件数"/>
<display:column media="xml csv excel pdf" property="newclientsabhot" title="新規・他銘柄　獲得活動ＡＢホット発生件数"/>
<display:column media="xml csv excel pdf" property="base" title="base"/>
<display:column media="xml csv excel pdf" property="cometime" title="出社時刻"/>
<display:column media="xml csv excel pdf" property="inspectiondm" title="車検先行7-4ヶ月DM件数"/>
<display:column media="xml csv excel pdf" property="engenderabhotcustomer" title="ABホット発生顧客"/>
<display:column media="xml csv excel pdf" property="engenderabhotstock" title="ABホット発生ストック"/>
<display:column media="xml csv excel pdf" property="engenderabhotfree" title="ABホット発生フリー"/>
<display:column media="xml csv excel pdf" property="vip" title="VIP"/>
<display:column media="xml csv excel pdf" property="othercars" title="その他受注台数"/>
<display:column media="xml csv excel pdf" property="clientab" title="来店接客数AB"/>
<display:column media="xml csv excel pdf" property="clientnonabcustomer" title="来店接客数NON-AB顧客"/>
<display:column media="xml csv excel pdf" property="clientnonabstock" title="来店接客数NON-ABストック"/>
<display:column media="xml csv excel pdf" property="clientnonabfree" title="来店接客数NON-ABフリー"/>
<display:column media="xml csv excel pdf" property="ordercarsabcustomer" title="受注台数AB顧客"/>
<display:column media="xml csv excel pdf" property="ordercarsabnewother" title="受注台数AB新他"/>
<display:column media="xml csv excel pdf" property="ordercarsnonabcustomer" title="受注台数NON-AB顧客"/>
<display:column media="xml csv excel pdf" property="ordercarsnonabstock" title="受注台数NON-ABストック"/>
<display:column media="xml csv excel pdf" property="ordercarsnonabfree" title="受注台数NON-ABフリー"/>
<display:column media="xml csv excel pdf" property="inspectioncars" title="inspectioncars"/>
<display:column media="xml csv excel pdf" property="prioritycars" title="prioritycars"/>
<display:column media="xml csv excel pdf" property="oldtarget" title="oldtarget"/>
<display:column media="xml csv excel pdf" property="olddm" title="olddm"/>
<display:column media="xml csv excel pdf" property="oldtc" title="oldtc"/>
<display:column media="xml csv excel pdf" property="oldmail" title="oldmail"/>
<display:column media="xml csv excel pdf" property="oldvisitaffirmation" title="oldvisitaffirmation"/>
<display:column media="xml csv excel pdf" property="oldslc" title="oldslc"/>
<display:column media="xml csv excel pdf" property="oldproposal" title="oldproposal"/>
<display:column media="xml csv excel pdf" property="oldstorefront" title="oldstorefront"/>
<display:column media="xml csv excel pdf" property="oldbc" title="oldbc"/>
<display:column media="xml csv excel pdf" property="olddemo" title="olddemo"/>
<display:column media="xml csv excel pdf" property="oldappraisal" title="oldappraisal"/>
<display:column media="xml csv excel pdf" property="oldabhot" title="oldabhot"/>

                    </display:table>


