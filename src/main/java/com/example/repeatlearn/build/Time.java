package com.example.repeatlearn.build;

import java.util.Date;

public class Time{

    private static final int k = 1000 * 60 * 60 * 24;

    public static long getToday(){
        Date date = new Date();
        return date.getTime()/k;
    }

    public static long getLevel_1_day(){
        return getToday()+1;
    }

    public static long getLevel_2_day(){
        return getToday()+3;
    }

    public static long getLevel_3_day(){
        return getToday()+7;
    }

    public static long getLevel_4_day(){
        return getToday()+15;
    }

    public static long getLevel_5_day(){
        return getToday()+30;
    }


}
