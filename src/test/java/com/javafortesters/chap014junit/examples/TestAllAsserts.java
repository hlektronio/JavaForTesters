package com.javafortesters.chap014junit.examples;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
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
    @Test
    public void replicateAsserts(){
        int a = 3;
        int b = 3;
        int[] array1 = {3,3,2};
        int [] array2 = {2,3,3};
        String i = null;

        assertThat(a,is(b));
        assertThat(7,is(not(a+b)));
        assertThat(true,is(true));
        assertThat(false,is(not(true)));
        assertThat(a,is(equalTo(b)));
        assertThat(array1,is(not(equalTo(array2))));
        assertThat(i,is(nullValue()));
        i="";
        assertThat(i,is(not(nullValue())));
        i="aString";
        assertThat(i,containsString("ing"));
        assertThat(i,is(not(containsString("ong"))));

    }
    @Test
    public void useHamcrestMatchers(){
        assertThat(3,is(3));
        assertThat(3,is(equalTo(3)));
        assertThat(3,is(not(2)));
        assertThat("This is a string",containsString("is a"));
        assertThat("This is a string",endsWith("ring"));
        assertThat("This is a string",startsWith("Thi"));
        assertThat(null,is(nullValue()));
    }
}
