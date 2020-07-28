package com.stayready;

import java.lang.reflect.Array;

import static java.util.Arrays.*;

public class Problem02 {
    public String countinous(Integer[] numarray){
        sort(numarray);
        int length = 1;
        int count = 0;
        for(Integer number : numarray){
            if(count < 4){
            Integer nextnumber = numarray[count+1];
            count ++;
            if(nextnumber-number == (1)){
                length ++;
            }}
        }
        return "Length of the longest contiguous subarray is " + length;
    }
}
