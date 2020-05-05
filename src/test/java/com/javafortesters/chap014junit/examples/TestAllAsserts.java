package com.javafortesters.chap014junit.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAllAsserts {

    @Test
    public void assertEverything(){
        int a = 3;
        int b = 3;
        assertEquals(6,a+b);
        assertFalse("is false",a+b==2);
        assertTrue("is true",a+b==6);
        
    }
}
