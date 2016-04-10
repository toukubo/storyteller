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
	<tiles:put name="title" value="Sentences" direct="true" />
	<tiles:put name="content" direct="true">
            <div id="manageableList" class="table">
                <c:if test="${!empty sentences}">
                    <display:table name="${sentences}" id="row" requestURI="Sentenses.do"
                            requestURIcontext="false"
                            export="true" pagesize="200" sort="list">
                        <display:column media="html" sortable="false">
                        <c:choose>
                        <c:when test="${empty param.gen}">
                            <a href="SentenceDetail.do?id=${row.id}">☆</a>
	                    </c:when>
                        <c:otherwise>
                        	<a href="CreatesStrutsActionsFromSentence.do?id=${row.id}">Generate</a>
                        </c:otherwise>
                        </c:choose>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="strutsConfigCode"
                            titleKey="sentence.struts.config.code"/>
                        <display:column media="html"
                            headerClass="strutsConfigCode" paramId="strutsConfigCode" maxLength="36"
                            sortProperty="strutsConfigCode" sortable="true"
                            titleKey="sentence.struts.config.code"><nobr>${row.strutsConfigCode} </nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="j2eeStory"
                            titleKey="sentence.j2ee.story"/>
                        <display:column media="html"
                            headerClass="j2eeStory" paramId="j2eeStory" maxLength="36"
                            sortProperty="j2eeStory" sortable="true"
                            titleKey="sentence.j2ee.story"><nobr>${row.j2eeStory.name}</nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="firstobjective"
                            titleKey="sentence.firstobjective"/>
                        <display:column media="html"
                            headerClass="firstobjective" paramId="firstobjective" maxLength="2000"
                            sortProperty="firstobjective" sortable="true"
                            titleKey="sentence.firstobjective"><bean:define id="nc" name="row" property="firstobjective" />
                            <logic:iterate id="u" name="nc" property="ofuse">
                            ${u.noun.name}
                            </logic:iterate>

</display:column>
                        <display:column media="xml csv excel pdf"
                            property="verb"
                            titleKey="sentence.verb"/>
                        <display:column media="html"
                            headerClass="verb" paramId="verb" maxLength="36"
                            sortProperty="verb" sortable="true"
                            titleKey="sentence.verb"><nobr>${row.verb.name}</nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="secountobjective"
                            titleKey="sentence.secountobjective"/>
                        <display:column media="html"
                            headerClass="secountobjective" paramId="secountobjective" maxLength="36"
                            sortProperty="secountobjective" sortable="true"
                            titleKey="sentence.secountobjective"><nobr>${row.secountobjective}</nobr></display:column>
                    </display:table>
                </c:if>
            </div>

</tiles:put>			
</tiles:insert>
