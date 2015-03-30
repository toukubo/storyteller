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

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<span class="title">一覧</span>
                    <display:table name="${cDs}" id="row" requestURI="CDs.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="CDs.do?id=${row.id}">編集</a>
                        <a href="DeleteCD.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="年">
<nobr>
${row.year}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気度">
<nobr>
${row.poplularity}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="projectname">
<nobr>
${row.projectname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="copywrite">
<nobr>
${row.copywrite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="productionpurpose">
<nobr>
${row.productionpurpose}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="exposurehistory">
<nobr>
${row.exposurehistory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="credit">
<nobr>
${row.credit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="clientname">
<nobr>
${row.clientname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cilentrequest">
<nobr>
${row.cilentrequest}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="expiredate"><nobr>
<bean:write name="row" property="expiredate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="licensed">
<nobr>
${row.licensed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="particulars">
<nobr>
${row.particulars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コメント">
<nobr>
${row.comments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="licensingpossibleafterexpired">
<nobr>
${row.licensingpossibleafterexpired}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="tocdrelation">
<nobr>
${row.tocdrelation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="fromcdrelation">
<nobr>
${row.fromcdrelation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="songs">
<nobr>
${row.songs}
</nobr>
</display:column>

                    </display:table>
<a href="CDs.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="CDs.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="CDs.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="CDs.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostCDVP.do">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
年<br />
<html:text name="form" property="year" /><br />

説明<br />
<html:text name="form" property="description" /><br />

タイトル<br />
<html:text name="form" property="title" /><br />

                                内部ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
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


人気<br />
<html:checkbox name="form" property="poplular" /><br />

人気度<br />
<html:text name="form" property="poplularity" /><br />

                                アーティスト<br />
                                <c:choose>
                                    <c:when test="${empty Artists}">
                                         <select name="artist" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="artist" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Artists}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.artist.id}">
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


projectname<br />
<html:text name="form" property="projectname" /><br />

copywrite<br />
<html:text name="form" property="copywrite" /><br />

productionpurpose<br />
<html:text name="form" property="productionpurpose" /><br />

exposurehistory<br />
<html:text name="form" property="exposurehistory" /><br />

credit<br />
<html:text name="form" property="credit" /><br />

クライアント<br />
<html:checkbox name="form" property="client" /><br />

clientname<br />
<html:text name="form" property="clientname" /><br />

cilentrequest<br />
<html:text name="form" property="cilentrequest" /><br />

expiredate<br />
<input type="text" name="expiredateAsString" value="<bean:write name="form" property="expiredate" format="yyyy/MM/dd" />" /><br />
licensed<br />
<html:checkbox name="form" property="licensed" /><br />

particulars<br />
<html:text name="form" property="particulars" /><br />

コメント<br />
<html:text name="form" property="comments" /><br />

licensingpossibleafterexpired<br />
<html:checkbox name="form" property="licensingpossibleafterexpired" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="CDs.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

