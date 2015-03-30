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

コード<br />
<html:text name="form" property="code" /><br />

電話番号<br />
<html:text name="form" property="phonenum" /><br />

性別<br />
<html:text name="form" property="sex" /><br />

姓<br />
<html:text name="form" property="familyname" /><br />

                                権限<br />
                                <c:choose>
                                    <c:when test="${empty Privileges}">
                                         <select name="privilege" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="privilege" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Privileges}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.privilege.id}">
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

フラグ<br />
<html:text name="form" property="flag" /><br />

アドレス<br />
<html:text name="form" property="address" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

icalのurl<br />
<html:text name="form" property="icalurl" /><br />

urlを使う<br />
<html:checkbox name="form" property="icalurlusing" /><br />

c2talk account<br />
<html:text name="form" property="c2talkaccount" /><br />

アカウント<br />
<html:text name="form" property="account" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

時間単価<br />
<html:text name="form" property="costperhour" /><br />

ROI<br />
<html:text name="form" property="roi" /><br />

netincome<br />
<html:text name="form" property="netincome" /><br />

c2talk パスワード<br />
<html:text name="form" property="c2talkpassword" /><br />

costperhourformidngith<br />
<html:text name="form" property="costperhourformidngith" /><br />

costperhourforholliday<br />
<html:text name="form" property="costperhourforholliday" /><br />

costperhourforovertime<br />
<html:text name="form" property="costperhourforovertime" /><br />

monthlybasesalary<br />
<html:text name="form" property="monthlybasesalary" /><br />

fixedsalary<br />
<html:checkbox name="form" property="fixedsalary" /><br />

currenttransitbase<br />
<html:text name="form" property="currenttransitbase" /><br />

workhours<br />
<html:text name="form" property="workhours" /><br />

starthour<br />
<html:text name="form" property="starthour" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


