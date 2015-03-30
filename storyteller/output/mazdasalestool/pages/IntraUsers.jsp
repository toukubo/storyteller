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
	<tiles:put name="title" value="内部ユーザー一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">内部ユーザー一覧</span>
                    <display:table name="${intraUsers}" id="row" requestURI="IntraUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="IntraUsers.do?id=${row.id}">編集</a>
                        <a href="DeleteIntraUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="グループ名">
<nobr>
${row.groupname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="削除済み">
<nobr>
${row.removed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="営業成果と生産性">
<nobr>
${row.resultAndProductivities}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="週間プロセス計画">
<nobr>
${row.weeklyProccessPlans}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="拠点">
<nobr>
${row.base.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="社員番号">
<nobr>
${row.employeecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メールアドレス">
<nobr>
${row.mailaddr}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人別展示会報告">
<nobr>
${row.exhibitionIntraUsers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール報告対象">
<nobr>
${row.recivemail}
</nobr>
</display:column>

                    </display:table>
<a href="IntraUsers.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="IntraUsers.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="IntraUsers.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="IntraUsers.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	内部ユーザー編集
</span>
<span id="subform">

		<form method="POST" action="PostIntraUserVP.do">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

グループ名<br />
<html:text name="form" property="groupname" /><br />

削除済み<br />
<html:checkbox name="form" property="removed" /><br />

                                拠点<br />
                                <c:choose>
                                    <c:when test="${empty Bases}">
                                         <select name="base" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="base" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Bases}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.base.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


社員番号<br />
<html:text name="form" property="employeecode" /><br />

メールアドレス<br />
<html:text name="form" property="mailaddr" /><br />

メール報告対象<br />
<html:checkbox name="form" property="recivemail" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="IntraUsers.do">新規内部ユーザー作成</a>
</div>




	</tiles:put>
</tiles:insert>
