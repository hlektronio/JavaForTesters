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

    @Test
    public void nestedIfElse(){
        boolean truthy = true;
        boolean falsey = false;

        if (truthy){
            if (!falsey){
                if (truthy && falsey){
                    if (falsey || truthy){
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            }
        } else {
            if (!truthy){
                if (falsey){
                    assertTrue(falsey);
                    assertFalse(truthy);
                }
            } else {
                assertFalse(falsey);
                assertFalse(truthy);
            }
        }
    }

    @Test
    public void switchOnShortCode() {

        assertEquals("UK returns United Kingdom", "United Kingdom", isCountry("UK"));
        assertEquals("US returns United States", "United States", isCountry("us"));
        assertEquals("USA returns United Kingdom", "United States", isCountry("uSa"));
        assertEquals("FR returns France", "France", isCountry("FR"));
        assertEquals("GR returns Rest Of The World", "Rest Of World", isCountry("GR"));
    }

    private String isCountry(String shortCode){

        String returnedCountry;
        switch (shortCode.toUpperCase()) {
            case "UK": returnedCountry = "United Kingdom";
            break;

            case "US":
            case "USA":
            returnedCountry = "United States";
            break;

            case "FR":
            returnedCountry = "France";
            break;

            case "SE":
            returnedCountry = "Sweden";
            break;

            default:
            returnedCountry = "Rest Of World";
            break;
            }
        return returnedCountry;
        }

}