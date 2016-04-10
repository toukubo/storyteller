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
                 var ajaxRequest = new AjaxRequest('PostBasecampTodoListVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_ordernum');
		 		 ajaxRequest.addFormElementsById(num + '_basecampTodos');
		 		 ajaxRequest.addFormElementsById(num + '_basecampProject');
		 		 ajaxRequest.addFormElementsById(num + '_name');

				 
				 
				 
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
                    <display:table name="${basecampTodoLists}" id="row" requestURI="AjaxDisplayBasecampTodoLists.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteBasecampTodoList.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ordernum">
<nobr><input size="8" type="text" name="ordernum" id="${row.id}_ordernum" value="${row.ordernum}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="basecampProject">
                                <c:choose>
                                    <c:when test="${empty BasecampProjects}">
                                         <select name="basecampProject" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select name="basecampProject" id="${row.id}_basecampProject"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${BasecampProjects}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.basecampProject.id}">
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
 <display:column media="html" sortable="true" title="name">
<nobr><input size="8" type="text" name="name" id="${row.id}_name" value="${row.name}" /></nobr>
</display:column>

<display:column><input type="button" onClick="ajax(${row.id});" value="再計算"/></display:column>

                    </display:table>
</div>

<div>
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostBasecampTodoListVP.do">
          <html:hidden name="form" property="id"/>
ordernum<br />
<html:text name="form" property="ordernum" /><br />

                                basecampProject<br />
                                <c:choose>
                                    <c:when test="${empty BasecampProjects}">
                                         <select name="basecampProject" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="basecampProject" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${BasecampProjects}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.basecampProject.id}">
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


          <html:submit value="save" />
		</form>
</span>
                        <a href="BasecampTodoLists.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

