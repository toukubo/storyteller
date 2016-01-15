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

<tiles:insert definition=".layout">
	<tiles:put name="title" value="Tests" direct="true" />
	<tiles:put name="head" direct="true">
			<script type="text/javascript" src="scripts/selectall.js"></script>
		<link rel="stylesheet" href="css/screen.css" media="screen,projection" type="text/css" />
		         <script type="text/javascript" src="taconite-client.js"></script>
         <script type="text/javascript" src="taconite-parser.js"></script>
         <script src="prototype.js" type="text/javascript"></script>
		<script src="rico.js" type="text/javascript"></script>
         <script type="text/javascript">
             function ajax(num) {
                 var ajaxRequest = new AjaxRequest('PostTestVP.do'); //Create AjaxRequest object
				 ajaxRequest.addFormElementsById(num + '_id');
				 ajaxRequest.addFormElementsById(num + '_ajax');
		 		 ajaxRequest.addFormElementsById(num + '_stepstorepeat');
		 		 ajaxRequest.addFormElementsById(num + '_whatyouexpectedtosee');
		 		 ajaxRequest.addFormElementsById(num + '_whatyousawinstead');
		 		 ajaxRequest.addFormElementsById(num + '_debuged');
		 		 ajaxRequest.addFormElementsById(num + '_checked');
		 		 ajaxRequest.addFormElementsById(num + '_creator');
		 		 ajaxRequest.addFormElementsById(num + '_debugger');
		 		 ajaxRequest.addFormElementsById(num + '_summery');
		 		 ajaxRequest.addFormElementsById(num + '_j2eeStory');
		 		 		 		 ajaxRequest.addFormElementsById(num + '_jsp');

				 
				 
				 
                 ajaxRequest.sendRequest();  //Send the request
                 new Rico.Effect.FadeTo( 'message', 1, 100, 4 );
                 document.getElementById('message').innerHTML='Test '+num+' saved';
                 
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
              
              
			function ajaxUpdateTestChecked(num){
                 var ajaxRequest = new AjaxRequest('UpdateTestChecked.do?id=' + num + '&from=AjaxDisplayTests.do'); //Create AjaxRequest object
                 ajaxRequest.sendRequest();  //Send the request
              }
			function ajaxUpdateTestNonChecked(num){
                 var ajaxRequest = new AjaxRequest('UpdateTestNonChecked.do?id=' + num + '&from=AjaxDisplayTests.do'); //Create AjaxRequest object
                 ajaxRequest.sendRequest();  //Send the request
              }
			function ajaxUpdateTestDebuged(num){
                 var ajaxRequest = new AjaxRequest('UpdateTestDebuged.do?id=' + num + '&from=AjaxDisplayTests.do'); //Create AjaxRequest object
                 ajaxRequest.sendRequest();  //Send the request
              }
			function ajaxUpdateTestNonDebuged(num){
                 var ajaxRequest = new AjaxRequest('UpdateTestNonDebuged.do?id=' + num + '&from=AjaxDisplayTests.do'); //Create AjaxRequest object
                 ajaxRequest.sendRequest();  //Send the request
              }
              function removetrofelement(element){
              	var trelement = removetr(element);
              	$(trelement).remove();
              }
         </script>
	</tiles:put>
	<tiles:put name="content" direct="true">
	
<%--${'G'} --%>
<label id="message">${message}</label><br />

<form action="AjaxDisplayTests.do">
story:
                                        <select name="j2eeStory" >
                                        <option value="">all</option>
                                            <c:forEach var="valueLabel" items="${J2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq param.j2eeStory}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                        
                                        debuged:
                                        <select name="debuged" >
                                        <option value="false">false</option>
                                        <option value="all" <c:if test="${param.debuged =='all'}">selected</c:if>>all</option>
                                        <option value="true" <c:if test="${param.debuged == 'true'}">selected</c:if>>true</option>                                        
                                        </select>
                                        
                                        debugger:
                                       <c:choose>
	                                    <c:when test="${empty IntraUsers}">
	                                         <select name="debugger" disabled="disabled"/>
	                                    </c:when>
	                                    <c:otherwise>
	                                        <select   name="debugger"  id="${row.id}_debugger" ><option value=""></option>
	                                            <c:forEach var="valueLabel" items="${IntraUsers}">
	                                            	 <c:choose>
	                                                    <c:when test="${valueLabel.id eq param.debugger}">
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
                                        
                                        <html:submit  value="view"></html:submit>
</form>


	<display:table name="${tests}" id="row" requestURI="AjaxDisplayTests.do"
                            requestURIcontext="false"
                            export="false" sort="list">
<c:if test="${empty param.small}">
	<display:column media="html" sortable="false" title="id">
                        <input type="hidden" name="id" id="${row.id}_id" value="${row.id}" />
                        <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />
                        <input type="hidden" name="j2eeStory" id="${row.id}_j2eeStory" value="${row.j2eeStory.id}" />
                        <a href="ShowTest.do?id=${row.id}">${row.id}</a>
	 <input name="summery" id="${row.id}_summery" value="${row.summery}" onblur="ajax(${row.id})" type="text"/>


	</display:column>
</c:if>
<display:column><input type="button" value="save" onclick="ajax(${row.id});" </display:column>
 <display:column media="html" sortable="true" title="Steps To Repeat">
<textarea name="stepstorepeat" id="${row.id}_stepstorepeat" value="${row.stepstorepeat}" cols="26"  rows="3">${row.stepstorepeat}</textarea>
</display:column>
 <display:column media="html" sortable="true" title="What Expected">
 
 <textarea  name="whatyouexpectedtosee" id="${row.id}_whatyouexpectedtosee" value="${row.whatyouexpectedtosee}" cols="26"  rows="3" >${row.whatyouexpectedtosee}</textarea>
</display:column>

 <display:column media="html" sortable="true" title="What you saw instead">
 <textarea  name="whatyousawinstead" id="${row.id}_whatyousawinstead" value="${row.whatyousawinstead}" cols="26"  rows="3" >${row.whatyousawinstead}</textarea>
</display:column>
 <display:column media="html" sortable="true" title="Done">
 <html:checkbox  property="debuged" name="row" styleId="${row.id}_debuged" ></html:checkbox>
 <c:choose>
  	<c:when test="${row.debuged}">
  		<a  href="#" onclick="ajaxUpdateTestNonDebuged(${row.id});"><p style="font-size:7px">Set NonDebbged</p></a>
	  </c:when>
	  <c:otherwise>
  		<a href="#" onclick="ajaxUpdateTestDebuged(${row.id});" ><p style="font-size:7px">Set Debbged</p></a>
	  </c:otherwise>
 </c:choose>
</display:column>
 <display:column media="html" sortable="true" title="Che<br />cked">
  <html:checkbox  property="checked" name="row" styleId="${row.id}_checked" ></html:checkbox>
  <c:choose>
  	<c:when test="${row.checked}">
  		<a href="#" onclick="ajaxUpdateTestNonChecked(${row.id});" ><p style="font-size:7px">Set NonChecked</p></a>
	  </c:when>
	  <c:otherwise>
	    		<a href="#" onclick="removetrofelement(this);"><p style="font-size:7px">Set Chcked</p></a>

<!--  		<a href="#" onclick="ajaxUpdateTestChecked(${row.id});"><p style="font-size:7px">Set Chcked</p></a>
-->	  </c:otherwise>
 </c:choose>
</display:column>
 <display:column media="html" sortable="true" title="Debbuger">
<nobr>
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="debugger" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select   name="debugger"  id="${row.id}_debugger" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.debugger.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br /></nobr>
</display:column>
                        <c:if test="${empty param.j2eeStory}">
 <display:column media="html" sortable="true" title="Story">
 ${row.j2eeStory.name}
</display:column>
</c:if>


 <display:column media="html" sortable="true" title="jsp">
                                <c:choose>
                                    <c:when test="${empty Jsps}">
                                         <select  name="jsp" disabled="disabled"  id="${row.id}_jsp"  />
                                    </c:when>
                                    <c:otherwise>
<select  name="jsp" id="${row.id}_jsp"><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Jsps}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq row.jsp.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.filename}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.filename}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
</display:column>
<display:column>
<c:if test="${!empty row.asmain}">

<bean:define id="sentence" name="row" property="asmain"></bean:define>
	<bean:define id="nounclause" name="sentence" property="firstobjective">
	</bean:define>
	
	<c:if test="${!empty nounclause}">
	<logic:iterate id="nounUse" name="nounclause" property="ofuse">
	<c:if test="${nounUse.oforder==1}">
	${nounUse.noun.name} : 
		${nounUse.noun.japanese} : 
		${sentence.verb.name}
	</c:if>
	</logic:iterate>
	</c:if>

</c:if>
</display:column>
<display:column>
                        <a href="DeleteTest.do?id=${row.id}">削除</a>
</display:column>
                    </display:table>
</div>

<div>
<span id="title">
	編集
</span>
<span id="subform">

		<form method="GET" action="PostTestVP.do" >
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
                                                    <c:when test="${valueLabel.id eq param.j2eeStory}">
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


                                担当者<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="responsible" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="responsible" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.responsible.id}">
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


再現手順<br />
<textarea name="stepstorepeat">${form.stepstorepeat}</textarea><br />

期待される動作<br />
<textarea name="whatyouexpectedtosee">${form.whatyouexpectedtosee}</textarea><br />

表示内容<br />
<textarea name="whatyousawinstead">${form.whatyousawinstead}</textarea><br />

デバグ済み<br />
<html:checkbox name="form" property="debuged" /><br />

チェック済み<br />
<html:checkbox name="form" property="checked" /><br />

                                作成者<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="creator" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="creator" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.creator.id}">
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


                                デバッグ担当<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="debugger" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="debugger" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.debugger.id}">
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


                                jsp<br />
                                <c:choose>
                                    <c:when test="${empty Jsps}">
                                         <select name="jsp" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="jsp" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Jsps}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.jsp.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.filename}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.filename}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />



          <html:submit value="save" /><br />
		</form>
</span>
                        <a href="Tests.do">新規作成</a>
</tiles:put>			
</tiles:insert>
                        