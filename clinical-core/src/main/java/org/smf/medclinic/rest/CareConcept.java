package org.smf.medclinic.rest;

import org.smf.medclinic.rest.common.CodeableConcept;
import org.smf.medclinic.rest.common.DisplayDefinition;
import org.smf.medclinic.rest.common.Meta;

/**
 * @author shehan.fernando
 */
public interface CareConcept<I extends DisplayDefinition, M extends Meta>
{
  /**
   * 
   * @return
   */
  I getLanguage();

  /**
   * 
   * @return
   */
  CodeableConcept getTerminologies();

  /**
   * 
   * @return
   */
  M getMeta();
}
