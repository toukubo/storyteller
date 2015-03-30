// license-header java merge-point
package net.storyteller.model.crud;

public final class AttrUseForm
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

    private java.lang.Long[] validationRuleChoises;

    public java.lang.Long[] getValidationRuleChoises()
    {
        return this.validationRuleChoises;
    }

    public void setValidationRuleChoises(java.lang.Long[] validationRuleChoises)
    {
        this.validationRuleChoises = validationRuleChoises;
    }

    private java.util.List validationRuleChoisesBackingList;

    public java.util.List getValidationRuleChoisesBackingList()
    {
        return this.validationRuleChoisesBackingList;
    }

    public void setValidationRuleChoisesBackingList(java.util.List validationRuleChoisesBackingList)
    {
        this.validationRuleChoisesBackingList = validationRuleChoisesBackingList;
    }

    private java.lang.Integer attr;

    public java.lang.Integer getAttr()
    {
        return this.attr;
    }

    public void setAttr(java.lang.Integer attr)
    {
        this.attr = attr;
    }

    private java.util.List attrBackingList;

    public java.util.List getAttrBackingList()
    {
        return this.attrBackingList;
    }

    public void setAttrBackingList(java.util.List attrBackingList)
    {
        this.attrBackingList = attrBackingList;
    }

    private java.lang.Integer nounUse;

    public java.lang.Integer getNounUse()
    {
        return this.nounUse;
    }

    public void setNounUse(java.lang.Integer nounUse)
    {
        this.nounUse = nounUse;
    }

    private java.util.List nounUseBackingList;

    public java.util.List getNounUseBackingList()
    {
        return this.nounUseBackingList;
    }

    public void setNounUseBackingList(java.util.List nounUseBackingList)
    {
        this.nounUseBackingList = nounUseBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        validationRuleChoises = null;
        validationRuleChoisesBackingList = null;
        attr = null;
        attrBackingList = null;
        nounUse = null;
        nounUseBackingList = null;
    }
}