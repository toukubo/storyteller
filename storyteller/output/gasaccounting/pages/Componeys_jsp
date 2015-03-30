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

<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<span class="title">企業一覧</span>
                    <display:table name="${componeys}" id="row" requestURI="Componeys.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Componeys.do?id=${row.id}">編集</a>
                        <a href="DeleteComponey.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="zip3">
<nobr>
${row.zipthree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="zip4">
<nobr>
${row.zipfour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="代表者名">
<nobr>
${row.presidentname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話">
<nobr>
${row.phonenum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="fax">
<nobr>
${row.fax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>

                    </display:table>
<a href="Componeys.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Componeys.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Componeys.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Componeys.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	企業編集
</span>
<span id="subform">

		<form method="POST" action="PostComponeyVP.do">
          <html:hidden name="form" property="id"/>

zip3<br />
<html:text name="form" property="zipthree" /><br />

zip4<br />
<html:text name="form" property="zipfour" /><br />

代表者名<br />
<html:text name="form" property="presidentname" /><br />

電話<br />
<html:text name="form" property="phonenum" /><br />

fax<br />
<html:text name="form" property="fax" /><br />

名前<br />
<html:text name="form" property="name" /><br />

アドレス<br />
<html:text name="form" property="address" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Componeys.do">新規企業作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

