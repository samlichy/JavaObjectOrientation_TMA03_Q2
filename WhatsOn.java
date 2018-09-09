import java.util.*;
import ou.*;

/**
 * Instances of class WhatsOn represent a collection of
 * activities that can be added to, removed, searched etc.
 * 
 * Inspired by Amazon's Echo Dot
 * 
 * @author Sam Lichy
 * @version 08/05/2018
 */
public class WhatsOn
{
   private static String today;
   private static int nextId;
   private Map<Integer, Activity> activities;

   /**
    * Constructor for objects of class WhatsOn
    */
   public WhatsOn()
   {
      activities = new HashMap<Integer, Activity>();
      today = "010117";
      nextId = 1;
   }
   
   /**
    * Updates the value of today  - provided
    */
   public void updateDate(String newDate)
   {
      today = newDate;
   }
   
   /**
    * Creates an instance of Activity and adds it
    * to the map referenced by the current value
    * of nextID as the key. 
    * 
    * The value of nextId is then incremented.
    */
   public void addActivity(String aName, String aDate, String aTime)
   {
      Activity newActivity = new Activity(aName, aDate, aTime);
      activities.put(nextId, newActivity);
      
      nextId++;
   }
   
   /**
    * For each activity, determines whether or not 
    * the date is today's date. If so, the data for 
    * that activity should be printed to the standard 
    * output, with the details of each activity on a 
    * separate line. 
    * 
    * If no activities are found for today, then "Nothing
    * on today" is output.
    */
   public void whatsOnToday()
   {
      Set<Integer> activitiesKeys = activities.keySet();

      for (Integer id: activitiesKeys)
      {
         if (activities.get(id).getDate() == today)
         {
            String name = activities.get(id).getName();
            String time = activities.get(id).getTime();
           
            System.out.println("Today you have " + name + " at " + time);
         }
      }
   }
   
   /**
    * Determines whether or not the activity with a name,
    * date and time that matches the arguments is one of
    * the values in the map references by activities. 
    * 
    * If so, the key-value pair with this value should be 
    * removed from the map. 
    */
   public String removeActivity(String thisName, String thisDate, String thisTime)
   {
      Set<Integer> activitiesKeys = activities.keySet();
      String result = null;

      for (Integer id: activitiesKeys)
      {
            String name = activities.get(id).getName();
            String time = activities.get(id).getTime();
            String date = activities.get(id).getDate();
            
            if (name == thisName && time == thisTime && date == thisDate)
            {
               activities.remove(id);
               
               result = "Removed successfully";
            }
            else
            {
               result = "Failed to remove";
            }
      }
      
      return result;
   }
}
