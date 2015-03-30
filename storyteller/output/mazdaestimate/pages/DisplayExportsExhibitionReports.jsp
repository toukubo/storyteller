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
                    <display:table name="${exhibitionReports}" id="row" requestURI="ExhibitionReports.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="exhibitionReportCars" title="exhibitionReportCars"/>
<display:column media="xml csv excel pdf" property="demo" title="デモ"/>
<display:column media="xml csv excel pdf" property="engenderabhotcustomer" title="ABホット発生顧客"/>
<display:column media="xml csv excel pdf" property="engenderabhotstock" title="ABホット発生ストック"/>
<display:column media="xml csv excel pdf" property="engenderabhotfree" title="ABホット発生フリー"/>
<display:column media="xml csv excel pdf" property="exhibition" title="exhibition"/>
<display:column media="xml csv excel pdf" property="visitorsabcustomer" title="来場者数AB顧客"/>
<display:column media="xml csv excel pdf" property="visitorsabnewother" title="来場者数AB新他"/>
<display:column media="xml csv excel pdf" property="visitorsnonabcustomer" title="来場者数NonAB顧客"/>
<display:column media="xml csv excel pdf" property="visitorsnonabstock" title="来場者数NonABストック"/>
<display:column media="xml csv excel pdf" property="visitorsnonabfree" title="来場者数NonABフリー"/>
<display:column media="xml csv excel pdf" property="questionnairecollected" title="アンケート回収"/>
<display:column media="xml csv excel pdf" property="vip" title="ＶＩＰ"/>
<display:column media="xml csv excel pdf" property="appraisalowncars" title="査定自銘柄"/>
<display:column media="xml csv excel pdf" property="appraisalothercars" title="査定他銘柄"/>
<display:column media="xml csv excel pdf" property="commitment" title="コミットメント"/>
<display:column media="xml csv excel pdf" property="scramble" title="スクランブル"/>
<display:column media="xml csv excel pdf" property="orderdetailabcustomer" title="受注内訳AB顧客"/>
<display:column media="xml csv excel pdf" property="orderdetailabnewother" title="受注内訳AB新他"/>
<display:column media="xml csv excel pdf" property="orderdetailnonabcustomer" title="受注内訳NonAB顧客"/>
<display:column media="xml csv excel pdf" property="orderdetailnonabstock" title="受注内訳NonABストック"/>
<display:column media="xml csv excel pdf" property="orderdetailnonabfree" title="受注内訳NonABフリー"/>
<display:column media="xml csv excel pdf" property="orderdetailcarothers" title="受注内訳車種別その他"/>
<display:column media="xml csv excel pdf" property="orderdetaillightcarothers" title="受注内訳車種別軽自動車その他"/>
<display:column media="xml csv excel pdf" property="visitmotivationcarothers" title="来店目的車種その他"/>
<display:column media="xml csv excel pdf" property="visitmotivationlightcarothers" title="来店目的車種軽自動車その他"/>
<display:column media="xml csv excel pdf" property="visitmotivationdm" title="来店きっかけ呼込・DM"/>
<display:column media="xml csv excel pdf" property="visitmotivationleaflet" title="来店きっかけ折込チラシ"/>
<display:column media="xml csv excel pdf" property="visitmotivationnewspaperad" title="来店きっかけ新聞告知"/>
<display:column media="xml csv excel pdf" property="visitmotivationinpassing" title="来店きっかけ通りがかり"/>
<display:column media="xml csv excel pdf" property="visitmotivationtvradio" title="来店きっかけTV・ラジオ"/>
<display:column media="xml csv excel pdf" property="visitmotivationothers" title="来店きっかけその他"/>
<display:column media="xml csv excel pdf" property="datetime" title="日時"/>

                    </display:table>


