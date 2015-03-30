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
		<title>見積内訳一覧</title> 
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
                 var ajaxRequest = new AjaxRequest('PostEstimationChoiseVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_price');
		 		 ajaxRequest.addFormElementsById(num + '_task');
		 		 ajaxRequest.addFormElementsById(num + '_cost');
		 		 ajaxRequest.addFormElementsById(num + '_profilt');
		 		 ajaxRequest.addFormElementsById(num + '_estimation');

				 
				 
				 
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

<span class="title">見積内訳一覧</span>
                    <display:table name="${estimationChoises}" id="row" requestURI="EstimationChoises.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteEstimationChoise.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr><input size="8"  type="text" name="price" id="${row.id}_price" value="${row.price}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="タスク">
                                <c:choose>
                                    <c:when test="${empty Tasks}">
                                         <select name="task" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select  name="task" id="${row.id}_task"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Tasks}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.task.id}">
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
 <display:column media="html" sortable="true" title="原価">
<nobr><input size="8"  type="text" name="cost" id="${row.id}_cost" value="${row.cost}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="利潤">
<nobr><input size="8"  type="text" name="profilt" id="${row.id}_profilt" value="${row.profilt}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="見積">
                                <c:choose>
                                    <c:when test="${empty Estimations}">
                                         <select name="estimation" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select  name="estimation" id="${row.id}_estimation"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Estimations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.estimation.id}">
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

<display:column>
<input type="button" value="save" onclick="ajax(${row.id});" />
</display:column>
                    </display:table>
</div>

<div>
<span id="title">
	見積内訳編集
</span>
<span id="subform">

		<form method="POST" action="PostEstimationChoiseVP.do">
          <html:hidden name="form" property="id"/>
金額<br />
<html:text name="form" property="price" /><br />

                                タスク<br />
                                <c:choose>
                                    <c:when test="${empty Tasks}">
                                         <select name="task" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="task" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Tasks}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.task.id}">
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


原価<br />
<html:text name="form" property="cost" /><br />

利潤<br />
<html:text name="form" property="profilt" /><br />

                                見積<br />
                                <c:choose>
                                    <c:when test="${empty Estimations}">
                                         <select name="estimation" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="estimation" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Estimations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.estimation.id}">
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
                        <a href="EstimationChoises.do">新規見積内訳作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

