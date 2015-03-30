

















	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS"/>
		<title></title>
		
<link href="base.css" rel="stylesheet" type="text/css">
<script src="calendarlay3.js" language="JavaScript"></script>
	</head>
	<body>
		<tiles:insert page="/menu.jsp"/>

                <c:if test="${!empty manageableForm.manageableList}">
                    <display:table name="${manageableForm.manageableList}" id="row" requestURI="${pageContext.request.requestURI}" requestURIcontext="false" export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                            <nobr>
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields('&lt;formatting:escape language=" javascript&quot;&gt;${row.id}&lt;/formatting:escape&gt;','&lt;formatting:escape language="javascript" &gt;${row.j2eeStory}&lt;/formatting:escape&gt;','&lt;formatting:escape language="javascript"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf" property="j2eeStory" titleKey="sentence.j2ee.story"/>
                        <display:column media="html" headerClass="j2eeStory" paramId="j2eeStory" maxLength="36" sortProperty="j2eeStory" sortable="true" titleKey="sentence.j2ee.story"><nobr>${row.j2eeStory}</nobr></display:column>
                        <display:column media="xml csv excel pdf" property="verb" titleKey="sentence.verb"/>
                        <display:column media="html" headerClass="verb" paramId="verb" maxLength="36" sortProperty="verb" sortable="true" titleKey="sentence.verb"><nobr>${row.verb}</nobr></display:column>
                    </display:table>
                </c:if>
	</body></html>