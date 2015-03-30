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
	<tiles:put name="title" value="管理者" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostAdminVP">
          <html:hidden name="form" property="id"/>

1ページあたりの最大表示行数<br />
<html:text name="form" property="pagesize" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

パスワード変更済<br />
<html:checkbox name="form" property="passwordchanged" /><br />

名前<br />
<html:text name="form" property="name" /><br />

                                権限<br />
                                <c:choose>
                                    <c:when test="${empty Priviledges}">
                                         <select name="priviledge" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="priviledge" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Priviledges}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.priviledge.id}">
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


新しいパスワード（確認）<br />
<html:text name="form" property="newpasswordconfirmation" /><br />

新しいパスワード<br />
<html:text name="form" property="newpassword" /><br />

状況<br />
<html:text name="form" property="accountstatus" /><br />

小数点以下表示桁数<br />
<html:text name="form" property="decimallevel" /><br />

サマリーを表示する<br />
<html:checkbox name="form" property="displayssummery" /><br />

removed<br />
<html:checkbox name="form" property="removed" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
