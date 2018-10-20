package org.smf.medclinic.rest.common;

import java.util.List;

/**
 * @author shehan.fernando
 */
public class CodeableConcept
{
  private List<Coding> coding;

  private String name;

  public List<Coding> getCoding()
  {
    return coding;
  }

  public void setCoding(List<Coding> coding)
  {
    this.coding = coding;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
