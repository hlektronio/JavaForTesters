package com.javafortesters.chap010collections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CreateManipulateList {

    @Test
    public void createListOfUsers(){
        List <User> users = new ArrayList<User>();

        assertTrue(users.size() == 0);

        User electra = new User("electra","fubar");
        User bill = new User("vassilis","foobar");

        users.add(electra);
        assertTrue(users.contains(electra));
        assertTrue(users.size() == 1);

        users.add(0,bill);
        assertEquals(bill, users.get(0));
        assertTrue(users.indexOf(electra) == 1);
        assertTrue(users.size()==2);

        users.remove(0);
        assertFalse(users.contains(bill));
        assertTrue(users.size()==1);

    }
}
