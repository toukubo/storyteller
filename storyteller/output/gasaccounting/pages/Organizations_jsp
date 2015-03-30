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

<span class="title">オーガニゼーション一覧</span>
                    <display:table name="${organizations}" id="row" requestURI="Organizations.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Organizations.do?id=${row.id}">編集</a>
                        <a href="DeleteOrganization.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="契約">
<nobr>
${row.contracts}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.phonenum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="companyname">
<nobr>
${row.companyname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="furigana">
<nobr>
${row.furigana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="companyaddress">
<nobr>
${row.companyaddress}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="postcode">
<nobr>
${row.postcode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="faxnum">
<nobr>
${row.faxnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="president">
<nobr>
${row.president}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="storename">
<nobr>
${row.storename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="creationdate"><nobr>
<bean:write name="row" property="creationdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="capital">
<nobr>
${row.capital}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="annualsales">
<nobr>
${row.annualsales}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="employeenum">
<nobr>
${row.employeenum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="businessdesc">
<nobr>
${row.businessdesc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="majortradpartner1">
<nobr>
${row.majortradpartner1}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="majortradpartner2">
<nobr>
${row.majortradpartner2}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="majortradpartner3">
<nobr>
${row.majortradpartner3}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="bankers">
<nobr>
${row.bankers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="paymentsite">
<nobr>
${row.paymentsite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="supplier">
<nobr>
${row.supplier}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="customer">
<nobr>
${row.customer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="仕入">
<nobr>
${row.buyings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="請求">
<nobr>
${row.invoices}
</nobr>
</display:column>

                    </display:table>
<a href="Organizations.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Organizations.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Organizations.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Organizations.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	オーガニゼーション編集
</span>
<span id="subform">

		<form method="POST" action="PostOrganizationVP.do">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

アドレス<br />
<html:text name="form" property="address" /><br />

電話番号<br />
<html:text name="form" property="phonenum" /><br />

companyname<br />
<html:text name="form" property="companyname" /><br />

furigana<br />
<html:text name="form" property="furigana" /><br />

companyaddress<br />
<html:text name="form" property="companyaddress" /><br />

postcode<br />
<html:text name="form" property="postcode" /><br />

faxnum<br />
<html:text name="form" property="faxnum" /><br />

president<br />
<html:text name="form" property="president" /><br />

storename<br />
<html:text name="form" property="storename" /><br />

creationdate<br />
<input type="text" name="creationdateAsString" value="<bean:write name="form" property="creationdate" format="yyyy/MM/dd" />" /><br />
capital<br />
<html:text name="form" property="capital" /><br />

annualsales<br />
<html:text name="form" property="annualsales" /><br />

employeenum<br />
<html:text name="form" property="employeenum" /><br />

businessdesc<br />
<html:text name="form" property="businessdesc" /><br />

majortradpartner1<br />
<html:text name="form" property="majortradpartner1" /><br />

majortradpartner2<br />
<html:text name="form" property="majortradpartner2" /><br />

majortradpartner3<br />
<html:text name="form" property="majortradpartner3" /><br />

bankers<br />
<html:text name="form" property="bankers" /><br />

paymentsite<br />
<html:text name="form" property="paymentsite" /><br />

supplier<br />
<html:text name="form" property="supplier" /><br />

customer<br />
<html:text name="form" property="customer" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Organizations.do">新規オーガニゼーション作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

