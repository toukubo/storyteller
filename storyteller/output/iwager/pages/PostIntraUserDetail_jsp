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
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostIntraUserVP">
          <html:hidden name="form" property="id"/>

password<br />
<html:text name="form" property="password" /><br />

costperhour<br />
<html:text name="form" property="costperhour" /><br />

costperhourforovertime<br />
<html:text name="form" property="costperhourforovertime" /><br />

costperhourforholliday<br />
<html:text name="form" property="costperhourforholliday" /><br />

costperhourformidngith<br />
<html:text name="form" property="costperhourformidngith" /><br />

phonenum<br />
<html:text name="form" property="phonenum" /><br />

code<br />
<html:text name="form" property="code" /><br />

sex<br />
<html:text name="form" property="sex" /><br />

familyname<br />
<html:text name="form" property="familyname" /><br />

roi<br />
<html:text name="form" property="roi" /><br />

netincome<br />
<html:text name="form" property="netincome" /><br />

mail<br />
<html:text name="form" property="mail" /><br />

account<br />
<html:text name="form" property="account" /><br />

icalurl<br />
<html:text name="form" property="icalurl" /><br />

icalurlusing<br />
<html:checkbox name="form" property="icalurlusing" /><br />

c2talkaccount<br />
<html:text name="form" property="c2talkaccount" /><br />

c2talkpassword<br />
<html:text name="form" property="c2talkpassword" /><br />

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

                                privilege<br />
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


name<br />
<html:text name="form" property="name" /><br />

flag<br />
<html:text name="form" property="flag" /><br />

address<br />
<html:text name="form" property="address" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
