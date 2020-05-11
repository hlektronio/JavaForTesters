package com.javafortesters.chap015stringsrevisited.examples;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestRegionMatches {

    @Test
    public void useRegionMatches(){
        String firststring = "Hello fella";
        String secondstring = "young lady";
        assertThat(firststring.regionMatches(9,secondstring,6,2),is(true));
    }
}
