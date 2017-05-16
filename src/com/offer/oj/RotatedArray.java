package com.offer.oj;

import java.util.Arrays;

/**
 * 剑指offer旋转数组
 * @author wwh
 * @create 2017/5/14
 */
public class RotatedArray {

    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        Arrays.sort(array);
        return array[0];
    }

    public static int minNumberInRotateArray1(int [] array) {
        if(array.length==0) return 0;
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }

        return array[0];

    }
    public static void main(String[] args) {
        int [] a={3,4,5,1,2};
        System.out.println(minNumberInRotateArray(a));
    }
}
