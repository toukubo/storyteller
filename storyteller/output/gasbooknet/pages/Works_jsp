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
	<tiles:put name="title" value="作品一覧" direct="true" />
	<tiles:put name="content" direct="true">

                    <display:table name="${works}" id="row" requestURI="Works.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowWork.do?id=${row.id}">Show</a> | 
                        <a href="PostWorkDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteWork.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="年">
<nobr>
${row.year}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="製品">
<nobr>
${row.products}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気度">
<nobr>
${row.poplularity}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="projectname">
<nobr>
${row.projectname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="copywrite">
<nobr>
${row.copywrite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="制作意図">
<nobr>
${row.productionpurpose}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="過去の発表履歴">
<nobr>
${row.exposurehistory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クレジット表記">
<nobr>
${row.credit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="clientname">
<nobr>
${row.clientname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cilentrequest ">
<nobr>
${row.cilentrequest}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workAttachments">
<nobr>
${row.workAttachments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ライセンス契約終了年月"><nobr>
<st:date date="${row.expiredate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ライセンスの可否">
<nobr>
${row.licensed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="備考">
<nobr>
${row.particulars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コメント">
<nobr>
${row.comments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="licensingpossibleafterexpired">
<nobr>
${row.licensingpossibleafterexpired}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="sharedWorkXlsFile">
<nobr>
${row.sharedWorkXlsFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ステータス">
<nobr>
${row.status}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="folderrelativepath">
<nobr>
${row.folderrelativepath}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="licenced">
<nobr>
${row.licenced}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesecilentrequest">
<nobr>
${row.japanesecilentrequest}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseclientname">
<nobr>
${row.japaneseclientname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesecomments">
<nobr>
${row.japanesecomments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesecopywrite">
<nobr>
${row.japanesecopywrite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesecredit">
<nobr>
${row.japanesecredit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesedescription">
<nobr>
${row.japanesedescription}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseexposurehistory">
<nobr>
${row.japaneseexposurehistory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseparticulars">
<nobr>
${row.japaneseparticulars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseproductionpurpose">
<nobr>
${row.japaneseproductionpurpose}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseprojectname">
<nobr>
${row.japaneseprojectname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesetitle">
<nobr>
${row.japanesetitle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workTaggings">
<nobr>
${row.workTaggings}
</nobr>
</display:column>

                    </display:table>
<a href="Works.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Works.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Works.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Works.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>
	</tiles:put>
</tiles:insert>
