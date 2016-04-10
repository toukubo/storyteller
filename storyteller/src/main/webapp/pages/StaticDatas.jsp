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

<form action="SetSelectionOfStaticData##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">staticdatas</span>
                    <display:table name="${staticdatas}" id="row" requestURI="StaticDatas.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="StaticDataDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteStaticData.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="documentArrivedReportTemplate" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.documentArrivedReportTemplate}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="documentRequestTemplate" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.documentRequestTemplate}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="inforssurl" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.inforssurl}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="reportmail" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.reportmail}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="crtmax" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.crtmax}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="arpmax" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.arpmax}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="eclipseroot" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.eclipseroot}</nobr>
</display:column>

                    </display:table>


                        <a href="StaticDataDetail.do">new StaticData</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/StaticDataVP">
          <html:hidden name="staticdata" property="id"/>

documentArrivedReportTemplate<br />
<html:text name="staticdata" property="documentArrivedReportTemplate" /><br />

documentRequestTemplate<br />
<html:text name="staticdata" property="documentRequestTemplate" /><br />

inforssurl<br />
<html:text name="staticdata" property="inforssurl" /><br />

reportmail<br />
<html:text name="staticdata" property="reportmail" /><br />

crtmax<br />
<html:text name="staticdata" property="crtmax" /><br />

arpmax<br />
<html:text name="staticdata" property="arpmax" /><br />

eclipseroot<br />
<html:text name="staticdata" property="eclipseroot" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

