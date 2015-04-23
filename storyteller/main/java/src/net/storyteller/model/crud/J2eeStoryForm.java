// license-header java merge-point
package net.storyteller.model.crud;

public final class J2eeStoryForm
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

    private java.util.Date startdate;

    public java.util.Date getStartdate()
    {
        return this.startdate;
    }

    public void setStartdate(java.util.Date startdate)
    {
        this.startdate = startdate;
    }

    private static final java.text.DateFormat startdateFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    static { startdateFormatter.setLenient(true); }

    public java.lang.String getStartdateAsString()
    {
        return (startdate == null) ? null : startdateFormatter.format(startdate);
    }

    public void setStartdateAsString(java.lang.String startdate)
    {
        try
        {
            this.startdate = (org.apache.commons.lang.StringUtils.isBlank(startdate)) ? null : startdateFormatter.parse(startdate);
        }
        catch (java.text.ParseException pe)
        {
            throw new java.lang.RuntimeException(pe);
        }
    }

    private int requiredstorytellerhour;

    public int getRequiredstorytellerhour()
    {
        return this.requiredstorytellerhour;
    }

    public void setRequiredstorytellerhour(int requiredstorytellerhour)
    {
        this.requiredstorytellerhour = requiredstorytellerhour;
    }

    private int requiredteamhour;

    public int getRequiredteamhour()
    {
        return this.requiredteamhour;
    }

    public void setRequiredteamhour(int requiredteamhour)
    {
        this.requiredteamhour = requiredteamhour;
    }

    private int price;

    public int getPrice()
    {
        return this.price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    private java.util.Date enddate;

    public java.util.Date getEnddate()
    {
        return this.enddate;
    }

    public void setEnddate(java.util.Date enddate)
    {
        this.enddate = enddate;
    }

    private static final java.text.DateFormat enddateFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    static { enddateFormatter.setLenient(true); }

    public java.lang.String getEnddateAsString()
    {
        return (enddate == null) ? null : enddateFormatter.format(enddate);
    }

    public void setEnddateAsString(java.lang.String enddate)
    {
        try
        {
            this.enddate = (org.apache.commons.lang.StringUtils.isBlank(enddate)) ? null : enddateFormatter.parse(enddate);
        }
        catch (java.text.ParseException pe)
        {
            throw new java.lang.RuntimeException(pe);
        }
    }

    private java.lang.String strutsconfigcontent;

    public java.lang.String getStrutsconfigcontent()
    {
        return this.strutsconfigcontent;
    }

    public void setStrutsconfigcontent(java.lang.String strutsconfigcontent)
    {
        this.strutsconfigcontent = strutsconfigcontent;
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

    private java.lang.Integer[] nouns;

    public java.lang.Integer[] getNouns()
    {
        return this.nouns;
    }

    public void setNouns(java.lang.Integer[] nouns)
    {
        this.nouns = nouns;
    }

    private java.util.List nounsBackingList;

    public java.util.List getNounsBackingList()
    {
        return this.nounsBackingList;
    }

    public void setNounsBackingList(java.util.List nounsBackingList)
    {
        this.nounsBackingList = nounsBackingList;
    }

    private java.lang.Integer andromdaCoreJarFile;

    public java.lang.Integer getAndromdaCoreJarFile()
    {
        return this.andromdaCoreJarFile;
    }

    public void setAndromdaCoreJarFile(java.lang.Integer andromdaCoreJarFile)
    {
        this.andromdaCoreJarFile = andromdaCoreJarFile;
    }

    private java.util.List andromdaCoreJarFileBackingList;

    public java.util.List getAndromdaCoreJarFileBackingList()
    {
        return this.andromdaCoreJarFileBackingList;
    }

    public void setAndromdaCoreJarFileBackingList(java.util.List andromdaCoreJarFileBackingList)
    {
        this.andromdaCoreJarFileBackingList = andromdaCoreJarFileBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        id = null;
        name = null;
        startdate = null;
        requiredstorytellerhour = 0;
        requiredteamhour = 0;
        price = 0;
        enddate = null;
        strutsconfigcontent = null;
        sentences = null;
        sentencesBackingList = null;
        nouns = null;
        nounsBackingList = null;
        andromdaCoreJarFile = null;
        andromdaCoreJarFileBackingList = null;
    }
}