package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertAnIntToHex {

    @Test
    public void convertIntToHex(){

        String eleven = Integer.toHexString(11);
        assertEquals("11 becomes b","b",eleven);

        String ten = Integer.toHexString(10);
        assertEquals("10 becomes a","a",ten);

        String three = Integer.toHexString(3);
        assertEquals("3 becomes 3","3",three);

        String twentyone = Integer.toHexString(21);
        assertEquals("21 becomes 15","15",twentyone);
    }
}
