package com.javafortesters.chap015stringsrevisited.examples;

import org.junit.Test;

public class TestSpecialCharacters {

    @Test
    public void useEscapeCharacters(){
        System.out.println("some characters and a\t tab");
        System.out.println("some characters and a \b backspace");
        System.out.println("some characters and \na new line");
        System.out.println("some \rcharacters and a carriage return");

    }
}
