package com.javafortesters.chap018propertiesandpropertfiles.examples;

import org.junit.Test;

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

}
