package com.javafortesters.chap012inheritance.examples;

import com.javafortesters.domainentities.AdminUser;
import com.javafortesters.domainentities.InvalidPassword;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdminUserTest {

    @Test
    public void anAdminUserDefaultConstructor() {
        AdminUser adminUser = new AdminUser();
        assertEquals("adminuser", adminUser.getUsername());
        assertEquals("password",adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }
    @Test
    public void anAdminUserHasElevatedPermissions() {
        AdminUser adminUser = new AdminUser("admin", "passw0rd");
        assertEquals("admin",adminUser.getUsername());
        assertEquals("passw0rd",adminUser.getPassword());
        assertEquals("Elevated",adminUser.getPermission());
    }
}
