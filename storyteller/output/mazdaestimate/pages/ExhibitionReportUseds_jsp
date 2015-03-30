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

<span class="title">中古車展示会報告一覧</span>
                    <display:table name="${exhibitionReportUseds}" id="row" requestURI="ExhibitionReportUseds.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ExhibitionReportUseds.do?id=${row.id}">編集</a>
                        <a href="DeleteExhibitionReportUsed.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="見積">
<nobr>
${row.estimation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="確約">
<nobr>
${row.visitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="exhibition">
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
 <display:column media="html" sortable="true" title="来店きっかけその他呼込み">
<nobr>
${row.visitmotivationdm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけチラシ">
<nobr>
${row.visitmotivationleaflet}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけ通りがかり">
<nobr>
${row.visitmotivationinpassing}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけその他">
<nobr>
${row.visitmotivationothers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="TELコール">
<nobr>
${row.telephoneappointment}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来電">
<nobr>
${row.haveacall}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけ確約実来店">
<nobr>
${row.visitmotivationvisitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけ紹介">
<nobr>
${row.visitmotivationintroduction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけ雑誌">
<nobr>
${row.visitmotivationmagazines}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店きっかけインターネット">
<nobr>
${row.visitmotivationinternet}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="着席">
<nobr>
${row.seated}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="デモ試乗">
<nobr>
${row.demotrycar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="画像検索">
<nobr>
${row.searchimages}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ABホット発生">
<nobr>
${row.engenderabhot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両自銘柄乗用">
<nobr>
${row.orderdetailownpassenger}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両自銘柄デミオ">
<nobr>
${row.orderdetailowndemio}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両自銘柄MPV">
<nobr>
${row.orderdetailownmpv}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両自銘柄プレマシ">
<nobr>
${row.orderdetailownpremacy}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両自銘柄軽">
<nobr>
${row.orderdetailownlightcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両自銘柄バントラ">
<nobr>
${row.orderdetailownvantrack}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両他銘柄乗用">
<nobr>
${row.orderdetailotherpassenger}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両他銘柄RV">
<nobr>
${row.orderdetailotherrv}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両他銘柄軽">
<nobr>
${row.orderdetailotherlightcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注車両他銘柄バントラ">
<nobr>
${row.orderdetailothervantrack}
</nobr>
</display:column>

                    </display:table>
<a href="ExhibitionReportUseds.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="ExhibitionReportUseds.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="ExhibitionReportUseds.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="ExhibitionReportUseds.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	中古車展示会報告編集
</span>
<span id="subform">

		<form method="POST" action="PostExhibitionReportUsedVP.do">
          <html:hidden name="form" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
見積<br />
<html:text name="form" property="estimation" /><br />

確約<br />
<html:text name="form" property="visitaffirmation" /><br />

                                exhibition<br />
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

来店きっかけその他呼込み<br />
<html:text name="form" property="visitmotivationdm" /><br />

来店きっかけチラシ<br />
<html:text name="form" property="visitmotivationleaflet" /><br />

来店きっかけ通りがかり<br />
<html:text name="form" property="visitmotivationinpassing" /><br />

来店きっかけその他<br />
<html:text name="form" property="visitmotivationothers" /><br />

TELコール<br />
<html:text name="form" property="telephoneappointment" /><br />

来電<br />
<html:text name="form" property="haveacall" /><br />

来店きっかけ確約実来店<br />
<html:text name="form" property="visitmotivationvisitaffirmation" /><br />

来店きっかけ紹介<br />
<html:text name="form" property="visitmotivationintroduction" /><br />

来店きっかけ雑誌<br />
<html:text name="form" property="visitmotivationmagazines" /><br />

来店きっかけインターネット<br />
<html:text name="form" property="visitmotivationinternet" /><br />

着席<br />
<html:text name="form" property="seated" /><br />

デモ試乗<br />
<html:text name="form" property="demotrycar" /><br />

画像検索<br />
<html:text name="form" property="searchimages" /><br />

ABホット発生<br />
<html:text name="form" property="engenderabhot" /><br />

受注車両自銘柄乗用<br />
<html:text name="form" property="orderdetailownpassenger" /><br />

受注車両自銘柄デミオ<br />
<html:text name="form" property="orderdetailowndemio" /><br />

受注車両自銘柄MPV<br />
<html:text name="form" property="orderdetailownmpv" /><br />

受注車両自銘柄プレマシ<br />
<html:text name="form" property="orderdetailownpremacy" /><br />

受注車両自銘柄軽<br />
<html:text name="form" property="orderdetailownlightcar" /><br />

受注車両自銘柄バントラ<br />
<html:text name="form" property="orderdetailownvantrack" /><br />

受注車両他銘柄乗用<br />
<html:text name="form" property="orderdetailotherpassenger" /><br />

受注車両他銘柄RV<br />
<html:text name="form" property="orderdetailotherrv" /><br />

受注車両他銘柄軽<br />
<html:text name="form" property="orderdetailotherlightcar" /><br />

受注車両他銘柄バントラ<br />
<html:text name="form" property="orderdetailothervantrack" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="ExhibitionReportUseds.do">新規中古車展示会報告作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

