package com.javafortesters.chap016randomdata.examples;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ConfirmRandomLimitsTest {

    @Test
    public void checkRandomBoolean() {
        Random generate = new Random();
        int countTrue = 0;
        int countFalse = 0;

        for (int i = 0; i < 100; i++) {
            boolean random = generate.nextBoolean();

            if (random)
                countTrue++;

            if (!random)
                countFalse++;

            System.out.println(random);
        }
        System.out.println(countFalse);
        System.out.println(countTrue);
        assertThat(countTrue > 0, is(true));
        assertThat(countFalse > 0, is(true));
        assertThat(countTrue + countFalse, is(100));
    }

    @Test
    public void checkRandomInt() {
        Random generate = new Random();

        for (int i = 0; i < 100; i++) {
            int random = generate.nextInt();
            System.out.println(random);
            assertThat(random <= Integer.MAX_VALUE, is(true));
            assertThat(random >= Integer.MIN_VALUE, is(true));
        }
    }

    @Test
    public void checkRandomLong() {
        Random generate = new Random();

        for (int i = 0; i < 100; i++) {
            Long random = generate.nextLong();
            System.out.println(random);
            assertThat(random <= Long.MAX_VALUE, is(true));
            assertThat(random >= Long.MIN_VALUE, is(true));
        }
    }

    @Test
    public void checkRandomFloat() {
        Random generate = new Random();

        for (int i = 0; i < 100; i++) {
            Float random = generate.nextFloat();
            System.out.println(random);
            assertThat(random >= 0.0f, is(true));
            assertThat(random <= 1.0f, is(true));
        }
    }

    @Test
    public void checkRandomDouble() {
        Random generate = new Random();

        for (int i = 0; i < 100; i++) {
            Double random = generate.nextDouble();
            System.out.println(random);
            assertThat(random >= 0.0d, is(true));
            assertThat(random <= 1.0d, is(true));
        }
    }

    @Test
    public void checkRandomByte() {
        Random generate = new Random();

        int arrayLength = generate.nextInt(100);
        byte[] bytes = new byte[arrayLength];
        generate.nextBytes(bytes);
        assertEquals(arrayLength, bytes.length);
        String viewBytes = new String(bytes);
        System.out.println(viewBytes);
    }

    @Test
    public void checkRandomUnknown() {
        Random generate = new Random();

        for (int i = 0; i < 100; i++) {
            int x = generate.nextInt(10);

            System.out.println(x);
            assertThat(x >= 0, is(true));
            assertThat(x <= 9, is(true));

        }
    }

    @Test
    public void generateThousandRangedNumbers() {
        Random generate = new Random();
        int counter = 0;

        for (int i = 0; i < 1000; i++) {

            int minValue = 15;
            int maxValue = 20;

            int randomIntRange = generate.nextInt(maxValue - minValue + 1) + minValue;

            assertThat(randomIntRange <= maxValue, is(true));
            assertThat(randomIntRange >= minValue, is(true));
            counter++;

        }
        assertEquals(counter, 1000);

    }

    @Test
    public void generateDoubleValues() {
        Random generate = new Random();
        int stdev1 = 0;
        int stdev2 = 0;
        int stdev3 = 0;
        int stdev4 = 0;
        int counter = 0;

        for (int i = 0; i < 1000; i++) {

            double randomGauss = generate.nextGaussian();

            if(randomGauss> -1.0f && randomGauss < 1.0f){
                stdev1++;
            }
            if(randomGauss> -2.0f && randomGauss < 2.0f){
                stdev2++;
            }
            if(randomGauss> -3.0f && randomGauss < 3.0f){
                stdev3++;
            }
            if(randomGauss> -4.0f && randomGauss < 4.0f){
                stdev4++;
            }

        }

        System.out.println("one standard deviation is " + stdev1*100/1000 + "%");
        System.out.println("two standard deviation is " +stdev2*100/1000 + "%");
        System.out.println("three standard deviation is " +stdev3*100/1000 + "%");
        System.out.println("four standard deviation is " +stdev4*100/1000 + "%");

        assertThat(stdev1<stdev2, is(true));
        assertThat(stdev2<stdev3, is (true));
        assertThat(stdev3<stdev4, is (true));

    }
}


