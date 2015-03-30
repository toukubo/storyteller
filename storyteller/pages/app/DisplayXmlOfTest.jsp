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
<tests>
    <logic:iterate id="model" name="tests">
       <test>
         <id>${model.id}</id>
<responsible>${model.responsible.name}</responsible>
<j2eeStory>${model.j2eeStory.name}</j2eeStory>
<stepstorepeat>${model.stepstorepeat}</stepstorepeat>
<whatyouexpectedtosee>${model.whatyouexpectedtosee}</whatyouexpectedtosee>
<whatyousawinstead>${model.whatyousawinstead}</whatyousawinstead>
<debuged>${model.debuged}</debuged>
<checked>${model.checked}</checked>
<modifiedpagetitle>${model.modifiedpagetitle}</modifiedpagetitle>
<modifiedpagefilename>${model.modifiedpagefilename}</modifiedpagefilename>
       </test>
    </logic:iterate>
</tests>
