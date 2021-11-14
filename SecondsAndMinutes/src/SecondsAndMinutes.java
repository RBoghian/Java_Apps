public class SecondsAndMinutes {
    public static String getDurationString (int minutes, int seconds){
        if((minutes>=0)&&(seconds>=0) && (seconds <=59)){
           int hours = minutes/60;
           int remainingMinutes = minutes%60;
           String hoursString = hours+"h ";
            String minutesString = remainingMinutes+"m ";
            String secondsString = seconds+"s ";
           if(hours<10){
               hoursString = "0"+hoursString;
           }
            if(minutes<10){
               minutesString = "0"+minutesString;
            }
            if(seconds<10){
                secondsString = "0"+secondsString;
            }
            return hoursString+minutesString+secondsString;
           //return hours+"h "+remainingMinutes+"m "+seconds+"s";
        }else{
            return "Invalid value";
        }
    }
    public static String getDurationString (int seconds){
        if(seconds>=0){
          int minutes = seconds/60;
          int remainingSeconds = seconds%60;
          return getDurationString(minutes,remainingSeconds);
        }else{
            return "Invalid value";
        }
    }
}
