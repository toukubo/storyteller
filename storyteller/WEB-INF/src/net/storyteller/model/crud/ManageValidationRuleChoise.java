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

public final class ManageValidationRuleChoise extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleChoiseForm form = (net.storyteller.model.crud.ValidationRuleChoiseForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getValidationRuleChoiseManageableService().create(
            (StringUtils.isBlank(request.getParameter("actualcode"))) ? null : form.getActualcode()
            , (StringUtils.isBlank(request.getParameter("errormessage"))) ? null : form.getErrormessage()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("validationRule"))) ? null : form.getValidationRule()
            , (StringUtils.isBlank(request.getParameter("attrUse"))) ? null : form.getAttrUse()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleChoiseForm form = (net.storyteller.model.crud.ValidationRuleChoiseForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getValidationRuleChoiseManageableService().read(
            (StringUtils.isBlank(request.getParameter("actualcode"))) ? null : form.getActualcode()
            , (StringUtils.isBlank(request.getParameter("errormessage"))) ? null : form.getErrormessage()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("validationRule"))) ? null : form.getValidationRule()
            , (StringUtils.isBlank(request.getParameter("attrUse"))) ? null : form.getAttrUse()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getValidationRuleChoiseManageableService().readBackingLists();
        form.setValidationRuleBackingList((java.util.List)backingLists.get("validationRule"));
        form.setAttrUseBackingList((java.util.List)backingLists.get("attrUse"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleChoiseForm form = (net.storyteller.model.crud.ValidationRuleChoiseForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getValidationRuleChoiseManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getValidationRuleChoiseManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_ValidationRule")))
        {
            form.setValidationRule(new java.lang.Integer(request.getParameter("ref_ValidationRule")));
        }
        form.setValidationRuleBackingList((java.util.List)backingLists.get("validationRule"));
        if (StringUtils.isNotBlank(request.getParameter("ref_AttrUse")))
        {
            form.setAttrUse(new java.lang.Integer(request.getParameter("ref_AttrUse")));
        }
        form.setAttrUseBackingList((java.util.List)backingLists.get("attrUse"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleChoiseForm form = (net.storyteller.model.crud.ValidationRuleChoiseForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getValidationRuleChoiseManageableService().update(
            (StringUtils.isBlank(request.getParameter("actualcode"))) ? null : form.getActualcode()
            , (StringUtils.isBlank(request.getParameter("errormessage"))) ? null : form.getErrormessage()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("validationRule"))) ? null : form.getValidationRule()
            , (StringUtils.isBlank(request.getParameter("attrUse"))) ? null : form.getAttrUse()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.ValidationRuleChoiseForm form = (net.storyteller.model.crud.ValidationRuleChoiseForm) actionForm;

        final java.lang.Long[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getValidationRuleChoiseManageableService().delete(selectedRows);
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
