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


<%--<html:html>
<tiles:insert page="/h.jsp"/>--%>
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
	         		 //alert('G');
	         		 
	                 var ajaxRequest = new AjaxRequest('PostNounVPAboutJapanese.do'); //Create AjaxRequest object
	                
					 ajaxRequest.addFormElementsById(num + '_id');
					 ajaxRequest.addFormElementsById(num + '_ajax');		 		
			 		 ajaxRequest.addFormElementsById(num + '_japanese');	    	 		 
	
			        
	          		 ajaxRequest.sendRequest();  //Send the request
	                 new Rico.Effect.FadeTo( 'message', 1, 100, 4 );
	                 document.getElementById("message").innerHTML="";
	                 new Rico.Effect.FadeTo( 'message',0,3000,10, {complete:function() {}} );
	         }
	         
	     	function ajax1(num) {
					 //alert('G');
	                 var ajaxRequest = new AjaxRequest('PostAttrVPAboutJapanese.do'); //Create AjaxRequest object
	                
					 ajaxRequest.addFormElementsById(num + '_attrid');
					 ajaxRequest.addFormElementsById(num + '_ajax');		 		
			 		 ajaxRequest.addFormElementsById(num + '_nihongo');	    	 		 
				       
	          		 ajaxRequest.sendRequest();  //Send the request
	                 new Rico.Effect.FadeTo( 'message', 1, 100, 4 );
	                 document.getElementById("message").innerHTML="";
	                 new Rico.Effect.FadeTo( 'message',0,3000,10, {complete:function() {}} );
	     	
	     	}
         </script>
	</tiles:put>
	<tiles:put name="content" direct="true">
                <br>
                                <c:if test="${!empty j2eeStory.nouns}">
                <a href="UpdateNamesOfAttrsAJ2eeProjectsFromCommonTranslations.do?id=${j2eeStory.id}">日本語自動割当（japananese of each attrs will be auto assign from commont trasnlation)</a><br />
                
                    <display:table name="${Nouns}" id="row" requestURI="/J2eeStorys.do"
                            requestURIcontext="false"
                            export="true" pagesize="100" >
                        <display:column media="html"
                            headerClass="name" paramId="name"
                            sortProperty="name" 
                            title="noun.name">${row.name}
                            <c:choose>
                            <c:when test="${empty param.xls}">
			                            <c:if test="${empty row.attrs}">
			                            <a href="DeleteNoun.do?id=${row.id}">
			                            削除
			                            </a>
			                            </c:if>
	                            
<%--	                            		<form method="POST" action="PostNounVPAboutJapanese.do">
								          <html:hidden name="row" property="id"/>--%>
								          <input type="hidden" name="id" id="${row.id}_id" value="${row.id}"/>
								          <input type="hidden" name="ajax" id="${row.id}_ajax" value="true" />
													日本語<br />
													<%--<html:text name="row" property="japanese" />--%>
													<input type="text" name="japanese" id="${row.id}_japanese" value="${row.japanese}"/><br />
								<input type="button" value="☆" onclick="ajax(${row.id});" />
								<%--<html:submit value="☆"/>--%>								          
										</form>
                            </c:when>
                            <c:otherwise>
	                            ${row.japanese}
                            </c:otherwise>
                            </c:choose>
	                     </display:column>
                        <display:column media="xml csv excel pdf"
                            property="attrs"
                            title="noun.attrs"/>
                        <display:column media="html"
                            headerClass="attrs" paramId="attrs" 
                            sortProperty="attrs" 
                            title="noun.attrs">
                            <table>
                            <logic:iterate id="attr" name="row" property="attrs">
                            <c:if test="${empty param.xls}">
	                            </c:if>							          
	    					 <tr><td height="10">
                            ${attr.name} 
                            </td>
                            <td height="10">
                            <nobr>
    	    	            <c:choose>
	                            <c:when test="${empty param.xls}">
			                            <%--<input type="hidden"name="id" value="${attr.id}"/>--%>
										<input type="hidden" name="id" id="${attr.id}_attrid" value="${attr.id}"/>
								        <input type="hidden" name="ajax" id="${attr.id}_ajax" value="true" />										
										<%--<html:text name="attr" property="japanese" size="10"/>--%>
										<input type="text" name="japanese" id="${attr.id}_nihongo" value="${attr.japanese}" size="10"/>
							          <%--<html:submit value="★" />--%>
							          <input type="button" value="☆" onclick="ajax1(${attr.id});" />
        			            </c:when>
                            <c:otherwise>
                            ${attr.japanese}
	                        </c:otherwise>
                            </c:choose>
	    
								</nobr>
            			          </td>
            			          <td>${attr.classtype}</td>
            			          <td>
                            <c:if test="${empty param.xls}">
            			          								<a href="DeleteAttr.do?id=${attr.id}">削除</a>
            			      </c:if>
            			          </td>
							</tr>
                            <c:if test="${empty param.xls}">
						</c:if>
								
			                </logic:iterate>
							</table>
                            </display:column>
   
                    </display:table>
                </c:if>
                
<hr>

</tiles:put>			
</tiles:insert>
                  
                  <%--
</html:html>
--%>
