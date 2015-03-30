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
<span class="title">Folder 編集</span>
		<html:form method="POST" action="/FolderVP">
          <html:hidden name="folder" property="id"/>

語<br />
<html:text size="40"  name="form" property="word" /><br />

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


コンセプト<br />
<html:text size="40"  name="form" property="concept" /><br />

制作期間<br />
<input type="text" name="productionspanAsString" value="<st:date date="${form.productionspan}" size="20" />" /><br />
掛け率<br />
<html:text size="40"  name="form" property="rate" /><br />

fromdate<br />
<input type="text" name="fromdateAsString" value="<st:date date="${form.fromdate}" size="20" />" /><br />
todate<br />
<input type="text" name="todateAsString" value="<st:date date="${form.todate}" size="20" />" /><br />


          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


