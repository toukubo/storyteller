// license-header java merge-point
package net.storyteller.model.crud;

public final class JspTemplateForm
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

    private java.lang.String template;

    public java.lang.String getTemplate()
    {
        return this.template;
    }

    public void setTemplate(java.lang.String template)
    {
        this.template = template;
    }

    private java.lang.String nametemplate;

    public java.lang.String getNametemplate()
    {
        return this.nametemplate;
    }

    public void setNametemplate(java.lang.String nametemplate)
    {
        this.nametemplate = nametemplate;
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

    private java.lang.Integer[] strutsActionTemplates;

    public java.lang.Integer[] getStrutsActionTemplates()
    {
        return this.strutsActionTemplates;
    }

    public void setStrutsActionTemplates(java.lang.Integer[] strutsActionTemplates)
    {
        this.strutsActionTemplates = strutsActionTemplates;
    }

    private java.util.List strutsActionTemplatesBackingList;

    public java.util.List getStrutsActionTemplatesBackingList()
    {
        return this.strutsActionTemplatesBackingList;
    }

    public void setStrutsActionTemplatesBackingList(java.util.List strutsActionTemplatesBackingList)
    {
        this.strutsActionTemplatesBackingList = strutsActionTemplatesBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        template = null;
        nametemplate = null;
        verb = null;
        verbBackingList = null;
        strutsActionTemplates = null;
        strutsActionTemplatesBackingList = null;
    }
}