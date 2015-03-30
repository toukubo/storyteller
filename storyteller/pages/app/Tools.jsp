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

<tiles:insert definition=".layout">
	<tiles:put name="title" value="Tools" direct="true" />
	<tiles:put name="content" direct="true">
<p>		
<%--	<a href="javascript:location.href='http://localhost:8080/bugtracker/PostTestDetail.do;'">bookmarklet to post a test</a>--%>
<%--	<a href="javascript:location.href='http://localhost:8080/bugtracker/PostTestDetail.do?story='+(function () {var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');story=arrayHttpUrl[3];return(story);})()+'&modifiedfilename='+(function () {var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');absName=arrayHttpUrl[arrayHttpUrl.length-1].split('.');fileName=absName[0];return(fileName);})()">bookmarklet to post a test</a>--%>
<%--<a href="javascript:location.href='http://storytellermachine.net/storyteller/PostTestDetail.do?story='+(function () {
	var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');story=arrayHttpUrl[3];
	return(story);
	}
	)()+'&modifiedfilename='+(function () {
	var httpurl=location.href; var arrayHttpUrl=httpurl.split('/');
	absName=arrayHttpUrl[arrayHttpUrl.length-1].split('.');
	fileName=absName[0];
	return(fileName);
	}
	)()+'.*'">bookmarklet to post a test</a>
--%>	
<a href="javascript:var testWin=window.open('http://localhost:8080/storyteller/PostTestDetail.do?story='+(function%20(){var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');story=arrayHttpUrl[3];return(story);})()+'&modifiedfilename='+(function%20()%20{var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');absName=arrayHttpUrl[arrayHttpUrl.length-1].split('.');fileName=absName[0];return(fileName);})()+'.*'+'&responsible='+(function%20()%20{var%20httpurl=location.href;%20var%20arrayHttpUrl=httpurl.split('/');story1=arrayHttpUrl[3];cookies=document.cookie;%20var%20nameEQ=story1+'=';var%20ca%20=%20cookies.split(';');%20for(var%20i=0;i%3Cca.length;i++)%20{var%20c=ca[i];while(c.charAt(0)=='%20')%20{c%20=%20c.substring(1,c.length);}%20if%20(c.indexOf(nameEQ)%20==%200)%20return(c.substring(nameEQ.length,c.length));%20}%20return%20null;})()+'&whatyousawinstead='+(function G(e){var oe = (navigator.appName=='Netscape' && parseInt(navigator.appVersion)>=4); var goodthing ='';goodthing=document.onmouseup = (oe==true?window.getSelection():document.selection.createRange().text);document.captureEvents(Event.MOUSEUP);if(goodthing!='') {return goodthing;}return '';})(),%20'height=500,width=200')">bookmarklet to post a test(for safari browser)</a>	
</p>
<p>

	<a href="bugtracker-plugin/bugtracker-plugin.zip">download bugtracker-plugin.zip</a>
</p>
	</tiles:put>
</tiles:insert>
