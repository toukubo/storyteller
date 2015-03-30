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
	<tiles:put name="title" value="事故" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostAccidentVP">
          <html:hidden name="form" property="id"/>

発生曜日<br />
<html:text size="40"  name="form" property="day" /><br />

性別<br />
<html:text size="40"  name="form" property="sex" /><br />

                                付属品<br />
                                <c:choose>
                                    <c:when test="${empty Attachments}">
                                         <select name="attachment" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="attachment" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Attachments}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.attachment.id}">
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


整理番号<br />
<html:text size="40"  name="form" property="number" /><br />

天候<br />
<html:text size="40"  name="form" property="weather" /><br />

扱別<br />
<html:text size="40"  name="form" property="accidentcategory" /><br />

道路名<br />
<html:text size="40"  name="form" property="roadname" /><br />

事故責任<br />
<html:text size="40"  name="form" property="responsibility" /><br />

道路区分<br />
<html:text size="40"  name="form" property="roadcategory" /><br />

道路タイプ<br />
<html:text size="40"  name="form" property="roadcurve" /><br />

道路見通し<br />
<html:checkbox name="form" property="roadview" /><br />

交差点<br />
<html:checkbox name="form" property="intersection" /><br />

信号<br />
<html:checkbox name="form" property="signal" /><br />

勾配<br />
<html:text size="40"  name="form" property="roadgrade" /><br />

道路幅<br />
<html:text size="40"  name="form" property="roadwidth" /><br />

制限速度<br />
<html:text size="40"  name="form" property="limitingspeed" /><br />

路面状況<br />
<html:text size="40"  name="form" property="roadcondition" /><br />

当方車両<br />
<html:text size="40"  name="form" property="carline" /><br />

積荷<br />
<html:checkbox name="form" property="cargo" /><br />

被災状況重傷<br />
<html:text size="40"  name="form" property="death" /><br />

被災状況重傷<br />
<html:text size="40"  name="form" property="seriousinjury" /><br />

被災状況軽傷<br />
<html:text size="40"  name="form" property="minorinjury" /><br />

危険認知速度<br />
<html:text size="40"  name="form" property="hazardperceptionspeed" /><br />

危険認知距離<br />
<html:text size="40"  name="form" property="hazardperceptiondistance" /><br />

事故直前の動作<br />
<html:text size="40"  name="form" property="registrationplate" /><br />

車名<br />
<html:text size="40"  name="form" property="carname" /><br />

年式<br />
<html:text size="40"  name="form" property="modelyear" /><br />

人身保険処理損害額<br />
<html:text size="40"  name="form" property="costofinsurancebypersonalinjury" /><br />

人身社損処理損害額<br />
<html:text size="40"  name="form" property="costofcompanybypersonalinjury" /><br />

物件・対物保険処理損害額<br />
<html:text size="40"  name="form" property="costofinsurancebypropertydamage" /><br />

物件・対物社損処理損害額<br />
<html:text size="40"  name="form" property="costofcompanybypropatydamage" /><br />

車両保険処理損害額<br />
<html:text size="40"  name="form" property="costofinsurancebyautomobilephysicaldamage" /><br />

車両社損処理損害額<br />
<html:text size="40"  name="form" property="costofcompanybyautomobilephysicaldamage" /><br />

安全運転実施状況<br />
<html:checkbox name="form" property="actionofsaftydriving" /><br />

問題の詳細<br />
<html:text size="40"  name="form" property="problemdescription" /><br />

安全研究会開催年月日<br />
<input type="text" name="datepfholdingsaftygroupAsString" value="<st:date date="${form.datepfholdingsaftygroup}" size="20" />" /><br />
改善対策詳細<br />
<html:text size="40"  name="form" property="actionofsafy" /><br />

事故処理委員会開催年月日<br />
<input type="text" name="dateofholdingaccidentcommitteeAsString" value="<st:date date="${form.dateofholdingaccidentcommittee}" size="20" />" /><br />
処分結果<br />
<html:text size="40"  name="form" property="penaltyofaccident" /><br />

損保事故受付番号<br />
<html:text size="40"  name="form" property="numberofinssurance" /><br />

年齢<br />
<html:text size="40"  name="form" property="age" /><br />

雇用年数<br />
<html:text size="40"  name="form" property="yearofemplyment" /><br />

経験年数<br />
<html:text size="40"  name="form" property="yearofexperience" /><br />

事業部・統括支店<br />
<html:text size="40"  name="form" property="division" /><br />

支店<br />
<html:text size="40"  name="form" property="branch" /><br />

支店コード<br />
<html:text size="40"  name="form" property="branchcode" /><br />

課所<br />
<html:text size="40"  name="form" property="section" /><br />

内線番号<br />
<html:text size="40"  name="form" property="telnumber" /><br />

社員区分<br />
<html:text size="40"  name="form" property="accidenttype" /><br />

事故直前の動作<br />
<html:text size="40"  name="form" property="actionbeforeaccident" /><br />

事故原因<br />
<html:text size="40"  name="form" property="causeofaccident" /><br />

社員区分<br />
<html:text size="40"  name="form" property="staffcategory" /><br />

報告書ＮＯ<br />
<html:text size="40"  name="form" property="reportcode" /><br />

提出状況<br />
<html:text size="40"  name="form" property="submittedstatus" /><br />

報告書名<br />
<html:text size="40"  name="form" property="reportname" /><br />

提出年月日<br />
<input type="text" name="submitteddateAsString" value="<st:date date="${form.submitteddate}" size="20" />" /><br />
                                社員<br />
                                <c:choose>
                                    <c:when test="${empty Staffs}">
                                         <select name="staff" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="staff" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Staffs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.staff.id}">
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


発生時刻<br />
<input type="text" name="timeAsString" value="<st:date date="${form.time}" size="20" />" /><br />
日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />
住所<br />
<html:text size="40"  name="form" property="address" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
