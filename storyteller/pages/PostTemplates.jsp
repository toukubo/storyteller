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

<form action="SetSelectionOfPostTemplate##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20��</a>
<a href="${from}.do?pagesize=50">50��</a>
<a href="${from}.do?pagesize=100">100��</a>
<a href="${from}.do?pagesize=200">200��</a>
<a href="${from}.do?pagesize=300">300��</a>
<a href="${from}.do?pagesize=500">500��</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">posttemplates</span>
                    <display:table name="${posttemplates}" id="row" requestURI="PostTemplates.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="PostTemplateDetail.do?id=${row.id}">ed</a>
                        <a href="DeletePostTemplate.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>

                    </display:table>


                        <a href="PostTemplateDetail.do">new PostTemplate</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/PostTemplateVP">
          <html:hidden name="posttemplate" property="id"/>



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

