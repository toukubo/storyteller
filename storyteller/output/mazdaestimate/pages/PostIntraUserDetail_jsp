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
<span id="title">
	内部ユーザー編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostIntraUserVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

                                ショップ<br />
                                <c:choose>
                                    <c:when test="${empty Shops}">
                                         <select name="shop" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="shop" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Shops}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.shop.id}">
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


アカウント<br />
<html:text name="form" property="account" /><br />

姓<br />
<html:text name="form" property="familyname" /><br />

名<br />
<html:text name="form" property="firstname" /><br />

社員番号<br />
<html:text name="form" property="employeecode" /><br />

グループ名<br />
<html:text name="form" property="groupname" /><br />

                                exhibitionIntraUser<br />
                                <c:choose>
                                    <c:when test="${empty ExhibitionIntraUsers}">
                                         <select name="exhibitionIntraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="exhibitionIntraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ExhibitionIntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.exhibitionIntraUser.id}">
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


                                base<br />
                                <c:choose>
                                    <c:when test="${empty Bases}">
                                         <select name="base" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="base" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Bases}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.base.id}">
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


メールアドレス<br />
<html:text name="form" property="mailaddr" /><br />

退社<br />
<html:checkbox name="form" property="left" /><br />

メール報告対象<br />
<html:checkbox name="form" property="receivemail" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


