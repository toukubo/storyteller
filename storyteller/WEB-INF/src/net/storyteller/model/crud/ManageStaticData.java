// license-header java merge-point
package net.storyteller.model.crud;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

public final class ManageStaticData extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StaticDataForm form = (net.storyteller.model.crud.StaticDataForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getStaticDataManageableService().create(
            (StringUtils.isBlank(request.getParameter("documentArrivedReportTemplate"))) ? null : form.getDocumentArrivedReportTemplate()
            , (StringUtils.isBlank(request.getParameter("documentRequestTemplate"))) ? null : form.getDocumentRequestTemplate()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("inforssurl"))) ? null : form.getInforssurl()
            , (StringUtils.isBlank(request.getParameter("reportmail"))) ? null : form.getReportmail()
            , (StringUtils.isBlank(request.getParameter("crtmax"))) ? 0 : form.getCrtmax()
            , (StringUtils.isBlank(request.getParameter("arpmax"))) ? 0 : form.getArpmax()
            , (StringUtils.isBlank(request.getParameter("eclipseroot"))) ? null : form.getEclipseroot()
            , (StringUtils.isBlank(request.getParameter("storytellerbyprojectteamrate"))) ? 0 : form.getStorytellerbyprojectteamrate()
            , (StringUtils.isBlank(request.getParameter("projectbystorytellerrate"))) ? 0 : form.getProjectbystorytellerrate()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StaticDataForm form = (net.storyteller.model.crud.StaticDataForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getStaticDataManageableService().read(
            (StringUtils.isBlank(request.getParameter("documentArrivedReportTemplate"))) ? null : form.getDocumentArrivedReportTemplate()
            , (StringUtils.isBlank(request.getParameter("documentRequestTemplate"))) ? null : form.getDocumentRequestTemplate()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("inforssurl"))) ? null : form.getInforssurl()
            , (StringUtils.isBlank(request.getParameter("reportmail"))) ? null : form.getReportmail()
            , (StringUtils.isBlank(request.getParameter("crtmax"))) ? 0 : form.getCrtmax()
            , (StringUtils.isBlank(request.getParameter("arpmax"))) ? 0 : form.getArpmax()
            , (StringUtils.isBlank(request.getParameter("eclipseroot"))) ? null : form.getEclipseroot()
            , (StringUtils.isBlank(request.getParameter("storytellerbyprojectteamrate"))) ? 0 : form.getStorytellerbyprojectteamrate()
            , (StringUtils.isBlank(request.getParameter("projectbystorytellerrate"))) ? 0 : form.getProjectbystorytellerrate()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StaticDataForm form = (net.storyteller.model.crud.StaticDataForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getStaticDataManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StaticDataForm form = (net.storyteller.model.crud.StaticDataForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getStaticDataManageableService().update(
            (StringUtils.isBlank(request.getParameter("documentArrivedReportTemplate"))) ? null : form.getDocumentArrivedReportTemplate()
            , (StringUtils.isBlank(request.getParameter("documentRequestTemplate"))) ? null : form.getDocumentRequestTemplate()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("inforssurl"))) ? null : form.getInforssurl()
            , (StringUtils.isBlank(request.getParameter("reportmail"))) ? null : form.getReportmail()
            , (StringUtils.isBlank(request.getParameter("crtmax"))) ? 0 : form.getCrtmax()
            , (StringUtils.isBlank(request.getParameter("arpmax"))) ? 0 : form.getArpmax()
            , (StringUtils.isBlank(request.getParameter("eclipseroot"))) ? null : form.getEclipseroot()
            , (StringUtils.isBlank(request.getParameter("storytellerbyprojectteamrate"))) ? 0 : form.getStorytellerbyprojectteamrate()
            , (StringUtils.isBlank(request.getParameter("projectbystorytellerrate"))) ? 0 : form.getProjectbystorytellerrate()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StaticDataForm form = (net.storyteller.model.crud.StaticDataForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getStaticDataManageableService().delete(selectedRows);
        }

        return preload(mapping, actionForm, request, response);
    }

    private void saveMaxResultsWarning(HttpServletRequest request)
    {
        final HttpSession session = request.getSession();

        ActionMessages messages = (ActionMessages)session.getAttribute(org.apache.struts.Globals.MESSAGE_KEY);
        if (messages == null)
        {
            messages = new ActionMessages();
            session.setAttribute(org.apache.struts.Globals.MESSAGE_KEY, messages);
        }
        messages.add("org.andromda.bpm4struts.warningmessages", new ActionMessage("maximum.results.fetched.warning", "250"));
    }

}
