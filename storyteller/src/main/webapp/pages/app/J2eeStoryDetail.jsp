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
	<tiles:put name="title" value="Sentences of J2eeStory : ${j2eestory.name}" direct="true" />
	<tiles:put name="content" direct="true">
<form action="SentenceVP.do">
<b>New Sentence</b><br />
<input type="hidden" name="j2eeStory" value="${j2eestory.id}" />
sentence:(verb objective adverb)
<c:choose>
                                    <c:when test="${empty Verbs}">
                                        <select name="verb" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="verb" >
                                            <option value=""></option>
                                            <c:forEach var="valueLabel" items="${Verbs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq sentence.verb.id}">
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

                                <c:choose>
                                    <c:when test="${empty Nouns}">
                                        <select name="firstobjective" disabled="disabled" />
                                    </c:when>
                                    <c:otherwise>
                                        <select name="firstobjective" >
                                            <option value=""></option>
                                            <c:forEach var="valueLabel" items="${Nouns}">
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>

                                <c:choose>
                                    <c:when test="${empty Nouns}">
                                        <select name="secountobjective" disabled="disabled" />
                                    </c:when>
                                    <c:otherwise>
                                        <select name="secountobjective">
                                            <option value=""></option>
                                            <c:forEach var="valueLabel" items="${Nouns}">
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
								
name:<input type="text" name="name" />
<html:submit />
</form>
<br />
<b>narrow with verb:</b><br />
	<logic:iterate id="verb" name="Verbs">
	<a href="J2eeStoryDetail.do?id=${param.id}&verb=${verb.id}">${verb.name}</a>&nbsp;
	</logic:iterate>
<br />
<b>narrow with noun:</b><br />
	<c:if test="${!empty Nouns}">
	<logic:iterate id="noun" name="Nouns" >
	<a href="J2eeStoryDetail.do?id=${param.id}&noun=${noun.id}">${noun.name}</a>&nbsp;
	</logic:iterate>
	</c:if>
	
	
<display:table name="${Sentences}" id="row"  width="95%">
	<display:column title="verb"  width="30">${row.verb.name}</display:column>
	<display:column title="Fist Objective" width="73%">
	<bean:define id="nounclause" name="row" property="firstobjective">
	</bean:define>
	<logic:iterate id="nounUse" name="nounclause" property="ofuse">
	<c:if test="${nounUse.oforder==1}">
	<table><tr><td width="40" id="aiueo">
		${nounUse.noun.name}
	</td>
	<td >
			<c:choose>
				<c:when test="${!empty nounUse.attrUses}">
				<logic:iterate id="attrUse" name="nounUse" property="attrUses">
				<a href="DeleteAttrUse.do?id=${attrUse.id}" id="aiueo">
					${attrUse.attr.name}
				</a>	
				</logic:iterate>
				</c:when>
				<c:otherwise>
				<span id="aiueo">
				All
				</span>
				</c:otherwise>
			</c:choose>
			</td><td><-></td><td width="80%">
				<bean:define id="noun" name="nounUse" property="noun"></bean:define>
					<logic:iterate id="attr" name="noun" property="attrs">
						<a href="AttrUseVP.do?attr=${attr.id}&nounUse=${nounUse.id}" id="aiueo">
							${attr.name} &nbsp;
						</a>
					</logic:iterate>
	</c:if>
	</logic:iterate>
	</td>
	</tr></table>
	</display:column>
	
	
	<!-- First Objective                                        -->
	<display:column title="Secound Objective">
	<c:if test="${!empty row.secountobjective}">
		<bean:define id="nounclause" name="row" property="secountobjective">
		</bean:define>
		<logic:iterate id="nounUse" name="nounclause" property="ofuse">
		<c:if test="${nounUse.oforder==1}">
		${nounUse.noun.name}
		</c:if>
		</logic:iterate>
	</c:if>
	</display:column>

	<display:column title="Adverb" width="40">
	<a href="ShowSentence.do?id=${row.id}">
		${row.name}
	</a>
	</display:column>

	
	<display:column title="処理">
	<a href="CreatesStrutsActionsFromSentence.do?id=${row.id}">re genration</a>
	<br />
	<c:if test="${empty param.noop}">
	<a href="ShowSentence.do?id=${row.id}">Edit</a>
	<br />
	<c:if test="${!empty param.del}">
	<a href="DeleteSentence.do?id=${row.id}">削除</a>
	</c:if>
	</c:if>
	</display:column>
	
	
</display:table>
</tiles:put>			
</tiles:insert>
 