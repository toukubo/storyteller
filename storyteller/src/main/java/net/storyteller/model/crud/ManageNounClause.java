// license-header java merge-point
package net.storyteller.model.crud;

import net.storyteller.ManageableServiceLocator;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.*;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public final class ManageNounClause extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounClauseForm form = (net.storyteller.model.crud.NounClauseForm)actionForm;

        ManageableServiceLocator.instance().getNounClauseManageableService().create(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("ofuse"))) ? null : form.getOfuse()
            , (StringUtils.isBlank(request.getParameter("assecoud"))) ? null : form.getAssecoud()
            , (StringUtils.isBlank(request.getParameter("asfirst"))) ? null : form.getAsfirst()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounClauseForm form = (net.storyteller.model.crud.NounClauseForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getNounClauseManageableService().read(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("ofuse"))) ? null : form.getOfuse()
            , (StringUtils.isBlank(request.getParameter("assecoud"))) ? null : form.getAssecoud()
            , (StringUtils.isBlank(request.getParameter("asfirst"))) ? null : form.getAsfirst()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getNounClauseManageableService().readBackingLists();
        form.setOfuseBackingList((java.util.List)backingLists.get("ofuse"));
        form.setAssecoudBackingList((java.util.List)backingLists.get("assecoud"));
        form.setAsfirstBackingList((java.util.List)backingLists.get("asfirst"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounClauseForm form = (net.storyteller.model.crud.NounClauseForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getNounClauseManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getNounClauseManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_NounUse")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_NounUse"));
            form.setOfuse(array);
        }
        form.setOfuseBackingList((java.util.List)backingLists.get("ofuse"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Sentence")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_Sentence"));
            form.setAssecoud(array);
        }
        form.setAssecoudBackingList((java.util.List)backingLists.get("assecoud"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Sentence")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_Sentence"));
            form.setAsfirst(array);
        }
        form.setAsfirstBackingList((java.util.List)backingLists.get("asfirst"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounClauseForm form = (net.storyteller.model.crud.NounClauseForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getNounClauseManageableService().update(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("ofuse"))) ? null : form.getOfuse()
            , (StringUtils.isBlank(request.getParameter("assecoud"))) ? null : form.getAssecoud()
            , (StringUtils.isBlank(request.getParameter("asfirst"))) ? null : form.getAsfirst()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.NounClauseForm form = (net.storyteller.model.crud.NounClauseForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getNounClauseManageableService().delete(selectedRows);
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
