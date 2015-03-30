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
		<html:form method="POST" action="/PostImprovementReportOfNewCarProfitVP">
          <html:hidden name="form" property="id"/>

remianofacceptedlastmonth<br />
<html:text name="form" property="remianofacceptedlastmonth" /><br />

remainofregistedlastmonth<br />
<html:text name="form" property="remainofregistedlastmonth" /><br />

numofaccepted<br />
<html:text name="form" property="numofaccepted" /><br />

numofregisted<br />
<html:text name="form" property="numofregisted" /><br />

incentiveoflevelget<br />
<html:text name="form" property="incentiveoflevelget" /><br />

volumeaction<br />
<html:text name="form" property="volumeaction" /><br />

profitofnewcar<br />
<html:text name="form" property="profitofnewcar" /><br />

priceofmainnewcar<br />
<html:text name="form" property="priceofmainnewcar" /><br />

profitofmainnewcar<br />
<html:text name="form" property="profitofmainnewcar" /><br />

priceofwithoptionsnewcar<br />
<html:text name="form" property="priceofwithoptionsnewcar" /><br />

profitofwithoptionsnewcar<br />
<html:text name="form" property="profitofwithoptionsnewcar" /><br />

discountnewcar<br />
<html:text name="form" property="discountnewcar" /><br />

chargeforregistnewcar<br />
<html:text name="form" property="chargeforregistnewcar" /><br />

profitofcarnewcar<br />
<html:text name="form" property="profitofcarnewcar" /><br />

principalofcreditnewcar<br />
<html:text name="form" property="principalofcreditnewcar" /><br />

profitofcreditnewcar<br />
<html:text name="form" property="profitofcreditnewcar" /><br />

profitofsalesnewcar<br />
<html:text name="form" property="profitofsalesnewcar" /><br />

actionsnewcar<br />
<html:text name="form" property="actionsnewcar" /><br />

marginalprofitnewcar<br />
<html:text name="form" property="marginalprofitnewcar" /><br />

volumeactionnewcar<br />
<html:text name="form" property="volumeactionnewcar" /><br />

monthlyprofitnewcar<br />
<html:text name="form" property="monthlyprofitnewcar" /><br />

profitofusedcar<br />
<html:text name="form" property="profitofusedcar" /><br />

priceofmainusedcar<br />
<html:text name="form" property="priceofmainusedcar" /><br />

profitofmainusedcar<br />
<html:text name="form" property="profitofmainusedcar" /><br />

priceofwithoptionsusedcar<br />
<html:text name="form" property="priceofwithoptionsusedcar" /><br />

profitofwithoptionsusedcar<br />
<html:text name="form" property="profitofwithoptionsusedcar" /><br />

discountusedcar<br />
<html:text name="form" property="discountusedcar" /><br />

chargesforregistusedcar<br />
<html:text name="form" property="chargesforregistusedcar" /><br />

profitofcarusedcar<br />
<html:text name="form" property="profitofcarusedcar" /><br />

principalofcreditusedcar<br />
<html:text name="form" property="principalofcreditusedcar" /><br />

profitofcreditusedcar<br />
<html:text name="form" property="profitofcreditusedcar" /><br />

marginalprofitusedcar<br />
<html:text name="form" property="marginalprofitusedcar" /><br />

costofrecover<br />
<html:text name="form" property="costofrecover" /><br />

monthlyprofitusedcar<br />
<html:text name="form" property="monthlyprofitusedcar" /><br />

month<br />
<html:text name="form" property="month" /><br />

year<br />
<html:text name="form" property="year" /><br />

                                base<br />
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





          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
