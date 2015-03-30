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
                    <display:table name="${tasks}" id="row" requestURI="Tasks.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="job" title="ジョブ"/>
<display:column media="xml csv excel pdf" property="hour" title="時間"/>
<display:column media="xml csv excel pdf" property="taskCategory" title="タスクカテゴリー"/>
<display:column media="xml csv excel pdf" property="name" title="名前"/>
<display:column media="xml csv excel pdf" property="date" title="日付"/>
<display:column media="xml csv excel pdf" property="processed" title="処理済"/>
<display:column media="xml csv excel pdf" property="transits" title=""/>
<display:column media="xml csv excel pdf" property="icaluid" title="icaluid"/>

                    </display:table>


