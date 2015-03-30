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

<span class="title">休日一覧</span>
                    <display:table name="${hollidays}" id="row" requestURI="Hollidays.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Hollidays.do?id=${row.id}">編集</a>
                        <a href="DeleteHolliday.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="gas">
<nobr>
${row.gas}
</nobr>
</display:column>

                    </display:table>
<a href="Hollidays.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Hollidays.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Hollidays.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Hollidays.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	休日編集
</span>
<span id="subform">

		<form method="POST" action="PostHollidayVP.do">
          <html:hidden name="form" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
gas<br />
<html:checkbox name="form" property="gas" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Hollidays.do">新規休日作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

