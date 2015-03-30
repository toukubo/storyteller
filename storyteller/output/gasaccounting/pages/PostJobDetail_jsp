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
	ジョブ編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostJobVP">
          <html:hidden name="form" property="id"/>

原価計<br />
<html:text name="form" property="costsum" /><br />

                                ジョブカテゴリー<br />
                                <c:choose>
                                    <c:when test="${empty JobCategorys}">
                                         <select name="jobCategory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="jobCategory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${JobCategorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.jobCategory.id}">
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


名前<br />
<html:text name="form" property="name" /><br />

タイトル<br />
<html:text name="form" property="title" /><br />

アクティブ<br />
<html:text name="form" property="active" /><br />

コード<br />
<html:text name="form" property="code" /><br />

actualsales<br />
<html:text name="form" property="actualsales" /><br />

actualsalesminuscost<br />
<html:text name="form" property="actualsalesminuscost" /><br />

利益率<br />
<html:text name="form" property="profitrate" /><br />

humanaletotalcost<br />
<html:text name="form" property="humanaletotalcost" /><br />

totalcost<br />
<html:text name="form" property="totalcost" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


