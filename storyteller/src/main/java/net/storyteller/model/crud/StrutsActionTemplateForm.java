// license-header java merge-point
package net.storyteller.model.crud;

public final class StrutsActionTemplateForm
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

    private java.lang.Integer targeteeaction;

    public java.lang.Integer getTargeteeaction()
    {
        return this.targeteeaction;
    }

    public void setTargeteeaction(java.lang.Integer targeteeaction)
    {
        this.targeteeaction = targeteeaction;
    }

    private java.util.List targeteeactionBackingList;

    public java.util.List getTargeteeactionBackingList()
    {
        return this.targeteeactionBackingList;
    }

    public void setTargeteeactionBackingList(java.util.List targeteeactionBackingList)
    {
        this.targeteeactionBackingList = targeteeactionBackingList;
    }

    private java.lang.Integer[] targeteraction;

    public java.lang.Integer[] getTargeteraction()
    {
        return this.targeteraction;
    }

    public void setTargeteraction(java.lang.Integer[] targeteraction)
    {
        this.targeteraction = targeteraction;
    }

    private java.util.List targeteractionBackingList;

    public java.util.List getTargeteractionBackingList()
    {
        return this.targeteractionBackingList;
    }

    public void setTargeteractionBackingList(java.util.List targeteractionBackingList)
    {
        this.targeteractionBackingList = targeteractionBackingList;
    }

    private java.lang.Integer jspTemplate;

    public java.lang.Integer getJspTemplate()
    {
        return this.jspTemplate;
    }

    public void setJspTemplate(java.lang.Integer jspTemplate)
    {
        this.jspTemplate = jspTemplate;
    }

    private java.util.List jspTemplateBackingList;

    public java.util.List getJspTemplateBackingList()
    {
        return this.jspTemplateBackingList;
    }

    public void setJspTemplateBackingList(java.util.List jspTemplateBackingList)
    {
        this.jspTemplateBackingList = jspTemplateBackingList;
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
        targeteeaction = null;
        targeteeactionBackingList = null;
        targeteraction = null;
        targeteractionBackingList = null;
        jspTemplate = null;
        jspTemplateBackingList = null;
    }
}