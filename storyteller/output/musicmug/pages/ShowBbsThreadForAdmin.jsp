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
${bbsthread.id}
<br/>
アーティスト
${bbsthread.artist}
<br/>
BBSコメント
<div>
<logic:iterate id="bbsComment" name="bbsthread" property="bbsComments">id
${bbscomment.id}
<br/>
スレッド
${bbscomment.bbsThread}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="bbsthread.bbsComments" id="row" requestURI="ForAdmin.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="スレッド">
<nobr>
${row.bbsThread.id}
</nobr>
</display:column>
                        </display:table>
<br/>


</div>



	</body>
</html:html>


