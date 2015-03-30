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
<%@page import="net.storyteller.model.*"%> 
<%@page import="net.storyteller.web.app.*"%> 


<%--<html:html>
<tiles:insert page="/h.jsp"/>
<div>
--%>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="トップ" direct="true" />
	<tiles:put name="side" direct="true">
	
	<a href="#" onclick="new Effect.toggle($('hiddenpane'),'blind')" title="header pane">New Test</a>
	<div id="hiddenpane" style="display:none;">
			<form method="POST" action="PostTestVP.do">
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


再現手順<br />
<html:text name="form" property="stepstorepeat" size="50"/><br />

期待される動作<br />
<html:text name="form" property="whatyouexpectedtosee" size="50"/><br />

表示内容<br />
<html:text name="form" property="whatyousawinstead" size="50"/><br />

デバグ済み<br />
<html:checkbox name="form" property="debuged" /><br />

チェック済み<br />
<html:checkbox name="form" property="checked" /><br />

                                割り当てた人<br />
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


                                デバッグ担当<br />
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


                                asmain<br />
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
                                </c:choose><br />

modifiedpagetitle<br/>
<html:text name="form" property="modifiedpagetitle"/><br/>
			          
modifiedpagefilename<br />
<html:text name="form" property="modifiedpagefilename"/>



          <html:submit value="save" />
		</form>


	</div>


<%--<span class="title">一覧</span>--%>
</tiles:put>
	<tiles:put name="content" direct="true"  >
一覧 <br />

<form action="Tests.do">
story:
                                        <select name="j2eeStory" >
                                        <option value="">all</option>
                                            <c:forEach var="valueLabel" items="${J2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq param.j2eeStory}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                        
                                        debuged:
                                        <select name="debuged" >
                                        <option value="">all</option>
                                        <option value="true" <c:if test="${param.debuged == 'true'}">selected</c:if>>true</option>
                                        <option value="false" <c:if test="${param.debuged =='false'}">selected</c:if>>false</option>
                                        </select>
                                        <html:submit  value="view"></html:submit>
</form>

                    <display:table name="${tests}" id="row" requestURI="Tests.do"
                            requestURIcontext="false"
                            export="false" pagesize="0" sort="list" >
 <display:column media="html" sortable="true" title="ID"  >
                        <nobr>
 ${row.id}<br />
                        <a href="Tests.do?id=${row.id}">編集</a><br />
                        <a href="DeleteTest.do?id=${row.id}">削除</a>
                        </nobr>
</display:column>
<c:if test="${empty param.j2eeStory}">
 <display:column media="html" sortable="true" title="ストーリー">
<nobr>
${row.j2eeStory.id}
</nobr>
</display:column>
</c:if>
 <display:column media="html" sortable="true" title="summery" width="60">
${row.summery}
</display:column>
 <display:column media="html" sortable="true" title="再現手順" width="200"  valign="top">
${row.stepstorepeat}
</display:column>
 <display:column media="html" sortable="true" title="期待される動作" width="200"  valign="top">
${row.whatyouexpectedtosee}
</display:column>
 <display:column media="html" sortable="true" title="表示内容" width="200"  valign="top">
${row.whatyousawinstead}
</display:column>
 <display:column media="html" sortable="true" title="デバグ<br />済">
<html:checkbox property="debuged" name="row" disabled="true"></html:checkbox>
</display:column>
 <display:column media="html" sortable="true" title="チェック<br />済">
<nobr>
<html:checkbox property="checked" name="row" disabled="true"></html:checkbox>
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="担当">
${row.debugger.account}
</display:column>
 <display:column media="html" sortable="true" title="asnormal/samain">
<%=SentenceUtil.getSentenceString( ((Test)row).getAsnormal()) %>
<%=SentenceUtil.getSentenceString( ((Test)row).getAsmain()) %>
</display:column>

<display:column media="html" sortable="true" title="modifiedpagetitle">
<nobr>
${row.modifiedpagetitle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="modifiedpagefilename">
<nobr>
${row.modifiedpagefilename}
</nobr>
</display:column>
                    </display:table>
<a href="Tests.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Tests.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Tests.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Tests.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>

	</tiles:put>
</tiles:insert>





<%--</div>
<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

--%>