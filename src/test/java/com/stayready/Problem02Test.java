package com.stayready;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class Problem02Test {
    Problem02 problem02 = new Problem02();

    @Test
    public void conutinoustest() {
        Integer[] given = new Integer[]{14, 12, 11, 20};
        String result = problem02.countinous(given);


        String expected = "Length of the longest contiguous subarray is 2";

        Assert.assertEquals(expected, result);
    }


    @Test
    public void conutinoustest1(){
        Integer[] given = new Integer[]{170, 169, 168, 1};
        String result = problem02.countinous(given);


        String expected = "Length of the longest contiguous subarray is 3";

        Assert.assertEquals(expected,result);
    }
}