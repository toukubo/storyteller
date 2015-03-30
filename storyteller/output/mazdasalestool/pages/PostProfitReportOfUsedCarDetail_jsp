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
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostProfitReportOfUsedCarVP">
          <html:hidden name="form" property="id"/>

                                intraUser<br />
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


内クレジット<br />
<html:text size="20"  name="form" property="credit" /><br />

通信欄<br />
<html:text size="20"  name="form" property="memo" /><br />

販売費<br />
<html:text size="20"  name="form" property="salescost" /><br />

受注日<br />
<input type="text" name="accepteddateAsString" value="<st:date date="${form.accepteddate}" size="20" />" /><br />
販売先ユーザ名<br />
<html:text size="20"  name="form" property="customername" /><br />

税抜き登録収手<br />
<html:text size="20"  name="form" property="chargesforregisttaxex" /><br />

金利<br />
<html:text size="20"  name="form" property="interest" /><br />

支払回数<br />
<html:text size="20"  name="form" property="numofpaymentsforcredit" /><br />

登録日<br />
<input type="text" name="registeddateAsString" value="<st:date date="${form.registeddate}" size="20" />" /><br />
下取価格<br />
<html:text size="20"  name="form" property="priceoftradein" /><br />

確定注文書入力日<br />
<input type="text" name="entereddateAsString" value="<st:date date="${form.entereddate}" size="20" />" /><br />
販売車両年式<br />
<html:text size="20"  name="form" property="modelyearofsalescar" /><br />

販売車両型式<br />
<html:text size="20"  name="form" property="modelcodeofsalescar" /><br />

販売車両車体No<br />
<html:text size="20"  name="form" property="noofsalescar" /><br />

販売源泉<br />
<html:text size="20"  name="form" property="sourceofsales" /><br />

AB or NON-AB<br />
<html:text size="20"  name="form" property="ab" /><br />

商談のキッカケ<br />
<html:text size="20"  name="form" property="triggerofsales" /><br />

受注再生<br />
<html:text size="20"  name="form" property="recoverorder" /><br />

新規移転登録<br />
<html:text size="20"  name="form" property="registtype" /><br />

車両本体税抜き指示価格<br />
<html:text size="20"  name="form" property="assignedpricetaxex" /><br />

車両本体税抜き販売価格<br />
<html:text size="20"  name="form" property="salespricetaxex" /><br />

車両本体税抜き原価<br />
<html:text size="20"  name="form" property="costpricetaxex" /><br />

税込支払総額<br />
<html:text size="20"  name="form" property="totalpaymenttaxin" /><br />

内現金<br />
<html:text size="20"  name="form" property="cash" /><br />

下取年式<br />
<html:text size="20"  name="form" property="modelyearoftradein" /><br />

下取型式<br />
<html:text size="20"  name="form" property="modelcodeoftradein" /><br />

下取車体NO<br />
<html:text size="20"  name="form" property="nooftradein" /><br />

税抜き有償整備<br />
<html:text size="20"  name="form" property="priceofnonfreemaintenancetaxex" /><br />

税抜き有償部品<br />
<html:text size="20"  name="form" property="priceofnonfreepartstaxex" /><br />

クレジットKB<br />
<html:text size="20"  name="form" property="creditkb" /><br />

中古再生部品<br />
<html:text size="20"  name="form" property="priceofpartsforrecover" /><br />

中古再生外注<br />
<html:text size="20"  name="form" property="priceofoutsourcingforrecover" /><br />

中古再生工賃<br />
<html:text size="20"  name="form" property="priceofworkingforrecover" /><br />

                                improvementReportOfUsedCarProfit<br />
                                <c:choose>
                                    <c:when test="${empty ImprovementReportOfUsedCarProfits}">
                                         <select name="improvementReportOfUsedCarProfit" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="improvementReportOfUsedCarProfit" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ImprovementReportOfUsedCarProfits}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.improvementReportOfUsedCarProfit.id}">
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





          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
