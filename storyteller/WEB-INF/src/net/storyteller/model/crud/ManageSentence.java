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

public final class ManageSentence extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.SentenceForm form = (net.storyteller.model.crud.SentenceForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getSentenceManageableService().create(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("strutsConfigCode"))) ? null : form.getStrutsConfigCode()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("strutsActions"))) ? null : form.getStrutsActions()
            , (StringUtils.isBlank(request.getParameter("verb"))) ? null : form.getVerb()
            , (StringUtils.isBlank(request.getParameter("secountobjective"))) ? null : form.getSecountobjective()
            , (StringUtils.isBlank(request.getParameter("firstobjective"))) ? null : form.getFirstobjective()
            , (StringUtils.isBlank(request.getParameter("jsps"))) ? null : form.getJsps()
            , (StringUtils.isBlank(request.getParameter("j2eeStory"))) ? null : form.getJ2eeStory()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.SentenceForm form = (net.storyteller.model.crud.SentenceForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getSentenceManageableService().read(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("strutsConfigCode"))) ? null : form.getStrutsConfigCode()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("strutsActions"))) ? null : form.getStrutsActions()
            , (StringUtils.isBlank(request.getParameter("verb"))) ? null : form.getVerb()
            , (StringUtils.isBlank(request.getParameter("secountobjective"))) ? null : form.getSecountobjective()
            , (StringUtils.isBlank(request.getParameter("firstobjective"))) ? null : form.getFirstobjective()
            , (StringUtils.isBlank(request.getParameter("jsps"))) ? null : form.getJsps()
            , (StringUtils.isBlank(request.getParameter("j2eeStory"))) ? null : form.getJ2eeStory()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getSentenceManageableService().readBackingLists();
        form.setStrutsActionsBackingList((java.util.List)backingLists.get("strutsActions"));
        form.setVerbBackingList((java.util.List)backingLists.get("verb"));
        form.setSecountobjectiveBackingList((java.util.List)backingLists.get("secountobjective"));
        form.setFirstobjectiveBackingList((java.util.List)backingLists.get("firstobjective"));
        form.setJspsBackingList((java.util.List)backingLists.get("jsps"));
        form.setJ2eeStoryBackingList((java.util.List)backingLists.get("j2eeStory"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.SentenceForm form = (net.storyteller.model.crud.SentenceForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getSentenceManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getSentenceManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_StrutsAction")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_StrutsAction"));
            form.setStrutsActions(array);
        }
        form.setStrutsActionsBackingList((java.util.List)backingLists.get("strutsActions"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Verb")))
        {
            form.setVerb(new java.lang.Integer(request.getParameter("ref_Verb")));
        }
        form.setVerbBackingList((java.util.List)backingLists.get("verb"));
        if (StringUtils.isNotBlank(request.getParameter("ref_NounClause")))
        {
            form.setSecountobjective(new java.lang.Integer(request.getParameter("ref_NounClause")));
        }
        form.setSecountobjectiveBackingList((java.util.List)backingLists.get("secountobjective"));
        if (StringUtils.isNotBlank(request.getParameter("ref_NounClause")))
        {
            form.setFirstobjective(new java.lang.Integer(request.getParameter("ref_NounClause")));
        }
        form.setFirstobjectiveBackingList((java.util.List)backingLists.get("firstobjective"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Jsp")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_Jsp"));
            form.setJsps(array);
        }
        form.setJspsBackingList((java.util.List)backingLists.get("jsps"));
        if (StringUtils.isNotBlank(request.getParameter("ref_J2eeStory")))
        {
            form.setJ2eeStory(new java.lang.Integer(request.getParameter("ref_J2eeStory")));
        }
        form.setJ2eeStoryBackingList((java.util.List)backingLists.get("j2eeStory"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.SentenceForm form = (net.storyteller.model.crud.SentenceForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getSentenceManageableService().update(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("strutsConfigCode"))) ? null : form.getStrutsConfigCode()
            , (StringUtils.isBlank(request.getParameter("valid"))) ? false : form.isValid()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("strutsActions"))) ? null : form.getStrutsActions()
            , (StringUtils.isBlank(request.getParameter("verb"))) ? null : form.getVerb()
            , (StringUtils.isBlank(request.getParameter("secountobjective"))) ? null : form.getSecountobjective()
            , (StringUtils.isBlank(request.getParameter("firstobjective"))) ? null : form.getFirstobjective()
            , (StringUtils.isBlank(request.getParameter("jsps"))) ? null : form.getJsps()
            , (StringUtils.isBlank(request.getParameter("j2eeStory"))) ? null : form.getJ2eeStory()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.SentenceForm form = (net.storyteller.model.crud.SentenceForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getSentenceManageableService().delete(selectedRows);
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
