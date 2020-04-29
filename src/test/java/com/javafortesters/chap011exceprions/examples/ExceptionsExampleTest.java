package com.javafortesters.chap011exceprions.examples;

import org.junit.Test;

import java.lang.annotation.Target;

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
        }
        String yourAge = "You are "+ageAsString+" years old";
        assertEquals("You are 18 years old",yourAge);
    }
}
