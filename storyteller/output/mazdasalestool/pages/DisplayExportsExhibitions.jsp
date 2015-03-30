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
                    <display:table name="${exhibitions}" id="row" requestURI="Exhibitions.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="usedcar" title="中古車"/>
<display:column media="xml csv excel pdf" property="fromdate" title="開始日"/>
<display:column media="xml csv excel pdf" property="todate" title="終了日"/>
<display:column media="xml csv excel pdf" property="weeklyplan" title="週別計画"/>
<display:column media="xml csv excel pdf" property="weekdayactual" title="平日受注"/>
<display:column media="xml csv excel pdf" property="exhibitionReports" title="展示会報告"/>
<display:column media="xml csv excel pdf" property="exhibitionReportUseds" title="中古車展示会報告"/>
<display:column media="xml csv excel pdf" property="base" title="拠点"/>
<display:column media="xml csv excel pdf" property="exhibitionIntraUsers" title="個人別展示会報告"/>

                    </display:table>


