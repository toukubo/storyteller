// license-header java merge-point
package net.storyteller.model.crud;

public final class AndromdaCoreJarFileForm
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
        j2eeStory = null;
        j2eeStoryBackingList = null;
    }
}