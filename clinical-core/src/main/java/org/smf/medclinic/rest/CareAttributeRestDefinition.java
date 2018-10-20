package org.smf.medclinic.rest;

import org.smf.medclinic.rest.common.Meta;

public abstract class CareAttributeRestDefinition<M extends Meta> implements CareConcept
{
  private M meta;

  private boolean mandatory;

  public M getMeta()
  {
    return meta;
  }

  public void setMeta(M meta)
  {
    this.meta = meta;
  }

  public boolean isMandatory()
  {
    return mandatory;
  }

  public void setMandatory(boolean mandatory)
  {
    this.mandatory = mandatory;
  }
}
