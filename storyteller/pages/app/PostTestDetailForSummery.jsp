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

<%--<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">--%>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="トップ" direct="true" />
	<tiles:put name="side" direct="true">
	</tiles:put>
	<tiles:put name="content" direct="true"  >

<span id="title">
	編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostTestVP">
          <html:hidden name="form" property="id"/>

                                ストーリー<br />
                                <c:choose>
                                    <c:when test="${empty J2eeStorys}">
                                         <select name="j2eeStory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="j2eeStory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${J2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.j2eeStory.id}">
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


                                担当者<br />
                                <c:choose>
                                    <c:when test="${empty Responsibles}">
                                         <select name="responsible" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="responsible" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Responsibles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.responsible.id}">
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


再現手順<br />
<html:text name="form" property="stepstorepeat" /><br />

期待される動作<br />
<html:text name="form" property="whatyouexpectedtosee" /><br />

表示内容<br />
<html:text name="form" property="whatyousawinstead" /><br />

デバグ済み<br />
<html:checkbox name="form" property="debuged" /><br />

チェック済み<br />
<html:checkbox name="form" property="checked" /><br />

                                割り当てた人<br />
                                <c:choose>
                                    <c:when test="${empty Creators}">
                                         <select name="creator" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="creator" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Creators}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.creator.id}">
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


                                デバッグ担当<br />
                                <c:choose>
                                    <c:when test="${empty Debuggers}">
                                         <select name="debugger" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="debugger" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Debuggers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.debugger.id}">
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


                                jsp<br />
                                <c:choose>
                                    <c:when test="${empty Jsps}">
                                         <select name="jsp" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="jsp" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Jsps}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.jsp.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.filename}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.filename}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


summery<br />
<html:text name="form" property="summery" /><br />

                                asnormal<br />
                                <c:choose>
                                    <c:when test="${empty Asnormals}">
                                         <select name="asnormal" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="asnormal" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Asnormals}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.asnormal.id}">
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


                                asmain<br />
                                <c:choose>
                                    <c:when test="${empty Asmains}">
                                         <select name="asmain" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="asmain" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Asmains}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.asmain.id}">
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


modifiedpagetitle<br/>
<html:text name="form" property="modifiedpagetitle"/><br/>
			          
modifiedpagefilename<br />
<html:text name="form" property="modifiedpagefilename"/>
			          




          <html:submit value="save"/>
		</html:form>
</span>

	</tiles:put>
</tiles:insert>


<%--</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>
--%>

