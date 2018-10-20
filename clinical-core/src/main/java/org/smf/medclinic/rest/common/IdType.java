package org.smf.medclinic.rest.common;

/**
 * @author shehan.fernando
 */
public abstract class IdType<T>
{
    private T value;

    public IdType(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

}