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
</div>				<display:table name="auction.bettings" id="row" requestURI=".do" pagesize="0" 
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
date<st:date date="${auction.id
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
</div>				<display:table name="auction.bettings" id="row" requestURI=".do" pagesize="0" 
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


</div>



	</body>
</html:html>


