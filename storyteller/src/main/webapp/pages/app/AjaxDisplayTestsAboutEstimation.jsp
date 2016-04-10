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
<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>
<%@ page isELIgnored="false" %>

<html:html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title>一覧</title> 
		<link href="base.css" rel="stylesheet" type="text/css">
		<script src="js/prototype.js" type="text/javascript"></script>
		<script src="js/scriptaculous.js" type="text/javascript"></script>
		<script src="calendarlay3.js" language="JavaScript"></script>
		
		<!-- for leightbox -->
		<script type="text/javascript" src="scripts/prototype.js"></script>
		<script type="text/javascript" src="scripts/lightbox.js"></script>
		
		<link rel="stylesheet" href="./css/default.css" type="text/css">
		
		<!-- for products.jsp page's select all /deselect all function -->
		<script type="text/javascript" src="scripts/selectall.js"></script>
		<link rel="stylesheet" href="css/screen.css" media="screen,projection" type="text/css" />
		         <script type="text/javascript" src="taconite-client.js"></script>
         <script type="text/javascript" src="taconite-parser.js"></script>
         <script src="prototype.js" type="text/javascript"></script>
		<script src="rico.js" type="text/javascript"></script>
         <script type="text/javascript">
             function ajax(num) {
                 var ajaxRequest = new AjaxRequest('PostTestVPAboutEstimation.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_j2eeStory');
		 		 ajaxRequest.addFormElementsById(num + '_responsible');
		 		 ajaxRequest.addFormElementsById(num + '_stepstorepeat');
		 		 ajaxRequest.addFormElementsById(num + '_whatyouexpectedtosee');
		 		 ajaxRequest.addFormElementsById(num + '_whatyousawinstead');
		 		 ajaxRequest.addFormElementsById(num + '_debuged');
		 		 ajaxRequest.addFormElementsById(num + '_checked');
		 		 ajaxRequest.addFormElementsById(num + '_creator');
		 		 ajaxRequest.addFormElementsById(num + '_debugger');
		 		 ajaxRequest.addFormElementsById(num + '_jsp');

				 
				 
				 
                 ajaxRequest.sendRequest();  //Send the request
                 new Rico.Effect.FadeTo( 'message', 1, 100, 4 );
                 document.getElementById("message").innerHTML="";
                 new Rico.Effect.FadeTo( 'message',0,3000,10, {complete:function() {}} );

             }
             /**
              * ajaxOnSelect
              * @param {select} select 
              */
              function ajaxOnSelect(hidden,select,num) {
              	document.getElementById(num + '_' + hidden).value = select.value;
              	ajax(num);
              }
         </script>
</head>
<body>
<tiles:insert page="/systemheader.jsp" />

<div>

<span class="title">一覧</span>
                    <display:table name="${tests}" id="row" requestURI="Tests.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteTest.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ストーリー">
                                <c:choose>
                                    <c:when test="${empty J2eeStorys}">
                                         <select name="j2eeStory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select  name="j2eeStory" id="${row.id}_j2eeStory"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${J2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.j2eeStory.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
</display:column>
 <display:column media="html" sortable="true" title="担当者">
<nobr>
${row.responsible}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="再現手順">
<nobr><input size="8"  type="text" name="stepstorepeat" id="${row.id}_stepstorepeat" value="${row.stepstorepeat}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="期待される動作">
<nobr><input size="8"  type="text" name="whatyouexpectedtosee" id="${row.id}_whatyouexpectedtosee" value="${row.whatyouexpectedtosee}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="表示内容">
<nobr><input size="8"  type="text" name="whatyousawinstead" id="${row.id}_whatyousawinstead" value="${row.whatyousawinstead}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="デバグ済み">
<nobr><input size="8"  type="text" name="debuged" id="${row.id}_debuged" value="${row.debuged}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="チェック済み">
<nobr><input size="8"  type="text" name="checked" id="${row.id}_checked" value="${row.checked}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="割り当てた人">
<nobr>
${row.creator}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="デバッグ担当">
<nobr>
${row.debugger}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="jsp">
                                <c:choose>
                                    <c:when test="${empty Jsps}">
                                         <select name="jsp" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select  name="jsp" id="${row.id}_jsp"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Jsps}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.jsp.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.filename}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.filename}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
</display:column>

<display:column>
<input type="button" value="save" onclick="ajax(${row.id});" />
</display:column>
                    </display:table>
</div>

<div>
<span id="title">
	編集
</span>
<span id="subform">

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



          <html:submit value="save" />
		</form>
</span>
                        <a href="Tests.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

