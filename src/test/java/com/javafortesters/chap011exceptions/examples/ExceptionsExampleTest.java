package com.javafortesters.chap011exceptions.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExceptionsExampleTest {

    @Test
    public void throwANullPointerException(){
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        }
        catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();
            System.out.println("getMessage - "+e.getMessage());
            System.out.println("getStackTrace - "+e.getStackTrace());
            System.out.println("printStackTrace");
            e.printStackTrace();
        }
        String yourAge = "You are "+ageAsString+" years old";
        assertEquals("You are 18 years old",yourAge);
    }


}
