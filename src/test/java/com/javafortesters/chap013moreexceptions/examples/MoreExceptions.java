package com.javafortesters.chap013moreexceptions.examples;

import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

public class MoreExceptions {

    @Test
    public void exceptionIsThrownOnSetMethod(){
        User user = new User();
        try {
            user.setPassword("12345");
            fail("An Invalid Password Exception should have been thrown");
        } catch (InvalidPassword invalidPassword) {
            assertTrue(invalidPassword.getMessage().contains("Password must be more than 6 characters"));
        }
    }

    @Test
    public void exceptionIsThrownInConstructor() {
        User  user;
        try {
            user = new User("electra", "1235");
            fail("An Invalid Password Exception should have been thrown");
        } catch (InvalidPassword invalidPassword) {
            assertTrue(invalidPassword.getMessage().contains("Password must be more than 6 characters"));
        }
        }

    @Test
    public void exceptionIsThrownInDefaultConstructor() throws InvalidPassword{
        User user = new User();
        assertTrue("Password is correct",user.getPassword().length()>6);
    }}
