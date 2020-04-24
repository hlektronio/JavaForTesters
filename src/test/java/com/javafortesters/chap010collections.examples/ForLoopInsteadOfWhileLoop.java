package com.javafortesters.chap010collections.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.javafortesters.domainentities.User;

import static org.junit.Assert.*;

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

    @Test
    public void createCollectionOfUsers(){

        Collection <User> users = new ArrayList <> ();
        assertTrue(users.size() == 0);
        assertTrue(users.isEmpty());

        User user1 = new User();
        User user2 = new User();

        users.add(user1);
        users.add(user2);

        assertTrue(users.size() == 2);
        assertFalse(users.isEmpty());

        Collection <User> moreUsers = new ArrayList<>();
        User user3 = new User();
        User user4 = new User();

        moreUsers.add(user3);
        moreUsers.add(user4);

        assertTrue(moreUsers.size() == 2);
        assertFalse(users.isEmpty());

        users.addAll(moreUsers);
        assertTrue(users.size() == 4);
        assertTrue(users.containsAll(moreUsers));
        assertTrue(users.contains(user4));

        users.removeAll(moreUsers);
        assertTrue(users.size() == 2);
        assertFalse(users.containsAll(moreUsers));

        users.clear();
        assertTrue(users.size() == 0);
        assertTrue(users.isEmpty());

    }
}
