package com.termwork.customer.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static long getDays(String start, String end){
        long day = 0;
        try {
            Date s = toDate(start);
            Date e = toDate(end);
            long st = s.getTime();
            long et = e.getTime();
            day = (et - st)/24/60/60/1000;
        } catch (Exception ignored){}
        return day;
    }

    public static Date toDate(String s){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            return sf.parse(s);
        } catch (Exception ignored){}
        return new Date();
    }
}
