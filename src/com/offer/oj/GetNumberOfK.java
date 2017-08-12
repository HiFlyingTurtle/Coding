package com.offer.oj;
/**
 * 统计一个数字在排序数组中出现的次数
 * @author wwh
 * @create 2017-08-12 14:07
 **/
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        if(array==null||array.length==0) return 0;
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==k)
                count++;
        }

        return count;
    }
}
