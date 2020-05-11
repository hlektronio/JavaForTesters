package com.javafortesters.chap015stringsrevisited.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestRegionMatches {

    @Test
    public void useRegionMatches(){
        String firststring = "Hello fella";
        String secondstring = "young lady";
        assertThat(firststring.regionMatches(9,secondstring,6,2),is(true));
    }

    @Test
    public void canFindAllOccurencies(){
        List<Integer> occurences = findAllOccurences("Hello fella", "ll");
        assertThat(occurences.size(),is(2));
    }

    public List<Integer> findAllOccurences(String string, String sub){
        List<Integer> occurences= new ArrayList<Integer>();

        if(string==null || sub==null){
            throw new IllegalArgumentException("Cannot search using null");
        }

        if(sub.isEmpty()){
            throw new IllegalArgumentException(
                    "Cannot search for Empty substring");
        }
        int lastfoundat = 0;

        do{
            lastfoundat = string.indexOf(sub,lastfoundat);
            if(lastfoundat!=-1){
            occurences.add(lastfoundat);
            lastfoundat++;
        }}
        while (lastfoundat!=-1);

        return occurences;
    }

    @Test
    public void checkStringBuilder(){
        StringBuilder builder = new StringBuilder(0);
        assertThat(builder.capacity(),is(0));
        builder.append("Hello there");
        assertThat(builder.capacity(),is(11));
        builder.append(" asshole");
        assertThat(builder.capacity(),is(24));
        builder.delete(5,11);
        assertThat(builder.toString(), is("Hello asshole"));
        assertThat(builder.capacity(),is(24));
    }
}
