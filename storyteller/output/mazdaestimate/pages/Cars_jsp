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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 
<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>

<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<span class="title">車種一覧</span>
                    <display:table name="${cars}" id="row" requestURI="Cars.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Cars.do?id=${row.id}">編集</a>
                        <a href="DeleteCar.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="種類">
<nobr>
${row.type}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="salesprice">
<nobr>
${row.salesprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="グループ名">
<nobr>
${row.groupname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車種">
<nobr>
${row.carline}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="販売費">
<nobr>
${row.salescost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="軽自動車">
<nobr>
${row.lightcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="商用車">
<nobr>
${row.businesscar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ソート順">
<nobr>
${row.sortorder}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="exhibitionReportCars">
<nobr>
${row.exhibitionReportCars}
</nobr>
</display:column>

                    </display:table>
<a href="Cars.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Cars.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Cars.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Cars.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	車種編集
</span>
<span id="subform">

		<form method="POST" action="PostCarVP.do">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

種類<br />
<html:text name="form" property="type" /><br />

salesprice<br />
<html:text name="form" property="salesprice" /><br />

グループ名<br />
<html:text name="form" property="groupname" /><br />

車種<br />
<html:text name="form" property="carline" /><br />

販売費<br />
<html:text name="form" property="salescost" /><br />

軽自動車<br />
<html:checkbox name="form" property="lightcar" /><br />

商用車<br />
<html:checkbox name="form" property="businesscar" /><br />

ソート順<br />
<html:text name="form" property="sortorder" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Cars.do">新規車種作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

