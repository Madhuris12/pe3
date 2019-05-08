package com.stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {
    public static void main(String []args){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");//to print in appropriate date format
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(c.getTime()));
        System.out.println();
    }
}

