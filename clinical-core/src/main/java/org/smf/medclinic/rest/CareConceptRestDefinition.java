package org.smf.medclinic.rest;

import org.smf.medclinic.rest.common.Meta;

import java.util.List;

/**
 * @author shehan.fernando
 */
public abstract class CareConceptRestDefinition<M extends Meta> implements CareConcept
{

  private M meta;

  private List<CareConcept> components;

  public M getMeta()
  {
    return meta;
  }

  public void setMeta(M meta)
  {
    this.meta = meta;
  }

  public List<CareConcept> getComponents()
  {
    return components;
  }

  public void setComponents(List<CareConcept> components)
  {
    this.components = components;
  }
}
