package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NamingForJUnitClasses {

    @Test
    public void canAddOnePlusOne(){
        int answer = 1+1;
        assertEquals("1+1=2",4,answer);

    }
}
