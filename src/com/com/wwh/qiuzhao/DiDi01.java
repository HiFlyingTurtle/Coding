package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 滴滴秋季招聘在线编程第一题
 * @author wwh
 * @create 2017-08-26 16:07
 **/
public class DiDi01 {
    private  static int maxSubArray(Integer [] array){
        int maxSum=Integer.MIN_VALUE;
        int size=array.length;

        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
                sum+=array[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String line=sc.nextLine();
            String [] array=line.split("\\s+");
            Integer [] numArray=new Integer[array.length];

            for(int i=0;i<array.length;i++){
                numArray[i]=Integer.valueOf(array[i]);
            }
            System.out.println(maxSubArray(numArray));
        }

    }
}
