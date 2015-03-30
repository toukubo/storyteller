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

public final class ManageAttr extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.AttrForm form = (net.storyteller.model.crud.AttrForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getAttrManageableService().create(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("classtype"))) ? null : form.getClasstype()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("japanese"))) ? null : form.getJapanese()
            , (StringUtils.isBlank(request.getParameter("noun"))) ? null : form.getNoun()
            , (StringUtils.isBlank(request.getParameter("attrUses"))) ? null : form.getAttrUses()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.AttrForm form = (net.storyteller.model.crud.AttrForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getAttrManageableService().read(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("classtype"))) ? null : form.getClasstype()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("japanese"))) ? null : form.getJapanese()
            , (StringUtils.isBlank(request.getParameter("noun"))) ? null : form.getNoun()
            , (StringUtils.isBlank(request.getParameter("attrUses"))) ? null : form.getAttrUses()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getAttrManageableService().readBackingLists();
        form.setNounBackingList((java.util.List)backingLists.get("noun"));
        form.setAttrUsesBackingList((java.util.List)backingLists.get("attrUses"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.AttrForm form = (net.storyteller.model.crud.AttrForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getAttrManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getAttrManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_Noun")))
        {
            form.setNoun(new java.lang.Integer(request.getParameter("ref_Noun")));
        }
        form.setNounBackingList((java.util.List)backingLists.get("noun"));
        if (StringUtils.isNotBlank(request.getParameter("ref_AttrUse")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_AttrUse"));
            form.setAttrUses(array);
        }
        form.setAttrUsesBackingList((java.util.List)backingLists.get("attrUses"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.AttrForm form = (net.storyteller.model.crud.AttrForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getAttrManageableService().update(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("classtype"))) ? null : form.getClasstype()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("japanese"))) ? null : form.getJapanese()
            , (StringUtils.isBlank(request.getParameter("noun"))) ? null : form.getNoun()
            , (StringUtils.isBlank(request.getParameter("attrUses"))) ? null : form.getAttrUses()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.AttrForm form = (net.storyteller.model.crud.AttrForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getAttrManageableService().delete(selectedRows);
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
