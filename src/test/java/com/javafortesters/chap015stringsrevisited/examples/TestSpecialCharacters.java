package com.javafortesters.chap015stringsrevisited.examples;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TestSpecialCharacters {

    @Test
    public void useEscapeCharacters(){
        System.out.println("some characters and a\t tab");
        System.out.println("some characters and a \b backspace");
        System.out.println("some characters and \na new line");
        System.out.println("some \rcharacters and a carriage return");

    }

    @Test
    public void constructStrings() throws UnsupportedEncodingException {
        String string1 = "This is ";
        String string2 = "a string";
        String concatString = string1+string2;
        System.out.println(concatString);

        char [] charArray = {'T','h','i','s',' ','i','s',' ','a',' ','s','t','r','i','n','g'};
        System.out.println(new String(charArray));

        byte [] byteArray = "This is a string".getBytes("UTF8");
        System.out.println(Arrays.toString(byteArray));

        byte [] bArray = {84, 104, 105, 115, 32, 105, 115, 32, 97, 32, 115, 116, 114, 105, 110, 103};
        System.out.println(new String(bArray));

    }
}
