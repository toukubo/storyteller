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
<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">


    <logic:iterate id="model" name="communitys">
         id
${community.id}
<br/>
コミュニティBBS
<div>
<logic:iterate id="communityThread" name="community" property="communityThreads">id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date<st:date date="${communitycomment.id
${community.id}
<br/>
コミュニティBBS
<div>
<logic:iterate id="communityThread" name="community" property="communityThreads">id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="communitythread.communityComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBS">
<nobr>
${row.communityThread.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
コミュニティ
${communitythread.community}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="community.communityThreads" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBSコメント">
<nobr>
${row.communityComments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミュニティ">
<nobr>
${row.community.id}
</nobr>
</display:column>
                        </display:table>
<br/>
参加
<div>
<logic:iterate id="joining" name="community" property="joinings">id
${joining.id}
<br/>
一般ユーザー
${joining.publicUser}
<br/>
コミュニティ
${joining.community}
<br/>
日付
date<st:date date="${joining.id
${community.id}
<br/>
コミュニティBBS
<div>
<logic:iterate id="communityThread" name="community" property="communityThreads">id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date<st:date date="${communitycomment.id
${community.id}
<br/>
コミュニティBBS
<div>
<logic:iterate id="communityThread" name="community" property="communityThreads">id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="communitythread.communityComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBS">
<nobr>
${row.communityThread.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
コミュニティ
${communitythread.community}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="community.communityThreads" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBSコメント">
<nobr>
${row.communityComments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミュニティ">
<nobr>
${row.community.id}
</nobr>
</display:column>
                        </display:table>
<br/>
参加
<div>
<logic:iterate id="joining" name="community" property="joinings">id
${joining.id}
<br/>
一般ユーザー
${joining.publicUser}
<br/>
コミュニティ
${joining.community}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="community.joinings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミュニティ">
<nobr>
${row.community.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
名前
${community.name}
<br/>
説明
${community.description}
<br/>
日付
date<st:date date="${community.id
${community.id}
<br/>
コミュニティBBS
<div>
<logic:iterate id="communityThread" name="community" property="communityThreads">id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date<st:date date="${communitycomment.id
${community.id}
<br/>
コミュニティBBS
<div>
<logic:iterate id="communityThread" name="community" property="communityThreads">id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="communitythread.communityComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBS">
<nobr>
${row.communityThread.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
コミュニティ
${communitythread.community}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="community.communityThreads" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBSコメント">
<nobr>
${row.communityComments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミュニティ">
<nobr>
${row.community.id}
</nobr>
</display:column>
                        </display:table>
<br/>
参加
<div>
<logic:iterate id="joining" name="community" property="joinings">id
${joining.id}
<br/>
一般ユーザー
${joining.publicUser}
<br/>
コミュニティ
${joining.community}
<br/>
日付
date<st:date date="${joining.id
${community.id}
<br/>
コミュニティBBS
<div>
<logic:iterate id="communityThread" name="community" property="communityThreads">id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date<st:date date="${communitycomment.id
${community.id}
<br/>
コミュニティBBS
<div>
<logic:iterate id="communityThread" name="community" property="communityThreads">id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="communitythread.communityComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBS">
<nobr>
${row.communityThread.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
コミュニティ
${communitythread.community}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="community.communityThreads" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBSコメント">
<nobr>
${row.communityComments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミュニティ">
<nobr>
${row.community.id}
</nobr>
</display:column>
                        </display:table>
<br/>
参加
<div>
<logic:iterate id="joining" name="community" property="joinings">id
${joining.id}
<br/>
一般ユーザー
${joining.publicUser}
<br/>
コミュニティ
${joining.community}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="community.joinings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コミュニティ">
<nobr>
${row.community.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
名前
${community.name}
<br/>
説明
${community.description}
<br/>
日付
date}" /><br/>

    </logic:iterate>



</div>
	</body>
</html:html>

