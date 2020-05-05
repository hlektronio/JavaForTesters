package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected", "username", user.getUsername());

        assertEquals("default password expected", "password",user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){

        User user = new User("admin", "pa55w0rd");

        assertEquals("given username expected","admin", user.getUsername());
        assertEquals("given password expected", "pa55w0rd", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){

        User user = new User();
        try {
            user.setPassword("PaZZwor6");
        } catch (InvalidPassword invalidPassword) {
            invalidPassword.printStackTrace();
        }

        assertEquals("setter password expected", "PaZZwor6", user.getPassword());
    }
}
