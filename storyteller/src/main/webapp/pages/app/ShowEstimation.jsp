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
<%@page import="net.storyteller.model.*"%> 
<%@page import="net.storyteller.web.app.*"%> 

<%@ page isELIgnored="false" %>

<html>
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
                 var ajaxRequest = new AjaxRequest('PostEstimationChoiseVPForUpdate.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
		 		 ajaxRequest.addFormElementsById(num + '_marketAveragePrice');
		 		 ajaxRequest.addFormElementsById(num + '_marketAverageDays');
		 		 ajaxRequest.addFormElementsById(num + '_requireddays');
		 		 ajaxRequest.addFormElementsById(num + '_cost');
		 		 ajaxRequest.addFormElementsById(num + '_price');
				 
				 
				 
                 ajaxRequest.sendRequest();  //Send the request
                 new Rico.Effect.FadeTo( 'message', 1, 100, 4 );
                 document.getElementById("message").innerHTML="ok";
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
                  <script type="text/javascript">
             function ajax2(num) {
                 var ajaxRequest = new AjaxRequest('PostTestVPForSummery.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById('secound' + num + '_id');
		 		 ajaxRequest.addFormElementsById('secound' +num +  '_summery');
		 		 ajaxRequest.addFormElementsById('secound' + num + '_from');
		 		 ajaxRequest.addFormElementsById('secound' + num + '_ajax');
				 
                 ajaxRequest.sendRequest();  //Send the request
                 new Rico.Effect.FadeTo( 'message', 1, 100, 4 );
                 document.getElementById("message").innerHTML="ok";
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
<h1>Estimation: ${estimation.title}</h1>
<a href="PDFShowEstimation.do?id=${estimation.id}">PDF</a>
<a href="ShowEstimation.do?export=true&id=${estimation.id}">XLS</a>
<a href="ShowEstimation.do?export=true&intra=true&id=${estimation.id}">内部用XLS</a>
<br />
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx<br />
<c:if test="${!empty estimation.j2eeStory.client}">
${estimation.j2eeStory.client.name}様
</c:if>
id
${estimation.id} : 
プロジェクト：${estimation.j2eeStory.name} :  合計金額 : <bean:write name="estimation" property="totalprice" format="###,###,###円"/>
-><a href="UpdateEstimationFromForSummingup.do?id=${estimation.id}">再計算</a> : 
採用:
${estimation.adapted} : 合計センテンス数: (totalsentencenum) :<bean:define id="estimation" name="estimation"></bean:define>
:<%=((Estimation)estimation).getEstimationChoises().size()%> : ディスカウント率: ${estimation.j2eeStory.discountpercentage}
<br />
センテンス単価 :${estimation.sentenceunit}  // トータルコスト : ${estimation.totalcost}
<br/>
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx<br />
<div id="message"></div><a href="UpdateEstimationFromFromVerbAndDiscount.do?id=${estimation.id}">メイン文から値取得</a>
<display:table name="estimation.estimationChoises" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false">
 <display:column media="html" sortable="true" title="ID" property="id" >
</display:column>
<display:column title="未選択に">
<a href="DeleteEstimationChoise.do?id=${row.id}">
☆
</a>
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />
</display:column>
 <display:column media="html" sortable="true" title="件名">
 		<html:form method="POST" action="/PostTestVPForSummery">
 		<input type="hidden" name="id" value="${row.test.id}" id="secound${row.id}_id" />
 		<input type="hidden" name="from" value="${estimation.id}" id="secound${row.id}_from"/>

summery<br />
<input type="text" id="secound${row.id}_summery" name="summery" value="${row.test.summery}" />
          <input type="button" onclick="ajax2(${row.id});" width=""value="変更"/>
		</html:form>
 
</display:column>
<display:column title="再計算">
<nobr>
<a href="UpdateEstimationChoiseFromAboutPrices.do?id=${row.id}">
相場額->見積額
</a><br />
<a href="UpdateEstimationChoiseFromAboutMarketPrices.do?id=${row.id}&fromdays=true">
相場日数->相場額
</a><br />
<a href="UpdateEstimationChoiseFromAboutMarketPrices.do?id=${row.id}">
相場額->相場日数
</a>
<br />
<a href="UpdateEstimationChoiseFromFromVerbAndDiscount.do?id=${row.id}">
メイン文から値取得
</a>
</nobr>
</display:column>
<display:column title="Sentence名">
 <%=SentenceUtil.getSentenceString(((EstimationChoise)row).getTest().getAsmain()) %>
</display:column>
 <display:column media="html" sortable="true" title="marketAveragePrice">
<nobr><input size="8" type="text" name="marketAveragePrice" id="${row.id}_marketAveragePrice" value="${row.marketAveragePrice}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="marketAverageDays">
<nobr><input size="8"  type="text" name="marketAverageDays" id="${row.id}_marketAverageDays" value="${row.marketAverageDays}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="requireddays">
<nobr><input size="8"  type="text" name="requireddays" id="${row.id}_requireddays" value="${row.requireddays}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="原価">
<nobr><input size="8"  type="text" name="cost" id="${row.id}_cost" value="${row.cost}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr><input size="8"  type="text" name="price" id="${row.id}_price" value="${row.price}" /></nobr>
</display:column>
 <display:column media="html" sortable="true" title="利潤">
${row.profilt}
</display:column>
<display:column><input type="button" onClick="ajax(${row.id});" value="再計算"/></display:column>
 <display:column media="html" sortable="true" title="再現手順">

${row.test.stepstorepeat}

</display:column>
 <display:column media="html" sortable="true" title="期待される動作">

${row.test.whatyouexpectedtosee}

</display:column>
 <display:column media="html" sortable="true" title="表示内容">

${row.test.whatyousawinstead}

</display:column>

 <display:column media="html" sortable="true" title="jsp">

${row.test.jsp.id}

</display:column>
 <display:column media="html" sortable="true" title="as normal">

${row.test.asnormal}

</display:column>
 <display:column media="html" sortable="true" title="as main">

${row.test.asmain.verb.name}(${row.test.asmain.verb.japanese})
${row.test.asmain.name}

</display:column>
 <display:column media="html" sortable="true" title="estimation Choises">
<c:forEach items="${row.test.estimationChoises}" var="choise">
${chiose.estimation.id}
</c:forEach>
</display:column>

</display:table>
</div>

<div>
テスト一覧
<a href="ShowEstimation.do?id=${estimation.id}&withNullEstimationChoises=true">見積もりされていないもの</a>
<display:table name="Tests" id="row" requestURI="ShowEstimation.do" pagesize="0"  requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >
</display:column>
<display:column title="選択">
<a href="PostEstimationChoiseVP.do?test=${row.id}&estimation=${estimation.id}&id=">
☆
</a>

</display:column>
 <display:column media="html" sortable="true" title="件名">
${row.summery} ( )
</display:column>
<display:column title="Sentence名">
<%=SentenceUtil.getSentenceString( ((Test)row).getAsmain()) %>
</display:column>

 <display:column media="html" sortable="true" title="担当者">
<nobr>
${row.responsible.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="再現手順">
${row.stepstorepeat}
</display:column>
 <display:column media="html" sortable="true" title="期待される動作">
${row.whatyouexpectedtosee}
</display:column>
 <display:column media="html" sortable="true" title="表示内容">
${row.whatyousawinstead}
</display:column>
 <display:column media="html" sortable="true" title="デバグ済み">
${row.debuged}
</display:column>
 <display:column media="html" sortable="true" title="チェック済み">
${row.checked}
</display:column>
 <display:column media="html" sortable="true" title="デバッグ担当">
${row.debugger.name}
</display:column>
 <display:column media="html" sortable="true" title="jsp">
${row.jsp.id}
</display:column>
 <display:column media="html" sortable="true" title="as normal">
${row.asnormal}
</display:column>
 <display:column media="html" sortable="true" title="as main">
${row.asmain.verb.name}(${row.asmain.verb.japanese})
${row.asmain.name}
</display:column>
 <display:column media="html" sortable="true" title="estimation Choises">
<c:forEach items="${row.estimationChoises}" var="choise">
${choise.estimation.id}
</c:forEach>
</display:column>
</display:table>


</div>

</body>
</html>

