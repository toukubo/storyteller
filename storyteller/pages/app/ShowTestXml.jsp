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

<test>
   <id>${test.id}</id>
<responsible>${test.responsible}</responsible>
<j2eeStory>${test.j2eeStory}</j2eeStory>
<stepstorepeat>${test.stepstorepeat}</stepstorepeat>
<whatyouexpectedtosee>${test.whatyouexpectedtosee}</whatyouexpectedtosee>
<whatyousawinstead>${test.whatyousawinstead}</whatyousawinstead>
<debuged>${test.debuged}</debuged>
<checked>${test.checked}</checked>
<modifiedpagetitle>${test.modifiedpagetitle}</modifiedpagetitle>
<modifiedpagefilename>${test.modifiedpagefilename}</modifiedpagefilename>

</test>
