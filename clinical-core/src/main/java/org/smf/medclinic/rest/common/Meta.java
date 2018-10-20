package org.smf.medclinic.rest.common;

/**
 * @author shehan.fernando
 */
public class Meta<I extends IdType>
{
    private I id;

    public I getId()
    {
        return id;
    }

    public void setId(I id)
    {
        this.id = id;
    }
}