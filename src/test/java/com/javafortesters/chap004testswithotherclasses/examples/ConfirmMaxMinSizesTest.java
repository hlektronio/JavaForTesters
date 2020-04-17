package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfirmMaxMinSizesTest {

    @Test
    public void checkMinMaxIntegerValues(){

        assertEquals("Integer MIN_VALUE",Integer.MIN_VALUE, -2147483648);
        assertEquals("Integer MAX_VALUE", Integer.MAX_VALUE,2147483647);
    }
}
