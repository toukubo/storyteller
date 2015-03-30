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
<span class="title">IntraUser 編集</span>
		<html:form method="POST" action="/IntraUserVP">
          <html:hidden name="intraUser" property="id"/>

パスワード<br />
<html:text size="40"  name="form" property="password" /><br />

メール<br />
<html:text size="40"  name="form" property="mail" /><br />

削除済み<br />
<html:checkbox name="form" property="removed" /><br />

更新日<br />
<input type="text" name="updatedateAsString" value="<st:date date="${form.updatedate}" />" size="20" />
<br />
市区町村<br />
<html:text size="40"  name="form" property="city" /><br />

都道府県<br />
<html:text size="40"  name="form" property="prefecture" /><br />

名<br />
<html:text size="40"  name="form" property="firstname" /><br />

郵便番号<br />
<html:text size="40"  name="form" property="zipcode" /><br />

名かな<br />
<html:text size="40"  name="form" property="firstnamekana" /><br />

姓<br />
<html:text size="40"  name="form" property="familyname" /><br />

姓かな<br />
<html:text size="40"  name="form" property="familynamekana" /><br />

ニックネーム<br />
<html:text size="40"  name="form" property="nickname" /><br />

所属<br />
<html:text size="40"  name="form" property="affiliation" /><br />

端末ID<br />
<html:text size="40"  name="form" property="utn" /><br />

携帯番号<br />
<html:text size="40"  name="form" property="mobileno" /><br />

携帯アドレス<br />
<html:text size="40"  name="form" property="mobilemail" /><br />

電話番号<br />
<html:text size="40"  name="form" property="telno" /><br />

建物名<br />
<html:text size="40"  name="form" property="building" /><br />

作成日<br />
<input type="text" name="createdateAsString" value="<st:date date="${form.createdate}" />" size="20" />
<br />
アドレス<br />
<html:text size="40"  name="form" property="address" /><br />

                                紹介者<br />
                                <c:choose>
                                    <c:when test="${empty IntroductionFroms}">
                                         <select name="introductionFrom" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="introductionFrom" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntroductionFroms}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.introductionFrom.id}">
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


                                introductionTo<br />
                                <c:choose>
                                    <c:when test="${empty IntroductionTos}">
                                         <select name="introductionTo" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="introductionTo" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntroductionTos}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.introductionTo.id}">
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




          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


