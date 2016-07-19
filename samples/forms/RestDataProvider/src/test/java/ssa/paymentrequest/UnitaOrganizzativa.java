package ssa.paymentrequest;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * This class was automatically generated by the data modeler tool.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UnitaOrganizzativa implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String codice;
   private java.lang.String descrizione;
   private java.lang.String id;

   public UnitaOrganizzativa()
   {
   }

   public java.lang.String getCodice()
   {
      return this.codice;
   }

   public void setCodice(java.lang.String codice)
   {
      this.codice = codice;
   }

   public java.lang.String getDescrizione()
   {
      return this.descrizione;
   }

   public void setDescrizione(java.lang.String descrizione)
   {
      this.descrizione = descrizione;
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public UnitaOrganizzativa(java.lang.String codice,
         java.lang.String descrizione, java.lang.String id)
   {
      this.codice = codice;
      this.descrizione = descrizione;
      this.id = id;
   }

}