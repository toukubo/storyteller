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
	展示会報告編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostExhibitionReportVP">
          <html:hidden name="form" property="id"/>

デモ<br />
<html:text name="form" property="demo" /><br />

ABホット発生顧客<br />
<html:text name="form" property="engenderabhotcustomer" /><br />

ABホット発生ストック<br />
<html:text name="form" property="engenderabhotstock" /><br />

ABホット発生フリー<br />
<html:text name="form" property="engenderabhotfree" /><br />

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

ＶＩＰ<br />
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

日時<br />
<input type="text" name="datetimeAsString" value="<bean:write name="form" property="datetime" format="yyyy/MM/dd" />" /><br />



          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


