package com.javafortesters.chap019workingwithfiles.examples;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

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

    @Test
    public void displayRoots(){
        File[] roots = File.listRoots();
        for(File aFile : roots){
            System.out.println(aFile.getAbsolutePath());
        }
        for (int i = 0; i<roots.length; i++){
            System.out.println(roots[i].getAbsolutePath());
        }
    }

    @Test
    public void createTempFileWithCustomCode() throws IOException {
        Long fileNamePart = System.currentTimeMillis();
        File customCodeFile = File.createTempFile(fileNamePart.toString(),".io");
        assertThat(customCodeFile.exists(),is(true));
        System.out.println(customCodeFile.getAbsolutePath());

        Properties sys = System.getProperties();
        String tempDir = sys.getProperty("java.io.tmpdir");
        System.out.println(tempDir);
        assertThat(customCodeFile.getAbsolutePath().contains(tempDir),is(true));
        assertThat(customCodeFile.getAbsolutePath().contains(fileNamePart.toString()),is(true));
        customCodeFile.delete();
        assertThat(customCodeFile.exists(),is(false));
    }
}
