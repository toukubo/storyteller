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
${pit.id}
<br/>
gameTables
<div>
<logic:iterate id="gameTable" name="pit" property="gameTables">id
${gametable.id}
<br/>
plays
<div>
<logic:iterate id="play" name="gametable" property="plays">id
${play.id}
<br/>
game
${play.game}
<br/>
gameTable
${play.gameTable}
<br/>
dealer
${play.dealer}
<br/>
sidebets
<div>
<logic:iterate id="sidebet" name="play" property="sidebets">id
${sidebet.id}
<br/>
play
${sidebet.play}
<br/>
値
${sidebet.value}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="play.sidebets" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="play">
<nobr>
${row.play.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="値">
<nobr>
${row.value}
</nobr>
</display:column>
                        </display:table>
<br/>
日付
<bean:write name="play" property="date" format="yyyy/MM/dd" />
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="gametable.plays" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="game">
<nobr>
${row.game.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="gameTable">
<nobr>
${row.gameTable.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dealer">
<nobr>
${row.dealer.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="sidebets">
<nobr>
${row.sidebets}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
                        </display:table>
<br/>
jackpot
${gametable.jackpot}
<br/>
game
${gametable.game}
<br/>
ショップ
${gametable.shop}
<br/>
名前
${gametable.name}
<br/>
pit
${gametable.pit}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="pit.gameTables" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="plays">
<nobr>
${row.plays}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="jackpot">
<nobr>
${row.jackpot}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="game">
<nobr>
${row.game.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ショップ">
<nobr>
${row.shop.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="pit">
<nobr>
${row.pit.name}
</nobr>
</display:column>
                        </display:table>
<br/>
ショップ
${pit.shop}
<br/>
名前
${pit.name}
<br/>


</div>



	</body>
</html:html>


