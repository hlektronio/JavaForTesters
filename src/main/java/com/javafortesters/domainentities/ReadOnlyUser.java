package com.javafortesters.domainentities;

public class ReadOnlyUser extends User {

//    public ReadOnlyUser() {
//
//    }
//
//    public ReadOnlyUser(String username, String password) {
//    super (username, password);
//    }

    @Override
    public String getPermission(){
        return "ReadOnly";
    }

}
