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
                    <display:table name="${mailmags}" id="row" requestURI="Mailmags.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="poplularity" title="人気度"/>
<display:column media="xml csv excel pdf" property="recentlyadded" title="最近の"/>
<display:column media="xml csv excel pdf" property="devidedlyderivered" title="分割配送の"/>
<display:column media="xml csv excel pdf" property="reservationdate" title="予約日時"/>
<display:column media="xml csv excel pdf" property="divisions" title="分割"/>
<display:column media="xml csv excel pdf" property="urls" title="urls"/>
<display:column media="xml csv excel pdf" property="site" title="サイト"/>
<display:column media="xml csv excel pdf" property="reserved" title="予約済みの"/>
<display:column media="xml csv excel pdf" property="title" title="タイトル"/>
<display:column media="xml csv excel pdf" property="description" title="説明"/>
<display:column media="xml csv excel pdf" property="date" title="日付"/>

                    </display:table>


