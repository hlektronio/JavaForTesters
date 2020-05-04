package com.javafortesters.chap012inheritance.examples;

import com.javafortesters.domainentities.ReadOnlyUser;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReadOnlyUserTest {

    @Test
    public void aReadOnlyUserDefaultConstructor(){
        ReadOnlyUser readOnlyUser = new ReadOnlyUser();
            assertEquals("username",readOnlyUser.getUsername());
            assertEquals("password",readOnlyUser.getPassword());
            assertEquals("ReadOnly",readOnlyUser.getPermission());

    }

}
