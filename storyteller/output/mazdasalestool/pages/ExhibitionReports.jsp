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
	<tiles:put name="title" value="展示会報告一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">展示会報告一覧</span>
                    <display:table name="${exhibitionReports}" id="row" requestURI="ExhibitionReports.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ExhibitionReports.do?id=${row.id}">編集</a>
                        <a href="DeleteExhibitionReport.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="車種別展示会報告">
<nobr>
${row.exhibitionReportCars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="デモ">
<nobr>
${row.demo}
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
 <display:column media="html" sortable="true" title="展示会">
<nobr>
${row.exhibition.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来場者数AB顧客">
<nobr>
${row.visitorsabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来場者数AB新他">
<nobr>
${row.visitorsabnewother}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来場者数NonAB顧客">
<nobr>
${row.visitorsnonabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来場者数NonABストック">
<nobr>
${row.visitorsnonabstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来場者数NonABフリー">
<nobr>
${row.visitorsnonabfree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アンケート回収">
<nobr>
${row.questionnairecollected}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="VIP">
<nobr>
${row.vip}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="査定自銘柄">
<nobr>
${row.appraisalowncars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="査定他銘柄">
<nobr>
${row.appraisalothercars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミットメント">
<nobr>
${row.commitment}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="スクランブル">
<nobr>
${row.scramble}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注内訳AB顧客">
<nobr>
${row.orderdetailabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注内訳AB新他">
<nobr>
${row.orderdetailabnewother}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注内訳NonAB顧客">
<nobr>
${row.orderdetailnonabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注内訳NonABストック">
<nobr>
${row.orderdetailnonabstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注内訳NonABフリー">
<nobr>
${row.orderdetailnonabfree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注内訳車種別その他">
<nobr>
${row.orderdetailcarothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注内訳車種別軽自動車その他">
<nobr>
${row.orderdetaillightcarothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店目的車種その他">
<nobr>
${row.visitmotivationcarothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店目的車種軽自動車その他">
<nobr>
${row.visitmotivationlightcarothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけ呼込・DM">
<nobr>
${row.visitmotivationdm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけ折込チラシ">
<nobr>
${row.visitmotivationleaflet}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけ新聞告知">
<nobr>
${row.visitmotivationnewspaperad}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけ通りがかり">
<nobr>
${row.visitmotivationinpassing}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけTV・ラジオ">
<nobr>
${row.visitmotivationtvradio}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけその他">
<nobr>
${row.visitmotivationothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="datetime"><nobr>
<bean:write name="row" property="datetime" format="yyyy/MM/dd" /> </nobr>
</display:column>

                    </display:table>
<a href="ExhibitionReports.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="ExhibitionReports.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="ExhibitionReports.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="ExhibitionReports.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	展示会報告編集
</span>
<span id="subform">

		<form method="POST" action="PostExhibitionReportVP.do">
          <html:hidden name="form" property="id"/>

デモ<br />
<html:text name="form" property="demo" /><br />

ABホット発生顧客<br />
<html:text name="form" property="engenderabhotcustomer" /><br />

ABホット発生ストック<br />
<html:text name="form" property="engenderabhotstock" /><br />

ABホット発生フリー<br />
<html:text name="form" property="engenderabhotfree" /><br />

                                展示会<br />
                                <c:choose>
                                    <c:when test="${empty Exhibitions}">
                                         <select name="exhibition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="exhibition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Exhibitions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.exhibition.id}">
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


来場者数AB顧客<br />
<html:text name="form" property="visitorsabcustomer" /><br />

来場者数AB新他<br />
<html:text name="form" property="visitorsabnewother" /><br />

来場者数NonAB顧客<br />
<html:text name="form" property="visitorsnonabcustomer" /><br />

来場者数NonABストック<br />
<html:text name="form" property="visitorsnonabstock" /><br />

来場者数NonABフリー<br />
<html:text name="form" property="visitorsnonabfree" /><br />

アンケート回収<br />
<html:text name="form" property="questionnairecollected" /><br />

VIP<br />
<html:text name="form" property="vip" /><br />

査定自銘柄<br />
<html:text name="form" property="appraisalowncars" /><br />

査定他銘柄<br />
<html:text name="form" property="appraisalothercars" /><br />

コミットメント<br />
<html:text name="form" property="commitment" /><br />

スクランブル<br />
<html:text name="form" property="scramble" /><br />

受注内訳AB顧客<br />
<html:text name="form" property="orderdetailabcustomer" /><br />

受注内訳AB新他<br />
<html:text name="form" property="orderdetailabnewother" /><br />

受注内訳NonAB顧客<br />
<html:text name="form" property="orderdetailnonabcustomer" /><br />

受注内訳NonABストック<br />
<html:text name="form" property="orderdetailnonabstock" /><br />

受注内訳NonABフリー<br />
<html:text name="form" property="orderdetailnonabfree" /><br />

受注内訳車種別その他<br />
<html:text name="form" property="orderdetailcarothers" /><br />

受注内訳車種別軽自動車その他<br />
<html:text name="form" property="orderdetaillightcarothers" /><br />

来店目的車種その他<br />
<html:text name="form" property="visitmotivationcarothers" /><br />

来店目的車種軽自動車その他<br />
<html:text name="form" property="visitmotivationlightcarothers" /><br />

来店きっかけ呼込・DM<br />
<html:text name="form" property="visitmotivationdm" /><br />

来店きっかけ折込チラシ<br />
<html:text name="form" property="visitmotivationleaflet" /><br />

来店きっかけ新聞告知<br />
<html:text name="form" property="visitmotivationnewspaperad" /><br />

来店きっかけ通りがかり<br />
<html:text name="form" property="visitmotivationinpassing" /><br />

来店きっかけTV・ラジオ<br />
<html:text name="form" property="visitmotivationtvradio" /><br />

来店きっかけその他<br />
<html:text name="form" property="visitmotivationothers" /><br />

datetime<br />
<input type="text" name="datetimeAsString" value="<bean:write name="form" property="datetime" format="yyyy/MM/dd" />" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="ExhibitionReports.do">新規展示会報告作成</a>
</div>




	</tiles:put>
</tiles:insert>
