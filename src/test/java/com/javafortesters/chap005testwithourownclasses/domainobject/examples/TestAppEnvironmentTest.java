package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import org.junit.Test;
import static com.javafortesters.domainobject.TestAppEnv.*;
import static org.junit.Assert.assertEquals;


public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){

        assertEquals("Got Url Statically", "http://192.123.0.3:67", getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){

       assertEquals("Just the Domain", "192.123.0.3", DOMAIN);
       assertEquals("Just the Port","67",PORT);
    }
}
