package com.javafortesters.chap014junit.examples;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestAllAsserts {

    @Test
    public void assertEverything(){
        int a = 3;
        int b = 3;
        assertEquals(6,a+b);
        assertFalse("is false",a+b==2);
        assertFalse("is false",false);
        assertFalse(false);
        assertTrue("is true",a+b==6);
        assertTrue("is true",true);
        assertTrue(true);

        int[] array1 = {3,3,2};
        int [] array2 = {2,3,3};
        String i = null;

        assertNotSame(array1,array2);
        Arrays.sort(array1);
        assertArrayEquals(array1, array2);
        assertSame(a,b);
        assertNotNull(array1);
        assertNull(i);

    }
}
