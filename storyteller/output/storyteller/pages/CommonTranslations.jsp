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

<form action="SetSelectionOfCommonTranslation##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20件</a>
<a href="${from}.do?pagesize=50">50件</a>
<a href="${from}.do?pagesize=100">100件</a>
<a href="${from}.do?pagesize=200">200件</a>
<a href="${from}.do?pagesize=300">300件</a>
<a href="${from}.do?pagesize=500">500件</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">commonTranslations</span>
                    <display:table name="${commonTranslations}" id="row" requestURI="CommonTranslations.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="CommonTranslationDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteCommonTranslation.do?id=${row.id}">del</a>
                        </display:column>
 <display:column media="html" sortable="true" title="日本語">
<nobr>
${row.japanese}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>

                    </display:table>


                        <a href="CommonTranslationDetail.do">new CommonTranslation</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/CommonTranslationVP">
          <html:hidden name="commonTranslation" property="id"/>

日本語<br />
<html:text size="40"  name="form" property="japanese" /><br />

名前<br />
<html:text size="40"  name="form" property="name" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

