// license-header java merge-point
package net.storyteller.model.crud;

public final class ValidationRuleForm
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

    private java.lang.String defaulterrormessage;

    public java.lang.String getDefaulterrormessage()
    {
        return this.defaulterrormessage;
    }

    public void setDefaulterrormessage(java.lang.String defaulterrormessage)
    {
        this.defaulterrormessage = defaulterrormessage;
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

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        defaulterrormessage = null;
        id = null;
        name = null;
        validationRuleChoises = null;
        validationRuleChoisesBackingList = null;
    }
}