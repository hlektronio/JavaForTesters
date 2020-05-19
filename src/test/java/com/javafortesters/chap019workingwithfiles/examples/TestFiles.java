package com.javafortesters.chap019workingwithfiles.examples;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestFiles {

    @Test
    public void createTempFile() throws IOException {
        File createdFile = File.createTempFile("file",".dmg");
        System.out.println(createdFile.getAbsolutePath());
        assertThat(createdFile.exists(),is(true));
        createdFile.delete();
        assertThat(createdFile.exists(),is(false));

    }
}
