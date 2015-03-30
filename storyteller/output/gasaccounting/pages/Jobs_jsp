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

<span class="title">ジョブ一覧</span>
                    <display:table name="${jobs}" id="row" requestURI="Jobs.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Jobs.do?id=${row.id}">編集</a>
                        <a href="DeleteJob.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="原価計">
<nobr>
${row.costsum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジョブカテゴリー">
<nobr>
${row.jobCategory.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アクティブ">
<nobr>
${row.active}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タスク">
<nobr>
${row.tasks}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="契約">
<nobr>
${row.contracts}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="actualsales">
<nobr>
${row.actualsales}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="actualsalesminuscost">
<nobr>
${row.actualsalesminuscost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="利益率">
<nobr>
${row.profitrate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="仕入">
<nobr>
${row.buyings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="請求">
<nobr>
${row.invoices}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="humanaletotalcost">
<nobr>
${row.humanaletotalcost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="totalcost">
<nobr>
${row.totalcost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジョブ統計">
<nobr>
${row.jobStats}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="jobPermissions">
<nobr>
${row.jobPermissions}
</nobr>
</display:column>

                    </display:table>
<a href="Jobs.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Jobs.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Jobs.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Jobs.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	ジョブ編集
</span>
<span id="subform">

		<form method="POST" action="PostJobVP.do">
          <html:hidden name="form" property="id"/>

原価計<br />
<html:text name="form" property="costsum" /><br />

                                ジョブカテゴリー<br />
                                <c:choose>
                                    <c:when test="${empty JobCategorys}">
                                         <select name="jobCategory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="jobCategory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${JobCategorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.jobCategory.id}">
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

タイトル<br />
<html:text name="form" property="title" /><br />

アクティブ<br />
<html:text name="form" property="active" /><br />

コード<br />
<html:text name="form" property="code" /><br />

actualsales<br />
<html:text name="form" property="actualsales" /><br />

actualsalesminuscost<br />
<html:text name="form" property="actualsalesminuscost" /><br />

利益率<br />
<html:text name="form" property="profitrate" /><br />

humanaletotalcost<br />
<html:text name="form" property="humanaletotalcost" /><br />

totalcost<br />
<html:text name="form" property="totalcost" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Jobs.do">新規ジョブ作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

