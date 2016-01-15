// license-header java merge-point
package net.storyteller.model.crud;

public final class NounClauseForm
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

    private java.lang.String code;

    public java.lang.String getCode()
    {
        return this.code;
    }

    public void setCode(java.lang.String code)
    {
        this.code = code;
    }

    private java.lang.Integer[] ofuse;

    public java.lang.Integer[] getOfuse()
    {
        return this.ofuse;
    }

    public void setOfuse(java.lang.Integer[] ofuse)
    {
        this.ofuse = ofuse;
    }

    private java.util.List ofuseBackingList;

    public java.util.List getOfuseBackingList()
    {
        return this.ofuseBackingList;
    }

    public void setOfuseBackingList(java.util.List ofuseBackingList)
    {
        this.ofuseBackingList = ofuseBackingList;
    }

    private java.lang.Integer[] assecoud;

    public java.lang.Integer[] getAssecoud()
    {
        return this.assecoud;
    }

    public void setAssecoud(java.lang.Integer[] assecoud)
    {
        this.assecoud = assecoud;
    }

    private java.util.List assecoudBackingList;

    public java.util.List getAssecoudBackingList()
    {
        return this.assecoudBackingList;
    }

    public void setAssecoudBackingList(java.util.List assecoudBackingList)
    {
        this.assecoudBackingList = assecoudBackingList;
    }

    private java.lang.Integer[] asfirst;

    public java.lang.Integer[] getAsfirst()
    {
        return this.asfirst;
    }

    public void setAsfirst(java.lang.Integer[] asfirst)
    {
        this.asfirst = asfirst;
    }

    private java.util.List asfirstBackingList;

    public java.util.List getAsfirstBackingList()
    {
        return this.asfirstBackingList;
    }

    public void setAsfirstBackingList(java.util.List asfirstBackingList)
    {
        this.asfirstBackingList = asfirstBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        code = null;
        ofuse = null;
        ofuseBackingList = null;
        assecoud = null;
        assecoudBackingList = null;
        asfirst = null;
        asfirstBackingList = null;
    }
}