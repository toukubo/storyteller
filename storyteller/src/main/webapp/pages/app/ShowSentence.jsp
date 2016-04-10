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
<bean:define id="nounclause" name="sentence" property="firstobjective"></bean:define>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="センテンス" direct="true" />
	<tiles:put name="content" direct="true">


<h1>Sentence:${sentence.verb.name} 
	<logic:iterate id="nounUse" name="nounclause" property="ofuse">
	<c:if test="${nounUse.oforder==1}">
	${nounUse.noun.name}
	</c:if>
	</logic:iterate>
${sentence.name} </h1>
project :<a href="J2eeStoryDetail.do?id=${sentence.j2eeStory.id}"> ${sentence.j2eeStory.name}</a><br>
###########################################<br />
<a href="CreatesStrutsActionsFromSentence.do?id=${sentence.id}&from=ShowSentence">この文のコードを再書き出し=regenerate codes of this sentence</a><br>
###########################################<br />

<h3>Assign Valiation Rules</h3>

	<logic:iterate id="nounUse" name="nounclause" property="ofuse">
	<c:if test="${nounUse.oforder==1}">
	<table><tr>
		<td width="150">	${nounUse.noun.name}	</td>
		<td>
			<c:choose>
				<c:when test="${!empty nounUse.attrUses}">
				<logic:iterate id="attrUse" name="nounUse" property="attrUses">
					${attrUse.attr.name}
				<br>
				
				
				<table><tr>
				<td width="100" valign="top">
				<logic:iterate id="validationRuleChoise" name="attrUse" property="validationRuleChoises">
				<a href="DeleteValidationRuleChoise.do?id=${validationRuleChoise.id}">${validationRuleChoise.validationRule.name}解除→</a>
				</logic:iterate>
				</td>
				<td width="5">&nbsp;</td>
				<td valign="top">
				<logic:iterate id="validationRule" name="ValidationRules">
				<a href="ValidationRuleChoiseVp.do?validationRule=${validationRule.id}&attrUse=${attrUse.id}">←${validationRule.name}のバリデーションルールをアサイン。</a><br>
				
				
				</logic:iterate>
				</td>
				</tr></table>
				</logic:iterate>
				</c:when>
				<c:otherwise>	
				All
				</c:otherwise>
			</c:choose>
				<c:if test="${row.verb.name == 'Post' || row.verb.name == 'Display'}">
				<hr />
				<bean:define id="noun" name="nounUse" property="noun"></bean:define>
					<logic:iterate id="attr" name="noun" property="attrs">
							${attr.name}aaa
					</logic:iterate>
				</c:if>
		</c:if>
		</logic:iterate>
		</td>
	</tr></table>
	<hr />
	<h2>Codes of this Sentence</h2>
	             <h3>######    Struts Actions (.java) s######</h3><br />
	<display:table id="row" name="${sentence.strutsActions}">
	<display:column>
	<textarea cols="120" rows="30" style="font-size: 8pt">${row.code}</textarea>
	</display:column>
	<display:column><a href="output/${sentence.j2eeStory.name}/${row.filename}">download as file</a></display:column>
	</display:table>
	
	
             <h3>######    JSPs   ######</h3><br />
	<display:table id="row" name="${sentence.jsps}">
		<display:column>
			<textarea cols="120" rows="30"  style="font-size:8pt">${row.code}</textarea>
		</display:column>

		<display:column><a href="output/${sentence.j2eeStory.name}/pages/${row.filename}">download as file</a></display:column>
	</display:table>
	
	</tiles:put>
</tiles:insert>


