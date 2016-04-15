// license-header java merge-point
package net.storyteller.model.crud;

public final class NounForm
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

    private java.lang.String japanese;

    public java.lang.String getJapanese()
    {
        return this.japanese;
    }

    public void setJapanese(java.lang.String japanese)
    {
        this.japanese = japanese;
    }

    private java.lang.Integer[] nounUses;

    public java.lang.Integer[] getNounUses()
    {
        return this.nounUses;
    }

    public void setNounUses(java.lang.Integer[] nounUses)
    {
        this.nounUses = nounUses;
    }

    private java.util.List nounUsesBackingList;

    public java.util.List getNounUsesBackingList()
    {
        return this.nounUsesBackingList;
    }

    public void setNounUsesBackingList(java.util.List nounUsesBackingList)
    {
        this.nounUsesBackingList = nounUsesBackingList;
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

    private java.lang.Integer[] attrs;

    public java.lang.Integer[] getAttrs()
    {
        return this.attrs;
    }

    public void setAttrs(java.lang.Integer[] attrs)
    {
        this.attrs = attrs;
    }

    private java.util.List attrsBackingList;

    public java.util.List getAttrsBackingList()
    {
        return this.attrsBackingList;
    }

    public void setAttrsBackingList(java.util.List attrsBackingList)
    {
        this.attrsBackingList = attrsBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        valid = false;
        name = null;
        japanese = null;
        nounUses = null;
        nounUsesBackingList = null;
        j2eeStory = null;
        j2eeStoryBackingList = null;
        attrs = null;
        attrsBackingList = null;
    }
}