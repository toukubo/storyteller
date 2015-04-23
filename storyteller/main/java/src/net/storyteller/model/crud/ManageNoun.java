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

public final class ManageNoun extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounForm form = (net.storyteller.model.crud.NounForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getNounManageableService().create(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("japanese"))) ? null : form.getJapanese()
            , (StringUtils.isBlank(request.getParameter("nounUses"))) ? null : form.getNounUses()
            , (StringUtils.isBlank(request.getParameter("j2eeStory"))) ? null : form.getJ2eeStory()
            , (StringUtils.isBlank(request.getParameter("attrs"))) ? null : form.getAttrs()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounForm form = (net.storyteller.model.crud.NounForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getNounManageableService().read(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("japanese"))) ? null : form.getJapanese()
            , (StringUtils.isBlank(request.getParameter("nounUses"))) ? null : form.getNounUses()
            , (StringUtils.isBlank(request.getParameter("j2eeStory"))) ? null : form.getJ2eeStory()
            , (StringUtils.isBlank(request.getParameter("attrs"))) ? null : form.getAttrs()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getNounManageableService().readBackingLists();
        form.setNounUsesBackingList((java.util.List)backingLists.get("nounUses"));
        form.setJ2eeStoryBackingList((java.util.List)backingLists.get("j2eeStory"));
        form.setAttrsBackingList((java.util.List)backingLists.get("attrs"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounForm form = (net.storyteller.model.crud.NounForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getNounManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getNounManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_NounUse")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_NounUse"));
            form.setNounUses(array);
        }
        form.setNounUsesBackingList((java.util.List)backingLists.get("nounUses"));
        if (StringUtils.isNotBlank(request.getParameter("ref_J2eeStory")))
        {
            form.setJ2eeStory(new java.lang.Integer(request.getParameter("ref_J2eeStory")));
        }
        form.setJ2eeStoryBackingList((java.util.List)backingLists.get("j2eeStory"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Attr")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_Attr"));
            form.setAttrs(array);
        }
        form.setAttrsBackingList((java.util.List)backingLists.get("attrs"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounForm form = (net.storyteller.model.crud.NounForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getNounManageableService().update(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("japanese"))) ? null : form.getJapanese()
            , (StringUtils.isBlank(request.getParameter("nounUses"))) ? null : form.getNounUses()
            , (StringUtils.isBlank(request.getParameter("j2eeStory"))) ? null : form.getJ2eeStory()
            , (StringUtils.isBlank(request.getParameter("attrs"))) ? null : form.getAttrs()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounForm form = (net.storyteller.model.crud.NounForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getNounManageableService().delete(selectedRows);
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
