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
	<tiles:put name="title" value="製品一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">製品一覧</span>
                    <display:table name="${products}" id="row" requestURI="Products.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Products.do?id=${row.id}">編集</a>
                        <a href="DeleteProduct.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コード">
<nobr>
${row.code}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="消費税">
<nobr>
${row.tax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="付属品">
<nobr>
${row.attachment}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="商品選択">
<nobr>
${row.choises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="税込み">
<nobr>
${row.pricewithtax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="公開">
<nobr>
${row.pub}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="その他">
<nobr>
${row.misc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="素材">
<nobr>
${row.material}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="descriptiontitle">
<nobr>
${row.descriptiontitle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="在庫数">
<nobr>
${row.stocknum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="合計在庫数">
<nobr>
${row.totalfixedprice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="重さ">
<nobr>
${row.weight}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="注意書き">
<nobr>
${row.attention}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="htmlforoption">
<nobr>
${row.htmlforoption}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ブランド">
<nobr>
${row.brand.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サイズ">
<nobr>
${row.size}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="色">
<nobr>
${row.color}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>

                    </display:table>
<a href="Products.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Products.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Products.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Products.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	製品編集
</span>
<span id="subform">

		<form method="POST" action="PostProductVP.do">
          <html:hidden name="form" property="id"/>

コード<br />
<html:text name="form" property="code" /><br />

消費税<br />
<html:text name="form" property="tax" /><br />

付属品<br />
<html:text name="form" property="attachment" /><br />

税込み<br />
<html:text name="form" property="pricewithtax" /><br />

金額<br />
<html:text name="form" property="price" /><br />

公開<br />
<html:checkbox name="form" property="pub" /><br />

その他<br />
<html:text name="form" property="misc" /><br />

素材<br />
<html:text name="form" property="material" /><br />

descriptiontitle<br />
<html:text name="form" property="descriptiontitle" /><br />

在庫数<br />
<html:text name="form" property="stocknum" /><br />

合計在庫数<br />
<html:text name="form" property="totalfixedprice" /><br />

重さ<br />
<html:text name="form" property="weight" /><br />

注意書き<br />
<html:text name="form" property="attention" /><br />

htmlforoption<br />
<html:text name="form" property="htmlforoption" /><br />

                                ブランド<br />
                                <c:choose>
                                    <c:when test="${empty Brands}">
                                         <select name="brand" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="brand" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Brands}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.brand.id}">
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

サイズ<br />
<html:text name="form" property="size" /><br />

色<br />
<html:text name="form" property="color" /><br />

説明<br />
<html:text name="form" property="description" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="Products.do">新規製品作成</a>
</div>




	</tiles:put>
</tiles:insert>
