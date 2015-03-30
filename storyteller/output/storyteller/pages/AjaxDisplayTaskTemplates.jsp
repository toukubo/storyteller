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
		<title>TaskTemplate一覧</title> 
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
                 var ajaxRequest = new AjaxRequest('PostTaskTemplateVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_name');
		 		 ajaxRequest.addFormElementsById(num + '_role');
		 		 ajaxRequest.addFormElementsById(num + '_tasks');
		 		 ajaxRequest.addFormElementsById(num + '_cyclic');
		 		 ajaxRequest.addFormElementsById(num + '_storytellerRole');
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

<span class="title">TaskTemplate一覧</span>
                    <display:table name="${taskTemplates}" id="row" requestURI="TaskTemplates.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteTaskTemplate.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="name" id="${row.id}_name" value="${row.name}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="役割">
                                <c:choose>
                                    <c:when test="${empty Roles}">
                                         <select name="role" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select onblur="ajax(${row.id});" name="role" id="${row.id}_role"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Roles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.role.id}">
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
 <display:column media="html" sortable="true" title="周期的">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="cyclic" id="${row.id}_cyclic" value="${row.cyclic}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="storytellerRole">
                                <c:choose>
                                    <c:when test="${empty StorytellerRoles}">
                                         <select name="storytellerRole" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select onblur="ajax(${row.id});" name="storytellerRole" id="${row.id}_storytellerRole"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${StorytellerRoles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.storytellerRole.id}">
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
 <display:column media="html" sortable="true" title="注文数">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="ordernum" id="${row.id}_ordernum" value="${row.ordernum}" /></nobr>
</display:column>

                    </display:table>
</div>

<div>
<span id="title">
	TaskTemplate編集
</span>
<span id="subform">

		<form method="POST" action="PostTaskTemplateVP.do">
          <html:hidden name="form" property="id"/>
名前<br />
<html:text name="form" property="name" /><br />

                                役割<br />
                                <c:choose>
                                    <c:when test="${empty Roles}">
                                         <select name="role" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="role" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Roles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.role.id}">
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


周期的<br />
<html:checkbox name="form" property="cyclic" /><br />

                                storytellerRole<br />
                                <c:choose>
                                    <c:when test="${empty StorytellerRoles}">
                                         <select name="storytellerRole" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="storytellerRole" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${StorytellerRoles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.storytellerRole.id}">
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


注文数<br />
<html:text name="form" property="ordernum" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="TaskTemplates.do">新規TaskTemplate作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

