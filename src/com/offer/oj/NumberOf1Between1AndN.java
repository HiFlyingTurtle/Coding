package com.offer.oj;

/**
 * 很快的求出任意非负整数区间中1出现的次数。
 * @author wwh
 * @create 2017-08-12 13:57
 **/
public class NumberOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            char [] numArray=String.valueOf(i).toCharArray();
            for(int j=0;j<numArray.length;j++){
                if(numArray[j]=='1')
                    count++;
            }
        }
        return count;
    }
}
