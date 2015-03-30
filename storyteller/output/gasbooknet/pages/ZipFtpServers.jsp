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

<form action="SetSelectionOfZipFtpServer##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20件</a>
<a href="${from}.do?pagesize=50">50件</a>
<a href="${from}.do?pagesize=100">100件</a>
<a href="${from}.do?pagesize=200">200件</a>
<a href="${from}.do?pagesize=300">300件</a>
<a href="${from}.do?pagesize=500">500件</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">zipFtpServers</span>
                    <display:table name="${zipFtpServers}" id="row" requestURI="ZipFtpServers.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ZipFtpServerDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteZipFtpServer.do?id=${row.id}">del</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="hostname">
<nobr>
${row.hostname}
</nobr>
</display:column>

                    </display:table>


                        <a href="ZipFtpServerDetail.do">new ZipFtpServer</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/ZipFtpServerVP">
          <html:hidden name="zipFtpServer" property="id"/>

hostname<br />
<html:text size="40"  name="form" property="hostname" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

