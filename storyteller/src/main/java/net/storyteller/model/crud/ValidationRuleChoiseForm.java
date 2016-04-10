// license-header java merge-point
package net.storyteller.model.crud;

public final class ValidationRuleChoiseForm
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

    private java.lang.Long[] selectedRows = null;

    public java.lang.Long[] getSelectedRows()
    {
        return this.selectedRows;
    }

    public void setSelectedRows(java.lang.Long[] selectedRows)
    {
        this.selectedRows = selectedRows;
    }

    private java.lang.String actualcode;

    public java.lang.String getActualcode()
    {
        return this.actualcode;
    }

    public void setActualcode(java.lang.String actualcode)
    {
        this.actualcode = actualcode;
    }

    private java.lang.String errormessage;

    public java.lang.String getErrormessage()
    {
        return this.errormessage;
    }

    public void setErrormessage(java.lang.String errormessage)
    {
        this.errormessage = errormessage;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Integer validationRule;

    public java.lang.Integer getValidationRule()
    {
        return this.validationRule;
    }

    public void setValidationRule(java.lang.Integer validationRule)
    {
        this.validationRule = validationRule;
    }

    private java.util.List validationRuleBackingList;

    public java.util.List getValidationRuleBackingList()
    {
        return this.validationRuleBackingList;
    }

    public void setValidationRuleBackingList(java.util.List validationRuleBackingList)
    {
        this.validationRuleBackingList = validationRuleBackingList;
    }

    private java.lang.Integer attrUse;

    public java.lang.Integer getAttrUse()
    {
        return this.attrUse;
    }

    public void setAttrUse(java.lang.Integer attrUse)
    {
        this.attrUse = attrUse;
    }

    private java.util.List attrUseBackingList;

    public java.util.List getAttrUseBackingList()
    {
        return this.attrUseBackingList;
    }

    public void setAttrUseBackingList(java.util.List attrUseBackingList)
    {
        this.attrUseBackingList = attrUseBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        actualcode = null;
        errormessage = null;
        id = null;
        validationRule = null;
        validationRuleBackingList = null;
        attrUse = null;
        attrUseBackingList = null;
    }
}