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

public final class ManageValidationRule extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleForm form = (net.storyteller.model.crud.ValidationRuleForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getValidationRuleManageableService().create(
            (StringUtils.isBlank(request.getParameter("defaulterrormessage"))) ? null : form.getDefaulterrormessage()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("validationRuleChoises"))) ? null : form.getValidationRuleChoises()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleForm form = (net.storyteller.model.crud.ValidationRuleForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getValidationRuleManageableService().read(
            (StringUtils.isBlank(request.getParameter("defaulterrormessage"))) ? null : form.getDefaulterrormessage()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("validationRuleChoises"))) ? null : form.getValidationRuleChoises()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getValidationRuleManageableService().readBackingLists();
        form.setValidationRuleChoisesBackingList((java.util.List)backingLists.get("validationRuleChoises"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleForm form = (net.storyteller.model.crud.ValidationRuleForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getValidationRuleManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getValidationRuleManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_ValidationRuleChoise")))
        {
            final java.lang.Long[] array = new java.lang.Long[1];
            array[0] = new java.lang.Long(request.getParameter("ref_ValidationRuleChoise"));
            form.setValidationRuleChoises(array);
        }
        form.setValidationRuleChoisesBackingList((java.util.List)backingLists.get("validationRuleChoises"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleForm form = (net.storyteller.model.crud.ValidationRuleForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getValidationRuleManageableService().update(
            (StringUtils.isBlank(request.getParameter("defaulterrormessage"))) ? null : form.getDefaulterrormessage()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("validationRuleChoises"))) ? null : form.getValidationRuleChoises()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleForm form = (net.storyteller.model.crud.ValidationRuleForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getValidationRuleManageableService().delete(selectedRows);
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
