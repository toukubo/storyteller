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
		<title>案件コスト一覧</title> 
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
                 var ajaxRequest = new AjaxRequest('PostBusinessCostVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_j2eeStory');
		 		 ajaxRequest.addFormElementsById(num + '_costperhour');
		 		 ajaxRequest.addFormElementsById(num + '_intraUser');
		 		 ajaxRequest.addFormElementsById(num + '_value');
		 		 ajaxRequest.addFormElementsById(num + '_hour');
		 		 ajaxRequest.addFormElementsById(num + '_role');
		 		 ajaxRequest.addFormElementsById(num + '_storytellerRole');

				 
				 
				 
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

<span class="title">案件コスト一覧</span>
                    <display:table name="${businessCosts}" id="row" requestURI="BusinessCosts.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteBusinessCost.do?id=${row.id}">削除</a>
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
 <display:column media="html" sortable="true" title="時間単価">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="costperhour" id="${row.id}_costperhour" value="${row.costperhour}" /></nobr>
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
 <display:column media="html" sortable="true" title="値">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="value" id="${row.id}_value" value="${row.value}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間">
<nobr><input size="8" onblur="ajax(${row.id});" type="text" name="hour" id="${row.id}_hour" value="${row.hour}" /></nobr>
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

                    </display:table>
</div>

<div>
<span id="title">
	案件コスト編集
</span>
<span id="subform">

		<form method="POST" action="PostBusinessCostVP.do">
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


時間単価<br />
<html:text name="form" property="costperhour" /><br />

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


値<br />
<html:text name="form" property="value" /><br />

時間<br />
<html:text name="form" property="hour" /><br />

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



          <html:submit value="save" />
		</form>
</span>
                        <a href="BusinessCosts.do">新規案件コスト作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

