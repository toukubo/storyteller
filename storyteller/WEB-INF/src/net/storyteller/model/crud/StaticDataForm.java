// license-header java merge-point
package net.storyteller.model.crud;

public final class StaticDataForm
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

    private java.lang.String documentArrivedReportTemplate;

    public java.lang.String getDocumentArrivedReportTemplate()
    {
        return this.documentArrivedReportTemplate;
    }

    public void setDocumentArrivedReportTemplate(java.lang.String documentArrivedReportTemplate)
    {
        this.documentArrivedReportTemplate = documentArrivedReportTemplate;
    }

    private java.lang.String documentRequestTemplate;

    public java.lang.String getDocumentRequestTemplate()
    {
        return this.documentRequestTemplate;
    }

    public void setDocumentRequestTemplate(java.lang.String documentRequestTemplate)
    {
        this.documentRequestTemplate = documentRequestTemplate;
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

    private java.lang.String inforssurl;

    public java.lang.String getInforssurl()
    {
        return this.inforssurl;
    }

    public void setInforssurl(java.lang.String inforssurl)
    {
        this.inforssurl = inforssurl;
    }

    private java.lang.String reportmail;

    public java.lang.String getReportmail()
    {
        return this.reportmail;
    }

    public void setReportmail(java.lang.String reportmail)
    {
        this.reportmail = reportmail;
    }

    private int crtmax;

    public int getCrtmax()
    {
        return this.crtmax;
    }

    public void setCrtmax(int crtmax)
    {
        this.crtmax = crtmax;
    }

    private int arpmax;

    public int getArpmax()
    {
        return this.arpmax;
    }

    public void setArpmax(int arpmax)
    {
        this.arpmax = arpmax;
    }

    private java.lang.String eclipseroot;

    public java.lang.String getEclipseroot()
    {
        return this.eclipseroot;
    }

    public void setEclipseroot(java.lang.String eclipseroot)
    {
        this.eclipseroot = eclipseroot;
    }

    private float storytellerbyprojectteamrate;

    public float getStorytellerbyprojectteamrate()
    {
        return this.storytellerbyprojectteamrate;
    }

    public void setStorytellerbyprojectteamrate(float storytellerbyprojectteamrate)
    {
        this.storytellerbyprojectteamrate = storytellerbyprojectteamrate;
    }

    private float projectbystorytellerrate;

    public float getProjectbystorytellerrate()
    {
        return this.projectbystorytellerrate;
    }

    public void setProjectbystorytellerrate(float projectbystorytellerrate)
    {
        this.projectbystorytellerrate = projectbystorytellerrate;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        documentArrivedReportTemplate = null;
        documentRequestTemplate = null;
        id = null;
        inforssurl = null;
        reportmail = null;
        crtmax = 0;
        arpmax = 0;
        eclipseroot = null;
        storytellerbyprojectteamrate = 0;
        projectbystorytellerrate = 0;
    }
}