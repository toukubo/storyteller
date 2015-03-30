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

<span class="title">注文一覧</span>
                    <display:table name="${orders}" id="row" requestURI="Orders.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Orders.do?id=${row.id}">編集</a>
                        <a href="DeleteOrder.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="合計">
<nobr>
${row.total}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="注文選択">
<nobr>
${row.choises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="送料">
<nobr>
${row.carriage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サブトータル">
<nobr>
${row.subtotal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計注文数">
<nobr>
${row.totalordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="発送済み">
<nobr>
${row.shipped}
</nobr>
</display:column>

                    </display:table>
<a href="Orders.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Orders.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Orders.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Orders.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	注文編集
</span>
<span id="subform">

		<form method="POST" action="PostOrderVP.do">
          <html:hidden name="form" property="id"/>

合計<br />
<html:text name="form" property="total" /><br />

                                一般ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty PublicUsers}">
                                         <select name="publicUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="publicUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${PublicUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.publicUser.id}">
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


送料<br />
<html:text name="form" property="carriage" /><br />

サブトータル<br />
<html:text name="form" property="subtotal" /><br />

合計注文数<br />
<html:text name="form" property="totalordernum" /><br />

発送済み<br />
<html:text name="form" property="shipped" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Orders.do">新規注文作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

