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
                    <display:table name="${invitationSets}" id="row" requestURI="InvitationSets.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="message" title="message"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="publicUser" title="publicUser"/>
<display:column media="xml csv excel pdf" property="mail1" title="mail1"/>
<display:column media="xml csv excel pdf" property="mail2" title="mail2"/>
<display:column media="xml csv excel pdf" property="mail3" title="mail3"/>
<display:column media="xml csv excel pdf" property="mail4" title="mail4"/>
<display:column media="xml csv excel pdf" property="mail5" title="mail5"/>
<display:column media="xml csv excel pdf" property="mail6" title="mail6"/>
<display:column media="xml csv excel pdf" property="mail7" title="mail7"/>
<display:column media="xml csv excel pdf" property="mail8" title="mail8"/>
<display:column media="xml csv excel pdf" property="mail9" title="mail9"/>
<display:column media="xml csv excel pdf" property="mail10" title="mail10"/>
<display:column media="xml csv excel pdf" property="usertype" title="usertype"/>
<display:column media="xml csv excel pdf" property="invitations" title="invitations"/>

                    </display:table>


