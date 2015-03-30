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
                 var ajaxRequest = new AjaxRequest('PostIntraUserVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_password');
		 		 ajaxRequest.addFormElementsById(num + '_costperhour');
		 		 ajaxRequest.addFormElementsById(num + '_costperhourforovertime');
		 		 ajaxRequest.addFormElementsById(num + '_costperhourforholliday');
		 		 ajaxRequest.addFormElementsById(num + '_costperhourformidngith');
		 		 ajaxRequest.addFormElementsById(num + '_phonenum');
		 		 ajaxRequest.addFormElementsById(num + '_code');
		 		 ajaxRequest.addFormElementsById(num + '_sex');
		 		 ajaxRequest.addFormElementsById(num + '_familyname');
		 		 ajaxRequest.addFormElementsById(num + '_roi');
		 		 ajaxRequest.addFormElementsById(num + '_netincome');
		 		 ajaxRequest.addFormElementsById(num + '_mail');
		 		 ajaxRequest.addFormElementsById(num + '_account');
		 		 ajaxRequest.addFormElementsById(num + '_icalurl');
		 		 ajaxRequest.addFormElementsById(num + '_icalurlusing');
		 		 ajaxRequest.addFormElementsById(num + '_c2talkaccount');
		 		 ajaxRequest.addFormElementsById(num + '_c2talkpassword');
		 		 ajaxRequest.addFormElementsById(num + '_monthlybasesalary');
		 		 ajaxRequest.addFormElementsById(num + '_fixedsalary');
		 		 ajaxRequest.addFormElementsById(num + '_currenttransitbase');
		 		 ajaxRequest.addFormElementsById(num + '_workhours');
		 		 ajaxRequest.addFormElementsById(num + '_starthour');
		 		 ajaxRequest.addFormElementsById(num + '_privilege');
		 		 ajaxRequest.addFormElementsById(num + '_name');
		 		 ajaxRequest.addFormElementsById(num + '_flag');
		 		 ajaxRequest.addFormElementsById(num + '_address');

				 
				 
				 
                 ajaxRequest.sendRequest();  //Send the request
                 new Rico.Effect.FadeTo( 'message', 1, 100, 4 );
                 document.getElementById("message").innerHTML="saved / 保存されました";
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
<div id="message"></div>
                    <display:table name="${intraUsers}" id="row" requestURI="AjaxDisplayIntraUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteIntraUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="password">
<nobr><input size="8" type="text" name="password" id="${row.id}_password" value="${row.password}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="costperhour">
<nobr><input size="8" type="text" name="costperhour" id="${row.id}_costperhour" value="${row.costperhour}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="costperhourforovertime">
<nobr><input size="8" type="text" name="costperhourforovertime" id="${row.id}_costperhourforovertime" value="${row.costperhourforovertime}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="costperhourforholliday">
<nobr><input size="8" type="text" name="costperhourforholliday" id="${row.id}_costperhourforholliday" value="${row.costperhourforholliday}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="costperhourformidngith">
<nobr><input size="8" type="text" name="costperhourformidngith" id="${row.id}_costperhourformidngith" value="${row.costperhourformidngith}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="phonenum">
<nobr><input size="8" type="text" name="phonenum" id="${row.id}_phonenum" value="${row.phonenum}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="code">
<nobr><input size="8" type="text" name="code" id="${row.id}_code" value="${row.code}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="sex">
<nobr><input size="8" type="text" name="sex" id="${row.id}_sex" value="${row.sex}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="familyname">
<nobr><input size="8" type="text" name="familyname" id="${row.id}_familyname" value="${row.familyname}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="roi">
<nobr><input size="8" type="text" name="roi" id="${row.id}_roi" value="${row.roi}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="netincome">
<nobr><input size="8" type="text" name="netincome" id="${row.id}_netincome" value="${row.netincome}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="mail">
<nobr><input size="8" type="text" name="mail" id="${row.id}_mail" value="${row.mail}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="account">
<nobr><input size="8" type="text" name="account" id="${row.id}_account" value="${row.account}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="icalurl">
<nobr><input size="8" type="text" name="icalurl" id="${row.id}_icalurl" value="${row.icalurl}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="icalurlusing">
<nobr><input size="8" type="text" name="icalurlusing" id="${row.id}_icalurlusing" value="${row.icalurlusing}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="c2talkaccount">
<nobr><input size="8" type="text" name="c2talkaccount" id="${row.id}_c2talkaccount" value="${row.c2talkaccount}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="c2talkpassword">
<nobr><input size="8" type="text" name="c2talkpassword" id="${row.id}_c2talkpassword" value="${row.c2talkpassword}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="monthlybasesalary">
<nobr><input size="8" type="text" name="monthlybasesalary" id="${row.id}_monthlybasesalary" value="${row.monthlybasesalary}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="fixedsalary">
<nobr><input size="8" type="text" name="fixedsalary" id="${row.id}_fixedsalary" value="${row.fixedsalary}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="currenttransitbase">
<nobr><input size="8" type="text" name="currenttransitbase" id="${row.id}_currenttransitbase" value="${row.currenttransitbase}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="workhours">
<nobr><input size="8" type="text" name="workhours" id="${row.id}_workhours" value="${row.workhours}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="starthour">
<nobr><input size="8" type="text" name="starthour" id="${row.id}_starthour" value="${row.starthour}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="privilege">
                                <c:choose>
                                    <c:when test="${empty Privileges}">
                                         <select name="privilege" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
<select name="privilege" id="${row.id}_privilege"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Privileges}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.privilege.id}">
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
 <display:column media="html" sortable="true" title="flag">
<nobr><input size="8" type="text" name="flag" id="${row.id}_flag" value="${row.flag}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="address">
<nobr><input size="8" type="text" name="address" id="${row.id}_address" value="${row.address}" /></nobr>
</display:column>

<display:column><input type="button" onClick="ajax(${row.id});" value="再計算"/></display:column>

                    </display:table>
</div>

<div>
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostIntraUserVP.do">
          <html:hidden name="form" property="id"/>
password<br />
<html:text name="form" property="password" /><br />

costperhour<br />
<html:text name="form" property="costperhour" /><br />

costperhourforovertime<br />
<html:text name="form" property="costperhourforovertime" /><br />

costperhourforholliday<br />
<html:text name="form" property="costperhourforholliday" /><br />

costperhourformidngith<br />
<html:text name="form" property="costperhourformidngith" /><br />

phonenum<br />
<html:text name="form" property="phonenum" /><br />

code<br />
<html:text name="form" property="code" /><br />

sex<br />
<html:text name="form" property="sex" /><br />

familyname<br />
<html:text name="form" property="familyname" /><br />

roi<br />
<html:text name="form" property="roi" /><br />

netincome<br />
<html:text name="form" property="netincome" /><br />

mail<br />
<html:text name="form" property="mail" /><br />

account<br />
<html:text name="form" property="account" /><br />

icalurl<br />
<html:text name="form" property="icalurl" /><br />

icalurlusing<br />
<html:checkbox name="form" property="icalurlusing" /><br />

c2talkaccount<br />
<html:text name="form" property="c2talkaccount" /><br />

c2talkpassword<br />
<html:text name="form" property="c2talkpassword" /><br />

monthlybasesalary<br />
<html:text name="form" property="monthlybasesalary" /><br />

fixedsalary<br />
<html:checkbox name="form" property="fixedsalary" /><br />

currenttransitbase<br />
<html:text name="form" property="currenttransitbase" /><br />

workhours<br />
<html:text name="form" property="workhours" /><br />

starthour<br />
<html:text name="form" property="starthour" /><br />

                                privilege<br />
                                <c:choose>
                                    <c:when test="${empty Privileges}">
                                         <select name="privilege" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="privilege" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Privileges}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.privilege.id}">
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

flag<br />
<html:text name="form" property="flag" /><br />

address<br />
<html:text name="form" property="address" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="IntraUsers.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

