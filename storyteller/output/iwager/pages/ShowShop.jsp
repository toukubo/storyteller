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
${shop.id}
<br/>
gameTables
<div>
<logic:iterate id="gameTable" name="shop" property="gameTables">id
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
value
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
 <display:column media="html" sortable="true" title="value">
<nobr>
${row.value}
</nobr>
</display:column>
                        </display:table>
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="gametable.plays" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="game">
<nobr>
${row.game.id}
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
                        </display:table>
<br/>
jackpot
${gametable.jackpot}
<br/>
game
${gametable.game}
<br/>
shop
${gametable.shop}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="shop.gameTables" id="row" requestURI=".do" pagesize="0" 
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
${row.game.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="shop">
<nobr>
${row.shop.id}
</nobr>
</display:column>
                        </display:table>
<br/>
jackpot
${shop.jackpot}
<br/>


</div>



	</body>
</html:html>


