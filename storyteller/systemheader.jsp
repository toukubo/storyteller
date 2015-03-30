<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>
<%@ page import="java.util.*" %>
<%@ page import="jp.estimate.model.*" %>

<div id="systemHeader">
<span id="menu">

              
               		<a href="J2eeStorys.do">Stories</a>
			    	<a href="J2eeStoryDetail.do">new Story</a>
			    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			    	
                 	<a href="Verbs.do">Verbs</a>
                	<a href="VerbDetail.do">new verb</a>
                	<a href="ValidationRules.do">validation rules</a>
					<a href="CommonTranslations.do">CommonTranslations</a>
					
					
               <a href="#" onclick="new Effect.toggle($('systemPane'),'blind')" title="header pane">Menu!</a>
</span>               
	<div id="systemPane" style="display:none;background-color:#036;line-height:2.8em;" >
	
	<div style="float: left; display: block; margin:0 12px 6px 0; width: 400px;background-color:#036;">
	<span class="title">Verbs</span><br>
	<a href="VerbDetail.do">new Verb</a>
	
	
	<a href="SystemCreatesNonnsAndAttrsFromCoreJarOfJ2eeStorys.do">get nouns and attrs from core jar</a><br /><br />
	<a href="Sentenses.do?gen=true">SENTENCE generate mode </a>	<br />

               		<a href="Nouns.do">Nouns</a>	<br />
               		<a href="NounDetail.do">new Noun</a>-	<br />
               		
              		<a href="NounClauses.do">Noun Clauses</a>	<br />
					<a href="NewNounClause.do">Add Noun Clause</a>	<br />
               		<a href="Sentenses.do">Sentenses</a><br />
					<a href="SentenceDetail.do">Add Sentence</a>	<br />
					
					<a href="J2eeStorys.do?export=true">J2eeStorys  xls </a>
					
					
					
<hr />	
<span class="title">統計</span><br>
<span class="title">Tools</span><br>
<p>		
<%--	<a href="javascript:location.href='http://localhost:8080/bugtracker/PostTestDetail.do;'">bookmarklet to post a test</a>--%>
<%--	<a href="javascript:location.href='http://localhost:8080/bugtracker/PostTestDetail.do?story='+(function () {var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');story=arrayHttpUrl[3];return(story);})()+'&modifiedfilename='+(function () {var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');absName=arrayHttpUrl[arrayHttpUrl.length-1].split('.');fileName=absName[0];return(fileName);})()">bookmarklet to post a test</a>--%>
<%--<a href="javascript:window.open('http://localhost:8080/storyteller/PostTestDetail.do?story='+(function (){var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');story=arrayHttpUrl[3];return(story);})()+'&modifiedfilename='+(function () {var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');absName=arrayHttpUrl[arrayHttpUrl.length-1].split('.');fileName=absName[0];return(fileName);})()+'.*'+'&responsible='+(function () {var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');story1=arrayHttpUrl[3];cookies=document.cookie; var nameEQ=story1+'=';var ca = cookies.split(';'); for(var i=0;i<ca.length;i++) {var c=ca[i];while(c.charAt(0)=='%20') {c = c.substring(1,c.length);} if (c.indexOf(nameEQ) == 0) return(c.substring(nameEQ.length,c.length)); } return null;})(), 'height=500,width=200')">bookmarklet to post a test</a>--%>
<a href="javascript:var testWin=window.open('http://localhost:8080/storyteller/PostTestDetail.do?story='+(function%20(){var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');story=arrayHttpUrl[3];return(story);})()+'&modifiedfilename='+(function%20()%20{var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');absName=arrayHttpUrl[arrayHttpUrl.length-1].split('.');fileName=absName[0];return(fileName);})()+'.*'+'&responsible='+(function%20()%20{var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');story1=arrayHttpUrl[3];cookies=document.cookie;%20var%20nameEQ=story1+'=';var%20ca%20=%20cookies.split(';');%20for(var%20i=0;i%3Cca.length;i++)%20{var%20c=ca[i];while(c.charAt(0)=='%20')%20{c%20=%20c.substring(1,c.length);}%20if%20(c.indexOf(nameEQ)%20==%200)%20return(c.substring(nameEQ.length,c.length));%20}%20return%20null;})()+'&whatyousawinstead='+(function G(e){var oe = (navigator.appName=='Netscape' && parseInt(navigator.appVersion)>=4); var goodthing ='';goodthing=document.onmouseup = (oe==true?window.getSelection():document.selection.createRange().text);document.captureEvents(Event.MOUSEUP);if(goodthing!='') {return goodthing;}return '';})(),%20'height=500,width=200')">bookmarklet to post a test(for safari browser)</a>
</p>
<p>
<%--javascript:var testWin=window.open('http://localhost:8080/storyteller/PostTestDetail.do?story='+(function%20(){var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');story=arrayHttpUrl[3];return(story);})()+'&modifiedfilename='+(function%20()%20{var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');absName=arrayHttpUrl[arrayHttpUrl.length-1].split('.');fileName=absName[0];return(fileName);})()+'.*'+'&responsible='+(function%20()%20{var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');story1=arrayHttpUrl[3];cookies=document.cookie;%20var%20nameEQ=story1+'=';var%20ca%20=%20cookies.split(';');%20for(var%20i=0;i%3Cca.length;i++)%20{var%20c=ca[i];while(c.charAt(0)=='%20')%20{c%20=%20c.substring(1,c.length);}%20if%20(c.indexOf(nameEQ)%20==%200)%20return(c.substring(nameEQ.length,c.length));%20}%20return%20null;})()+'&whatyousawinstead='+(function G(e){var oe = (navigator.appName=='Netscape' && parseInt(navigator.appVersion)>=4); var goodthing ='';goodthing=document.onmouseup = (oe==true?window.getSelection():document.selection.createRange().text);document.captureEvents(Event.MOUSEUP);if(goodthing!='') {return goodthing;}return '';})(),%20'height=500,width=200')--%>
	<a href="bugtracker-plugin/bugtracker-plugin.zip">download bugtracker-plugin.zip</a>
</p>
</div>

<div style="float: left; display: block; margin:0 12px 6px 0; width: 400px;background-color:#036;">

					<a href="AccountSnapshots.do">Accounts snapshots</a>
					<a href="BasecampAccounts.do">Basecamp Accounts</a>
					<a href="BasecampProjects.do">Basecamp projects</a>
					<a href="AccountSnapshots.do">Account Snapshots</a>
					<a href="Estimations.do">見積</a>
					<a href="AjaxDisplayIntraUsers.do">IntraUser</a>
					<a href="AjaxDisplayBusinessCosts.do">BusinessCost</a>
					<a href="AjaxDisplayClients.do">Client</a>
					<a href="AjaxDisplayCommonCosts.do">Common Cost</a>
					<a href="AjaxDisplayContributes.do">Contributes</a>
					<a href="AjaxDisplayContributionTypes.do">Contribution type</a>
					<a href="AjaxDisplayProfitDividients.do">利益分配</a>
					<a href="AjaxDisplayStorytellerRoles.do">ロール</a>
					<a href="AjaxDisplayTaskTemplates.do">タスクテンプレート</a>
					<a href="AjaxDisplayTasks.do">タスク</a>
					<a href="AjaxDisplayTests.do">テスト＝バグ</a>

	<br>
</div>	
	</div><br>
</div><!-- close system header -->


