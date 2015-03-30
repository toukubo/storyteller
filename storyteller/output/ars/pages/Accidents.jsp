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
	<tiles:put name="title" value="事故一覧" direct="true" />
	<tiles:put name="content" direct="true">

                    <display:table name="${accidents}" id="row" requestURI="Accidents.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowAccident.do?id=${row.id}">Show</a> | 
                        <a href="PostAccident.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteAccident.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="発生曜日">
<nobr>
${row.day}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.sex}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故歴">
<nobr>
${row.events}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="付属品">
<nobr>
${row.attachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="整理番号">
<nobr>
${row.number}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="天候">
<nobr>
${row.weather}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="扱別">
<nobr>
${row.accidentcategory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="道路名">
<nobr>
${row.roadname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故責任">
<nobr>
${row.responsibility}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="道路区分">
<nobr>
${row.roadcategory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="道路タイプ">
<nobr>
${row.roadcurve}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="道路見通し">
<nobr>
${row.roadview}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="交差点">
<nobr>
${row.intersection}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="信号">
<nobr>
${row.signal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="勾配">
<nobr>
${row.roadgrade}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="道路幅">
<nobr>
${row.roadwidth}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="制限速度">
<nobr>
${row.limitingspeed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="路面状況">
<nobr>
${row.roadcondition}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="当方車両">
<nobr>
${row.carline}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="積荷">
<nobr>
${row.cargo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="被災状況重傷">
<nobr>
${row.death}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="被災状況重傷">
<nobr>
${row.seriousinjury}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="被災状況軽傷">
<nobr>
${row.minorinjury}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="危険認知速度">
<nobr>
${row.hazardperceptionspeed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="危険認知距離">
<nobr>
${row.hazardperceptiondistance}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故直前の動作">
<nobr>
${row.registrationplate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車名">
<nobr>
${row.carname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年式">
<nobr>
${row.modelyear}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人身保険処理損害額">
<nobr>
${row.costofinsurancebypersonalinjury}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人身社損処理損害額">
<nobr>
${row.costofcompanybypersonalinjury}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="物件・対物保険処理損害額">
<nobr>
${row.costofinsurancebypropertydamage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="物件・対物社損処理損害額">
<nobr>
${row.costofcompanybypropatydamage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車両保険処理損害額">
<nobr>
${row.costofinsurancebyautomobilephysicaldamage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車両社損処理損害額">
<nobr>
${row.costofcompanybyautomobilephysicaldamage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="安全運転実施状況">
<nobr>
${row.actionofsaftydriving}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="問題の詳細">
<nobr>
${row.problemdescription}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="安全研究会開催年月日"><nobr>
<st:date date="${row.datepfholdingsaftygroup}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="改善対策詳細">
<nobr>
${row.actionofsafy}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故処理委員会開催年月日"><nobr>
<st:date date="${row.dateofholdingaccidentcommittee}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="処分結果">
<nobr>
${row.penaltyofaccident}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="損保事故受付番号">
<nobr>
${row.numberofinssurance}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年齢">
<nobr>
${row.age}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="雇用年数">
<nobr>
${row.yearofemplyment}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="経験年数">
<nobr>
${row.yearofexperience}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事業部・統括支店">
<nobr>
${row.division}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支店">
<nobr>
${row.branch}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支店コード">
<nobr>
${row.branchcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="課所">
<nobr>
${row.section}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="内線番号">
<nobr>
${row.telnumber}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="社員区分">
<nobr>
${row.accidenttype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故直前の動作">
<nobr>
${row.actionbeforeaccident}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故原因">
<nobr>
${row.causeofaccident}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="社員区分">
<nobr>
${row.staffcategory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="報告書ＮＯ">
<nobr>
${row.reportcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="提出状況">
<nobr>
${row.submittedstatus}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="報告書名">
<nobr>
${row.reportname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="提出年月日"><nobr>
<st:date date="${row.submitteddate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="教育受講">
<nobr>
${row.drivingLessons}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故発生状況">
<nobr>
${row.detailAccidents}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="運転適性診断">
<nobr>
${row.aptitudeTestOfDrivings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="被害者">
<nobr>
${row.victims}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="承認">
<nobr>
${row.approvals}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="社員">
<nobr>
${row.staff.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="発生時刻"><nobr>
<st:date date="${row.time}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所">
<nobr>
${row.address}
</nobr>
</display:column>

                    </display:table>
<a href="Accidents.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Accidents.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Accidents.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Accidents.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>
	</tiles:put>
</tiles:insert>
