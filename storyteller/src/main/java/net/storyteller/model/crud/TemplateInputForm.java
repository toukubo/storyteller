// license-header java merge-point
package net.storyteller.model.crud;

public final class TemplateInputForm
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

    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
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

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        name = null;
        verb = null;
        verbBackingList = null;
    }
}