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
		<title>一般コスト一覧</title> 
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
                 var ajaxRequest = new AjaxRequest('PostCommonCostVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_cyclename');
		 		 ajaxRequest.addFormElementsById(num + '_cycle');
		 		 ajaxRequest.addFormElementsById(num + '_equipment');
		 		 ajaxRequest.addFormElementsById(num + '_payed');
		 		 ajaxRequest.addFormElementsById(num + '_costperhour');
		 		 ajaxRequest.addFormElementsById(num + '_hour');
		 		 ajaxRequest.addFormElementsById(num + '_value');
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

<span class="title">一般コスト一覧</span>
                    <display:table name="${commonCosts}" id="row" requestURI="CommonCosts.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteCommonCost.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="cyclename">
<nobr><input size="8"  type="text" name="cyclename" id="${row.id}_cyclename" value="${row.cyclename}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="周期的">
<nobr><input size="8"  type="text" name="cycle" id="${row.id}_cycle" value="${row.cycle}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="機材">
<nobr><input size="8"  type="text" name="equipment" id="${row.id}_equipment" value="${row.equipment}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="支払済み">
<nobr><input size="8"  type="text" name="payed" id="${row.id}_payed" value="${row.payed}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間単価">
<nobr><input size="8"  type="text" name="costperhour" id="${row.id}_costperhour" value="${row.costperhour}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間">
<nobr><input size="8"  type="text" name="hour" id="${row.id}_hour" value="${row.hour}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="値">
<nobr><input size="8"  type="text" name="value" id="${row.id}_value" value="${row.value}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr><input size="8"  type="text" name="name" id="${row.id}_name" value="${row.name}" /></nobr>
</display:column>
<display:column>
<input type="button" value="save" onclick="ajax(${row.id});" />
</display:column>

                    </display:table>
</div>

<div>
<span id="title">
	一般コスト編集
</span>
<span id="subform">

		<form method="POST" action="PostCommonCostVP.do">
          <html:hidden name="form" property="id"/>
cyclename<br />
<html:text name="form" property="cyclename" /><br />

周期的<br />
<html:checkbox name="form" property="cycle" /><br />

機材<br />
<html:checkbox name="form" property="equipment" /><br />

支払済み<br />
<html:checkbox name="form" property="payed" /><br />

時間単価<br />
<html:text name="form" property="costperhour" /><br />

時間<br />
<html:text name="form" property="hour" /><br />

値<br />
<html:text name="form" property="value" /><br />

名前<br />
<html:text name="form" property="name" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="CommonCosts.do">新規一般コスト作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

