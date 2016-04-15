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

<j2eestory>
   <name>${j2eeStory.name}</name>
<id>${j2eeStory.id}</id>
<startdate>${j2eeStory.startdate}</startdate>
<requiredstorytellerhour>${j2eeStory.requiredstorytellerhour}</requiredstorytellerhour>
<requiredteamhour>${j2eeStory.requiredteamhour}</requiredteamhour>
<price>${j2eeStory.price}</price>
<enddate>${j2eeStory.enddate}</enddate>
<strutsconfigcontent>${j2eeStory.strutsconfigcontent}</strutsconfigcontent>
<andromdaCoreJarFile>${j2eeStory.andromdaCoreJarFile}</andromdaCoreJarFile>
<story>${j2eeStory.story}</story>
<nouns>${j2eeStory.nouns}</nouns>
<tests>${j2eeStory.tests}</tests>
<outOfPattenSentences>${j2eeStory.outOfPattenSentences}</outOfPattenSentences>
<sentences>${j2eeStory.sentences}</sentences>

</j2eestory>
