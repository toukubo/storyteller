<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="製品" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostProductVP">
          <html:hidden name="form" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" />" size="20" />
<br />
サイズ<br />
<html:text size="40"  name="form" property="size" /><br />

商品No<br />
<html:text size="40"  name="form" property="no" /><br />

名前<br />
<html:text size="40"  name="form" property="name" /><br />

                                カテゴリー<br />
                                <c:choose>
                                    <c:when test="${empty Categorys}">
                                         <select name="category" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="category" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Categorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.category.id}">
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


税込み<br />
<html:text size="40"  name="form" property="pricewithtax" /><br />

キャッチコピー<br />
<html:text size="40"  name="form" property="catchcopy" /><br />

素材<br />
<html:text size="40"  name="form" property="material" /><br />

説明<br />
<html:text size="40"  name="form" property="description" /><br />

在庫数<br />
<html:text size="40"  name="form" property="stocknum" /><br />

公開<br />
<html:checkbox name="form" property="pub" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
