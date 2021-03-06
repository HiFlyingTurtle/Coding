package com.offer.oj;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入n个整数，找出其中最小的K个数
 * @author wwh
 * @create 2017-08-12 13:52
 **/
public class GetLeastNumbers {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        if(input.length<k) return result;
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return result;
    }
}
