package com.javafortesters.chap009arraysforloopiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class ArrayForLoopTest {

    @Test
    public void createArrayOfObjects() {
        User[] users = new User[3];

        users[0] = new User("Electra", "passwOrd");
        users[1] = new User("Vassilis", "pAssworD");
        users[2] = new User("Petros", "Password");

        assertEquals("First user name is Electra", "Electra", users[0].getUsername());
        assertEquals("Second user name is Vassilis", "Vassilis", users[1].getUsername());
        assertEquals("Third user's password is Password", "Password", users[2].getPassword());
    }

    @Test
    public void iterateOverUserNames() {

        User[] users = new User[3];
        users[0] = new User("Electra", "passwOrd");
        users[1] = new User("Vassilis", "pAssworD");
        users[2] = new User("Petros", "Password");

        assertEquals("First user name is Electra", "Electra", users[0].getUsername());
        assertEquals("Second user name is Vassilis", "Vassilis", users[1].getUsername());
        assertEquals("Third user's password is Password", "Password", users[2].getPassword());

        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }

    @Test
    public void createArrayOfHundred() {

        User[] users = new User[100];

        for (int i = 0; i < 100; i++) {
            int userId = i + 1;
            users[i] = new User("user" + userId, "password" + userId);
        }

        for (User aUser : users) {
            System.out.println(aUser.getUsername() + ", " + aUser.getPassword());

            assertEquals("User 1 has user1 username", "user1", users[0].getUsername());
            assertEquals("User 100 has password100 password", "password100", users[99].getPassword());

            int userId = 1;
            for (User anotherUser : users) {
                assertEquals("user" + userId, anotherUser.getUsername());
                userId++;
            }
        }
    }

    @Test
    public void sortWorkDaysArray() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);
        assertEquals("[Friday, Monday, Thursday, Tuesday, Wednesday]", Arrays.toString(workdays));

    }

    @Test
    public void sortCaseSensitiveValues() {
        String[] workdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};
        Arrays.sort(workdays);
        assertEquals("thursday", workdays[4]);
        assertEquals(workdays[0], "Friday");
    }


    @Test
    public void createTriangleArray() {

        int[][] triangle = new int[16][];

        for (int row = 0; row < triangle.length; row++) {
            triangle[row] = new int[row + 1];

            for (int i = 0; i < (row + 1); i++) {
                triangle[row][i] = i;

            }

        }
        print2DIntArray(triangle);
    }

    public void print2DIntArray(int[][] multi) {

        for (int[] outer : multi) {
            if (outer == null) {
                System.out.println("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");
                }
            }
        System.out.println("");
        }

    }


}
