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
作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate}" /><br/>
productiondate
productiondate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate}" /><br/>
productiondate
productiondate}" /><br/>
素材
${work.material}
<br/>
youtubeurl
${work.youtubeurl}
<br/>
作品コメント
<div>
<logic:iterate id="workComment" name="work" property="workComments">id
${workcomment.id}
<br/>
作品
${workcomment.work}
<br/>
タイトル
${workcomment.title}
<br/>
説明
${workcomment.description}
<br/>
日付
date<st:date date="${workcomment.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate}" /><br/>
productiondate
productiondate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate}" /><br/>
productiondate
productiondate}" /><br/>
素材
${work.material}
<br/>
youtubeurl
${work.youtubeurl}
<br/>
作品コメント
<div>
<logic:iterate id="workComment" name="work" property="workComments">id
${workcomment.id}
<br/>
作品
${workcomment.work}
<br/>
タイトル
${workcomment.title}
<br/>
説明
${workcomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.workComments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
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
名前
${work.name}
<br/>
サイズ
${work.size}
<br/>
日付
date<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate}" /><br/>
productiondate
productiondate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate}" /><br/>
productiondate
productiondate}" /><br/>
素材
${work.material}
<br/>
youtubeurl
${work.youtubeurl}
<br/>
作品コメント
<div>
<logic:iterate id="workComment" name="work" property="workComments">id
${workcomment.id}
<br/>
作品
${workcomment.work}
<br/>
タイトル
${workcomment.title}
<br/>
説明
${workcomment.description}
<br/>
日付
date<st:date date="${workcomment.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate}" /><br/>
productiondate
productiondate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate<st:date date="${work.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
date<st:date date="${containing.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date<st:date date="${auction.作品
<div>
<logic:iterate id="work" name="artist" property="works">id
${work.id}
<br/>
アーティスト
${work.artist}
<br/>
ジャンル
${work.genre}
<br/>
copywrite
${work.copywrite}
<br/>
exposurehistory
${work.exposurehistory}
<br/>
クライアント
${work.client}
<br/>
cilentrequest
${work.cilentrequest}
<br/>
licensed
${work.licensed}
<br/>
コメント
${work.comments}
<br/>
licensingpossibleafterexpired
${work.licensingpossibleafterexpired}
<br/>
folderrelativepath
${work.folderrelativepath}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
オークション
<div>
<logic:iterate id="auction" name="work" property="auctions">id
${auction.id}
<br/>
作品
${auction.work}
<br/>
購入
${auction.purchase}
<br/>
入札
<div>
<logic:iterate id="betting" name="auction" property="bettings">id
${betting.id}
<br/>
金額
${betting.price}
<br/>
コレクター
${betting.collector}
<br/>
オークション
${betting.auction}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="auction.bettings" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auction.id}
</nobr>
</display:column>
                        </display:table>
<br/>
コレクター
${auction.collector}
<br/>
説明
${auction.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.auctions" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="購入">
<nobr>
${row.purchase.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入札">
<nobr>
${row.bettings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コレクター">
<nobr>
${row.collector.id}
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
コンセプト
${work.concept}
<br/>
containings
<div>
<logic:iterate id="containing" name="work" property="containings">id
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
</div>				<display:table name="work.containings" id="row" requestURI="ForAuctions.do" pagesize="0" 
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
レビュー
<div>
<logic:iterate id="review" name="work" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.reviews" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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
更新日
updatedate}" /><br/>
productiondate
productiondate}" /><br/>
素材
${work.material}
<br/>
youtubeurl
${work.youtubeurl}
<br/>
作品コメント
<div>
<logic:iterate id="workComment" name="work" property="workComments">id
${workcomment.id}
<br/>
作品
${workcomment.work}
<br/>
タイトル
${workcomment.title}
<br/>
説明
${workcomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.workComments" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
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
名前
${work.name}
<br/>
サイズ
${work.size}
<br/>
日付
date}" /><br/>
年
${work.year}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.works" id="row" requestURI="ForAuctions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジャンル">
<nobr>
${row.genre}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="copywrite">
<nobr>
${row.copywrite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="exposurehistory">
<nobr>
${row.exposurehistory}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クライアント">
<nobr>
${row.client}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cilentrequest">
<nobr>
${row.cilentrequest}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="licensed">
<nobr>
${row.licensed}
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
 <display:column media="html" sortable="true" title="folderrelativepath">
<nobr>
${row.folderrelativepath}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="attachments">
<nobr>
${row.attachments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="オークション">
<nobr>
${row.auctions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コンセプト">
<nobr>
${row.concept}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="containings">
<nobr>
${row.containings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="レビュー">
<nobr>
${row.reviews}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="更新日"><nobr>
<st:date date="${row.updatedate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="productiondate"><nobr>
<st:date date="${row.productiondate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="素材">
<nobr>
${row.material}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="youtubeurl">
<nobr>
${row.youtubeurl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品コメント">
<nobr>
${row.workComments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サイズ">
<nobr>
${row.size}
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
                        </display:table>
<br/>
一般ユーザー
${artist.publicUser}
<br/>


</div>



	</body>
</html:html>


