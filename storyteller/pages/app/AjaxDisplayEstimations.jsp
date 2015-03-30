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
		<title>見積一覧</title> 
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
                 var ajaxRequest = new AjaxRequest('PostEstimationVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_totalcost');
		 		 ajaxRequest.addFormElementsById(num + '_j2eeStory');
		 		 ajaxRequest.addFormElementsById(num + '_totalprice');
		 		 ajaxRequest.addFormElementsById(num + '_adapted');
		 		 ajaxRequest.addFormElementsById(num + '_totalsentencenum');
		 		 ajaxRequest.addFormElementsById(num + '_sentenceunit');
		 		 ajaxRequest.addFormElementsById(num + '_estimationChoises');

				 
				 
				 
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

<span class="title">見積一覧</span>
                    <display:table name="${estimations}" id="row" requestURI="Estimations.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />


                        <a href="DeleteEstimation.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="トータルコスト">
<nobr><input size="8"  type="text" name="totalcost" id="${row.id}_totalcost" value="${row.totalcost}" /></nobr>
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
 <display:column media="html" sortable="true" title="合計金額">
<nobr><input size="8"  type="text" name="totalprice" id="${row.id}_totalprice" value="${row.totalprice}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="採用">
<nobr><input size="8"  type="text" name="adapted" id="${row.id}_adapted" value="${row.adapted}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="totalsentencenum">
<nobr><input size="8"  type="text" name="totalsentencenum" id="${row.id}_totalsentencenum" value="${row.totalsentencenum}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="センテンス単価">
<nobr><input size="8"  type="text" name="sentenceunit" id="${row.id}_sentenceunit" value="${row.sentenceunit}" /></nobr>
</display:column>
<display:column>
<input type="button" value="save" onclick="ajax(${row.id});" />
</display:column>

                    </display:table>
</div>

<div>
<span id="title">
	見積編集
</span>
<span id="subform">

		<form method="POST" action="PostEstimationVP.do">
          <html:hidden name="form" property="id"/>
トータルコスト<br />
<html:text name="form" property="totalcost" /><br />

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


合計金額<br />
<html:text name="form" property="totalprice" /><br />

採用<br />
<html:checkbox name="form" property="adapted" /><br />

totalsentencenum<br />
<html:text name="form" property="totalsentencenum" /><br />

センテンス単価<br />
<html:text name="form" property="sentenceunit" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="Estimations.do">新規見積作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

