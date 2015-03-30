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
	<tiles:put name="title" value="製品" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostProductVP">
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



          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
