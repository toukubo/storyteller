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
                    <display:table name="${attendances}" id="row" requestURI="Attendances.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="starthour" title="出社時間"/>
<display:column media="xml csv excel pdf" property="startminuite" title="出社分"/>
<display:column media="xml csv excel pdf" property="endhour" title="退社時間"/>
<display:column media="xml csv excel pdf" property="endminute" title="退社分"/>
<display:column media="xml csv excel pdf" property="intervalhours" title="休憩時間"/>
<display:column media="xml csv excel pdf" property="totalworkhour" title="総勤務時間"/>
<display:column media="xml csv excel pdf" property="late" title="遅刻"/>
<display:column media="xml csv excel pdf" property="leaveearly" title="早退"/>
<display:column media="xml csv excel pdf" property="awl" title="有給休暇"/>
<display:column media="xml csv excel pdf" property="date" title="日付"/>

                    </display:table>


