<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:v="urn:schemas-microsoft-com:vml" xml:lang="ja" lang="ja">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title><tiles:get name="title" /></title>
		<link href="<html:rewrite page="/base.css" />" rel="stylesheet" type="text/css" />
		<script src="<html:rewrite page="/js/prototype.js" />" type="text/javascript"></script>
		<script src="<html:rewrite page="/js/scriptaculous.js" />" type="text/javascript"></script>
		<script src="<html:rewrite page="/js/common.js" />" type="text/javascript"></script>
		<script src="<html:rewrite page="/scripts/lightbox.js" />" type="text/javascript"></script>
		<script src="<html:rewrite page="/scripts/prototype.js" />" type="text/javascript"></script>
		
		<!-- for leightbox -->
		<tiles:get name="head" ignore="true" />
	</head>
	<body onload="common_on_load(); if(window['on_load']){on_load();} return false;" onunload="if(window['on_unload']){ on_unload(); }; return false;">
		<div id="wrapper">
			<div id="header">
				<div id="login_bar">
					<ul>
						<li><html:link page="/Login.do"><html:img page="/images/icons/connect.png" />ログイン</html:link></li>
					</ul>
				</div>
				<h1>Storyteller<span class="subtitle">Storytellers</span></h1>
				<tiles:get name="header" />
			</div>
			<div id="breadcrumb">
				<ul>
					<% if(! request.getRequestURI().substring(request.getContextPath().length()).equals("/") && ! request.getRequestURI().contains("PostTestDetail")) { %>
					<li><html:link page="/">トップ</html:link></li>
					<% } %>
					<tiles:useAttribute name="breadcrumb" />
					<logic:iterate id="item" name="breadcrumb">
						<li><tiles:insert beanName="item" flush="false" /></li>
					</logic:iterate>
					<li class="right"><tiles:get name="title" /></li>
				</ul>
			</div>
			<div id="status">
				<ul>
					<tiles:useAttribute name="status" />
					<logic:iterate id="item" name="status" >
						<tiles:insert beanName="item" flush="false" />
					</logic:iterate>
				</ul>
			</div>
			<div id="content">
				<table class="layout">
				<tbody>
				<% if(! request.getRequestURI().contains("PostTestDetail")) {%>
				<tr> 
					<td colspan="2">
						<div id="title_bar">
							<h1><tiles:get name="title" /></h1>
						</div>
						
						<div id="menu_bar">
							<ul>
								<c:if test="${empty a}">
									<li>
										<div><html:link page="/"><html:img page="/images/icons/house.png" />トップ</html:link></div>
										
										</dl>
									</li>
								</c:if>
								
									<li>									
												<div><html:link page="/J2eeStorys.do"><html:img page="/images/icons/house.png" />Story</html:link></div>
												<dl>
														<dd><html:link page="/J2eeStorys.do">Storys</html:link></dd>
														<dd><html:link page="/PostJ2eeStoryDetail.do">new Story</html:link></dd>
												</dl>
									</li>
									<li>
										<div><html:link page="/Verbs.do"><html:img page="/images/icons/user_green.png" />Verb</html:link></div>
										<dl>
											<dd><html:link page="/Verbs.do">verbs</html:link></dd>
											<dd><html:link page="/VerbDetail.do">new Verb</html:link></dd>
	<%--										<dt>管理</dt>
	--%><%--										<dd><html:link page="/">Category</html:link></dd>
	--%>									</dl>
									</li>
									<li>
										<div><html:link page="/PostStaticDataDetail.do?id=1"><html:img page="/images/icons/information.png" />一般設定</html:link></div>
									</li>
									<li>
										<div><html:link page="/Tools.do"><html:img page="/images/icons/package_green.png" />Tools</html:link></div>
										<dl>
											<dd><html:link page="/Tools.do">Tools</html:link></dd>
										</dl>
									</li>					
									<li>
										<div><html:link page="/Tests.do"><html:img page="/images/icons/bug.png" />Tests</html:link></div>
										<dl>
											<dd><html:link page="/Tests.do">Tests</html:link></dd>
											<dd><html:link page="/PostTestDetail.do">Post a Test</html:link></dd>
										</dl>
									</li>				
							</ul>
						</div>						
					</td>
				</tr>
				<% } %>
				<tr>
					<td class="left">
						<div class="col">
							<tiles:get name="content" />
						</div>
						<div class="bottom">&nbsp;</div>
					</td>
					<td class="right">
						<div class="side">
							<tiles:get name="side" />
						</div>
					</td>
				</tr>
				</tbody>
				</table>
			</div>
			<div id="footer">
				<tiles:get name="footer" />
				<p>&copy; 2010 Storytellers 株式会社</p>
			</div>
		</div>
	</body>
</html>
