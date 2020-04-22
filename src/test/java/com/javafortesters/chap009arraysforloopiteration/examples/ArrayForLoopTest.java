package com.javafortesters.chap009arraysforloopiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayForLoopTest {

    @Test
    public void createArrayOfObjects(){
    User [] users = new User[3];

    users[0] = new User("Electra", "passwOrd");
    users[1] = new User("Vassilis","pAssworD");
    users[2] = new User("Petros", "Password");

    assertEquals("First user name is Electra", "Electra", users[0].getUsername());
    assertEquals("Second user name is Vassilis", "Vassilis", users[1].getUsername());
    assertEquals("Third user's password is Password", "Password",users[2].getPassword());
    }

    @Test
    public void iterateOverUserNames(){

        User [] users = new User[3];
        users[0] = new User("Electra", "passwOrd");
        users[1] = new User("Vassilis","pAssworD");
        users[2] = new User("Petros", "Password");

        assertEquals("First user name is Electra", "Electra", users[0].getUsername());
        assertEquals("Second user name is Vassilis", "Vassilis", users[1].getUsername());
        assertEquals("Third user's password is Password", "Password",users[2].getPassword());

        for (User user : users){
            System.out.println(user.getUsername());
        }
    }
}
