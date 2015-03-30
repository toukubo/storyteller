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
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="ショップ">
<nobr>
${row.shop.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アカウント">
<nobr>
${row.account}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="姓">
<nobr>
${row.familyname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名">
<nobr>
${row.firstname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="社員番号">
<nobr>
${row.employeecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="グループ名">
<nobr>
${row.groupname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="resultAndProductivities">
<nobr>
${row.resultAndProductivities}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="weeklyProccessPlans">
<nobr>
${row.weeklyProccessPlans}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="exhibitionIntraUser">
<nobr>
${row.exhibitionIntraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="base">
<nobr>
${row.base.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メールアドレス">
<nobr>
${row.mailaddr}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="退社">
<nobr>
${row.left}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール報告対象">
<nobr>
${row.receivemail}
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

                                ショップ<br />
                                <c:choose>
                                    <c:when test="${empty Shops}">
                                         <select name="shop" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="shop" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Shops}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.shop.id}">
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

姓<br />
<html:text name="form" property="familyname" /><br />

名<br />
<html:text name="form" property="firstname" /><br />

社員番号<br />
<html:text name="form" property="employeecode" /><br />

グループ名<br />
<html:text name="form" property="groupname" /><br />

                                exhibitionIntraUser<br />
                                <c:choose>
                                    <c:when test="${empty ExhibitionIntraUsers}">
                                         <select name="exhibitionIntraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="exhibitionIntraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ExhibitionIntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.exhibitionIntraUser.id}">
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


                                base<br />
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


メールアドレス<br />
<html:text name="form" property="mailaddr" /><br />

退社<br />
<html:checkbox name="form" property="left" /><br />

メール報告対象<br />
<html:checkbox name="form" property="receivemail" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="IntraUsers.do">新規内部ユーザー作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

