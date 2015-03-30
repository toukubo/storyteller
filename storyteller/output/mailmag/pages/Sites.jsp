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
	<tiles:put name="title" value="サイト一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">サイト一覧</span>
                    <display:table name="${sites}" id="row" requestURI="Sites.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Sites.do?id=${row.id}">編集</a>
                        <a href="DeleteSite.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ヘッダー">
<nobr>
${row.header}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="url">
<nobr>
${row.url}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="フッター">
<nobr>
${row.footer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="モバイルURL">
<nobr>
${row.mobileurl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="specialtemplateusing">
<nobr>
${row.specialtemplateusing}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="userexporturl">
<nobr>
${row.userexporturl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ハッシュ">
<nobr>
${row.hash}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="パブリックユーザー">
<nobr>
${row.publicUsers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メールマガジン">
<nobr>
${row.mailmags}
</nobr>
</display:column>

                    </display:table>
<a href="Sites.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Sites.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Sites.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Sites.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	サイト編集
</span>
<span id="subform">

		<form method="POST" action="PostSiteVP.do">
          <html:hidden name="form" property="id"/>

ヘッダー<br />
<html:text name="form" property="header" /><br />

url<br />
<html:text name="form" property="url" /><br />

フッター<br />
<html:text name="form" property="footer" /><br />

モバイルURL<br />
<html:text name="form" property="mobileurl" /><br />

specialtemplateusing<br />
<html:checkbox name="form" property="specialtemplateusing" /><br />

userexporturl<br />
<html:text name="form" property="userexporturl" /><br />

ハッシュ<br />
<html:text name="form" property="hash" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Sites.do">新規サイト作成</a>
</div>




	</tiles:put>
</tiles:insert>
