package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NamingTestJUnitClasses {

    @Test
    public void canAddOnePlusOne(){
        int answer = 1+1;
        assertEquals("1+1=2",2,answer);

    }
}
