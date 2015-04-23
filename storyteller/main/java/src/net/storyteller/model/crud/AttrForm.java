// license-header java merge-point
package net.storyteller.model.crud;

public final class AttrForm
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

    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String classtype;

    public java.lang.String getClasstype()
    {
        return this.classtype;
    }

    public void setClasstype(java.lang.String classtype)
    {
        this.classtype = classtype;
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

    private java.lang.String japanese;

    public java.lang.String getJapanese()
    {
        return this.japanese;
    }

    public void setJapanese(java.lang.String japanese)
    {
        this.japanese = japanese;
    }

    private java.lang.Integer noun;

    public java.lang.Integer getNoun()
    {
        return this.noun;
    }

    public void setNoun(java.lang.Integer noun)
    {
        this.noun = noun;
    }

    private java.util.List nounBackingList;

    public java.util.List getNounBackingList()
    {
        return this.nounBackingList;
    }

    public void setNounBackingList(java.util.List nounBackingList)
    {
        this.nounBackingList = nounBackingList;
    }

    private java.lang.Integer[] attrUses;

    public java.lang.Integer[] getAttrUses()
    {
        return this.attrUses;
    }

    public void setAttrUses(java.lang.Integer[] attrUses)
    {
        this.attrUses = attrUses;
    }

    private java.util.List attrUsesBackingList;

    public java.util.List getAttrUsesBackingList()
    {
        return this.attrUsesBackingList;
    }

    public void setAttrUsesBackingList(java.util.List attrUsesBackingList)
    {
        this.attrUsesBackingList = attrUsesBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        name = null;
        classtype = null;
        id = null;
        japanese = null;
        noun = null;
        nounBackingList = null;
        attrUses = null;
        attrUsesBackingList = null;
    }
}