package org.smf.medclinic.rest;

import org.smf.medclinic.rest.common.Meta;

public abstract class CareValueRestDefinition<M extends Meta> implements CareConcept
{
  private M meta;

  public M getMeta()
  {
    return meta;
  }

  public void setMeta(M meta)
  {
    this.meta = meta;
  }
}
