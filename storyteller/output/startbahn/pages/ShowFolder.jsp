<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 

<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div>
id
${folder.id}
<br/>
語
${folder.word}
<br/>
一般ユーザー
${folder.publicUser}
<br/>
コンセプト
${folder.concept}
<br/>
制作期間
productionspan<st:date date="${folder.id
${folder.id}
<br/>
語
${folder.word}
<br/>
一般ユーザー
${folder.publicUser}
<br/>
コンセプト
${folder.concept}
<br/>
制作期間
productionspan}" /><br/>
掛け率
${folder.rate}
<br/>
containings
<div>
<logic:iterate id="containing" name="folder" property="containings">id
${containing.id}
<br/>
tag
${containing.tag}
<br/>
作品
${containing.work}
<br/>
フォルダ
${containing.folder}
<br/>
model
${containing.model}
<br/>
日付
date<st:date date="${containing.id
${folder.id}
<br/>
語
${folder.word}
<br/>
一般ユーザー
${folder.publicUser}
<br/>
コンセプト
${folder.concept}
<br/>
制作期間
productionspan<st:date date="${folder.id
${folder.id}
<br/>
語
${folder.word}
<br/>
一般ユーザー
${folder.publicUser}
<br/>
コンセプト
${folder.concept}
<br/>
制作期間
productionspan}" /><br/>
掛け率
${folder.rate}
<br/>
containings
<div>
<logic:iterate id="containing" name="folder" property="containings">id
${containing.id}
<br/>
tag
${containing.tag}
<br/>
作品
${containing.work}
<br/>
フォルダ
${containing.folder}
<br/>
model
${containing.model}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="folder.containings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="フォルダ">
<nobr>
${row.folder.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="model">
<nobr>
${row.model}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
folderComments
<div>
<logic:iterate id="folderComment" name="folder" property="folderComments">id
${foldercomment.id}
<br/>
フォルダ
${foldercomment.folder}
<br/>
タイトル
${foldercomment.title}
<br/>
説明
${foldercomment.description}
<br/>
日付
date<st:date date="${foldercomment.id
${folder.id}
<br/>
語
${folder.word}
<br/>
一般ユーザー
${folder.publicUser}
<br/>
コンセプト
${folder.concept}
<br/>
制作期間
productionspan<st:date date="${folder.id
${folder.id}
<br/>
語
${folder.word}
<br/>
一般ユーザー
${folder.publicUser}
<br/>
コンセプト
${folder.concept}
<br/>
制作期間
productionspan}" /><br/>
掛け率
${folder.rate}
<br/>
containings
<div>
<logic:iterate id="containing" name="folder" property="containings">id
${containing.id}
<br/>
tag
${containing.tag}
<br/>
作品
${containing.work}
<br/>
フォルダ
${containing.folder}
<br/>
model
${containing.model}
<br/>
日付
date<st:date date="${containing.id
${folder.id}
<br/>
語
${folder.word}
<br/>
一般ユーザー
${folder.publicUser}
<br/>
コンセプト
${folder.concept}
<br/>
制作期間
productionspan<st:date date="${folder.id
${folder.id}
<br/>
語
${folder.word}
<br/>
一般ユーザー
${folder.publicUser}
<br/>
コンセプト
${folder.concept}
<br/>
制作期間
productionspan}" /><br/>
掛け率
${folder.rate}
<br/>
containings
<div>
<logic:iterate id="containing" name="folder" property="containings">id
${containing.id}
<br/>
tag
${containing.tag}
<br/>
作品
${containing.work}
<br/>
フォルダ
${containing.folder}
<br/>
model
${containing.model}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="folder.containings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="フォルダ">
<nobr>
${row.folder.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="model">
<nobr>
${row.model}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
folderComments
<div>
<logic:iterate id="folderComment" name="folder" property="folderComments">id
${foldercomment.id}
<br/>
フォルダ
${foldercomment.folder}
<br/>
タイトル
${foldercomment.title}
<br/>
説明
${foldercomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="folder.folderComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="フォルダ">
<nobr>
${row.folder.id}
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


</div>



	</body>
</html:html>


