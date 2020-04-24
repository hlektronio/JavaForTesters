package com.javafortesters.chap010collections.examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ForLoopInsteadOfWhileLoop {

    @Test
    public void createDaysOfWeekArray(){

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        List <String> listDays = Arrays.asList(days);

        int i=0;
        for (;!listDays.get(i).equals("Sunday");i++ ){}

            assertEquals("Sunday is at position 6",6,i);


        int counter = 0;
        while (!listDays.get(counter).equals("Sunday")){
            counter++;
        }
        System.out.println(listDays.get(6));
        assertEquals("Sunday is at position 6",6,counter);

    }
}
