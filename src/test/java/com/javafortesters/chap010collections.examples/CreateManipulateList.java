package com.javafortesters.chap010collections.examples;

import com.javafortesters.domainentities.User;
import com.sun.javafx.collections.MappingChange;
import org.junit.Test;

import java.util.*;

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

    @Test
    public void createSetOfUsers(){
        Set<User> users = new HashSet<User>();

        assertTrue(users.isEmpty());

        User petros = new User("petros","moro");
        users.add(petros);

        assertEquals(1, users.size());
        assertTrue(users.contains(petros));

        users.add(petros);
        assertEquals(1, users.size());

    }

    @Test
    public void createMapOfUsers(){
        Map<String,User> users = new HashMap<String, User>();
        assertTrue(users.isEmpty());

        User electra = new User("electra","fubar");
        User bill = new User("vassilis","foobar");

        users.put("user",electra);
        users.put("user",bill);

        assertTrue(users.size()==1);
        assertEquals(bill,users.get("user"));
        assertFalse(users.get("user")==electra);

    }
}
