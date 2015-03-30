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
	<tiles:put name="title" value="一般設定一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">一般設定一覧</span>
                    <display:table name="${staticDatas}" id="row" requestURI="StaticDatas.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="StaticDatas.do?id=${row.id}">編集</a>
                        <a href="DeleteStaticData.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="期基準値">
<nobr>
${row.termbasisnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="期基準年">
<nobr>
${row.termbasisyear}
</nobr>
</display:column>

                    </display:table>
<a href="StaticDatas.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="StaticDatas.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="StaticDatas.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="StaticDatas.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	一般設定編集
</span>
<span id="subform">

		<form method="POST" action="PostStaticDataVP.do">
          <html:hidden name="form" property="id"/>

期基準値<br />
<html:text name="form" property="termbasisnum" /><br />

期基準年<br />
<html:text name="form" property="termbasisyear" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="StaticDatas.do">新規一般設定作成</a>
</div>




	</tiles:put>
</tiles:insert>
