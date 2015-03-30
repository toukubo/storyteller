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
<span class="title">ExhibitionReportUsed 編集</span>
		<html:form method="POST" action="/ExhibitionReportUsedVP">
          <html:hidden name="exhibitionReportUsed" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
見積り<br />
<html:text name="form" property="estimation" /><br />

確約<br />
<html:text name="form" property="visitaffirmation" /><br />

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

来場者数AB顧客<br />
<html:text name="form" property="visitorsabcustomer" /><br />



          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


