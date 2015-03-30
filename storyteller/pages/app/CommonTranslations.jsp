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

<tiles:insert definition=".layout">
	<tiles:put name="title" value="Storys" direct="true" />
	<tiles:put name="content" direct="true">

<span class="title">commontranslations</span>
                    <display:table name="${commontranslations}" id="row" requestURI="CommonTranslations.do"
                            requestURIcontext="false"
                            export="false" pagesize="0" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="CommonTranslations.do?id=${row.id}">ed</a>
                        <a href="DeleteCommonTranslation.do?id=${row.id}">del</a>
                        </display:column>
 <display:column media="html" sortable="true" title="���O">
<nobr>${row.name}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="id">
<nobr>${row.id}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>${row.japanese}</nobr>
</display:column>

                    </display:table>
<a href="CommonTranslations.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="CommonTranslations.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="CommonTranslations.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="CommonTranslations.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
                        <a href="CommonTranslations.do">new CommonTranslation</a>

		<form method="POST" action="PostCommonTranslationVP.do">
          <html:hidden name="form" property="id"/>

name<br />
<html:text name="form" property="name" /><br />

japanese<br />
<html:text name="form" property="japanese" /><br />



          <html:submit value="save" />
		</form>


	</tiles:put>
</tiles:insert>
