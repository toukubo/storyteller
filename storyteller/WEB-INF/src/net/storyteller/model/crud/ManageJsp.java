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

public final class ManageJsp extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.JspForm form = (net.storyteller.model.crud.JspForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getJspManageableService().create(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("filename"))) ? null : form.getFilename()
            , (StringUtils.isBlank(request.getParameter("sentence"))) ? null : form.getSentence()
            , (StringUtils.isBlank(request.getParameter("targeteraction"))) ? null : form.getTargeteraction()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.JspForm form = (net.storyteller.model.crud.JspForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getJspManageableService().read(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("filename"))) ? null : form.getFilename()
            , (StringUtils.isBlank(request.getParameter("sentence"))) ? null : form.getSentence()
            , (StringUtils.isBlank(request.getParameter("targeteraction"))) ? null : form.getTargeteraction()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getJspManageableService().readBackingLists();
        form.setSentenceBackingList((java.util.List)backingLists.get("sentence"));
        form.setTargeteractionBackingList((java.util.List)backingLists.get("targeteraction"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.JspForm form = (net.storyteller.model.crud.JspForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getJspManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getJspManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_Sentence")))
        {
            form.setSentence(new java.lang.Integer(request.getParameter("ref_Sentence")));
        }
        form.setSentenceBackingList((java.util.List)backingLists.get("sentence"));
        if (StringUtils.isNotBlank(request.getParameter("ref_StrutsAction")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_StrutsAction"));
            form.setTargeteraction(array);
        }
        form.setTargeteractionBackingList((java.util.List)backingLists.get("targeteraction"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.JspForm form = (net.storyteller.model.crud.JspForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getJspManageableService().update(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("code"))) ? null : form.getCode()
            , (StringUtils.isBlank(request.getParameter("filename"))) ? null : form.getFilename()
            , (StringUtils.isBlank(request.getParameter("sentence"))) ? null : form.getSentence()
            , (StringUtils.isBlank(request.getParameter("targeteraction"))) ? null : form.getTargeteraction()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.JspForm form = (net.storyteller.model.crud.JspForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getJspManageableService().delete(selectedRows);
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
