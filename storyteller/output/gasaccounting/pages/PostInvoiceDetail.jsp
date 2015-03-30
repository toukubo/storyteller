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
<div class="main">
<span id="title">
	請求編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostInvoiceVP">
          <html:hidden name="form" property="id"/>

通貨<br />
<html:text name="form" property="currency" /><br />

合計<br />
<html:text name="form" property="total" /><br />

商品名<br />
<html:text name="form" property="productname" /><br />

原価<br />
<html:text name="form" property="cost" /><br />

決済方法<br />
<html:text name="form" property="payment" /><br />

個数<br />
<html:text name="form" property="qty" /><br />

備考<br />
<html:text name="form" property="remark" /><br />

請求番号<br />
<html:text name="form" property="code" /><br />

件名<br />
<html:text name="form" property="subject" /><br />

請求日<br />
<input type="text" name="billingdateAsString" value="<bean:write name="form" property="billingdate" format="yyyy/MM/dd" />" /><br />
支払い期限<br />
<input type="text" name="duedateAsString" value="<bean:write name="form" property="duedate" format="yyyy/MM/dd" />" /><br />
税抜き請求金額<br />
<html:text name="form" property="taxbeforecharges" /><br />

消費税総額<br />
<html:text name="form" property="totconsumptiontax" /><br />

差益<br />
<html:text name="form" property="margin" /><br />

差益率<br />
<html:text name="form" property="marginrate" /><br />

品番<br />
<html:text name="form" property="partno" /><br />

仕入値<br />
<html:text name="form" property="purchaseprice" /><br />

海外<br />
<html:text name="form" property="overseas" /><br />

レート<br />
<html:text name="form" property="rate" /><br />

小売価格<br />
<html:text name="form" property="retailprice" /><br />

卸値<br />
<html:text name="form" property="wholesaleprice" /><br />

消費税総額<br />
<html:text name="form" property="salestax" /><br />

税額<br />
<html:text name="form" property="tax" /><br />

税（外／内）<br />
<html:text name="form" property="taxinternorextern" /><br />

売上げ税抜<br />
<html:text name="form" property="pretaxsales" /><br />

掛け率<br />
<html:text name="form" property="rackrate" /><br />

                                内部ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


                                ジョブ<br />
                                <c:choose>
                                    <c:when test="${empty Jobs}">
                                         <select name="job" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="job" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Jobs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.job.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


決済方法<br />
<html:text name="form" property="infotransfer" /><br />

                                団体<br />
                                <c:choose>
                                    <c:when test="${empty Organizations}">
                                         <select name="organization" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="organization" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Organizations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.organization.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />





          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


