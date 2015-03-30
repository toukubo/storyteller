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

public final class ManageVerb extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.VerbForm form = (net.storyteller.model.crud.VerbForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getVerbManageableService().create(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("twoobjects"))) ? false : form.isTwoobjects()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("strutsActionTemplates"))) ? null : form.getStrutsActionTemplates()
            , (StringUtils.isBlank(request.getParameter("jspTemplates"))) ? null : form.getJspTemplates()
            , (StringUtils.isBlank(request.getParameter("sentences"))) ? null : form.getSentences()
            , (StringUtils.isBlank(request.getParameter("templateInputs"))) ? null : form.getTemplateInputs()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.VerbForm form = (net.storyteller.model.crud.VerbForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getVerbManageableService().read(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("twoobjects"))) ? false : form.isTwoobjects()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("strutsActionTemplates"))) ? null : form.getStrutsActionTemplates()
            , (StringUtils.isBlank(request.getParameter("jspTemplates"))) ? null : form.getJspTemplates()
            , (StringUtils.isBlank(request.getParameter("sentences"))) ? null : form.getSentences()
            , (StringUtils.isBlank(request.getParameter("templateInputs"))) ? null : form.getTemplateInputs()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getVerbManageableService().readBackingLists();
        form.setStrutsActionTemplatesBackingList((java.util.List)backingLists.get("strutsActionTemplates"));
        form.setJspTemplatesBackingList((java.util.List)backingLists.get("jspTemplates"));
        form.setSentencesBackingList((java.util.List)backingLists.get("sentences"));
        form.setTemplateInputsBackingList((java.util.List)backingLists.get("templateInputs"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.VerbForm form = (net.storyteller.model.crud.VerbForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getVerbManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getVerbManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_StrutsActionTemplate")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_StrutsActionTemplate"));
            form.setStrutsActionTemplates(array);
        }
        form.setStrutsActionTemplatesBackingList((java.util.List)backingLists.get("strutsActionTemplates"));
        if (StringUtils.isNotBlank(request.getParameter("ref_JspTemplate")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_JspTemplate"));
            form.setJspTemplates(array);
        }
        form.setJspTemplatesBackingList((java.util.List)backingLists.get("jspTemplates"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Sentence")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_Sentence"));
            form.setSentences(array);
        }
        form.setSentencesBackingList((java.util.List)backingLists.get("sentences"));
        if (StringUtils.isNotBlank(request.getParameter("ref_TemplateInput")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_TemplateInput"));
            form.setTemplateInputs(array);
        }
        form.setTemplateInputsBackingList((java.util.List)backingLists.get("templateInputs"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.VerbForm form = (net.storyteller.model.crud.VerbForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getVerbManageableService().update(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("twoobjects"))) ? false : form.isTwoobjects()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("strutsActionTemplates"))) ? null : form.getStrutsActionTemplates()
            , (StringUtils.isBlank(request.getParameter("jspTemplates"))) ? null : form.getJspTemplates()
            , (StringUtils.isBlank(request.getParameter("sentences"))) ? null : form.getSentences()
            , (StringUtils.isBlank(request.getParameter("templateInputs"))) ? null : form.getTemplateInputs()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.VerbForm form = (net.storyteller.model.crud.VerbForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getVerbManageableService().delete(selectedRows);
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
