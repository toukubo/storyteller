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

<span class="title">見積一覧</span>
                    <display:table name="${estimations}" id="row" requestURI="Estimations.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <nobr>
                        <a href="Estimations.do?id=${row.id}">編集</a>
                        <a href="DeleteEstimation.do?id=${row.id}">削除</a>
                        <a href="ShowEstimation.do?id=${row.id}">詳細</a>
                        </nobr>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="ストーリー">
<nobr>
${row.j2eeStory.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="件名">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計金額">
<nobr>
${row.totalprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="トータルコスト">
<nobr>
${row.totalcost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="採用">
<nobr>
${row.adapted}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="センテンス数">
<nobr>
${row.totalsentencenum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="見積内訳">
<c:forEach items="${row.estimationChoises}" var="choise">
${choise.test.summery}
</c:forEach>
</display:column>

                    </display:table>
<a href="Estimations.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Estimations.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Estimations.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Estimations.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	見積編集
</span>
<span id="subform">

		<form method="POST" action="PostEstimationVP.do">
          <html:hidden name="form" property="id"/>
          
          件名<br />
          <html:text property="title" name="form"></html:text>
          <br />

トータルコスト<br />
<html:text name="form" property="totalcost" /><br />

                                ストーリー<br />
                                <c:choose>
                                    <c:when test="${empty J2eeStorys}">
                                         <select name="j2eeStory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="j2eeStory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${J2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.j2eeStory.id}">
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


合計金額<br />
<html:text name="form" property="totalprice" /><br />

採用<br />
<html:text name="form" property="adapted" /><br />

totalsentencenum<br />
<html:text name="form" property="totalsentencenum" /><br />

センテンス単価<br />
<html:text name="form" property="sentenceunit" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Estimations.do">新規見積作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

