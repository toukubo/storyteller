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
		<title>貢献一覧</title> 
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
                 var ajaxRequest = new AjaxRequest('PostContributeVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_contributionType');
		 		 ajaxRequest.addFormElementsById(num + '_validyearstart');
		 		 ajaxRequest.addFormElementsById(num + '_validmonthstart');
		 		 ajaxRequest.addFormElementsById(num + '_intraUser');
		 		 ajaxRequest.addFormElementsById(num + '_validmonthend');
		 		 ajaxRequest.addFormElementsById(num + '_j2eeStories');
		 		 ajaxRequest.addFormElementsById(num + '_point');
		 		 ajaxRequest.addFormElementsById(num + '_validyearend');
		 		 ajaxRequest.addFormElementsById(num + '_acknowledged');

				 
				 
				 
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

<span class="title">貢献一覧</span>
                    <display:table name="${contributes}" id="row" requestURI="Contributes.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteContribute.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="貢献タイプ">
                                <c:choose>
                                    <c:when test="${empty ContributionTypes}">
                                         <select name="contributionType" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select  name="contributionType" id="${row.id}_contributionType"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ContributionTypes}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.contributionType.id}">
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
 <display:column media="html" sortable="true" title="validyearstart">
<nobr><input size="8"  type="text" name="validyearstart" id="${row.id}_validyearstart" value="${row.validyearstart}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="validmonthstart">
<nobr><input size="8"  type="text" name="validmonthstart" id="${row.id}_validmonthstart" value="${row.validmonthstart}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select  name="intraUser" id="${row.id}_intraUser"><option value=""></option>
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
 <display:column media="html" sortable="true" title="validmonthend">
<nobr><input size="8"  type="text" name="validmonthend" id="${row.id}_validmonthend" value="${row.validmonthend}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="ポイント">
<nobr><input size="8"  type="text" name="point" id="${row.id}_point" value="${row.point}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="validyearend">
<nobr><input size="8"  type="text" name="validyearend" id="${row.id}_validyearend" value="${row.validyearend}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="承認済み">
<nobr><input size="8"  type="text" name="acknowledged" id="${row.id}_acknowledged" value="${row.acknowledged}" /></nobr>
</display:column>

<display:column>
<input type="button" value="save" onclick="ajax(${row.id});" />
</display:column>
                    </display:table>
</div>

<div>
<span id="title">
	貢献編集
</span>
<span id="subform">

		<form method="POST" action="PostContributeVP.do">
          <html:hidden name="form" property="id"/>
                                貢献タイプ<br />
                                <c:choose>
                                    <c:when test="${empty ContributionTypes}">
                                         <select name="contributionType" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="contributionType" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ContributionTypes}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.contributionType.id}">
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


validyearstart<br />
<html:text name="form" property="validyearstart" /><br />

validmonthstart<br />
<html:text name="form" property="validmonthstart" /><br />

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


validmonthend<br />
<html:text name="form" property="validmonthend" /><br />

ポイント<br />
<html:text name="form" property="point" /><br />

validyearend<br />
<html:text name="form" property="validyearend" /><br />

承認済み<br />
<html:checkbox name="form" property="acknowledged" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="Contributes.do">新規貢献作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

