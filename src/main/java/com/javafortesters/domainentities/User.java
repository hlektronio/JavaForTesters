package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;

public class User {

    private String username;
    private String password;
    private TestAppEnv testAppEnv;


    public User()  {
        this ("username", "password");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public User(String username, String password)throws InvalidPassword{
        if(password.length()<6){
            throw new InvalidPassword("Password must be more than 6 characters");
        }
        this.username = username;
        this.password = password;
        this.testAppEnv = new TestAppEnv();
    }

    public void setPassword(String password) throws InvalidPassword {
        if(password.length()<6){
            throw new InvalidPassword("Password must be more than 6 characters");
        }
        this.password= password;
    }

    public String getUrl(){
        return this.testAppEnv.getUrl();
    }
    public String getPermission(){
        return "Normal";
    }

}
