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
                    <display:table name="${improvementReportOfUsedCarProfits}" id="row" requestURI="ImprovementReportOfUsedCarProfits.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="numofplan" title="当月計画"/>
<display:column media="xml csv excel pdf" property="numofforecast" title="予測台数"/>
<display:column media="xml csv excel pdf" property="profitReportOfUsedCar" title="profitReportOfUsedCar"/>
<display:column media="xml csv excel pdf" property="month" title="month"/>
<display:column media="xml csv excel pdf" property="year" title="year"/>
<display:column media="xml csv excel pdf" property="base" title="base"/>

                    </display:table>


