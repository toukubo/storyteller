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
                    <display:table name="${intraUsers}" id="row" requestURI="IntraUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="IntraUsers.do?id=${row.id}">編集</a>
                        <a href="DeleteIntraUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="password">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="costperhour">
<nobr>
${row.costperhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="costperhourforovertime">
<nobr>
${row.costperhourforovertime}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="costperhourforholliday">
<nobr>
${row.costperhourforholliday}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="costperhourformidngith">
<nobr>
${row.costperhourformidngith}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="phonenum">
<nobr>
${row.phonenum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="code">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="sex">
<nobr>
${row.sex}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="familyname">
<nobr>
${row.familyname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="roi">
<nobr>
${row.roi}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="netincome">
<nobr>
${row.netincome}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="mail">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="account">
<nobr>
${row.account}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="icalurl">
<nobr>
${row.icalurl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="icalurlusing">
<nobr>
${row.icalurlusing}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="c2talkaccount">
<nobr>
${row.c2talkaccount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="c2talkpassword">
<nobr>
${row.c2talkpassword}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="monthlybasesalary">
<nobr>
${row.monthlybasesalary}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="fixedsalary">
<nobr>
${row.fixedsalary}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="currenttransitbase">
<nobr>
${row.currenttransitbase}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workhours">
<nobr>
${row.workhours}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="starthour">
<nobr>
${row.starthour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="privilege">
<nobr>
${row.privilege.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="name">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="flag">
<nobr>
${row.flag}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="address">
<nobr>
${row.address}
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
	編集
</span>
<span id="subform">

		<form method="POST" action="PostIntraUserVP.do">
          <html:hidden name="form" property="id"/>

password<br />
<html:text name="form" property="password" /><br />

costperhour<br />
<html:text name="form" property="costperhour" /><br />

costperhourforovertime<br />
<html:text name="form" property="costperhourforovertime" /><br />

costperhourforholliday<br />
<html:text name="form" property="costperhourforholliday" /><br />

costperhourformidngith<br />
<html:text name="form" property="costperhourformidngith" /><br />

phonenum<br />
<html:text name="form" property="phonenum" /><br />

code<br />
<html:text name="form" property="code" /><br />

sex<br />
<html:text name="form" property="sex" /><br />

familyname<br />
<html:text name="form" property="familyname" /><br />

roi<br />
<html:text name="form" property="roi" /><br />

netincome<br />
<html:text name="form" property="netincome" /><br />

mail<br />
<html:text name="form" property="mail" /><br />

account<br />
<html:text name="form" property="account" /><br />

icalurl<br />
<html:text name="form" property="icalurl" /><br />

icalurlusing<br />
<html:checkbox name="form" property="icalurlusing" /><br />

c2talkaccount<br />
<html:text name="form" property="c2talkaccount" /><br />

c2talkpassword<br />
<html:text name="form" property="c2talkpassword" /><br />

monthlybasesalary<br />
<html:text name="form" property="monthlybasesalary" /><br />

fixedsalary<br />
<html:checkbox name="form" property="fixedsalary" /><br />

currenttransitbase<br />
<html:text name="form" property="currenttransitbase" /><br />

workhours<br />
<html:text name="form" property="workhours" /><br />

starthour<br />
<html:text name="form" property="starthour" /><br />

                                privilege<br />
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


name<br />
<html:text name="form" property="name" /><br />

flag<br />
<html:text name="form" property="flag" /><br />

address<br />
<html:text name="form" property="address" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="IntraUsers.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
