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
	<tiles:put name="title" value="購入" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPurchaseVP">
          <html:hidden name="form" property="id"/>

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


合計<br />
<html:text size="40"  name="form" property="total" /><br />

合計注文数<br />
<html:text size="40"  name="form" property="totalordernum" /><br />

発送済み<br />
<html:checkbox name="form" property="shipped" /><br />

時間<br />
<html:text size="40"  name="form" property="hour" /><br />

請求済み<br />
<html:checkbox name="form" property="invoiced" /><br />

支払済<br />
<html:checkbox name="form" property="paid" /><br />

月<br />
<html:text size="40"  name="form" property="month" /><br />

年<br />
<html:text size="40"  name="form" property="year" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
