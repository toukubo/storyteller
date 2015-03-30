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

<span class="title">一覧</span>
                    <display:table name="${shops}" id="row" requestURI="Shops.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Shops.do?id=${row.id}">編集</a>
                        <a href="DeleteShop.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

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
 <display:column media="html" sortable="true" title="prefecture">
<nobr>
${row.prefecture.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="block">
<nobr>
${row.block.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="intraUsers">
<nobr>
${row.intraUsers}
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

                    </display:table>
<a href="Shops.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Shops.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Shops.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Shops.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostShopVP.do">
          <html:hidden name="form" property="id"/>

パスワード<br />
<html:text name="form" property="password" /><br />

アカウント<br />
<html:text name="form" property="account" /><br />

姓<br />
<html:text name="form" property="familyname" /><br />

名<br />
<html:text name="form" property="firstname" /><br />

                                prefecture<br />
                                <c:choose>
                                    <c:when test="${empty Prefectures}">
                                         <select name="prefecture" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="prefecture" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Prefectures}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.prefecture.id}">
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


                                block<br />
                                <c:choose>
                                    <c:when test="${empty Blocks}">
                                         <select name="block" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="block" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Blocks}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.block.id}">
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




          <html:submit value="save" />
		</form>
</span>
                        <a href="Shops.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

