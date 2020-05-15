package com.javafortesters.chap017datesandtimes.examples;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


public class TestTime {


    @Test
    public void currentTimeMillis(){
        long startTime = System.currentTimeMillis();

        for (int i= 0;i<10;i++){
            System.out.println("Current time "+System.currentTimeMillis());
        }
        long endTime = System.nanoTime();
        System.out.println("Total time "+(endTime-startTime));
    }


    @Test
    public void timingTest(){
        long startTime = System.nanoTime();

        for (int i=0; i<10; i++){
            System.out.println("Current time "+System.nanoTime());
        }
        long endTime = System.nanoTime();
        System.out.println("Total time "+(endTime-startTime));
    }

    @Test
    public void createUniqueName() {

        String userId = "user" + System.currentTimeMillis();
        System.out.println(userId);


        for (int i = 0; i<10; i++){
            String replacement = "" + (char)('A'+i);
            String intToReplace = String.valueOf(i);

            userId = userId.replace(intToReplace,replacement);
        }
        assertTrue(!userId.contains("0"));
        assertTrue(!userId.contains("1"));
        assertTrue(!userId.contains("2"));
        assertTrue(!userId.contains("3"));
        assertTrue(!userId.contains("4"));
        assertTrue(!userId.contains("5"));
        assertTrue(!userId.contains("6"));
        assertTrue(!userId.contains("7"));
        assertTrue(!userId.contains("8"));
        assertTrue(!userId.contains("9"));

        System.out.println(userId);
    }

    @Test
    public void calendarToString(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.toString() );
        String stringDate = cal.getTime().toString();

        System.out.println(stringDate);
        Date milliDate = new Date(System.currentTimeMillis());
        assertEquals(stringDate, milliDate.toString());
    }

    @Test
    public void useCalendarConstants(){
        Calendar cal = Calendar.getInstance();

        cal.set(2013,cal.DECEMBER, 15, 23, 49, 54);
        assertEquals(cal.get(Calendar.YEAR),2013);
        assertEquals(cal.get(Calendar.MONTH),11);
        assertEquals(cal.get(Calendar.DATE),15);
        assertEquals(cal.get(Calendar.HOUR),11);
        assertEquals(cal.get(Calendar.HOUR_OF_DAY),23);
        assertEquals(cal.get(Calendar.MINUTE),49);
        assertEquals(cal.get(Calendar.SECOND),54);
    }
}
