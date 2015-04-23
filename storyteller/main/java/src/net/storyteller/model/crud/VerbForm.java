// license-header java merge-point
package net.storyteller.model.crud;

public final class VerbForm
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

    private boolean twoobjects;

    public boolean isTwoobjects()
    {
        return this.twoobjects;
    }

    public void setTwoobjects(boolean twoobjects)
    {
        this.twoobjects = twoobjects;
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

    private java.lang.Integer[] jspTemplates;

    public java.lang.Integer[] getJspTemplates()
    {
        return this.jspTemplates;
    }

    public void setJspTemplates(java.lang.Integer[] jspTemplates)
    {
        this.jspTemplates = jspTemplates;
    }

    private java.util.List jspTemplatesBackingList;

    public java.util.List getJspTemplatesBackingList()
    {
        return this.jspTemplatesBackingList;
    }

    public void setJspTemplatesBackingList(java.util.List jspTemplatesBackingList)
    {
        this.jspTemplatesBackingList = jspTemplatesBackingList;
    }

    private java.lang.Integer[] sentences;

    public java.lang.Integer[] getSentences()
    {
        return this.sentences;
    }

    public void setSentences(java.lang.Integer[] sentences)
    {
        this.sentences = sentences;
    }

    private java.util.List sentencesBackingList;

    public java.util.List getSentencesBackingList()
    {
        return this.sentencesBackingList;
    }

    public void setSentencesBackingList(java.util.List sentencesBackingList)
    {
        this.sentencesBackingList = sentencesBackingList;
    }

    private java.lang.Integer[] templateInputs;

    public java.lang.Integer[] getTemplateInputs()
    {
        return this.templateInputs;
    }

    public void setTemplateInputs(java.lang.Integer[] templateInputs)
    {
        this.templateInputs = templateInputs;
    }

    private java.util.List templateInputsBackingList;

    public java.util.List getTemplateInputsBackingList()
    {
        return this.templateInputsBackingList;
    }

    public void setTemplateInputsBackingList(java.util.List templateInputsBackingList)
    {
        this.templateInputsBackingList = templateInputsBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        twoobjects = false;
        valid = false;
        name = null;
        strutsActionTemplates = null;
        strutsActionTemplatesBackingList = null;
        jspTemplates = null;
        jspTemplatesBackingList = null;
        sentences = null;
        sentencesBackingList = null;
        templateInputs = null;
        templateInputsBackingList = null;
    }
}