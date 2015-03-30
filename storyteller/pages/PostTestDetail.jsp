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

<%--<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">--%>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="トップ" direct="true" />	
	<tiles:put name="side" direct="true">
	</tiles:put>
	<tiles:put name="head" direct="true">

		<script>		
			function focushim() {
				alert('G');	
				document.getElementById('stepstorepeat').focus();document.getElementById('stepstorepeat').select();	
			}
		</script>
	</tiles:put>
	<tiles:put name="content" direct="true"  >
		<body onload="document.getElementById('stepstorepeat').focus();">
<span id="title">
	編集 <br />
</span>
<span id="subform">

		<form method="POST" name="testform" action="PostTestVP.do" >
          <html:hidden name="form" property="id"/>
			<input type="hidden" id="flag" value="0"/>


Steps To Repeat<br />

<html:textarea name="model" styleId="stepstorepeat" tabindex="1" property="stepstorepeat" cols="26"  rows="3" /><br />

What expected to see<br />
<html:textarea name="form" property="whatyouexpectedtosee" cols="26"  rows="3" /><br />

what you saw instead<br />
<html:textarea name="model" property="whatyousawinstead" cols="26"  rows="3" /><br />

                          debugger<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="debugger" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="debugger" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
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


					<a href="#" name="advanced" onclick="new Effect.toggle($('systemPane2'),'blind')" title="header pane">advanced</a>            
			          <div id="systemPane2" style="display:none;">
<%--			          G--%>
                                story<br />
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


                                responsible<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="responsible" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="responsible" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
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


debgged<br />
<html:checkbox name="form" property="debuged" /><br />

checked<br />
<html:checkbox name="form" property="checked" /><br />

                                creator<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="creator" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="creator" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
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
                                    <c:when test="${empty Sentences}">
                                         <select name="asnormal" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="asnormal" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Sentences}">
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


                                sentence asmain<br />
                                <c:choose>
                                    <c:when test="${empty Sentences}">
                                         <select name="asmain" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="asmain" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Sentences}">
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
                                </c:choose> <br />

modifiedpagetitle<br/>
<html:text name="form" property="modifiedpagetitle"/><br/>
			          
modifiedpagefilename<br />
<html:text name="form" property="modifiedpagefilename"/>
			          
			          </div>


         <br /><html:submit value="save" /><br />
		</form>
</span>
                        <a href="Tests.do">new test</a>

		
	</tiles:put>
</tiles:insert>


<%--</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>
--%>

