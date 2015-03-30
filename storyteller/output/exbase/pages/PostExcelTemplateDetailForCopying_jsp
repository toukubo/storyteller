<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/tags/struts-html.tld" prefix="html" %>
<%@ taglib uri="/tags/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostExcelTemplateVP">
          <html:hidden name="form" property="id"/>

ãã¼ã¸ã§ã³<br />
<html:text name="form" property="excelversion" /><br />

名称<br />
<html:text name="form" property="name" /><br />

                                category<br />
                                <c:choose>
                                    <c:when test="${empty Categorys}">
                                         <select name="category" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="category" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Categorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.category.id}">
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


                                attachment<br />
                                <c:choose>
                                    <c:when test="${empty Attachments}">
                                         <select name="attachment" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="attachment" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Attachments}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.attachment.id}">
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


removed<br />
<html:checkbox name="form" property="removed" /><br />

pretruncate<br />
<html:checkbox name="form" property="pretruncate" /><br />

uploadDate<br />
<input type="text" name="uploadDateAsString" value="<bean:write name="form" property="uploadDate" format="yyyy/MM/dd" />" /><br />
testing<br />
<html:checkbox name="form" property="testing" /><br />

updateMethod<br />
<html:text name="form" property="updateMethod" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
