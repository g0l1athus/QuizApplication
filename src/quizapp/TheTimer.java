package quizapp;

import java.util.Calendar;

public class TheTimer {

    Calendar c1, c2;
    long time1,time2,minutes,seconds;
    
    public void setTime1(){
        c1 = Calendar.getInstance();
    }
    
    public void setTime2(){
        c2 = Calendar.getInstance();
    }
    
    public void getTime1(){
        time1 = c1.getTimeInMillis();
    }
    
    public void getTime2(){
        time2 = c2.getTimeInMillis();
    }
    
    public long getMinutes(){
        return ((time2-time1)/1000)/60;
    }
    
    public long getSeconds(){
        return ((time2-time1)/1000)%60;
    } 
}
