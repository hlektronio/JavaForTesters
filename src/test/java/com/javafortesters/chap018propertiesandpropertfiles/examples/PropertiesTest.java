package com.javafortesters.chap018propertiesandpropertfiles.examples;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PropertiesTest {

    @Test
    public void createListPropertiesObject(){
        Properties properties = new Properties();

        properties.setProperty("name","bob");
        properties.setProperty("gender","male");
        properties.setProperty("password","paSSw0rd");
        assertThat(properties.size(), is(3));

        for(String key:properties.stringPropertyNames()){
            System.out.println("Key: "+key+":"+properties.getProperty(key));
        }
        assertThat(properties.containsKey("gender"),is(true));
        assertThat(properties.getProperty("name"),is("bob"));
        assertThat(properties.getProperty("permission","Admin"), is("Admin"));
    }

    @Test
    public void outputSystemProperties(){
        Properties sys = System.getProperties();
        sys.list(System.out);
        String userDir = sys.getProperty("user.dir");
        System.out.println(userDir);
        String userHome = sys.getProperty("user.home");
        String lineSeparator = sys.getProperty("line.separator");
        String fileSeparator = sys.getProperty("file.separator");
        String tempDir = sys.getProperty("java.io.tmpdir");
        System.out.println(userHome);
        System.out.println(lineSeparator);
        System.out.println(fileSeparator);
        System.out.println(tempDir);
    }

    @Test
    public void storeLoadPropertiesFile() throws IOException {
        String temDir = System.getProperty("java.io.tmpdir");
        String tempResourceFilePath = new File(temDir,
                "tempFileForPropertiesStoreTest.properties").getAbsolutePath();

        Properties saved = new Properties();
        saved.setProperty("name", "electra");
        saved.setProperty("age","41");

        FileOutputStream outputFile = new FileOutputStream(tempResourceFilePath);
        saved.store(outputFile,"these are my properties");
        outputFile.close();

        FileReader propertyFileReader = new FileReader(tempResourceFilePath);
        Properties loaded = new Properties();
        try{
            loaded.load(propertyFileReader);
        }finally {
            propertyFileReader.close();
        }
        assertThat(saved.getProperty("name"),is("electra"));
        assertThat(saved.getProperty("age"), is("41"));

        new File(tempResourceFilePath).delete();
    }

}
