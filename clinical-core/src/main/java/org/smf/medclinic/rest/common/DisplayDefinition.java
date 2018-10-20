package org.smf.medclinic.rest.common;

/**
 * @author shehan.fernando
 */
public class DisplayDefinition
{
  private String locale;

  private String question;

  private String description;

  public String getLocale()
  {
    return locale;
  }

  public void setLocale(String locale)
  {
    this.locale = locale;
  }

  public String getQuestion()
  {
    return question;
  }

  public void setQuestion(String question)
  {
    this.question = question;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }
}
