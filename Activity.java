
/**
 * An instance of class Activity represents the sort of
 * activities that might be added to a calendar.
 * 
 * @author M250 MT
 * @version 1.0
 */
public class Activity
{
   // instance variables 
   private String name;
   private String date; // in format "ddmmyy"
   private String time; // in format "hhmm" from "0000" to "2359"

   /**
    * Constructor for objects of class Activity
    */
   public Activity(String aName, String aDate, String aTime)
   {
      // initialise instance variables
      name = aName;
      date = aDate;
      time = aTime;
   }

   /**
    * Setter for the date
    */
   public void setDate(String aDate)
   {
      date = aDate;
   }
   
   /**
    * Setter for the time
    */
   public void setTime(String aTime)
   {
      time = aTime;
   }
   
   /**
    *  Setter for the name
    */
   public void setName(String aName)
   {
      name = aName;
   }
   
   /**
    *  Getter for the date
    */
   public String getDate()
   {
      return date;
   }
   
   /**
    *  Getter for the time
    */
   public String getTime()
   {
      return time;
   }
   
   /**
    *  Getter for the name
    */
   public String getName()
   {
      return name;
   }
   
    /**
    * Returns true if the names, dates and times
    * for two Activity objects are the same, and
    * false if otherwise.
    */
   @Override
   public boolean equals(Object obj)
   {
      Activity activity = (Activity) obj;
     
      if (this.getName() == activity.getName() && this.getDate() == activity.getDate()
      && this.getTime() == activity.getTime())
      {
         return true;
      }
      else
      {
         return false;
      }
   }
 
   /**
    * Returns the number of characters in the name
    * of an Activity object.
    */
   @Override
   public int hashCode()
   {
      return this.name.length();
   }
}
