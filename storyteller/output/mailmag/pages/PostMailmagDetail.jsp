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
	<tiles:put name="title" value="メールマガジン" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostMailmagVP">
          <html:hidden name="form" property="id"/>

keitai<br />
<html:checkbox name="form" property="keitai" /><br />

人気度<br />
<html:text size="20"  name="form" property="poplularity" /><br />

最近の<br />
<html:checkbox name="form" property="recentlyadded" /><br />

分割配送の<br />
<html:checkbox name="form" property="devidedlyderivered" /><br />

予約日時<br />
<input type="text" name="reservationdateAsString" value="<st:date date="${form.reservationdate}" size="20" />" /><br />
                                サイト<br />
                                <c:choose>
                                    <c:when test="${empty Sites}">
                                         <select name="site" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="site" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Sites}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.site.id}">
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


予約済みの<br />
<html:checkbox name="form" property="reserved" /><br />

タイトル<br />
<html:text size="20"  name="form" property="title" /><br />

説明<br />
<html:text size="20"  name="form" property="description" /><br />

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />
                                tag<br />
                                <c:choose>
                                    <c:when test="${empty Tags}">
                                         <select name="tag" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="tag" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Tags}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.tag.id}">
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





          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
