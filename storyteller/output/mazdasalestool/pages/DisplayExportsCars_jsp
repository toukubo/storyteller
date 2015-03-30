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
                    <display:table name="${cars}" id="row" requestURI="Cars.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="groupname" title="グループ名"/>
<display:column media="xml csv excel pdf" property="salescost" title="販売費"/>
<display:column media="xml csv excel pdf" property="lightcar" title="軽自動車"/>
<display:column media="xml csv excel pdf" property="sortorder" title="ソート順"/>
<display:column media="xml csv excel pdf" property="exhibitionReportCars" title="車種別展示会報告"/>
<display:column media="xml csv excel pdf" property="shortcarline" title="短縮車種"/>
<display:column media="xml csv excel pdf" property="bussinesscar" title="商用車"/>
<display:column media="xml csv excel pdf" property="profitReportOfNewCars" title="profitReportOfNewCars"/>
<display:column media="xml csv excel pdf" property="groupOfCarLine" title="groupOfCarLine"/>

                    </display:table>


