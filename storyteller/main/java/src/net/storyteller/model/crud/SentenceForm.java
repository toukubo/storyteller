// license-header java merge-point
package net.storyteller.model.crud;

public final class SentenceForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
    private java.util.List manageableList = null;

    public java.util.List getManageableList()
    {
        return this.manageableList;
    }

    public void setManageableList(java.util.List manageableList)
    {
        this.manageableList = manageableList;
    }

    private java.lang.Integer[] selectedRows = null;

    public java.lang.Integer[] getSelectedRows()
    {
        return this.selectedRows;
    }

    public void setSelectedRows(java.lang.Integer[] selectedRows)
    {
        this.selectedRows = selectedRows;
    }

    private java.lang.Integer id;

    public java.lang.Integer getId()
    {
        return this.id;
    }

    public void setId(java.lang.Integer id)
    {
        this.id = id;
    }

    private java.lang.String strutsConfigCode;

    public java.lang.String getStrutsConfigCode()
    {
        return this.strutsConfigCode;
    }

    public void setStrutsConfigCode(java.lang.String strutsConfigCode)
    {
        this.strutsConfigCode = strutsConfigCode;
    }

    private boolean valid;

    public boolean isValid()
    {
        return this.valid;
    }

    public void setValid(boolean valid)
    {
        this.valid = valid;
    }

    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.Integer[] strutsActions;

    public java.lang.Integer[] getStrutsActions()
    {
        return this.strutsActions;
    }

    public void setStrutsActions(java.lang.Integer[] strutsActions)
    {
        this.strutsActions = strutsActions;
    }

    private java.util.List strutsActionsBackingList;

    public java.util.List getStrutsActionsBackingList()
    {
        return this.strutsActionsBackingList;
    }

    public void setStrutsActionsBackingList(java.util.List strutsActionsBackingList)
    {
        this.strutsActionsBackingList = strutsActionsBackingList;
    }

    private java.lang.Integer verb;

    public java.lang.Integer getVerb()
    {
        return this.verb;
    }

    public void setVerb(java.lang.Integer verb)
    {
        this.verb = verb;
    }

    private java.util.List verbBackingList;

    public java.util.List getVerbBackingList()
    {
        return this.verbBackingList;
    }

    public void setVerbBackingList(java.util.List verbBackingList)
    {
        this.verbBackingList = verbBackingList;
    }

    private java.lang.Integer secountobjective;

    public java.lang.Integer getSecountobjective()
    {
        return this.secountobjective;
    }

    public void setSecountobjective(java.lang.Integer secountobjective)
    {
        this.secountobjective = secountobjective;
    }

    private java.util.List secountobjectiveBackingList;

    public java.util.List getSecountobjectiveBackingList()
    {
        return this.secountobjectiveBackingList;
    }

    public void setSecountobjectiveBackingList(java.util.List secountobjectiveBackingList)
    {
        this.secountobjectiveBackingList = secountobjectiveBackingList;
    }

    private java.lang.Integer firstobjective;

    public java.lang.Integer getFirstobjective()
    {
        return this.firstobjective;
    }

    public void setFirstobjective(java.lang.Integer firstobjective)
    {
        this.firstobjective = firstobjective;
    }

    private java.util.List firstobjectiveBackingList;

    public java.util.List getFirstobjectiveBackingList()
    {
        return this.firstobjectiveBackingList;
    }

    public void setFirstobjectiveBackingList(java.util.List firstobjectiveBackingList)
    {
        this.firstobjectiveBackingList = firstobjectiveBackingList;
    }

    private java.lang.Integer[] jsps;

    public java.lang.Integer[] getJsps()
    {
        return this.jsps;
    }

    public void setJsps(java.lang.Integer[] jsps)
    {
        this.jsps = jsps;
    }

    private java.util.List jspsBackingList;

    public java.util.List getJspsBackingList()
    {
        return this.jspsBackingList;
    }

    public void setJspsBackingList(java.util.List jspsBackingList)
    {
        this.jspsBackingList = jspsBackingList;
    }

    private java.lang.Integer j2eeStory;

    public java.lang.Integer getJ2eeStory()
    {
        return this.j2eeStory;
    }

    public void setJ2eeStory(java.lang.Integer j2eeStory)
    {
        this.j2eeStory = j2eeStory;
    }

    private java.util.List j2eeStoryBackingList;

    public java.util.List getJ2eeStoryBackingList()
    {
        return this.j2eeStoryBackingList;
    }

    public void setJ2eeStoryBackingList(java.util.List j2eeStoryBackingList)
    {
        this.j2eeStoryBackingList = j2eeStoryBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        strutsConfigCode = null;
        valid = false;
        name = null;
        strutsActions = null;
        strutsActionsBackingList = null;
        verb = null;
        verbBackingList = null;
        secountobjective = null;
        secountobjectiveBackingList = null;
        firstobjective = null;
        firstobjectiveBackingList = null;
        jsps = null;
        jspsBackingList = null;
        j2eeStory = null;
        j2eeStoryBackingList = null;
    }
}