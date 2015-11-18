package primed_drools.projectrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Project implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Project Id")
   private java.lang.Integer id;
   @org.kie.api.definition.type.Label(value = "Project Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "Project Start Date")
   private java.util.Date startDate;
   @org.kie.api.definition.type.Label(value = "Project End Date")
   private java.util.Date endDate;
   @org.kie.api.definition.type.Label(value = "Duration")
   private java.lang.Long duration;
   @org.kie.api.definition.type.Label(value = "Priority")
   private java.lang.String priority;

   public Project()
   {
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }

   public void setId(java.lang.Integer id)
   {
      this.id = id;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.util.Date getStartDate()
   {
      return this.startDate;
   }

   public void setStartDate(java.util.Date startDate)
   {
      this.startDate = startDate;
   }

   public java.util.Date getEndDate()
   {
      return this.endDate;
   }

   public void setEndDate(java.util.Date endDate)
   {
      this.endDate = endDate;
   }

   public java.lang.Long getDuration()
   {
      return this.duration;
   }

   public void setDuration(java.lang.Long duration)
   {
      this.duration = duration;
   }

   public java.lang.String getPriority()
   {
      return this.priority;
   }

   public void setPriority(java.lang.String priority)
   {
      this.priority = priority;
   }

   public Project(java.lang.Integer id, java.lang.String name,
         java.util.Date startDate, java.util.Date endDate,
         java.lang.Long duration, java.lang.String priority)
   {
      this.id = id;
      this.name = name;
      this.startDate = startDate;
      this.endDate = endDate;
      this.duration = duration;
      this.priority = priority;
   }

}