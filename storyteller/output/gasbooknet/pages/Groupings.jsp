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
	<tiles:put name="title" value="Grouping一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">Grouping一覧</span>
                    <display:table name="${groupings}" id="row" requestURI="Groupings.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Groupings.do?id=${row.id}">編集</a>
                        <a href="DeleteGrouping.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>

                    </display:table>
<a href="Groupings.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Groupings.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Groupings.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Groupings.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	Grouping編集
</span>
<span id="subform">

		<form method="POST" action="PostGroupingVP.do">
          <html:hidden name="form" property="id"/>



          <html:submit value="save" />
		</form>
</span>
                        <a href="Groupings.do">新規Grouping作成</a>
</div>




	</tiles:put>
</tiles:insert>
