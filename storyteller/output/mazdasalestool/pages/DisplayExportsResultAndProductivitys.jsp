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
<display:column media="xml csv excel pdf" property="month" title="月"/>
<display:column media="xml csv excel pdf" property="year" title="年"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="newsales" title="売上新車"/>
<display:column media="xml csv excel pdf" property="usedsales" title="売上中古車"/>
<display:column media="xml csv excel pdf" property="storageinspection" title="入庫台数車検"/>
<display:column media="xml csv excel pdf" property="storage12" title="入庫台数12点"/>
<display:column media="xml csv excel pdf" property="storagemsc" title="入庫台数ＭＳＣ"/>
<display:column media="xml csv excel pdf" property="newassurancenew" title="保険件数新規件数"/>
<display:column media="xml csv excel pdf" property="usedassurancecontinuance" title="保険件数継続件数"/>
<display:column media="xml csv excel pdf" property="newprofit" title="新車利益"/>
<display:column media="xml csv excel pdf" property="usedprofit" title="中古車利益"/>
<display:column media="xml csv excel pdf" property="newcustomeralternatives" title="新車顧客代替台数"/>
<display:column media="xml csv excel pdf" property="newcustomerincrement" title="新車顧客増車台数"/>
<display:column media="xml csv excel pdf" property="newnewotheralternatives" title="新車他銘柄代替台数"/>
<display:column media="xml csv excel pdf" property="newnewothernew" title="新車新規台数"/>
<display:column media="xml csv excel pdf" property="usedcustomeralternatives" title="中古車顧客代替台数"/>
<display:column media="xml csv excel pdf" property="usedcustomerincrement" title="中古車顧客増車台数"/>
<display:column media="xml csv excel pdf" property="usednewotheralternatives" title="中古車他銘柄代替台数"/>
<display:column media="xml csv excel pdf" property="usednewothernew" title="中古車新規台数"/>
<display:column media="xml csv excel pdf" property="customernum" title="顧客数"/>
<display:column media="xml csv excel pdf" property="customerprotectionrate" title="顧客防衛率"/>
<display:column media="xml csv excel pdf" property="customerscore" title="ＣＳスコア"/>
<display:column media="xml csv excel pdf" property="termgoal" title="年間の目標"/>
<display:column media="xml csv excel pdf" property="firsthalfgoal" title="上期のゴール"/>
<display:column media="xml csv excel pdf" property="secondhalfgoal" title="下期のゴール"/>
<display:column media="xml csv excel pdf" property="firsthalfselfoverview" title="上期の総括"/>
<display:column media="xml csv excel pdf" property="secondhalfselfoverview" title="下期の総括"/>
<display:column media="xml csv excel pdf" property="selfoverview" title="自己総括"/>
<display:column media="xml csv excel pdf" property="customerassuarancerate" title="管理保険付保率"/>
<display:column media="xml csv excel pdf" property="newotherroute" title="新車法人・業販・その他ルート"/>
<display:column media="xml csv excel pdf" property="usedotherroute" title="中古車法人・業販・その他ルート"/>

                    </display:table>


