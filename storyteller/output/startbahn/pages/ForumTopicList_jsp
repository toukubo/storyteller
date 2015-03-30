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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 
<%@ page isELIgnored="false" %>
<tiles:insert definition=".publicLayout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">
	
	

    <logic:iterate id="forumTopic" name="forumTopics">
         id
${forumtopic.id}
<br/>
forumComments
<div>
<logic:iterate id="forumComment" name="forumtopic" property="forumComments">id
${forumcomment.id}
<br/>
一般ユーザー
${forumcomment.publicUser}
<br/>
forumTopic
${forumcomment.forumTopic}
<br/>
タイトル
${forumcomment.title}
<br/>
説明
${forumcomment.description}
<br/>
日付
date<st:date date="${forumcomment.id
${forumtopic.id}
<br/>
forumComments
<div>
<logic:iterate id="forumComment" name="forumtopic" property="forumComments">id
${forumcomment.id}
<br/>
一般ユーザー
${forumcomment.publicUser}
<br/>
forumTopic
${forumcomment.forumTopic}
<br/>
タイトル
${forumcomment.title}
<br/>
説明
${forumcomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="forumtopic.forumComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="forumTopic">
<nobr>
${row.forumTopic.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
topicBookmarkings
<div>
<logic:iterate id="topicBookmarking" name="forumtopic" property="topicBookmarkings">id
${topicbookmarking.id}
<br/>
一般ユーザー
${topicbookmarking.publicUser}
<br/>
forumTopic
${topicbookmarking.forumTopic}
<br/>
日付
date<st:date date="${topicbookmarking.id
${forumtopic.id}
<br/>
forumComments
<div>
<logic:iterate id="forumComment" name="forumtopic" property="forumComments">id
${forumcomment.id}
<br/>
一般ユーザー
${forumcomment.publicUser}
<br/>
forumTopic
${forumcomment.forumTopic}
<br/>
タイトル
${forumcomment.title}
<br/>
説明
${forumcomment.description}
<br/>
日付
date<st:date date="${forumcomment.id
${forumtopic.id}
<br/>
forumComments
<div>
<logic:iterate id="forumComment" name="forumtopic" property="forumComments">id
${forumcomment.id}
<br/>
一般ユーザー
${forumcomment.publicUser}
<br/>
forumTopic
${forumcomment.forumTopic}
<br/>
タイトル
${forumcomment.title}
<br/>
説明
${forumcomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="forumtopic.forumComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="forumTopic">
<nobr>
${row.forumTopic.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
topicBookmarkings
<div>
<logic:iterate id="topicBookmarking" name="forumtopic" property="topicBookmarkings">id
${topicbookmarking.id}
<br/>
一般ユーザー
${topicbookmarking.publicUser}
<br/>
forumTopic
${topicbookmarking.forumTopic}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="forumtopic.topicBookmarkings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="forumTopic">
<nobr>
${row.forumTopic.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
タイトル
${forumtopic.title}
<br/>
説明
${forumtopic.description}
<br/>
日付
date<st:date date="${forumtopic.id
${forumtopic.id}
<br/>
forumComments
<div>
<logic:iterate id="forumComment" name="forumtopic" property="forumComments">id
${forumcomment.id}
<br/>
一般ユーザー
${forumcomment.publicUser}
<br/>
forumTopic
${forumcomment.forumTopic}
<br/>
タイトル
${forumcomment.title}
<br/>
説明
${forumcomment.description}
<br/>
日付
date<st:date date="${forumcomment.id
${forumtopic.id}
<br/>
forumComments
<div>
<logic:iterate id="forumComment" name="forumtopic" property="forumComments">id
${forumcomment.id}
<br/>
一般ユーザー
${forumcomment.publicUser}
<br/>
forumTopic
${forumcomment.forumTopic}
<br/>
タイトル
${forumcomment.title}
<br/>
説明
${forumcomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="forumtopic.forumComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="forumTopic">
<nobr>
${row.forumTopic.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
topicBookmarkings
<div>
<logic:iterate id="topicBookmarking" name="forumtopic" property="topicBookmarkings">id
${topicbookmarking.id}
<br/>
一般ユーザー
${topicbookmarking.publicUser}
<br/>
forumTopic
${topicbookmarking.forumTopic}
<br/>
日付
date<st:date date="${topicbookmarking.id
${forumtopic.id}
<br/>
forumComments
<div>
<logic:iterate id="forumComment" name="forumtopic" property="forumComments">id
${forumcomment.id}
<br/>
一般ユーザー
${forumcomment.publicUser}
<br/>
forumTopic
${forumcomment.forumTopic}
<br/>
タイトル
${forumcomment.title}
<br/>
説明
${forumcomment.description}
<br/>
日付
date<st:date date="${forumcomment.id
${forumtopic.id}
<br/>
forumComments
<div>
<logic:iterate id="forumComment" name="forumtopic" property="forumComments">id
${forumcomment.id}
<br/>
一般ユーザー
${forumcomment.publicUser}
<br/>
forumTopic
${forumcomment.forumTopic}
<br/>
タイトル
${forumcomment.title}
<br/>
説明
${forumcomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="forumtopic.forumComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="forumTopic">
<nobr>
${row.forumTopic.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
topicBookmarkings
<div>
<logic:iterate id="topicBookmarking" name="forumtopic" property="topicBookmarkings">id
${topicbookmarking.id}
<br/>
一般ユーザー
${topicbookmarking.publicUser}
<br/>
forumTopic
${topicbookmarking.forumTopic}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="forumtopic.topicBookmarkings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="forumTopic">
<nobr>
${row.forumTopic.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
タイトル
${forumtopic.title}
<br/>
説明
${forumtopic.description}
<br/>
日付
date}" /><br/>

    </logic:iterate>




	</tiles:put>
</tiles:insert>


