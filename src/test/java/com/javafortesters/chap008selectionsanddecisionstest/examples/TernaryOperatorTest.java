package com.javafortesters.chap008selectionsanddecisionstest.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class TernaryOperatorTest {

    int numberOfCats;

    @Test
    public void catOrCats(){
        numberOfCats = 1;
        assertEquals("1 == cat", "cat", numberOfCats == 1? "cat" : "cats");

        numberOfCats = 2;
        assertEquals("2 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");

    }
    @Test
    public void canUseCorrectNumber(){

        assertEquals("1 == cat", "cat", catOrCats(1));
        assertEquals("2 == cats", "cats", catOrCats(2));
        assertEquals("0 == cats", "cats", catOrCats(0));

    }

    public String catOrCats(int numberOfCats){
        return (numberOfCats == 1) ? "cat" : "cats";
    }

    @Test
    public void truthyIf(){
        boolean truthy = true;

        if (truthy) assertTrue(truthy);

        if(truthy){
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void truthyIfElse(){
        boolean truthy = true;

        if (truthy) assertTrue(truthy);
        else  assertFalse(truthy);
    }

    @Test
    public void truthyIfElseBraces(){
        boolean truthy = true;

        if (truthy){
            assertTrue(truthy);
            assertFalse(!truthy);
        } else {
            assertFalse(truthy);
        }
    }
}