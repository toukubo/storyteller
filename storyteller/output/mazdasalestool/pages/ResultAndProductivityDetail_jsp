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
<span class="title">ResultAndProductivity 編集</span>
		<html:form method="POST" action="/ResultAndProductivityVP">
          <html:hidden name="resultAndProductivity" property="id"/>

月<br />
<html:text name="form" property="month" /><br />

年<br />
<html:text name="form" property="year" /><br />

                                内部ユーザー<br />
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
<html:text name="form" property="newsales" /><br />

売上中古車<br />
<html:text name="form" property="usedsales" /><br />

入庫台数車検<br />
<html:text name="form" property="storageinspection" /><br />

入庫台数12点<br />
<html:text name="form" property="storage12" /><br />

入庫台数ＭＳＣ<br />
<html:text name="form" property="storagemsc" /><br />

保険件数新規件数<br />
<html:text name="form" property="newassurancenew" /><br />

保険件数継続件数<br />
<html:text name="form" property="usedassurancecontinuance" /><br />

新車利益<br />
<html:text name="form" property="newprofit" /><br />

中古車利益<br />
<html:text name="form" property="usedprofit" /><br />

新車顧客代替台数<br />
<html:text name="form" property="newcustomeralternatives" /><br />

新車顧客増車台数<br />
<html:text name="form" property="newcustomerincrement" /><br />

新車他銘柄代替台数<br />
<html:text name="form" property="newnewotheralternatives" /><br />

新車新規台数<br />
<html:text name="form" property="newnewothernew" /><br />

中古車顧客代替台数<br />
<html:text name="form" property="usedcustomeralternatives" /><br />

中古車顧客増車台数<br />
<html:text name="form" property="usedcustomerincrement" /><br />

中古車他銘柄代替台数<br />
<html:text name="form" property="usednewotheralternatives" /><br />

中古車新規台数<br />
<html:text name="form" property="usednewothernew" /><br />

顧客数<br />
<html:text name="form" property="customernum" /><br />

顧客防衛率<br />
<html:text name="form" property="customerprotectionrate" /><br />

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

管理保険付保率<br />
<html:text name="form" property="customerassuarancerate" /><br />

新車法人・業販・その他ルート<br />
<html:text name="form" property="newotherroute" /><br />

中古車法人・業販・その他ルート<br />
<html:text name="form" property="usedotherroute" /><br />



          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


