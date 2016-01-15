// license-header java merge-point
package net.storyteller.model.crud;

public final class StrutsActionForm
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

    private java.lang.String filename;

    public java.lang.String getFilename()
    {
        return this.filename;
    }

    public void setFilename(java.lang.String filename)
    {
        this.filename = filename;
    }

    private java.lang.Integer sentence;

    public java.lang.Integer getSentence()
    {
        return this.sentence;
    }

    public void setSentence(java.lang.Integer sentence)
    {
        this.sentence = sentence;
    }

    private java.util.List sentenceBackingList;

    public java.util.List getSentenceBackingList()
    {
        return this.sentenceBackingList;
    }

    public void setSentenceBackingList(java.util.List sentenceBackingList)
    {
        this.sentenceBackingList = sentenceBackingList;
    }

    private java.lang.Integer targeteejsp;

    public java.lang.Integer getTargeteejsp()
    {
        return this.targeteejsp;
    }

    public void setTargeteejsp(java.lang.Integer targeteejsp)
    {
        this.targeteejsp = targeteejsp;
    }

    private java.util.List targeteejspBackingList;

    public java.util.List getTargeteejspBackingList()
    {
        return this.targeteejspBackingList;
    }

    public void setTargeteejspBackingList(java.util.List targeteejspBackingList)
    {
        this.targeteejspBackingList = targeteejspBackingList;
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

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        code = null;
        filename = null;
        sentence = null;
        sentenceBackingList = null;
        targeteejsp = null;
        targeteejspBackingList = null;
        targeteraction = null;
        targeteractionBackingList = null;
        targeteeaction = null;
        targeteeactionBackingList = null;
    }
}