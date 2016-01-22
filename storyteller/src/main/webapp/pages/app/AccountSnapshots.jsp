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
	<tiles:put name="title" value="一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">一覧</span>
                    <display:table name="${accountSnapshots}" id="row" requestURI="AccountSnapshots.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="AccountSnapshots.do?id=${row.id}">編集</a>
                        <a href="DeleteAccountSnapshot.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="totalcost">
<nobr>
${row.totalcost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="capacityprice">
<nobr>
${row.capacityprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="capacityleftprice">
<nobr>
${row.capacityleftprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="date"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>

                    </display:table>
<a href="AccountSnapshots.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="AccountSnapshots.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="AccountSnapshots.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="AccountSnapshots.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostAccountSnapshotVP.do">
          <html:hidden name="form" property="id"/>

totalcost<br />
<html:text name="form" property="totalcost" /><br />

capacityprice<br />
<html:text name="form" property="capacityprice" /><br />

capacityleftprice<br />
<html:text name="form" property="capacityleftprice" /><br />

date<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="AccountSnapshots.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>