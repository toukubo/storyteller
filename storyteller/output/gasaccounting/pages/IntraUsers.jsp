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

<span class="title">内部ユーザー一覧</span>
                    <display:table name="${intrausers}" id="row" requestURI="IntraUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="IntraUsers.do?id=${row.id}">編集</a>
                        <a href="DeleteIntraUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.phonenum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.sex}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="姓">
<nobr>
${row.familyname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="権限">
<nobr>
${row.privilege.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="フラグ">
<nobr>
${row.flag}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="icalのurl">
<nobr>
${row.icalurl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="urlを使う">
<nobr>
${row.icalurlusing}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="icalFile">
<nobr>
${row.icalFile}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アカウント">
<nobr>
${row.account}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タスク">
<nobr>
${row.tasks}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間単価">
<nobr>
${row.costperhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ROI">
<nobr>
${row.roi}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="netincome">
<nobr>
${row.netincome}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.attendances}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.icalFiles}
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

コード<br />
<html:text name="form" property="code" /><br />

電話番号<br />
<html:text name="form" property="phonenum" /><br />

性別<br />
<html:text name="form" property="sex" /><br />

姓<br />
<html:text name="form" property="familyname" /><br />

                                権限<br />
                                <c:choose>
                                    <c:when test="${empty Privileges}">
                                         <select name="privilege" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="privilege" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Privileges}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.privilege.id}">
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


名前<br />
<html:text name="form" property="name" /><br />

フラグ<br />
<html:text name="form" property="flag" /><br />

アドレス<br />
<html:text name="form" property="address" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

icalのurl<br />
<html:text name="form" property="icalurl" /><br />

urlを使う<br />
<html:text name="form" property="icalurlusing" /><br />

                                icalFile<br />
                                <c:choose>
                                    <c:when test="${empty IcalFiles}">
                                         <select name="icalFile" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="icalFile" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IcalFiles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.icalFile.id}">
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


アカウント<br />
<html:text name="form" property="account" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

時間単価<br />
<html:text name="form" property="costperhour" /><br />

ROI<br />
<html:text name="form" property="roi" /><br />

netincome<br />
<html:text name="form" property="netincome" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="IntraUsers.do">新規内部ユーザー作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

