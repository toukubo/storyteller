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

<form action="SetSelectionOfIntraUser##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20件</a>
<a href="${from}.do?pagesize=50">50件</a>
<a href="${from}.do?pagesize=100">100件</a>
<a href="${from}.do?pagesize=200">200件</a>
<a href="${from}.do?pagesize=300">300件</a>
<a href="${from}.do?pagesize=500">500件</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">intraUsers</span>
                    <display:table name="${intraUsers}" id="row" requestURI="IntraUsers.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="IntraUserDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteIntraUser.do?id=${row.id}">del</a>
                        </display:column>
 <display:column media="html" sortable="true" title="c2talkaccount">
<nobr>
${row.c2talkaccount}
</nobr>
</display:column>

                    </display:table>


                        <a href="IntraUserDetail.do">new IntraUser</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/IntraUserVP">
          <html:hidden name="intraUser" property="id"/>

c2talkaccount<br />
<html:text size="40"  name="form" property="c2talkaccount" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

