public class TimeInterval {
    private final int MINUTES_PER_DAY = 24 * 60;

   private int time1;
   private int time2;

  
   public TimeInterval(int military1, int military2)
   {
      int hours1 = military1 / 100;
      int minutes1 = military1 % 100;

      int hours2 = military2 / 100;
      int minutes2 = military2 % 100;

      time1 = hours1 * 60 + minutes1;
      time2 = hours2 * 60 + minutes2;
   }

   
   public int getHours()
   {
      int timeDifference = (time2 - time1 + MINUTES_PER_DAY) % MINUTES_PER_DAY;
      return timeDifference / 60;
   }

   
   public int getMinutes()
   {
      int timeDifference = (time2 - time1 + MINUTES_PER_DAY) % MINUTES_PER_DAY;
      return timeDifference % 60;
   }
    
}
