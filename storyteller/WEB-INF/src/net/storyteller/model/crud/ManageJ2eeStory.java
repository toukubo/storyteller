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

public final class ManageJ2eeStory extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.J2eeStoryForm form = (net.storyteller.model.crud.J2eeStoryForm)actionForm;

        net.storyteller.ManageableServiceLocator.instance().getJ2eeStoryManageableService().create(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("startdateAsString"))) ? null : form.getStartdate()
            , (StringUtils.isBlank(request.getParameter("requiredstorytellerhour"))) ? 0 : form.getRequiredstorytellerhour()
            , (StringUtils.isBlank(request.getParameter("requiredteamhour"))) ? 0 : form.getRequiredteamhour()
            , (StringUtils.isBlank(request.getParameter("price"))) ? 0 : form.getPrice()
            , (StringUtils.isBlank(request.getParameter("enddateAsString"))) ? null : form.getEnddate()
            , (StringUtils.isBlank(request.getParameter("strutsconfigcontent"))) ? null : form.getStrutsconfigcontent()
            , (StringUtils.isBlank(request.getParameter("sentences"))) ? null : form.getSentences()
            , (StringUtils.isBlank(request.getParameter("nouns"))) ? null : form.getNouns()
            , (StringUtils.isBlank(request.getParameter("andromdaCoreJarFile"))) ? null : form.getAndromdaCoreJarFile()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.J2eeStoryForm form = (net.storyteller.model.crud.J2eeStoryForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getJ2eeStoryManageableService().read(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("startdateAsString"))) ? null : form.getStartdate()
            , (StringUtils.isBlank(request.getParameter("requiredstorytellerhour"))) ? 0 : form.getRequiredstorytellerhour()
            , (StringUtils.isBlank(request.getParameter("requiredteamhour"))) ? 0 : form.getRequiredteamhour()
            , (StringUtils.isBlank(request.getParameter("price"))) ? 0 : form.getPrice()
            , (StringUtils.isBlank(request.getParameter("enddateAsString"))) ? null : form.getEnddate()
            , (StringUtils.isBlank(request.getParameter("strutsconfigcontent"))) ? null : form.getStrutsconfigcontent()
            , (StringUtils.isBlank(request.getParameter("sentences"))) ? null : form.getSentences()
            , (StringUtils.isBlank(request.getParameter("nouns"))) ? null : form.getNouns()
            , (StringUtils.isBlank(request.getParameter("andromdaCoreJarFile"))) ? null : form.getAndromdaCoreJarFile()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getJ2eeStoryManageableService().readBackingLists();
        form.setSentencesBackingList((java.util.List)backingLists.get("sentences"));
        form.setNounsBackingList((java.util.List)backingLists.get("nouns"));
        form.setAndromdaCoreJarFileBackingList((java.util.List)backingLists.get("andromdaCoreJarFile"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.J2eeStoryForm form = (net.storyteller.model.crud.J2eeStoryForm)actionForm;

        final java.util.List list = net.storyteller.ManageableServiceLocator.instance().getJ2eeStoryManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = net.storyteller.ManageableServiceLocator.instance().getJ2eeStoryManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_Sentence")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_Sentence"));
            form.setSentences(array);
        }
        form.setSentencesBackingList((java.util.List)backingLists.get("sentences"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Noun")))
        {
            final java.lang.Integer[] array = new java.lang.Integer[1];
            array[0] = new java.lang.Integer(request.getParameter("ref_Noun"));
            form.setNouns(array);
        }
        form.setNounsBackingList((java.util.List)backingLists.get("nouns"));
        if (StringUtils.isNotBlank(request.getParameter("ref_AndromdaCoreJarFile")))
        {
            form.setAndromdaCoreJarFile(new java.lang.Integer(request.getParameter("ref_AndromdaCoreJarFile")));
        }
        form.setAndromdaCoreJarFileBackingList((java.util.List)backingLists.get("andromdaCoreJarFile"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.J2eeStoryForm form = (net.storyteller.model.crud.J2eeStoryForm) actionForm;

        net.storyteller.ManageableServiceLocator.instance().getJ2eeStoryManageableService().update(
            (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("startdateAsString"))) ? null : form.getStartdate()
            , (StringUtils.isBlank(request.getParameter("requiredstorytellerhour"))) ? 0 : form.getRequiredstorytellerhour()
            , (StringUtils.isBlank(request.getParameter("requiredteamhour"))) ? 0 : form.getRequiredteamhour()
            , (StringUtils.isBlank(request.getParameter("price"))) ? 0 : form.getPrice()
            , (StringUtils.isBlank(request.getParameter("enddateAsString"))) ? null : form.getEnddate()
            , (StringUtils.isBlank(request.getParameter("strutsconfigcontent"))) ? null : form.getStrutsconfigcontent()
            , (StringUtils.isBlank(request.getParameter("sentences"))) ? null : form.getSentences()
            , (StringUtils.isBlank(request.getParameter("nouns"))) ? null : form.getNouns()
            , (StringUtils.isBlank(request.getParameter("andromdaCoreJarFile"))) ? null : form.getAndromdaCoreJarFile()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final net.storyteller.model.crud.J2eeStoryForm form = (net.storyteller.model.crud.J2eeStoryForm) actionForm;

        final java.lang.Integer[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            net.storyteller.ManageableServiceLocator.instance().getJ2eeStoryManageableService().delete(selectedRows);
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
