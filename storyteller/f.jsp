<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%@taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>
<%@ page import="java.util.*" %>
<%@ page import="jp.estimate.model.*" %>

<div id="systemHeader">
<span id="menu">
              
					<a href="AjaxDisplayTests.do">テスト＝バグ</a>
					<a href="AjaxDisplayTasks.do">タスク</a>
					
					<a href="AjaxDisplayIntraUsers.do">IntraUser</a>
					<a href="Estimations.do">見積</a>
					<a href="AjaxDisplayTaskTemplates.do">タスクテンプレート</a>
					<a href="AjaxDisplayBusinessCosts.do">BusinessCost</a>
					<a href="AjaxDisplayClients.do">Client</a>
					<a href="AjaxDisplayCommonCosts.do">Common Cost</a>
					<a href="AjaxDisplayContributes.do">Contributes</a>
					<a href="AjaxDisplayContributionTypes.do">Contribution type</a>
					<a href="AjaxDisplayProfitDividients.do">利益分配</a>
					<a href="AjaxDisplayStorytellerRoles.do">ロール</a>
</span>               
	<div id="systemPane" style="display:none;background-color:#036;line-height:2.8em;" >
	
	<div style="float: left; display: block; margin:0 12px 6px 0; width: 400px;background-color:#036;">
	<span class="title">Verbs</span><br>
	<a href="VerbDetail.do">new Verb</a>
	
	
	<a href="SystemCreatesNonnsAndAttrsFromCoreJarOfJ2eeStorys.do">get nouns and attrs from core jar</a><br /><br />
	<a href="Sentenses.do?gen=true">SENTENCE generate mode </a>	<br />

	
</div><!-- close system header -->


