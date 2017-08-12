package com.offer.oj;

/**
 * 连续子数组的最大和
 * @author wwh
 * @create 2017-08-12 13:55
 **/
public class FindGreatestSumOfSubArray {

    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = Integer.MIN_VALUE;
        if (array.length == 0 || array == null) return sum;
        for (int i = 0; i < array.length; i++) {
            int current = 0;
            for (int j = i; j < array.length; j++) {
                current += array[j];
                if (current > sum)
                    sum = current;
            }
        }
        return sum;
    }
    /*
    public static int FindGreatestSumOfSubArray1(int[] array) {
    	if(array.length==0||array==null) return 0;
    	int current=array[0];
    	int max=array[0];
    	for(int i=1;i<array.length;i++){
    		if(current>=0){
    			current+=array[i];
    		}else{
    			current=array[i];
    		}
    		if(current>max)
    			max=current;
    	}
    	return max;
    }
    */
}