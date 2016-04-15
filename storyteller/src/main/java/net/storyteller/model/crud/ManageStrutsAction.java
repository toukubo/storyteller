// license-header java merge-point
package net.storyteller.model.crud;

import net.storyteller.ManageableServiceLocator;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public final class ManageStrutsAction extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StrutsActionForm form = (net.storyteller.model.crud.StrutsActionForm)actionForm;

        ManageableServiceLocator.instance().getStrutsActionManageableService().create(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("filename"))) ? null : form.getFilename()
            , (StringUtils.isBlank(request.getParameter("sentence"))) ? null : form.getSentence()
            , (StringUtils.isBlank(request.getParameter("targeteejsp"))) ? null : form.getTargeteejsp()
            , (StringUtils.isBlank(request.getParameter("targeteraction"))) ? null : form.getTargeteraction()
            , (StringUtils.isBlank(request.getParameter("targeteeaction"))) ? null : form.getTargeteeaction()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StrutsActionForm form = (net.storyteller.model.crud.StrutsActionForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getStrutsActionManageableService().read(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("filename"))) ? null : form.getFilename()
            , (StringUtils.isBlank(request.getParameter("sentence"))) ? null : form.getSentence()
            , (StringUtils.isBlank(request.getParameter("targeteejsp"))) ? null : form.getTargeteejsp()
            , (StringUtils.isBlank(request.getParameter("targeteraction"))) ? null : form.getTargeteraction()
            , (StringUtils.isBlank(request.getParameter("targeteeaction"))) ? null : form.getTargeteeaction()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getStrutsActionManageableService().readBackingLists();
        form.setSentenceBackingList((java.util.List)backingLists.get("sentence"));
        form.setTargeteejspBackingList((java.util.List)backingLists.get("targeteejsp"));
        form.setTargeteractionBackingList((java.util.List)backingLists.get("targeteraction"));
        form.setTargeteeactionBackingList((java.util.List)backingLists.get("targeteeaction"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StrutsActionForm form = (net.storyteller.model.crud.StrutsActionForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getStrutsActionManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getStrutsActionManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_Sentence")))
        {
            form.setSentence(new java.lang.Integer(request.getParameter("ref_Sentence")));
        }
        form.setSentenceBackingList((java.util.List)backingLists.get("sentence"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Jsp")))
        {
            form.setTargeteejsp(new java.lang.Integer(request.getParameter("ref_Jsp")));
        }
        form.setTargeteejspBackingList((java.util.List)backingLists.get("targeteejsp"));
        if (StringUtils.isNotBlank(request.getParameter("ref_StrutsAction")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_StrutsAction"));
            form.setTargeteraction(array);
        }
        form.setTargeteractionBackingList((java.util.List)backingLists.get("targeteraction"));
        if (StringUtils.isNotBlank(request.getParameter("ref_StrutsAction")))
        {
            form.setTargeteeaction(new java.lang.Integer(request.getParameter("ref_StrutsAction")));
        }
        form.setTargeteeactionBackingList((java.util.List)backingLists.get("targeteeaction"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StrutsActionForm form = (net.storyteller.model.crud.StrutsActionForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getStrutsActionManageableService().update(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("filename"))) ? null : form.getFilename()
            , (StringUtils.isBlank(request.getParameter("sentence"))) ? null : form.getSentence()
            , (StringUtils.isBlank(request.getParameter("targeteejsp"))) ? null : form.getTargeteejsp()
            , (StringUtils.isBlank(request.getParameter("targeteraction"))) ? null : form.getTargeteraction()
            , (StringUtils.isBlank(request.getParameter("targeteeaction"))) ? null : form.getTargeteeaction()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.StrutsActionForm form = (net.storyteller.model.crud.StrutsActionForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getStrutsActionManageableService().delete(selectedRows);
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
