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

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">
<span id="title">
	編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostResultAndProductivityVP">
          <html:hidden name="form" property="id"/>

month<br />
<html:text name="form" property="month" /><br />

年<br />
<html:text name="form" property="year" /><br />

種類<br />
<html:text name="form" property="type" /><br />

                                店舗名<br />
                                <c:choose>
                                    <c:when test="${empty Shops}">
                                         <select name="shop" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="shop" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Shops}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.shop.id}">
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


                                担当者<br />
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


売上新車<br />
<input type="text" name="todateAsString" value="<bean:write name="form" property="todate" format="yyyy/MM/dd" />" /><br />
売上新車<br />
<html:text name="form" property="salesnew" /><br />

新車顧客併有車代替台数<br />
<html:text name="form" property="newcustomerparallel" /><br />

中古車社員紹介台数<br />
<html:text name="form" property="usedotherintroductionemployee" /><br />

中古車その他の紹介台数<br />
<html:text name="form" property="usedotherintroductionother" /><br />

売上中古車<br />
<html:text name="form" property="salesused" /><br />

入庫台数車検<br />
<html:text name="form" property="storageinspection" /><br />

入庫台数12点<br />
<html:text name="form" property="storage12" /><br />

入庫台数ＭＳＣ<br />
<html:text name="form" property="storagemsc" /><br />

assurancenew<br />
<html:text name="form" property="assurancenew" /><br />

assurancecontinuance<br />
<html:text name="form" property="assurancecontinuance" /><br />

新車利益<br />
<html:text name="form" property="profitnew" /><br />

中古車利益<br />
<html:text name="form" property="profitused" /><br />

新車顧客代替台数<br />
<html:text name="form" property="newcustomeralternatives" /><br />

新車顧客増車台数<br />
<html:text name="form" property="newcustomerincrement" /><br />

新車顧客紹介台数<br />
<html:text name="form" property="newcustomerintroduction" /><br />

新車他銘柄代替台数<br />
<html:text name="form" property="newnewotheralternatives" /><br />

新車新規台数<br />
<html:text name="form" property="newnewothernew" /><br />

新車業者仕切台数<br />
<html:text name="form" property="newvendormarket" /><br />

新車業者紹介台数<br />
<html:text name="form" property="newvendorintroduction" /><br />

新車社員紹介台数<br />
<html:text name="form" property="newotherintroductionemployee" /><br />

新車その他の紹介台数<br />
<html:text name="form" property="newotherintroductionother" /><br />

中古車顧客代替台数<br />
<html:text name="form" property="usedcustomeralternatives" /><br />

中古車顧客増車台数<br />
<html:text name="form" property="usedcustomerincrement" /><br />

中古車顧客紹介台数<br />
<html:text name="form" property="usedcustomerintroduction" /><br />

中古車顧客併有車代替台数<br />
<html:text name="form" property="usedcustomerparallel" /><br />

中古車他銘柄代替台数<br />
<html:text name="form" property="usednewotheralternatives" /><br />

中古車新規台数<br />
<html:text name="form" property="usednewothernew" /><br />

中古車業者仕切台数<br />
<html:text name="form" property="usedvendormarket" /><br />

中古車業者紹介台数<br />
<html:text name="form" property="usedvendorintroduction" /><br />

                                売上新車<br />
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


売上新車<br />
<html:text name="form" property="newsales" /><br />

売上中古車<br />
<html:text name="form" property="usedsales" /><br />

保険件数新規件数<br />
<html:text name="form" property="newassurancenew" /><br />

保険件数継続件数<br />
<html:text name="form" property="usedassurancecontinuance" /><br />

新車利益<br />
<html:text name="form" property="newprofit" /><br />

新車利益<br />
<html:text name="form" property="usedprofit" /><br />

新車その他の紹介台数<br />
<html:text name="form" property="newotherintroductionothers" /><br />

中古車その他の紹介台数<br />
<html:text name="form" property="usedotherintroductionothers" /><br />

活動量店頭面談数<br />
<html:text name="form" property="activitystorefront" /><br />

活動量訪問面談数<br />
<html:text name="form" property="activityvisit" /><br />

活動量ＳＬＣ（除くＤＭ）<br />
<html:text name="form" property="activityslc" /><br />

活動量メール<br />
<html:text name="form" property="activitymail" /><br />

活動量電話<br />
<html:text name="form" property="activitytel" /><br />

顧客活動量顧客店頭面談数<br />
<html:text name="form" property="customeractivitystorefront" /><br />

顧客活動量顧客訪問面談数<br />
<html:text name="form" property="customeractivityvisit" /><br />

顧客活動量顧客ＳＬＣ（除くＤＭ）<br />
<html:text name="form" property="customeractivityslc" /><br />

顧客活動量顧客メール<br />
<html:text name="form" property="customeractivitymail" /><br />

顧客活動量顧客電話<br />
<html:text name="form" property="customeractivitytel" /><br />

顧客数<br />
<html:text name="form" property="customernum" /><br />

ＣＳスコア<br />
<html:text name="form" property="customerscore" /><br />

年間の目標<br />
<html:text name="form" property="termgoal" /><br />

上期のゴール<br />
<html:text name="form" property="firsthalfgoal" /><br />

下期のゴール<br />
<html:text name="form" property="secondhalfgoal" /><br />

上期の総括<br />
<html:text name="form" property="firsthalfselfoverview" /><br />

下期の総括<br />
<html:text name="form" property="secondhalfselfoverview" /><br />

自己総括<br />
<html:text name="form" property="selfoverview" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


