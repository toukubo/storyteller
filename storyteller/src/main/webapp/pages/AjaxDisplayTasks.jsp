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
		<title>タスク一覧</title> 
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
                 var ajaxRequest = new AjaxRequest('PostTaskVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_name');
		 		 ajaxRequest.addFormElementsById(num + '_done');
		 		 ajaxRequest.addFormElementsById(num + '_startdate');
		 		 ajaxRequest.addFormElementsById(num + '_enddate');
		 		 ajaxRequest.addFormElementsById(num + '_hour');
		 		 ajaxRequest.addFormElementsById(num + '_intraUser');
		 		 ajaxRequest.addFormElementsById(num + '_j2eeStory');
		 		 ajaxRequest.addFormElementsById(num + '_acknowledged');
		 		 ajaxRequest.addFormElementsById(num + '_assigned');
		 		 ajaxRequest.addFormElementsById(num + '_taskTemplate');
		 		 ajaxRequest.addFormElementsById(num + '_estimationChoises');
		 		 ajaxRequest.addFormElementsById(num + '_summery');
		 		 ajaxRequest.addFormElementsById(num + '_ordernum');

				 
				 
				 
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

<span class="title">タスク一覧</span>
                    <display:table name="${tasks}" id="row" requestURI="Tasks.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteTask.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="name" id="${row.id}_name" value="${row.name}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="済み">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="done" id="${row.id}_done" value="${row.done}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="開始日時"><nobr><input size="8" onblur="ajax(${row.id});" type="text" name="startdateAsString" id="${row.id}_startdate" value="<st:date date="${row.basedeadline}"></st:date>" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="終了日時"><nobr><input size="8" onblur="ajax(${row.id});" type="text" name="enddateAsString" id="${row.id}_enddate" value="<st:date date="${row.basedeadline}"></st:date>" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="hour" id="${row.id}_hour" value="${row.hour}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select onblur="ajax(${row.id});" name="intraUser" id="${row.id}_intraUser"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.intraUser.id}">
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
 <display:column media="html" sortable="true" title="ストーリー">
                                <c:choose>
                                    <c:when test="${empty J2eeStorys}">
                                         <select name="j2eeStory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select onblur="ajax(${row.id});" name="j2eeStory" id="${row.id}_j2eeStory"><option value=""></option>
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
 <display:column media="html" sortable="true" title="承認済み">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="acknowledged" id="${row.id}_acknowledged" value="${row.acknowledged}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="アサイン済み">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="assigned" id="${row.id}_assigned" value="${row.assigned}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="TaskTemplate">
                                <c:choose>
                                    <c:when test="${empty TaskTemplates}">
                                         <select name="taskTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select onblur="ajax(${row.id});" name="taskTemplate" id="${row.id}_taskTemplate"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${TaskTemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.taskTemplate.id}">
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
 <display:column media="html" sortable="true" title="サマリー">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="summery" id="${row.id}_summery" value="${row.summery}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="ordernum" id="${row.id}_ordernum" value="${row.ordernum}" /></nobr>
</display:column>

                    </display:table>
</div>

<div>
<span id="title">
	タスク編集
</span>
<span id="subform">

		<form method="POST" action="PostTaskVP.do">
          <html:hidden name="form" property="id"/>
名前<br />
<html:text name="form" property="name" /><br />

済み<br />
<html:checkbox name="form" property="done" /><br />

開始日時<br />
<input type="text" name="startdateAsString" value="<bean:write name="form" property="startdate" format="yyyy/MM/dd" />" /><br />
終了日時<br />
<input type="text" name="enddateAsString" value="<bean:write name="form" property="enddate" format="yyyy/MM/dd" />" /><br />
時間<br />
<html:text name="form" property="hour" /><br />

                                内部ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
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


承認済み<br />
<html:checkbox name="form" property="acknowledged" /><br />

アサイン済み<br />
<html:checkbox name="form" property="assigned" /><br />

                                TaskTemplate<br />
                                <c:choose>
                                    <c:when test="${empty TaskTemplates}">
                                         <select name="taskTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="taskTemplate" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${TaskTemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.taskTemplate.id}">
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


サマリー<br />
<html:text name="form" property="summery" /><br />

注文数<br />
<html:text name="form" property="ordernum" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="Tasks.do">新規タスク作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

