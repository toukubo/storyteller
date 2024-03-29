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

<html:html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title>内部ユーザー一覧</title> 
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
		 		 ajaxRequest.addFormElementsById(num + '_name');
		 		 ajaxRequest.addFormElementsById(num + '_account');
		 		 ajaxRequest.addFormElementsById(num + '_costperhour');
		 		 ajaxRequest.addFormElementsById(num + '_asdebugger');
		 		 ajaxRequest.addFormElementsById(num + '_asresponsible');
		 		 ajaxRequest.addFormElementsById(num + '_ascreator');
		 		 ajaxRequest.addFormElementsById(num + '_tasks');
		 		 ajaxRequest.addFormElementsById(num + '_icalurl');
		 		 ajaxRequest.addFormElementsById(num + '_c2talkaccount');
		 		 ajaxRequest.addFormElementsById(num + '_c2talkpassword');
		 		 ajaxRequest.addFormElementsById(num + '_businessCosts');
		 		 ajaxRequest.addFormElementsById(num + '_profitDividients');
		 		 ajaxRequest.addFormElementsById(num + '_contributes');
		 		 ajaxRequest.addFormElementsById(num + '_roleAssigns');
		 		 ajaxRequest.addFormElementsById(num + '_password');
		 		 ajaxRequest.addFormElementsById(num + '_mail');				 
				 
				 
                 ajaxRequest.sendRequest();  //Send the request
                 new Rico.Effect.FadeTo( 'message', 1, 100, 4 );
                 document.getElementById("message").innerHTML="saved";
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


<span class="title">内部ユーザー一覧</span>
<div id="message"></div>
                    <display:table name="${intrausers}" id="row" requestURI="AjaxDisplayIntraUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteIntraUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr><input size="8" type="text" name="name" id="${row.id}_name" value="${row.name}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="アカウント">
<nobr><input size="8" type="text" name="account" id="${row.id}_account" value="${row.account}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間単価">
<nobr><input size="8" type="text" name="costperhour" id="${row.id}_costperhour" value="${row.costperhour}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="icalurl">
<nobr><input size="8" type="text" name="icalurl" id="${row.id}_icalurl" value="${row.icalurl}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="c2talkaccount">
<nobr><input size="8" type="text" name="c2talkaccount" id="${row.id}_c2talkaccount" value="${row.c2talkaccount}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="c2talkpassword">
<nobr><input size="8" type="text" name="c2talkpassword" id="${row.id}_c2talkpassword" value="${row.c2talkpassword}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr><input size="8" type="text" name="password" id="${row.id}_password" value="${row.password}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール">
<nobr><input size="8" type="text" name="mail" id="${row.id}_mail" value="${row.mail}" /></nobr>
</display:column>

<display:column><input type="button" onClick="ajax(${row.id});" value="再計算"/></display:column>

                    </display:table>

</div>

<div>
<span id="title">
	内部ユーザー編集
</span>
<span id="subform">

		<form method="POST" action="PostIntraUserVP.do">
          <html:hidden name="form" property="id"/>
名前<br />
<html:text name="form" property="name" /><br />

アカウント<br />
<html:text name="form" property="account" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="IntraUsers.do">新規内部ユーザー作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

