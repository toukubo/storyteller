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
                    <display:table name="${exhibitionIntraUsers}" id="row" requestURI="ExhibitionIntraUsers.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="dm" title="DM発信数"/>
<display:column media="xml csv excel pdf" property="tc" title="TC数"/>
<display:column media="xml csv excel pdf" property="visitaffirmation" title="来店確約"/>
<display:column media="xml csv excel pdf" property="customerabaffirmationvisit" title="来店接客数AB確約来店"/>
<display:column media="xml csv excel pdf" property="customerabnonaffirmationvisit" title="来店接客数AB確約外来店"/>
<display:column media="xml csv excel pdf" property="customernonabaffirmationvisit" title="来店接客数NONAB確約来店"/>
<display:column media="xml csv excel pdf" property="customernonabnonaffirmationvisit" title="来店接客数NONAB確約外来店"/>
<display:column media="xml csv excel pdf" property="customernonabfreevisit" title="来店接客数フリー来店"/>
<display:column media="xml csv excel pdf" property="demo" title="デモ"/>
<display:column media="xml csv excel pdf" property="engenderabhotcustomer" title="ABホット発生顧客"/>
<display:column media="xml csv excel pdf" property="engenderabhotstock" title="ABホット発生ストック"/>
<display:column media="xml csv excel pdf" property="engenderabhotfree" title="ABホット発生フリー"/>
<display:column media="xml csv excel pdf" property="orderedcarsabcustomer" title="受注台数AB顧客"/>
<display:column media="xml csv excel pdf" property="orderedcarsabnewother" title="受注台数新他"/>
<display:column media="xml csv excel pdf" property="orderedcarsnonabcustomer" title="受注台数NONAB顧客"/>
<display:column media="xml csv excel pdf" property="orderedcarsnonabstock" title="受注台数ストック"/>
<display:column media="xml csv excel pdf" property="orderedcarsnonabfree" title="受注台数フリー"/>
<display:column media="xml csv excel pdf" property="exhibition" title="展示会"/>

                    </display:table>


