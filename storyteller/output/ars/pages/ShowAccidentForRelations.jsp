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

<html:html>
<tiles:insert page="/h.jsp"/>
<div>
運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime<st:date date="${detailaccident.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime}" /><br/>
内容
${detailaccident.accidentdetail}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.detailAccidents" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時刻"><nobr>
<st:date date="${row.accidenttime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容">
<nobr>
${row.accidentdetail}
</nobr>
</display:column>
                        </display:table>
<br/>
教育受講
<div>
<logic:iterate id="drivingLesson" name="accident" property="drivingLessons">id
${drivinglesson.id}
<br/>
事故
${drivinglesson.accident}
<br/>
年月日
lessondate<st:date date="${drivinglesson.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime<st:date date="${detailaccident.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime}" /><br/>
内容
${detailaccident.accidentdetail}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.detailAccidents" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時刻"><nobr>
<st:date date="${row.accidenttime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容">
<nobr>
${row.accidentdetail}
</nobr>
</display:column>
                        </display:table>
<br/>
教育受講
<div>
<logic:iterate id="drivingLesson" name="accident" property="drivingLessons">id
${drivinglesson.id}
<br/>
事故
${drivinglesson.accident}
<br/>
年月日
lessondate}" /><br/>
実施機関・講師等
${drivinglesson.lessonplace}
<br/>
教育内容
${drivinglesson.lessoncontent}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.drivingLessons" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年月日"><nobr>
<st:date date="${row.lessondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="実施機関・講師等">
<nobr>
${row.lessonplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="教育内容">
<nobr>
${row.lessoncontent}
</nobr>
</display:column>
                        </display:table>
<br/>
被害者
<div>
<logic:iterate id="victim" name="accident" property="victims">id
${victim.id}
<br/>
事故
${victim.accident}
<br/>
被害者
${victim.victim}
<br/>
性別
${victim.sexofvictim}
<br/>
年齢
${victim.ageofvictim}
<br/>
事故対象物
${victim.objectofaccident}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.victims" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="被害者">
<nobr>
${row.victim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.sexofvictim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年齢">
<nobr>
${row.ageofvictim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故対象物">
<nobr>
${row.objectofaccident}
</nobr>
</display:column>
                        </display:table>
<br/>
承認
<div>
<logic:iterate id="approval" name="accident" property="approvals">id
${approval.id}
<br/>
日付
approvaldate<st:date date="${approval.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime<st:date date="${detailaccident.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime}" /><br/>
内容
${detailaccident.accidentdetail}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.detailAccidents" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時刻"><nobr>
<st:date date="${row.accidenttime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容">
<nobr>
${row.accidentdetail}
</nobr>
</display:column>
                        </display:table>
<br/>
教育受講
<div>
<logic:iterate id="drivingLesson" name="accident" property="drivingLessons">id
${drivinglesson.id}
<br/>
事故
${drivinglesson.accident}
<br/>
年月日
lessondate<st:date date="${drivinglesson.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime<st:date date="${detailaccident.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime}" /><br/>
内容
${detailaccident.accidentdetail}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.detailAccidents" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時刻"><nobr>
<st:date date="${row.accidenttime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容">
<nobr>
${row.accidentdetail}
</nobr>
</display:column>
                        </display:table>
<br/>
教育受講
<div>
<logic:iterate id="drivingLesson" name="accident" property="drivingLessons">id
${drivinglesson.id}
<br/>
事故
${drivinglesson.accident}
<br/>
年月日
lessondate}" /><br/>
実施機関・講師等
${drivinglesson.lessonplace}
<br/>
教育内容
${drivinglesson.lessoncontent}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.drivingLessons" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年月日"><nobr>
<st:date date="${row.lessondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="実施機関・講師等">
<nobr>
${row.lessonplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="教育内容">
<nobr>
${row.lessoncontent}
</nobr>
</display:column>
                        </display:table>
<br/>
被害者
<div>
<logic:iterate id="victim" name="accident" property="victims">id
${victim.id}
<br/>
事故
${victim.accident}
<br/>
被害者
${victim.victim}
<br/>
性別
${victim.sexofvictim}
<br/>
年齢
${victim.ageofvictim}
<br/>
事故対象物
${victim.objectofaccident}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.victims" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="被害者">
<nobr>
${row.victim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.sexofvictim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年齢">
<nobr>
${row.ageofvictim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故対象物">
<nobr>
${row.objectofaccident}
</nobr>
</display:column>
                        </display:table>
<br/>
承認
<div>
<logic:iterate id="approval" name="accident" property="approvals">id
${approval.id}
<br/>
日付
approvaldate}" /><br/>
事故
${approval.accident}
<br/>
役職
${approval.position}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.approvals" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.approvaldate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="役職">
<nobr>
${row.position}
</nobr>
</display:column>
                        </display:table>
<br/>
事故歴
<div>
<logic:iterate id="event" name="accident" property="events">id
${event.id}
<br/>
事故
${event.accident}
<br/>
年月日
historydate<st:date date="${event.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime<st:date date="${detailaccident.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime}" /><br/>
内容
${detailaccident.accidentdetail}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.detailAccidents" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時刻"><nobr>
<st:date date="${row.accidenttime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容">
<nobr>
${row.accidentdetail}
</nobr>
</display:column>
                        </display:table>
<br/>
教育受講
<div>
<logic:iterate id="drivingLesson" name="accident" property="drivingLessons">id
${drivinglesson.id}
<br/>
事故
${drivinglesson.accident}
<br/>
年月日
lessondate<st:date date="${drivinglesson.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime<st:date date="${detailaccident.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime}" /><br/>
内容
${detailaccident.accidentdetail}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.detailAccidents" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時刻"><nobr>
<st:date date="${row.accidenttime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容">
<nobr>
${row.accidentdetail}
</nobr>
</display:column>
                        </display:table>
<br/>
教育受講
<div>
<logic:iterate id="drivingLesson" name="accident" property="drivingLessons">id
${drivinglesson.id}
<br/>
事故
${drivinglesson.accident}
<br/>
年月日
lessondate}" /><br/>
実施機関・講師等
${drivinglesson.lessonplace}
<br/>
教育内容
${drivinglesson.lessoncontent}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.drivingLessons" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年月日"><nobr>
<st:date date="${row.lessondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="実施機関・講師等">
<nobr>
${row.lessonplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="教育内容">
<nobr>
${row.lessoncontent}
</nobr>
</display:column>
                        </display:table>
<br/>
被害者
<div>
<logic:iterate id="victim" name="accident" property="victims">id
${victim.id}
<br/>
事故
${victim.accident}
<br/>
被害者
${victim.victim}
<br/>
性別
${victim.sexofvictim}
<br/>
年齢
${victim.ageofvictim}
<br/>
事故対象物
${victim.objectofaccident}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.victims" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="被害者">
<nobr>
${row.victim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.sexofvictim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年齢">
<nobr>
${row.ageofvictim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故対象物">
<nobr>
${row.objectofaccident}
</nobr>
</display:column>
                        </display:table>
<br/>
承認
<div>
<logic:iterate id="approval" name="accident" property="approvals">id
${approval.id}
<br/>
日付
approvaldate<st:date date="${approval.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime<st:date date="${detailaccident.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime}" /><br/>
内容
${detailaccident.accidentdetail}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.detailAccidents" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時刻"><nobr>
<st:date date="${row.accidenttime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容">
<nobr>
${row.accidentdetail}
</nobr>
</display:column>
                        </display:table>
<br/>
教育受講
<div>
<logic:iterate id="drivingLesson" name="accident" property="drivingLessons">id
${drivinglesson.id}
<br/>
事故
${drivinglesson.accident}
<br/>
年月日
lessondate<st:date date="${drivinglesson.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime<st:date date="${detailaccident.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate<st:date date="${aptitudetestofdriving.運転適性診断
<div>
<logic:iterate id="aptitudeTestOfDriving" name="accident" property="aptitudeTestOfDrivings">id
${aptitudetestofdriving.id}
<br/>
事故
${aptitudetestofdriving.accident}
<br/>
日付
testdate}" /><br/>
場所
${aptitudetestofdriving.testplace}
<br/>
個人指導内容
${aptitudetestofdriving.individualguidance}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.aptitudeTestOfDrivings" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.testdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="場所">
<nobr>
${row.testplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人指導内容">
<nobr>
${row.individualguidance}
</nobr>
</display:column>
                        </display:table>
<br/>
事故発生状況
<div>
<logic:iterate id="detailAccident" name="accident" property="detailAccidents">id
${detailaccident.id}
<br/>
事故
${detailaccident.accident}
<br/>
時刻
accidenttime}" /><br/>
内容
${detailaccident.accidentdetail}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.detailAccidents" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時刻"><nobr>
<st:date date="${row.accidenttime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容">
<nobr>
${row.accidentdetail}
</nobr>
</display:column>
                        </display:table>
<br/>
教育受講
<div>
<logic:iterate id="drivingLesson" name="accident" property="drivingLessons">id
${drivinglesson.id}
<br/>
事故
${drivinglesson.accident}
<br/>
年月日
lessondate}" /><br/>
実施機関・講師等
${drivinglesson.lessonplace}
<br/>
教育内容
${drivinglesson.lessoncontent}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.drivingLessons" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年月日"><nobr>
<st:date date="${row.lessondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="実施機関・講師等">
<nobr>
${row.lessonplace}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="教育内容">
<nobr>
${row.lessoncontent}
</nobr>
</display:column>
                        </display:table>
<br/>
被害者
<div>
<logic:iterate id="victim" name="accident" property="victims">id
${victim.id}
<br/>
事故
${victim.accident}
<br/>
被害者
${victim.victim}
<br/>
性別
${victim.sexofvictim}
<br/>
年齢
${victim.ageofvictim}
<br/>
事故対象物
${victim.objectofaccident}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.victims" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="被害者">
<nobr>
${row.victim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.sexofvictim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年齢">
<nobr>
${row.ageofvictim}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故対象物">
<nobr>
${row.objectofaccident}
</nobr>
</display:column>
                        </display:table>
<br/>
承認
<div>
<logic:iterate id="approval" name="accident" property="approvals">id
${approval.id}
<br/>
日付
approvaldate}" /><br/>
事故
${approval.accident}
<br/>
役職
${approval.position}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.approvals" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.approvaldate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="役職">
<nobr>
${row.position}
</nobr>
</display:column>
                        </display:table>
<br/>
事故歴
<div>
<logic:iterate id="event" name="accident" property="events">id
${event.id}
<br/>
事故
${event.accident}
<br/>
年月日
historydate}" /><br/>
内容・処分等
${event.contents}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="accident.events" id="row" requestURI="ForRelations.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accident.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年月日"><nobr>
<st:date date="${row.historydate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="内容・処分等">
<nobr>
${row.contents}
</nobr>
</display:column>
                        </display:table>
<br/>
付属品
${accident.attachment}
<br/>


</div>



	</body>
</html:html>


