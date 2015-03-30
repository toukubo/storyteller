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
                    <display:table name="${resultAndProductivitys}" id="row" requestURI="ResultAndProductivitys.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="month" title="month"/>
<display:column media="xml csv excel pdf" property="year" title="年"/>
<display:column media="xml csv excel pdf" property="type" title="種類"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="shop" title="店舗名"/>
<display:column media="xml csv excel pdf" property="intraUser" title="担当者"/>
<display:column media="xml csv excel pdf" property="todate" title="売上新車"/>
<display:column media="xml csv excel pdf" property="salesnew" title="売上新車"/>
<display:column media="xml csv excel pdf" property="newcustomerparallel" title="新車顧客併有車代替台数"/>
<display:column media="xml csv excel pdf" property="usedotherintroductionemployee" title="中古車社員紹介台数"/>
<display:column media="xml csv excel pdf" property="usedotherintroductionother" title="中古車その他の紹介台数"/>
<display:column media="xml csv excel pdf" property="salesused" title="売上中古車"/>
<display:column media="xml csv excel pdf" property="storageinspection" title="入庫台数車検"/>
<display:column media="xml csv excel pdf" property="storage12" title="入庫台数12点"/>
<display:column media="xml csv excel pdf" property="storagemsc" title="入庫台数ＭＳＣ"/>
<display:column media="xml csv excel pdf" property="assurancenew" title="assurancenew"/>
<display:column media="xml csv excel pdf" property="assurancecontinuance" title="assurancecontinuance"/>
<display:column media="xml csv excel pdf" property="profitnew" title="新車利益"/>
<display:column media="xml csv excel pdf" property="profitused" title="中古車利益"/>
<display:column media="xml csv excel pdf" property="newcustomeralternatives" title="新車顧客代替台数"/>
<display:column media="xml csv excel pdf" property="newcustomerincrement" title="新車顧客増車台数"/>
<display:column media="xml csv excel pdf" property="newcustomerintroduction" title="新車顧客紹介台数"/>
<display:column media="xml csv excel pdf" property="newnewotheralternatives" title="新車他銘柄代替台数"/>
<display:column media="xml csv excel pdf" property="newnewothernew" title="新車新規台数"/>
<display:column media="xml csv excel pdf" property="newvendormarket" title="新車業者仕切台数"/>
<display:column media="xml csv excel pdf" property="newvendorintroduction" title="新車業者紹介台数"/>
<display:column media="xml csv excel pdf" property="newotherintroductionemployee" title="新車社員紹介台数"/>
<display:column media="xml csv excel pdf" property="newotherintroductionother" title="新車その他の紹介台数"/>
<display:column media="xml csv excel pdf" property="usedcustomeralternatives" title="中古車顧客代替台数"/>
<display:column media="xml csv excel pdf" property="usedcustomerincrement" title="中古車顧客増車台数"/>
<display:column media="xml csv excel pdf" property="usedcustomerintroduction" title="中古車顧客紹介台数"/>
<display:column media="xml csv excel pdf" property="usedcustomerparallel" title="中古車顧客併有車代替台数"/>
<display:column media="xml csv excel pdf" property="usednewotheralternatives" title="中古車他銘柄代替台数"/>
<display:column media="xml csv excel pdf" property="usednewothernew" title="中古車新規台数"/>
<display:column media="xml csv excel pdf" property="usedvendormarket" title="中古車業者仕切台数"/>
<display:column media="xml csv excel pdf" property="usedvendorintroduction" title="中古車業者紹介台数"/>
<display:column media="xml csv excel pdf" property="base" title="売上新車"/>
<display:column media="xml csv excel pdf" property="newsales" title="売上新車"/>
<display:column media="xml csv excel pdf" property="usedsales" title="売上中古車"/>
<display:column media="xml csv excel pdf" property="newassurancenew" title="保険件数新規件数"/>
<display:column media="xml csv excel pdf" property="usedassurancecontinuance" title="保険件数継続件数"/>
<display:column media="xml csv excel pdf" property="newprofit" title="新車利益"/>
<display:column media="xml csv excel pdf" property="usedprofit" title="新車利益"/>
<display:column media="xml csv excel pdf" property="newotherintroductionothers" title="新車その他の紹介台数"/>
<display:column media="xml csv excel pdf" property="usedotherintroductionothers" title="中古車その他の紹介台数"/>
<display:column media="xml csv excel pdf" property="activitystorefront" title="活動量店頭面談数"/>
<display:column media="xml csv excel pdf" property="activityvisit" title="活動量訪問面談数"/>
<display:column media="xml csv excel pdf" property="activityslc" title="活動量ＳＬＣ（除くＤＭ）"/>
<display:column media="xml csv excel pdf" property="activitymail" title="活動量メール"/>
<display:column media="xml csv excel pdf" property="activitytel" title="活動量電話"/>
<display:column media="xml csv excel pdf" property="customeractivitystorefront" title="顧客活動量顧客店頭面談数"/>
<display:column media="xml csv excel pdf" property="customeractivityvisit" title="顧客活動量顧客訪問面談数"/>
<display:column media="xml csv excel pdf" property="customeractivityslc" title="顧客活動量顧客ＳＬＣ（除くＤＭ）"/>
<display:column media="xml csv excel pdf" property="customeractivitymail" title="顧客活動量顧客メール"/>
<display:column media="xml csv excel pdf" property="customeractivitytel" title="顧客活動量顧客電話"/>
<display:column media="xml csv excel pdf" property="customernum" title="顧客数"/>
<display:column media="xml csv excel pdf" property="customerscore" title="ＣＳスコア"/>
<display:column media="xml csv excel pdf" property="termgoal" title="年間の目標"/>
<display:column media="xml csv excel pdf" property="firsthalfgoal" title="上期のゴール"/>
<display:column media="xml csv excel pdf" property="secondhalfgoal" title="下期のゴール"/>
<display:column media="xml csv excel pdf" property="firsthalfselfoverview" title="上期の総括"/>
<display:column media="xml csv excel pdf" property="secondhalfselfoverview" title="下期の総括"/>
<display:column media="xml csv excel pdf" property="selfoverview" title="自己総括"/>

                    </display:table>


